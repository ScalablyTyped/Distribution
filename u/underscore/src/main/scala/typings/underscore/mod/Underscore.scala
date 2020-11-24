package typings.underscore.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Extract
import typings.std.Partial
import typings.underscore.anon.FnCallIsSortedIterateeCotext
import typings.underscore.anon.FnCallIterateeContext
import typings.underscore.anon.FnCallIterateeMemoContext
import typings.underscore.anon.FnCallN
import typings.underscore.underscoreBooleans.`false`
import typings.underscore.underscoreBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Underscore[T, V] extends js.Object {
  
  /**
    * Wrapped type `number`.
    * @see _.after
    **/
  def after(fn: js.Function): js.Function = js.native
  
  /**
    * @see every
    **/
  def all(): Boolean = js.native
  def all(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], context: js.Any): Boolean = js.native
  def all(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
  
  /**
    * Wrapped type `object`.
    * @see _.allKeys
    **/
  def allKeys(): js.Array[String] = js.native
  
  /**
    * @see every
    **/
  @JSName("all")
  var all_Original: js.Function2[
    /* iteratee */ js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], 
    /* context */ js.UndefOr[js.Any], 
    Boolean
  ] = js.native
  
  /**
    * @see some
    **/
  def any(): Boolean = js.native
  def any(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], context: js.Any): Boolean = js.native
  def any(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
  /**
    * @see some
    **/
  @JSName("any")
  var any_Original: js.Function2[
    /* iteratee */ js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], 
    /* context */ js.UndefOr[js.Any], 
    Boolean
  ] = js.native
  
  /**
    * Wrapped type `number`.
    * @see _.before
    **/
  def before(fn: js.Function): js.Function = js.native
  
  /*************
    * Functions *
    *************/
  /**
    * Wrapped type `Function`.
    * @see _.bind
    **/
  def bind(`object`: js.Any, args: js.Any*): js.Function = js.native
  
  /**
    * Wrapped type `object`.
    * @see _.bindAll
    **/
  def bindAll(methodNames: String*): js.Any = js.native
  
  /************
    * Chaining *
    ************/
  /**
    * Returns a wrapped object. Calling methods on this object will
    * continue to return wrapped objects until value() is used.
    * @returns An underscore chain wrapper around the wrapped value.
    **/
  def chain(): Chain[T, V] = js.native
  
  /**
    * Chunks the wrapped list into multiple arrays, each containing
    * `length` or fewer items.
    * @param length The maximum size of the chunks.
    * @returns The contents of the wrapped list in chunks no greater than
    * `length` in size.
    **/
  def chunk(length: Double): js.Array[js.Array[T]] = js.native
  
  /**
    * @see map
    **/
  def collect(): js.Array[IterateeResult[Null, T]] = js.native
  def collect(iteratee: js.UndefOr[scala.Nothing], context: js.Any): js.Array[IterateeResult[js.UndefOr[scala.Nothing], T]] = js.native
  /**
    * @see map
    **/
  def collect(iteratee: String): js.Array[IterateeResult[String, T]] = js.native
  def collect(iteratee: String, context: js.Any): js.Array[IterateeResult[String, T]] = js.native
  /**
    * @see map
    **/
  def collect(iteratee: js.Array[String | Double]): js.Array[IterateeResult[js.Array[String | Double], T]] = js.native
  def collect(iteratee: js.Array[String | Double], context: js.Any): js.Array[IterateeResult[js.Array[String | Double], T]] = js.native
  /**
    * @see map
    **/
  def collect(iteratee: Double): js.Array[IterateeResult[Double, T]] = js.native
  def collect(iteratee: Double, context: js.Any): js.Array[IterateeResult[Double, T]] = js.native
  def collect(iteratee: Null, context: js.Any): js.Array[IterateeResult[Null, T]] = js.native
  /**
    * @see map
    **/
  def collect[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
    */ typings.underscore.underscoreStrings.Underscore with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I): js.Array[IterateeResult[I, T]] = js.native
  def collect[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
    */ typings.underscore.underscoreStrings.Underscore with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I, context: js.Any): js.Array[IterateeResult[I, T]] = js.native
  /**
    * @see map
    **/
  @JSName("collect")
  var collect_Original: FnCallIterateeContext[T, V] = js.native
  
  /**
    * Returns a copy of the wrapped list with all falsy values removed. In
    * JavaScript, false, null, 0, "", undefined and NaN are all falsy.
    * @returns An array containing the elements of the wrapped list without
    * falsy values.
    **/
  def compact(): js.Array[Truthy[T]] = js.native
  
  /**
    * Wrapped type `Function[]`.
    * @see _.compose
    **/
  def compose(functions: js.Function*): js.Function = js.native
  
  /**
    * Wrapped type `any`.
    * @see _.constant
    **/
  def constant(): js.Function0[T] = js.native
  
  /**
    * Returns true if the value is present in the wrapped collection. Uses
    * indexOf internally, if the wrapped collection is a List. Use
    * `fromIndex` to start your search at a given index.
    * @param value The value to check the wrapped collection for.
    * @param fromIndex The index to start searching from, optional,
    * default = 0, only used when the wrapped collection is a List.
    * @returns True if `value` is present in the wrapped collection after
    * `fromIndex`, otherwise false.
    **/
  def contains(value: js.Any): Boolean = js.native
  def contains(value: js.Any, fromIndex: Double): Boolean = js.native
  
  /**
    * Sorts the wrapped collection into groups and returns a count for the
    * number of objects in each group. Similar to `groupBy`, but instead
    * of returning a list of values, returns a count for the number of
    * values in that group.
    * @param iteratee An iteratee that provides the value to count by for
    * each item in the wrapped collection.
    * @param context `this` object in `iteratee`, optional.
    * @returns A dictionary with the group names provided by `iteratee` as
    * properties where each property contains the count of the grouped
    * elements from the wrapped collection.
    **/
  def countBy(): Dictionary[Double] = js.native
  def countBy(
    iteratee: js.UndefOr[Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): Dictionary[Double] = js.native
  def countBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Dictionary[Double] = js.native
  
  /**
    * Wrapped type `any`.
    * @see _.create
    **/
  def create(): js.Any = js.native
  def create(props: js.Object): js.Any = js.native
  
  /**
    * Wrapped type `Function`.
    * @see _.debounce
    **/
  def debounce(wait: Double): js.Function with Cancelable = js.native
  def debounce(wait: Double, immediate: Boolean): js.Function with Cancelable = js.native
  
  /**
    * Wrapped type `object`.
    * @see _.defaults
    **/
  def defaults(defaults: js.Any*): js.Any = js.native
  
  /**
    * Wrapped type `Function`.
    * @see _.defer
    **/
  def defer(args: js.Any*): Unit = js.native
  
  /**
    * @see _.delay
    **/
  def delay(args: js.Any*): js.Any = js.native
  /**
    * Wrapped type `Function`.
    * @see _.delay
    **/
  def delay(wait: Double, args: js.Any*): js.Any = js.native
  
  /**
    * @see find
    **/
  def detect(): js.UndefOr[T] = js.native
  def detect(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.UndefOr[T] = js.native
  def detect(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.UndefOr[T] = js.native
  /**
    * @see find
    **/
  @JSName("detect")
  var detect_Original: js.Function2[
    /* iteratee */ js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], 
    /* context */ js.UndefOr[js.Any], 
    js.UndefOr[T]
  ] = js.native
  
  /**
    * Similar to without, but returns the values from the wrapped list
    * that are not present in `others`.
    * @param list The starting list.
    * @param others The lists of values to exclude from the wrapped list.
    * @returns The contents of the wrapped list without the values in
    * `others`.
    **/
  def difference(others: List[T]*): js.Array[T] = js.native
  
  /**
    * @see rest
    **/
  def drop(): js.Array[T] = js.native
  def drop(n: Double): js.Array[T] = js.native
  /**
    * @see rest
    **/
  @JSName("drop")
  var drop_Original: js.Function1[/* n */ js.UndefOr[Double], js.Array[T]] = js.native
  
  /***************
    * Collections *
    ***************/
  /**
    * Iterates over the wrapped collection of elements, yielding each in
    * turn to an `iteratee`. The `iteratee` is bound to the context object,
    * if one is passed.
    * @param iteratee The iteratee to call for each element in the wrapped
    * collection.
    * @param context 'this' object in `iteratee`, optional.
    * @returns The originally wrapped collection.
    **/
  def each(iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V]): V = js.native
  def each(iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V], context: js.Any): V = js.native
  
  /**
    * Wrapped type `string`.
    * @see _.escape
    **/
  def escape(): String = js.native
  
  /**
    * Returns true if all of the values in the wrapped collection pass the
    * `iteratee` truth test. Short-circuits and stops traversing the
    * wrapped collection if a false element is found.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns True if all elements pass the truth test, otherwise false.
    **/
  def every(): Boolean = js.native
  def every(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], context: js.Any): Boolean = js.native
  def every(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
  
  /**
    * Wrapped type `object`.
    * @see _.extend
    **/
  def extend(sources: js.Any*): js.Any = js.native
  
  /**
    * Looks through each value in the wrapped collection, returning an
    * array of all the values that pass a truth test (`iteratee`).
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The set of values that pass the truth test.
    **/
  def filter(): js.Array[T] = js.native
  def filter(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.Array[T] = js.native
  def filter(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
  
  /**
    * Looks through each value in the wrapped collection, returning the
    * first one that passes a truth test (`iteratee`), or undefined if no
    * value passes the test. The function returns as soon as it finds an
    * acceptable element, and doesn't traverse the entire collection.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The first element in the wrapped collection that passes the
    * truth test or undefined if no elements pass.
    **/
  def find(): js.UndefOr[T] = js.native
  def find(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.UndefOr[T] = js.native
  def find(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.UndefOr[T] = js.native
  
  /**
    * Returns the first index of an element in the wrapped list where the
    * `iteratee` truth test passes, otherwise returns -1.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The index of the first element in the wrapped list where
    * the truth test passes or -1 if no elements pass.
    **/
  def findIndex(): Double = js.native
  def findIndex(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], context: js.Any): Double = js.native
  def findIndex(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Double = js.native
  
  /**
    * Similar to `findIndex` but for keys in objects. Returns the key
    * where the `iteratee` truth test passes or undefined.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The first element in the wrapped object that passes the
    * truth test or undefined if no elements pass.
    */
  def findKey(): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
  def findKey(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, _]]], context: js.Any): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
  def findKey(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, _]]): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
  
  /**
    * Returns the last index of an element in the wrapped list where the
    * `iteratee` truth test passes, otherwise returns -1.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The index of the last element in the wrapped list where the
    * truth test passes or -1 if no elements pass.
    **/
  def findLastIndex(): Double = js.native
  def findLastIndex(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], context: js.Any): Double = js.native
  def findLastIndex(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Double = js.native
  
  /**
    * Looks through the wrapped collection and returns the first value
    * that matches all of the key-value pairs listed in `properties`. If
    * no match is found, or if list is empty, undefined will be returned.
    * @param properties The properties to check for on the elements within
    * the wrapped collection.
    * @returns The first element in the wrapped collection that matches
    * `properties` or undefined if no match is found.
    **/
  def findWhere(properties: Partial[T]): js.UndefOr[T] = js.native
  
  /**********
    * Arrays *
    **********/
  /**
    * Returns the first element of the wrapped list. Passing `n` will
    * return the first `n` elements of the wrapped list.
    * @param n The number of elements to retrieve, optional.
    * @returns The first `n` elements of the wrapped list or the first
    * element if `n` is omitted.
    **/
  def first(): js.UndefOr[T] = js.native
  def first(n: Double): js.Array[T] = js.native
  
  /**
    * Flattens a nested list (the nesting can be to any depth). If you
    * pass shallow, the wrapped list will only be flattened a single
    * level.
    * @param shallow True to only flatten one level, optional,
    * default = false.
    * @returns The flattened list.
    **/
  def flatten(): js.Array[DeepestListItemOrSelf[T]] = js.native
  @JSName("flatten")
  def flatten_false(shallow: `false`): js.Array[DeepestListItemOrSelf[T]] = js.native
  @JSName("flatten")
  def flatten_true(shallow: `true`): js.Array[ListItemOrSelf[T]] = js.native
  
  /**
    * @see reduce
    **/
  def foldl[TResult](
    iteratee: MemoCollectionIterator[
      TypeOfCollection[V, scala.Nothing], 
      TResult | (TypeOfCollection[V, scala.Nothing]), 
      V
    ]
  ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
  /**
    * @see reduce
    **/
  def foldl[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): TResult = js.native
  def foldl[TResult](
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  /**
    * @see reduce
    **/
  @JSName("foldl")
  var foldl_Original: FnCallIterateeMemoContext[V] = js.native
  
  /**
    * @see reduceRight
    **/
  def foldr[TResult](
    iteratee: MemoCollectionIterator[
      TypeOfCollection[V, scala.Nothing], 
      TResult | (TypeOfCollection[V, scala.Nothing]), 
      V
    ]
  ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
  /**
    * @see reduceRight
    **/
  def foldr[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): TResult = js.native
  def foldr[TResult](
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  /**
    * @see reduceRight
    **/
  @JSName("foldr")
  var foldr_Original: FnCallIterateeMemoContext[V] = js.native
  
  /**
    * @see each
    **/
  def forEach(iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V]): V = js.native
  def forEach(iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V], context: js.Any): V = js.native
  /**
    * @see each
    **/
  @JSName("forEach")
  var forEach_Original: js.Function2[
    /* iteratee */ CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V], 
    /* context */ js.UndefOr[js.Any], 
    V
  ] = js.native
  
  /**
    * Wrapped type `object`.
    * @see _.functions
    **/
  def functions(): js.Array[String] = js.native
  
  /**
    * Splits the warpped collection into sets that are grouped by the
    * result of running each value through `iteratee`.
    * @param iteratee An iteratee that provides the value to group by for
    * each item in the wrapped collection.
    * @param context `this` object in `iteratee`, optional.
    * @returns A dictionary with the group names provided by `iteratee` as
    * properties where each property contains the grouped elements from
    * the wrapped collection.
    **/
  def groupBy(): Dictionary[js.Array[T]] = js.native
  def groupBy(
    iteratee: js.UndefOr[Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): Dictionary[js.Array[T]] = js.native
  def groupBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Dictionary[js.Array[T]] = js.native
  
  /**
    * Wrapped type `object`.
    * @see _.has
    **/
  def has(key: String): Boolean = js.native
  
  /**
    * @see first
    **/
  def head(): js.UndefOr[T] = js.native
  /**
    * @see first
    **/
  def head(n: Double): js.Array[T] = js.native
  /**
    * @see first
    **/
  @JSName("head")
  var head_Original: FnCallN[T] = js.native
  
  /***********
    * Utility *
    ***********/
  /**
    * Wrapped type `any`.
    * @see _.identity
    **/
  def identity(): js.Any = js.native
  
  /**
    * @see contains
    **/
  def include(value: js.Any): Boolean = js.native
  def include(value: js.Any, fromIndex: Double): Boolean = js.native
  /**
    * @see contains
    **/
  @JSName("include")
  var include_Original: js.Function2[/* value */ js.Any, /* fromIndex */ js.UndefOr[Double], Boolean] = js.native
  
  /**
    * @see contains
    **/
  def includes(value: js.Any): Boolean = js.native
  def includes(value: js.Any, fromIndex: Double): Boolean = js.native
  /**
    * @see contains
    **/
  @JSName("includes")
  var includes_Original: js.Function2[/* value */ js.Any, /* fromIndex */ js.UndefOr[Double], Boolean] = js.native
  
  /**
    * Given the warpped collection and an `iteratee` function that returns
    * a key for each element in the wrapped collection, returns an object
    * that acts as an index of each item.  Just like `groupBy`, but for when you
    * know your keys are unique.
    * @param iteratee An iteratee that provides the value to index by for
    * each item in the wrapped collection.
    * @param context `this` object in `iteratee`, optional.
    * @returns A dictionary where each item in the wrapped collection is
    * assigned to the property designated by `iteratee`.
    **/
  def indexBy(): Dictionary[T] = js.native
  def indexBy(
    iteratee: js.UndefOr[Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]],
    context: js.Any
  ): Dictionary[T] = js.native
  def indexBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Dictionary[T] = js.native
  
  /**
    * Returns the index at which `value` can be found in the wrapped list,
    * or -1 if `value` is not present. If you're working with a large list
    * and you know that the list is already sorted, pass true for
    * `isSortedOrFromIndex` to use a faster binary search...or, pass a
    * number in order to look for the first matching value in the list
    * after the given index.
    * @param value The value to search for within the wrapped list.
    * @param isSortedOrFromIndex True if the wrapped list is already
    * sorted OR the starting index for the search, optional.
    * @returns The index of the first occurrence of `value` within the
    * wrapped list or -1 if `value` is not found.
    **/
  def indexOf(value: T): Double = js.native
  def indexOf(value: T, isSortedOrFromIndex: Boolean): Double = js.native
  def indexOf(value: T, isSortedOrFromIndex: Double): Double = js.native
  
  /**
    * Returns everything but the last entry of the wrapped list.
    * Especially useful on the arguments object. Pass `n` to exclude the
    * last `n` elements from the result.
    * @param n The number of elements from the end of the wrapped list to
    * omit, optional, default = 1.
    * @returns The elements of the wrapped list with the last `n` items
    * omitted.
    **/
  def initial(): js.Array[T] = js.native
  def initial(n: Double): js.Array[T] = js.native
  
  /**
    * @see reduce
    **/
  def inject[TResult](
    iteratee: MemoCollectionIterator[
      TypeOfCollection[V, scala.Nothing], 
      TResult | (TypeOfCollection[V, scala.Nothing]), 
      V
    ]
  ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
  /**
    * @see reduce
    **/
  def inject[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): TResult = js.native
  def inject[TResult](
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  /**
    * @see reduce
    **/
  @JSName("inject")
  var inject_Original: FnCallIterateeMemoContext[V] = js.native
  
  /**
    * Computes the list of values that are the intersection of the wrapped
    * list and the passed-in `lists`. Each value in the result is present
    * in each of the lists.
    * @param lists The lists (along with the wrapped list) to compute the
    * intersection of.
    * @returns The intersection of elements within the the wrapped list
    * and `lists`.
    **/
  def intersection(lists: List[T]*): js.Array[T] = js.native
  
  /**
    * Wrapped type `object`.
    * @see _.invert
    **/
  def invert(): js.Any = js.native
  
  /**
    * Calls the method named by `methodName` on each value in the wrapped
    * collection. Any extra arguments passed to invoke will be forwarded
    * on to the method invocation.
    * @param methodName The name of the method to call on each element in
    * the wrapped collection.
    * @param args Additional arguments to pass to method `methodName`.
    * @returns An array containing the result of the method call for each
    * item in the wrapped collection.
    **/
  def invoke(methodName: String, args: js.Any*): js.Array[_] = js.native
  
  /**
    * Returns true if the wrapped object is an Arguments object.
    * @returns True if the wrapped object is an Arguments object,
    * otherwise false.
    **/
  def isArguments(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is an Array.
    * @returns True if the wrapped object is an Array, otherwise false.
    **/
  def isArray(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is a Boolean.
    * @returns True if the wrapped object is a Boolean, otherwise false.
    **/
  def isBoolean(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is a Date.
    * @returns True if the wrapped object is a Date, otherwise false.
    **/
  def isDate(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is a DOM element.
    * @returns True if the wrapped object is a DOM element, otherwise
    * false.
    **/
  def isElement(): Boolean = js.native
  
  /**
    * Returns true if the wrapped collection contains no values.
    * For strings and array-like objects checks if the length property is
    * 0.
    * @returns True if the wrapped collection has no elements.
    **/
  def isEmpty(): Boolean = js.native
  
  /**
    * Performs an optimized deep comparison between the wrapped object
    * and `other` to determine if they should be considered equal.
    * @param other Compare to the wrapped object.
    * @returns True if the wrapped object should be considered equal to
    * `other`.
    **/
  def isEqual(other: js.Any): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is a Error.
    * @returns True if the wrapped object is a Error, otherwise false.
    **/
  def isError(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is a finite Number.
    * @returns True if the wrapped object is a finite Number.
    **/
  def isFinite(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is a Function.
    * @returns True if the wrapped object is a Function, otherwise false.
    **/
  def isFunction(): Boolean = js.native
  
  /**
    * Returns true if the keys and values in `properties` are contained in
    * the wrapped object.
    * @param properties The properties to check for in the wrapped object.
    * @returns True if all keys and values in `properties` are also in the
    * wrapped object.
    **/
  def isMatch(properties: js.Any): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is NaN.
    * Note: this is not the same as the native isNaN function,
    * which will also return true if the variable is undefined.
    * @returns True if the wrapped object is NaN, otherwise false.
    **/
  def isNaN(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is null.
    * @returns True if the wrapped object is null, otherwise false.
    **/
  def isNull(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is a Number (including NaN).
    * @returns True if the wrapped object is a Number, otherwise false.
    **/
  def isNumber(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is an Object. Note that
    * JavaScript arrays and functions are objects, while (normal) strings
    * and numbers are not.
    * @returns True if the wrapped object is an Object, otherwise false.
    **/
  def isObject(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is a RegExp.
    * @returns True if the wrapped object is a RegExp, otherwise false.
    **/
  def isRegExp(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is a String.
    * @returns True if the wrapped object is a String, otherwise false.
    **/
  def isString(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is a Symbol.
    * @returns True if the wrapped object is a Symbol, otherwise false.
    **/
  def isSymbol(): Boolean = js.native
  
  /**
    * Returns true if the wrapped object is undefined.
    * @returns True if the wrapped object is undefined, otherwise false.
    **/
  def isUndefined(): Boolean = js.native
  
  /**
    * Wrapped type `string|Function|Object`.
    * @see _.iteratee
    **/
  def iteratee(): js.Function = js.native
  def iteratee(context: js.Any): js.Function = js.native
  
  /***********
    * Objects *
    ***********/
  /**
    * Wrapped type `object`.
    * @see _.keys
    **/
  def keys(): js.Array[String] = js.native
  
  /**
    * Returns the last element of the wrapped list. Passing `n` will
    * return the last `n` elements of the wrapped list.
    * @param n The number of elements to retrieve, optional.
    * @returns The last `n` elements of the wrapped list or the last
    * element if `n` is omitted.
    **/
  def last(): js.UndefOr[T] = js.native
  def last(n: Double): js.Array[T] = js.native
  
  /**
    * Returns the index of the last occurrence of `value` in the wrapped
    * list, or -1 if `value` is not present. Pass `fromIndex` to start
    * your search at a given index.
    * @param value The value to search for within the wrapped list.
    * @param fromIndex The starting index for the search, optional.
    * @returns The index of the last occurrence of `value` within the
    * wrapped list or -1 if `value` is not found.
    **/
  def lastIndexOf(value: T): Double = js.native
  def lastIndexOf(value: T, fromIndex: Double): Double = js.native
  
  def map(): js.Array[IterateeResult[Null, T]] = js.native
  def map(iteratee: js.UndefOr[scala.Nothing], context: js.Any): js.Array[IterateeResult[js.UndefOr[scala.Nothing], T]] = js.native
  /**
    * Produces a new array of values by mapping each value in the wrapped
    * collection through a transformation `iteratee`.
    * @param iteratee The iteratee to use to transform each item in the
    * wrapped collection.
    * @param context `this` object in `iteratee`, optional.
    * @returns The mapped result.
    **/
  def map(iteratee: String): js.Array[IterateeResult[String, T]] = js.native
  def map(iteratee: String, context: js.Any): js.Array[IterateeResult[String, T]] = js.native
  def map(iteratee: js.Array[String | Double]): js.Array[IterateeResult[js.Array[String | Double], T]] = js.native
  def map(iteratee: js.Array[String | Double], context: js.Any): js.Array[IterateeResult[js.Array[String | Double], T]] = js.native
  def map(iteratee: Double): js.Array[IterateeResult[Double, T]] = js.native
  def map(iteratee: Double, context: js.Any): js.Array[IterateeResult[Double, T]] = js.native
  def map(iteratee: Null, context: js.Any): js.Array[IterateeResult[Null, T]] = js.native
  def map[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
    */ typings.underscore.underscoreStrings.Underscore with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I): js.Array[IterateeResult[I, T]] = js.native
  def map[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
    */ typings.underscore.underscoreStrings.Underscore with (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I, context: js.Any): js.Array[IterateeResult[I, T]] = js.native
  
  def mapObject(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<null, V[K]>}
    */ typings.underscore.underscoreStrings.Underscore with TopLevel[V] = js.native
  def mapObject(iteratee: js.UndefOr[scala.Nothing], context: js.Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<undefined, V[K]>}
    */ typings.underscore.underscoreStrings.Underscore with TopLevel[V] = js.native
  /**
    * Like map, but for objects. Transform the value of each property in
    * turn.
    * @param iteratee The iteratee to use to transform property values.
    * @param context `this` object in `iteratee`, optional.
    * @returns A new object with all of the wrapped object's property
    * values transformed through `iteratee`.
    */
  def mapObject(iteratee: String): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<string, V[K]>}
    */ typings.underscore.underscoreStrings.Underscore with TopLevel[V] = js.native
  def mapObject(iteratee: String, context: js.Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<string, V[K]>}
    */ typings.underscore.underscoreStrings.Underscore with TopLevel[V] = js.native
  def mapObject(iteratee: js.Array[String | Double]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<std.Array<string | number>, V[K]>}
    */ typings.underscore.underscoreStrings.Underscore with TopLevel[V] = js.native
  def mapObject(iteratee: js.Array[String | Double], context: js.Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<std.Array<string | number>, V[K]>}
    */ typings.underscore.underscoreStrings.Underscore with TopLevel[V] = js.native
  def mapObject(iteratee: Double): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<number, V[K]>}
    */ typings.underscore.underscoreStrings.Underscore with TopLevel[V] = js.native
  def mapObject(iteratee: Double, context: js.Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<number, V[K]>}
    */ typings.underscore.underscoreStrings.Underscore with TopLevel[V] = js.native
  def mapObject(iteratee: Null, context: js.Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<null, V[K]>}
    */ typings.underscore.underscoreStrings.Underscore with TopLevel[V] = js.native
  def mapObject[I /* <: (CollectionIterator[TypeOfCollection[V, _], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V, any> ]:? underscore.underscore.TypeOfCollection<V, any>[P]}
    */ typings.underscore.underscoreStrings.Underscore with (TopLevel[TypeOfCollection[V, _]])) */](iteratee: I): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<I, V[K]>}
    */ typings.underscore.underscoreStrings.Underscore with TopLevel[V] = js.native
  def mapObject[I /* <: (CollectionIterator[TypeOfCollection[V, _], _, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V, any> ]:? underscore.underscore.TypeOfCollection<V, any>[P]}
    */ typings.underscore.underscoreStrings.Underscore with (TopLevel[TypeOfCollection[V, _]])) */](iteratee: I, context: js.Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof V ]: underscore.underscore.IterateeResult<I, V[K]>}
    */ typings.underscore.underscoreStrings.Underscore with TopLevel[V] = js.native
  
  /**
    * Wrapped type `any[]`.
    * @see _.matcher
    **/
  def matcher(): ListIterator[T, Boolean, List[T]] = js.native
  
  /**
    * Wrapped type `any[]`.
    * @see _.matches
    **/
  def matches(): ListIterator[T, Boolean, List[T]] = js.native
  
  /**
    * Returns the maximum value in the wrapped collection. If an
    * `iteratee` is provided, it will be used on each element to generate
    * the criterion by which the element is ranked. -Infinity is returned
    * if list is empty. Non-numerical values returned by `iteratee` will
    * be ignored.
    * @param iteratee The iteratee that provides the criterion by which
    * each element is ranked, optional if evaluating a collection of
    * numbers.
    * @param context `this` object in `iteratee`, optional.
    * @returns The maximum element within the wrapped collection or
    * -Infinity if the wrapped collection is empty.
    **/
  def max(): T | Double = js.native
  def max(iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]], context: js.Any): T | Double = js.native
  def max(iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): T | Double = js.native
  
  /**
    * Wrapped type `Function`.
    * @see _.memoize
    **/
  def memoize(): js.Function = js.native
  def memoize(hashFn: js.Function1[/* n */ js.Any, String]): js.Function = js.native
  
  /**
    * @see _.functions
    **/
  def methods(): js.Array[String] = js.native
  
  /**
    * Returns the minimum value in the wrapped collection. If an
    * `iteratee` is provided, it will be used on each element to generate
    * the criterion by which the element is ranked. Infinity is returned
    * if list is empty. Non-numerical values returned by `iteratee` will
    * be ignored.
    * @param iteratee The iteratee that provides the criterion by which
    * each element is ranked, optional if evaluating a collection of
    * numbers.
    * @param context `this` object in `iteratee`, optional.
    * @returns The minimum element within the wrapped collection or
    * Infinity if the wrapped collection is empty.
    **/
  def min(): T | Double = js.native
  def min(iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]], context: js.Any): T | Double = js.native
  def min(iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): T | Double = js.native
  
  /**
    * Wrapped type `object`.
    * @see _.mixin
    **/
  def mixin(): Unit = js.native
  
  /**
    * Wrapped type `Function`.
    * @see _.negate
    **/
  def negate(): js.Function1[/* repeated */ js.Any, Boolean] = js.native
  
  /**
    * Wrapped type `any`.
    * @see _.noop
    **/
  def noop(): Unit = js.native
  
  def `object`(): Dictionary[PairValue[T]] = js.native
  /**
    * Converts lists into objects. Call on either a wrapped list of
    * [key, value] pairs, or a wrapped list of keys and a list of
    * `values`. Passing by pairs is the reverse of pairs. If duplicate
    * keys exist, the last value wins.
    * @param values If the wrapped list is a list of keys, a list of
    * values corresponding to those keys.
    * @returns An object comprised of the provided keys and values.
    **/
  def `object`[TValue](values: List[TValue]): Dictionary[js.UndefOr[TValue]] = js.native
  
  /**
    * Return a copy of the wrapped object that is filtered to not have
    * values for the keys selected by a truth test.
    * @param iterator A truth test that selects the keys to omit from the
    * wrapped object.
    * @returns A copy of the wrapped object without the keys selected by
    * `iterator`.
    **/
  def omit(iterator: ObjectIterator[TypeOfDictionary[V, _], Boolean, V]): Partial[V] = js.native
  /**
    * Return a copy of the wrapped object that is filtered to omit the
    * disallowed keys (or array of keys).
    * @param keys The keys to omit from the wrapped object.
    * @returns A copy of the wrapped object without the `keys` properties.
    **/
  def omit[K /* <: String */](keys: (K | js.Array[K])*): Omit[V, K] = js.native
  
  /**
    * Wrapped type `Function`.
    * @see _.once
    **/
  def once(): js.Function = js.native
  
  /**
    * Convert the wrapped object into a list of [key, value] pairs. The
    * opposite of the single-argument signature of `_.object`.
    * @returns The list of [key, value] pairs from the wrapped object.
    **/
  def pairs(): js.Array[js.Tuple2[Extract[/* keyof V */ String, String], TypeOfCollection[V, _]]] = js.native
  
  /**
    * Wrapped type `Function`.
    * @see _.partial
    **/
  def partial(args: js.Any*): js.Function = js.native
  
  /**
    * Splits the wrapped collection into two arrays: one whose elements
    * all satisfy `iteratee` and one whose elements all do not satisfy
    * `iteratee`.
    * @param iteratee The iteratee that defines the partitioning scheme
    * for each element in the wrapped collection.
    * @param context `this` object in `iteratee`, optional.
    * @returns An array composed of two elements, where the first element
    * contains the elements in the wrapped collection that satisfied the
    * predicate and the second element contains the elements that did not.
    **/
  def partition(): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def partition(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def partition(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  
  /**
    * Return a copy of the wrapped object that is filtered to only have
    * values for the keys selected by a truth test.
    * @param iterator A truth test that selects the keys to keep on the
    * wrapped object.
    * @returns A copy of the wrapped object with only the keys selected by
    * `iterator`.
    **/
  def pick(iterator: ObjectIterator[TypeOfDictionary[V, _], Boolean, V]): Partial[V] = js.native
  /**
    * Return a copy of the wrapped object that is filtered to only have
    * values for the allowed keys (or array of keys).
    * @param keys The keys to keep on the wrapped object.
    * @returns A copy of the wrapped object with only the `keys`
    * properties.
    **/
  def pick[K /* <: String */](keys: (K | js.Array[K])*): Pick[V, K] = js.native
  
  /**
    * A convenient version of what is perhaps the most common use-case for
    * map: extracting a list of property values.
    * @param propertyName The name of a specific property to retrieve from
    * all items in the wrapped collection.
    * @returns The set of values for the specified `propertyName` for each
    * item in the wrapped collection.
    **/
  def pluck(propertyName: String): js.Array[PropertyTypeOrAny[T, String]] = js.native
  def pluck(propertyName: Double): js.Array[PropertyTypeOrAny[T, Double]] = js.native
  
  /**
    * Wrapped type `string`.
    * @see _.property
    **/
  def property(): js.Function1[/* object */ js.Any, _] = js.native
  
  /**
    * Wrapped type `object`.
    * @see _.propertyOf
    **/
  def propertyOf(): js.Function1[/* key */ String, _] = js.native
  
  /**
    * Wrapped type `number`.
    * @see _.random
    **/
  def random(): Double = js.native
  /**
    * Wrapped type `number`.
    * @see _.random
    **/
  def random(max: Double): Double = js.native
  
  /**
    * A function to create flexibly-numbered lists of integers, handy for
    * `each` and `map` loops. Returns a list of integers from
    * the wrapped value (inclusive) to `stop` (exclusive), incremented
    * (or decremented) by `step`. Note that ranges that `stop` before they
    * `start` are considered to be zero-length instead of negative - if
    * you'd like a negative range, use a negative `step`.
    *
    * If `stop` is not specified, the wrapped value will be the number to
    * stop at and the default start of 0 will be used.
    * @param stop The number to stop at.
    * @param step The number to count up by each iteration, optional,
    * default = 1.
    * @returns An array of numbers from start to `stop` with increments
    * of `step`.
    **/
  def range(): js.Array[Double] = js.native
  def range(stop: js.UndefOr[scala.Nothing], step: Double): js.Array[Double] = js.native
  def range(stop: Double): js.Array[Double] = js.native
  def range(stop: Double, step: Double): js.Array[Double] = js.native
  
  def reduce[TResult](
    iteratee: MemoCollectionIterator[
      TypeOfCollection[V, scala.Nothing], 
      TResult | (TypeOfCollection[V, scala.Nothing]), 
      V
    ]
  ): js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])] = js.native
  /**
    * Also known as inject and foldl, reduce boils down the wrapped
    * collection of values into a single value. `memo` is the initial
    * state of the reduction, and each successive step of it should be
    * returned by `iteratee`.
    *
    * If no memo is passed to the initial invocation of reduce, `iteratee`
    * is not invoked on the first element of the wrapped collection. The
    * first element is instead passed as the memo in the invocation of
    * `iteratee` on the next element in the wrapped collection.
    * @param iteratee The function to call on each iteration to reduce the
    * collection.
    * @param memo The initial reduce state or undefined to use the first
    * item in `collection` as initial state.
    * @param context `this` object in `iteratee`, optional.
    * @returns The reduced result.
    **/
  def reduce[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): TResult = js.native
  def reduce[TResult](
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  
  def reduceRight[TResult](
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
    * @param iteratee The function to call on each iteration to reduce the
    * collection.
    * @param memo The initial reduce state or undefined to use the first
    * item in `collection` as the initial state.
    * @param context `this` object in `iteratee`, optional.
    * @returns The reduced result.
    **/
  def reduceRight[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): TResult = js.native
  def reduceRight[TResult](
    iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
    memo: TResult,
    context: js.Any
  ): TResult = js.native
  
  /**
    * Returns the values in the wrapped collection without the elements
    * that pass a truth test (`iteratee`).
    * The opposite of filter.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The set of values that fail the truth test.
    **/
  def reject(): js.Array[T] = js.native
  def reject(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.Array[T] = js.native
  def reject(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
  
  /**
    * Returns the rest of the elements in the wrapped list. Pass an
    * `index` to return the values of the list from that index onward.
    * @param index The index to start retrieving elements from, optional,
    * default = 1.
    * @returns The elements of the wrapped list from `index` to the end
    * of the list.
    **/
  def rest(): js.Array[T] = js.native
  def rest(n: Double): js.Array[T] = js.native
  
  /**
    * Wrapped type `Function`.
    * @see _.once
    **/
  def restArgs(): js.Function = js.native
  def restArgs(starIndex: Double): js.Function = js.native
  
  /**
    * Wrapped type `object`.
    * @see _.result
    **/
  def result(property: String): js.Any = js.native
  def result(property: String, defaultValue: js.Any): js.Any = js.native
  
  def sample(): js.UndefOr[T] = js.native
  /**
    * Produce a random sample from the wrapped collection. Pass a number
    * to return `n` random elements from the wrapped collection. Otherwise
    * a single random item will be returned.
    * @param n The number of elements to sample from the wrapped
    * collection.
    * @returns A random sample of `n` elements from the wrapped collection
    * or a single element if `n` is not specified.
    **/
  def sample(n: Double): js.Array[T] = js.native
  
  /**
    * @see filter
    **/
  def select(): js.Array[T] = js.native
  def select(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.Array[T] = js.native
  def select(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
  /**
    * @see filter
    **/
  @JSName("select")
  var select_Original: js.Function2[
    /* iteratee */ js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], 
    /* context */ js.UndefOr[js.Any], 
    js.Array[T]
  ] = js.native
  
  /**
    * Returns a shuffled copy of the wrapped collection, using a version
    * of the Fisher-Yates shuffle.
    * @returns A shuffled copy of the wrapped collection.
    **/
  def shuffle(): js.Array[T] = js.native
  
  /**
    * Determines the number of values in the wrapped collection.
    * @returns The number of values in the wrapped collection.
    **/
  def size(): Double = js.native
  
  /**
    * Returns true if any of the values in the wrapped collection pass the
    * `iteratee` truth test. Short-circuits and stops traversing the
    * wrapped collection if a true element is found.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns True if any element passed the truth test, otherwise false.
    **/
  def some(): Boolean = js.native
  def some(iteratee: js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], context: js.Any): Boolean = js.native
  def some(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
  
  /**
    * Returns a (stably) sorted copy of the wrapped collection, ranked in
    * ascending order by the results of running each value through
    * `iteratee`.
    * @param iteratee An iteratee that provides the value to sort by for
    * each item in the wrapped collection.
    * @param context `this` object in `iteratee`, optional.
    * @returns A sorted copy of the wrapped collection.
    **/
  def sortBy(): js.Array[T] = js.native
  def sortBy(iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.Array[T] = js.native
  def sortBy(iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
  
  /**
    * Uses a binary search to determine the lowest index at which the
    * value should be inserted into the wrapped list in order to maintain
    * the wrapped list's sorted order. If an iteratee is provided, it will
    * be used to compute the sort ranking of each value, including the
    * value you pass.
    * @param value The value to determine an insert index for to mainain
    * the sorting in the wrapped list.
    * @param iteratee Iteratee to compute the sort ranking of each
    * element including `value`, optional.
    * @param context `this` object in `iteratee`, optional.
    * @returns The index where `value` should be inserted into the wrapped
    * list.
    **/
  def sortedIndex(value: T): Double = js.native
  def sortedIndex(
    value: T,
    iteratee: js.UndefOr[Iteratee[js.UndefOr[V], _, TypeOfCollection[js.UndefOr[V], scala.Nothing]]],
    context: js.Any
  ): Double = js.native
  def sortedIndex(value: T, iteratee: Iteratee[js.UndefOr[V], _, TypeOfCollection[js.UndefOr[V], scala.Nothing]]): Double = js.native
  
  /**
    * @see rest
    **/
  def tail(): js.Array[T] = js.native
  def tail(n: Double): js.Array[T] = js.native
  /**
    * @see rest
    **/
  @JSName("tail")
  var tail_Original: js.Function1[/* n */ js.UndefOr[Double], js.Array[T]] = js.native
  
  /**
    * @see first
    **/
  def take(): js.UndefOr[T] = js.native
  /**
    * @see first
    **/
  def take(n: Double): js.Array[T] = js.native
  /**
    * @see first
    **/
  @JSName("take")
  var take_Original: FnCallN[T] = js.native
  
  /**
    * Wrapped type `object`.
    * @see _.tap
    **/
  def tap(interceptor: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  /**
    * Wrapped type `string`.
    * @see _.template
    **/
  def template(): CompiledTemplate = js.native
  def template(settings: TemplateSettings): CompiledTemplate = js.native
  
  /**
    * Wrapped type `Function`.
    * @see _.throttle
    **/
  def throttle(wait: Double): js.Function with Cancelable = js.native
  def throttle(wait: Double, options: ThrottleSettings): js.Function with Cancelable = js.native
  
  /**
    * Wrapped type `number`.
    * @see _.times
    **/
  def times[TResult](iterator: js.Function1[/* n */ Double, TResult]): js.Array[TResult] = js.native
  def times[TResult](iterator: js.Function1[/* n */ Double, TResult], context: js.Any): js.Array[TResult] = js.native
  
  /**
    * Creates a real Array from the wrapped collection (anything that can
    * be iterated over). Useful for transmuting the arguments object.
    * @returns An array containing the elements of the wrapped collection.
    **/
  def toArray(): js.Array[T] = js.native
  
  /**
    * Wrapped type `string`.
    * @see _.unescape
    **/
  def unescape(): String = js.native
  
  /**
    * Computes the union of the wrapped list and the passed-in `lists`:
    * the list of unique items, examined in order from first list to last
    * list, that are present in one or more of the lists.
    * @param lists The lists (along with the wrapped list) to compute
    * the union of.
    * @returns The union of elements within the wrapped list and `lists`.
    **/
  def union(lists: List[T]*): js.Array[T] = js.native
  
  /**
    * Produces a duplicate-free version of the wrapped list, using === to
    * test object equality. If you know in advance that the wrapped list
    * is sorted, passing true for isSorted will run a much faster
    * algorithm. If you want to compute unique items based on a
    * transformation, pass an iteratee function.
    * @param isSorted True if the wrapped list is already sorted,
    * optional, default = false.
    * @param iteratee Transform the elements of the wrapped list before
    * comparisons for uniqueness.
    * @param context 'this' object in `iteratee`, optional.
    * @returns An array containing only the unique elements in the wrapped
    * list.
    **/
  def uniq(): js.Array[T] = js.native
  def uniq(
    isSorted: js.UndefOr[scala.Nothing],
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
    cotext: js.Any
  ): js.Array[T] = js.native
  def uniq(isSorted: js.UndefOr[scala.Nothing], iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
  def uniq(isSorted: Boolean): js.Array[T] = js.native
  def uniq(
    isSorted: Boolean,
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
    cotext: js.Any
  ): js.Array[T] = js.native
  def uniq(isSorted: Boolean, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
  def uniq(iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.Array[T] = js.native
  def uniq(iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
  
  /**
    * @see uniq
    **/
  def unique(): js.Array[T] = js.native
  def unique(
    isSorted: js.UndefOr[scala.Nothing],
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
    cotext: js.Any
  ): js.Array[T] = js.native
  def unique(isSorted: js.UndefOr[scala.Nothing], iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
  def unique(isSorted: Boolean): js.Array[T] = js.native
  def unique(
    isSorted: Boolean,
    iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]],
    cotext: js.Any
  ): js.Array[T] = js.native
  def unique(isSorted: Boolean, iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
  def unique(iteratee: js.UndefOr[Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]], context: js.Any): js.Array[T] = js.native
  def unique(iteratee: Iteratee[V, _, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
  
  /**
    * Wrapped type `string`.
    * @see _.uniqueId
    **/
  def uniqueId(): String = js.native
  
  /**
    * @see uniq
    **/
  @JSName("unique")
  var unique_Original: FnCallIsSortedIterateeCotext[V, T] = js.native
  
  /**
    * The opposite of zip. Given the wrapped list of lists, returns a
    * series of new arrays, the first of which contains all of the first
    * elements in the wrapped lists, the second of which contains all of
    * the second elements, and so on.
    * @returns The unzipped version of the wrapped lists.
    **/
  def unzip(): js.Array[js.Array[_]] = js.native
  
  /**
    * Extracts the value of the wrapped object.
    * @returns The value of the wrapped object.
    **/
  def value(): V = js.native
  
  /**
    * Wrapped type `object`.
    * @see _.values
    **/
  def values(): js.Array[T] = js.native
  
  /**
    * Looks through each value in the wrapped collection, returning an
    * array of all the elements that match the key-value pairs listed in
    * `properties`.
    * @param properties The properties to check for on the elements within
    * the wrapped collection.
    * @returns The elements in the wrapped collection that match
    * `properties`.
    **/
  def where(properties: Partial[T]): js.Array[T] = js.native
  
  /**
    * Returns a copy of the wrapped list with all instances of `values`
    * removed.
    * @param values The values to exclude from the wrapped list.
    * @returns An array that contains all elements of the wrapped list
    * except for `values`.
    **/
  def without(values: T*): js.Array[T] = js.native
  
  /**
    * Wrapped type `Function`.
    * @see _.wrap
    **/
  def wrap(wrapper: js.Function): js.Function0[js.Function] = js.native
  
  /**
    * Merges together the values of each of the `lists` (including the
    * wrapped list) with the values at the corresponding position. Useful
    * when you have separate data sources that are coordinated through
    * matching list indexes.
    * @returns The zipped version of the wrapped list and `lists`.
    **/
  def zip(lists: List[_]*): js.Array[js.Array[_]] = js.native
}
