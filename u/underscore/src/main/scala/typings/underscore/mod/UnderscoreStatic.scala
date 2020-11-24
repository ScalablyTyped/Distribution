package typings.underscore.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Extract
import typings.std.Partial
import typings.underscore.anon.FnCall
import typings.underscore.anon.FnCallCollectionIterateeMemoContext
import typings.underscore.anon.FnCallListIsSortedIterateeContext
import typings.underscore.anon.FnCallListN
import typings.underscore.underscoreBooleans.`false`
import typings.underscore.underscoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnderscoreStatic extends js.Object {
  
  /*******
    * OOP *
    *******/
  /**
    * Underscore OOP Wrapper, all Underscore functions that take an object
    * as the first parameter can be invoked through this function.
    * @param value First argument to Underscore object functions.
    * @returns An Underscore wrapper around the supplied value.
    **/
  def apply[V](value: V): Underscore[TypeOfCollection[V, scala.Nothing], V] = js.native
  
  /**
    * Current version
    */
  val VERSION: String = js.native
  
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
  def all[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): Boolean = js.native
  def all[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
  
  /**
    * Retrieve all the names of object's own and inherited properties.
    * @param object Retrieve the key or property names from this object.
    * @return List of all the property names on `object`.
    **/
  def allKeys(`object`: js.Any): js.Array[String] = js.native
  
  /**
    * @see every
    **/
  @JSName("all")
  var all_Original: js.Function3[
    /* collection */ Collection[_], 
    /* iteratee */ js.UndefOr[Iteratee[Collection[_], Boolean, TypeOfCollection[Collection[_], scala.Nothing]]], 
    /* context */ js.UndefOr[js.Any], 
    Boolean
  ] = js.native
  
  /**
    * @see some
    **/
  def any[V /* <: Collection[_] */](collection: V): Boolean = js.native
  def any[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): Boolean = js.native
  def any[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
  /**
    * @see some
    **/
  @JSName("any")
  var any_Original: js.Function3[
    /* collection */ Collection[_], 
    /* iteratee */ js.UndefOr[Iteratee[Collection[_], Boolean, TypeOfCollection[Collection[_], scala.Nothing]]], 
    /* context */ js.UndefOr[js.Any], 
    Boolean
  ] = js.native
  
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
  
  /************
    * Chaining *
    ************/
  /**
    * Returns a wrapped object. Calling methods on this object will
    * continue to return wrapped objects until value() is used.
    * @param value The object to chain.
    * @returns An underscore chain wrapper around the supplied value.
    **/
  def chain[V](value: V): Chain[TypeOfCollection[V, scala.Nothing], V] = js.native
  
  /**
    * Chunks `list` into multiple arrays, each containing `length` or
    * fewer items.
    * @param list The list to chunk.
    * @param length The maximum size of the chunks.
    * @returns The contents of `list` in chunks no greater than `length`
    * in size.
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
  def collect[V /* <: Collection[_] */](collection: V): js.Array[IterateeResult[Null, TypeOfCollection[V, scala.Nothing]]] = js.native
  def collect[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[scala.Nothing], context: js.Any): js.Array[IterateeResult[js.UndefOr[scala.Nothing], TypeOfCollection[V, scala.Nothing]]] = js.native
  /**
    * @see map
    **/
  def collect[V /* <: Collection[_] */](collection: V, iteratee: String): js.Array[IterateeResult[String, TypeOfCollection[V, scala.Nothing]]] = js.native
  def collect[V /* <: Collection[_] */](collection: V, iteratee: String, context: js.Any): js.Array[IterateeResult[String, TypeOfCollection[V, scala.Nothing]]] = js.native
  /**
    * @see map
    **/
  def collect[V /* <: Collection[_] */](collection: V, iteratee: js.Array[String | Double]): js.Array[IterateeResult[js.Array[String | Double], TypeOfCollection[V, scala.Nothing]]] = js.native
  def collect[V /* <: Collection[_] */](collection: V, iteratee: js.Array[String | Double], context: js.Any): js.Array[IterateeResult[js.Array[String | Double], TypeOfCollection[V, scala.Nothing]]] = js.native
  /**
    * @see map
    **/
  def collect[V /* <: Collection[_] */](collection: V, iteratee: Double): js.Array[IterateeResult[Double, TypeOfCollection[V, scala.Nothing]]] = js.native
  def collect[V /* <: Collection[_] */](collection: V, iteratee: Double, context: js.Any): js.Array[IterateeResult[Double, TypeOfCollection[V, scala.Nothing]]] = js.native
  def collect[V /* <: Collection[_] */](collection: V, iteratee: Null, context: js.Any): js.Array[IterateeResult[Null, TypeOfCollection[V, scala.Nothing]]] = js.native
  /**
    * @see map
    **/
  def collect[V /* <: Collection[_] */, I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](collection: V, iteratee: I): js.Array[IterateeResult[I, TypeOfCollection[V, scala.Nothing]]] = js.native
  def collect[V /* <: Collection[_] */, I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](collection: V, iteratee: I, context: js.Any): js.Array[IterateeResult[I, TypeOfCollection[V, scala.Nothing]]] = js.native
  /**
    * @see map
    **/
  @JSName("collect")
  var collect_Original: FnCall = js.native
  
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
    * Sorts `collection` into groups and returns a count for the number of
    * objects in each group. Similar to `groupBy`, but instead of
    * returning a list of values, returns a count for the number of values
    * in that group.
    * @param collection The collection to count.
    * @param iteratee An iteratee that provides the value to count by for
    * each item in `collection`.
    * @param context `this` object in `iteratee`, optional.
    * @returns A dictionary with the group names provided by `iteratee` as
    * properties where each property contains the count of the grouped
    * elements from `collection`.
    **/
  def countBy[V /* <: Collection[_] */](collection: V): Dictionary[Double] = js.native
  def countBy[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): Dictionary[Double] = js.native
  def countBy[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Dictionary[Double] = js.native
  
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
  def detect[V /* <: Collection[_] */](collection: V): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
  def detect[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
  def detect[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
  /**
    * @see find
    **/
  @JSName("detect")
  var detect_Original: js.Function3[
    /* collection */ Collection[_], 
    /* iteratee */ js.UndefOr[Iteratee[Collection[_], Boolean, TypeOfCollection[Collection[_], scala.Nothing]]], 
    /* context */ js.UndefOr[js.Any], 
    js.UndefOr[TypeOfCollection[Collection[_], scala.Nothing]]
  ] = js.native
  
  /**
    * Similar to without, but returns the values from `list` that are not
    * present in `others`.
    * @param list The starting list.
    * @param others The lists of values to exclude from `list`.
    * @returns The contents of `list` without the values in `others`.
    **/
  def difference[T](list: List[T], others: List[T]*): js.Array[T] = js.native
  
  /**
    * @see rest
    **/
  def drop[V /* <: List[_] */](list: V): js.Array[TypeOfList[V]] = js.native
  def drop[V /* <: List[_] */](list: V, index: Double): js.Array[TypeOfList[V]] = js.native
  /**
    * @see rest
    **/
  @JSName("drop")
  var drop_Original: js.Function2[/* list */ List[_], /* index */ js.UndefOr[Double], js.Array[TypeOfList[List[_]]]] = js.native
  
  /***************
    * Collections *
    ***************/
  /**
    * Iterates over a `collection` of elements, yielding each in turn to
    * an `iteratee`. The `iteratee` is bound to the context object, if one
    * is passed.
    * @param collection The collection of elements to iterate over.
    * @param iteratee The iteratee to call for each element in
    * `collection`.
    * @param context 'this' object in `iteratee`, optional.
    * @returns The original collection.
    **/
  def each[V /* <: Collection[_] */](collection: V, iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V]): V = js.native
  def each[V /* <: Collection[_] */](
    collection: V,
    iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V],
    context: js.Any
  ): V = js.native
  
  /**
    * Escapes a string for insertion into HTML, replacing &, <, >, ", ', and / characters.
    * @param str Raw string to escape.
    * @return `str` HTML escaped.
    **/
  def escape(str: String): String = js.native
  
  /**
    * Returns true if all of the values in `collection` pass the
    * `iteratee` truth test. Short-circuits and stops traversing
    * `collection` if a false element is found.
    * @param collection The collection to evaluate.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns True if all elements pass the truth test, otherwise false.
    **/
  def every[V /* <: Collection[_] */](collection: V): Boolean = js.native
  def every[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): Boolean = js.native
  def every[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
  
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
    * Looks through each value in `collection`, returning an array of
    * all the values that pass a truth test (`iteratee`).
    * @param collection The collection to filter.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The set of values that pass the truth test.
    **/
  def filter[V /* <: Collection[_] */](collection: V): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  def filter[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  def filter[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  
  /**
    * Looks through each value in `collection`, returning the first one
    * that passes a truth test (`iteratee`), or undefined if no value
    * passes the test. The function returns as soon as it finds an
    * acceptable element, and doesn't traverse the entire collection.
    * @param collection The collection to search.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The first element in `collection` that passes the truth
    * test or undefined if no elements pass.
    **/
  def find[V /* <: Collection[_] */](collection: V): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
  def find[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
  def find[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
  
  /**
    * Returns the first index of an element in `list` where the `iteratee`
    * truth test passes, otherwise returns -1.
    * @param list The list to search for the index of the first element
    * that passes the truth test.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The index of the first element in `list` where the
    * truth test passes or -1 if no elements pass.
    **/
  def findIndex[V /* <: List[_] */](list: V): Double = js.native
  def findIndex[V /* <: List[_] */](
    list: V,
    iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): Double = js.native
  def findIndex[V /* <: List[_] */](list: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Double = js.native
  
  /**
    * Similar to `findIndex` but for keys in objects. Returns the key
    * where the `iteratee` truth test passes or undefined.
    * @param object The object to search.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The first element in `object` that passes the truth test or
    * undefined if no elements pass.
    */
  def findKey[V /* <: js.Object */](`object`: V): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
  def findKey[V /* <: js.Object */](`object`: V, iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, _]]], context: js.Any): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
  def findKey[V /* <: js.Object */](`object`: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, _]]): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
  
  /**
    * Returns the last index of an element in `list` where the `iteratee`
    * truth test passes, otherwise returns -1.
    * @param list The list to search for the index of the last element
    * that passes the truth test.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The index of the last element in `list` where the
    * truth test passes or -1 if no elements pass.
    **/
  def findLastIndex[V /* <: List[_] */](list: V): Double = js.native
  def findLastIndex[V /* <: List[_] */](
    list: V,
    iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): Double = js.native
  def findLastIndex[V /* <: List[_] */](list: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Double = js.native
  
  /**
    * Looks through `collection` and returns the first value that matches
    * all of the key-value pairs listed in `properties`. If no match is
    * found, or if list is empty, undefined will be returned.
    * @param collection The collection in which to find an element that
    * matches `properties`.
    * @param properties The properties to check for on the elements within
    * `collection`.
    * @returns The first element in `collection` that matches `properties`
    * or undefined if no match is found.
    **/
  def findWhere[V /* <: Collection[_] */](collection: V, properties: Partial[TypeOfCollection[V, scala.Nothing]]): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
  
  /**********
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
    * Flattens a nested `list` (the nesting can be to any depth). If you
    * pass shallow, the `list` will only be flattened a single level.
    * @param list The list to flatten.
    * @param shallow True to only flatten one level, optional,
    * default = false.
    * @returns The flattened `list`.
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
    iteratee: MemoCollectionIterator[
      TypeOfCollection[V, scala.Nothing], 
      TResult | (TypeOfCollection[V, scala.Nothing]), 
      V
    ]
  ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
  /**
    * @see reduce
    **/
  def foldl[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult
  ): TResult = js.native
  def foldl[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  /**
    * @see reduce
    **/
  @JSName("foldl")
  var foldl_Original: FnCallCollectionIterateeMemoContext = js.native
  
  /**
    * @see reduceRight
    **/
  def foldr[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[
      TypeOfCollection[V, scala.Nothing], 
      TResult | (TypeOfCollection[V, scala.Nothing]), 
      V
    ]
  ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
  /**
    * @see reduceRight
    **/
  def foldr[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult
  ): TResult = js.native
  def foldr[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  /**
    * @see reduceRight
    **/
  @JSName("foldr")
  var foldr_Original: FnCallCollectionIterateeMemoContext = js.native
  
  /**
    * @see each
    **/
  def forEach[V /* <: Collection[_] */](collection: V, iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V]): V = js.native
  def forEach[V /* <: Collection[_] */](
    collection: V,
    iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V],
    context: js.Any
  ): V = js.native
  /**
    * @see each
    **/
  @JSName("forEach")
  var forEach_Original: js.Function3[
    /* collection */ Collection[_], 
    /* iteratee */ CollectionIterator[TypeOfCollection[Collection[_], scala.Nothing], Unit, Collection[_]], 
    /* context */ js.UndefOr[js.Any], 
    Collection[_]
  ] = js.native
  
  /**
    * Returns a sorted list of the names of every method in an object - that is to say,
    * the name of every function property of the object.
    * @param object Object to pluck all function property names from.
    * @return List of all the function names on `object`.
    **/
  def functions(`object`: js.Any): js.Array[String] = js.native
  
  /**
    * Splits `collection` into sets that are grouped by the result of
    * running each value through `iteratee`.
    * @param collection The collection to group.
    * @param iteratee An iteratee that provides the value to group by for
    * each item in `collection`.
    * @param context `this` object in `iteratee`, optional.
    * @returns A dictionary with the group names provided by `iteratee` as
    * properties where each property contains the grouped elements from
    * `collection`.
    **/
  def groupBy[V /* <: Collection[_] */](collection: V): Dictionary[js.Array[TypeOfCollection[V, scala.Nothing]]] = js.native
  def groupBy[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): Dictionary[js.Array[TypeOfCollection[V, scala.Nothing]]] = js.native
  def groupBy[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Dictionary[js.Array[TypeOfCollection[V, scala.Nothing]]] = js.native
  
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
    * @see first
    **/
  @JSName("head")
  var head_Original: FnCallListN = js.native
  
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
  def includes[V /* <: Collection[_] */](collection: V, value: js.Any): Boolean = js.native
  def includes[V /* <: Collection[_] */](collection: V, value: js.Any, fromIndex: Double): Boolean = js.native
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
    * Given a `collection` and an `iteratee` function that returns a key
    * for each element in `collection`, returns an object that acts as an
    * index of each item.  Just like `groupBy`, but for when you know your
    * keys are unique.
    * @param collection The collection to index.
    * @param iteratee An iteratee that provides the value to index by for
    * each item in `collection`.
    * @param context `this` object in `iteratee`, optional.
    * @returns A dictionary where each item in `collection` is assigned to
    * the property designated by `iteratee`.
    **/
  def indexBy[V /* <: Collection[_] */](collection: V): Dictionary[TypeOfCollection[V, scala.Nothing]] = js.native
  def indexBy[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): Dictionary[TypeOfCollection[V, scala.Nothing]] = js.native
  def indexBy[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Dictionary[TypeOfCollection[V, scala.Nothing]] = js.native
  
  /**
    * Returns the index at which `value` can be found in `list`, or -1 if
    * `value` is not present. If you're working with a large list and you
    * know that the list is already sorted, pass true for
    * `isSortedOrFromIndex` to use a faster binary search...or, pass a
    * number in order to look for the first matching value in the list
    * after the given index.
    * @param list The list to search for the index of `value`.
    * @param value The value to search for within `list`.
    * @param isSortedOrFromIndex True if `list` is already sorted OR the
    * starting index for the search, optional.
    * @returns The index of the first occurrence of `value` within `list`
    * or -1 if `value` is not found.
    **/
  def indexOf[V /* <: List[_] */](list: V, value: TypeOfList[V]): Double = js.native
  def indexOf[V /* <: List[_] */](list: V, value: TypeOfList[V], isSortedOrFromIndex: Boolean): Double = js.native
  def indexOf[V /* <: List[_] */](list: V, value: TypeOfList[V], isSortedOrFromIndex: Double): Double = js.native
  
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
    iteratee: MemoCollectionIterator[
      TypeOfCollection[V, scala.Nothing], 
      TResult | (TypeOfCollection[V, scala.Nothing]), 
      V
    ]
  ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
  /**
    * @see reduce
    **/
  def inject[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult
  ): TResult = js.native
  def inject[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  /**
    * @see reduce
    **/
  @JSName("inject")
  var inject_Original: FnCallCollectionIterateeMemoContext = js.native
  
  /**
    * Computes the list of values that are the intersection of the
    * passed-in `lists`. Each value in the result is present in each of
    * the lists.
    * @param lists The lists to compute the intersection of.
    * @returns The intersection of elements within the `lists`.
    **/
  def intersection[T](lists: List[T]*): js.Array[T] = js.native
  
  /**
    * Returns a copy of the object where the keys have become the values and the values the keys.
    * For this to work, all of your object's values should be unique and string serializable.
    * @param object Object to invert key/value pairs.
    * @return An inverted key/value paired version of `object`.
    **/
  def invert(`object`: js.Any): js.Any = js.native
  
  /**
    * Calls the method named by `methodName` on each value in
    * `collection`. Any extra arguments passed to invoke will be forwarded
    * on to the method invocation.
    * @param collection The collection of elements to invoke `methodName`
    * on.
    * @param methodName The name of the method to call on each element in
    * `collection`.
    * @param args Additional arguments to pass to method `methodName`.
    * @returns An array containing the result of the method call for each
    * item in `collection`.
    **/
  def invoke(list: Collection[_], methodName: String, args: js.Any*): js.Array[_] = js.native
  
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
    * For strings and array-like objects checks if the length property is
    * 0.
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
    * Returns true if the keys and values in `properties` are contained in
    * `object`.
    * @param object The object to check.
    * @param properties The properties to check for in `object`.
    * @returns True if all keys and values in `properties` are also in
    * `object`.
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
    * Returns true if `object` is an Object. Note that JavaScript arrays
    * and functions are objects,
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
  
  /***********
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
    * Returns the index of the last occurrence of `value` in `list`, or -1
    * if `value` is not present. Pass `fromIndex` to start your search at
    * a given index.
    * @param list The list to search for the last occurrence of `value`.
    * @param value The value to search for within `list`.
    * @param fromIndex The starting index for the search, optional.
    * @returns The index of the last occurrence of `value` within `list`
    * or -1 if `value` is not found.
    **/
  def lastIndexOf[V /* <: List[_] */](list: V, value: TypeOfList[V]): Double = js.native
  def lastIndexOf[V /* <: List[_] */](list: V, value: TypeOfList[V], fromIndex: Double): Double = js.native
  
  def map[V /* <: Collection[_] */](collection: V): js.Array[IterateeResult[Null, TypeOfCollection[V, scala.Nothing]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: js.UndefOr[scala.Nothing], context: js.Any): js.Array[IterateeResult[js.UndefOr[scala.Nothing], TypeOfCollection[V, scala.Nothing]]] = js.native
  /**
    * Produces a new array of values by mapping each value in `collection`
    * through a transformation `iteratee`.
    * @param collection The collection to transform.
    * @param iteratee The iteratee to use to transform each item in
    * `collection`.
    * @param context `this` object in `iteratee`, optional.
    * @returns The mapped result.
    **/
  def map[V /* <: Collection[_] */](collection: V, iteratee: String): js.Array[IterateeResult[String, TypeOfCollection[V, scala.Nothing]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: String, context: js.Any): js.Array[IterateeResult[String, TypeOfCollection[V, scala.Nothing]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: js.Array[String | Double]): js.Array[IterateeResult[js.Array[String | Double], TypeOfCollection[V, scala.Nothing]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: js.Array[String | Double], context: js.Any): js.Array[IterateeResult[js.Array[String | Double], TypeOfCollection[V, scala.Nothing]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: Double): js.Array[IterateeResult[Double, TypeOfCollection[V, scala.Nothing]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: Double, context: js.Any): js.Array[IterateeResult[Double, TypeOfCollection[V, scala.Nothing]]] = js.native
  def map[V /* <: Collection[_] */](collection: V, iteratee: Null, context: js.Any): js.Array[IterateeResult[Null, TypeOfCollection[V, scala.Nothing]]] = js.native
  def map[V /* <: Collection[_] */, I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](collection: V, iteratee: I): js.Array[IterateeResult[I, TypeOfCollection[V, scala.Nothing]]] = js.native
  def map[V /* <: Collection[_] */, I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](collection: V, iteratee: I, context: js.Any): js.Array[IterateeResult[I, TypeOfCollection[V, scala.Nothing]]] = js.native
  
  def mapObject[V /* <: js.Object */](`object`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<null, V[K]>}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[V] = js.native
  def mapObject[V /* <: js.Object */](`object`: V, iteratee: js.UndefOr[scala.Nothing], context: js.Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<undefined, V[K]>}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[V] = js.native
  /**
    * Like map, but for objects. Transform the value of each property in
    * turn.
    * @param object The object to transform.
    * @param iteratee The iteratee to use to transform property values.
    * @param context `this` object in `iteratee`, optional.
    * @returns A new object with all of `object`'s property values
    * transformed through `iteratee`.
    */
  def mapObject[V /* <: js.Object */](`object`: V, iteratee: String): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<string, V[K]>}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[V] = js.native
  def mapObject[V /* <: js.Object */](`object`: V, iteratee: String, context: js.Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<string, V[K]>}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[V] = js.native
  def mapObject[V /* <: js.Object */](`object`: V, iteratee: js.Array[String | Double]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<std.Array<string | number>, V[K]>}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[V] = js.native
  def mapObject[V /* <: js.Object */](`object`: V, iteratee: js.Array[String | Double], context: js.Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<std.Array<string | number>, V[K]>}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[V] = js.native
  def mapObject[V /* <: js.Object */](`object`: V, iteratee: Double): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<number, V[K]>}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[V] = js.native
  def mapObject[V /* <: js.Object */](`object`: V, iteratee: Double, context: js.Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<number, V[K]>}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[V] = js.native
  def mapObject[V /* <: js.Object */](`object`: V, iteratee: Null, context: js.Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<null, V[K]>}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[V] = js.native
  def mapObject[V /* <: js.Object */, I /* <: (CollectionIterator[TypeOfCollection[V, _], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V, any> ]:? underscore.underscore.TypeOfCollection<V, any>[P]}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with (TopLevel[TypeOfCollection[V, _]])) */](`object`: V, iteratee: I): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<I, V[K]>}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[V] = js.native
  def mapObject[V /* <: js.Object */, I /* <: (CollectionIterator[TypeOfCollection[V, _], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V, any> ]:? underscore.underscore.TypeOfCollection<V, any>[P]}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with (TopLevel[TypeOfCollection[V, _]])) */](`object`: V, iteratee: I, context: js.Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<I, V[K]>}
    */ typings.underscore.underscoreStrings.UnderscoreStatic with TopLevel[V] = js.native
  
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
    * Returns the maximum value in `collection`. If an `iteratee` is
    * provided, it will be used on each element to generate the criterion
    * by which the element is ranked. -Infinity is returned if list is
    * empty. Non-numerical values returned by `iteratee` will be ignored.
    * @param collection The collection in which to find the maximum value.
    * @param iteratee The iteratee that provides the criterion by which
    * each element is ranked, optional if evaluating a collection of
    * numbers.
    * @param context `this` object in `iteratee`, optional.
    * @returns The maximum element within `collection` or -Infinity if
    * `collection` is empty.
    **/
  def max[V /* <: Collection[_] */](collection: V): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
  def max[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
  def max[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
  
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
    * Returns the minimum value in `collection`. If an `iteratee` is
    * provided, it will be used on each element to generate the criterion
    * by which the element is ranked. Infinity is returned if list is
    * empty. Non-numerical values returned by `iteratee` will be ignored.
    * @param collection The collection in which to find the minimum value.
    * @param iteratee The iteratee that provides the criterion by which
    * each element is ranked, optional if evaluating a collection of
    * numbers.
    * @param context `this` object in `iteratee`, optional.
    * @returns The minimum element within `collection` or Infinity if
    * `collection` is empty.
    **/
  def min[V /* <: Collection[_] */](list: V): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
  def min[V /* <: Collection[_] */](list: V, iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]], context: js.Any): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
  def min[V /* <: Collection[_] */](list: V, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
  
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
  
  /***********
    * Utility *
    ***********/
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
  
  def `object`[TList /* <: List[List[_]] */](list: TList): Dictionary[PairValue[TypeOfList[TList]]] = js.native
  /**
    * Converts lists into objects. Pass either a single `list` of
    * [key, value] pairs, or a `list` of keys and a list of `values`.
    * Passing by pairs is the reverse of pairs. If duplicate keys exist,
    * the last value wins.
    * @param list A list of [key, value] pairs or a list of keys.
    * @param values If `list` is a list of keys, a list of values
    * corresponding to those keys.
    * @returns An object comprised of the provided keys and values.
    **/
  def `object`[TList /* <: List[String | Double] */, TValue](list: TList, values: List[TValue]): Dictionary[js.UndefOr[TValue]] = js.native
  
  /**
    * Return a copy of `object` that is filtered to not have values for
    * the keys selected by a truth test.
    * @param object The object to omit specific keys from.
    * @param iterator A truth test that selects the keys to omit from
    * `object`.
    * @returns A copy of `object` without the keys selected by
    * `iterator`.
    **/
  def omit[V](`object`: V, iterator: ObjectIterator[TypeOfDictionary[V, _], Boolean, V]): Partial[V] = js.native
  /**
    * Return a copy of `object` that is filtered to omit the disallowed
    * keys (or array of keys).
    * @param object The object to omit specific keys from.
    * @param keys The keys to omit from `object`.
    * @returns A copy of `object` without the `keys` properties.
    **/
  def omit[V, K /* <: String */](`object`: V, keys: (K | js.Array[K])*): Omit[V, K] = js.native
  
  /**
    * Creates a version of the function that can only be called one time. Repeated calls to the modified
    * function will have no effect, returning the value from the original call. Useful for initialization
    * functions, instead of having to set a boolean flag and then check it later.
    * @param fn Function to only execute once.
    * @return Copy of `fn` that can only be invoked once.
    **/
  def once[T /* <: js.Function */](fn: T): T = js.native
  
  /**
    * Converts `object` into a list of [key, value] pairs. The opposite
    * of the single-argument signature of `_.object`.
    * @param object The object to convert.
    * @returns The list of [key, value] pairs from `object`.
    **/
  def pairs[V /* <: js.Object */](`object`: V): js.Array[js.Tuple2[Extract[/* keyof V */ String, String], TypeOfCollection[V, _]]] = js.native
  
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
  def partition[V /* <: Collection[_] */](list: V): js.Tuple2[
    js.Array[TypeOfCollection[V, scala.Nothing]], 
    js.Array[TypeOfCollection[V, scala.Nothing]]
  ] = js.native
  def partition[V /* <: Collection[_] */](
    list: V,
    iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): js.Tuple2[
    js.Array[TypeOfCollection[V, scala.Nothing]], 
    js.Array[TypeOfCollection[V, scala.Nothing]]
  ] = js.native
  def partition[V /* <: Collection[_] */](list: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Tuple2[
    js.Array[TypeOfCollection[V, scala.Nothing]], 
    js.Array[TypeOfCollection[V, scala.Nothing]]
  ] = js.native
  
  /**
    * Return a copy of `object` that is filtered to only have values for
    * the keys selected by a truth test.
    * @param object The object to pick specific keys in.
    * @param iterator A truth test that selects the keys to keep on
    * `object`.
    * @returns A copy of `object` with only the keys selected by
    * `iterator`.
    **/
  def pick[V](`object`: V, iterator: ObjectIterator[TypeOfDictionary[V, _], Boolean, V]): Partial[V] = js.native
  /**
    * Return a copy of `object` that is filtered to only have values for
    * the allowed keys (or array of keys).
    * @param object The object to pick specific keys in.
    * @param keys The keys to keep on `object`.
    * @returns A copy of `object` with only the `keys` properties.
    **/
  def pick[V, K /* <: String */](`object`: V, keys: (K | js.Array[K])*): Pick[V, K] = js.native
  
  /**
    * A convenient version of what is perhaps the most common use-case for
    * map: extracting a list of property values.
    * @param collection The collection of items.
    * @param propertyName The name of a specific property to retrieve from
    * all items in `collection`.
    * @returns The set of values for the specified `propertyName` for each
    * item in `collection`.
    **/
  def pluck[V /* <: Collection[_] */](collection: V, propertyName: String): js.Array[PropertyTypeOrAny[TypeOfCollection[V, scala.Nothing], String]] = js.native
  def pluck[V /* <: Collection[_] */](collection: V, propertyName: Double): js.Array[PropertyTypeOrAny[TypeOfCollection[V, scala.Nothing], Double]] = js.native
  
  /**
    * Returns a function that will itself return the key property of any passed-in object.
    * @param key Property of the object.
    * @return Function which accept an object an returns the value of key in that object.
    **/
  def property(key: String): js.Function1[/* object */ js.Any, _] = js.native
  def property(key: js.Array[String | Double]): js.Function1[/* object */ js.Any, _] = js.native
  def property(key: Double): js.Function1[/* object */ js.Any, _] = js.native
  
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
    iteratee: MemoCollectionIterator[
      TypeOfCollection[V, scala.Nothing], 
      TResult | (TypeOfCollection[V, scala.Nothing]), 
      V
    ]
  ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
  /**
    * Also known as inject and foldl, reduce boils down a `collection` of
    * values into a single value. `memo` is the initial state of the
    * reduction, and each successive step of it should be returned by
    * `iteratee`.
    *
    * If no memo is passed to the initial invocation of reduce, `iteratee`
    * is not invoked on the first element of `collection`. The first
    * element is instead passed as the memo in the invocation of
    * `iteratee` on the next element in `collection`.
    * @param collection The collection to reduce.
    * @param iteratee The function to call on each iteration to reduce the
    * collection.
    * @param memo The initial reduce state or undefined to use the first
    * item in `collection` as initial state.
    * @param context `this` object in `iteratee`, optional.
    * @returns The reduced result.
    **/
  def reduce[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult
  ): TResult = js.native
  def reduce[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  
  def reduceRight[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[
      TypeOfCollection[V, scala.Nothing], 
      TResult | (TypeOfCollection[V, scala.Nothing]), 
      V
    ]
  ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
  /**
    * The right-associative version of reduce.
    *
    * This is not as useful in JavaScript as it would be in a language
    * with lazy evaluation.
    * @param collection The collection to reduce.
    * @param iteratee The function to call on each iteration to reduce the
    * collection.
    * @param memo The initial reduce state or undefined to use the first
    * item in `collection` as the initial state.
    * @param context `this` object in `iteratee`, optional.
    * @returns The reduced result.
    **/
  def reduceRight[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult
  ): TResult = js.native
  def reduceRight[V /* <: Collection[_] */, TResult](
    collection: V,
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  
  /**
    * Returns the values in `collection` without the elements that pass a
    * truth test (`iteratee`).
    * The opposite of filter.
    * @param collection The collection to filter.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The set of values that fail the truth test.
    **/
  def reject[V /* <: Collection[_] */](collection: V): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  def reject[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  def reject[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  
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
  
  def sample[V /* <: Collection[_] */](collection: V): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
  /**
    * Produce a random sample from `collection`. Pass a number to return
    * `n` random elements from `collection`. Otherwise a single random
    * item will be returned.
    * @param collection The collection to sample.
    * @param n The number of elements to sample from `collection`.
    * @returns A random sample of `n` elements from `collection` or a
    * single element if `n` is not specified.
    **/
  def sample[V /* <: Collection[_] */](collection: V, n: Double): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  
  /**
    * @see filter
    **/
  def select[V /* <: Collection[_] */](collection: V): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  def select[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  def select[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  /**
    * @see filter
    **/
  @JSName("select")
  var select_Original: js.Function3[
    /* collection */ Collection[_], 
    /* iteratee */ js.UndefOr[Iteratee[Collection[_], Boolean, TypeOfCollection[Collection[_], scala.Nothing]]], 
    /* context */ js.UndefOr[js.Any], 
    js.Array[TypeOfCollection[Collection[_], scala.Nothing]]
  ] = js.native
  
  /**
    * Returns a shuffled copy of `collection`, using a version of the
    * Fisher-Yates shuffle.
    * @param collection The collection to shuffle.
    * @returns A shuffled copy of `collection`.
    **/
  def shuffle[V /* <: Collection[_] */](collection: V): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  
  /**
    * Determines the number of values in `collection`.
    * @param collection The collection to determine the number of values
    * for.
    * @returns The number of values in `collection`.
    **/
  def size(collection: Collection[_]): Double = js.native
  
  /**
    * Returns true if any of the values in `collection` pass the
    * `iteratee` truth test. Short-circuits and stops traversing
    * `collection` if a true element is found.
    * @param collection The collection to evaluate.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns True if any element passed the truth test, otherwise false.
    **/
  def some[V /* <: Collection[_] */](collection: V): Boolean = js.native
  def some[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): Boolean = js.native
  def some[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
  
  /**
    * Returns a (stably) sorted copy of `collection`, ranked in ascending
    * order by the results of running each value through `iteratee`.
    * @param collection The collection to sort.
    * @param iteratee An iteratee that provides the value to sort by for
    * each item in `collection`.
    * @param context `this` object in `iteratee`, optional.
    * @returns A sorted copy of `collection`.
    **/
  def sortBy[V /* <: Collection[_] */](collection: V): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  def sortBy[V /* <: Collection[_] */](
    collection: V,
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  def sortBy[V /* <: Collection[_] */](collection: V, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  
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
    * @returns The index where `value` should be inserted into `list`.
    **/
  def sortedIndex[V /* <: List[_] */](list: V, value: TypeOfList[V]): Double = js.native
  def sortedIndex[V /* <: List[_] */](
    list: V,
    value: TypeOfList[V],
    iteratee: js.UndefOr[Iteratee[js.UndefOr[V], _, TypeOfCollection[js.UndefOr[V], scala.Nothing]]],
    context: js.Any
  ): Double = js.native
  def sortedIndex[V /* <: List[_] */](
    list: V,
    value: TypeOfList[V],
    iteratee: Iteratee[js.UndefOr[V], _, TypeOfCollection[js.UndefOr[V], scala.Nothing]]
  ): Double = js.native
  
  /**
    * @see rest
    **/
  def tail[V /* <: List[_] */](list: V): js.Array[TypeOfList[V]] = js.native
  def tail[V /* <: List[_] */](list: V, index: Double): js.Array[TypeOfList[V]] = js.native
  /**
    * @see rest
    **/
  @JSName("tail")
  var tail_Original: js.Function2[/* list */ List[_], /* index */ js.UndefOr[Double], js.Array[TypeOfList[List[_]]]] = js.native
  
  /**
    * @see first
    **/
  def take[V /* <: List[_] */](list: V): js.UndefOr[TypeOfList[V]] = js.native
  /**
    * @see first
    **/
  def take[V /* <: List[_] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
  /**
    * @see first
    **/
  @JSName("take")
  var take_Original: FnCallListN = js.native
  
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
    * By default, Underscore uses ERB-style template delimiters, change the
    * following template settings to use alternative delimiters.
    **/
  var templateSettings: TemplateSettings = js.native
  
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
    * Creates a real Array from `collection` (anything that can be
    * iterated over). Useful for transmuting the arguments object.
    * @param collection The collection to transform into an array.
    * @returns An array containing the elements of `collection`.
    **/
  def toArray[V /* <: Collection[_] */](collection: V): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  
  /**
    * The opposite of escape, replaces &amp;, &lt;, &gt;, &quot;, and &#x27; with their unescaped counterparts.
    * @param str HTML escaped string.
    * @return `str` Raw string.
    **/
  def unescape(str: String): String = js.native
  
  /**
    * Computes the union of the passed-in `lists`: the list of unique
    * items, examined in order from first list to last list, that are
    * present in one or more of the lists.
    * @param lists The lists to compute the union of.
    * @returns The union of elements within `lists`.
    **/
  def union[T](lists: List[T]*): js.Array[T] = js.native
  
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
    * @returns An array containing only the unique elements in `list`.
    **/
  def uniq[V /* <: List[_] */](list: V): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](
    list: V,
    isSorted: js.UndefOr[scala.Nothing],
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](
    list: V,
    isSorted: js.UndefOr[scala.Nothing],
    iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]
  ): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](list: V, isSorted: Boolean): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](
    list: V,
    isSorted: Boolean,
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](list: V, isSorted: Boolean, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](list: V, iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.Array[TypeOfList[V]] = js.native
  def uniq[V /* <: List[_] */](list: V, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfList[V]] = js.native
  
  /**
    * @see uniq
    **/
  def unique[V /* <: List[_] */](list: V): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](
    list: V,
    isSorted: js.UndefOr[scala.Nothing],
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](
    list: V,
    isSorted: js.UndefOr[scala.Nothing],
    iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]
  ): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](list: V, isSorted: Boolean): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](
    list: V,
    isSorted: Boolean,
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](list: V, isSorted: Boolean, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](list: V, iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.Array[TypeOfList[V]] = js.native
  def unique[V /* <: List[_] */](list: V, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfList[V]] = js.native
  
  /**
    * Generate a globally-unique id for client-side models or DOM elements that need one.
    * If prefix is passed, the id will be appended to it. Without prefix, returns an integer.
    * @param prefix A prefix string to start the unique ID with.
    * @return Unique string ID beginning with `prefix`.
    **/
  def uniqueId(): String = js.native
  def uniqueId(prefix: String): String = js.native
  
  /**
    * @see uniq
    **/
  @JSName("unique")
  var unique_Original: FnCallListIsSortedIterateeContext = js.native
  
  /**
    * The opposite of zip. Given a list of lists, returns a series of new
    * arrays, the first of which contains all of the first elements in the
    * input lists, the second of which contains all of the second
    * elements, and so on.
    * @param lists The lists to unzip.
    * @returns The unzipped version of `lists`.
    **/
  def unzip(lists: List[List[_]]): js.Array[js.Array[_]] = js.native
  
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
    * Looks through each value in `collection`, returning an array of all
    * the elements that match the key-value pairs listed in `properties`.
    * @param collection The collection in which to find elements that
    * match `properties`.
    * @param properties The properties to check for on the elements within
    * `collection`.
    * @returns The elements in `collection` that match `properties`.
    **/
  def where[V /* <: Collection[_] */](collection: V, properties: Partial[TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
  
  /**
    * Returns a copy of `list` with all instances of `values` removed.
    * @param list The list to exclude `values` from.
    * @param values The values to exclude from `list`.
    * @returns An array that contains all elements of `list` except for
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
    * Merges together the values of each of the `lists` with the values at
    * the corresponding position. Useful when you have separate data
    * sources that are coordinated through matching list indexes.
    * @param lists The lists to zip.
    * @returns The zipped version of `lists`.
    **/
  def zip(lists: List[_]*): js.Array[js.Array[_]] = js.native
}
