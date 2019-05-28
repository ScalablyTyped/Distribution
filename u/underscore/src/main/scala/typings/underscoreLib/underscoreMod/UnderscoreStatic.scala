package typings
package underscoreLib.underscoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnderscoreStatic extends js.Object {
  /**
    * @see _.map
    **/
  @JSName("collect")
  var collect_Original: underscoreLib.Fn_Context = js.native
  /**
    * By default, Underscore uses ERB-style template delimiters, change the
    * following template settings to use alternative delimiters.
    **/
  var templateSettings: TemplateSettings = js.native
  def apply[T](value: T): Underscore[T] = js.native
  def apply[T](value: js.Array[T]): Underscore[T] = js.native
  /**
    * Underscore OOP Wrapper, all Underscore functions that take an object
    * as the first parameter can be invoked through this function.
    * @param key First argument to Underscore object functions.
    **/
  def apply[T](value: Dictionary[T]): Underscore[T] = js.native
  def apply[T](value: List[T]): Underscore[T] = js.native
  /**
    * Creates a version of the function that will only be run after first being called count times. Useful
    * for grouping asynchronous responses, where you want to be sure that all the async calls have finished,
    * before proceeding.
    * @param number count Number of times to be called before actually executing.
    * @param Function fn The function to defer execution `count` times.
    * @return Copy of `fn` that will not execute until it is invoked `count` times.
    **/
  def after(count: scala.Double, fn: js.Function): js.Function = js.native
  /**
    * @see _.every
    **/
  def all[T](list: Dictionary[T]): scala.Boolean = js.native
  def all[T](list: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean]): scala.Boolean = js.native
  def all[T](list: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  /**
    * @see _.every
    **/
  def all[T](list: List[T]): scala.Boolean = js.native
  def all[T](list: List[T], iterator: ListIterator[T, scala.Boolean]): scala.Boolean = js.native
  def all[T](list: List[T], iterator: ListIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  /**
    * Retrieve all the names of object's own and inherited properties.
    * @param object Retrieve the key or property names from this object.
    * @return List of all the property names on `object`.
    **/
  def allKeys(`object`: js.Any): js.Array[java.lang.String] = js.native
  /**
    * @see _.some
    **/
  def any[T](list: List[T]): scala.Boolean = js.native
  def any[T](list: List[T], iterator: ListIterator[T, scala.Boolean]): scala.Boolean = js.native
  def any[T](list: List[T], iterator: ListIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  def any[T](list: List[T], value: T): scala.Boolean = js.native
  /**
    * @see _.some
    **/
  def any[T](`object`: Dictionary[T]): scala.Boolean = js.native
  def any[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean]): scala.Boolean = js.native
  def any[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  /**
    * Like extend, but only copies own properties over to the destination object. (alias: extendOwn)
    */
  def assign(destination: js.Any, source: js.Any*): js.Any = js.native
  /**
    * Creates a version of the function that can be called no more than count times.  The result of
    * the last function call is memoized and returned when count has been reached.
    * @param number count  The maxmimum number of times the function can be called.
    * @param Function fn The function to limit the number of times it can be called.
    * @return Copy of `fn` that can only be called `count` times.
    **/
  def before(count: scala.Double, fn: js.Function): js.Function = js.native
  /*************
    * Functions *
    *************/
  /**
    * Bind a function to an object, meaning that whenever the function is called, the value of this will
    * be the object. Optionally, bind arguments to the function to pre-fill them, also known as partial application.
    * @param func The function to bind `this` to `object`.
    * @param context The `this` pointer whenever `fn` is called.
    * @param arguments Additional arguments to pass to `fn` when called.
    * @return `fn` with `this` bound to `object`.
    **/
  def bind(func: js.Function, context: js.Any, args: js.Any*): js.Function0[_] = js.native
  /**
    * Binds a number of methods on the object, specified by methodNames, to be run in the context of that object
    * whenever they are invoked. Very handy for binding functions that are going to be used as event handlers,
    * which would otherwise be invoked with a fairly useless this. If no methodNames are provided, all of the
    * object's function properties will be bound to it.
    * @param object The object to bind the methods `methodName` to.
    * @param methodNames The methods to bind to `object`, optional and if not provided all of `object`'s
    * methods are bound.
    **/
  def bindAll(`object`: js.Any, methodNames: java.lang.String*): js.Any = js.native
  def chain[T /* <: js.Object */](obj: T): _Chain[T] = js.native
  /* **********
    * Chaining *
    *********** */
  /**
    * Returns a wrapped object. Calling methods on this object will continue to return wrapped objects
    * until value() is used.
    * @param obj Object to chain.
    * @return Wrapped `obj`.
    **/
  def chain[T](obj: js.Array[T]): _Chain[T] = js.native
  def chain[T](obj: Dictionary[T]): _Chain[T] = js.native
  /**
    * Split an **array** into several arrays containing **count** or less elements
    * of initial array.
    * @param array The array to split
    * @param count The maximum size of the inner arrays.
    */
  def chunk[T](array: Collection[T], count: scala.Double): js.Array[Collection[T]] = js.native
  /**
    * Create a shallow-copied clone of the object.
    * Any nested objects or arrays will be copied by reference, not duplicated.
    * @param object Object to clone.
    * @return Copy of `object`.
    **/
  def clone[T](`object`: T): T = js.native
  /**
    * @see _.map
    **/
  def collect[T](list: List[T], iterator: IterateeMatcherShorthand[_]): js.Array[scala.Boolean] = js.native
  def collect[T](list: List[T], iterator: IterateeMatcherShorthand[_], context: js.Any): js.Array[scala.Boolean] = js.native
  /**
    * @see _.map
    **/
  def collect[T](list: List[T], iterator: IterateePropertyShorthand): js.Array[_] = js.native
  def collect[T](list: List[T], iterator: IterateePropertyShorthand, context: js.Any): js.Array[_] = js.native
  /**
    * @see _.map
    **/
  def collect[T, TResult](list: List[T], iterator: ListIterator[T, TResult]): js.Array[TResult] = js.native
  def collect[T, TResult](list: List[T], iterator: ListIterator[T, TResult], context: js.Any): js.Array[TResult] = js.native
  /**
    * @see _.map
    **/
  def collect[T, TResult](`object`: Dictionary[T], iterator: ObjectIterator[T, TResult]): js.Array[TResult] = js.native
  def collect[T, TResult](`object`: Dictionary[T], iterator: ObjectIterator[T, TResult], context: js.Any): js.Array[TResult] = js.native
  def compact[T](): js.Array[T] = js.native
  /**
    * Returns a copy of the array with all falsy values removed. In JavaScript, false, null, 0, "",
    * undefined and NaN are all falsy.
    * @param array Array to compact.
    * @return Copy of `array` without false values.
    **/
  @JSName("compact")
  def compact_[T](
    array: List[
      js.UndefOr[
        T | scala.Null | underscoreLib.underscoreLibNumbers.`false` | underscoreLib.underscoreLibStrings.Empty | underscoreLib.underscoreLibNumbers.`0`
      ]
    ]
  ): js.Array[T] = js.native
  /**
    * Returns the composition of a list of functions, where each function consumes the return value of the
    * function that follows. In math terms, composing the functions f(), g(), and h() produces f(g(h())).
    * @param functions List of functions to compose.
    * @return Composition of `functions`.
    **/
  def compose(functions: js.Function*): js.Function = js.native
  /**
    * Creates a function that returns the same value that is used as the argument of _.constant
    * @param value Identity of this object.
    * @return Function that return value.
    **/
  def constant[T](value: T): js.Function0[T] = js.native
  /**
    * Returns true if the value is present in the list. Uses indexOf internally,
    * if list is an Array.
    * @param list Checks each element to see if `value` is present.
    * @param value The value to check for within `list`.
    * @return True if `value` is present in `list`, otherwise false.
    **/
  def contains[T](list: List[T], value: T): scala.Boolean = js.native
  def contains[T](list: List[T], value: T, fromIndex: scala.Double): scala.Boolean = js.native
  /**
    * @see _.contains
    **/
  def contains[T](`object`: Dictionary[T], value: T): scala.Boolean = js.native
  /**
    * Sorts a list into groups and returns a count for the number of objects in each group. Similar
    * to groupBy, but instead of returning a list of values, returns a count for the number of values
    * in that group.
    * @param list Group elements in this list and then count the number of elements in each group.
    * @param iterator Group iterator for each element within `list`, return the key to group the element by.
    * @param context `this` object in `iterator`, optional.
    * @return An object with the group names as properties where each property contains the number of elements in that group.
    **/
  def countBy[T](list: List[T]): Dictionary[scala.Double] = js.native
  /**
    * @see _.countBy
    * @param iterator Function name
    **/
  def countBy[T](list: List[T], iterator: java.lang.String): Dictionary[scala.Double] = js.native
  def countBy[T](list: List[T], iterator: java.lang.String, context: js.Any): Dictionary[scala.Double] = js.native
  def countBy[T](list: List[T], iterator: ListIterator[T, _]): Dictionary[scala.Double] = js.native
  def countBy[T](list: List[T], iterator: ListIterator[T, _], context: js.Any): Dictionary[scala.Double] = js.native
  /**
    * Creates an object that inherits from the given prototype object.
    * If additional properties are provided then they will be added to the
    * created object.
    * @param prototype The prototype that the returned object will inherit from.
    * @param props Additional props added to the returned object.
    **/
  def create(prototype: js.Any): js.Any = js.native
  def create(prototype: js.Any, props: js.Object): js.Any = js.native
  /**
    * Creates and returns a new debounced version of the passed function that will postpone its execution
    * until after wait milliseconds have elapsed since the last time it was invoked. Useful for implementing
    * behavior that should only happen after the input has stopped arriving. For example: rendering a preview
    * of a Markdown comment, recalculating a layout after the window has stopped being resized, and so on.
    *
    * Pass true for the immediate parameter to cause debounce to trigger the function on the leading instead
    * of the trailing edge of the wait interval. Useful in circumstances like preventing accidental double
    *-clicks on a "submit" button from firing a second time.
    * @param fn Function to debounce `waitMS` ms.
    * @param wait The number of milliseconds to wait before `fn` can be invoked again.
    * @param immediate True if `fn` should be invoked on the leading edge of `waitMS` instead of the trailing edge.
    * @return Debounced version of `fn` that waits `wait` ms when invoked.
    **/
  def debounce[T /* <: js.Function */](fn: T, wait: scala.Double): T with Cancelable = js.native
  def debounce[T /* <: js.Function */](fn: T, wait: scala.Double, immediate: scala.Boolean): T with Cancelable = js.native
  /**
    * Fill in null and undefined properties in object with values from the defaults objects,
    * and return the object. As soon as the property is filled, further defaults will have no effect.
    * @param object Fill this object with default values.
    * @param defaults The default values to add to `object`.
    * @return `object` with added `defaults` values.
    **/
  def defaults(`object`: js.Any, defaults: js.Any*): js.Any = js.native
  /**
    * Defers invoking the function until the current call stack has cleared, similar to using setTimeout
    * with a delay of 0. Useful for performing expensive computations or HTML rendering in chunks without
    * blocking the UI thread from updating. If you pass the optional arguments, they will be forwarded on
    * to the function when it is invoked.
    * @param fn The function to defer.
    * @param arguments Additional arguments to pass to `fn`.
    **/
  def defer(fn: js.Function, args: js.Any*): scala.Unit = js.native
  /**
    * @see _delay
    **/
  def delay(func: js.Function, args: js.Any*): js.Any = js.native
  /**
    * Much like setTimeout, invokes function after wait milliseconds. If you pass the optional arguments,
    * they will be forwarded on to the function when it is invoked.
    * @param func Function to delay `waitMS` amount of ms.
    * @param wait The amount of milliseconds to delay `fn`.
    * @arguments Additional arguments to pass to `fn`.
    **/
  def delay(func: js.Function, wait: scala.Double, args: js.Any*): js.Any = js.native
  /**
    * @see _.find
    **/
  def detect[T](list: List[T], iterator: ListIterator[T, scala.Boolean]): js.UndefOr[T] = js.native
  def detect[T](list: List[T], iterator: ListIterator[T, scala.Boolean], context: js.Any): js.UndefOr[T] = js.native
  def detect[T](`object`: Dictionary[T], iterator: java.lang.String): js.UndefOr[T] = js.native
  /**
    * @see _.find
    **/
  def detect[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean]): js.UndefOr[T] = js.native
  def detect[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean], context: js.Any): js.UndefOr[T] = js.native
  /**
    * @see _.find
    **/
  def detect[T](`object`: List[T], iterator: java.lang.String): js.UndefOr[T] = js.native
  def detect[T, U /* <: js.Object */](`object`: Dictionary[T], iterator: U): js.UndefOr[T] = js.native
  /**
    * @see _.find
    **/
  def detect[T, U /* <: js.Object */](`object`: List[T], iterator: U): js.UndefOr[T] = js.native
  /**
    * Similar to without, but returns the values from array that are not present in the other arrays.
    * @param array Keeps values that are within `others`.
    * @param others The values to keep within `array`.
    * @return Copy of `array` with only `others` values.
    **/
  def difference[T](array: List[T], others: List[T]*): js.Array[T] = js.native
  /**
    * @see _.rest
    **/
  def drop[T](array: List[T]): js.Array[T] = js.native
  def drop[T](array: List[T], n: scala.Double): js.Array[T] = js.native
  /* *************
    * Collections *
    ************* */
  /**
    * Iterates over a list of elements, yielding each in turn to an iterator function. The iterator is
    * bound to the context object, if one is passed. Each invocation of iterator is called with three
    * arguments: (element, index, list). If list is a JavaScript object, iterator's arguments will be
    * (value, key, object). Delegates to the native forEach function if it exists.
    * @param list Iterates over this list of elements.
    * @param iterator Iterator function for each element `list`.
    * @param context 'this' object in `iterator`, optional.
    **/
  def each[T](list: List[T], iterator: ListIterator[T, scala.Unit]): List[T] = js.native
  def each[T](list: List[T], iterator: ListIterator[T, scala.Unit], context: js.Any): List[T] = js.native
  /**
    * @see _.each
    * @param object Iterates over properties of this object.
    * @param iterator Iterator function for each property on `object`.
    * @param context 'this' object in `iterator`, optional.
    **/
  def each[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Unit]): Dictionary[T] = js.native
  def each[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Unit], context: js.Any): Dictionary[T] = js.native
  /**
    * Escapes a string for insertion into HTML, replacing &, <, >, ", ', and / characters.
    * @param str Raw string to escape.
    * @return `str` HTML escaped.
    **/
  def escape(str: java.lang.String): java.lang.String = js.native
  /**
    * @see _.every
    **/
  def every[T](list: Dictionary[T]): scala.Boolean = js.native
  def every[T](list: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean]): scala.Boolean = js.native
  def every[T](list: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  /**
    * Returns true if all of the values in the list pass the iterator truth test. Delegates to the
    * native method every, if present.
    * @param list Truth test against all elements within this list.
    * @param iterator Trust test iterator function for each element in `list`.
    * @param context `this` object in `iterator`, optional.
    * @return True if all elements passed the truth test, otherwise false.
    **/
  def every[T](list: List[T]): scala.Boolean = js.native
  def every[T](list: List[T], iterator: ListIterator[T, scala.Boolean]): scala.Boolean = js.native
  def every[T](list: List[T], iterator: ListIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  /**
    * Copy all of the properties in the source objects over to the destination object, and return
    * the destination object. It's in-order, so the last source will override properties of the
    * same name in previous arguments.
    * @param destination Object to extend all the properties from `sources`.
    * @param sources Extends `destination` with all properties from these source objects.
    * @return `destination` extended with all the properties from the `sources` objects.
    **/
  def extend(destination: js.Any, sources: js.Any*): js.Any = js.native
  /**
    * Like extend, but only copies own properties over to the destination object. (alias: assign)
    */
  def extendOwn(destination: js.Any, source: js.Any*): js.Any = js.native
  /**
    * Looks through each value in the list, returning an array of all the values that pass a truth
    * test (iterator). Delegates to the native filter method, if it exists.
    * @param list Filter elements out of this list.
    * @param iterator Filter iterator function for each element in `list`.
    * @param context `this` object in `iterator`, optional.
    * @return The filtered list of elements.
    **/
  def filter[T](list: List[T], iterator: ListIterator[T, scala.Boolean]): js.Array[T] = js.native
  def filter[T](list: List[T], iterator: ListIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  /**
    * @see _.filter
    **/
  def filter[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean]): js.Array[T] = js.native
  def filter[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  /**
    * Looks through each value in the list, returning the first one that passes a truth
    * test (iterator). The function returns as soon as it finds an acceptable element,
    * and doesn't traverse the entire list.
    * @param list Searches for a value in this list.
    * @param iterator Search iterator function for each element in `list`.
    * @param context `this` object in `iterator`, optional.
    * @return The first acceptable found element in `list`, if nothing is found undefined/null is returned.
    **/
  def find[T](list: List[T], iterator: ListIterator[T, scala.Boolean]): js.UndefOr[T] = js.native
  def find[T](list: List[T], iterator: ListIterator[T, scala.Boolean], context: js.Any): js.UndefOr[T] = js.native
  def find[T](`object`: Dictionary[T], iterator: java.lang.String): js.UndefOr[T] = js.native
  /**
    * @see _.find
    **/
  def find[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean]): js.UndefOr[T] = js.native
  def find[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean], context: js.Any): js.UndefOr[T] = js.native
  /**
    * @see _.find
    **/
  def find[T](`object`: List[T], iterator: java.lang.String): js.UndefOr[T] = js.native
  def find[T, U /* <: js.Object */](`object`: Dictionary[T], iterator: U): js.UndefOr[T] = js.native
  /**
    * @see _.find
    **/
  def find[T, U /* <: js.Object */](`object`: List[T], iterator: U): js.UndefOr[T] = js.native
  def findIndex[T](array: List[T], predicate: js.Object): scala.Double = js.native
  def findIndex[T](array: List[T], predicate: js.Object, context: js.Any): scala.Double = js.native
  /**
    * Returns the first index of an element in `array` where the predicate truth test passes
    * @param array The array to search for the index of the first element where the predicate truth test passes.
    * @param predicate Predicate function.
    * @param context `this` object in `predicate`, optional.
    * @return Returns the index of an element in `array` where the predicate truth test passes or -1.`
    **/
  def findIndex[T](array: List[T], predicate: ListIterator[T, scala.Boolean]): scala.Double = js.native
  def findIndex[T](array: List[T], predicate: ListIterator[T, scala.Boolean], context: js.Any): scala.Double = js.native
  /**
    * Returns the first key on an object that passes a predicate test.
    * @param obj the object to search in
    * @param predicate Predicate function.
    * @param context `this` object in `iterator`, optional.
    */
  def findKey[T](obj: Dictionary[T], predicate: ObjectIterator[T, scala.Boolean]): java.lang.String = js.native
  def findKey[T](obj: Dictionary[T], predicate: ObjectIterator[T, scala.Boolean], context: js.Any): java.lang.String = js.native
  def findLastIndex[T](array: List[T], predicate: js.Object): scala.Double = js.native
  def findLastIndex[T](array: List[T], predicate: js.Object, context: js.Any): scala.Double = js.native
  /**
    * Returns the last index of an element in `array` where the predicate truth test passes
    * @param array The array to search for the index of the last element where the predicate truth test passes.
    * @param predicate Predicate function.
    * @param context `this` object in `predicate`, optional.
    * @return Returns the index of an element in `array` where the predicate truth test passes or -1.`
    **/
  def findLastIndex[T](array: List[T], predicate: ListIterator[T, scala.Boolean]): scala.Double = js.native
  def findLastIndex[T](array: List[T], predicate: ListIterator[T, scala.Boolean], context: js.Any): scala.Double = js.native
  /**
    * Looks through the list and returns the first value that matches all of the key-value pairs listed in properties.
    * @param list Search through this list's elements for the first object with all `properties`.
    * @param properties Properties to look for on the elements within `list`.
    * @return The first element in `list` that has all `properties`.
    **/
  def findWhere[T, U /* <: js.Object */](list: List[T], properties: U): js.UndefOr[T] = js.native
  /*********
    * Arrays *
    **********/
  /**
    * Returns the first element of an array. Passing n will return the first n elements of the array.
    * @param array Retrieves the first element of this array.
    * @return Returns the first element of `array`.
    **/
  def first[T](array: List[T]): js.UndefOr[T] = js.native
  /**
    * @see _.first
    * @param n Return more than one element from `array`.
    **/
  def first[T](array: List[T], n: scala.Double): js.Array[T] = js.native
  /**
    * Flattens a nested array (the nesting can be to any depth). If you pass shallow, the array will
    * only be flattened a single level.
    * @param array The array to flatten.
    * @param shallow If true then only flatten one level, optional, default = false.
    * @return `array` flattened.
    **/
  def flatten(array: List[_]): js.Array[_] = js.native
  def flatten(array: List[_], shallow: scala.Boolean): js.Array[_] = js.native
  /**
    * @see _.reduce
    **/
  def foldl[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult]): TResult = js.native
  def foldl[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def foldl[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
    * @see _.reduceRight
    **/
  def foldr[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult]): TResult = js.native
  def foldr[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def foldr[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
    * @see _.each
    **/
  def forEach[T](list: List[T], iterator: ListIterator[T, scala.Unit]): List[T] = js.native
  def forEach[T](list: List[T], iterator: ListIterator[T, scala.Unit], context: js.Any): List[T] = js.native
  /**
    * @see _.each
    **/
  def forEach[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Unit]): Dictionary[T] = js.native
  def forEach[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Unit], context: js.Any): Dictionary[T] = js.native
  /**
    * Returns a sorted list of the names of every method in an object - that is to say,
    * the name of every function property of the object.
    * @param object Object to pluck all function property names from.
    * @return List of all the function names on `object`.
    **/
  def functions(`object`: js.Any): js.Array[java.lang.String] = js.native
  /**
    * Splits a collection into sets, grouped by the result of running each value through iterator.
    * If iterator is a string instead of a function, groups by the property named by iterator on
    * each of the values.
    * @param list Groups this list.
    * @param iterator Group iterator for each element within `list`, return the key to group the element by.
    * @param context `this` object in `iterator`, optional.
    * @return An object with the group names as properties where each property contains the grouped elements from `list`.
    **/
  def groupBy[T](list: List[T]): Dictionary[js.Array[T]] = js.native
  /**
    * @see _.groupBy
    * @param iterator Property on each object to group them by.
    **/
  def groupBy[T](list: List[T], iterator: java.lang.String): Dictionary[js.Array[T]] = js.native
  def groupBy[T](list: List[T], iterator: java.lang.String, context: js.Any): Dictionary[js.Array[T]] = js.native
  def groupBy[T](list: List[T], iterator: ListIterator[T, _]): Dictionary[js.Array[T]] = js.native
  def groupBy[T](list: List[T], iterator: ListIterator[T, _], context: js.Any): Dictionary[js.Array[T]] = js.native
  /**
    * Does the object contain the given key? Identical to object.hasOwnProperty(key), but uses a safe
    * reference to the hasOwnProperty function, in case it's been overridden accidentally.
    * @param object Object to check for `key`.
    * @param key The key to check for on `object`.
    * @return True if `key` is a property on `object`, otherwise false.
    **/
  def has(`object`: js.Any, key: java.lang.String): scala.Boolean = js.native
  /**
    * @see _.first
    **/
  def head[T](array: List[T]): js.UndefOr[T] = js.native
  /**
    * @see _.first
    **/
  def head[T](array: List[T], n: scala.Double): js.Array[T] = js.native
  /**
    * Returns the same value that is used as the argument. In math: f(x) = x
    * This function looks useless, but is used throughout Underscore as a default iterator.
    * @param value Identity of this object.
    * @return `value`.
    **/
  def identity[T](value: T): T = js.native
  /**
    * @see _.contains
    **/
  def include[T](list: Collection[T], value: T): scala.Boolean = js.native
  def include[T](list: Collection[T], value: T, fromIndex: scala.Double): scala.Boolean = js.native
  /**
    * @see _.contains
    **/
  def include[T](`object`: Dictionary[T], value: T): scala.Boolean = js.native
  /**
    * @see _.contains
    **/
  def includes[T](list: Collection[T], value: T): scala.Boolean = js.native
  def includes[T](list: Collection[T], value: T, fromIndex: scala.Double): scala.Boolean = js.native
  /**
    * @see _.contains
    **/
  def includes[T](`object`: Dictionary[T], value: T): scala.Boolean = js.native
  /**
    * @see _.indexBy
    * @param iterator Property on each object to index them by.
    **/
  def indexBy[T](list: List[T], iterator: java.lang.String): Dictionary[T] = js.native
  def indexBy[T](list: List[T], iterator: java.lang.String, context: js.Any): Dictionary[T] = js.native
  /**
    * Given a `list`, and an `iterator` function that returns a key for each element in the list (or a property name),
    * returns an object with an index of each item.  Just like _.groupBy, but for when you know your keys are unique.
    **/
  def indexBy[T](list: List[T], iterator: ListIterator[T, _]): Dictionary[T] = js.native
  def indexBy[T](list: List[T], iterator: ListIterator[T, _], context: js.Any): Dictionary[T] = js.native
  /**
    * Returns the index at which value can be found in the array, or -1 if value is not present in the array.
    * Uses the native indexOf function unless it's missing. If you're working with a large array, and you know
    * that the array is already sorted, pass true for isSorted to use a faster binary search ... or, pass a number
    * as the third argument in order to look for the first matching value in the array after the given index.
    * @param array The array to search for the index of `value`.
    * @param value The value to search for within `array`.
    * @param isSorted True if the array is already sorted, optional, default = false.
    * @return The index of `value` within `array`.
    **/
  def indexOf[T](array: List[T], value: T): scala.Double = js.native
  def indexOf[T](array: List[T], value: T, isSorted: scala.Boolean): scala.Double = js.native
  /**
    * @see _indexof
    **/
  def indexOf[T](array: List[T], value: T, startFrom: scala.Double): scala.Double = js.native
  /**
    * Returns everything but the last entry of the array. Especially useful on the arguments object.
    * Pass n to exclude the last n elements from the result.
    * @param array Retrieve all elements except the last `n`.
    * @param n Leaves this many elements behind, optional.
    * @return Returns everything but the last `n` elements of `array`.
    **/
  def initial[T](array: List[T]): js.Array[T] = js.native
  def initial[T](array: List[T], n: scala.Double): js.Array[T] = js.native
  def inject[T, TResult](list: Dictionary[T], iterator: MemoObjectIterator[T, TResult]): TResult = js.native
  def inject[T, TResult](list: Dictionary[T], iterator: MemoObjectIterator[T, TResult], memo: TResult): TResult = js.native
  def inject[T, TResult](list: Dictionary[T], iterator: MemoObjectIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
    * @see _.reduce
    **/
  def inject[T, TResult](list: List[T], iterator: MemoIterator[T, TResult]): TResult = js.native
  def inject[T, TResult](list: List[T], iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def inject[T, TResult](list: List[T], iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
    * Computes the list of values that are the intersection of all the arrays. Each value in the result
    * is present in each of the arrays.
    * @param arrays Array of arrays to compute the intersection of.
    * @return The intersection of elements within `arrays`.
    **/
  def intersection[T](arrays: List[T]*): js.Array[T] = js.native
  /**
    * Returns a copy of the object where the keys have become the values and the values the keys.
    * For this to work, all of your object's values should be unique and string serializable.
    * @param object Object to invert key/value pairs.
    * @return An inverted key/value paired version of `object`.
    **/
  def invert(`object`: js.Any): js.Any = js.native
  /**
    * Calls the method named by methodName on each value in the list. Any extra arguments passed to
    * invoke will be forwarded on to the method invocation.
    * @param list The element's in this list will each have the method `methodName` invoked.
    * @param methodName The method's name to call on each element within `list`.
    * @param arguments Additional arguments to pass to the method `methodName`.
    **/
  def invoke[T /* <: js.Object */](list: List[T], methodName: java.lang.String, args: js.Any*): js.Any = js.native
  /**
    * Returns true if object is an Arguments object.
    * @param object Check if this object is an Arguments object.
    * @return True if `object` is an Arguments object, otherwise false.
    **/
  def isArguments(`object`: js.Any): /* is std.IArguments */ scala.Boolean = js.native
  /**
    * Returns true if object is an Array.
    * @param object Check if this object is an Array.
    * @return True if `object` is an Array, otherwise false.
    **/
  def isArray(`object`: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  /**
    * Returns true if object is an Array.
    * @param object Check if this object is an Array.
    * @return True if `object` is an Array, otherwise false.
    **/
  @JSName("isArray")
  def isArray_T[T](`object`: js.Any): /* is std.Array<T> */ scala.Boolean = js.native
  /**
    * Returns true if object is either true or false.
    * @param object Check if this object is a bool.
    * @return True if `object` is a bool, otherwise false.
    **/
  def isBoolean(`object`: js.Any): /* is boolean */ scala.Boolean = js.native
  /**
    * Returns true if object is a Date.
    * @param object Check if this object is a Date.
    * @return True if `object` is a Date, otherwise false.
    **/
  def isDate(`object`: js.Any): /* is std.Date */ scala.Boolean = js.native
  /**
    * Returns true if object is a DOM element.
    * @param object Check if this object is a DOM element.
    * @return True if `object` is a DOM element, otherwise false.
    **/
  def isElement(`object`: js.Any): /* is underscore.underscore.Global.Element */ scala.Boolean = js.native
  /**
    * Returns true if object contains no values.
    * @param object Check if this object has no properties or values.
    * @return True if `object` is empty.
    **/
  def isEmpty(`object`: js.Any): scala.Boolean = js.native
  /**
    * Performs an optimized deep comparison between the two objects,
    * to determine if they should be considered equal.
    * @param object Compare to `other`.
    * @param other Compare to `object`.
    * @return True if `object` is equal to `other`.
    **/
  def isEqual(`object`: js.Any, other: js.Any): scala.Boolean = js.native
  /**
    * Returns true if object inherits from an Error.
    * @param object Check if this object is an Error.
    * @return True if `object` is a Error, otherwise false.
    **/
  def isError(`object`: js.Any): /* is std.Error */ scala.Boolean = js.native
  /**
    * Returns true if object is a finite Number.
    * @param object Check if this object is a finite Number.
    * @return True if `object` is a finite Number.
    **/
  def isFinite(`object`: js.Any): scala.Boolean = js.native
  /**
    * Returns true if object is a Function.
    * @param object Check if this object is a Function.
    * @return True if `object` is a Function, otherwise false.
    **/
  def isFunction(`object`: js.Any): /* is std.Function */ scala.Boolean = js.native
  /**
    * Returns true if the keys and values in `properties` matches with the `object` properties.
    * @param object Object to be compared with `properties`.
    * @param properties Properties be compared with `object`
    * @return True if `object` has matching keys and values, otherwise false.
    **/
  def isMatch(`object`: js.Any, properties: js.Any): scala.Boolean = js.native
  /**
    * Returns true if object is NaN.
    * Note: this is not the same as the native isNaN function,
    * which will also return true if the variable is undefined.
    * @param object Check if this object is NaN.
    * @return True if `object` is NaN, otherwise false.
    **/
  def isNaN(`object`: js.Any): scala.Boolean = js.native
  /**
    * Returns true if the value of object is null.
    * @param object Check if this object is null.
    * @return True if `object` is null, otherwise false.
    **/
  def isNull(`object`: js.Any): scala.Boolean = js.native
  /**
    * Returns true if object is a Number (including NaN).
    * @param object Check if this object is a Number.
    * @return True if `object` is a Number, otherwise false.
    **/
  def isNumber(`object`: js.Any): /* is number */ scala.Boolean = js.native
  /**
    * Returns true if value is an Object. Note that JavaScript arrays and functions are objects,
    * while (normal) strings and numbers are not.
    * @param object Check if this object is an Object.
    * @return True of `object` is an Object, otherwise false.
    **/
  def isObject(`object`: js.Any): scala.Boolean = js.native
  /**
    * Returns true if object is a RegExp.
    * @param object Check if this object is a RegExp.
    * @return True if `object` is a RegExp, otherwise false.
    **/
  def isRegExp(`object`: js.Any): /* is std.RegExp */ scala.Boolean = js.native
  /**
    * Returns true if object is a String.
    * @param object Check if this object is a String.
    * @return True if `object` is a String, otherwise false.
    **/
  def isString(`object`: js.Any): /* is string */ scala.Boolean = js.native
  /**
    * Returns true if object is a Symbol.
    * @param object Check if this object is a Symbol.
    * @return True if `object` is a Symbol, otherwise false.
    **/
  def isSymbol(`object`: js.Any): /* is symbol */ scala.Boolean = js.native
  /**
    * Returns true if value is undefined.
    * @param object Check if this object is undefined.
    * @return True if `object` is undefined, otherwise false.
    **/
  def isUndefined(value: js.Any): scala.Boolean = js.native
  /**
    * A mostly-internal function to generate callbacks that can be applied to each element
    * in a collection, returning the desired result -- either identity, an arbitrary callback,
    * a property matcher, or a propetery accessor.
    * @param string|Function|Object value The value to iterate over, usually the key.
    * @param any context
    * @return Callback that can be applied to each element in a collection.
    **/
  def iteratee(value: java.lang.String): js.Function = js.native
  def iteratee(value: js.Function): js.Function = js.native
  def iteratee(value: js.Function, context: js.Any): js.Function = js.native
  def iteratee(value: js.Object): js.Function = js.native
  /**********
    * Objects *
    ***********/
  /**
    * Retrieve all the names of the object's properties.
    * @param object Retrieve the key or property names from this object.
    * @return List of all the property names on `object`.
    **/
  def keys(`object`: js.Any): js.Array[java.lang.String] = js.native
  /**
    * Returns the last element of an array. Passing n will return the last n elements of the array.
    * @param array Retrieves the last element of this array.
    * @return Returns the last element of `array`.
    **/
  def last[T](array: List[T]): js.UndefOr[T] = js.native
  /**
    * @see _.last
    * @param n Return more than one element from `array`.
    **/
  def last[T](array: List[T], n: scala.Double): js.Array[T] = js.native
  /**
    * Returns the index of the last occurrence of value in the array, or -1 if value is not present. Uses the
    * native lastIndexOf function if possible. Pass fromIndex to start your search at a given index.
    * @param array The array to search for the last index of `value`.
    * @param value The value to search for within `array`.
    * @param from The starting index for the search, optional.
    * @return The index of the last occurrence of `value` within `array`.
    **/
  def lastIndexOf[T](array: List[T], value: T): scala.Double = js.native
  def lastIndexOf[T](array: List[T], value: T, from: scala.Double): scala.Double = js.native
  def map[T](list: List[T], iterator: IterateeMatcherShorthand[_]): js.Array[scala.Boolean] = js.native
  def map[T](list: List[T], iterator: IterateeMatcherShorthand[_], context: js.Any): js.Array[scala.Boolean] = js.native
  def map[T](list: List[T], iterator: IterateePropertyShorthand): js.Array[_] = js.native
  def map[T](list: List[T], iterator: IterateePropertyShorthand, context: js.Any): js.Array[_] = js.native
  /**
    * Produces a new array of values by mapping each value in list through a transformation function
    * (iterator). If the native map method exists, it will be used instead. If list is a JavaScript
    * object, iterator's arguments will be (value, key, object).
    * @param list Maps the elements of this array.
    * @param iterator Map iterator function for each element in `list`.
    * @param context `this` object in `iterator`, optional.
    * @return The mapped array result.
    **/
  def map[T, TResult](list: List[T], iterator: ListIterator[T, TResult]): js.Array[TResult] = js.native
  def map[T, TResult](list: List[T], iterator: ListIterator[T, TResult], context: js.Any): js.Array[TResult] = js.native
  /**
    * @see _.map
    * @param object Maps the properties of this object.
    * @param iterator Map iterator function for each property on `object`.
    * @param context `this` object in `iterator`, optional.
    * @return The mapped object result.
    **/
  def map[T, TResult](`object`: Dictionary[T], iterator: ObjectIterator[T, TResult]): js.Array[TResult] = js.native
  def map[T, TResult](`object`: Dictionary[T], iterator: ObjectIterator[T, TResult], context: js.Any): js.Array[TResult] = js.native
  /**
    * Like map, but for objects. Retrieves a property from each entry in the object, as if by _.property
    * @param object The object to transform
    * @param iteratee The property name to retrieve
    * @param context The optional context (value of `this`) to bind to
    */
  def mapObject(`object`: js.Any, iteratee: java.lang.String): Dictionary[_] = js.native
  def mapObject(`object`: js.Any, iteratee: java.lang.String, context: js.Any): Dictionary[_] = js.native
  /**
    * Like map, but for objects. Transform the value of each property in turn.
    * @param object The object to transform
    * @param iteratee The function that tranforms property values
    * @param context The optional context (value of `this`) to bind to
    */
  def mapObject[T](
    `object`: js.Any,
    iteratee: js.Function3[/* val */ js.Any, /* key */ java.lang.String, /* object */ js.Any, T]
  ): Dictionary[T] = js.native
  def mapObject[T](
    `object`: js.Any,
    iteratee: js.Function3[/* val */ js.Any, /* key */ java.lang.String, /* object */ js.Any, T],
    context: js.Any
  ): Dictionary[T] = js.native
  /**
    * Like map, but for objects. Transform the value of each property in turn.
    * @param object The object to transform
    * @param iteratee The function that transforms property values
    * @param context The optional context (value of `this`) to bind to
    * @return a new _.Dictionary of property values
    */
  def mapObject[T, U](
    `object`: Dictionary[T],
    iteratee: js.Function3[/* val */ T, /* key */ java.lang.String, /* object */ Dictionary[T], U]
  ): Dictionary[U] = js.native
  def mapObject[T, U](
    `object`: Dictionary[T],
    iteratee: js.Function3[/* val */ T, /* key */ java.lang.String, /* object */ Dictionary[T], U],
    context: js.Any
  ): Dictionary[U] = js.native
  /**
    * Returns a predicate function that will tell you if a passed in object contains all of the key/value properties present in attrs.
    * @see _.matches
    * @param attrs Object with key values pair
    * @return Predicate function
    **/
  def matcher[T](attrs: T): Predicate[T] = js.native
  /**
    * Returns a predicate function that will tell you if a passed in object contains all of the key/value properties present in attrs.
    * @param attrs Object with key values pair
    * @return Predicate function
    **/
  def matches[T](attrs: T): Predicate[T] = js.native
  /**
    * Returns the maximum value in list.
    * @param list Finds the maximum value in this list.
    * @return Maximum value in `list`.
    **/
  def max(list: List[scala.Double]): scala.Double = js.native
  /**
    * @see _.max
    */
  def max(`object`: Dictionary[scala.Double]): scala.Double = js.native
  def max[T](list: Dictionary[T], iterator: ObjectIterator[T, _]): T = js.native
  def max[T](list: Dictionary[T], iterator: ObjectIterator[T, _], context: js.Any): T = js.native
  def max[T](list: List[T], iterator: ListIterator[T, _]): T = js.native
  def max[T](list: List[T], iterator: ListIterator[T, _], context: js.Any): T = js.native
  /**
    * @see _.max
    */
  @JSName("max")
  def max_TT[T](list: Dictionary[T]): T = js.native
  /**
    * Returns the maximum value in list. If iterator is passed, it will be used on each value to generate
    * the criterion by which the value is ranked.
    * @param list Finds the maximum value in this list.
    * @param iterator Compares each element in `list` to find the maximum value.
    * @param context `this` object in `iterator`, optional.
    * @return The maximum element within `list`.
    **/
  @JSName("max")
  def max_TT[T](list: List[T]): T = js.native
  /**
    * Memoizes a given function by caching the computed result. Useful for speeding up slow-running computations.
    * If passed an optional hashFunction, it will be used to compute the hash key for storing the result, based
    * on the arguments to the original function. The default hashFunction just uses the first argument to the
    * memoized function as the key.
    * @param fn Computationally expensive function that will now memoized results.
    * @param hashFn Hash function for storing the result of `fn`.
    * @return Memoized version of `fn`.
    **/
  def memoize[T](fn: T): T = js.native
  def memoize[T](fn: T, hashFn: js.Function1[/* repeated */ js.Any, java.lang.String]): T = js.native
  /**
    * @see _functions
    **/
  def methods(`object`: js.Any): js.Array[java.lang.String] = js.native
  /**
    * Returns the minimum value in list.
    * @param list Finds the minimum value in this list.
    * @return Minimum value in `list`.
    **/
  def min(list: List[scala.Double]): scala.Double = js.native
  /**
    * @see _.min
    */
  def min(o: Dictionary[scala.Double]): scala.Double = js.native
  def min[T](list: Dictionary[T], iterator: ObjectIterator[T, _]): T = js.native
  def min[T](list: Dictionary[T], iterator: ObjectIterator[T, _], context: js.Any): T = js.native
  def min[T](list: List[T], iterator: ListIterator[T, _]): T = js.native
  def min[T](list: List[T], iterator: ListIterator[T, _], context: js.Any): T = js.native
  /**
    * @see _.min
    */
  @JSName("min")
  def min_TT[T](list: Dictionary[T]): T = js.native
  /**
    * Returns the minimum value in list. If iterator is passed, it will be used on each value to generate
    * the criterion by which the value is ranked.
    * @param list Finds the minimum value in this list.
    * @param iterator Compares each element in `list` to find the minimum value.
    * @param context `this` object in `iterator`, optional.
    * @return The minimum element within `list`.
    **/
  @JSName("min")
  def min_TT[T](list: List[T]): T = js.native
  /**
    * Allows you to extend Underscore with your own utility functions. Pass a hash of
    * {name: function} definitions to have your functions added to the Underscore object,
    * as well as the OOP wrapper.
    * @param object Mixin object containing key/function pairs to add to the Underscore object.
    **/
  def mixin(`object`: js.Any): scala.Unit = js.native
  /**
    * Returns a negated version of the pass-in predicate.
    * @param (...args: any[]) => boolean predicate
    * @return (...args: any[]) => boolean
    **/
  def negate(predicate: js.Function1[/* repeated */ js.Any, scala.Boolean]): js.Function1[/* repeated */ js.Any, scala.Boolean] = js.native
  /* *********
    * Utility *
    ********** */
  /**
    * Give control of the "_" variable back to its previous owner.
    * Returns a reference to the Underscore object.
    * @return Underscore object reference.
    **/
  def noConflict(): js.Any = js.native
  /**
    * Returns undefined irrespective of the arguments passed to it.  Useful as the default
    * for optional callback arguments.
    * Note there is no way to indicate a 'undefined' return, so it is currently typed as void.
    * @return undefined
    **/
  def noop(): scala.Unit = js.native
  /**
    * Returns an integer timestamp for the current time, using the fastest method available in the runtime. Useful for implementing timing/animation functions.
    **/
  def now(): scala.Double = js.native
  /**
    * Converts arrays into objects. Pass either a single list of [key, value] pairs, or a
    * list of keys, and a list of values.
    * @param keyValuePairs Array of [key, value] pairs.
    * @return An object containing the `keys` as properties and `values` as the property values.
    **/
  def `object`[TResult /* <: js.Object */](keyValuePairs: js.Array[_]*): TResult = js.native
  /**
    * Converts arrays into objects. Pass either a single list of [key, value] pairs, or a
    * list of keys, and a list of values.
    * @param keys Key array.
    * @param values Value array.
    * @return An object containing the `keys` as properties and `values` as the property values.
    **/
  def `object`[TResult /* <: js.Object */](keys: List[java.lang.String], values: List[_]): TResult = js.native
  /**
    * @see _.object
    **/
  def `object`[TResult /* <: js.Object */](list: List[_]): TResult = js.native
  def `object`[TResult /* <: js.Object */](list: List[_], values: js.Any): TResult = js.native
  /**
    * @see _.omit
    **/
  def omit(`object`: js.Any, iteratee: js.Function): js.Any = js.native
  /**
    * Return a copy of the object, filtered to omit the blacklisted keys (or array of keys).
    * @param object Object to strip unwanted key/value pairs.
    * @param keys The key/value pairs to remove on `object`.
    * @return Copy of `object` without the `keys` properties.
    **/
  def omit(`object`: js.Any, keys: java.lang.String*): js.Any = js.native
  /**
    * @see _.omit
    **/
  def omit(`object`: js.Any, keys: js.Array[java.lang.String]): js.Any = js.native
  /**
    * Creates a version of the function that can only be called one time. Repeated calls to the modified
    * function will have no effect, returning the value from the original call. Useful for initialization
    * functions, instead of having to set a boolean flag and then check it later.
    * @param fn Function to only execute once.
    * @return Copy of `fn` that can only be invoked once.
    **/
  def once[T /* <: js.Function */](fn: T): T = js.native
  /**
    * Convert an object into a list of [key, value] pairs.
    * @param object Convert this object to a list of [key, value] pairs.
    * @return List of [key, value] pairs on `object`.
    **/
  def pairs(`object`: js.Any): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  /**
    * Partially apply a function by filling in any number of its arguments, without changing its dynamic this value.
    * A close cousin of bind.  You may pass _ in your list of arguments to specify an argument that should not be
    * pre-filled, but left open to supply at call-time.
    * @param fn Function to partially fill in arguments.
    * @param arguments The partial arguments.
    * @return `fn` with partially filled in arguments.
    **/
  def partial[T1, T2](fn: underscoreLib.Fn_P1[T1, T2], p1: T1): underscoreLib.Fn_T2[T2] = js.native
  def partial[T1, T2, T3](fn: underscoreLib.Fn_P1P2[T1, T2, T3], p1: T1): underscoreLib.Fn_P2[T2, T3] = js.native
  def partial[T1, T2, T3](fn: underscoreLib.Fn_P1P2[T1, T2, T3], p1: T1, p2: T2): underscoreLib.Fn_T3[T3] = js.native
  def partial[T1, T2, T3](fn: underscoreLib.Fn_P1P2[T1, T2, T3], stub1: UnderscoreStatic, p2: T2): underscoreLib.Fn_P1T1[T1, T3] = js.native
  def partial[T1, T2, T3, T4](fn: underscoreLib.Fn_P1P2P3[T1, T2, T3, T4], p1: T1): underscoreLib.Fn_P2P3[T2, T3, T4] = js.native
  def partial[T1, T2, T3, T4](fn: underscoreLib.Fn_P1P2P3[T1, T2, T3, T4], p1: T1, p2: T2): underscoreLib.Fn_P3[T3, T4] = js.native
  def partial[T1, T2, T3, T4](fn: underscoreLib.Fn_P1P2P3[T1, T2, T3, T4], p1: T1, p2: T2, p3: T3): underscoreLib.Fn_T4[T4] = js.native
  def partial[T1, T2, T3, T4](fn: underscoreLib.Fn_P1P2P3[T1, T2, T3, T4], p1: T1, stub2: UnderscoreStatic, p3: T3): underscoreLib.Fn_P2T2[T2, T4] = js.native
  def partial[T1, T2, T3, T4](fn: underscoreLib.Fn_P1P2P3[T1, T2, T3, T4], stub1: UnderscoreStatic, p2: T2): underscoreLib.Fn_P1P3[T1, T3, T4] = js.native
  def partial[T1, T2, T3, T4](fn: underscoreLib.Fn_P1P2P3[T1, T2, T3, T4], stub1: UnderscoreStatic, p2: T2, p3: T3): underscoreLib.Fn_P1T1T4[T1, T4] = js.native
  def partial[T1, T2, T3, T4](
    fn: underscoreLib.Fn_P1P2P3[T1, T2, T3, T4],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3
  ): underscoreLib.Fn_P1P2T1[T1, T2, T4] = js.native
  def partial[T1, T2, T3, T4, T5](fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2], p1: T1): underscoreLib.Fn_P2P3P4[T2, T3, T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2], p1: T1, p2: T2): underscoreLib.Fn_P3P4[T3, T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2], p1: T1, p2: T2, p3: T3): underscoreLib.Fn_P4[T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2], p1: T1, p2: T2, p3: T3, p4: T4): underscoreLib.Fn_T5[T5] = js.native
  def partial[T1, T2, T3, T4, T5](fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2], p1: T1, p2: T2, stub3: UnderscoreStatic, p4: T4): underscoreLib.Fn_P3T3[T3, T5] = js.native
  def partial[T1, T2, T3, T4, T5](fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2], p1: T1, stub2: UnderscoreStatic, p3: T3): underscoreLib.Fn_P2P4[T2, T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2], p1: T1, stub2: UnderscoreStatic, p3: T3, p4: T4): underscoreLib.Fn_P2T2T5[T2, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P2P3T2[T2, T3, T5] = js.native
  def partial[T1, T2, T3, T4, T5](fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2], stub1: UnderscoreStatic, p2: T2): underscoreLib.Fn_P1P3P4[T1, T3, T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2], stub1: UnderscoreStatic, p2: T2, p3: T3): underscoreLib.Fn_P1P4[T1, T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2], stub1: UnderscoreStatic, p2: T2, p3: T3, p4: T4): underscoreLib.Fn_P1T1T5[T1, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P1P3T1[T1, T3, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3
  ): underscoreLib.Fn_P1P2P4[T1, T2, T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): underscoreLib.Fn_P1P2T1T2[T1, T2, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: underscoreLib.Fn_P1P2P3P4[T1, T3, T5, T4, T2],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P1P2P3T1[T1, T2, T3, T5] = js.native
  def partial[T1, T2, T3, T4, T5, T6](fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6], p1: T1): underscoreLib.Fn_P2P3P4P5[T3, T5, T4, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6], p1: T1, p2: T2): underscoreLib.Fn_P3P4P5[T3, T4, T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6], p1: T1, p2: T2, p3: T3): underscoreLib.Fn_P4P5[T4, T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6], p1: T1, p2: T2, p3: T3, p4: T4): underscoreLib.Fn_P5[T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6], p1: T1, p2: T2, p3: T3, p4: T4, p5: T5): underscoreLib.Fn_T6[T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P4T4[T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P3P5[T3, T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P3T3T6[T3, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P3P4T3[T3, T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6], p1: T1, stub2: UnderscoreStatic, p3: T3): underscoreLib.Fn_P2P4P5[T2, T4, T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): underscoreLib.Fn_P2P5[T2, T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P2T2T6[T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P2P4T2[T2, T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P2P3P5[T2, T3, T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P2P3T2T3[T2, T3, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P2P3P4T2[T2, T3, T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6], stub1: UnderscoreStatic, p2: T2): underscoreLib.Fn_P1P3P4P5[T1, T3, T5, T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6], stub1: UnderscoreStatic, p2: T2, p3: T3): underscoreLib.Fn_P1P4P5[T1, T4, T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4
  ): underscoreLib.Fn_P1P5[T1, T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P1T1T6[T1, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P1P4T1[T1, T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P1P3P5[T1, T3, T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P1P3T1T3[T1, T3, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P1P3P4T1[T1, T3, T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3
  ): underscoreLib.Fn_P1P2P4P5[T1, T5, T4, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): underscoreLib.Fn_P1P2P5[T1, T2, T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P1P2T1T2T6[T1, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P1P2P4T1[T1, T2, T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P1P2P3P5[T1, T3, T5, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P1P2P3T1T2[T1, T2, T3, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: underscoreLib.Fn_P1P2P3P4P5[T1, T3, T5, T4, T2, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P1P2P3P4T1[T1, T3, T4, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7], p1: T1): underscoreLib.Fn_P2P3P4P5P6[T3, T5, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7], p1: T1, p2: T2): underscoreLib.Fn_P3P4P5P6[T3, T5, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7], p1: T1, p2: T2, p3: T3): underscoreLib.Fn_P4P5P6[T4, T5, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7], p1: T1, p2: T2, p3: T3, p4: T4): underscoreLib.Fn_P5P6[T5, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P6[T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_T7[T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P5T5[T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P4P6[T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P4T4T7[T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P4P5T4[T4, T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P3P5P6[T3, T5, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P3P6[T3, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P3T3T7[T3, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P3P5T3[T3, T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P3P4P6[T3, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P3P4T3T4[T3, T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P3P4P5T3[T3, T4, T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3
  ): underscoreLib.Fn_P2P4P5P6[T5, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): underscoreLib.Fn_P2P5P6[T2, T5, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P2P6[T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P2T2T7[T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P2P5T2[T2, T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P2P4P6[T2, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P2P4T2T4[T2, T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P2P4P5T2[T2, T4, T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P2P3P5P6[T3, T5, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P2P3P6[T2, T3, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P2P3T2T3T7[T2, T3, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P2P3P5T2[T2, T3, T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P2P3P4P6[T3, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P2P3P4T2T3[T2, T3, T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P2P3P4P5T2[T3, T5, T4, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7], stub1: UnderscoreStatic, p2: T2): underscoreLib.Fn_P1P3P4P5P6[T1, T3, T5, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3
  ): underscoreLib.Fn_P1P4P5P6[T1, T5, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4
  ): underscoreLib.Fn_P1P5P6[T1, T5, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P1P6[T1, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1T1T7[T1, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P5T1[T1, T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P1P4P6[T1, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P4T1T4[T1, T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P4P5T1[T1, T4, T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P1P3P5P6[T1, T3, T5, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P1P3P6[T1, T3, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P3T1T3T7[T1, T3, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P3P5T1[T1, T3, T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P1P3P4P6[T1, T3, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P3P4T1T3[T1, T3, T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P3P4P5T1[T1, T3, T5, T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3
  ): underscoreLib.Fn_P1P2P4P5P6[T1, T5, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): underscoreLib.Fn_P1P2P5P6[T1, T5, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P1P2P6[T1, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P2T1T2T7[T1, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P2P5T1[T1, T2, T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P1P2P4P6[T1, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P2P4T1T2[T1, T2, T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P2P4P5T1[T1, T5, T4, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P1P2P3P5P6[T1, T3, T5, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P1P2P3P6[T1, T3, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P2P3T1T2T3[T1, T2, T3, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P2P3P5T1[T1, T3, T5, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P1P2P3P4P6[T1, T3, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P2P3P4T1T2[T1, T3, T4, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: underscoreLib.Fn_P1P2P3P4P5P6[T1, T3, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P2P3P4P5T1[T1, T3, T5, T4, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7], p1: T1): underscoreLib.Fn_P2P3P4P5P6P7[T3, T8, T5, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7], p1: T1, p2: T2): underscoreLib.Fn_P3P4P5P6P7[T3, T8, T5, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7], p1: T1, p2: T2, p3: T3): underscoreLib.Fn_P4P5P6P7[T8, T5, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4
  ): underscoreLib.Fn_P5P6P7[T5, T6, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P6P7[T6, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P7[T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_T8[T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P6T6[T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P5P7[T5, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P5T5T8[T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P5P6T5[T5, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P4P6P7[T4, T6, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P4P7[T4, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P4T4T8[T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P4P6T4[T4, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P4P5P7[T4, T5, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P4P5T4T5[T4, T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P4P5P6T4[T4, T5, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P3P5P6P7[T3, T8, T5, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P3P6P7[T3, T6, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P3P7[T3, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P3T3T8[T3, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P3P6T3[T3, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P3P5P7[T3, T5, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P3P5T3T5[T3, T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P3P5P6T3[T3, T5, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P3P4P6P7[T3, T8, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P3P4P7[T3, T4, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P3P4T3T4T8[T3, T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P3P4P6T3[T3, T4, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P3P4P5P7[T3, T8, T5, T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P3P4P5T3T4[T3, T4, T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P3P4P5P6T3[T3, T8, T5, T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3
  ): underscoreLib.Fn_P2P4P5P6P7[T8, T5, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): underscoreLib.Fn_P2P5P6P7[T8, T5, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P2P6P7[T2, T6, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P2P7[T2, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P2T2T8[T2, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P2P6T2[T2, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P2P5P7[T2, T5, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P2P5T2T5[T2, T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P2P5P6T2[T2, T5, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P2P4P6P7[T8, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P2P4P7[T2, T4, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P2P4T2T4T8[T2, T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P2P4P6T2[T2, T4, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P2P4P5P7[T8, T5, T4, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P2P4P5T2T4[T2, T4, T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P2P4P5P6T2[T8, T5, T4, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P2P3P5P6P7[T3, T8, T5, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P2P3P6P7[T3, T8, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P2P3P7[T2, T3, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P2P3T2T3T8[T2, T3, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P2P3P6T2[T2, T3, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P2P3P5P7[T3, T8, T5, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P2P3P5T2T3[T2, T3, T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P2P3P5P6T2[T3, T8, T5, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P2P3P4P6P7[T3, T8, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P2P3P4P7[T3, T8, T4, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P2P3P4T2T3T4[T2, T3, T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P2P3P4P6T2[T3, T8, T4, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P2P3P4P5P7[T3, T8, T5, T4, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P2P3P4P5T2T3[T3, T8, T5, T4, T2] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P2P3P4P5P6T2[T3, T8, T5, T4, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2
  ): underscoreLib.Fn_P1P3P4P5P6P7[T1, T3, T8, T5, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3
  ): underscoreLib.Fn_P1P4P5P6P7[T1, T8, T5, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4
  ): underscoreLib.Fn_P1P5P6P7[T1, T8, T5, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P1P6P7[T1, T6, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P7[T1, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1T1T8[T1, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P6T1[T1, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P5P7[T1, T5, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P5T1T5[T1, T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P5P6T1[T1, T5, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P1P4P6P7[T1, T8, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P4P7[T1, T4, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P4T1T4T8[T1, T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P4P6T1[T1, T4, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P4P5P7[T1, T8, T5, T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P4P5T1T4[T1, T4, T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P4P5P6T1[T1, T8, T5, T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P1P3P5P6P7[T1, T3, T8, T5, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P1P3P6P7[T1, T3, T8, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P3P7[T1, T3, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P3T1T3T8[T1, T3, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P3P6T1[T1, T3, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P3P5P7[T1, T3, T8, T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P3P5T1T3[T1, T3, T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P3P5P6T1[T1, T3, T8, T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P1P3P4P6P7[T1, T3, T8, T4, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P3P4P7[T1, T3, T8, T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P3P4T1T3T4[T1, T3, T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P3P4P6T1[T1, T3, T8, T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P3P4P5P7[T1, T3, T8, T5, T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P3P4P5T1T3[T1, T3, T8, T5, T4] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P3P4P5P6T1[T1, T3, T8, T5, T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3
  ): underscoreLib.Fn_P1P2P4P5P6P7[T1, T8, T5, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): underscoreLib.Fn_P1P2P5P6P7[T1, T8, T5, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P1P2P6P7[T1, T8, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P2P7[T1, T2, T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P2T1T2T8[T1, T2, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P2P6T1[T1, T2, T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P2P5P7[T1, T8, T5, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P2P5T1T2[T1, T2, T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P2P5P6T1[T1, T8, T5, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P1P2P4P6P7[T1, T8, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P2P4P7[T1, T8, T4, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P2P4T1T2T4[T1, T2, T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P2P4P6T1[T1, T8, T4, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P2P4P5P7[T1, T8, T5, T4, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P2P4P5T1T2[T1, T8, T5, T4, T2] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P2P4P5P6T1[T1, T8, T5, T4, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): underscoreLib.Fn_P1P2P3P5P6P7[T1, T3, T8, T5, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): underscoreLib.Fn_P1P2P3P6P7[T1, T3, T8, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P2P3P7[T1, T3, T8, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P2P3T1T2T3T8[T1, T2, T3, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P2P3P6T1[T1, T3, T8, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P2P3P5P7[T1, T3, T8, T5, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P2P3P5T1T2[T1, T3, T8, T5, T2] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P2P3P5P6T1[T1, T3, T8, T5, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): underscoreLib.Fn_P1P2P3P4P6P7[T1, T3, T8, T4, T2, T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): underscoreLib.Fn_P1P2P3P4P7[T1, T3, T8, T4, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P2P3P4T1T2T3[T1, T3, T8, T4, T2] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P2P3P4P6T1[T1, T3, T8, T4, T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): underscoreLib.Fn_P1P2P3P4P5P7[T1, T3, T8, T5, T4, T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): underscoreLib.Fn_P1P2P3P4P5T1T2[T1, T3, T8, T5, T4, T2] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: underscoreLib.Fn_P1P2P3P4P5P6P7[T1, T3, T8, T5, T4, T2, T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): underscoreLib.Fn_P1P2P3P4P5P6T1[T1, T3, T8, T5, T4, T2, T6] = js.native
  /**
    * Split array into two arrays:
    * one whose elements all satisfy predicate and one whose elements all do not satisfy predicate.
    * @param array Array to split in two.
    * @param iterator Filter iterator function for each element in `array`.
    * @param context `this` object in `iterator`, optional.
    * @return Array where Array[0] are the elements in `array` that satisfies the predicate, and Array[1] the elements that did not.
    **/
  def partition[T](array: js.Array[T], iterator: ListIterator[T, scala.Boolean]): js.Array[js.Array[T]] = js.native
  def partition[T](array: js.Array[T], iterator: ListIterator[T, scala.Boolean], context: js.Any): js.Array[js.Array[T]] = js.native
  /**
    * @see _.pick
    **/
  def pick(`object`: js.Any, fn: js.Function3[/* value */ js.Any, /* key */ js.Any, /* object */ js.Any, _]): js.Any = js.native
  /**
    * Return a copy of the object, filtered to only have values for the whitelisted keys
    * (or array of valid keys).
    * @param object Object to strip unwanted key/value pairs.
    * @keys The key/value pairs to keep on `object`.
    * @return Copy of `object` with only the `keys` properties.
    **/
  def pick(`object`: js.Any, keys: js.Any*): js.Any = js.native
  def pluck(list: List[_], propertyName: java.lang.String): js.Array[_] = js.native
  /**
    * A convenient version of what is perhaps the most common use-case for map: extracting a list of
    * property values.
    * @param list The list to pluck elements out of that have the property `propertyName`.
    * @param propertyName The property to look for on each element within `list`.
    * @return The list of elements within `list` that have the property `propertyName`.
    **/
  def pluck[T /* <: js.Object */, K /* <: java.lang.String */](list: List[T], propertyName: K): js.Array[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any] = js.native
  /**
    * Returns a function that will itself return the key property of any passed-in object.
    * @param key Property of the object.
    * @return Function which accept an object an returns the value of key in that object.
    **/
  def property(key: java.lang.String): js.Function1[/* object */ js.Object, _] = js.native
  def property(key: js.Array[java.lang.String]): js.Function1[/* object */ js.Object, _] = js.native
  /**
    * Returns a function that will itself return the value of a object key property.
    * @param key The object to get the property value from.
    * @return Function which accept a key property in `object` and returns its value.
    **/
  def propertyOf(`object`: js.Object): js.Function1[/* key */ java.lang.String | js.Array[java.lang.String], _] = js.native
  /**
    * Returns a random integer between min and max, inclusive. If you only pass one argument,
    * it will return a number between 0 and that number.
    * @param max The maximum random number.
    * @return A random number between 0 and `max`.
    **/
  def random(max: scala.Double): scala.Double = js.native
  /**
    * @see _.random
    * @param min The minimum random number.
    * @return A random number between `min` and `max`.
    **/
  def random(min: scala.Double, max: scala.Double): scala.Double = js.native
  /**
    * A function to create flexibly-numbered lists of integers, handy for each and map loops. start, if omitted,
    * defaults to 0; step defaults to 1. Returns a list of integers from start to stop, incremented (or decremented)
    * by step, exclusive.
    * @param start Start here.
    * @param stop Stop here.
    * @param step The number to count up by each iteration, optional, default = 1.
    * @return Array of numbers from `start` to `stop` with increments of `step`.
    **/
  def range(start: scala.Double, stop: scala.Double): js.Array[scala.Double] = js.native
  def range(start: scala.Double, stop: scala.Double, step: scala.Double): js.Array[scala.Double] = js.native
  /**
    * @see _.range
    * @param stop Stop here.
    * @return Array of numbers from 0 to `stop` with increments of 1.
    * @note If start is not specified the implementation will never pull the step (step = arguments[2] || 0)
    **/
  def range(stop: scala.Double): js.Array[scala.Double] = js.native
  def reduce[T, TResult](list: Dictionary[T], iterator: MemoObjectIterator[T, TResult]): TResult = js.native
  def reduce[T, TResult](list: Dictionary[T], iterator: MemoObjectIterator[T, TResult], memo: TResult): TResult = js.native
  def reduce[T, TResult](list: Dictionary[T], iterator: MemoObjectIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
    * Also known as inject and foldl, reduce boils down a list of values into a single value.
    * Memo is the initial state of the reduction, and each successive step of it should be
    * returned by iterator. The iterator is passed four arguments: the memo, then the value
    * and index (or key) of the iteration, and finally a reference to the entire list.
    * @param list Reduces the elements of this array.
    * @param iterator Reduce iterator function for each element in `list`.
    * @param memo Initial reduce state.
    * @param context `this` object in `iterator`, optional.
    * @return Reduced object result.
    **/
  def reduce[T, TResult](list: List[T], iterator: MemoIterator[T, TResult]): TResult = js.native
  def reduce[T, TResult](list: List[T], iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def reduce[T, TResult](list: List[T], iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
    * The right-associative version of reduce. Delegates to the JavaScript 1.8 version of
    * reduceRight, if it exists. `foldr` is not as useful in JavaScript as it would be in a
    * language with lazy evaluation.
    * @param list Reduces the elements of this array.
    * @param iterator Reduce iterator function for each element in `list`.
    * @param memo Initial reduce state.
    * @param context `this` object in `iterator`, optional.
    * @return Reduced object result.
    **/
  def reduceRight[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult]): TResult = js.native
  def reduceRight[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def reduceRight[T, TResult](list: Collection[T], iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
    * Returns the values in list without the elements that the truth test (iterator) passes.
    * The opposite of filter.
    * Return all the elements for which a truth test fails.
    * @param list Reject elements within this list.
    * @param iterator Reject iterator function for each element in `list`.
    * @param context `this` object in `iterator`, optional.
    * @return The rejected list of elements.
    **/
  def reject[T](list: List[T], iterator: ListIterator[T, scala.Boolean]): js.Array[T] = js.native
  def reject[T](list: List[T], iterator: ListIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  /**
    * @see _.reject
    **/
  def reject[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean]): js.Array[T] = js.native
  def reject[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  /**
    * Returns the rest of the elements in an array. Pass an index to return the values of the array
    * from that index onward.
    * @param array The array to retrieve all but the first `index` elements.
    * @param n The index to start retrieving elements forward from, optional, default = 1.
    * @return Returns the elements of `array` from `index` to the end of `array`.
    **/
  def rest[T](array: List[T]): js.Array[T] = js.native
  def rest[T](array: List[T], n: scala.Double): js.Array[T] = js.native
  /**
    * Similar to ES6's rest param (http://ariya.ofilabs.com/2013/03/es6-and-rest-parameter.html)
    * This accumulates the arguments passed into an array, after a given index.
    **/
  def restArgs(func: js.Function): js.Function = js.native
  def restArgs(func: js.Function, starIndex: scala.Double): js.Function = js.native
  /**
    * If the value of the named property is a function then invoke it; otherwise, return it.
    * @param object Object to maybe invoke function `property` on.
    * @param property The function by name to invoke on `object`.
    * @param defaultValue The value to be returned in case `property` doesn't exist or is undefined.
    * @return The result of invoking the function `property` on `object.
    **/
  def result(`object`: js.Any, property: java.lang.String): js.Any = js.native
  def result(`object`: js.Any, property: java.lang.String, defaultValue: js.Any): js.Any = js.native
  /**
    * @see _.sample
    **/
  def sample[T](list: Collection[T]): T = js.native
  /**
    * Produce a random sample from the `list`.  Pass a number to return `n` random elements from the list.  Otherwise a single random item will be returned.
    * @param list List to sample.
    * @return Random sample of `n` elements in `list`.
    **/
  def sample[T](list: Collection[T], n: scala.Double): js.Array[T] = js.native
  /**
    * @see _.filter
    **/
  def select[T](list: List[T], iterator: ListIterator[T, scala.Boolean]): js.Array[T] = js.native
  def select[T](list: List[T], iterator: ListIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  /**
    * @see _.filter
    **/
  def select[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean]): js.Array[T] = js.native
  def select[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  /**
    * Returns a shuffled copy of the list, using a version of the Fisher-Yates shuffle.
    * @param list List to shuffle.
    * @return Shuffled copy of `list`.
    **/
  def shuffle[T](list: Collection[T]): js.Array[T] = js.native
  /**
    * Return the number of values in the list.
    * @param list Count the number of values/elements in this list.
    * @return Number of values in `list`.
    **/
  def size[T](list: Collection[T]): scala.Double = js.native
  /**
    * Returns true if any of the values in the list pass the iterator truth test. Short-circuits and
    * stops traversing the list if a true element is found. Delegates to the native method some, if present.
    * @param list Truth test against all elements within this list.
    * @param iterator Trust test iterator function for each element in `list`.
    * @param context `this` object in `iterator`, optional.
    * @return True if any elements passed the truth test, otherwise false.
    **/
  def some[T](list: List[T]): scala.Boolean = js.native
  def some[T](list: List[T], iterator: ListIterator[T, scala.Boolean]): scala.Boolean = js.native
  def some[T](list: List[T], iterator: ListIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  /**
    * @see _.some
    **/
  def some[T](`object`: Dictionary[T]): scala.Boolean = js.native
  def some[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean]): scala.Boolean = js.native
  def some[T](`object`: Dictionary[T], iterator: ObjectIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  /**
    * @see _.sortBy
    * @param iterator Sort iterator for each element within `list`.
    **/
  def sortBy[T](list: List[T], iterator: java.lang.String): js.Array[T] = js.native
  def sortBy[T](list: List[T], iterator: java.lang.String, context: js.Any): js.Array[T] = js.native
  /**
    * Returns a sorted copy of list, ranked in ascending order by the results of running each value
    * through iterator. Iterator may also be the string name of the property to sort by (eg. length).
    * @param list Sorts this list.
    * @param iterator Sort iterator for each element within `list`.
    * @param context `this` object in `iterator`, optional.
    * @return A sorted copy of `list`.
    **/
  def sortBy[T, TSort](list: List[T]): js.Array[T] = js.native
  def sortBy[T, TSort](list: List[T], iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def sortBy[T, TSort](list: List[T], iterator: ListIterator[T, TSort], context: js.Any): js.Array[T] = js.native
  /**
    * Uses a binary search to determine the index at which the value should be inserted into the list in order
    * to maintain the list's sorted order. If an iterator is passed, it will be used to compute the sort ranking
    * of each value, including the value you pass.
    * @param list The sorted list.
    * @param value The value to determine its index within `list`.
    * @param iterator Iterator to compute the sort ranking of each value, optional.
    * @param context `this` object in `iterator`, optional.
    * @return The index where `value` should be inserted into `list`.
    **/
  def sortedIndex[T, TSort](list: List[T], value: T): scala.Double = js.native
  def sortedIndex[T, TSort](list: List[T], value: T, iterator: java.lang.String): scala.Double = js.native
  def sortedIndex[T, TSort](list: List[T], value: T, iterator: java.lang.String, context: js.Any): scala.Double = js.native
  def sortedIndex[T, TSort](list: List[T], value: T, iterator: js.Function1[/* x */ T, TSort]): scala.Double = js.native
  def sortedIndex[T, TSort](list: List[T], value: T, iterator: js.Function1[/* x */ T, TSort], context: js.Any): scala.Double = js.native
  /**
    * @see _.rest
    **/
  def tail[T](array: List[T]): js.Array[T] = js.native
  def tail[T](array: List[T], n: scala.Double): js.Array[T] = js.native
  /**
    * @see _.first
    **/
  def take[T](array: List[T]): T = js.native
  /**
    * @see _.first
    **/
  def take[T](array: List[T], n: scala.Double): js.Array[T] = js.native
  /**
    * Invokes interceptor with the object, and then returns object. The primary purpose of this method
    * is to "tap into" a method chain, in order to perform operations on intermediate results within the chain.
    * @param object Argument to `interceptor`.
    * @param intercepter The function to modify `object` before continuing the method chain.
    * @return Modified `object`.
    **/
  def tap[T](`object`: T, intercepter: js.Function): T = js.native
  /**
    * Compiles JavaScript templates into functions that can be evaluated for rendering. Useful
    * for rendering complicated bits of HTML from JSON data sources. Template functions can both
    * interpolate variables, using <%= ... %>, as well as execute arbitrary JavaScript code, with
    * <% ... %>. If you wish to interpolate a value, and have it be HTML-escaped, use <%- ... %> When
    * you evaluate a template function, pass in a data object that has properties corresponding to
    * the template's free variables. If you're writing a one-off, you can pass the data object as
    * the second parameter to template in order to render immediately instead of returning a template
    * function. The settings argument should be a hash containing any _.templateSettings that should
    * be overridden.
    * @param templateString Underscore HTML template.
    * @param data Data to use when compiling `templateString`.
    * @param settings Settings to use while compiling.
    * @return Returns the compiled Underscore HTML template.
    **/
  def template(templateString: java.lang.String): js.Function1[/* repeated */ js.Any, java.lang.String] = js.native
  def template(templateString: java.lang.String, settings: TemplateSettings): js.Function1[/* repeated */ js.Any, java.lang.String] = js.native
  /**
    * Creates and returns a new, throttled version of the passed function, that, when invoked repeatedly,
    * will only actually call the original function at most once per every wait milliseconds. Useful for
    * rate-limiting events that occur faster than you can keep up with.
    * By default, throttle will execute the function as soon as you call it for the first time, and,
    * if you call it again any number of times during the wait period, as soon as that period is over.
    * If you'd like to disable the leading-edge call, pass {leading: false}, and if you'd like to disable
    * the execution on the trailing-edge, pass {trailing: false}.
    * @param func Function to throttle `waitMS` ms.
    * @param wait The number of milliseconds to wait before `fn` can be invoked again.
    * @param options Allows for disabling execution of the throttled function on either the leading or trailing edge.
    * @return `fn` with a throttle of `wait`.
    **/
  def throttle[T /* <: js.Function */](func: T, wait: scala.Double): T with Cancelable = js.native
  def throttle[T /* <: js.Function */](func: T, wait: scala.Double, options: ThrottleSettings): T with Cancelable = js.native
  /**
    * Invokes the given iterator function n times.
    * Each invocation of iterator is called with an index argument
    * @param n Number of times to invoke `iterator`.
    * @param iterator Function iterator to invoke `n` times.
    * @param context `this` object in `iterator`, optional.
    **/
  def times[TResult](n: scala.Double, iterator: js.Function1[/* n */ scala.Double, TResult]): js.Array[TResult] = js.native
  def times[TResult](n: scala.Double, iterator: js.Function1[/* n */ scala.Double, TResult], context: js.Any): js.Array[TResult] = js.native
  /**
    * Converts the list (anything that can be iterated over), into a real Array. Useful for transmuting
    * the arguments object.
    * @param list object to transform into an array.
    * @return `list` as an array.
    **/
  def toArray[T](list: Collection[T]): js.Array[T] = js.native
  /**
    * The opposite of escape, replaces &amp;, &lt;, &gt;, &quot;, and &#x27; with their unescaped counterparts.
    * @param str HTML escaped string.
    * @return `str` Raw string.
    **/
  def unescape(str: java.lang.String): java.lang.String = js.native
  /**
    * Computes the union of the passed-in arrays: the list of unique items, in order, that are
    * present in one or more of the arrays.
    * @param arrays Array of arrays to compute the union of.
    * @return The union of elements within `arrays`.
    **/
  def union[T](arrays: List[T]*): js.Array[T] = js.native
  /**
    * Produces a duplicate-free version of the array, using === to test object equality. If you know in
    * advance that the array is sorted, passing true for isSorted will run a much faster algorithm. If
    * you want to compute unique items based on a transformation, pass an iterator function.
    * @param array Array to remove duplicates from.
    * @param isSorted True if `array` is already sorted, optional, default = false.
    * @param iterator Transform the elements of `array` before comparisons for uniqueness.
    * @param context 'this' object in `iterator`, optional.
    * @return Copy of `array` where all elements are unique.
    **/
  def uniq[T, TSort](array: List[T]): js.Array[T] = js.native
  def uniq[T, TSort](array: List[T], isSorted: scala.Boolean): js.Array[T] = js.native
  def uniq[T, TSort](array: List[T], isSorted: scala.Boolean, iterator: IterateePropertyShorthand): js.Array[T] = js.native
  def uniq[T, TSort](array: List[T], isSorted: scala.Boolean, iterator: IterateePropertyShorthand, context: js.Any): js.Array[T] = js.native
  def uniq[T, TSort](array: List[T], isSorted: scala.Boolean, iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def uniq[T, TSort](array: List[T], isSorted: scala.Boolean, iterator: ListIterator[T, TSort], context: js.Any): js.Array[T] = js.native
  def uniq[T, TSort](array: List[T], iterator: IterateePropertyShorthand): js.Array[T] = js.native
  def uniq[T, TSort](array: List[T], iterator: IterateePropertyShorthand, context: js.Any): js.Array[T] = js.native
  def uniq[T, TSort](array: List[T], iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def uniq[T, TSort](array: List[T], iterator: ListIterator[T, TSort], context: js.Any): js.Array[T] = js.native
  /**
    * @see _.uniq
    **/
  def unique[T, TSort](array: List[T]): js.Array[T] = js.native
  def unique[T, TSort](array: List[T], isSorted: scala.Boolean): js.Array[T] = js.native
  def unique[T, TSort](array: List[T], isSorted: scala.Boolean, iterator: IterateePropertyShorthand): js.Array[T] = js.native
  def unique[T, TSort](array: List[T], isSorted: scala.Boolean, iterator: IterateePropertyShorthand, context: js.Any): js.Array[T] = js.native
  def unique[T, TSort](array: List[T], isSorted: scala.Boolean, iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def unique[T, TSort](array: List[T], isSorted: scala.Boolean, iterator: ListIterator[T, TSort], context: js.Any): js.Array[T] = js.native
  def unique[T, TSort](array: List[T], iterator: IterateePropertyShorthand): js.Array[T] = js.native
  def unique[T, TSort](array: List[T], iterator: IterateePropertyShorthand, context: js.Any): js.Array[T] = js.native
  def unique[T, TSort](array: List[T], iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def unique[T, TSort](array: List[T], iterator: ListIterator[T, TSort], context: js.Any): js.Array[T] = js.native
  /**
    * Generate a globally-unique id for client-side models or DOM elements that need one.
    * If prefix is passed, the id will be appended to it. Without prefix, returns an integer.
    * @param prefix A prefix string to start the unique ID with.
    * @return Unique string ID beginning with `prefix`.
    **/
  def uniqueId(): java.lang.String = js.native
  def uniqueId(prefix: java.lang.String): java.lang.String = js.native
  /**
    * The opposite of zip. Given a number of arrays, returns a series of new arrays, the first
    * of which contains all of the first elements in the input arrays, the second of which
    * contains all of the second elements, and so on. Use with apply to pass in an array
    * of arrays
    * @param arrays The arrays to unzip.
    * @return Unzipped version of `arrays`.
    **/
  def unzip(arrays: js.Array[_]*): js.Array[js.Array[_]] = js.native
  /**
    * Return all of the values of the object's properties.
    * @param object Retrieve the values of all the properties on this object.
    * @return List of all the values on `object`.
    **/
  def values(`object`: js.Any): js.Array[_] = js.native
  /**
    * Return all of the values of the object's properties.
    * @param object Retrieve the values of all the properties on this object.
    * @return List of all the values on `object`.
    **/
  def values[T](`object`: Dictionary[T]): js.Array[T] = js.native
  /**
    * Looks through each value in the list, returning an array of all the values that contain all
    * of the key-value pairs listed in properties.
    * @param list List to match elements again `properties`.
    * @param properties The properties to check for on each element within `list`.
    * @return The elements within `list` that contain the required `properties`.
    **/
  def where[T, U /* <: js.Object */](list: List[T], properties: U): js.Array[T] = js.native
  /**
    * Returns a copy of the array with all instances of the values removed.
    * @param array The array to remove `values` from.
    * @param values The values to remove from `array`.
    * @return Copy of `array` without `values`.
    **/
  def without[T](array: List[T], values: T*): js.Array[T] = js.native
  /**
    * Wraps the first function inside of the wrapper function, passing it as the first argument. This allows
    * the wrapper to execute code before and after the function runs, adjust the arguments, and execute it
    * conditionally.
    * @param fn Function to wrap.
    * @param wrapper The function that will wrap `fn`.
    * @return Wrapped version of `fn.
    **/
  def wrap(fn: js.Function, wrapper: js.Function2[/* fn */ js.Function, /* repeated */ js.Any, _]): js.Function = js.native
  /**
    * Merges together the values of each of the arrays with the values at the corresponding position.
    * Useful when you have separate data sources that are coordinated through matching array indexes.
    * If you're working with a matrix of nested arrays, zip.apply can transpose the matrix in a similar fashion.
    * @param arrays The arrays to merge/zip.
    * @return Zipped version of `arrays`.
    **/
  /**
    * @see _.zip
    **/
  def zip(arrays: (js.Any | js.Array[_])*): js.Array[js.Array[_]] = js.native
}

