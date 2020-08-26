package typings.underscore.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import typings.std.Pick
import typings.underscore.anon.FnCall
import typings.underscore.anon.FnCallCollectionIterateeMemoContext
import typings.underscore.anon.FnCallListIsSortedIterateeContext
import typings.underscore.anon.FnCallListN
import typings.underscore.underscoreBooleans.`false`
import typings.underscore.underscoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnderscoreStatic extends js.Object {
  /**
    * Current version
    */
  val VERSION: String = js.native
  /**
    * @see every
    **/
  @JSName("all")
  var all_Original: js.Function3[
    /* collection */ Collection[_], 
    /* iteratee */ js.UndefOr[Iteratee[Collection[_], Boolean, TypeOfCollection[Collection[_]]]], 
    /* context */ js.UndefOr[js.Any], 
    Boolean
  ] = js.native
  /**
    * @see some
    **/
  @JSName("any")
  var any_Original: js.Function3[
    /* collection */ Collection[_], 
    /* iteratee */ js.UndefOr[Iteratee[Collection[_], Boolean, TypeOfCollection[Collection[_]]]], 
    /* context */ js.UndefOr[js.Any], 
    Boolean
  ] = js.native
  /**
    * @see map
    **/
  @JSName("collect")
  var collect_Original: FnCall = js.native
  /**
    * @see find
    **/
  @JSName("detect")
  var detect_Original: js.Function3[
    /* collection */ Collection[_], 
    /* iteratee */ js.UndefOr[Iteratee[Collection[_], Boolean, TypeOfCollection[Collection[_]]]], 
    /* context */ js.UndefOr[js.Any], 
    js.UndefOr[TypeOfCollection[Collection[_]]]
  ] = js.native
  /**
    * @see rest
    **/
  @JSName("drop")
  var drop_Original: js.Function2[/* list */ List[_], /* index */ js.UndefOr[Double], js.Array[TypeOfList[List[_]]]] = js.native
  /**
    * @see reduce
    **/
  @JSName("foldl")
  var foldl_Original: FnCallCollectionIterateeMemoContext = js.native
  /**
    * @see reduceRight
    **/
  @JSName("foldr")
  var foldr_Original: FnCallCollectionIterateeMemoContext = js.native
  /**
    * @see each
    **/
  @JSName("forEach")
  var forEach_Original: js.Function3[
    /* collection */ Collection[_], 
    /* iteratee */ CollectionIterator[TypeOfCollection[Collection[_]], Unit, Collection[_]], 
    /* context */ js.UndefOr[js.Any], 
    Collection[_]
  ] = js.native
  /**
    * @see first
    **/
  @JSName("head")
  var head_Original: FnCallListN = js.native
  /**
    * @see contains
    **/
  @JSName("include")
  var include_Original: js.Function3[
    /* collection */ Collection[_], 
    /* value */ js.Any, 
    /* fromIndex */ js.UndefOr[Double], 
    Boolean
  ] = js.native
  /**
    * @see contains
    **/
  @JSName("includes")
  var includes_Original: js.Function3[
    /* collection */ Collection[_], 
    /* value */ js.Any, 
    /* fromIndex */ js.UndefOr[Double], 
    Boolean
  ] = js.native
  /**
    * @see reduce
    **/
  @JSName("inject")
  var inject_Original: FnCallCollectionIterateeMemoContext = js.native
  /**
    * @see filter
    **/
  @JSName("select")
  var select_Original: js.Function3[
    /* collection */ Collection[_], 
    /* iteratee */ js.UndefOr[Iteratee[Collection[_], Boolean, TypeOfCollection[Collection[_]]]], 
    /* context */ js.UndefOr[js.Any], 
    js.Array[TypeOfCollection[Collection[_]]]
  ] = js.native
  /**
    * @see rest
    **/
  @JSName("tail")
  var tail_Original: js.Function2[/* list */ List[_], /* index */ js.UndefOr[Double], js.Array[TypeOfList[List[_]]]] = js.native
  /**
    * @see first
    **/
  @JSName("take")
  var take_Original: FnCallListN = js.native
  /**
    * By default, Underscore uses ERB-style template delimiters, change the
    * following template settings to use alternative delimiters.
    **/
  var templateSettings: TemplateSettings = js.native
  /**
    * @see uniq
    **/
  @JSName("unique")
  var unique_Original: FnCallListIsSortedIterateeContext = js.native
  /**
    * Underscore OOP Wrapper, all Underscore functions that take an object
    * as the first parameter can be invoked through this function.
    * @param value First argument to Underscore object functions.
    * @returns An Underscore wrapper around the supplied value.
    **/
  def apply[V](value: V): Underscore[TypeOfCollection[V], V] = js.native
  /**
    * Creates a version of the function that will only be run after first being called count times. Useful
    * for grouping asynchronous responses, where you want to be sure that all the async calls have finished,
    * before proceeding.
    * @param number count Number of times to be called before actually executing.
    * @param Function fn The function to defer execution `count` times.
    * @return Copy of `fn` that will not execute until it is invoked `count` times.
    **/
  def after(count: Double, fn: js.Function): js.Function = js.native
  /**
    * @see every
    **/
  def all[V /* <: Collection[_] */](collection: V): Boolean = js.native
  def all[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V]]], context: js.Any): Boolean = js.native
  def all[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V]]): Boolean = js.native
  /**
    * Retrieve all the names of object's own and inherited properties.
    * @param object Retrieve the key or property names from this object.
    * @return List of all the property names on `object`.
    **/
  def allKeys(`object`: js.Any): js.Array[String] = js.native
  /**
    * @see some
    **/
  def any[V /* <: Collection[_] */](collection: V): Boolean = js.native
  def any[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V]]], context: js.Any): Boolean = js.native
  def any[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V]]): Boolean = js.native
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
  def before(count: Double, fn: js.Function): js.Function = js.native
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
  def bindAll(`object`: js.Any, methodNames: String*): js.Any = js.native
  /* **********
    * Chaining *
    *********** */
  /**
    * Returns a wrapped object. Calling methods on this object will continue to return wrapped objects
    * until value() is used.
    * @param value The object to chain.
    * @returns An underscore chain wrapper around the supplied value.
    **/
  def chain[V](value: V): Chain[TypeOfCollection[V], V] = js.native
  /**
    * Chunks a list into multiple arrays, each containing length or fewer items.
    * @param list The list to split.
    * @param length The maximum size of the inner arrays.
    * @returns The chunked list.
    **/
  def chunk[V /* <: List[_] */](list: V, length: Double): js.Array[js.Array[TypeOfList[V]]] = js.native
  /**
    * Create a shallow-copied clone of the object.
    * Any nested objects or arrays will be copied by reference, not duplicated.
    * @param object Object to clone.
    * @return Copy of `object`.
    **/
  def clone[T](`object`: T): T = js.native
  /**
    * @see map
    **/
  def collect[V /* <: Collection[_] */](collection: V): js.Array[IterateeResult[Null, TypeOfCollection[V]]] = js.native
  def collect[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[scala.Nothing], context: js.Any): js.Array[IterateeResult[js.UndefOr[scala.Nothing], TypeOfCollection[V]]] = js.native
  /**
    * @see map
    **/
  def collect[V /* <: Collection[_] */](collection: V, iteratee: String): js.Array[IterateeResult[String, TypeOfCollection[V]]] = js.native
  def collect[V /* <: Collection[_] */](collection: V, iteratee: String, context: js.Any): js.Array[IterateeResult[String, TypeOfCollection[V]]] = js.native
  /**
    * @see map
    **/
  def collect[V /* <: Collection[_] */](collection: V, iteratee: js.Array[EnumerableKey]): js.Array[IterateeResult[js.Array[EnumerableKey], TypeOfCollection[V]]] = js.native
  def collect[V /* <: Collection[_] */](collection: V, iteratee: js.Array[EnumerableKey], context: js.Any): js.Array[IterateeResult[js.Array[EnumerableKey], TypeOfCollection[V]]] = js.native
  /**
    * @see map
    **/
  def collect[V /* <: Collection[_] */](collection: V, iteratee: Double): js.Array[IterateeResult[Double, TypeOfCollection[V]]] = js.native
  def collect[V /* <: Collection[_] */](collection: V, iteratee: Double, context: js.Any): js.Array[IterateeResult[Double, TypeOfCollection[V]]] = js.native
  def collect[V /* <: Collection[_] */](collection: V, iteratee: Null, context: js.Any): js.Array[IterateeResult[Null, TypeOfCollection[V]]] = js.native
  /**
    * @see map
    **/
  def collect[V /* <: Collection[_] */, I /* <: (CollectionIterator[TypeOfCollection[V], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V> ]:? underscore.underscore.TypeOfCollection<V>[P]}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[TypeOfCollection[V]]) */](collection: V, iteratee: I): js.Array[IterateeResult[I, TypeOfCollection[V]]] = js.native
  def collect[V /* <: Collection[_] */, I /* <: (CollectionIterator[TypeOfCollection[V], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V> ]:? underscore.underscore.TypeOfCollection<V>[P]}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[TypeOfCollection[V]]) */](collection: V, iteratee: I, context: js.Any): js.Array[IterateeResult[I, TypeOfCollection[V]]] = js.native
  /**
    * Returns a copy of `list` with all falsy values removed. In
    * JavaScript, false, null, 0, "", undefined and NaN are all falsy.
    * @param list The list to compact.
    * @returns An array containing the elements of `list` without falsy
    * values.
    **/
  def compact[V /* <: js.UndefOr[List[_] | Null] */](list: V): js.Array[Truthy[TypeOfList[V]]] = js.native
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
    * Returns true if the value is present in `collection`. Uses indexOf
    * internally, if `collection` is a List. Use `fromIndex` to start your
    * search at a given index.
    * @param collection The collection to check for `value`.
    * @param value The value to check `collection` for.
    * @param fromIndex The index to start searching from, optional,
    * default = 0, only used when `collection` is a List.
    * @returns True if `value` is present in `collection` after
    * `fromIndex`, otherwise false.
    **/
  def contains[V /* <: Collection[_] */](collection: V, value: js.Any): Boolean = js.native
  def contains[V /* <: Collection[_] */](collection: V, value: js.Any, fromIndex: Double): Boolean = js.native
  /**
    * Sorts a list into groups and returns a count for the number of objects in each group. Similar
    * to groupBy, but instead of returning a list of values, returns a count for the number of values
    * in that group.
    * @param list Group elements in this list and then count the number of elements in each group.
    * @param iterator Group iterator for each element within `list`, return the key to group the element by.
    * @param context `this` object in `iterator`, optional.
    * @return An object with the group names as properties where each property contains the number of elements in that group.
    **/
  def countBy[T](list: List[T]): Dictionary[Double] = js.native
  def countBy[T](list: List[T], iterator: js.UndefOr[scala.Nothing], context: js.Any): Dictionary[Double] = js.native
  /**
    * @see _.countBy
    * @param iterator Function name
    **/
  def countBy[T](list: List[T], iterator: String): Dictionary[Double] = js.native
  def countBy[T](list: List[T], iterator: String, context: js.Any): Dictionary[Double] = js.native
  def countBy[T](list: List[T], iterator: ListIterator[T, _, List[T]]): Dictionary[Double] = js.native
  def countBy[T](list: List[T], iterator: ListIterator[T, _, List[T]], context: js.Any): Dictionary[Double] = js.native
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
  def debounce[T /* <: js.Function */](fn: T, wait: Double): T with Cancelable = js.native
  def debounce[T /* <: js.Function */](fn: T, wait: Double, immediate: Boolean): T with Cancelable = js.native
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
  def defer(fn: js.Function, args: js.Any*): Unit = js.native
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
  def delay(func: js.Function, wait: Double, args: js.Any*): js.Any = js.native
  /**
    * @see find
    **/
  def detect[V /* <: Collection[_] */](collection: V): js.UndefOr[TypeOfCollection[V]] = js.native
  def detect[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V]]], context: js.Any): js.UndefOr[TypeOfCollection[V]] = js.native
  def detect[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V]]): js.UndefOr[TypeOfCollection[V]] = js.native
  /**
    * Similar to without, but returns the values from array that are not present in the other arrays.
    * @param array Keeps values that are within `others`.
    * @param others The values to keep within `array`.
    * @return Copy of `array` with only `others` values.
    **/
  def difference[T](array: List[T], others: List[T]*): js.Array[T] = js.native
  /**
    * @see rest
    **/
  def drop[V /* <: List[_] */](list: V): js.Array[TypeOfList[V]] = js.native
  def drop[V /* <: List[_] */](list: V, index: Double): js.Array[TypeOfList[V]] = js.native
  /* *************
    * Collections *
    ************* */
  /**
    * Iterates over a collection of elements, yielding each in turn to an
    * iteratee. The iteratee is bound to the context object, if one is
    * passed. Each invocation of `iteratee` is called with three
    * arguments: (element, key, collection).
    * @param collection The collection of elements to iterate over.
    * @param iteratee The iteratee to call for each element in
    * `collection`.
    * @param context 'this' object in `iteratee`, optional.
    * @returns The original collection.
    **/
  def each[V /* <: Collection[_] */](collection: V, iteratee: CollectionIterator[TypeOfCollection[V], Unit, V]): V = js.native
  def each[V /* <: Collection[_] */](collection: V, iteratee: CollectionIterator[TypeOfCollection[V], Unit, V], context: js.Any): V = js.native
  /**
    * Escapes a string for insertion into HTML, replacing &, <, >, ", ', and / characters.
    * @param str Raw string to escape.
    * @return `str` HTML escaped.
    **/
  def escape(str: String): String = js.native
  /**
    * Returns true if all of the values in `collection` pass the `iteratee`
    * truth test. Short-circuits and stops traversing `collection` if a false
    * element is found.
    * @param collection The collection to evaluate.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns True if all elements pass the truth test, otherwise false.
    **/
  def every[V /* <: Collection[_] */](collection: V): Boolean = js.native
  def every[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V]]], context: js.Any): Boolean = js.native
  def every[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V]]): Boolean = js.native
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
    * Looks through each value in the collection, returning an array of all the values that pass a truth
    * test (iteratee).
    * @param collection The collection to filter.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The set of values that pass the truth test.
    **/
  def filter[V /* <: Collection[_] */](collection: V): js.Array[TypeOfCollection[V]] = js.native
  def filter[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V]]], context: js.Any): js.Array[TypeOfCollection[V]] = js.native
  def filter[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V]]): js.Array[TypeOfCollection[V]] = js.native
  /**
    * Looks through each value in the collection, returning the first one that passes a
    * truth test (iteratee), or undefined if no value passes the test. The function
    * returns as soon as it finds an acceptable element, and doesn't traverse the entire
    * collection.
    * @param collection Searches for a value in this collection.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @return The first element in `collection` that passes the truth test or undefined
    * if no elements pass.
    **/
  def find[V /* <: Collection[_] */](collection: V): js.UndefOr[TypeOfCollection[V]] = js.native
  def find[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V]]], context: js.Any): js.UndefOr[TypeOfCollection[V]] = js.native
  def find[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V]]): js.UndefOr[TypeOfCollection[V]] = js.native
  def findIndex[T](array: List[T], predicate: js.Object): Double = js.native
  def findIndex[T](array: List[T], predicate: js.Object, context: js.Any): Double = js.native
  /**
    * Returns the first index of an element in `array` where the predicate truth test passes
    * @param array The array to search for the index of the first element where the predicate truth test passes.
    * @param predicate Predicate function.
    * @param context `this` object in `predicate`, optional.
    * @return Returns the index of an element in `array` where the predicate truth test passes or -1.`
    **/
  def findIndex[T](array: List[T], predicate: ListIterator[T, Boolean, List[T]]): Double = js.native
  def findIndex[T](array: List[T], predicate: ListIterator[T, Boolean, List[T]], context: js.Any): Double = js.native
  /**
    * Returns the first key on an object that passes a predicate test.
    * @param obj the object to search in
    * @param predicate Predicate function.
    * @param context `this` object in `iterator`, optional.
    */
  def findKey[T](obj: Dictionary[T], predicate: ObjectIterator[T, Boolean, Dictionary[T]]): String = js.native
  def findKey[T](obj: Dictionary[T], predicate: ObjectIterator[T, Boolean, Dictionary[T]], context: js.Any): String = js.native
  def findLastIndex[T](array: List[T], predicate: js.Object): Double = js.native
  def findLastIndex[T](array: List[T], predicate: js.Object, context: js.Any): Double = js.native
  /**
    * Returns the last index of an element in `array` where the predicate truth test passes
    * @param array The array to search for the index of the last element where the predicate truth test passes.
    * @param predicate Predicate function.
    * @param context `this` object in `predicate`, optional.
    * @return Returns the index of an element in `array` where the predicate truth test passes or -1.`
    **/
  def findLastIndex[T](array: List[T], predicate: ListIterator[T, Boolean, List[T]]): Double = js.native
  def findLastIndex[T](array: List[T], predicate: ListIterator[T, Boolean, List[T]], context: js.Any): Double = js.native
  /**
    * Looks through the collection and returns the first value that matches all of the key-value
    * pairs listed in `properties`.
    * If no match is found, or if list is empty, undefined will be returned.
    * @param collection The collection in which to find an element that matches `properties`.
    * @param properties The properties to check for on the elements within `collection`.
    * @return The first element in `collection` that matches `properties` or undefined if
    * no match is found.
    **/
  def findWhere[V /* <: Collection[_] */](collection: V, properties: Partial[TypeOfCollection[V]]): js.UndefOr[TypeOfCollection[V]] = js.native
  /*********
    * Arrays *
    **********/
  /**
    * Returns the first element of `list`. Passing `n` will return the
    * first `n` elements of `list`.
    * @param list The list to retrieve elements from.
    * @param n The number of elements to retrieve, optional.
    * @returns The first `n` elements of `list` or the first element if
    * `n` is omitted.
    **/
  def first[V /* <: List[_] */](list: V): js.UndefOr[TypeOfList[V]] = js.native
  def first[V /* <: List[_] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
  /**
    * Flattens a nested array (the nesting can be to any depth). If you pass shallow, the array will
    * only be flattened a single level.
    * @param list The array to flatten.
    * @param shallow If true then only flatten one level, optional, default = false.
    * @returns The flattened list.
    **/
  def flatten[V /* <: List[_] */](list: V): js.Array[DeepestListItemOrSelf[TypeOfList[V]]] = js.native
  @JSName("flatten")
  def flatten_false[V /* <: List[_] */](list: V, shallow: `false`): js.Array[DeepestListItemOrSelf[TypeOfList[V]]] = js.native
  @JSName("flatten")
  def flatten_true[V /* <: List[_] */](list: V, shallow: `true`): js.Array[ListItemOrSelf[TypeOfList[V]]] = js.native
  /**
    * @see reduce
    **/
  def foldl[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]
  ): js.UndefOr[TResult | TypeOfCollection[V]] = js.native
  /**
    * @see reduce
    **/
  def foldl[V /* <: Collection[_] */, TResult](collection: V, iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): TResult = js.native
  def foldl[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  /**
    * @see reduceRight
    **/
  def foldr[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]
  ): js.UndefOr[TResult | TypeOfCollection[V]] = js.native
  /**
    * @see reduceRight
    **/
  def foldr[V /* <: Collection[_] */, TResult](collection: V, iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): TResult = js.native
  def foldr[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  /**
    * @see each
    **/
  def forEach[V /* <: Collection[_] */](collection: V, iteratee: CollectionIterator[TypeOfCollection[V], Unit, V]): V = js.native
  def forEach[V /* <: Collection[_] */](collection: V, iteratee: CollectionIterator[TypeOfCollection[V], Unit, V], context: js.Any): V = js.native
  /**
    * Returns a sorted list of the names of every method in an object - that is to say,
    * the name of every function property of the object.
    * @param object Object to pluck all function property names from.
    * @return List of all the function names on `object`.
    **/
  def functions(`object`: js.Any): js.Array[String] = js.native
  /**
    * Splits a collection into sets, grouped by the result of running each value through iteratee.
    * @param collection The collection to group.
    * @param iteratee An iteratee that provides the value to group by for each item in the collection.
    * @param context `this` object in `iteratee`, optional.
    * @returns A dictionary with the group names as properties where each property contains the grouped elements from the collection.
    **/
  def groupBy[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, _, TypeOfCollection[V]]): Dictionary[js.Array[TypeOfCollection[V]]] = js.native
  def groupBy[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, _, TypeOfCollection[V]], context: js.Any): Dictionary[js.Array[TypeOfCollection[V]]] = js.native
  /**
    * Does the object contain the given key? Identical to object.hasOwnProperty(key), but uses a safe
    * reference to the hasOwnProperty function, in case it's been overridden accidentally.
    * @param object Object to check for `key`.
    * @param key The key to check for on `object`.
    * @return True if `key` is a property on `object`, otherwise false.
    **/
  def has(`object`: js.Any, key: String): Boolean = js.native
  /**
    * @see first
    **/
  def head[V /* <: List[_] */](list: V): js.UndefOr[TypeOfList[V]] = js.native
  /**
    * @see first
    **/
  def head[V /* <: List[_] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
  /**
    * Returns the same value that is used as the argument. In math: f(x) = x
    * This function looks useless, but is used throughout Underscore as a default iterator.
    * @param value Identity of this object.
    * @return `value`.
    **/
  def identity[T](value: T): T = js.native
  /**
    * @see contains
    **/
  def include[V /* <: Collection[_] */](collection: V, value: js.Any): Boolean = js.native
  def include[V /* <: Collection[_] */](collection: V, value: js.Any, fromIndex: Double): Boolean = js.native
  /**
    * @see contains
    **/
  def includes[V /* <: Collection[_] */](collection: V, value: js.Any): Boolean = js.native
  def includes[V /* <: Collection[_] */](collection: V, value: js.Any, fromIndex: Double): Boolean = js.native
  /**
    * @see _.indexBy
    * @param iterator Property on each object to index them by.
    **/
  def indexBy[T](list: List[T], iterator: String): Dictionary[T] = js.native
  def indexBy[T](list: List[T], iterator: String, context: js.Any): Dictionary[T] = js.native
  /**
    * Given a `list`, and an `iterator` function that returns a key for each element in the list (or a property name),
    * returns an object with an index of each item.  Just like _.groupBy, but for when you know your keys are unique.
    **/
  def indexBy[T](list: List[T], iterator: ListIterator[T, _, List[T]]): Dictionary[T] = js.native
  def indexBy[T](list: List[T], iterator: ListIterator[T, _, List[T]], context: js.Any): Dictionary[T] = js.native
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
  def indexOf[T](array: List[T], value: T): Double = js.native
  def indexOf[T](array: List[T], value: T, isSorted: Boolean): Double = js.native
  /**
    * @see _indexof
    **/
  def indexOf[T](array: List[T], value: T, startFrom: Double): Double = js.native
  /**
    * Returns everything but the last entry of `list`. Especially useful
    * on the arguments object. Pass `n` to exclude the last
    * `n` elements from the result.
    * @param list The list to retrieve elements from.
    * @param n The number of elements from the end of `list` to omit,
    * optional, default = 1.
    * @returns The elements of `list` with the last `n` items omitted.
    **/
  def initial[V /* <: List[_] */](list: V): js.Array[TypeOfList[V]] = js.native
  def initial[V /* <: List[_] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
  /**
    * @see reduce
    **/
  def inject[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]
  ): js.UndefOr[TResult | TypeOfCollection[V]] = js.native
  /**
    * @see reduce
    **/
  def inject[V /* <: Collection[_] */, TResult](collection: V, iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): TResult = js.native
  def inject[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
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
  def invoke[T /* <: js.Object */](list: List[T], methodName: String, args: js.Any*): js.Any = js.native
  /**
    * Returns true if `object` is an Arguments object.
    * @param object The object to check.
    * @returns True if `object` is an Arguments object, otherwise false.
    **/
  def isArguments(`object`: js.Any): /* is std.IArguments */ Boolean = js.native
  /**
    * Returns true if `object` is an Array.
    * @param object The object to check.
    * @returns True if `object` is an Array, otherwise false.
    **/
  def isArray(`object`: js.Any): /* is std.Array<any> */ Boolean = js.native
  /**
    * Returns true if `object` is a Boolean.
    * @param object The object to check.
    * @returns True if `object` is a Boolean, otherwise false.
    **/
  def isBoolean(`object`: js.Any): /* is boolean */ Boolean = js.native
  /**
    * Returns true if `object` is a Date.
    * @param object The object to check.
    * @returns True if `object` is a Date, otherwise false.
    **/
  def isDate(`object`: js.Any): /* is std.Date */ Boolean = js.native
  /**
    * Returns true if `object` is a DOM element.
    * @param object The object to check.
    * @returns True if `object` is a DOM element, otherwise false.
    **/
  def isElement(`object`: js.Any): /* is std.Element */ Boolean = js.native
  /**
    * Returns true if `collection` contains no values.
    * For strings and array-like objects checks if the length property is 0.
    * @param collection The collection to check.
    * @returns True if `collection` has no elements.
    **/
  def isEmpty(collection: js.Any): Boolean = js.native
  /**
    * Performs an optimized deep comparison between `object` and `other`
    * to determine if they should be considered equal.
    * @param object Compare to `other`.
    * @param other Compare to `object`.
    * @returns True if `object` should be considered equal to `other`.
    **/
  def isEqual(`object`: js.Any, other: js.Any): Boolean = js.native
  /**
    * Returns true if `object` is an Error.
    * @param object The object to check.
    * @returns True if `object` is a Error, otherwise false.
    **/
  def isError(`object`: js.Any): /* is std.Error */ Boolean = js.native
  /**
    * Returns true if `object` is a finite Number.
    * @param object The object to check.
    * @returns True if `object` is a finite Number.
    **/
  def isFinite(`object`: js.Any): Boolean = js.native
  /**
    * Returns true if `object` is a Function.
    * @param object The object to check.
    * @returns True if `object` is a Function, otherwise false.
    **/
  def isFunction(`object`: js.Any): /* is std.Function */ Boolean = js.native
  /**
    * Returns true if the keys and values in `properties` are contained in `object`.
    * @param object The object to check.
    * @param properties The properties to check for in `object`.
    * @returns True if all keys and values in `properties` are also in `object`.
    **/
  def isMatch(`object`: js.Any, properties: js.Any): Boolean = js.native
  /**
    * Returns true if `object` is NaN.
    * Note: this is not the same as the native isNaN function,
    * which will also return true if the variable is undefined.
    * @param object The object to check.
    * @returns True if `object` is NaN, otherwise false.
    **/
  def isNaN(`object`: js.Any): Boolean = js.native
  /**
    * Returns true if `object` is null.
    * @param object The object to check.
    * @returns True if `object` is null, otherwise false.
    **/
  def isNull(`object`: js.Any): /* is null */ Boolean = js.native
  /**
    * Returns true if `object` is a Number (including NaN).
    * @param object The object to check.
    * @returns True if `object` is a Number, otherwise false.
    **/
  def isNumber(`object`: js.Any): /* is number */ Boolean = js.native
  /**
    * Returns true if `object` is an Object. Note that JavaScript arrays and functions are objects,
    * while (normal) strings and numbers are not.
    * @param object The object to check.
    * @returns True if `object` is an Object, otherwise false.
    **/
  def isObject(`object`: js.Any): Boolean = js.native
  /**
    * Returns true if `object` is a RegExp.
    * @param object The object to check.
    * @returns True if `object` is a RegExp, otherwise false.
    **/
  def isRegExp(`object`: js.Any): /* is std.RegExp */ Boolean = js.native
  /**
    * Returns true if `object` is a String.
    * @param object The object to check.
    * @returns True if `object` is a String, otherwise false.
    **/
  def isString(`object`: js.Any): /* is string */ Boolean = js.native
  /**
    * Returns true if `object` is a Symbol.
    * @param object The object to check.
    * @returns True if `object` is a Symbol, otherwise false.
    **/
  def isSymbol(`object`: js.Any): /* is symbol */ Boolean = js.native
  /**
    * Returns true if `object` is undefined.
    * @param object The object to check.
    * @returns True if `object` is undefined, otherwise false.
    **/
  def isUndefined(`object`: js.Any): /* is undefined */ Boolean = js.native
  /**
    * A mostly-internal function to generate callbacks that can be applied to each element
    * in a collection, returning the desired result -- either identity, an arbitrary callback,
    * a property matcher, or a propetery accessor.
    * @param string|Function|Object value The value to iterate over, usually the key.
    * @param any context
    * @return Callback that can be applied to each element in a collection.
    **/
  def iteratee(value: String): js.Function = js.native
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
  def keys(`object`: js.Any): js.Array[String] = js.native
  /**
    * Returns the last element of `list`. Passing `n` will return the last
    * `n` elements of `list`.
    * @param list The list to retrieve elements from.
    * @param n The number of elements to retrieve, optional.
    * @returns The last `n` elements of `list` or the last element if `n`
    * is omitted.
    **/
  def last[V /* <: List[_] */](list: V): js.UndefOr[TypeOfList[V]] = js.native
  def last[V /* <: List[_] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
  /**
    * Returns the index of the last occurrence of value in the array, or -1 if value is not present. Uses the
    * native lastIndexOf function if possible. Pass fromIndex to start your search at a given index.
    * @param array The array to search for the last index of `value`.
    * @param value The value to search for within `array`.
    * @param from The starting index for the search, optional.
    * @return The index of the last occurrence of `value` within `array`.
    **/
  def lastIndexOf[T](array: List[T], value: T): Double = js.native
  def lastIndexOf[T](array: List[T], value: T, from: Double): Double = js.native
  def map[V /* <: Collection[_] */](collection: V): js.Array[IterateeResult[Null, TypeOfCollection[V]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[scala.Nothing], context: js.Any): js.Array[IterateeResult[js.UndefOr[scala.Nothing], TypeOfCollection[V]]] = js.native
  /**
    * Produces a new array of values by mapping each value in the collection through a transformation function
    * (iteratee). For function iteratees, each invocation of iteratee is called with three arguments:
    * (value, key, collection).
    * @param collection Maps the elements of this collection.
    * @param iteratee Map iteratee for each element in the collection.
    * @param context `this` object in `iteratee`, optional.
    * @returns The mapped result.
    **/
  def map[V /* <: Collection[_] */](collection: V, iteratee: String): js.Array[IterateeResult[String, TypeOfCollection[V]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: String, context: js.Any): js.Array[IterateeResult[String, TypeOfCollection[V]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: js.Array[EnumerableKey]): js.Array[IterateeResult[js.Array[EnumerableKey], TypeOfCollection[V]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: js.Array[EnumerableKey], context: js.Any): js.Array[IterateeResult[js.Array[EnumerableKey], TypeOfCollection[V]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: Double): js.Array[IterateeResult[Double, TypeOfCollection[V]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: Double, context: js.Any): js.Array[IterateeResult[Double, TypeOfCollection[V]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: Null, context: js.Any): js.Array[IterateeResult[Null, TypeOfCollection[V]]] = js.native
  def map[V /* <: Collection[_] */, I /* <: (CollectionIterator[TypeOfCollection[V], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V> ]:? underscore.underscore.TypeOfCollection<V>[P]}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[TypeOfCollection[V]]) */](collection: V, iteratee: I): js.Array[IterateeResult[I, TypeOfCollection[V]]] = js.native
  def map[V /* <: Collection[_] */, I /* <: (CollectionIterator[TypeOfCollection[V], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V> ]:? underscore.underscore.TypeOfCollection<V>[P]}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[TypeOfCollection[V]]) */](collection: V, iteratee: I, context: js.Any): js.Array[IterateeResult[I, TypeOfCollection[V]]] = js.native
  /**
    * Like map, but for objects. Retrieves a property from each entry in the object, as if by _.property
    * @param object The object to transform
    * @param iteratee The property name to retrieve
    * @param context The optional context (value of `this`) to bind to
    */
  def mapObject(`object`: js.Any, iteratee: String): Dictionary[_] = js.native
  def mapObject(`object`: js.Any, iteratee: String, context: js.Any): Dictionary[_] = js.native
  /**
    * Like map, but for objects. Transform the value of each property in turn.
    * @param object The object to transform
    * @param iteratee The function that tranforms property values
    * @param context The optional context (value of `this`) to bind to
    */
  def mapObject[T](
    `object`: js.Any,
    iteratee: js.Function3[/* val */ js.Any, /* key */ String, /* object */ js.Any, T]
  ): Dictionary[T] = js.native
  def mapObject[T](
    `object`: js.Any,
    iteratee: js.Function3[/* val */ js.Any, /* key */ String, /* object */ js.Any, T],
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
    iteratee: js.Function3[/* val */ T, /* key */ String, /* object */ Dictionary[T], U]
  ): Dictionary[U] = js.native
  def mapObject[T, U](
    `object`: Dictionary[T],
    iteratee: js.Function3[/* val */ T, /* key */ String, /* object */ Dictionary[T], U],
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
  def max(list: List[Double]): Double = js.native
  /**
    * @see _.max
    */
  def max(`object`: Dictionary[Double]): Double = js.native
  def max[T](list: Dictionary[T], iterator: js.UndefOr[scala.Nothing], context: js.Any): T = js.native
  def max[T](list: Dictionary[T], iterator: ObjectIterator[T, _, Dictionary[T]]): T = js.native
  def max[T](list: Dictionary[T], iterator: ObjectIterator[T, _, Dictionary[T]], context: js.Any): T = js.native
  def max[T](list: List[T], iterator: js.UndefOr[scala.Nothing], context: js.Any): T = js.native
  def max[T](list: List[T], iterator: ListIterator[T, _, List[T]]): T = js.native
  def max[T](list: List[T], iterator: ListIterator[T, _, List[T]], context: js.Any): T = js.native
  /**
    * @see _.max
    */
  @JSName("max")
  def max_T_T[T](list: Dictionary[T]): T = js.native
  /**
    * Returns the maximum value in list. If iterator is passed, it will be used on each value to generate
    * the criterion by which the value is ranked.
    * @param list Finds the maximum value in this list.
    * @param iterator Compares each element in `list` to find the maximum value.
    * @param context `this` object in `iterator`, optional.
    * @return The maximum element within `list`.
    **/
  @JSName("max")
  def max_T_T[T](list: List[T]): T = js.native
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
  def memoize[T](fn: T, hashFn: js.Function1[/* repeated */ js.Any, String]): T = js.native
  /**
    * @see _functions
    **/
  def methods(`object`: js.Any): js.Array[String] = js.native
  /**
    * Returns the minimum value in list.
    * @param list Finds the minimum value in this list.
    * @return Minimum value in `list`.
    **/
  def min(list: List[Double]): Double = js.native
  /**
    * @see _.min
    */
  def min(o: Dictionary[Double]): Double = js.native
  def min[T](list: Dictionary[T], iterator: js.UndefOr[scala.Nothing], context: js.Any): T = js.native
  def min[T](list: Dictionary[T], iterator: ObjectIterator[T, _, Dictionary[T]]): T = js.native
  def min[T](list: Dictionary[T], iterator: ObjectIterator[T, _, Dictionary[T]], context: js.Any): T = js.native
  def min[T](list: List[T], iterator: js.UndefOr[scala.Nothing], context: js.Any): T = js.native
  def min[T](list: List[T], iterator: ListIterator[T, _, List[T]]): T = js.native
  def min[T](list: List[T], iterator: ListIterator[T, _, List[T]], context: js.Any): T = js.native
  /**
    * @see _.min
    */
  @JSName("min")
  def min_T_T[T](list: Dictionary[T]): T = js.native
  /**
    * Returns the minimum value in list. If iterator is passed, it will be used on each value to generate
    * the criterion by which the value is ranked.
    * @param list Finds the minimum value in this list.
    * @param iterator Compares each element in `list` to find the minimum value.
    * @param context `this` object in `iterator`, optional.
    * @return The minimum element within `list`.
    **/
  @JSName("min")
  def min_T_T[T](list: List[T]): T = js.native
  /**
    * Allows you to extend Underscore with your own utility functions. Pass a hash of
    * {name: function} definitions to have your functions added to the Underscore object,
    * as well as the OOP wrapper.
    * @param object Mixin object containing key/function pairs to add to the Underscore object.
    **/
  def mixin(`object`: js.Any): Unit = js.native
  /**
    * Returns a negated version of the pass-in predicate.
    * @param (...args: any[]) => boolean predicate
    * @return (...args: any[]) => boolean
    **/
  def negate(predicate: js.Function1[/* repeated */ js.Any, Boolean]): js.Function1[/* repeated */ js.Any, Boolean] = js.native
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
  def noop(): Unit = js.native
  /**
    * Returns an integer timestamp for the current time, using the fastest method available in the runtime. Useful for implementing timing/animation functions.
    **/
  def now(): Double = js.native
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
  def `object`[TResult /* <: js.Object */](keys: List[String], values: List[_]): TResult = js.native
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
  def omit(`object`: js.Any, keys: String*): js.Any = js.native
  /**
    * @see _.omit
    **/
  def omit(`object`: js.Any, keys: js.Array[String]): js.Any = js.native
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
  def pairs(`object`: js.Any): js.Array[js.Tuple2[String, _]] = js.native
  /**
    * Partially apply a function by filling in any number of its arguments, without changing its dynamic this value.
    * A close cousin of bind.  You may pass _ in your list of arguments to specify an argument that should not be
    * pre-filled, but left open to supply at call-time.
    * @param fn Function to partially fill in arguments.
    * @param arguments The partial arguments.
    * @return `fn` with partially filled in arguments.
    **/
  def partial[T1, T2](fn: js.Function1[/* p1 */ T1, T2], p1: T1): js.Function0[T2] = js.native
  def partial[T1, T2, T3](fn: js.Function2[/* p1 */ T1, /* p2 */ T2, T3], p1: T1): js.Function1[/* p2 */ T2, T3] = js.native
  def partial[T1, T2, T3](fn: js.Function2[/* p1 */ T1, /* p2 */ T2, T3], p1: T1, p2: T2): js.Function0[T3] = js.native
  def partial[T1, T2, T3](fn: js.Function2[/* p1 */ T1, /* p2 */ T2, T3], stub1: UnderscoreStatic, p2: T2): js.Function1[/* p1 */ T1, T3] = js.native
  def partial[T1, T2, T3, T4](fn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, T4], p1: T1): js.Function2[/* p2 */ T2, /* p3 */ T3, T4] = js.native
  def partial[T1, T2, T3, T4](fn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, T4], p1: T1, p2: T2): js.Function1[/* p3 */ T3, T4] = js.native
  def partial[T1, T2, T3, T4](fn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, T4], p1: T1, p2: T2, p3: T3): js.Function0[T4] = js.native
  def partial[T1, T2, T3, T4](
    fn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, T4],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3
  ): js.Function1[/* p2 */ T2, T4] = js.native
  def partial[T1, T2, T3, T4](fn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, T4], stub1: UnderscoreStatic, p2: T2): js.Function2[/* p1 */ T1, /* p3 */ T3, T4] = js.native
  def partial[T1, T2, T3, T4](
    fn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, T4],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3
  ): js.Function1[/* p1 */ T1, T4] = js.native
  def partial[T1, T2, T3, T4](
    fn: js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, T4],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3
  ): js.Function2[/* p1 */ T1, /* p2 */ T2, T4] = js.native
  def partial[T1, T2, T3, T4, T5](fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5], p1: T1): js.Function3[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5], p1: T1, p2: T2): js.Function2[/* p3 */ T3, /* p4 */ T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5], p1: T1, p2: T2, p3: T3): js.Function1[/* p4 */ T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4
  ): js.Function0[T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function1[/* p3 */ T3, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3
  ): js.Function2[/* p2 */ T2, /* p4 */ T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): js.Function1[/* p2 */ T2, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function2[/* p2 */ T2, /* p3 */ T3, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5],
    stub1: UnderscoreStatic,
    p2: T2
  ): js.Function3[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3
  ): js.Function2[/* p1 */ T1, /* p4 */ T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4
  ): js.Function1[/* p1 */ T1, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function2[/* p1 */ T1, /* p3 */ T3, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): js.Function2[/* p1 */ T1, /* p2 */ T2, T5] = js.native
  def partial[T1, T2, T3, T4, T5](
    fn: js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T5],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, T5] = js.native
  def partial[T1, T2, T3, T4, T5, T6](fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6], p1: T1): js.Function4[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    p2: T2
  ): js.Function3[/* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    p2: T2,
    p3: T3
  ): js.Function2[/* p4 */ T4, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4
  ): js.Function1[/* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5
  ): js.Function0[T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function1[/* p4 */ T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function2[/* p3 */ T3, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): js.Function1[/* p3 */ T3, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function2[/* p3 */ T3, /* p4 */ T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3
  ): js.Function3[/* p2 */ T2, /* p4 */ T4, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): js.Function2[/* p2 */ T2, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5
  ): js.Function1[/* p2 */ T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function2[/* p2 */ T2, /* p4 */ T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function3[/* p2 */ T2, /* p3 */ T3, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): js.Function2[/* p2 */ T2, /* p3 */ T3, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function3[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    p2: T2
  ): js.Function4[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3
  ): js.Function3[/* p1 */ T1, /* p4 */ T4, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4
  ): js.Function2[/* p1 */ T1, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5
  ): js.Function1[/* p1 */ T1, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function2[/* p1 */ T1, /* p4 */ T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function3[/* p1 */ T1, /* p3 */ T3, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): js.Function2[/* p1 */ T1, /* p3 */ T3, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function3[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5
  ): js.Function2[/* p1 */ T1, /* p2 */ T2, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p5 */ T5, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6](
    fn: js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T6],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T6] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1
  ): js.Function5[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2
  ): js.Function4[/* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    p3: T3
  ): js.Function3[/* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4
  ): js.Function2[/* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5
  ): js.Function1[/* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function0[T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function1[/* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function2[/* p4 */ T4, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function1[/* p4 */ T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function2[/* p4 */ T4, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function3[/* p3 */ T3, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): js.Function2[/* p3 */ T3, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function1[/* p3 */ T3, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function2[/* p3 */ T3, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function3[/* p3 */ T3, /* p4 */ T4, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function2[/* p3 */ T3, /* p4 */ T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function3[/* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3
  ): js.Function4[/* p2 */ T2, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): js.Function3[/* p2 */ T2, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5
  ): js.Function2[/* p2 */ T2, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function1[/* p2 */ T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function2[/* p2 */ T2, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function3[/* p2 */ T2, /* p4 */ T4, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function2[/* p2 */ T2, /* p4 */ T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function3[/* p2 */ T2, /* p4 */ T4, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function4[/* p2 */ T2, /* p3 */ T3, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): js.Function3[/* p2 */ T2, /* p3 */ T3, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function2[/* p2 */ T2, /* p3 */ T3, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function3[/* p2 */ T2, /* p3 */ T3, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function4[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function3[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function4[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2
  ): js.Function5[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3
  ): js.Function4[/* p1 */ T1, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4
  ): js.Function3[/* p1 */ T1, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5
  ): js.Function2[/* p1 */ T1, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function1[/* p1 */ T1, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function2[/* p1 */ T1, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function3[/* p1 */ T1, /* p4 */ T4, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function2[/* p1 */ T1, /* p4 */ T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function3[/* p1 */ T1, /* p4 */ T4, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function4[/* p1 */ T1, /* p3 */ T3, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): js.Function3[/* p1 */ T1, /* p3 */ T3, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function2[/* p1 */ T1, /* p3 */ T3, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function3[/* p1 */ T1, /* p3 */ T3, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function4[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function3[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function4[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function2[/* p1 */ T1, /* p2 */ T2, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p5 */ T5, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p6 */ T6, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7](
    fn: js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T7],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T7] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1
  ): js.Function6[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2
  ): js.Function5[/* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3
  ): js.Function4[/* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4
  ): js.Function3[/* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5
  ): js.Function2[/* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function1[/* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function0[T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function1[/* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function2[/* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function1[/* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function2[/* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function3[/* p4 */ T4, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function2[/* p4 */ T4, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function1[/* p4 */ T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function2[/* p4 */ T4, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function3[/* p4 */ T4, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function2[/* p4 */ T4, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function3[/* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function4[/* p3 */ T3, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): js.Function3[/* p3 */ T3, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function2[/* p3 */ T3, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function1[/* p3 */ T3, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function2[/* p3 */ T3, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function3[/* p3 */ T3, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function2[/* p3 */ T3, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function3[/* p3 */ T3, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function4[/* p3 */ T3, /* p4 */ T4, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function3[/* p3 */ T3, /* p4 */ T4, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function2[/* p3 */ T3, /* p4 */ T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function3[/* p3 */ T3, /* p4 */ T4, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function4[/* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function3[/* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function4[/* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3
  ): js.Function5[/* p2 */ T2, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): js.Function4[/* p2 */ T2, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5
  ): js.Function3[/* p2 */ T2, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function2[/* p2 */ T2, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function1[/* p2 */ T2, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function2[/* p2 */ T2, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function3[/* p2 */ T2, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function2[/* p2 */ T2, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function3[/* p2 */ T2, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function4[/* p2 */ T2, /* p4 */ T4, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function3[/* p2 */ T2, /* p4 */ T4, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function2[/* p2 */ T2, /* p4 */ T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function3[/* p2 */ T2, /* p4 */ T4, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function4[/* p2 */ T2, /* p4 */ T4, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function3[/* p2 */ T2, /* p4 */ T4, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function4[/* p2 */ T2, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function5[/* p2 */ T2, /* p3 */ T3, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): js.Function4[/* p2 */ T2, /* p3 */ T3, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function3[/* p2 */ T2, /* p3 */ T3, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function2[/* p2 */ T2, /* p3 */ T3, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function3[/* p2 */ T2, /* p3 */ T3, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function4[/* p2 */ T2, /* p3 */ T3, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function3[/* p2 */ T2, /* p3 */ T3, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function4[/* p2 */ T2, /* p3 */ T3, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function5[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function4[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function3[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function4[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function5[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function4[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    p1: T1,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function5[/* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2
  ): js.Function6[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3
  ): js.Function5[/* p1 */ T1, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4
  ): js.Function4[/* p1 */ T1, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5
  ): js.Function3[/* p1 */ T1, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function2[/* p1 */ T1, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function1[/* p1 */ T1, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function2[/* p1 */ T1, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function3[/* p1 */ T1, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function2[/* p1 */ T1, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function3[/* p1 */ T1, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function4[/* p1 */ T1, /* p4 */ T4, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function3[/* p1 */ T1, /* p4 */ T4, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function2[/* p1 */ T1, /* p4 */ T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function3[/* p1 */ T1, /* p4 */ T4, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function4[/* p1 */ T1, /* p4 */ T4, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function3[/* p1 */ T1, /* p4 */ T4, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function4[/* p1 */ T1, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function5[/* p1 */ T1, /* p3 */ T3, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): js.Function4[/* p1 */ T1, /* p3 */ T3, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function3[/* p1 */ T1, /* p3 */ T3, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function2[/* p1 */ T1, /* p3 */ T3, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function3[/* p1 */ T1, /* p3 */ T3, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function4[/* p1 */ T1, /* p3 */ T3, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function3[/* p1 */ T1, /* p3 */ T3, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function4[/* p1 */ T1, /* p3 */ T3, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function5[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function4[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function3[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function4[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function5[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function4[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    p2: T2,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function5[/* p1 */ T1, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3
  ): js.Function6[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function2[/* p1 */ T1, /* p2 */ T2, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    p3: T3,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4
  ): js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function3[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    p4: T4,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5
  ): js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p6 */ T6, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    p6: T6,
    p7: T7
  ): js.Function4[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    p5: T5,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p6 */ T6, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6
  ): js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p7 */ T7, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    p6: T6,
    p7: T7
  ): js.Function5[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, T8] = js.native
  def partial[T1, T2, T3, T4, T5, T6, T7, T8](
    fn: js.Function7[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, /* p7 */ T7, T8],
    stub1: UnderscoreStatic,
    stub2: UnderscoreStatic,
    stub3: UnderscoreStatic,
    stub4: UnderscoreStatic,
    stub5: UnderscoreStatic,
    stub6: UnderscoreStatic,
    p7: T7
  ): js.Function6[/* p1 */ T1, /* p2 */ T2, /* p3 */ T3, /* p4 */ T4, /* p5 */ T5, /* p6 */ T6, T8] = js.native
  /**
    * Splits `collection` into two arrays: one whose elements all satisfy
    * `iteratee` and one whose elements all do not satisfy `iteratee`.
    * @param collection The collection to partition.
    * @param iteratee The iteratee that defines the partitioning scheme
    * for each element in `collection`.
    * @param context `this` object in `iteratee`, optional.
    * @returns An array composed of two elements, where the first element
    * contains the elements in `collection` that satisfied the predicate
    * and the second element contains the elements that did not.
    **/
  def partition[V /* <: Collection[_] */](list: V): js.Tuple2[js.Array[TypeOfCollection[V]], js.Array[TypeOfCollection[V]]] = js.native
  def partition[V /* <: Collection[_] */](list: V, iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V]]], context: js.Any): js.Tuple2[js.Array[TypeOfCollection[V]], js.Array[TypeOfCollection[V]]] = js.native
  def partition[V /* <: Collection[_] */](list: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V]]): js.Tuple2[js.Array[TypeOfCollection[V]], js.Array[TypeOfCollection[V]]] = js.native
  /**
    * Return a copy of the object, filtered to only have values for the whitelisted keys
    * (or array of valid keys).
    * @param object Object to strip unwanted key/value pairs.
    * @keys The key/value pairs to keep on `object`.
    * @return Copy of `object` with only the `keys` properties.
    **/
  def pick[T, K /* <: /* keyof T */ String */](obj: T, keys: K*): Pick[T, K] = js.native
  def pick[T, K /* <: /* keyof T */ String */](obj: T, keys: js.Array[K]): Pick[T, K] = js.native
  def pick[T, K /* <: /* keyof T */ String */](
    obj: T,
    predicate: ObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
      Boolean, 
      Dictionary[
        /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ]
    ]
  ): Pick[T, K] = js.native
  /**
    * A convenient version of what is perhaps the most common use-case for map: extracting a list of
    * property values.
    * @param collection The collection of items.
    * @param propertyName The name of a specific property to retrieve from all items.
    * @returns The set of values for the specified property for each item in the collection.
    **/
  def pluck[V /* <: Collection[_] */](collection: V, propertyName: String): js.Array[PropertyTypeOrAny[TypeOfCollection[V], String]] = js.native
  def pluck[V /* <: Collection[_] */](collection: V, propertyName: Double): js.Array[PropertyTypeOrAny[TypeOfCollection[V], Double]] = js.native
  /**
    * Returns a function that will itself return the key property of any passed-in object.
    * @param key Property of the object.
    * @return Function which accept an object an returns the value of key in that object.
    **/
  def property(key: String): js.Function1[/* object */ js.Object, _] = js.native
  def property(key: js.Array[String | Double]): js.Function1[/* object */ js.Object, _] = js.native
  def property(key: Double): js.Function1[/* object */ js.Object, _] = js.native
  /**
    * Returns a function that will itself return the value of a object key property.
    * @param key The object to get the property value from.
    * @return Function which accept a key property in `object` and returns its value.
    **/
  def propertyOf(`object`: js.Object): js.Function1[/* key */ String | Double | (js.Array[String | Double]), _] = js.native
  /**
    * Returns a random integer between min and max, inclusive. If you only pass one argument,
    * it will return a number between 0 and that number.
    * @param max The maximum random number.
    * @return A random number between 0 and `max`.
    **/
  def random(max: Double): Double = js.native
  /**
    * @see _.random
    * @param min The minimum random number.
    * @return A random number between `min` and `max`.
    **/
  def random(min: Double, max: Double): Double = js.native
  /**
    * A function to create flexibly-numbered lists of integers, handy for
    * `each` and `map` loops. Returns a list of integers from
    * `startOrStop` (inclusive) to `stop` (exclusive), incremented
    * (or decremented) by `step`. Note that ranges that `stop` before they
    * `start` are considered to be zero-length instead of negative - if
    * you'd like a negative range, use a negative `step`.
    *
    * If `stop` is not specified, `startOrStop` will be the number to stop
    * at and the default start of 0 will be used.
    * @param startOrStop If `stop` is specified, the number to start at.
    * Otherwise, this is the number to stop at and the default start of 0
    * will be used.
    * @param stop The number to stop at.
    * @param step The number to count up by each iteration, optional,
    * default = 1.
    * @returns An array of numbers from start to `stop` with increments
    * of `step`.
    **/
  def range(startOrStop: Double): js.Array[Double] = js.native
  def range(startOrStop: Double, stop: js.UndefOr[scala.Nothing], step: Double): js.Array[Double] = js.native
  def range(startOrStop: Double, stop: Double): js.Array[Double] = js.native
  def range(startOrStop: Double, stop: Double, step: Double): js.Array[Double] = js.native
  def reduce[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]
  ): js.UndefOr[TResult | TypeOfCollection[V]] = js.native
  /**
    * Also known as inject and foldl, reduce boils down a collection of values into a
    * single value. Memo is the initial state of the reduction, and each successive
    * step of it should be returned by iteratee. The iteratee is passed four arguments:
    * the memo, then the value and index (or key) of the iteration, and finally a reference
    * to the entire collection.
    *
    * If no memo is passed to the initial invocation of reduce, the iteratee is not invoked
    * on the first element of the collection. The first element is instead passed as the memo
    * in the invocation of the iteratee on the next element in the collection.
    * @param collection Reduces the elements of this collection.
    * @param iteratee Reduce iteratee function for each element in `collection`.
    * @param memo Initial reduce state or undefined to use the first collection item as initial state.
    * @param context `this` object in `iteratee`, optional.
    * @returns The reduced result.
    **/
  def reduce[V /* <: Collection[_] */, TResult](collection: V, iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): TResult = js.native
  def reduce[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  def reduceRight[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]
  ): js.UndefOr[TResult | TypeOfCollection[V]] = js.native
  /**
    * The right-associative version of reduce.
    *
    * This is not as useful in JavaScript as it would be in a language with lazy evaluation.
    * @param collection Reduces the elements of this array.
    * @param iteratee Reduce iteratee function for each element in `collection`.
    * @param memo Initial reduce state or undefined to use the first collection item as initial state.
    * @param context `this` object in `iteratee`, optional.
    * @returns The reduced result.
    **/
  def reduceRight[V /* <: Collection[_] */, TResult](collection: V, iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): TResult = js.native
  def reduceRight[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  /**
    * Returns the values in `collection` without the elements that pass a truth test (iteratee).
    * The opposite of filter.
    * @param collection The collection to filter.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @return The set of values that fail the truth test.
    **/
  def reject[V /* <: Collection[_] */](collection: V): js.Array[TypeOfCollection[V]] = js.native
  def reject[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V]]], context: js.Any): js.Array[TypeOfCollection[V]] = js.native
  def reject[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V]]): js.Array[TypeOfCollection[V]] = js.native
  /**
    * Returns the rest of the elements in `list`. Pass an `index` to
    * return the values of the list from that index onward.
    * @param list The list to retrieve elements from.
    * @param index The index to start retrieving elements from, optional,
    * default = 1.
    * @returns The elements of `list` from `index` to the end of the list.
    **/
  def rest[V /* <: List[_] */](list: V): js.Array[TypeOfList[V]] = js.native
  def rest[V /* <: List[_] */](list: V, index: Double): js.Array[TypeOfList[V]] = js.native
  /**
    * Similar to ES6's rest param (http://ariya.ofilabs.com/2013/03/es6-and-rest-parameter.html)
    * This accumulates the arguments passed into an array, after a given index.
    **/
  def restArgs(func: js.Function): js.Function = js.native
  def restArgs(func: js.Function, starIndex: Double): js.Function = js.native
  /**
    * If the value of the named property is a function then invoke it; otherwise, return it.
    * @param object Object to maybe invoke function `property` on.
    * @param property The function by name to invoke on `object`.
    * @param defaultValue The value to be returned in case `property` doesn't exist or is undefined.
    * @return The result of invoking the function `property` on `object.
    **/
  def result(`object`: js.Any, property: String): js.Any = js.native
  def result(`object`: js.Any, property: String, defaultValue: js.Any): js.Any = js.native
  def sample[V /* <: Collection[_] */](collection: V): js.UndefOr[TypeOfCollection[V]] = js.native
  /**
    * Produce a random sample from the collection. Pass a number to return `n` random elements from the collection.
    * Otherwise a single random item will be returned.
    * @param collection The collection to sample.
    * @param n The number of elements to sample from the collection.
    * @return A random sample of `n` elements from `collection` or a single element if `n` is not specified.
    **/
  def sample[V /* <: Collection[_] */](collection: V, n: Double): js.Array[TypeOfCollection[V]] = js.native
  /**
    * @see filter
    **/
  def select[V /* <: Collection[_] */](collection: V): js.Array[TypeOfCollection[V]] = js.native
  def select[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V]]], context: js.Any): js.Array[TypeOfCollection[V]] = js.native
  def select[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V]]): js.Array[TypeOfCollection[V]] = js.native
  /**
    * Returns a shuffled copy of the collection, using a version of the Fisher-Yates shuffle.
    * @param collection The collection to shuffle.
    * @return A shuffled copy of `collection`.
    **/
  def shuffle[V /* <: Collection[_] */](collection: V): js.Array[TypeOfCollection[V]] = js.native
  /**
    * Return the number of values in the list.
    * @param list Count the number of values/elements in this list.
    * @return Number of values in `list`.
    **/
  def size[T](list: Collection[T]): Double = js.native
  /**
    * Returns true if any of the values in `collection` pass the `iteratee`
    * truth test. Short-circuits and stops traversing `collection` if a
    * true element is found.
    * @param collection The collection to evaluate.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns True if any element passed the truth test, otherwise false.
    **/
  def some[V /* <: Collection[_] */](collection: V): Boolean = js.native
  def some[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V]]], context: js.Any): Boolean = js.native
  def some[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V]]): Boolean = js.native
  /**
    * @see _.sortBy
    * @param iterator Sort iterator for each element within `list`.
    **/
  def sortBy[T](list: List[T], iterator: String): js.Array[T] = js.native
  def sortBy[T](list: List[T], iterator: String, context: js.Any): js.Array[T] = js.native
  /**
    * Returns a sorted copy of list, ranked in ascending order by the results of running each value
    * through iterator. Iterator may also be the string name of the property to sort by (eg. length).
    * @param list Sorts this list.
    * @param iterator Sort iterator for each element within `list`.
    * @param context `this` object in `iterator`, optional.
    * @return A sorted copy of `list`.
    **/
  def sortBy[T, TSort](list: List[T]): js.Array[T] = js.native
  def sortBy[T, TSort](list: List[T], iterator: js.UndefOr[scala.Nothing], context: js.Any): js.Array[T] = js.native
  def sortBy[T, TSort](list: List[T], iterator: ListIterator[T, TSort, List[T]]): js.Array[T] = js.native
  def sortBy[T, TSort](list: List[T], iterator: ListIterator[T, TSort, List[T]], context: js.Any): js.Array[T] = js.native
  /**
    * Uses a binary search to determine the lowest index at which the
    * value should be inserted into `list` in order to maintain `list`'s
    * sorted order. If an iteratee is provided, it will be used to compute
    * the sort ranking of each value, including the value you pass.
    * @param list A sorted list.
    * @param value The value to determine an insert index for to mainain
    * the sorting in `list`.
    * @param iteratee Iteratee to compute the sort ranking of each
    * element including `value`, optional.
    * @param context `this` object in `iteratee`, optional.
    * @return The index where `value` should be inserted into `list`.
    **/
  def sortedIndex[V /* <: List[_] */](list: V, value: TypeOfList[V]): Double = js.native
  def sortedIndex[V /* <: List[_] */](
    list: V,
    value: TypeOfList[V],
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]],
    context: js.Any
  ): Double = js.native
  def sortedIndex[V /* <: List[_] */](list: V, value: TypeOfList[V], iteratee: Iteratee[V, _, TypeOfCollection[V]]): Double = js.native
  /**
    * @see rest
    **/
  def tail[V /* <: List[_] */](list: V): js.Array[TypeOfList[V]] = js.native
  def tail[V /* <: List[_] */](list: V, index: Double): js.Array[TypeOfList[V]] = js.native
  /**
    * @see first
    **/
  def take[V /* <: List[_] */](list: V): js.UndefOr[TypeOfList[V]] = js.native
  /**
    * @see first
    **/
  def take[V /* <: List[_] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
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
  def template(templateString: String): CompiledTemplate = js.native
  def template(templateString: String, settings: TemplateSettings): CompiledTemplate = js.native
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
  def throttle[T /* <: js.Function */](func: T, wait: Double): T with Cancelable = js.native
  def throttle[T /* <: js.Function */](func: T, wait: Double, options: ThrottleSettings): T with Cancelable = js.native
  /**
    * Invokes the given iterator function n times.
    * Each invocation of iterator is called with an index argument
    * @param n Number of times to invoke `iterator`.
    * @param iterator Function iterator to invoke `n` times.
    * @param context `this` object in `iterator`, optional.
    **/
  def times[TResult](n: Double, iterator: js.Function1[/* n */ Double, TResult]): js.Array[TResult] = js.native
  def times[TResult](n: Double, iterator: js.Function1[/* n */ Double, TResult], context: js.Any): js.Array[TResult] = js.native
  /**
    * Creates a real Array from the collection (anything that can be
    * iterated over). Useful for transmuting the arguments object.
    * @param collection The collection to transform into an array.
    * @returns An array containing the elements of `collection`.
    **/
  def toArray[V /* <: Collection[_] */](collection: V): js.Array[TypeOfCollection[V]] = js.native
  /**
    * The opposite of escape, replaces &amp;, &lt;, &gt;, &quot;, and &#x27; with their unescaped counterparts.
    * @param str HTML escaped string.
    * @return `str` Raw string.
    **/
  def unescape(str: String): String = js.native
  /**
    * Computes the union of the passed-in arrays: the list of unique items, in order, that are
    * present in one or more of the arrays.
    * @param arrays Array of arrays to compute the union of.
    * @return The union of elements within `arrays`.
    **/
  def union[T](arrays: List[T]*): js.Array[T] = js.native
  /**
    * Produces a duplicate-free version of `list`, using === to test
    * object equality. If you know in advance that `list` is sorted,
    * passing true for isSorted will run a much faster algorithm. If you
    * want to compute unique items based on a transformation, pass an
    * iteratee function.
    * @param list The list to remove duplicates from.
    * @param isSorted True if `list` is already sorted, optional,
    * default = false.
    * @param iteratee Transform the elements of `list` before comparisons
    * for uniqueness.
    * @param context 'this' object in `iteratee`, optional.
    * @return An array containing only the unique elements in `list`.
    **/
  def uniq[V /* <: List[_] */](list: V): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](
    list: V,
    isSorted: js.UndefOr[scala.Nothing],
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]],
    context: js.Any
  ): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](list: V, isSorted: js.UndefOr[scala.Nothing], iteratee: Iteratee[V, _, TypeOfCollection[V]]): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](list: V, isSorted: Boolean): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](
    list: V,
    isSorted: Boolean,
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]],
    context: js.Any
  ): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](list: V, isSorted: Boolean, iteratee: Iteratee[V, _, TypeOfCollection[V]]): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](list: V, iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]], context: js.Any): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](list: V, iteratee: Iteratee[V, _, TypeOfCollection[V]]): js.Array[TypeOfList[V]] = js.native
  /**
    * @see uniq
    **/
  def unique[V /* <: List[_] */](list: V): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](
    list: V,
    isSorted: js.UndefOr[scala.Nothing],
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]],
    context: js.Any
  ): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](list: V, isSorted: js.UndefOr[scala.Nothing], iteratee: Iteratee[V, _, TypeOfCollection[V]]): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](list: V, isSorted: Boolean): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](
    list: V,
    isSorted: Boolean,
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]],
    context: js.Any
  ): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](list: V, isSorted: Boolean, iteratee: Iteratee[V, _, TypeOfCollection[V]]): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](list: V, iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V]]], context: js.Any): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](list: V, iteratee: Iteratee[V, _, TypeOfCollection[V]]): js.Array[TypeOfList[V]] = js.native
  /**
    * Generate a globally-unique id for client-side models or DOM elements that need one.
    * If prefix is passed, the id will be appended to it. Without prefix, returns an integer.
    * @param prefix A prefix string to start the unique ID with.
    * @return Unique string ID beginning with `prefix`.
    **/
  def uniqueId(): String = js.native
  def uniqueId(prefix: String): String = js.native
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
    * Looks through each value in the collection, returning an array of all the values that matches the
    * key-value pairs listed in `properties`.
    * @param collection The collection in which to find elements that match `properties`.
    * @param properties The properties to check for on the elements within `collection`.
    * @return The elements in `collection` that match `properties`.
    **/
  def where[V /* <: Collection[_] */](collection: V, properties: Partial[TypeOfCollection[V]]): js.Array[TypeOfCollection[V]] = js.native
  /**
    * Returns a copy of `list` with all instances of `values` removed.
    * @param list The list to exclude `values` from.
    * @param values The values to exclude from `list`.
    * @return An array that contains all elements of `list` except for
    * `values`.
    **/
  def without[V /* <: List[_] */](list: V, values: TypeOfList[V]*): js.Array[TypeOfList[V]] = js.native
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

