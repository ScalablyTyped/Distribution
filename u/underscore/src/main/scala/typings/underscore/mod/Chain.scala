package typings.underscore.mod

import org.scalablytyped.runtime.TopLevel
import typings.std.Partial
import typings.std.Pick
import typings.underscore.anon.Fn0
import typings.underscore.anon.Fn1
import typings.underscore.anon.Fn2
import typings.underscore.anon.FnCallIsSortedIterateeContext
import typings.underscore.underscoreBooleans.`false`
import typings.underscore.underscoreBooleans.`true`
import typings.underscore.underscoreStrings._Chain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chain[T, V] extends js.Object {
  /**
    * @see every
    **/
  @JSName("all")
  var all_Original: js.Function2[
    /* iterator */ js.UndefOr[ChainIteratee[V, Boolean, T]], 
    /* context */ js.UndefOr[js.Any], 
    ChainSingle[Boolean]
  ] = js.native
  /**
    * @see some
    **/
  @JSName("any")
  var any_Original: js.Function2[
    /* iterator */ js.UndefOr[ChainIteratee[V, Boolean, T]], 
    /* context */ js.UndefOr[js.Any], 
    ChainSingle[Boolean]
  ] = js.native
  /**
    * @see map
    **/
  @JSName("collect")
  var collect_Original: Fn0[T, V] = js.native
  /**
    * @see find
    **/
  @JSName("detect")
  var detect_Original: js.Function2[
    /* iteratee */ js.UndefOr[ChainIteratee[V, Boolean, T]], 
    /* context */ js.UndefOr[js.Any], 
    ChainSingle[js.UndefOr[T]]
  ] = js.native
  /**
    * @see rest
    **/
  @JSName("drop")
  var drop_Original: js.Function1[/* n */ js.UndefOr[Double], Chain[T, js.Array[T]]] = js.native
  /**
    * @see reduce
    **/
  @JSName("foldl")
  var foldl_Original: Fn1[V] = js.native
  /**
    * @see reduceRight
    **/
  @JSName("foldr")
  var foldr_Original: Fn1[V] = js.native
  /**
    * @see each
    **/
  @JSName("forEach")
  var forEach_Original: js.Function2[
    /* iteratee */ CollectionIterator[TypeOfCollection[V], Unit, V], 
    /* context */ js.UndefOr[js.Any], 
    Chain[T, V]
  ] = js.native
  /**
    * @see first
    **/
  @JSName("head")
  var head_Original: Fn2[T] = js.native
  /**
    * @see contains
    **/
  @JSName("include")
  var include_Original: js.Function2[/* value */ js.Any, /* fromIndex */ js.UndefOr[Double], ChainSingle[Boolean]] = js.native
  /**
    * @see contains
    **/
  @JSName("includes")
  var includes_Original: js.Function2[/* value */ js.Any, /* fromIndex */ js.UndefOr[Double], ChainSingle[Boolean]] = js.native
  /**
    * @see reduce
    **/
  @JSName("inject")
  var inject_Original: Fn1[V] = js.native
  /**
    * @see filter
    **/
  @JSName("select")
  var select_Original: js.Function2[
    /* iteratee */ js.UndefOr[ChainIteratee[V, _, T]], 
    /* context */ js.UndefOr[js.Any], 
    Chain[T, js.Array[T]]
  ] = js.native
  /**
    * @see rest
    **/
  @JSName("tail")
  var tail_Original: js.Function1[/* n */ js.UndefOr[Double], Chain[T, js.Array[T]]] = js.native
  /**
    * @see first
    **/
  @JSName("take")
  var take_Original: Fn2[T] = js.native
  /**
    * Wrapped type List<T>.
    * @see uniq
    **/
  @JSName("unique")
  var unique_Original: FnCallIsSortedIterateeContext[V, T] = js.native
  /**
    * Wrapped type `number`.
    * @see _.after
    **/
  def after(func: js.Function): Chain[T, T] = js.native
  /**
    * @see every
    **/
  def all(): ChainSingle[Boolean] = js.native
  def all(iterator: js.UndefOr[ChainIteratee[V, Boolean, T]], context: js.Any): ChainSingle[Boolean] = js.native
  def all(iterator: ChainIteratee[V, Boolean, T]): ChainSingle[Boolean] = js.native
  /**
    * Wrapped type `object`.
    * @see _.allKeys
    **/
  def allKeys(): Chain[String, String] = js.native
  /**
    * @see some
    **/
  def any(): ChainSingle[Boolean] = js.native
  def any(iterator: js.UndefOr[ChainIteratee[V, Boolean, T]], context: js.Any): ChainSingle[Boolean] = js.native
  def any(iterator: ChainIteratee[V, Boolean, T]): ChainSingle[Boolean] = js.native
  /**
    * Wrapped type `number`.
    * @see _.before
    **/
  def before(fn: js.Function): Chain[T, T] = js.native
  /* ***********
    * Functions *
    ************ */
  /**
    * Wrapped type `Function`.
    * @see _.bind
    **/
  def bind(`object`: js.Any, args: js.Any*): Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.bindAll
    **/
  def bindAll(methodNames: String*): Chain[T, T] = js.native
  /********** *
    * Chaining *
    *********** */
  /**
    * Returns a wrapped object. Calling methods on this object will continue to return wrapped objects
    * until value() is used.
    * @returns An underscore chain wrapper around the wrapped value.
    **/
  def chain(): Chain[T, V] = js.native
  /**
    * Chunks a wrapped list into multiple arrays, each containing length or fewer items.
    * @param length The maximum size of the inner arrays.
    * @returns The wrapped chunked list.
    **/
  def chunk(length: Double): Chain[js.Array[T], js.Array[js.Array[T]]] = js.native
  /**
    * @see map
    **/
  def collect(): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
  def collect(iteratee: js.UndefOr[scala.Nothing], context: js.Any): Chain[
    IterateeResult[js.UndefOr[scala.Nothing], T], 
    js.Array[IterateeResult[js.UndefOr[scala.Nothing], T]]
  ] = js.native
  /**
    * @see map
    **/
  def collect(iteratee: String): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
  def collect(iteratee: String, context: js.Any): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
  /**
    * @see map
    **/
  def collect(iteratee: js.Array[EnumerableKey]): Chain[
    IterateeResult[js.Array[EnumerableKey], T], 
    js.Array[IterateeResult[js.Array[EnumerableKey], T]]
  ] = js.native
  def collect(iteratee: js.Array[EnumerableKey], context: js.Any): Chain[
    IterateeResult[js.Array[EnumerableKey], T], 
    js.Array[IterateeResult[js.Array[EnumerableKey], T]]
  ] = js.native
  /**
    * @see map
    **/
  def collect(iteratee: Double): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
  def collect(iteratee: Double, context: js.Any): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
  def collect(iteratee: Null, context: js.Any): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
  /**
    * @see map
    **/
  def collect[I /* <: (CollectionIterator[TypeOfCollection[js.Array[T] | V], _, js.Array[T] | V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V extends underscore.underscore.Collection<T>? V : std.Array<T>> ]:? underscore.underscore.TypeOfCollection<V extends underscore.underscore.Collection<T>? V : std.Array<T>>[P]}
    */ _Chain with (TopLevel[TypeOfCollection[js.Array[T] | V]])) */](iteratee: I): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
  def collect[I /* <: (CollectionIterator[TypeOfCollection[js.Array[T] | V], _, js.Array[T] | V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V extends underscore.underscore.Collection<T>? V : std.Array<T>> ]:? underscore.underscore.TypeOfCollection<V extends underscore.underscore.Collection<T>? V : std.Array<T>>[P]}
    */ _Chain with (TopLevel[TypeOfCollection[js.Array[T] | V]])) */](iteratee: I, context: js.Any): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
  /**
    * Returns a copy of the wrapped list with all falsy values removed. In
    * JavaScript, false, null, 0, "", undefined and NaN are all falsy.
    * @returns A chain wrapper around an array containing the elements of
    * the wrapped list without falsy values.
    **/
  def compact(): Chain[Truthy[T], js.Array[Truthy[T]]] = js.native
  /**
    * Wrapped type `Function[]`.
    * @see _.compose
    **/
  def compose(functions: js.Function*): Chain[T, T] = js.native
  /************* *
    * Array proxy *
    ************** */
  /**
    * Returns a new array comprised of the array on which it is called
    * joined with the array(s) and/or value(s) provided as arguments.
    * @param arr Arrays and/or values to concatenate into a new array. See the discussion below for details.
    * @return A new array comprised of the array on which it is called
    **/
  def concat(arr: js.Array[T]*): Chain[T, T] = js.native
  /**
    * Wrapped type `any`.
    * @see _.constant
    **/
  def constant(): Chain[T, T] = js.native
  /**
    * Returns true if the value is present in the wrapped collection. Uses
    * indexOf internally, if the wrapped collection is a List. Use
    * `fromIndex` to start your search at a given index.
    * @param value The value to check the wrapped collection for.
    * @param fromIndex The index to start searching from, optional,
    * default = 0, only used when the wrapped collection is a List.
    * @returns A chain wrapper around true if `value` is present in the
    * wrapped collection after `fromIndex`, otherwise around false.
    **/
  def contains(value: js.Any): ChainSingle[Boolean] = js.native
  def contains(value: js.Any, fromIndex: Double): ChainSingle[Boolean] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.countBy
    **/
  def countBy(): Chain[T, T] = js.native
  def countBy(iterator: js.UndefOr[scala.Nothing], context: js.Any): Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.countBy
    **/
  def countBy(iterator: String): Chain[T, T] = js.native
  def countBy(iterator: String, context: js.Any): Chain[T, T] = js.native
  def countBy(iterator: ListIterator[T, _, List[T]]): Chain[T, T] = js.native
  def countBy(iterator: ListIterator[T, _, List[T]], context: js.Any): Chain[T, T] = js.native
  /**
    * Wrapped type `any`.
    * @see _.create
    **/
  def create(): Chain[T, T] = js.native
  def create(props: js.Object): Chain[T, T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.debounce
    **/
  def debounce(wait: Double): Chain[T, T] = js.native
  def debounce(wait: Double, immediate: Boolean): Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.defaults
    **/
  def defaults(defaults: js.Any*): Chain[T, T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.defer
    **/
  def defer(args: js.Any*): Chain[T, T] = js.native
  /**
    * @see _.delay
    **/
  def delay(args: js.Any*): Chain[T, T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.delay
    **/
  def delay(wait: Double, args: js.Any*): Chain[T, T] = js.native
  /**
    * @see find
    **/
  def detect(): ChainSingle[js.UndefOr[T]] = js.native
  def detect(iteratee: js.UndefOr[ChainIteratee[V, Boolean, T]], context: js.Any): ChainSingle[js.UndefOr[T]] = js.native
  def detect(iteratee: ChainIteratee[V, Boolean, T]): ChainSingle[js.UndefOr[T]] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.difference
    **/
  def difference(others: List[T]*): Chain[T, T] = js.native
  /**
    * @see rest
    **/
  def drop(): Chain[T, js.Array[T]] = js.native
  def drop(n: Double): Chain[T, js.Array[T]] = js.native
  /* *************
    * Collections *
    ************* */
  /**
    * Iterates over the wrapped collection of elements, yielding each in
    * turn to an iteratee. The iteratee is bound to the context object, if
    * one is passed. Each invocation of `iteratee` is called with three
    * arguments: (element, key, collection).
    * @param iteratee The iteratee to call for each element in the wrapped
    * collection.
    * @param context 'this' object in `iteratee`, optional.
    * @returns A chain wrapper around the originally wrapped collection.
    **/
  def each(iteratee: CollectionIterator[TypeOfCollection[V], Unit, V]): Chain[T, V] = js.native
  def each(iteratee: CollectionIterator[TypeOfCollection[V], Unit, V], context: js.Any): Chain[T, V] = js.native
  /**
    * Wrapped type `string`.
    * @see _.escape
    **/
  def escape(): Chain[T, T] = js.native
  /**
    * Returns true if all of the values in the wrapped collection pass the
    * `iteratee` truth test. Short-circuits and stops traversing the
    * wrapped collection if a false element is found.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns A chain wrapper around true if all elements pass the truth
    * test, otherwise around false.
    **/
  def every(): ChainSingle[Boolean] = js.native
  def every(iterator: js.UndefOr[ChainIteratee[V, Boolean, T]], context: js.Any): ChainSingle[Boolean] = js.native
  def every(iterator: ChainIteratee[V, Boolean, T]): ChainSingle[Boolean] = js.native
  /**
    * Wrapped type `object`.
    * @see _.extend
    **/
  def extend(sources: js.Any*): Chain[T, T] = js.native
  /**
    * Looks through each value in the wrapped collection, returning an array of all the values that pass a truth
    * test (iteratee).
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns The set of values that pass a truth test in a chain wrapper.
    **/
  def filter(): Chain[T, js.Array[T]] = js.native
  def filter(iteratee: js.UndefOr[ChainIteratee[V, _, T]], context: js.Any): Chain[T, js.Array[T]] = js.native
  def filter(iteratee: ChainIteratee[V, _, T]): Chain[T, js.Array[T]] = js.native
  /**
    * Looks through each value in the wrapped collection, returning the first one that passes a
    * truth test (iteratee), or undefined if no value passes the test. The function
    * returns as soon as it finds an acceptable element, and doesn't traverse the entire
    * collection.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @return A chain wrapper containing the first element in the wrapped collection that passes
    * the truth test or undefined if no elements pass.
    **/
  def find(): ChainSingle[js.UndefOr[T]] = js.native
  def find(iteratee: js.UndefOr[ChainIteratee[V, Boolean, T]], context: js.Any): ChainSingle[js.UndefOr[T]] = js.native
  def find(iteratee: ChainIteratee[V, Boolean, T]): ChainSingle[js.UndefOr[T]] = js.native
  def findIndex(predicate: js.Object): ChainSingle[Double] = js.native
  def findIndex(predicate: js.Object, context: js.Any): ChainSingle[Double] = js.native
  /**
    * @see _.findIndex
    **/
  def findIndex(predicate: ListIterator[T, Boolean, List[T]]): ChainSingle[Double] = js.native
  def findIndex(predicate: ListIterator[T, Boolean, List[T]], context: js.Any): ChainSingle[Double] = js.native
  /**
    * Wrapped type `object`.
    * @see _.extend
    **/
  def findKey(predicate: ObjectIterator[_, Boolean, Dictionary[_]]): Chain[T, T] = js.native
  def findKey(predicate: ObjectIterator[_, Boolean, Dictionary[_]], context: js.Any): Chain[T, T] = js.native
  def findLastIndex(predicate: js.Object): ChainSingle[Double] = js.native
  def findLastIndex(predicate: js.Object, context: js.Any): ChainSingle[Double] = js.native
  /**
    * @see _.findLastIndex
    **/
  def findLastIndex(predicate: ListIterator[T, Boolean, List[T]]): ChainSingle[Double] = js.native
  def findLastIndex(predicate: ListIterator[T, Boolean, List[T]], context: js.Any): ChainSingle[Double] = js.native
  /**
    * Looks through the wrapped collection and returns the first value that matches all of the key-value
    * pairs listed in `properties`.
    * If no match is found, or if list is empty, undefined will be returned.
    * @param properties The properties to check for on the elements within the wrapped collection.
    * @return The first element in the wrapped collection that matches `properties` or undefined if
    * no match is found. The result will be wrapped in a chain wrapper.
    **/
  def findWhere(properties: Partial[T]): ChainSingle[js.UndefOr[T]] = js.native
  /*********
    * Arrays *
    **********/
  /**
    * Returns the first element of the wrapped list. Passing `n` will
    * return the first `n` elements of the wrapped list.
    * @param n The number of elements to retrieve, optional.
    * @returns A chain wrapper around the first `n` elements of the
    * wrapped list or around the first element if `n` is omitted.
    **/
  def first(): ChainSingle[js.UndefOr[T]] = js.native
  def first(n: Double): Chain[T, js.Array[T]] = js.native
  /**
    * Flattens the wrapped nested list (the nesting can be to any depth). If you pass shallow, the list will
    * only be flattened a single level.
    * @param shallow If true then only flatten one level, optional, default = false.
    * @returns The flattened list in a chain wrapper.
    **/
  def flatten(): Chain[DeepestListItemOrSelf[T], js.Array[DeepestListItemOrSelf[T]]] = js.native
  @JSName("flatten")
  def flatten_false(shallow: `false`): Chain[DeepestListItemOrSelf[T], js.Array[DeepestListItemOrSelf[T]]] = js.native
  @JSName("flatten")
  def flatten_true(shallow: `true`): Chain[ListItemOrSelf[T], js.Array[ListItemOrSelf[T]]] = js.native
  /**
    * @see reduce
    **/
  def foldl[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]): ChainSingle[js.UndefOr[TResult | TypeOfCollection[V]]] = js.native
  /**
    * @see reduce
    **/
  def foldl[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
  def foldl[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult, context: js.Any): ChainSingle[TResult] = js.native
  /**
    * @see reduceRight
    **/
  def foldr[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]): ChainSingle[js.UndefOr[TResult | TypeOfCollection[V]]] = js.native
  /**
    * @see reduceRight
    **/
  def foldr[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
  def foldr[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult, context: js.Any): ChainSingle[TResult] = js.native
  /**
    * @see each
    **/
  def forEach(iteratee: CollectionIterator[TypeOfCollection[V], Unit, V]): Chain[T, V] = js.native
  def forEach(iteratee: CollectionIterator[TypeOfCollection[V], Unit, V], context: js.Any): Chain[T, V] = js.native
  /**
    * Wrapped type `object`.
    * @see _.functions
    **/
  def functions(): Chain[T, T] = js.native
  /**
    * Splits a collection into sets, grouped by the result of running each value through iteratee.
    * @param iteratee An iteratee that provides the value to group by for each item in the collection.
    * @param context `this` object in `iteratee`, optional.
    * @returns A dictionary with the group names as properties where each property contains the grouped elements from the collection
    * in a chain wrapper.
    **/
  def groupBy(iterator: ChainIteratee[V, _, T]): Chain[js.Array[T], Dictionary[js.Array[T]]] = js.native
  def groupBy(iterator: ChainIteratee[V, _, T], context: js.Any): Chain[js.Array[T], Dictionary[js.Array[T]]] = js.native
  /**
    * Wrapped type `object`.
    * @see _.has
    **/
  def has(key: String): Chain[T, T] = js.native
  /**
    * @see first
    **/
  def head(): ChainSingle[js.UndefOr[T]] = js.native
  /**
    * @see first
    **/
  def head(n: Double): Chain[T, js.Array[T]] = js.native
  /********* *
    * Utility *
    ********** */
  /**
    * Wrapped type `any`.
    * @see _.identity
    **/
  def identity(): Chain[T, T] = js.native
  /**
    * @see contains
    **/
  def include(value: js.Any): ChainSingle[Boolean] = js.native
  def include(value: js.Any, fromIndex: Double): ChainSingle[Boolean] = js.native
  /**
    * @see contains
    **/
  def includes(value: js.Any): ChainSingle[Boolean] = js.native
  def includes(value: js.Any, fromIndex: Double): ChainSingle[Boolean] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.indexBy
    **/
  def indexBy(iterator: String): Chain[T, T] = js.native
  def indexBy(iterator: String, context: js.Any): Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.indexBy
    **/
  def indexBy(iterator: ListIterator[T, _, List[T]]): Chain[T, T] = js.native
  def indexBy(iterator: ListIterator[T, _, List[T]], context: js.Any): Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.indexOf
    **/
  def indexOf(value: T): ChainSingle[Double] = js.native
  def indexOf(value: T, isSorted: Boolean): ChainSingle[Double] = js.native
  /**
    * @see _.indexOf
    **/
  def indexOf(value: T, startFrom: Double): ChainSingle[Double] = js.native
  /**
    * Returns everything but the last entry of the wrapped list.
    * Especially useful on the arguments object. Pass `n` to exclude the
    * last `n` elements from the result.
    * @param n The number of elements from the end of the wrapped list to
    * omit, optional, default = 1.
    * @returns A chain wrapper around the elements of the wrapped list
    * with the last `n` items omitted.
    **/
  def initial(): Chain[T, js.Array[T]] = js.native
  def initial(n: Double): Chain[T, js.Array[T]] = js.native
  /**
    * @see reduce
    **/
  def inject[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]): ChainSingle[js.UndefOr[TResult | TypeOfCollection[V]]] = js.native
  /**
    * @see reduce
    **/
  def inject[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
  def inject[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult, context: js.Any): ChainSingle[TResult] = js.native
  /**
    * Wrapped type `any[][]`.
    * @see _.intersection
    **/
  def intersection(arrays: List[T]*): Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.invert
    **/
  def invert(): Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.invoke
    **/
  def invoke(methodName: String, args: js.Any*): Chain[T, T] = js.native
  /**
    * Returns true if the wrapped object is an Arguments object.
    * @returns True if the wrapped object is an Arguments object, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isArguments(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is an Array.
    * @returns True if the wrapped object is an Array, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isArray(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is a Boolean.
    * @returns True if the wrapped object is a Boolean, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isBoolean(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is a Date.
    * @returns True if the wrapped object is a Date, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isDate(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is a DOM element.
    * @returns True if the wrapped object is a DOM element, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isElement(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped collection contains no values.
    * For strings and array-like objects checks if the length property is 0.
    * @returns True if the wrapped collection has no elements.
    * The result will be wrapped in a chain wrapper.
    **/
  def isEmpty(): ChainSingle[Boolean] = js.native
  /**
    * Performs an optimized deep comparison between the wrapped object
    * and `other` to determine if they should be considered equal.
    * @param other Compare to the wrapped object.
    * @returns True if the wrapped object should be considered equal to `other`.
    * The result will be wrapped in a chain wrapper.
    **/
  def isEqual(other: js.Any): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is a Error.
    * @returns True if the wrapped object is a Error, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isError(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is a finite Number.
    * @returns True if the wrapped object is a finite Number.
    * The result will be wrapped in a chain wrapper.
    **/
  def isFinite(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is a Function.
    * @returns True if the wrapped object is a Function, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isFunction(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the keys and values in `properties` are contained in the wrapped object.
    * @param properties The properties to check for in the wrapped object.
    * @returns True if all keys and values in `properties` are also in the wrapped object.
    * The result will be wrapped in a chain wrapper.
    **/
  def isMatch(properties: js.Any): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is NaN.
    * Note: this is not the same as the native isNaN function,
    * which will also return true if the variable is undefined.
    * @returns True if the wrapped object is NaN, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isNaN(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is null.
    * @returns True if the wrapped object is null, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isNull(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is a Number (including NaN).
    * @returns True if the wrapped object is a Number, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isNumber(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is an Object. Note that JavaScript arrays
    * and functions are objects, while (normal) strings and numbers are not.
    * @returns True if the wrapped object is an Object, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isObject(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is a RegExp.
    * @returns True if the wrapped object is a RegExp, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isRegExp(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is a String.
    * @returns True if the wrapped object is a String, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isString(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is a Symbol.
    * @returns True if the wrapped object is a Symbol, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isSymbol(): ChainSingle[Boolean] = js.native
  /**
    * Returns true if the wrapped object is undefined.
    * @returns True if the wrapped object is undefined, otherwise false.
    * The result will be wrapped in a chain wrapper.
    **/
  def isUndefined(): ChainSingle[Boolean] = js.native
  /**
    * Wrapped type `string|Function|Object`.
    * @see _.iteratee
    **/
  def iteratee(): Chain[T, T] = js.native
  def iteratee(context: js.Any): Chain[T, T] = js.native
  /**
    * Join all elements of an array into a string.
    * @param separator Optional. Specifies a string to separate each element of the array. The separator is converted to a string if necessary. If omitted, the array elements are separated with a comma.
    * @return The string conversions of all array elements joined into one string.
    **/
  def join(): ChainSingle[T] = js.native
  def join(separator: js.Any): ChainSingle[T] = js.native
  /********* *
    * Objects *
    ********** */
  /**
    * Wrapped type `object`.
    * @see _.keys
    **/
  def keys(): Chain[String, String] = js.native
  /**
    * Returns the last element of the wrapped list. Passing `n` will
    * return the last `n` elements of the wrapped list.
    * @param n The number of elements to retrieve, optional.
    * @returns A chain wrapper around the last `n` elements of the wrapped
    * list or around the last element if `n` is omitted.
    **/
  def last(): ChainSingle[js.UndefOr[T]] = js.native
  def last(n: Double): Chain[T, js.Array[T]] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.lastIndexOf
    **/
  def lastIndexOf(value: T): ChainSingle[Double] = js.native
  def lastIndexOf(value: T, from: Double): ChainSingle[Double] = js.native
  def map(): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
  def map(iteratee: js.UndefOr[scala.Nothing], context: js.Any): Chain[
    IterateeResult[js.UndefOr[scala.Nothing], T], 
    js.Array[IterateeResult[js.UndefOr[scala.Nothing], T]]
  ] = js.native
  /**
    * Produces a new array of values by mapping each value in the wrapped collection through a transformation function
    * (iteratee). For function iteratees, each invocation of iteratee is called with three arguments:
    * (value, key, collection).
    * @param iterator Map iteratee for each element in the collection.
    * @param context `this` object in `iteratee`, optional.
    * @returns The mapped result in a chain wrapper.
    **/
  def map(iteratee: String): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
  def map(iteratee: String, context: js.Any): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
  def map(iteratee: js.Array[EnumerableKey]): Chain[
    IterateeResult[js.Array[EnumerableKey], T], 
    js.Array[IterateeResult[js.Array[EnumerableKey], T]]
  ] = js.native
  def map(iteratee: js.Array[EnumerableKey], context: js.Any): Chain[
    IterateeResult[js.Array[EnumerableKey], T], 
    js.Array[IterateeResult[js.Array[EnumerableKey], T]]
  ] = js.native
  def map(iteratee: Double): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
  def map(iteratee: Double, context: js.Any): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
  def map(iteratee: Null, context: js.Any): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
  def map[I /* <: (CollectionIterator[TypeOfCollection[js.Array[T] | V], _, js.Array[T] | V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V extends underscore.underscore.Collection<T>? V : std.Array<T>> ]:? underscore.underscore.TypeOfCollection<V extends underscore.underscore.Collection<T>? V : std.Array<T>>[P]}
    */ _Chain with (TopLevel[TypeOfCollection[js.Array[T] | V]])) */](iteratee: I): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
  def map[I /* <: (CollectionIterator[TypeOfCollection[js.Array[T] | V], _, js.Array[T] | V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof underscore.underscore.TypeOfCollection<V extends underscore.underscore.Collection<T>? V : std.Array<T>> ]:? underscore.underscore.TypeOfCollection<V extends underscore.underscore.Collection<T>? V : std.Array<T>>[P]}
    */ _Chain with (TopLevel[TypeOfCollection[js.Array[T] | V]])) */](iteratee: I, context: js.Any): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
  /**
    * Wrapped type `object`.
    * @see _.mapObject
    **/
  def mapObject(fn: ListIterator[T, _, List[T]]): Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.matcher
    **/
  def matcher(): Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.matches
    **/
  def matches(): Chain[T, T] = js.native
  /**
    * Wrapped type `number[]`.
    * @see _.max
    **/
  def max(): ChainSingle[T] = js.native
  def max(iterator: js.UndefOr[scala.Nothing], context: js.Any): ChainSingle[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.max
    **/
  def max(iterator: ListIterator[T, _ | Double, List[T]]): ChainSingle[T] = js.native
  def max(iterator: ListIterator[T, _ | Double, List[T]], context: js.Any): ChainSingle[T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.memoize
    **/
  def memoize(): Chain[T, T] = js.native
  def memoize(hashFn: js.Function1[/* n */ js.Any, String]): Chain[T, T] = js.native
  /**
    * @see _.functions
    **/
  def methods(): Chain[T, T] = js.native
  /**
    * Wrapped type `number[]`.
    * @see _.min
    **/
  def min(): ChainSingle[T] = js.native
  def min(iterator: js.UndefOr[scala.Nothing], context: js.Any): ChainSingle[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.min
    **/
  def min(iterator: ListIterator[T, _ | Double, List[T]]): ChainSingle[T] = js.native
  def min(iterator: ListIterator[T, _ | Double, List[T]], context: js.Any): ChainSingle[T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.mixin
    **/
  def mixin(): Chain[T, T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.negate
    **/
  def negate(): Chain[T, T] = js.native
  /**
    * Wrapped type `any`.
    * @see _.noop
    **/
  def noop(): Chain[T, T] = js.native
  /**
    * @see _.object
    **/
  def `object`(): Chain[T, T] = js.native
  /**
    * Wrapped type `any[][]`.
    * @see _.object
    **/
  def `object`(keyValuePairs: js.Array[_]*): Chain[T, T] = js.native
  def `object`(values: js.Any): Chain[T, T] = js.native
  def omit(iteratee: js.Function): Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.omit
    **/
  def omit(keys: String*): Chain[T, T] = js.native
  def omit(keys: js.Array[String]): Chain[T, T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.once
    **/
  def once(): Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.pairs
    **/
  def pairs(): Chain[js.Tuple2[String, _], js.Tuple2[String, _]] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.partial
    **/
  def partial(args: js.Any*): Chain[T, T] = js.native
  /**
    * Splits the wrapped collection into two arrays: one whose elements
    * all satisfy `iteratee` and one whose elements all do not satisfy
    * `iteratee`.
    * @param iteratee The iteratee that defines the partitioning scheme
    * for each element in the wrapped collection.
    * @param context `this` object in `iteratee`, optional.
    * @returns A chain wrapper around an array composed of two elements,
    * where the first element contains the elements in the wrapped
    * collection that satisfied the predicate and the second element
    * contains the elements that did not.
    **/
  def partition(): Chain[js.Array[T], js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  def partition(iteratee: js.UndefOr[ChainIteratee[V, Boolean, T]], context: js.Any): Chain[js.Array[T], js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  def partition(iteratee: ChainIteratee[V, Boolean, T]): Chain[js.Array[T], js.Tuple2[js.Array[T], js.Array[T]]] = js.native
  /**
    * Wrapped type `object`.
    * @see _.pick
    **/
  def pick[K /* <: /* keyof V */ String */](keys: K*): Chain[TypeOfDictionary[Pick[V, K]], Pick[V, K]] = js.native
  def pick[K /* <: /* keyof V */ String */](keys: js.Array[K]): Chain[TypeOfDictionary[Pick[V, K]], Pick[V, K]] = js.native
  def pick[K /* <: /* keyof V */ String */](
    predicate: ObjectIterator[
      /* import warning: importer.ImportType#apply Failed type conversion: V[K] */ js.Any, 
      Boolean, 
      Dictionary[
        /* import warning: importer.ImportType#apply Failed type conversion: V[K] */ js.Any
      ]
    ]
  ): Chain[TypeOfDictionary[Pick[V, K]], Pick[V, K]] = js.native
  /**
    * A convenient version of what is perhaps the most common use-case for map: extracting a list of
    * property values.
    * @param propertyName The name of a specific property to retrieve from all items.
    * @returns The set of values for the specified property for each item in the collection in a chain wrapper.
    **/
  def pluck(propertyName: String): Chain[PropertyTypeOrAny[T, String], js.Array[PropertyTypeOrAny[T, String]]] = js.native
  def pluck(propertyName: Double): Chain[PropertyTypeOrAny[T, Double], js.Array[PropertyTypeOrAny[T, Double]]] = js.native
  /**
    * Removes the last element from an array and returns that element.
    * @return Returns the popped element.
    **/
  def pop(): ChainSingle[T] = js.native
  /**
    * Wrapped type `string`.
    * @see _.property
    **/
  def property(): Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.propertyOf
    **/
  def propertyOf(): Chain[T, T] = js.native
  /**
    * Adds one or more elements to the end of an array and returns the new length of the array.
    * @param item The elements to add to the end of the array.
    * @return The array with the element added to the end.
    **/
  def push(item: T*): Chain[T, T] = js.native
  /**
    * Wrapped type `number`.
    * @see _.random
    **/
  def random(): Chain[T, T] = js.native
  /**
    * Wrapped type `number`.
    * @see _.random
    **/
  def random(max: Double): Chain[T, T] = js.native
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
    * @returns A chain wrapper around an array of numbers from start to
    * `stop` with increments of `step`.
    **/
  def range(): Chain[Double, js.Array[Double]] = js.native
  def range(stop: js.UndefOr[scala.Nothing], step: Double): Chain[Double, js.Array[Double]] = js.native
  def range(stop: Double): Chain[Double, js.Array[Double]] = js.native
  def range(stop: Double, step: Double): Chain[Double, js.Array[Double]] = js.native
  def reduce[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]): ChainSingle[js.UndefOr[TResult | TypeOfCollection[V]]] = js.native
  /**
    * Also known as inject and foldl, reduce boils down a collection of wrapped values into a
    * single value. Memo is the initial state of the reduction, and each successive
    * step of it should be returned by iteratee. The iteratee is passed four arguments:
    * the memo, then the value and index (or key) of the iteration, and finally a reference
    * to the entire collection.
    *
    * If no memo is passed to the initial invocation of reduce, the iteratee is not invoked
    * on the first element of the collection. The first element is instead passed as the memo
    * in the invocation of the iteratee on the next element in the collection.
    * @param iteratee Reduce iteratee function for each element in `list`.
    * @param memo Initial reduce state or undefined to use the first collection item as initial state.
    * @param context `this` object in `iteratee`, optional.
    * @returns The reduced result in a chain wraper.
    **/
  def reduce[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
  def reduce[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult, context: js.Any): ChainSingle[TResult] = js.native
  def reduceRight[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult | TypeOfCollection[V], V]): ChainSingle[js.UndefOr[TResult | TypeOfCollection[V]]] = js.native
  /**
    * The right-associative version of reduce.
    *
    * This is not as useful in JavaScript as it would be in a language with lazy evaluation.
    * @param iteratee Reduce iteratee function for each element in the wrapped collection.
    * @param memo Initial reduce state or undefined to use the first collection item as initial state.
    * @param context `this` object in `iteratee`, optional.
    * @returns The reduced result in a chain wrapper.
    **/
  def reduceRight[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
  def reduceRight[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V], TResult, V], memo: TResult, context: js.Any): ChainSingle[TResult] = js.native
  /**
    * Returns the values in the wrapped collection without the elements that pass a truth test (iteratee).
    * The opposite of filter.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @return The set of values that fail the truth test in a chain wrapper.
    **/
  def reject(): Chain[T, js.Array[T]] = js.native
  def reject(iteratee: js.UndefOr[ChainIteratee[V, Boolean, T]], context: js.Any): Chain[T, js.Array[T]] = js.native
  def reject(iteratee: ChainIteratee[V, Boolean, T]): Chain[T, js.Array[T]] = js.native
  /**
    * Returns the rest of the elements in the wrapped list. Pass an
    * `index` to return the values of the list from that index onward.
    * @param index The index to start retrieving elements from, optional,
    * default = 1.
    * @returns A chain wrapper around the elements of the wrapped list
    * from `index` to the end of the list.
    **/
  def rest(): Chain[T, js.Array[T]] = js.native
  def rest(n: Double): Chain[T, js.Array[T]] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.once
    **/
  def restArgs(): Chain[T, T] = js.native
  def restArgs(startIndex: Double): Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.result
    **/
  def result(property: String): Chain[T, T] = js.native
  def result(property: String, defaultValue: js.Any): Chain[T, T] = js.native
  /**
    * Reverses an array in place. The first array element becomes the last and the last becomes the first.
    * @return The reversed array.
    **/
  def reverse(): Chain[T, T] = js.native
  def sample(): ChainSingle[js.UndefOr[T]] = js.native
  /**
    * Produce a random sample from the wrapped collection. Pass a number to return `n` random elements from the
    * wrapped collection. Otherwise a single random item will be returned.
    * @param n The number of elements to sample from the wrapped collection.
    * @return A random sample of `n` elements from the wrapped collection or a single element if `n` is not specified.
    * The result will be wrapped in a chain wrapper.
    **/
  def sample(n: Double): Chain[T, js.Array[T]] = js.native
  /**
    * @see filter
    **/
  def select(): Chain[T, js.Array[T]] = js.native
  def select(iteratee: js.UndefOr[ChainIteratee[V, _, T]], context: js.Any): Chain[T, js.Array[T]] = js.native
  def select(iteratee: ChainIteratee[V, _, T]): Chain[T, js.Array[T]] = js.native
  /**
    * Removes the first element from an array and returns that element. This method changes the length of the array.
    * @return The shifted element.
    **/
  def shift(): ChainSingle[T] = js.native
  /**
    * Returns a shuffled copy of the wrapped collection, using a version of the Fisher-Yates shuffle.
    * @return A shuffled copy of the wrapped collection in a chain wrapper.
    **/
  def shuffle(): Chain[T, js.Array[T]] = js.native
  /**
    * Wrapped type `any`.
    * @see _.size
    **/
  def size(): ChainSingle[Double] = js.native
  /**
    * Returns a shallow copy of a portion of an array into a new array object.
    * @param start Zero-based index at which to begin extraction.
    * @param end Optional. Zero-based index at which to end extraction. slice extracts up to but not including end.
    * @return A shallow copy of a portion of an array into a new array object.
    **/
  def slice(start: Double): Chain[T, T] = js.native
  def slice(start: Double, end: Double): Chain[T, T] = js.native
  /**
    * Returns true if any of the values in the wrapped collection pass the
    * `iteratee` truth test. Short-circuits and stops traversing the
    * wrapped collection if a true element is found.
    * @param iteratee The truth test to apply.
    * @param context `this` object in `iteratee`, optional.
    * @returns A chain wrapper around true if any element passed the truth
    * test, otherwise around false.
    **/
  def some(): ChainSingle[Boolean] = js.native
  def some(iterator: js.UndefOr[ChainIteratee[V, Boolean, T]], context: js.Any): ChainSingle[Boolean] = js.native
  def some(iterator: ChainIteratee[V, Boolean, T]): ChainSingle[Boolean] = js.native
  /**
    * Sorts the elements of an array in place and returns the array. The sort is not necessarily stable. The default sort order is according to string Unicode code points.
    * @param compareFn Optional. Specifies a function that defines the sort order. If omitted, the array is sorted according to each character's Unicode code point value, according to the string conversion of each element.
    * @return The sorted array.
    **/
  def sort(): Chain[T, T] = js.native
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Boolean]): Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.sortBy
    **/
  def sortBy(): Chain[T, js.Array[T]] = js.native
  def sortBy(iterator: js.UndefOr[scala.Nothing], context: js.Any): Chain[T, js.Array[T]] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.sortBy
    **/
  def sortBy(iterator: String): Chain[T, js.Array[T]] = js.native
  def sortBy(iterator: String, context: js.Any): Chain[T, js.Array[T]] = js.native
  def sortBy(iterator: ListIterator[T, _, List[T]]): Chain[T, js.Array[T]] = js.native
  def sortBy(iterator: ListIterator[T, _, List[T]], context: js.Any): Chain[T, js.Array[T]] = js.native
  /**
    * Uses a binary search to determine the lowest index at which the
    * value should be inserted into the wrapped list in order to maintain
    * the wrapped list's sorted order. If an iteratee is provided, it
    * will be used to compute the sort ranking of each value, including
    * the value you pass.
    * @param value The value to determine an insert index for to mainain
    * the sorting in the wrapped list.
    * @param iteratee Iteratee to compute the sort ranking of each element
    * including `value`, optional.
    * @param context `this` object in `iteratee`, optional.
    * @return A chain wrapper around the index where `value` should be
    * inserted into the wrapped list.
    **/
  def sortedIndex(value: T): ChainSingle[Double] = js.native
  def sortedIndex(value: T, iteratee: js.UndefOr[ChainIteratee[V, _, T]], context: js.Any): ChainSingle[Double] = js.native
  def sortedIndex(value: T, iteratee: ChainIteratee[V, _, T]): ChainSingle[Double] = js.native
  /**
    * Changes the content of an array by removing existing elements and/or adding new elements.
    * @param index Index at which to start changing the array. If greater than the length of the array, actual starting index will be set to the length of the array. If negative, will begin that many elements from the end.
    * @param quantity An integer indicating the number of old array elements to remove. If deleteCount is 0, no elements are removed. In this case, you should specify at least one new element. If deleteCount is greater than the number of elements left in the array starting at index, then all of the elements through the end of the array will be deleted.
    * @param items The element to add to the array. If you don't specify any elements, splice will only remove elements from the array.
    * @return An array containing the deleted elements. If only one element is removed, an array of one element is returned. If no elements are removed, an empty array is returned.
    **/
  def splice(index: Double, quantity: Double, items: T*): Chain[T, T] = js.native
  /**
    * @see rest
    **/
  def tail(): Chain[T, js.Array[T]] = js.native
  def tail(n: Double): Chain[T, js.Array[T]] = js.native
  /**
    * @see first
    **/
  def take(): ChainSingle[js.UndefOr[T]] = js.native
  /**
    * @see first
    **/
  def take(n: Double): Chain[T, js.Array[T]] = js.native
  /**
    * Wrapped type `object`.
    * @see _.tap
    **/
  def tap(interceptor: js.Function1[/* repeated */ js.Any, _]): Chain[T, V] = js.native
  /**
    * Wrapped type `string`.
    * @see _.template
    **/
  def template(): Chain[CompiledTemplate, CompiledTemplate] = js.native
  def template(settings: TemplateSettings): Chain[CompiledTemplate, CompiledTemplate] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.throttle
    **/
  def throttle(wait: Double): Chain[T, T] = js.native
  def throttle(wait: Double, options: ThrottleSettings): Chain[T, T] = js.native
  /**
    * Wrapped type `number`.
    * @see _.times
    **/
  def times[TResult](iterator: js.Function1[/* n */ Double, TResult]): Chain[T, T] = js.native
  def times[TResult](iterator: js.Function1[/* n */ Double, TResult], context: js.Any): Chain[T, T] = js.native
  /**
    * Creates a real Array from the wrapped collection (anything that can
    * be iterated over). Useful for transmuting the arguments object.
    * @returns A chain wrapper around an array containing the elements
    * of the wrapped collection.
    **/
  def toArray(): Chain[T, js.Array[T]] = js.native
  /**
    * Wrapped type `string`.
    * @see _.unescape
    **/
  def unescape(): Chain[T, T] = js.native
  /**
    * Wrapped type `any[][]`.
    * @see _.union
    **/
  def union(arrays: List[T]*): Chain[T, js.Array[T]] = js.native
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
    * @return A chain wrapper around an array containing only the unique
    * elements in the wrapped list.
    **/
  def uniq(): Chain[T, js.Array[T]] = js.native
  def uniq(isSorted: js.UndefOr[scala.Nothing], iteratee: js.UndefOr[ChainIteratee[V, _, T]], context: js.Any): Chain[T, js.Array[T]] = js.native
  def uniq(isSorted: js.UndefOr[scala.Nothing], iteratee: ChainIteratee[V, _, T]): Chain[T, js.Array[T]] = js.native
  def uniq(isSorted: Boolean): Chain[T, js.Array[T]] = js.native
  def uniq(isSorted: Boolean, iteratee: js.UndefOr[ChainIteratee[V, _, T]], context: js.Any): Chain[T, js.Array[T]] = js.native
  def uniq(isSorted: Boolean, iteratee: ChainIteratee[V, _, T]): Chain[T, js.Array[T]] = js.native
  def uniq(iteratee: js.UndefOr[ChainIteratee[V, _, T]], context: js.Any): Chain[T, js.Array[T]] = js.native
  def uniq(iteratee: ChainIteratee[V, _, T]): Chain[T, js.Array[T]] = js.native
  /**
    * Wrapped type List<T>.
    * @see uniq
    **/
  def unique(): Chain[T, js.Array[T]] = js.native
  def unique(isSorted: js.UndefOr[scala.Nothing], iteratee: js.UndefOr[ChainIteratee[V, _, T]], context: js.Any): Chain[T, js.Array[T]] = js.native
  def unique(isSorted: js.UndefOr[scala.Nothing], iteratee: ChainIteratee[V, _, T]): Chain[T, js.Array[T]] = js.native
  def unique(isSorted: Boolean): Chain[T, js.Array[T]] = js.native
  def unique(isSorted: Boolean, iteratee: js.UndefOr[ChainIteratee[V, _, T]], context: js.Any): Chain[T, js.Array[T]] = js.native
  def unique(isSorted: Boolean, iteratee: ChainIteratee[V, _, T]): Chain[T, js.Array[T]] = js.native
  def unique(iteratee: js.UndefOr[ChainIteratee[V, _, T]], context: js.Any): Chain[T, js.Array[T]] = js.native
  def unique(iteratee: ChainIteratee[V, _, T]): Chain[T, js.Array[T]] = js.native
  /**
    * Wrapped type `string`.
    * @see _.uniqueId
    **/
  def uniqueId(): Chain[T, T] = js.native
  /**
    * Adds one or more elements to the beginning of an array and returns the new length of the array.
    * @param items The elements to add to the front of the array.
    * @return The array with the element added to the beginning.
    **/
  def unshift(items: T*): Chain[T, T] = js.native
  /**
    * Wrapped type `any[][]`.
    * @see _.unzip
    **/
  def unzip(arrays: js.Array[_]*): Chain[T, T] = js.native
  /**
    * Extracts the value of the wrapped object.
    * @returns The value of the wrapped object.
    **/
  def value(): V = js.native
  /**
    * Wrapped type `object`.
    * @see _.values
    **/
  def values(): Chain[_, _] = js.native
  /**
    * Looks through each value in the wrapped collection, returning an array of all the values that matches the
    * key-value pairs listed in `properties`.
    * @param properties The properties to check for on the elements within the wrapped collection.
    * @return The elements in the wrapped collection that match `properties` in a chain wrapper.
    **/
  def where(properties: Partial[T]): Chain[T, js.Array[T]] = js.native
  /**
    * Returns a copy of the wrapped list with all instances of `values`
    * removed.
    * @param values The values to exclude from the wrapped list.
    * @return A chain wrapper around an array that contains all elements
    * of the wrapped list except for `values`.
    **/
  def without(values: T*): Chain[T, js.Array[T]] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.wrap
    **/
  def wrap(wrapper: js.Function): js.Function0[Chain[T, T]] = js.native
  /**
    * Wrapped type `any[][]`.
    * @see _.zip
    **/
  def zip(arrays: js.Array[_]*): Chain[T, T] = js.native
}

