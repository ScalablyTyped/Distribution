package typings.uuidjs

import org.scalablytyped.runtime.NumberDictionary
import typings.std.FlatArray
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Array<number> & { readonly timeLow :number,  readonly timeMid :number,  readonly timeHiAndVersion :number,  readonly clockSeqHiAndReserved :number,  readonly clockSeqLow :number,  readonly node :number} */
  @js.native
  trait ArraynumberreadonlytimeLo
    extends StObject
       with /* standard es5 */
  /* n */ NumberDictionary[Double] {
    
    /**
      * Returns the item located at the specified index.
      * @param index The zero-based index of the desired code unit. A negative index will count back from the last item.
      */
    /* standard es2022.array */
    def at(index: Double): js.UndefOr[Double] = js.native
    
    val clockSeqHiAndReserved: Double = js.native
    
    val clockSeqLow: Double = js.native
    
    /**
      * Combines two or more arrays.
      * This method returns a new array without modifying any existing arrays.
      * @param items Additional arrays and/or items to add to the end of the array.
      */
    /* standard es5 */
    def concat(items: (js.Array[Double] | Double)*): js.Array[Double] = js.native
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    /* standard es2015.core */
    def copyWithin(target: Double, start: Double): this.type = js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    /* standard es2015.iterable */
    def entries(): IterableIterator[js.Tuple2[Double, Double]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def every(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any]): Boolean = js.native
    def every(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any],
      thisArg: Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("every")
    def every_S[S /* <: Double */](
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSName("every")
    def every_S[S /* <: Double */](
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Changes all array elements from `start` to `end` index to a static `value` and returns the modified array
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    /* standard es2015.core */
    def fill(value: Double): this.type = js.native
    def fill(value: Double, start: Double): this.type = js.native
    def fill(value: Double, start: Double, end: Double): this.type = js.native
    def fill(value: Double, start: Unit, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def filter(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any]): js.Array[Double] = js.native
    def filter(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any],
      thisArg: Any
    ): js.Array[Double] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("filter")
    def filter_S[S /* <: Double */](
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSName("filter")
    def filter_S[S /* <: Double */](
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.Array[S] = js.native
    
    /* standard es2015.core */
    def find(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ js.Array[Double], Any]): js.UndefOr[Double] = js.native
    def find(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ js.Array[Double], Any],
      thisArg: Any
    ): js.UndefOr[Double] = js.native
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2015.core */
    def findIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ js.Array[Double], Any]): Double = js.native
    def findIndex(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ js.Array[Double], Any],
      thisArg: Any
    ): Double = js.native
    
    /* standard es2023.array */
    def findLast(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any]): js.UndefOr[Double] = js.native
    def findLast(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any],
      thisArg: Any
    ): js.UndefOr[Double] = js.native
    
    /**
      * Returns the index of the last element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate findLastIndex calls predicate once for each element of the array, in descending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findLastIndex immediately returns that element index. Otherwise, findLastIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2023.array */
    def findLastIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any]): Double = js.native
    def findLastIndex(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any],
      thisArg: Any
    ): Double = js.native
    
    /**
      * Returns the value of the last element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate findLast calls predicate once for each element of the array, in descending
      * order, until it finds one where predicate returns true. If such an element is found, findLast
      * immediately returns that element value. Otherwise, findLast returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2023.array */
    @JSName("findLast")
    def findLast_S[S /* <: Double */](
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSName("findLast")
    def findLast_S[S /* <: Double */](
      predicate: js.Function3[
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.UndefOr[S] = js.native
    
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2015.core */
    @JSName("find")
    def find_S[S /* <: Double */](
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ js.Array[Double], /* is S */ Boolean]
    ): js.UndefOr[S] = js.native
    @JSName("find")
    def find_S[S /* <: Double */](
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ js.Array[Double], /* is S */ Boolean],
      thisArg: Any
    ): js.UndefOr[S] = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    /* standard es2019.array */
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
    /**
      * Calls a defined callback function on each element of an array. Then, flattens the result into
      * a new array.
      * This is identical to a map followed by flat with depth 1.
      *
      * @param callback A function that accepts up to three arguments. The flatMap method calls the
      * callback function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callback function. If
      * thisArg is omitted, undefined is used as the this value.
      */
    /* standard es2019.array */
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ Double, 
          /* index */ Double, 
          /* array */ js.Array[Double], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = js.native
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def forEach(
      callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Unit]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Unit],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    /* standard es2016.array.include */
    def includes(searchElement: Double): Boolean = js.native
    def includes(searchElement: Double, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    /* standard es5 */
    def indexOf(searchElement: Double): Double = js.native
    def indexOf(searchElement: Double, fromIndex: Double): Double = js.native
    
    /** Iterator */
    /* standard es2015.iterable */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[Double]] = js.native
    
    /**
      * Adds all the elements of an array into a string, separated by the specified separator string.
      * @param separator A string used to separate one element of the array from the next in the resulting string. If omitted, the array elements are separated with a comma.
      */
    /* standard es5 */
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    /* standard es2015.iterable */
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin searching backward. If fromIndex is omitted, the search starts at the last index in the array.
      */
    /* standard es5 */
    def lastIndexOf(searchElement: Double): Double = js.native
    def lastIndexOf(searchElement: Double, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest index in the array.
      */
    /* standard es5 */
    var length: Double = js.native
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def map[U](callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], U]): js.Array[U] = js.native
    def map[U](
      callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], U],
      thisArg: Any
    ): js.Array[U] = js.native
    
    val node: Double = js.native
    
    /**
      * Removes the last element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def pop(): js.UndefOr[Double] = js.native
    
    /**
      * Appends new elements to the end of an array, and returns the new length of the array.
      * @param items New elements to add to the array.
      */
    /* standard es5 */
    def push(items: Double*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Double], 
          Double
        ]
    ): Double = js.native
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Double], 
          Double
        ],
      initialValue: Double
    ): Double = js.native
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Double], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Double], 
          Double
        ]
    ): Double = js.native
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Double], 
          Double
        ],
      initialValue: Double
    ): Double = js.native
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          /* array */ js.Array[Double], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Reverses the elements in an array in place.
      * This method mutates the array and returns a reference to the same array.
      */
    /* standard es5 */
    def reverse(): js.Array[Double] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def shift(): js.UndefOr[Double] = js.native
    
    /**
      * Returns a copy of a section of an array.
      * For both start and end, a negative index can be used to indicate an offset from the end of the array.
      * For example, -2 refers to the second to last element of the array.
      * @param start The beginning index of the specified portion of the array.
      * If start is undefined, then the slice begins at index 0.
      * @param end The end index of the specified portion of the array. This is exclusive of the element at the index 'end'.
      * If end is undefined, then the slice extends to the end of the array.
      */
    /* standard es5 */
    def slice(): js.Array[Double] = js.native
    def slice(start: Double): js.Array[Double] = js.native
    def slice(start: Double, end: Double): js.Array[Double] = js.native
    def slice(start: Unit, end: Double): js.Array[Double] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def some(predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any]): Boolean = js.native
    def some(
      predicate: js.Function3[/* value */ Double, /* index */ Double, /* array */ js.Array[Double], Any],
      thisArg: Any
    ): Boolean = js.native
    
    /**
      * Sorts an array in place.
      * This method mutates the array and returns a reference to the same array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if the first argument is less than the second argument, zero if they're equal, and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    /* standard es5 */
    def sort(): this.type = js.native
    def sort(compareFn: js.Function2[/* a */ Double, /* b */ Double, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double): js.Array[Double] = js.native
    def splice(start: Double, deleteCount: Double): js.Array[Double] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double, deleteCount: Double, items: Double*): js.Array[Double] = js.native
    
    val timeHiAndVersion: Double = js.native
    
    val timeLow: Double = js.native
    
    val timeMid: Double = js.native
    
    /**
      * Is an object whose properties have the value 'true'
      * when they will be absent when used in a 'with' statement.
      */
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.unscopables)
    val unscopables: KinArraykeyofanyboolean = js.native
    
    /**
      * Inserts new elements at the start of an array, and returns the new length of the array.
      * @param items Elements to insert at the start of the array.
      */
    /* standard es5 */
    def unshift(items: Double*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    /* standard es2015.iterable */
    def values(): IterableIterator[Double] = js.native
  }
  
  /* Inlined std.Array<string> & { readonly timeLow :string,  readonly timeMid :string,  readonly timeHiAndVersion :string,  readonly clockSeqHiAndReserved :string,  readonly clockSeqLow :string,  readonly node :string} */
  @js.native
  trait ArraystringreadonlytimeLo
    extends StObject
       with /* standard es5 */
  /* n */ NumberDictionary[String] {
    
    /**
      * Returns the item located at the specified index.
      * @param index The zero-based index of the desired code unit. A negative index will count back from the last item.
      */
    /* standard es2022.array */
    def at(index: Double): js.UndefOr[String] = js.native
    
    val clockSeqHiAndReserved: String = js.native
    
    val clockSeqLow: String = js.native
    
    /**
      * Combines two or more arrays.
      * This method returns a new array without modifying any existing arrays.
      * @param items Additional arrays and/or items to add to the end of the array.
      */
    /* standard es5 */
    def concat(items: (js.Array[String] | String)*): js.Array[String] = js.native
    
    /**
      * Returns the this object after copying a section of the array identified by start and end
      * to the same array starting at position target
      * @param target If target is negative, it is treated as length+target where length is the
      * length of the array.
      * @param start If start is negative, it is treated as length+start. If end is negative, it
      * is treated as length+end.
      * @param end If not specified, length of the this object is used as its default value.
      */
    /* standard es2015.core */
    def copyWithin(target: Double, start: Double): this.type = js.native
    def copyWithin(target: Double, start: Double, end: Double): this.type = js.native
    
    /**
      * Returns an iterable of key, value pairs for every entry in the array
      */
    /* standard es2015.iterable */
    def entries(): IterableIterator[js.Tuple2[Double, String]] = js.native
    
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def every(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any]): Boolean = js.native
    def every(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any],
      thisArg: Any
    ): Boolean = js.native
    /**
      * Determines whether all the members of an array satisfy the specified test.
      * @param predicate A function that accepts up to three arguments. The every method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value false, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("every")
    def every_S[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): /* is std.Array<S> */ Boolean = js.native
    @JSName("every")
    def every_S[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): /* is std.Array<S> */ Boolean = js.native
    
    /**
      * Changes all array elements from `start` to `end` index to a static `value` and returns the modified array
      * @param value value to fill array section with
      * @param start index to start filling the array at. If start is negative, it is treated as
      * length+start where length is the length of the array.
      * @param end index to stop filling the array at. If end is negative, it is treated as
      * length+end.
      */
    /* standard es2015.core */
    def fill(value: String): this.type = js.native
    def fill(value: String, start: Double): this.type = js.native
    def fill(value: String, start: Double, end: Double): this.type = js.native
    def fill(value: String, start: Unit, end: Double): this.type = js.native
    
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def filter(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any]): js.Array[String] = js.native
    def filter(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any],
      thisArg: Any
    ): js.Array[String] = js.native
    /**
      * Returns the elements of an array that meet the condition specified in a callback function.
      * @param predicate A function that accepts up to three arguments. The filter method calls the predicate function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    @JSName("filter")
    def filter_S[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.Array[S] = js.native
    @JSName("filter")
    def filter_S[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.Array[S] = js.native
    
    /* standard es2015.core */
    def find(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any]): js.UndefOr[String] = js.native
    def find(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any],
      thisArg: Any
    ): js.UndefOr[String] = js.native
    
    /**
      * Returns the index of the first element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2015.core */
    def findIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any]): Double = js.native
    def findIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], Any],
      thisArg: Any
    ): Double = js.native
    
    /* standard es2023.array */
    def findLast(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any]): js.UndefOr[String] = js.native
    def findLast(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any],
      thisArg: Any
    ): js.UndefOr[String] = js.native
    
    /**
      * Returns the index of the last element in the array where predicate is true, and -1
      * otherwise.
      * @param predicate findLastIndex calls predicate once for each element of the array, in descending
      * order, until it finds one where predicate returns true. If such an element is found,
      * findLastIndex immediately returns that element index. Otherwise, findLastIndex returns -1.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2023.array */
    def findLastIndex(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any]): Double = js.native
    def findLastIndex(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any],
      thisArg: Any
    ): Double = js.native
    
    /**
      * Returns the value of the last element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate findLast calls predicate once for each element of the array, in descending
      * order, until it finds one where predicate returns true. If such an element is found, findLast
      * immediately returns that element value. Otherwise, findLast returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2023.array */
    @JSName("findLast")
    def findLast_S[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ]
    ): js.UndefOr[S] = js.native
    @JSName("findLast")
    def findLast_S[S /* <: String */](
      predicate: js.Function3[
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          /* is S */ Boolean
        ],
      thisArg: Any
    ): js.UndefOr[S] = js.native
    
    /**
      * Returns the value of the first element in the array where predicate is true, and undefined
      * otherwise.
      * @param predicate find calls predicate once for each element of the array, in ascending
      * order, until it finds one where predicate returns true. If such an element is found, find
      * immediately returns that element value. Otherwise, find returns undefined.
      * @param thisArg If provided, it will be used as the this value for each invocation of
      * predicate. If it is not provided, undefined is used instead.
      */
    /* standard es2015.core */
    @JSName("find")
    def find_S[S /* <: String */](
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], /* is S */ Boolean]
    ): js.UndefOr[S] = js.native
    @JSName("find")
    def find_S[S /* <: String */](
      predicate: js.Function3[/* value */ String, /* index */ Double, /* obj */ js.Array[String], /* is S */ Boolean],
      thisArg: Any
    ): js.UndefOr[S] = js.native
    
    /**
      * Returns a new array with all sub-array elements concatenated into it recursively up to the
      * specified depth.
      *
      * @param depth The maximum recursion depth
      */
    /* standard es2019.array */
    def flat[A, D /* <: Double */](): js.Array[FlatArray[A, D]] = js.native
    def flat[A, D /* <: Double */](depth: D): js.Array[FlatArray[A, D]] = js.native
    
    /**
      * Calls a defined callback function on each element of an array. Then, flattens the result into
      * a new array.
      * This is identical to a map followed by flat with depth 1.
      *
      * @param callback A function that accepts up to three arguments. The flatMap method calls the
      * callback function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callback function. If
      * thisArg is omitted, undefined is used as the this value.
      */
    /* standard es2019.array */
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ]
    ): js.Array[U] = js.native
    def flatMap[U, This](
      callback: js.ThisFunction3[
          /* this */ This, 
          /* value */ String, 
          /* index */ Double, 
          /* array */ js.Array[String], 
          U | js.Array[U]
        ],
      thisArg: This
    ): js.Array[U] = js.native
    
    /**
      * Performs the specified action for each element in an array.
      * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
      * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit]
    ): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Unit],
      thisArg: Any
    ): Unit = js.native
    
    /**
      * Determines whether an array includes a certain element, returning true or false as appropriate.
      * @param searchElement The element to search for.
      * @param fromIndex The position in this array at which to begin searching for searchElement.
      */
    /* standard es2016.array.include */
    def includes(searchElement: String): Boolean = js.native
    def includes(searchElement: String, fromIndex: Double): Boolean = js.native
    
    /**
      * Returns the index of the first occurrence of a value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
      */
    /* standard es5 */
    def indexOf(searchElement: String): Double = js.native
    def indexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /** Iterator */
    /* standard es2015.iterable */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[String]] = js.native
    
    /**
      * Adds all the elements of an array into a string, separated by the specified separator string.
      * @param separator A string used to separate one element of the array from the next in the resulting string. If omitted, the array elements are separated with a comma.
      */
    /* standard es5 */
    def join(): String = js.native
    def join(separator: String): String = js.native
    
    /**
      * Returns an iterable of keys in the array
      */
    /* standard es2015.iterable */
    def keys(): IterableIterator[Double] = js.native
    
    /**
      * Returns the index of the last occurrence of a specified value in an array, or -1 if it is not present.
      * @param searchElement The value to locate in the array.
      * @param fromIndex The array index at which to begin searching backward. If fromIndex is omitted, the search starts at the last index in the array.
      */
    /* standard es5 */
    def lastIndexOf(searchElement: String): Double = js.native
    def lastIndexOf(searchElement: String, fromIndex: Double): Double = js.native
    
    /**
      * Gets or sets the length of the array. This is a number one higher than the highest index in the array.
      */
    /* standard es5 */
    var length: Double = js.native
    
    /**
      * Calls a defined callback function on each element of an array, and returns an array that contains the results.
      * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
      * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def map[U](callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U]): js.Array[U] = js.native
    def map[U](
      callbackfn: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], U],
      thisArg: Any
    ): js.Array[U] = js.native
    
    val node: String = js.native
    
    /**
      * Removes the last element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def pop(): js.UndefOr[String] = js.native
    
    /**
      * Appends new elements to the end of an array, and returns the new length of the array.
      * @param items New elements to add to the array.
      */
    /* standard es5 */
    def push(items: String*): Double = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    /* standard es5 */
    def reduce(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = js.native
    /**
      * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduce[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ]
    ): String = js.native
    /* standard es5 */
    def reduceRight(
      callbackfn: js.Function4[
          /* previousValue */ String, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          String
        ],
      initialValue: String
    ): String = js.native
    /**
      * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
      * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
      * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
      */
    /* standard es5 */
    def reduceRight[U](
      callbackfn: js.Function4[
          /* previousValue */ U, 
          /* currentValue */ String, 
          /* currentIndex */ Double, 
          /* array */ js.Array[String], 
          U
        ],
      initialValue: U
    ): U = js.native
    
    /**
      * Reverses the elements in an array in place.
      * This method mutates the array and returns a reference to the same array.
      */
    /* standard es5 */
    def reverse(): js.Array[String] = js.native
    
    /**
      * Removes the first element from an array and returns it.
      * If the array is empty, undefined is returned and the array is not modified.
      */
    /* standard es5 */
    def shift(): js.UndefOr[String] = js.native
    
    /**
      * Returns a copy of a section of an array.
      * For both start and end, a negative index can be used to indicate an offset from the end of the array.
      * For example, -2 refers to the second to last element of the array.
      * @param start The beginning index of the specified portion of the array.
      * If start is undefined, then the slice begins at index 0.
      * @param end The end index of the specified portion of the array. This is exclusive of the element at the index 'end'.
      * If end is undefined, then the slice extends to the end of the array.
      */
    /* standard es5 */
    def slice(): js.Array[String] = js.native
    def slice(start: Double): js.Array[String] = js.native
    def slice(start: Double, end: Double): js.Array[String] = js.native
    def slice(start: Unit, end: Double): js.Array[String] = js.native
    
    /**
      * Determines whether the specified callback function returns true for any element of an array.
      * @param predicate A function that accepts up to three arguments. The some method calls
      * the predicate function for each element in the array until the predicate returns a value
      * which is coercible to the Boolean value true, or until the end of the array.
      * @param thisArg An object to which the this keyword can refer in the predicate function.
      * If thisArg is omitted, undefined is used as the this value.
      */
    /* standard es5 */
    def some(predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any]): Boolean = js.native
    def some(
      predicate: js.Function3[/* value */ String, /* index */ Double, /* array */ js.Array[String], Any],
      thisArg: Any
    ): Boolean = js.native
    
    /**
      * Sorts an array in place.
      * This method mutates the array and returns a reference to the same array.
      * @param compareFn Function used to determine the order of the elements. It is expected to return
      * a negative value if the first argument is less than the second argument, zero if they're equal, and a positive
      * value otherwise. If omitted, the elements are sorted in ascending, ASCII character order.
      * ```ts
      * [11,2,22,1].sort((a, b) => a - b)
      * ```
      */
    /* standard es5 */
    def sort(): this.type = js.native
    def sort(compareFn: js.Function2[/* a */ String, /* b */ String, Double]): this.type = js.native
    
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double): js.Array[String] = js.native
    def splice(start: Double, deleteCount: Double): js.Array[String] = js.native
    /**
      * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
      * @param start The zero-based location in the array from which to start removing elements.
      * @param deleteCount The number of elements to remove.
      * @param items Elements to insert into the array in place of the deleted elements.
      * @returns An array containing the elements that were deleted.
      */
    /* standard es5 */
    def splice(start: Double, deleteCount: Double, items: String*): js.Array[String] = js.native
    
    val timeHiAndVersion: String = js.native
    
    val timeLow: String = js.native
    
    val timeMid: String = js.native
    
    /**
      * Is an object whose properties have the value 'true'
      * when they will be absent when used in a 'with' statement.
      */
    /* standard es2015.symbol.wellknown */
    @JSName(js.Symbol.unscopables)
    val unscopables: KinArraykeyofanyboolean = js.native
    
    /**
      * Inserts new elements at the start of an array, and returns the new length of the array.
      * @param items Elements to insert at the start of the array.
      */
    /* standard es5 */
    def unshift(items: String*): Double = js.native
    
    /**
      * Returns an iterable of values in the array
      */
    /* standard es2015.iterable */
    def values(): IterableIterator[String] = js.native
  }
  
  /* Inlined {[ K in std.Array<keyof any> ]:? boolean} */
  trait KinArraykeyofanyboolean extends StObject {
    
    var at: js.UndefOr[Boolean] = js.undefined
    
    var concat: js.UndefOr[Boolean] = js.undefined
    
    var copyWithin: js.UndefOr[Boolean] = js.undefined
    
    var entries: js.UndefOr[Boolean] = js.undefined
    
    var every: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var filter: js.UndefOr[Boolean] = js.undefined
    
    var find: js.UndefOr[Boolean] = js.undefined
    
    var findIndex: js.UndefOr[Boolean] = js.undefined
    
    var findLast: js.UndefOr[Boolean] = js.undefined
    
    var findLastIndex: js.UndefOr[Boolean] = js.undefined
    
    var flat: js.UndefOr[Boolean] = js.undefined
    
    var flatMap: js.UndefOr[Boolean] = js.undefined
    
    var forEach: js.UndefOr[Boolean] = js.undefined
    
    var includes: js.UndefOr[Boolean] = js.undefined
    
    var indexOf: js.UndefOr[Boolean] = js.undefined
    
    var join: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.UndefOr[Boolean] = js.undefined
    
    var lastIndexOf: js.UndefOr[Boolean] = js.undefined
    
    var length: js.UndefOr[Boolean] = js.undefined
    
    var map: js.UndefOr[Boolean] = js.undefined
    
    var pop: js.UndefOr[Boolean] = js.undefined
    
    var push: js.UndefOr[Boolean] = js.undefined
    
    var reduce: js.UndefOr[Boolean] = js.undefined
    
    var reduceRight: js.UndefOr[Boolean] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var shift: js.UndefOr[Boolean] = js.undefined
    
    var slice: js.UndefOr[Boolean] = js.undefined
    
    var some: js.UndefOr[Boolean] = js.undefined
    
    var sort: js.UndefOr[Boolean] = js.undefined
    
    var splice: js.UndefOr[Boolean] = js.undefined
    
    @JSName("toLocaleString")
    var toLocaleString_FKinArraykeyofanyboolean: js.UndefOr[Boolean] = js.undefined
    
    @JSName("toString")
    var toString_FKinArraykeyofanyboolean: js.UndefOr[Boolean] = js.undefined
    
    var unshift: js.UndefOr[Boolean] = js.undefined
    
    var values: js.UndefOr[Boolean] = js.undefined
  }
  object KinArraykeyofanyboolean {
    
    inline def apply(): KinArraykeyofanyboolean = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KinArraykeyofanyboolean]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KinArraykeyofanyboolean] (val x: Self) extends AnyVal {
      
      inline def setAt(value: Boolean): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setConcat(value: Boolean): Self = StObject.set(x, "concat", value.asInstanceOf[js.Any])
      
      inline def setConcatUndefined: Self = StObject.set(x, "concat", js.undefined)
      
      inline def setCopyWithin(value: Boolean): Self = StObject.set(x, "copyWithin", value.asInstanceOf[js.Any])
      
      inline def setCopyWithinUndefined: Self = StObject.set(x, "copyWithin", js.undefined)
      
      inline def setEntries(value: Boolean): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
      
      inline def setEvery(value: Boolean): Self = StObject.set(x, "every", value.asInstanceOf[js.Any])
      
      inline def setEveryUndefined: Self = StObject.set(x, "every", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFind(value: Boolean): Self = StObject.set(x, "find", value.asInstanceOf[js.Any])
      
      inline def setFindIndex(value: Boolean): Self = StObject.set(x, "findIndex", value.asInstanceOf[js.Any])
      
      inline def setFindIndexUndefined: Self = StObject.set(x, "findIndex", js.undefined)
      
      inline def setFindLast(value: Boolean): Self = StObject.set(x, "findLast", value.asInstanceOf[js.Any])
      
      inline def setFindLastIndex(value: Boolean): Self = StObject.set(x, "findLastIndex", value.asInstanceOf[js.Any])
      
      inline def setFindLastIndexUndefined: Self = StObject.set(x, "findLastIndex", js.undefined)
      
      inline def setFindLastUndefined: Self = StObject.set(x, "findLast", js.undefined)
      
      inline def setFindUndefined: Self = StObject.set(x, "find", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatMap(value: Boolean): Self = StObject.set(x, "flatMap", value.asInstanceOf[js.Any])
      
      inline def setFlatMapUndefined: Self = StObject.set(x, "flatMap", js.undefined)
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setForEach(value: Boolean): Self = StObject.set(x, "forEach", value.asInstanceOf[js.Any])
      
      inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      inline def setIncludes(value: Boolean): Self = StObject.set(x, "includes", value.asInstanceOf[js.Any])
      
      inline def setIncludesUndefined: Self = StObject.set(x, "includes", js.undefined)
      
      inline def setIndexOf(value: Boolean): Self = StObject.set(x, "indexOf", value.asInstanceOf[js.Any])
      
      inline def setIndexOfUndefined: Self = StObject.set(x, "indexOf", js.undefined)
      
      inline def setJoin(value: Boolean): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
      
      inline def setKeys(value: Boolean): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setLastIndexOf(value: Boolean): Self = StObject.set(x, "lastIndexOf", value.asInstanceOf[js.Any])
      
      inline def setLastIndexOfUndefined: Self = StObject.set(x, "lastIndexOf", js.undefined)
      
      inline def setLength(value: Boolean): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMap(value: Boolean): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPop(value: Boolean): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      inline def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
      
      inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      inline def setReduce(value: Boolean): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
      
      inline def setReduceRight(value: Boolean): Self = StObject.set(x, "reduceRight", value.asInstanceOf[js.Any])
      
      inline def setReduceRightUndefined: Self = StObject.set(x, "reduceRight", js.undefined)
      
      inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setShift(value: Boolean): Self = StObject.set(x, "shift", value.asInstanceOf[js.Any])
      
      inline def setShiftUndefined: Self = StObject.set(x, "shift", js.undefined)
      
      inline def setSlice(value: Boolean): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
      
      inline def setSome(value: Boolean): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
      
      inline def setSomeUndefined: Self = StObject.set(x, "some", js.undefined)
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setSplice(value: Boolean): Self = StObject.set(x, "splice", value.asInstanceOf[js.Any])
      
      inline def setSpliceUndefined: Self = StObject.set(x, "splice", js.undefined)
      
      inline def setToLocaleString(value: Boolean): Self = StObject.set(x, "toLocaleString", value.asInstanceOf[js.Any])
      
      inline def setToLocaleStringUndefined: Self = StObject.set(x, "toLocaleString", js.undefined)
      
      inline def setToString_(value: Boolean): Self = StObject.set(x, "toString", value.asInstanceOf[js.Any])
      
      inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
      
      inline def setUnshift(value: Boolean): Self = StObject.set(x, "unshift", value.asInstanceOf[js.Any])
      
      inline def setUnshiftUndefined: Self = StObject.set(x, "unshift", js.undefined)
      
      inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
