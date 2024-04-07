import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nece olculu bir array yaratmaq isteyirsiniz?");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + ". elementi daxil edin: ");
            array[i] = scanner.nextInt();
        }

        int maxNumber = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > maxNumber) {
                maxNumber = array[j];
            }
        }

        if (maxNumber % 2 == 0) {
            long factorial = 1;
            for (int k = 1; k <= maxNumber; k++) {
                factorial *= k;
            }
            System.out.println("En büyük reqem cut. Faktoriyali: " + factorial);
        } else {
            System.out.println("En büyük reqem tek. Reqem: " + maxNumber);
        }
    }
}



