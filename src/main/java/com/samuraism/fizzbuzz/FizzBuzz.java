package com.samuraism.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
    public static String fizzBuzz(int number) {
        String result = String.valueOf(number);
        if (number %3==0) {
            result = "Fizz";
        }
        return result;
    }
}
