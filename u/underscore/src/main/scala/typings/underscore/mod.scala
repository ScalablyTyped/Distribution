package typings.underscore

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Exclude
import typings.std.Extract
import typings.std.Partial
import typings.underscore.anon.Fn0
import typings.underscore.anon.Fn1
import typings.underscore.anon.Fn2
import typings.underscore.anon.FnCall
import typings.underscore.anon.FnCallCollectionIterateeMemoContext
import typings.underscore.anon.FnCallIsSortedIterateeContext
import typings.underscore.anon.FnCallIsSortedIterateeCotext
import typings.underscore.anon.FnCallIterateeContext
import typings.underscore.anon.FnCallIterateeMemoContext
import typings.underscore.anon.FnCallListIsSortedIterateeContext
import typings.underscore.anon.FnCallListN
import typings.underscore.anon.FnCallN
import typings.underscore.underscoreBooleans.`false`
import typings.underscore.underscoreBooleans.`true`
import typings.underscore.underscoreInts.`1`
import typings.underscore.underscoreStrings._Chain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("underscore", JSImport.Namespace)
  @js.native
  val ^ : UnderscoreStatic = js.native
  
  /* Rewritten from type alias, can be one of: 
    - scala.Unit
    - scala.Null
    - typings.underscore.underscoreBooleans.`false`
    - typings.underscore.underscoreStrings._empty
    - typings.underscore.underscoreInts.`0`
  */
  type AnyFalsy = js.UndefOr[_AnyFalsy | Null]
  
  trait Cancelable extends StObject {
    
    def cancel(): Unit
  }
  object Cancelable {
    
    inline def apply(cancel: () => Unit): Cancelable = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[Cancelable]
    }
    
    extension [Self <: Cancelable](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Chain[T, V] extends StObject {
    
    /**
      * Wrapped type `number`.
      * @see _.after
      **/
    def after(func: js.Function): Chain[T, js.Array[T]] = js.native
    
    /**
      * @see every
      **/
    def all(): ChainSingle[Boolean] = js.native
    def all(iterator: Unit, context: Any): ChainSingle[Boolean] = js.native
    def all(iterator: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): ChainSingle[Boolean] = js.native
    def all(iterator: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): ChainSingle[Boolean] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.allKeys
      **/
    def allKeys(): Chain[String, js.Array[String]] = js.native
    
    /**
      * @see every
      **/
    @JSName("all")
    var all_Original: js.Function2[
        /* iterator */ js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], 
        /* context */ js.UndefOr[Any], 
        ChainSingle[Boolean]
      ] = js.native
    
    /**
      * @see some
      **/
    def any(): ChainSingle[Boolean] = js.native
    def any(iterator: Unit, context: Any): ChainSingle[Boolean] = js.native
    def any(iterator: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): ChainSingle[Boolean] = js.native
    def any(iterator: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): ChainSingle[Boolean] = js.native
    /**
      * @see some
      **/
    @JSName("any")
    var any_Original: js.Function2[
        /* iterator */ js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], 
        /* context */ js.UndefOr[Any], 
        ChainSingle[Boolean]
      ] = js.native
    
    /**
      * Wrapped type `number`.
      * @see _.before
      **/
    def before(fn: js.Function): Chain[T, js.Array[T]] = js.native
    
    /*************
      * Functions *
      *************/
    /**
      * Wrapped type `Function`.
      * @see _.bind
      **/
    def bind(`object`: Any, args: Any*): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.bindAll
      **/
    def bindAll(methodNames: String*): Chain[T, js.Array[T]] = js.native
    
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
      * @returns A chain wrapper around the contents of the wrapped list in
      * chunks no greater than `length` in size.
      **/
    def chunk(length: Double): Chain[js.Array[T], js.Array[js.Array[T]]] = js.native
    
    /**
      * @see map
      **/
    def collect(): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
    /**
      * @see map
      **/
    def collect(iteratee: String): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
    def collect(iteratee: String, context: Any): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
    /**
      * @see map
      **/
    def collect(iteratee: js.Array[String | Double]): Chain[
        IterateeResult[js.Array[String | Double], T], 
        js.Array[IterateeResult[js.Array[String | Double], T]]
      ] = js.native
    def collect(iteratee: js.Array[String | Double], context: Any): Chain[
        IterateeResult[js.Array[String | Double], T], 
        js.Array[IterateeResult[js.Array[String | Double], T]]
      ] = js.native
    /**
      * @see map
      **/
    def collect(iteratee: Double): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
    def collect(iteratee: Double, context: Any): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
    def collect(iteratee: Null, context: Any): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
    def collect(iteratee: Unit, context: Any): Chain[IterateeResult[Unit, T], js.Array[IterateeResult[Unit, T]]] = js.native
    /**
      * @see map
      **/
    def collect[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ _Chain & (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
    def collect[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ _Chain & (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I, context: Any): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
    /**
      * @see map
      **/
    @JSName("collect")
    var collect_Original: Fn0[T, V] = js.native
    
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
    def compose(functions: js.Function*): Chain[T, js.Array[T]] = js.native
    
    /***************
      * Array proxy *
      ***************/
    /**
      * Returns a new array comprised of the array on which it is called
      * joined with the array(s) and/or value(s) provided as arguments.
      * @param arr Arrays and/or values to concatenate into a new array. See the discussion below for details.
      * @return A new array comprised of the array on which it is called
      **/
    def concat(arr: js.Array[T]*): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `any`.
      * @see _.constant
      **/
    def constant(): Chain[T, js.Array[T]] = js.native
    
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
    def contains(value: Any): ChainSingle[Boolean] = js.native
    def contains(value: Any, fromIndex: Double): ChainSingle[Boolean] = js.native
    
    /**
      * Sorts the wrapped collection into groups and returns a count for the
      * number of objects in each group. Similar to `groupBy`, but instead
      * of returning a list of values, returns a count for the number of
      * values in that group.
      * @param iteratee An iteratee that provides the value to count by for
      * each item in the wrapped collection.
      * @param context `this` object in `iteratee`, optional.
      * @returns A chain wrapper around a dictionary with the group names
      * provided by `iteratee` as properties where each property contains
      * the count of the grouped elements from the wrapped collection.
      **/
    def countBy(): Chain[Double, Dictionary[Double]] = js.native
    def countBy(iterator: Unit, context: Any): Chain[Double, Dictionary[Double]] = js.native
    def countBy(iterator: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Chain[Double, Dictionary[Double]] = js.native
    def countBy(iterator: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[Double, Dictionary[Double]] = js.native
    
    /**
      * Wrapped type `any`.
      * @see _.create
      **/
    def create(): Chain[T, js.Array[T]] = js.native
    def create(props: js.Object): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.debounce
      **/
    def debounce(wait: Double): Chain[T, js.Array[T]] = js.native
    def debounce(wait: Double, immediate: Boolean): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.defaults
      **/
    def defaults(defaults: Any*): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.defer
      **/
    def defer(args: Any*): Chain[T, js.Array[T]] = js.native
    
    /**
      * @see _.delay
      **/
    def delay(args: Any*): Chain[T, js.Array[T]] = js.native
    /**
      * Wrapped type `Function`.
      * @see _.delay
      **/
    def delay(wait: Double, args: Any*): Chain[T, js.Array[T]] = js.native
    
    /**
      * @see find
      **/
    def detect(): ChainSingle[js.UndefOr[T]] = js.native
    def detect(iteratee: Unit, context: Any): ChainSingle[js.UndefOr[T]] = js.native
    def detect(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): ChainSingle[js.UndefOr[T]] = js.native
    def detect(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): ChainSingle[js.UndefOr[T]] = js.native
    /**
      * @see find
      **/
    @JSName("detect")
    var detect_Original: js.Function2[
        /* iteratee */ js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], 
        /* context */ js.UndefOr[Any], 
        ChainSingle[js.UndefOr[T]]
      ] = js.native
    
    /**
      * Similar to without, but returns the values from the wrapped list
      * that are not present in `others`.
      * @param list The starting list.
      * @param others The lists of values to exclude from the wrapped list.
      * @returns A chain wrapper around the contents of the wrapped list
      * without the values in `others`.
      **/
    def difference(others: typings.underscore.mod.List[T]*): Chain[T, js.Array[T]] = js.native
    
    /**
      * @see rest
      **/
    def drop(): Chain[T, js.Array[T]] = js.native
    def drop(n: Double): Chain[T, js.Array[T]] = js.native
    /**
      * @see rest
      **/
    @JSName("drop")
    var drop_Original: js.Function1[/* n */ js.UndefOr[Double], Chain[T, js.Array[T]]] = js.native
    
    /***************
      * Collections *
      ***************/
    /**
      * Iterates over the wrapped collection of elements, yielding each in
      * turn to an `iteratee`. The `iteratee` is bound to the context
      * object, if one is passed.
      * @param iteratee The iteratee to call for each element in the wrapped
      * collection.
      * @param context 'this' object in `iteratee`, optional.
      * @returns A chain wrapper around the originally wrapped collection.
      **/
    def each(iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V]): Chain[T, V] = js.native
    def each(iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V], context: Any): Chain[T, V] = js.native
    
    /**
      * Wrapped type `string`.
      * @see _.escape
      **/
    def escape(): Chain[T, js.Array[T]] = js.native
    
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
    def every(iterator: Unit, context: Any): ChainSingle[Boolean] = js.native
    def every(iterator: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): ChainSingle[Boolean] = js.native
    def every(iterator: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): ChainSingle[Boolean] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.extend
      **/
    def extend(sources: Any*): Chain[T, js.Array[T]] = js.native
    
    /**
      * Looks through each value in the wrapped collection, returning an
      * array of all the values that pass a truth test (`iteratee`).
      * @param iteratee The truth test to apply.
      * @param context `this` object in `iteratee`, optional.
      * @returns A chain wrapper around the set of values that pass the
      * truth test.
      **/
    def filter(): Chain[T, js.Array[T]] = js.native
    def filter(iteratee: Unit, context: Any): Chain[T, js.Array[T]] = js.native
    def filter(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
    def filter(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
    
    /**
      * Looks through each value in the wrapped collection, returning the
      * first one that passes a truth test (`iteratee`), or undefined if no
      * value passes the test. The function returns as soon as it finds an
      * acceptable element, and doesn't traverse the entire collection.
      * @param iteratee The truth test to apply.
      * @param context `this` object in `iteratee`, optional.
      * @returns A chain wrapper around the first element in the wrapped
      * collection that passes the truth test or undefined if no elements
      * pass.
      **/
    def find(): ChainSingle[js.UndefOr[T]] = js.native
    def find(iteratee: Unit, context: Any): ChainSingle[js.UndefOr[T]] = js.native
    def find(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): ChainSingle[js.UndefOr[T]] = js.native
    def find(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): ChainSingle[js.UndefOr[T]] = js.native
    
    /**
      * Returns the first index of an element in the wrapped list where the
      * `iteratee` truth test passes, otherwise returns -1.
      * @param iteratee The truth test to apply.
      * @param context `this` object in `iteratee`, optional.
      * @returns A chain wrapper around the index of the first element in
      * the wrapped list where the truth test passes or -1 if no elements
      * pass.
      **/
    def findIndex(): ChainSingle[Double] = js.native
    def findIndex(iteratee: Unit, context: Any): ChainSingle[Double] = js.native
    def findIndex(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): ChainSingle[Double] = js.native
    def findIndex(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): ChainSingle[Double] = js.native
    
    /**
      * Similar to `findIndex` but for keys in objects. Returns the key
      * where the `iteratee` truth test passes or undefined.
      * @param iteratee The truth test to apply.
      * @param context `this` object in `iteratee`, optional.
      * @returns The first element in the wrapped object that passes the
      * truth test or undefined if no elements pass.
      */
    def findKey(): ChainSingle[js.UndefOr[Extract[/* keyof V */ String, String]]] = js.native
    def findKey(iteratee: Unit, context: Any): ChainSingle[js.UndefOr[Extract[/* keyof V */ String, String]]] = js.native
    def findKey(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, Any]]): ChainSingle[js.UndefOr[Extract[/* keyof V */ String, String]]] = js.native
    def findKey(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, Any]], context: Any): ChainSingle[js.UndefOr[Extract[/* keyof V */ String, String]]] = js.native
    
    /**
      * Returns the last index of an element in the wrapped list where the
      * `iteratee` truth test passes, otherwise returns -1.
      * @param iteratee The truth test to apply.
      * @param context `this` object in `iteratee`, optional.
      * @returns A chain wrapper around the index of the last element in the
      * wrapped list where the truth test passes or -1 if no elements pass.
      **/
    def findLastIndex(): ChainSingle[Double] = js.native
    def findLastIndex(iteratee: Unit, context: Any): ChainSingle[Double] = js.native
    def findLastIndex(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): ChainSingle[Double] = js.native
    def findLastIndex(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): ChainSingle[Double] = js.native
    
    /**
      * Looks through the wrapped collection and returns the first value
      * that matches all of the key-value pairs listed in `properties`. If
      * no match is found, or if list is empty, undefined will be returned.
      * @param properties The properties to check for on the elements within
      * the wrapped collection.
      * @returns A chain wrapper around the first element in the wrapped
      * collection that matches `properties` or undefined if no match is
      * found.
      **/
    def findWhere(properties: Partial[T]): ChainSingle[js.UndefOr[T]] = js.native
    
    /**********
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
    
    def flatten(): Chain[DeepestListItemOrSelf[T], js.Array[DeepestListItemOrSelf[T]]] = js.native
    /**
      * Flattens a nested list (the nesting can be to any depth). If you
      * pass true or 1 as the depth, the list will only be flattened a single
      * level. Passing a greater number will cause the flattening to descend
      * deeper into the nesting hierarchy. Omitting the depth argument, or
      * passing false or Infinity, flattens the list all the way to the
      * deepest nesting level.
      * @param depth True to only flatten one level, optional,
      * default = false.
      * @returns A chain wrapper around the flattened list.
      **/
    def flatten(depth: `1` | `true`): Chain[ListItemOrSelf[T], js.Array[ListItemOrSelf[T]]] = js.native
    def flatten(depth: Double): Chain[DeepestListItemOrSelf[T], js.Array[DeepestListItemOrSelf[T]]] = js.native
    @JSName("flatten")
    def flatten_false(depth: `false`): Chain[DeepestListItemOrSelf[T], js.Array[DeepestListItemOrSelf[T]]] = js.native
    
    /**
      * @see reduce
      **/
    def foldl[TResult](
      iteratee: MemoCollectionIterator[
          TypeOfCollection[V, scala.Nothing], 
          TResult | (TypeOfCollection[V, scala.Nothing]), 
          V
        ]
    ): ChainSingle[js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])]] = js.native
    /**
      * @see reduce
      **/
    def foldl[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
    def foldl[TResult](
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
    ): ChainSingle[TResult] = js.native
    /**
      * @see reduce
      **/
    @JSName("foldl")
    var foldl_Original: Fn1[V] = js.native
    
    /**
      * @see reduceRight
      **/
    def foldr[TResult](
      iteratee: MemoCollectionIterator[
          TypeOfCollection[V, scala.Nothing], 
          TResult | (TypeOfCollection[V, scala.Nothing]), 
          V
        ]
    ): ChainSingle[js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])]] = js.native
    /**
      * @see reduceRight
      **/
    def foldr[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
    def foldr[TResult](
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
    ): ChainSingle[TResult] = js.native
    /**
      * @see reduceRight
      **/
    @JSName("foldr")
    var foldr_Original: Fn1[V] = js.native
    
    /**
      * @see each
      **/
    def forEach(iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V]): Chain[T, V] = js.native
    def forEach(iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V], context: Any): Chain[T, V] = js.native
    /**
      * @see each
      **/
    @JSName("forEach")
    var forEach_Original: js.Function2[
        /* iteratee */ CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V], 
        /* context */ js.UndefOr[Any], 
        Chain[T, V]
      ] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.functions
      **/
    def functions(): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `any`.
      * @see _.get
      **/
    def get(path: String): Chain[js.UndefOr[TypeOfCollection[V, scala.Nothing]], js.UndefOr[T]] = js.native
    def get(path: js.Array[String]): Chain[js.UndefOr[TypeOfCollection[V, scala.Nothing]], js.UndefOr[T]] = js.native
    def get[U](path: String, defaultValue: U): Chain[(TypeOfCollection[V, scala.Nothing]) | U, T | U] = js.native
    def get[U](path: js.Array[String], defaultValue: U): Chain[(TypeOfCollection[V, scala.Nothing]) | U, T | U] = js.native
    @JSName("get")
    def get_U[U](path: String): Chain[(TypeOfCollection[V, scala.Nothing]) | U, T | U] = js.native
    @JSName("get")
    def get_U[U](path: js.Array[String]): Chain[(TypeOfCollection[V, scala.Nothing]) | U, T | U] = js.native
    
    /**
      * Splits the warpped collection into sets that are grouped by the
      * result of running each value through `iteratee`.
      * @param iteratee An iteratee that provides the value to group by for
      * each item in the wrapped collection.
      * @param context `this` object in `iteratee`, optional.
      * @returns A chain wrapper around a dictionary with the group names
      * provided by `iteratee` as properties where each property contains
      * the grouped elements from the wrapped collection.
      **/
    def groupBy(): Chain[js.Array[T], Dictionary[js.Array[T]]] = js.native
    def groupBy(iteratee: Unit, context: Any): Chain[js.Array[T], Dictionary[js.Array[T]]] = js.native
    def groupBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Chain[js.Array[T], Dictionary[js.Array[T]]] = js.native
    def groupBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[js.Array[T], Dictionary[js.Array[T]]] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.has
      **/
    def has(key: String): Chain[T, js.Array[T]] = js.native
    
    /**
      * @see first
      **/
    def head(): ChainSingle[js.UndefOr[T]] = js.native
    /**
      * @see first
      **/
    def head(n: Double): Chain[T, js.Array[T]] = js.native
    /**
      * @see first
      **/
    @JSName("head")
    var head_Original: Fn2[T] = js.native
    
    /***********
      * Utility *
      ***********/
    /**
      * Wrapped type `any`.
      * @see _.identity
      **/
    def identity(): Chain[T, js.Array[T]] = js.native
    
    /**
      * @see contains
      **/
    def include(value: Any): ChainSingle[Boolean] = js.native
    def include(value: Any, fromIndex: Double): ChainSingle[Boolean] = js.native
    /**
      * @see contains
      **/
    @JSName("include")
    var include_Original: js.Function2[/* value */ Any, /* fromIndex */ js.UndefOr[Double], ChainSingle[Boolean]] = js.native
    
    /**
      * @see contains
      **/
    def includes(value: Any): ChainSingle[Boolean] = js.native
    def includes(value: Any, fromIndex: Double): ChainSingle[Boolean] = js.native
    /**
      * @see contains
      **/
    @JSName("includes")
    var includes_Original: js.Function2[/* value */ Any, /* fromIndex */ js.UndefOr[Double], ChainSingle[Boolean]] = js.native
    
    /**
      * Given the warpped collection and an `iteratee` function that returns
      * a key for each element in `collection`, returns an object that acts
      * as an index of each item.  Just like `groupBy`, but for when you
      * know your keys are unique.
      * @param iteratee An iteratee that provides the value to index by for
      * each item in the wrapped collection.
      * @param context `this` object in `iteratee`, optional.
      * @returns A chain wrapper around a dictionary where each item in the
      * wrapped collection is assigned to the property designated by
      * `iteratee`.
      **/
    def indexBy(): Chain[T, Dictionary[T]] = js.native
    def indexBy(iteratee: Unit, context: Any): Chain[T, Dictionary[T]] = js.native
    def indexBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Chain[T, Dictionary[T]] = js.native
    def indexBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, Dictionary[T]] = js.native
    
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
      * @returns A chain wrapper around the index of the first occurrence of
      * `value` within the wrapped list or -1 if `value` is not found.
      **/
    def indexOf(value: T): ChainSingle[Double] = js.native
    def indexOf(value: T, isSortedOrFromIndex: Boolean): ChainSingle[Double] = js.native
    def indexOf(value: T, isSortedOrFromIndex: Double): ChainSingle[Double] = js.native
    
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
    def inject[TResult](
      iteratee: MemoCollectionIterator[
          TypeOfCollection[V, scala.Nothing], 
          TResult | (TypeOfCollection[V, scala.Nothing]), 
          V
        ]
    ): ChainSingle[js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])]] = js.native
    /**
      * @see reduce
      **/
    def inject[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
    def inject[TResult](
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
    ): ChainSingle[TResult] = js.native
    /**
      * @see reduce
      **/
    @JSName("inject")
    var inject_Original: Fn1[V] = js.native
    
    /**
      * Computes the list of values that are the intersection of the wrapped
      * list and the passed-in `lists`. Each value in the result is present
      * in each of the lists.
      * @param lists The lists (along with the wrapped list) to compute the
      * intersection of.
      * @returns A chain wrapper around the intersection of elements within
      * the the wrapped list and `lists`.
      **/
    def intersection(lists: typings.underscore.mod.List[T]*): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.invert
      **/
    def invert(): Chain[T, js.Array[T]] = js.native
    
    /**
      * Calls the method named by `methodName` on each value in the wrapped
      * collection. Any extra arguments passed to invoke will be forwarded
      * on to the method invocation.
      * @param methodName The name of the method to call on each element in
      * the wrapped collection.
      * @param args Additional arguments to pass to method `methodName`.
      * @returns A chain wrapper around an array containing the result of
      * the method call for each item in the wrapped collection.
      **/
    def invoke(methodName: String, args: Any*): Chain[Any, js.Array[Any]] = js.native
    
    /**
      * Returns true if the wrapped object is an Arguments object.
      * @returns True if the wrapped object is an Arguments object,
      * otherwise false.
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
      * Returns true if the wrapped object is an ArrayBuffer.
      * @returns True if the wrapped object is an ArrayBuffer, otherwise false.
      * The result will be wrapped in a chain wrapper.
      **/
    def isArrayBuffer(): ChainSingle[Boolean] = js.native
    
    /**
      * Returns true if the wrapped object is a Boolean.
      * @returns True if the wrapped object is a Boolean, otherwise false.
      * The result will be wrapped in a chain wrapper.
      **/
    def isBoolean(): ChainSingle[Boolean] = js.native
    
    /**
      * Returns true if the wrapped object is a DataView.
      * @returns True if the wrapped object is a DataView, otherwise false.
      * The result will be wrapped in a chain wrapper.
      **/
    def isDataView(): ChainSingle[Boolean] = js.native
    
    /**
      * Returns true if the wrapped object is a Date.
      * @returns True if the wrapped object is a Date, otherwise false.
      * The result will be wrapped in a chain wrapper.
      **/
    def isDate(): ChainSingle[Boolean] = js.native
    
    /**
      * Returns true if the wrapped object is a DOM element.
      * @returns True if the wrapped object is a DOM element, otherwise
      * false.
      * The result will be wrapped in a chain wrapper.
      **/
    def isElement(): ChainSingle[Boolean] = js.native
    
    /**
      * Returns true if the wrapped collection contains no values.
      * For strings and array-like objects checks if the length property is
      * 0.
      * @returns True if the wrapped collection has no elements.
      * The result will be wrapped in a chain wrapper.
      **/
    def isEmpty(): ChainSingle[Boolean] = js.native
    
    /**
      * Performs an optimized deep comparison between the wrapped object
      * and `other` to determine if they should be considered equal.
      * @param other Compare to the wrapped object.
      * @returns True if the wrapped object should be considered equal to
      * `other`.
      * The result will be wrapped in a chain wrapper.
      **/
    def isEqual(other: Any): ChainSingle[Boolean] = js.native
    
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
      * Returns true if the keys and values in `properties` are contained in
      * the wrapped object.
      * @param properties The properties to check for in the wrapped object.
      * @returns True if all keys and values in `properties` are also in the
      * wrapped object.
      * The result will be wrapped in a chain wrapper.
      **/
    def isMatch(properties: Any): ChainSingle[Boolean] = js.native
    
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
      * Returns true if the wrapped object is an Object. Note that
      * JavaScript arrays and functions are objects, while (normal) strings
      * and numbers are not.
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
      * Returns true if the wrapped object is a TypedArray.
      * @returns True if the wrapped object is a TypedArray, otherwise false.
      * The result will be wrapped in a chain wrapper.
      **/
    def isTypedArray(): ChainSingle[Boolean] = js.native
    
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
    def iteratee(): Chain[T, js.Array[T]] = js.native
    def iteratee(context: Any): Chain[T, js.Array[T]] = js.native
    
    /**
      * Join all elements of an array into a string.
      * @param separator Optional. Specifies a string to separate each element of the array. The separator is converted to a string if necessary. If omitted, the array elements are separated with a comma.
      * @return The string conversions of all array elements joined into one string.
      **/
    def join(): ChainSingle[T] = js.native
    def join(separator: Any): ChainSingle[T] = js.native
    
    /***********
      * Objects *
      ***********/
    /**
      * Wrapped type `object`.
      * @see _.keys
      **/
    def keys(): Chain[String, js.Array[String]] = js.native
    
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
      * Returns the index of the last occurrence of `value` in the wrapped
      * list, or -1 if `value` is not present. Pass `fromIndex` to start
      * your search at a given index.
      * @param value The value to search for within the wrapped list.
      * @param fromIndex The starting index for the search, optional.
      * @returns A chain wrapper around the index of the last occurrence of
      * `value` within the wrapped list or -1 if `value` is not found.
      **/
    def lastIndexOf(value: T): ChainSingle[Double] = js.native
    def lastIndexOf(value: T, fromIndex: Double): ChainSingle[Double] = js.native
    
    def map(): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
    /**
      * Produces a new array of values by mapping each value in the wrapped
      * collection through a transformation `iteratee`.
      * @param iteratee The iteratee to use to transform each item in the
      * wrapped collection.
      * @param context `this` object in `iteratee`, optional.
      * @returns A chain wrapper around the mapped result.
      **/
    def map(iteratee: String): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
    def map(iteratee: String, context: Any): Chain[IterateeResult[String, T], js.Array[IterateeResult[String, T]]] = js.native
    def map(iteratee: js.Array[String | Double]): Chain[
        IterateeResult[js.Array[String | Double], T], 
        js.Array[IterateeResult[js.Array[String | Double], T]]
      ] = js.native
    def map(iteratee: js.Array[String | Double], context: Any): Chain[
        IterateeResult[js.Array[String | Double], T], 
        js.Array[IterateeResult[js.Array[String | Double], T]]
      ] = js.native
    def map(iteratee: Double): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
    def map(iteratee: Double, context: Any): Chain[IterateeResult[Double, T], js.Array[IterateeResult[Double, T]]] = js.native
    def map(iteratee: Null, context: Any): Chain[IterateeResult[Null, T], js.Array[IterateeResult[Null, T]]] = js.native
    def map(iteratee: Unit, context: Any): Chain[IterateeResult[Unit, T], js.Array[IterateeResult[Unit, T]]] = js.native
    def map[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ _Chain & (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
    def map[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ _Chain & (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I, context: Any): Chain[IterateeResult[I, T], js.Array[IterateeResult[I, T]]] = js.native
    
    def mapObject(): Chain[
        IterateeResult[Null, TypeOfCollection[V, Any]], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<null, V[K]>}
      */ _Chain & TopLevel[V]
      ] = js.native
    /**
      * Like map, but for objects. Transform the value of each property in
      * turn.
      * @param iteratee The iteratee to use to transform property values.
      * @param context `this` object in `iteratee`, optional.
      * @returns A chain wrapper around a new object with all of the wrapped
      * object's property values transformed through `iteratee`.
      */
    def mapObject(iteratee: String): Chain[
        IterateeResult[String, TypeOfCollection[V, Any]], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<string, V[K]>}
      */ _Chain & TopLevel[V]
      ] = js.native
    def mapObject(iteratee: String, context: Any): Chain[
        IterateeResult[String, TypeOfCollection[V, Any]], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<string, V[K]>}
      */ _Chain & TopLevel[V]
      ] = js.native
    def mapObject(iteratee: js.Array[String | Double]): Chain[
        IterateeResult[js.Array[String | Double], TypeOfCollection[V, Any]], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<std.Array<string | number>, V[K]>}
      */ _Chain & TopLevel[V]
      ] = js.native
    def mapObject(iteratee: js.Array[String | Double], context: Any): Chain[
        IterateeResult[js.Array[String | Double], TypeOfCollection[V, Any]], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<std.Array<string | number>, V[K]>}
      */ _Chain & TopLevel[V]
      ] = js.native
    def mapObject(iteratee: Double): Chain[
        IterateeResult[Double, TypeOfCollection[V, Any]], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<number, V[K]>}
      */ _Chain & TopLevel[V]
      ] = js.native
    def mapObject(iteratee: Double, context: Any): Chain[
        IterateeResult[Double, TypeOfCollection[V, Any]], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<number, V[K]>}
      */ _Chain & TopLevel[V]
      ] = js.native
    def mapObject(iteratee: Null, context: Any): Chain[
        IterateeResult[Null, TypeOfCollection[V, Any]], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<null, V[K]>}
      */ _Chain & TopLevel[V]
      ] = js.native
    def mapObject(iteratee: Unit, context: Any): Chain[
        IterateeResult[Unit, TypeOfCollection[V, Any]], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<undefined, V[K]>}
      */ _Chain & TopLevel[V]
      ] = js.native
    def mapObject[I /* <: (CollectionIterator[TypeOfCollection[V, Any], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, any> ]:? underscore.underscore.TypeOfCollection<V, any>[P]}
      */ _Chain & (TopLevel[TypeOfCollection[V, Any]])) */](iteratee: I): Chain[
        IterateeResult[I, TypeOfCollection[V, Any]], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<I, V[K]>}
      */ _Chain & TopLevel[V]
      ] = js.native
    def mapObject[I /* <: (CollectionIterator[TypeOfCollection[V, Any], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, any> ]:? underscore.underscore.TypeOfCollection<V, any>[P]}
      */ _Chain & (TopLevel[TypeOfCollection[V, Any]])) */](iteratee: I, context: Any): Chain[
        IterateeResult[I, TypeOfCollection[V, Any]], 
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<I, V[K]>}
      */ _Chain & TopLevel[V]
      ] = js.native
    
    /**
      * Wrapped type `any[]`.
      * @see _.matcher
      **/
    def matcher(): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `any[]`.
      * @see _.matches
      **/
    def matches(): Chain[T, js.Array[T]] = js.native
    
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
      * @returns A chain wrapper around the maximum element within the
      * wrapped collection or around -Infinity if the wrapped collection is
      * empty.
      **/
    def max(): ChainSingle[T | Double] = js.native
    def max(iteratee: Unit, context: Any): ChainSingle[T | Double] = js.native
    def max(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): ChainSingle[T | Double] = js.native
    def max(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): ChainSingle[T | Double] = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.memoize
      **/
    def memoize(): Chain[T, js.Array[T]] = js.native
    def memoize(hashFn: js.Function1[/* n */ Any, String]): Chain[T, js.Array[T]] = js.native
    
    /**
      * @see _.functions
      **/
    def methods(): Chain[T, js.Array[T]] = js.native
    
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
      * @returns A chain wrapper around the minimum element within the
      * wrapped collection or around Infinity if the wrapped collection is
      * empty.
      **/
    def min(): ChainSingle[T | Double] = js.native
    def min(iteratee: Unit, context: Any): ChainSingle[T | Double] = js.native
    def min(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): ChainSingle[T | Double] = js.native
    def min(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): ChainSingle[T | Double] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.mixin
      **/
    def mixin(): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.negate
      **/
    def negate(): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `any`.
      * @see _.noop
      **/
    def noop(): Chain[T, js.Array[T]] = js.native
    
    def `object`(): Chain[PairValue[T], Dictionary[PairValue[T]]] = js.native
    /**
      * Converts lists into objects. Call on either a wrapped list of
      * [key, value] pairs, or a wrapped list of keys and a list of
      * `values`. Passing by pairs is the reverse of pairs. If duplicate
      * keys exist, the last value wins.
      * @param values If the wrapped list is a list of keys, a list of
      * values corresponding to those keys.
      * @returns A chain wrapper around an object comprised of the provided
      * keys and values.
      **/
    def `object`[TValue](values: typings.underscore.mod.List[TValue]): Chain[js.UndefOr[TValue], Dictionary[js.UndefOr[TValue]]] = js.native
    
    /**
      * Return a copy of the wrapped object that is filtered to not have
      * values for the keys selected by a truth test.
      * @param iterator A truth test that selects the keys to omit from the
      * wrapped object.
      * @returns A chain wrapper around a copy of the wrapped object without
      * the keys selected by `iterator`.
      **/
    def omit(iterator: ObjectIterator[TypeOfDictionary[V, Any], Boolean, V]): ChainSingle[Partial[V]] = js.native
    /**
      * Return a copy of the wrapped object that is filtered to omit the
      * disallowed keys (or array of keys).
      * @param keys The keys to omit from the wrapped object.
      * @returns A chain wrapper around a copy of the wrapped object without
      * the `keys` properties.
      **/
    def omit[K /* <: String */](keys: (K | js.Array[K])*): ChainSingle[Omit[V, K]] = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.once
      **/
    def once(): Chain[T, js.Array[T]] = js.native
    
    /**
      * Convert the wrapped object into a list of [key, value] pairs. The
      * opposite of the single-argument signature of `_.object`.
      * @returns A chain wrapper around the list of [key, value] pairs from
      * the wrapped object.
      **/
    def pairs(): Chain[
        js.Tuple2[Extract[/* keyof V */ String, String], TypeOfCollection[V, Any]], 
        js.Array[js.Tuple2[Extract[/* keyof V */ String, String], TypeOfCollection[V, Any]]]
      ] = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.partial
      **/
    def partial(args: Any*): Chain[T, js.Array[T]] = js.native
    
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
    def partition(iteratee: Unit, context: Any): Chain[js.Array[T], js.Tuple2[js.Array[T], js.Array[T]]] = js.native
    def partition(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Chain[js.Array[T], js.Tuple2[js.Array[T], js.Array[T]]] = js.native
    def partition(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[js.Array[T], js.Tuple2[js.Array[T], js.Array[T]]] = js.native
    
    /**
      * Return a copy of the wrapped object that is filtered to only have
      * values for the keys selected by a truth test.
      * @param iterator A truth test that selects the keys to keep on the
      * wrapped object.
      * @returns A chain wrapper around a copy of the wrapped object with
      * only the keys selected by `iterator`.
      **/
    def pick(iterator: ObjectIterator[TypeOfDictionary[V, Any], Boolean, V]): ChainSingle[Partial[V]] = js.native
    /**
      * Return a copy of the wrapped object that is filtered to only have
      * values for the allowed keys (or array of keys).
      * @param keys The keys to keep on the wrapped object.
      * @returns A chain wrapper around a copy of the wrapped object with
      * only the `keys` properties.
      **/
    def pick[K /* <: String */](keys: (K | js.Array[K])*): ChainSingle[Pick[V, K]] = js.native
    
    /**
      * A convenient version of what is perhaps the most common use-case for
      * map: extracting a list of property values.
      * @param propertyName The name of a specific property to retrieve from
      * all items in the wrapped collection.
      * @returns A chain wrapper around The set of values for the specified
      * `propertyName` for each item in the wrapped collection.
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
    def property(): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.propertyOf
      **/
    def propertyOf(): Chain[T, js.Array[T]] = js.native
    
    /**
      * Adds one or more elements to the end of an array and returns the new length of the array.
      * @param item The elements to add to the end of the array.
      * @return The array with the element added to the end.
      **/
    def push(item: T*): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `number`.
      * @see _.random
      **/
    def random(): Chain[T, js.Array[T]] = js.native
    /**
      * Wrapped type `number`.
      * @see _.random
      **/
    def random(max: Double): Chain[T, js.Array[T]] = js.native
    
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
    def range(stop: Double): Chain[Double, js.Array[Double]] = js.native
    def range(stop: Double, step: Double): Chain[Double, js.Array[Double]] = js.native
    def range(stop: Unit, step: Double): Chain[Double, js.Array[Double]] = js.native
    
    def reduce[TResult](
      iteratee: MemoCollectionIterator[
          TypeOfCollection[V, scala.Nothing], 
          TResult | (TypeOfCollection[V, scala.Nothing]), 
          V
        ]
    ): ChainSingle[js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])]] = js.native
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
      * @returns A chain wrapper around the reduced result.
      **/
    def reduce[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
    def reduce[TResult](
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
    ): ChainSingle[TResult] = js.native
    
    def reduceRight[TResult](
      iteratee: MemoCollectionIterator[
          TypeOfCollection[V, scala.Nothing], 
          TResult | (TypeOfCollection[V, scala.Nothing]), 
          V
        ]
    ): ChainSingle[js.UndefOr[TResult | (TypeOfCollection[V, scala.Nothing])]] = js.native
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
      * @returns A chain wrapper around the reduced result.
      **/
    def reduceRight[TResult](iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V], memo: TResult): ChainSingle[TResult] = js.native
    def reduceRight[TResult](
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
    ): ChainSingle[TResult] = js.native
    
    /**
      * Returns the values in the wrapped collection without the elements
      * that pass a truth test (`iteratee`).
      * The opposite of filter.
      * @param iteratee The truth test to apply.
      * @param context `this` object in `iteratee`, optional.
      * @returns A chain wrapper around the set of values that fail the
      * truth test.
      **/
    def reject(): Chain[T, js.Array[T]] = js.native
    def reject(iteratee: Unit, context: Any): Chain[T, js.Array[T]] = js.native
    def reject(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
    def reject(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
    
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
    def restArgs(): Chain[T, js.Array[T]] = js.native
    def restArgs(startIndex: Double): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.result
      **/
    def result(property: String): Chain[T, js.Array[T]] = js.native
    def result(property: String, defaultValue: Any): Chain[T, js.Array[T]] = js.native
    
    /**
      * Reverses an array in place. The first array element becomes the last and the last becomes the first.
      * @return The reversed array.
      **/
    def reverse(): Chain[T, js.Array[T]] = js.native
    
    def sample(): ChainSingle[js.UndefOr[T]] = js.native
    /**
      * Produce a random sample from the wrapped collection. Pass a number
      * to return `n` random elements from the wrapped collection. Otherwise
      * a single random item will be returned.
      * @param n The number of elements to sample from the wrapped
      * collection.
      * @returns A chain wrapper around a random sample of `n` elements from
      * the wrapped collection or a single element if `n` is not specified.
      **/
    def sample(n: Double): Chain[T, js.Array[T]] = js.native
    
    /**
      * @see filter
      **/
    def select(): Chain[T, js.Array[T]] = js.native
    def select(iteratee: Unit, context: Any): Chain[T, js.Array[T]] = js.native
    def select(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
    def select(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
    /**
      * @see filter
      **/
    @JSName("select")
    var select_Original: js.Function2[
        /* iteratee */ js.UndefOr[Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]], 
        /* context */ js.UndefOr[Any], 
        Chain[T, js.Array[T]]
      ] = js.native
    
    /**
      * Removes the first element from an array and returns that element. This method changes the length of the array.
      * @return The shifted element.
      **/
    def shift(): ChainSingle[T] = js.native
    
    /**
      * Returns a shuffled copy of the wrapped collection, using a version
      * of the Fisher-Yates shuffle.
      * @returns A chain wrapper around a shuffled copy of the wrapped
      * collection.
      **/
    def shuffle(): Chain[T, js.Array[T]] = js.native
    
    /**
      * Determines the number of values in the wrapped collection.
      * @returns A chain wrapper around the number of values in the wrapped
      * collection.
      **/
    def size(): ChainSingle[Double] = js.native
    
    /**
      * Returns a shallow copy of a portion of an array into a new array object.
      * @param start Zero-based index at which to begin extraction.
      * @param end Optional. Zero-based index at which to end extraction. slice extracts up to but not including end.
      * @return A shallow copy of a portion of an array into a new array object.
      **/
    def slice(start: Double): Chain[T, js.Array[T]] = js.native
    def slice(start: Double, end: Double): Chain[T, js.Array[T]] = js.native
    
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
    def some(iterator: Unit, context: Any): ChainSingle[Boolean] = js.native
    def some(iterator: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): ChainSingle[Boolean] = js.native
    def some(iterator: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): ChainSingle[Boolean] = js.native
    
    /**
      * Sorts the elements of an array in place and returns the array. The sort is not necessarily stable. The default sort order is according to string Unicode code points.
      * @param compareFn Optional. Specifies a function that defines the sort order. If omitted, the array is sorted according to each character's Unicode code point value, according to the string conversion of each element.
      * @return The sorted array.
      **/
    def sort(): Chain[T, js.Array[T]] = js.native
    def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Boolean]): Chain[T, js.Array[T]] = js.native
    
    /**
      * Returns a (stably) sorted copy of the wrapped collection, ranked in
      * ascending order by the results of running each value through
      * `iteratee`.
      * @param iteratee An iteratee that provides the value to sort by for
      * each item in the wrapped collection.
      * @param context `this` object in `iteratee`, optional.
      * @returns A chain wrapper around a sorted copy of the wrapped
      * collection.
      **/
    def sortBy(): Chain[T, js.Array[T]] = js.native
    def sortBy(iteratee: Unit, context: Any): Chain[T, js.Array[T]] = js.native
    def sortBy(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
    def sortBy(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
    
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
      * @returns A chain wrapper around the index where `value` should be
      * inserted into the wrapped list.
      **/
    def sortedIndex(value: T): ChainSingle[Double] = js.native
    def sortedIndex(value: T, iteratee: Unit, context: Any): ChainSingle[Double] = js.native
    def sortedIndex(value: T, iteratee: Iteratee[js.UndefOr[V], Any, TypeOfCollection[js.UndefOr[V], scala.Nothing]]): ChainSingle[Double] = js.native
    def sortedIndex(
      value: T,
      iteratee: Iteratee[js.UndefOr[V], Any, TypeOfCollection[js.UndefOr[V], scala.Nothing]],
      context: Any
    ): ChainSingle[Double] = js.native
    
    /**
      * Changes the content of an array by removing existing elements and/or adding new elements.
      * @param index Index at which to start changing the array. If greater than the length of the array, actual starting index will be set to the length of the array. If negative, will begin that many elements from the end.
      * @param quantity An integer indicating the number of old array elements to remove. If deleteCount is 0, no elements are removed. In this case, you should specify at least one new element. If deleteCount is greater than the number of elements left in the array starting at index, then all of the elements through the end of the array will be deleted.
      * @param items The element to add to the array. If you don't specify any elements, splice will only remove elements from the array.
      * @return An array containing the deleted elements. If only one element is removed, an array of one element is returned. If no elements are removed, an empty array is returned.
      **/
    def splice(index: Double, quantity: Double, items: T*): Chain[T, js.Array[T]] = js.native
    
    /**
      * @see rest
      **/
    def tail(): Chain[T, js.Array[T]] = js.native
    def tail(n: Double): Chain[T, js.Array[T]] = js.native
    /**
      * @see rest
      **/
    @JSName("tail")
    var tail_Original: js.Function1[/* n */ js.UndefOr[Double], Chain[T, js.Array[T]]] = js.native
    
    /**
      * @see first
      **/
    def take(): ChainSingle[js.UndefOr[T]] = js.native
    /**
      * @see first
      **/
    def take(n: Double): Chain[T, js.Array[T]] = js.native
    /**
      * @see first
      **/
    @JSName("take")
    var take_Original: Fn2[T] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.tap
      **/
    def tap(interceptor: js.Function1[/* repeated */ Any, Any]): Chain[T, V] = js.native
    
    /**
      * Wrapped type `string`.
      * @see _.template
      **/
    def template(): Chain[CompiledTemplate, js.Array[CompiledTemplate]] = js.native
    def template(settings: TemplateSettings): Chain[CompiledTemplate, js.Array[CompiledTemplate]] = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.throttle
      **/
    def throttle(wait: Double): Chain[T, js.Array[T]] = js.native
    def throttle(wait: Double, options: ThrottleSettings): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `number`.
      * @see _.times
      **/
    def times[TResult](iterator: js.Function1[/* n */ Double, TResult]): Chain[T, js.Array[T]] = js.native
    def times[TResult](iterator: js.Function1[/* n */ Double, TResult], context: Any): Chain[T, js.Array[T]] = js.native
    
    /**
      * Creates a real Array from the wrapped collection (anything that can
      * be iterated over). Useful for transmuting the arguments object.
      * @returns A chain wrapper around an array containing the elements
      * of the wrapped collection.
      **/
    def toArray(): Chain[T, js.Array[T]] = js.native
    
    def transpose(): Chain[js.Array[Any], js.Array[js.Array[Any]]] = js.native
    
    /**
      * Wrapped type `string`.
      * @see _.unescape
      **/
    def unescape(): Chain[T, js.Array[T]] = js.native
    
    /**
      * Computes the union of the wrapped list and the passed-in `lists`:
      * the list of unique items, examined in order from first list to last
      * list, that are present in one or more of the lists.
      * @param lists The lists (along with the wrapped list) to compute
      * the union of.
      * @returns A chain wrapper around the union of elements within the
      * wrapped list and `lists`.
      **/
    def union(lists: typings.underscore.mod.List[T]*): Chain[T, js.Array[T]] = js.native
    
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
      * @returns A chain wrapper around an array containing only the unique
      * elements in the wrapped list.
      **/
    def uniq(): Chain[T, js.Array[T]] = js.native
    def uniq(isSorted: Boolean): Chain[T, js.Array[T]] = js.native
    def uniq(isSorted: Boolean, iteratee: Unit, context: Any): Chain[T, js.Array[T]] = js.native
    def uniq(isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
    def uniq(isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
    def uniq(isSorted: Unit, iteratee: Any | (Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]])): Chain[T, js.Array[T]] = js.native
    def uniq(isSorted: Unit, iteratee: Unit, context: Any): Chain[T, js.Array[T]] = js.native
    def uniq(isSorted: Unit, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
    def uniq(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
    def uniq(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type List<T>.
      * @see uniq
      **/
    def unique(): Chain[T, js.Array[T]] = js.native
    def unique(isSorted: Boolean): Chain[T, js.Array[T]] = js.native
    def unique(isSorted: Boolean, iteratee: Unit, context: Any): Chain[T, js.Array[T]] = js.native
    def unique(isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
    def unique(isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
    def unique(isSorted: Unit, iteratee: Any | (Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]])): Chain[T, js.Array[T]] = js.native
    def unique(isSorted: Unit, iteratee: Unit, context: Any): Chain[T, js.Array[T]] = js.native
    def unique(isSorted: Unit, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
    def unique(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): Chain[T, js.Array[T]] = js.native
    def unique(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `string`.
      * @see _.uniqueId
      **/
    def uniqueId(): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type List<T>.
      * @see uniq
      **/
    @JSName("unique")
    var unique_Original: FnCallIsSortedIterateeContext[V, T] = js.native
    
    /**
      * Adds one or more elements to the beginning of an array and returns the new length of the array.
      * @param items The elements to add to the front of the array.
      * @return The array with the element added to the beginning.
      **/
    def unshift(items: T*): Chain[T, js.Array[T]] = js.native
    
    /**
      * The opposite of zip. Given the wrapped list of lists, returns a
      * series of new arrays, the first of which contains all of the first
      * elements in the wrapped lists, the second of which contains all of
      * the second elements, and so on. (alias: transpose)
      * @returns A chain wrapper around the unzipped version of the wrapped
      * lists.
      **/
    def unzip(): Chain[js.Array[Any], js.Array[js.Array[Any]]] = js.native
    
    /**
      * Extracts the value of the wrapped object.
      * @returns The value of the wrapped object.
      **/
    def value(): V = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.values
      **/
    def values(): Chain[Any, js.Array[Any]] = js.native
    
    /**
      * Looks through each value in the wrapped collection, returning an
      * array of all the elements that match the key-value pairs listed in
      * `properties`.
      * @param properties The properties to check for on the elements within
      * the wrapped collection.
      * @returns A chain wrapper around the elements in the wrapped
      * collection that match `properties`.
      **/
    def where(properties: Partial[T]): Chain[T, js.Array[T]] = js.native
    
    /**
      * Returns a copy of the wrapped list with all instances of `values`
      * removed.
      * @param values The values to exclude from the wrapped list.
      * @returns A chain wrapper around an array that contains all elements
      * of the wrapped list except for `values`.
      **/
    def without(values: T*): Chain[T, js.Array[T]] = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.wrap
      **/
    def wrap(wrapper: js.Function): js.Function0[Chain[T, js.Array[T]]] = js.native
    
    /**
      * Merges together the values of each of the `lists` (including the
      * wrapped list) with the values at the corresponding position. Useful
      * when you have separate data sources that are coordinated through
      * matching list indexes.
      * @returns A chain wrapper around the zipped version of the wrapped
      * list and `lists`.
      **/
    def zip(arrays: typings.underscore.mod.List[Any]*): Chain[js.Array[Any], js.Array[js.Array[Any]]] = js.native
  }
  
  type ChainSingle[V] = Chain[TypeOfCollection[V, scala.Nothing], V]
  
  type Collection[T] = typings.underscore.mod.List[T] | Dictionary[T]
  
  type CollectionIterator[T /* <: TypeOfList[V] | (TypeOfDictionary[V, Any]) */, TResult, V] = js.Function3[/* element */ T, /* key */ CollectionKey[V], /* collection */ V, TResult]
  
  type CollectionKey[V] = Unit | String | Double
  
  @js.native
  trait CompiledTemplate extends StObject {
    
    def apply(): String = js.native
    def apply(data: Any): String = js.native
    
    var source: String = js.native
  }
  
  // unfortunately it's not possible to recursively collapse all possible list dimensions to T[] at this time,
  // so give up after one dimension since that's likely the most common case
  // '& object' prevents strings from being matched by list checks so types like string[] don't end up resulting in any
  type DeepestListItemOrSelf[T] = T | Any
  
  type Dictionary[T] = StringDictionary[T]
  
  type Iteratee[V, R, T /* <: TypeOfCollection[V, Any] */] = js.UndefOr[
    (CollectionIterator[T, R, V]) | String | Double | (js.Array[String | Double]) | Partial[T] | Null
  ]
  
  type IterateeResult[I, T] = T | Boolean | (/* import warning: importer.ImportType#apply Failed type conversion: T[I] */ js.Any)
  
  // Common interface between Arrays and jQuery objects
  trait List[T]
    extends StObject
       with /* index */ NumberDictionary[T] {
    
    var length: Double
  }
  object List {
    
    inline def apply[T](length: Double): typings.underscore.mod.List[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.underscore.mod.List[T]]
    }
    
    extension [Self <: typings.underscore.mod.List[?], T](x: Self & typings.underscore.mod.List[T]) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  type ListItemOrSelf[T] = T
  
  type ListIterator[T /* <: TypeOfList[V] */, TResult, V] = CollectionIterator[T, TResult, V]
  
  type MemoCollectionIterator[T /* <: TypeOfList[V] | (TypeOfDictionary[V, Any]) */, TResult, V] = js.Function4[
    /* prev */ TResult, 
    /* curr */ T, 
    /* key */ CollectionKey[V], 
    /* collection */ V, 
    TResult
  ]
  
  type MemoIterator[T /* <: TypeOfList[V] */, TResult, V] = MemoCollectionIterator[T, TResult, V]
  
  type MemoObjectIterator[T /* <: TypeOfDictionary[V, scala.Nothing] */, TResult, V] = MemoCollectionIterator[T, TResult, V]
  
  type ObjectIterator[T /* <: TypeOfDictionary[V, Any] */, TResult, V] = CollectionIterator[T, TResult, V]
  
  // switch to Omit when the minimum TS version moves past 3.5
  type Omit[V, K /* <: String */] = (typings.std.Pick[V, Exclude[/* keyof V */ String, K]]) | Partial[V]
  
  // if T is an inferrable pair, the value type for the pair
  // if T is a list, assume that it contains pairs of some type, so any
  // if T isn't a list, there's no way that it can provide pairs, so never
  type PairValue[T] = Any
  
  type Pick[V, K /* <: String */] = (typings.std.Pick[V, Extract[K, /* keyof V */ String]]) | Partial[V]
  
  type Predicate[T] = js.Function1[/* value */ T, Boolean]
  
  type PropertyTypeOrAny[T, K] = /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  
  /**
    * underscore.js template settings, set templateSettings or pass as an argument
    * to 'template()' to override defaults.
    **/
  trait TemplateSettings extends StObject {
    
    /**
      * Default value is '/<%-([\s\S]+?)%>/g'.
      **/
    var escape: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Default value is '/<%([\s\S]+?)%>/g'.
      **/
    var evaluate: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * Default value is '/<%=([\s\S]+?)%>/g'.
      **/
    var interpolate: js.UndefOr[js.RegExp] = js.undefined
    
    /**
      * By default, 'template()' places the values from your data in the local scope via the 'with' statement.
      * However, you can specify a single variable name with this setting.
      **/
    var variable: js.UndefOr[String] = js.undefined
  }
  object TemplateSettings {
    
    inline def apply(): TemplateSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateSettings]
    }
    
    extension [Self <: TemplateSettings](x: Self) {
      
      inline def setEscape(value: js.RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
      
      inline def setEvaluate(value: js.RegExp): Self = StObject.set(x, "evaluate", value.asInstanceOf[js.Any])
      
      inline def setEvaluateUndefined: Self = StObject.set(x, "evaluate", js.undefined)
      
      inline def setInterpolate(value: js.RegExp): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setVariable(value: String): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
      
      inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    }
  }
  
  /**
    * underscore.js _.throttle options.
    **/
  trait ThrottleSettings extends StObject {
    
    /**
      * If you'd like to disable the leading-edge call, pass this as false.
      **/
    var leading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If you'd like to disable the execution on the trailing-edge, pass false.
      **/
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object ThrottleSettings {
    
    inline def apply(): ThrottleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottleSettings]
    }
    
    extension [Self <: ThrottleSettings](x: Self) {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
  
  type Truthy[T] = Exclude[T, AnyFalsy]
  
  type TypeOfCollection[V, TObjectDefault] = (TypeOfDictionary[V, TObjectDefault]) | TypeOfList[V]
  
  type TypeOfDictionary[V, TDefault] = TDefault
  
  type TypeOfList[V] = Any
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Uint8ClampedArray | js.typedarray.Float32Array | js.typedarray.Float64Array
  
  @js.native
  trait Underscore[T, V] extends StObject {
    
    /**
      * Wrapped type `number`.
      * @see _.after
      **/
    def after(fn: js.Function): js.Function = js.native
    
    /**
      * @see every
      **/
    def all(): Boolean = js.native
    def all(iteratee: Unit, context: Any): Boolean = js.native
    def all(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
    def all(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Boolean = js.native
    
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
        /* context */ js.UndefOr[Any], 
        Boolean
      ] = js.native
    
    /**
      * @see some
      **/
    def any(): Boolean = js.native
    def any(iteratee: Unit, context: Any): Boolean = js.native
    def any(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
    def any(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Boolean = js.native
    /**
      * @see some
      **/
    @JSName("any")
    var any_Original: js.Function2[
        /* iteratee */ js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], 
        /* context */ js.UndefOr[Any], 
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
    def bind(`object`: Any, args: Any*): js.Function = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.bindAll
      **/
    def bindAll(methodNames: String*): Any = js.native
    
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
    /**
      * @see map
      **/
    def collect(iteratee: String): js.Array[IterateeResult[String, T]] = js.native
    def collect(iteratee: String, context: Any): js.Array[IterateeResult[String, T]] = js.native
    /**
      * @see map
      **/
    def collect(iteratee: js.Array[String | Double]): js.Array[IterateeResult[js.Array[String | Double], T]] = js.native
    def collect(iteratee: js.Array[String | Double], context: Any): js.Array[IterateeResult[js.Array[String | Double], T]] = js.native
    /**
      * @see map
      **/
    def collect(iteratee: Double): js.Array[IterateeResult[Double, T]] = js.native
    def collect(iteratee: Double, context: Any): js.Array[IterateeResult[Double, T]] = js.native
    def collect(iteratee: Null, context: Any): js.Array[IterateeResult[Null, T]] = js.native
    def collect(iteratee: Unit, context: Any): js.Array[IterateeResult[Unit, T]] = js.native
    /**
      * @see map
      **/
    def collect[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typings.underscore.underscoreStrings.Underscore & (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I): js.Array[IterateeResult[I, T]] = js.native
    def collect[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typings.underscore.underscoreStrings.Underscore & (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I, context: Any): js.Array[IterateeResult[I, T]] = js.native
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
    def contains(value: Any): Boolean = js.native
    def contains(value: Any, fromIndex: Double): Boolean = js.native
    
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
    def countBy(iteratee: Unit, context: Any): Dictionary[Double] = js.native
    def countBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Dictionary[Double] = js.native
    def countBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]], context: Any): Dictionary[Double] = js.native
    
    /**
      * Wrapped type `any`.
      * @see _.create
      **/
    def create(): Any = js.native
    def create(props: js.Object): Any = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.debounce
      **/
    def debounce(wait: Double): js.Function & Cancelable = js.native
    def debounce(wait: Double, immediate: Boolean): js.Function & Cancelable = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.defaults
      **/
    def defaults(defaults: Any*): Any = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.defer
      **/
    def defer(args: Any*): Unit = js.native
    
    /**
      * @see _.delay
      **/
    def delay(args: Any*): Any = js.native
    /**
      * Wrapped type `Function`.
      * @see _.delay
      **/
    def delay(wait: Double, args: Any*): Any = js.native
    
    /**
      * @see find
      **/
    def detect(): js.UndefOr[T] = js.native
    def detect(iteratee: Unit, context: Any): js.UndefOr[T] = js.native
    def detect(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.UndefOr[T] = js.native
    def detect(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): js.UndefOr[T] = js.native
    /**
      * @see find
      **/
    @JSName("detect")
    var detect_Original: js.Function2[
        /* iteratee */ js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], 
        /* context */ js.UndefOr[Any], 
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
    def difference(others: typings.underscore.mod.List[T]*): js.Array[T] = js.native
    
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
    def each(iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V], context: Any): V = js.native
    
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
    def every(iteratee: Unit, context: Any): Boolean = js.native
    def every(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
    def every(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Boolean = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.extend
      **/
    def extend(sources: Any*): Any = js.native
    
    /**
      * Looks through each value in the wrapped collection, returning an
      * array of all the values that pass a truth test (`iteratee`).
      * @param iteratee The truth test to apply.
      * @param context `this` object in `iteratee`, optional.
      * @returns The set of values that pass the truth test.
      **/
    def filter(): js.Array[T] = js.native
    def filter(iteratee: Unit, context: Any): js.Array[T] = js.native
    def filter(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
    def filter(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[T] = js.native
    
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
    def find(iteratee: Unit, context: Any): js.UndefOr[T] = js.native
    def find(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.UndefOr[T] = js.native
    def find(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): js.UndefOr[T] = js.native
    
    /**
      * Returns the first index of an element in the wrapped list where the
      * `iteratee` truth test passes, otherwise returns -1.
      * @param iteratee The truth test to apply.
      * @param context `this` object in `iteratee`, optional.
      * @returns The index of the first element in the wrapped list where
      * the truth test passes or -1 if no elements pass.
      **/
    def findIndex(): Double = js.native
    def findIndex(iteratee: Unit, context: Any): Double = js.native
    def findIndex(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Double = js.native
    def findIndex(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Double = js.native
    
    /**
      * Similar to `findIndex` but for keys in objects. Returns the key
      * where the `iteratee` truth test passes or undefined.
      * @param iteratee The truth test to apply.
      * @param context `this` object in `iteratee`, optional.
      * @returns The first element in the wrapped object that passes the
      * truth test or undefined if no elements pass.
      */
    def findKey(): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
    def findKey(iteratee: Unit, context: Any): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
    def findKey(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, Any]]): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
    def findKey(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, Any]], context: Any): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
    
    /**
      * Returns the last index of an element in the wrapped list where the
      * `iteratee` truth test passes, otherwise returns -1.
      * @param iteratee The truth test to apply.
      * @param context `this` object in `iteratee`, optional.
      * @returns The index of the last element in the wrapped list where the
      * truth test passes or -1 if no elements pass.
      **/
    def findLastIndex(): Double = js.native
    def findLastIndex(iteratee: Unit, context: Any): Double = js.native
    def findLastIndex(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Double = js.native
    def findLastIndex(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Double = js.native
    
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
    
    def flatten(): js.Array[DeepestListItemOrSelf[T]] = js.native
    /**
      * Flattens a nested list (the nesting can be to any depth). If you
      * pass depth, the wrapped list will only be flattened a single
      * level.
      * @param depth True to only flatten one level, optional,
      * default = false.
      * @returns The flattened list.
      **/
    def flatten(depth: `1` | `true`): js.Array[ListItemOrSelf[T]] = js.native
    def flatten(depth: Double): js.Array[DeepestListItemOrSelf[T]] = js.native
    @JSName("flatten")
    def flatten_false(depth: `false`): js.Array[DeepestListItemOrSelf[T]] = js.native
    
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
      context: Any
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
      context: Any
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
    def forEach(iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V], context: Any): V = js.native
    /**
      * @see each
      **/
    @JSName("forEach")
    var forEach_Original: js.Function2[
        /* iteratee */ CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V], 
        /* context */ js.UndefOr[Any], 
        V
      ] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.functions
      **/
    def functions(): js.Array[String] = js.native
    
    /**
      * Wrapped type `any`.
      * @see _.get
      **/
    def get(path: String): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    def get(path: js.Array[String]): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    def get[U](path: String, defaultValue: U): (TypeOfCollection[V, scala.Nothing]) | U = js.native
    def get[U](path: js.Array[String], defaultValue: U): (TypeOfCollection[V, scala.Nothing]) | U = js.native
    @JSName("get")
    def get_U[U](path: String): (TypeOfCollection[V, scala.Nothing]) | U = js.native
    @JSName("get")
    def get_U[U](path: js.Array[String]): (TypeOfCollection[V, scala.Nothing]) | U = js.native
    
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
    def groupBy(iteratee: Unit, context: Any): Dictionary[js.Array[T]] = js.native
    def groupBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Dictionary[js.Array[T]] = js.native
    def groupBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]], context: Any): Dictionary[js.Array[T]] = js.native
    
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
    def identity(): Any = js.native
    
    /**
      * @see contains
      **/
    def include(value: Any): Boolean = js.native
    def include(value: Any, fromIndex: Double): Boolean = js.native
    /**
      * @see contains
      **/
    @JSName("include")
    var include_Original: js.Function2[/* value */ Any, /* fromIndex */ js.UndefOr[Double], Boolean] = js.native
    
    /**
      * @see contains
      **/
    def includes(value: Any): Boolean = js.native
    def includes(value: Any, fromIndex: Double): Boolean = js.native
    /**
      * @see contains
      **/
    @JSName("includes")
    var includes_Original: js.Function2[/* value */ Any, /* fromIndex */ js.UndefOr[Double], Boolean] = js.native
    
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
    def indexBy(iteratee: Unit, context: Any): Dictionary[T] = js.native
    def indexBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Dictionary[T] = js.native
    def indexBy(iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]], context: Any): Dictionary[T] = js.native
    
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
      context: Any
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
    def intersection(lists: typings.underscore.mod.List[T]*): js.Array[T] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.invert
      **/
    def invert(): Any = js.native
    
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
    def invoke(methodName: String, args: Any*): js.Array[Any] = js.native
    
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
      * Returns true if the wrapped object is an ArrayBuffer.
      * @returns True if the wrapped object is an ArrayBuffer, otherwise false.
      **/
    def isArrayBuffer(): Boolean = js.native
    
    /**
      * Returns true if the wrapped object is a Boolean.
      * @returns True if the wrapped object is a Boolean, otherwise false.
      **/
    def isBoolean(): Boolean = js.native
    
    /**
      * Returns true if the wrapped object is a DataView.
      * @returns True if the wrapped object is a DataView, otherwise false.
      **/
    def isDataView(): Boolean = js.native
    
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
    def isEqual(other: Any): Boolean = js.native
    
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
    def isMatch(properties: Any): Boolean = js.native
    
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
      * Returns true if the wrapped object is a TypedArray.
      * @returns True if the wrapped object is a TypedArray, otherwise false.
      **/
    def isTypedArray(): Boolean = js.native
    
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
    def iteratee(context: Any): js.Function = js.native
    
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
    /**
      * Produces a new array of values by mapping each value in the wrapped
      * collection through a transformation `iteratee`.
      * @param iteratee The iteratee to use to transform each item in the
      * wrapped collection.
      * @param context `this` object in `iteratee`, optional.
      * @returns The mapped result.
      **/
    def map(iteratee: String): js.Array[IterateeResult[String, T]] = js.native
    def map(iteratee: String, context: Any): js.Array[IterateeResult[String, T]] = js.native
    def map(iteratee: js.Array[String | Double]): js.Array[IterateeResult[js.Array[String | Double], T]] = js.native
    def map(iteratee: js.Array[String | Double], context: Any): js.Array[IterateeResult[js.Array[String | Double], T]] = js.native
    def map(iteratee: Double): js.Array[IterateeResult[Double, T]] = js.native
    def map(iteratee: Double, context: Any): js.Array[IterateeResult[Double, T]] = js.native
    def map(iteratee: Null, context: Any): js.Array[IterateeResult[Null, T]] = js.native
    def map(iteratee: Unit, context: Any): js.Array[IterateeResult[Unit, T]] = js.native
    def map[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typings.underscore.underscoreStrings.Underscore & (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I): js.Array[IterateeResult[I, T]] = js.native
    def map[I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typings.underscore.underscoreStrings.Underscore & (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](iteratee: I, context: Any): js.Array[IterateeResult[I, T]] = js.native
    
    def mapObject(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<null, V[K]>}
      */ typings.underscore.underscoreStrings.Underscore & TopLevel[V] = js.native
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
      */ typings.underscore.underscoreStrings.Underscore & TopLevel[V] = js.native
    def mapObject(iteratee: String, context: Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<string, V[K]>}
      */ typings.underscore.underscoreStrings.Underscore & TopLevel[V] = js.native
    def mapObject(iteratee: js.Array[String | Double]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<std.Array<string | number>, V[K]>}
      */ typings.underscore.underscoreStrings.Underscore & TopLevel[V] = js.native
    def mapObject(iteratee: js.Array[String | Double], context: Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<std.Array<string | number>, V[K]>}
      */ typings.underscore.underscoreStrings.Underscore & TopLevel[V] = js.native
    def mapObject(iteratee: Double): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<number, V[K]>}
      */ typings.underscore.underscoreStrings.Underscore & TopLevel[V] = js.native
    def mapObject(iteratee: Double, context: Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<number, V[K]>}
      */ typings.underscore.underscoreStrings.Underscore & TopLevel[V] = js.native
    def mapObject(iteratee: Null, context: Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<null, V[K]>}
      */ typings.underscore.underscoreStrings.Underscore & TopLevel[V] = js.native
    def mapObject(iteratee: Unit, context: Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<undefined, V[K]>}
      */ typings.underscore.underscoreStrings.Underscore & TopLevel[V] = js.native
    def mapObject[I /* <: (CollectionIterator[TypeOfCollection[V, Any], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, any> ]:? underscore.underscore.TypeOfCollection<V, any>[P]}
      */ typings.underscore.underscoreStrings.Underscore & (TopLevel[TypeOfCollection[V, Any]])) */](iteratee: I): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<I, V[K]>}
      */ typings.underscore.underscoreStrings.Underscore & TopLevel[V] = js.native
    def mapObject[I /* <: (CollectionIterator[TypeOfCollection[V, Any], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, any> ]:? underscore.underscore.TypeOfCollection<V, any>[P]}
      */ typings.underscore.underscoreStrings.Underscore & (TopLevel[TypeOfCollection[V, Any]])) */](iteratee: I, context: Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<I, V[K]>}
      */ typings.underscore.underscoreStrings.Underscore & TopLevel[V] = js.native
    
    /**
      * Wrapped type `any[]`.
      * @see _.matcher
      **/
    def matcher(): ListIterator[T, Boolean, typings.underscore.mod.List[T]] = js.native
    
    /**
      * Wrapped type `any[]`.
      * @see _.matches
      **/
    def matches(): ListIterator[T, Boolean, typings.underscore.mod.List[T]] = js.native
    
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
    def max(iteratee: Unit, context: Any): T | Double = js.native
    def max(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): T | Double = js.native
    def max(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): T | Double = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.memoize
      **/
    def memoize(): js.Function = js.native
    def memoize(hashFn: js.Function1[/* n */ Any, String]): js.Function = js.native
    
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
    def min(iteratee: Unit, context: Any): T | Double = js.native
    def min(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): T | Double = js.native
    def min(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): T | Double = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.mixin
      **/
    def mixin(): Unit = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.negate
      **/
    def negate(): js.Function1[/* repeated */ Any, Boolean] = js.native
    
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
    def `object`[TValue](values: typings.underscore.mod.List[TValue]): Dictionary[js.UndefOr[TValue]] = js.native
    
    /**
      * Return a copy of the wrapped object that is filtered to not have
      * values for the keys selected by a truth test.
      * @param iterator A truth test that selects the keys to omit from the
      * wrapped object.
      * @returns A copy of the wrapped object without the keys selected by
      * `iterator`.
      **/
    def omit(iterator: ObjectIterator[TypeOfDictionary[V, Any], Boolean, V]): Partial[V] = js.native
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
    def pairs(): js.Array[js.Tuple2[Extract[/* keyof V */ String, String], TypeOfCollection[V, Any]]] = js.native
    
    /**
      * Wrapped type `Function`.
      * @see _.partial
      **/
    def partial(args: Any*): js.Function = js.native
    
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
    def partition(iteratee: Unit, context: Any): js.Tuple2[js.Array[T], js.Array[T]] = js.native
    def partition(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
    def partition(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): js.Tuple2[js.Array[T], js.Array[T]] = js.native
    
    /**
      * Return a copy of the wrapped object that is filtered to only have
      * values for the keys selected by a truth test.
      * @param iterator A truth test that selects the keys to keep on the
      * wrapped object.
      * @returns A copy of the wrapped object with only the keys selected by
      * `iterator`.
      **/
    def pick(iterator: ObjectIterator[TypeOfDictionary[V, Any], Boolean, V]): Partial[V] = js.native
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
    def property(): js.Function1[/* object */ Any, Any] = js.native
    
    /**
      * Wrapped type `object`.
      * @see _.propertyOf
      **/
    def propertyOf(): js.Function1[/* key */ String, Any] = js.native
    
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
    def range(stop: Double): js.Array[Double] = js.native
    def range(stop: Double, step: Double): js.Array[Double] = js.native
    def range(stop: Unit, step: Double): js.Array[Double] = js.native
    
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
      context: Any
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
      context: Any
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
    def reject(iteratee: Unit, context: Any): js.Array[T] = js.native
    def reject(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
    def reject(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[T] = js.native
    
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
    def result(property: String): Any = js.native
    def result(property: String, defaultValue: Any): Any = js.native
    
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
    def select(iteratee: Unit, context: Any): js.Array[T] = js.native
    def select(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
    def select(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[T] = js.native
    /**
      * @see filter
      **/
    @JSName("select")
    var select_Original: js.Function2[
        /* iteratee */ js.UndefOr[Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]], 
        /* context */ js.UndefOr[Any], 
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
    def some(iteratee: Unit, context: Any): Boolean = js.native
    def some(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
    def some(iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Boolean = js.native
    
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
    def sortBy(iteratee: Unit, context: Any): js.Array[T] = js.native
    def sortBy(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
    def sortBy(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[T] = js.native
    
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
    def sortedIndex(value: T, iteratee: Unit, context: Any): Double = js.native
    def sortedIndex(value: T, iteratee: Iteratee[js.UndefOr[V], Any, TypeOfCollection[js.UndefOr[V], scala.Nothing]]): Double = js.native
    def sortedIndex(
      value: T,
      iteratee: Iteratee[js.UndefOr[V], Any, TypeOfCollection[js.UndefOr[V], scala.Nothing]],
      context: Any
    ): Double = js.native
    
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
    def tap(interceptor: js.Function1[/* repeated */ Any, Any]): Any = js.native
    
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
    def throttle(wait: Double): js.Function & Cancelable = js.native
    def throttle(wait: Double, options: ThrottleSettings): js.Function & Cancelable = js.native
    
    /**
      * Wrapped type `number`.
      * @see _.times
      **/
    def times[TResult](iterator: js.Function1[/* n */ Double, TResult]): js.Array[TResult] = js.native
    def times[TResult](iterator: js.Function1[/* n */ Double, TResult], context: Any): js.Array[TResult] = js.native
    
    /**
      * Creates a real Array from the wrapped collection (anything that can
      * be iterated over). Useful for transmuting the arguments object.
      * @returns An array containing the elements of the wrapped collection.
      **/
    def toArray(): js.Array[T] = js.native
    
    def transpose(): js.Array[js.Array[Any]] = js.native
    
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
    def union(lists: typings.underscore.mod.List[T]*): js.Array[T] = js.native
    
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
    def uniq(isSorted: Boolean): js.Array[T] = js.native
    def uniq(isSorted: Boolean, iteratee: Unit, cotext: Any): js.Array[T] = js.native
    def uniq(isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
    def uniq(isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], cotext: Any): js.Array[T] = js.native
    def uniq(isSorted: Unit, iteratee: Any | (Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]])): js.Array[T] = js.native
    def uniq(isSorted: Unit, iteratee: Unit, cotext: Any): js.Array[T] = js.native
    def uniq(isSorted: Unit, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], cotext: Any): js.Array[T] = js.native
    def uniq(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
    def uniq(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[T] = js.native
    
    /**
      * @see uniq
      **/
    def unique(): js.Array[T] = js.native
    def unique(isSorted: Boolean): js.Array[T] = js.native
    def unique(isSorted: Boolean, iteratee: Unit, cotext: Any): js.Array[T] = js.native
    def unique(isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
    def unique(isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], cotext: Any): js.Array[T] = js.native
    def unique(isSorted: Unit, iteratee: Any | (Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]])): js.Array[T] = js.native
    def unique(isSorted: Unit, iteratee: Unit, cotext: Any): js.Array[T] = js.native
    def unique(isSorted: Unit, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], cotext: Any): js.Array[T] = js.native
    def unique(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[T] = js.native
    def unique(iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[T] = js.native
    
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
      * the second elements, and so on. (alias: transpose)
      * @returns The unzipped version of the wrapped lists.
      **/
    def unzip(): js.Array[js.Array[Any]] = js.native
    
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
    def zip(lists: typings.underscore.mod.List[Any]*): js.Array[js.Array[Any]] = js.native
  }
  
  @js.native
  trait UnderscoreStatic extends StObject {
    
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
    def all[V /* <: Collection[Any] */](collection: V): Boolean = js.native
    def all[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): Boolean = js.native
    def all[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
    def all[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Boolean = js.native
    
    /**
      * Retrieve all the names of object's own and inherited properties.
      * @param object Retrieve the key or property names from this object.
      * @return List of all the property names on `object`.
      **/
    def allKeys(`object`: Any): js.Array[String] = js.native
    
    /**
      * @see every
      **/
    @JSName("all")
    var all_Original: js.Function3[
        /* collection */ Collection[Any], 
        /* iteratee */ js.UndefOr[
          Iteratee[Collection[Any], Boolean, TypeOfCollection[Collection[Any], scala.Nothing]]
        ], 
        /* context */ js.UndefOr[Any], 
        Boolean
      ] = js.native
    
    /**
      * @see some
      **/
    def any[V /* <: Collection[Any] */](collection: V): Boolean = js.native
    def any[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): Boolean = js.native
    def any[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
    def any[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Boolean = js.native
    /**
      * @see some
      **/
    @JSName("any")
    var any_Original: js.Function3[
        /* collection */ Collection[Any], 
        /* iteratee */ js.UndefOr[
          Iteratee[Collection[Any], Boolean, TypeOfCollection[Collection[Any], scala.Nothing]]
        ], 
        /* context */ js.UndefOr[Any], 
        Boolean
      ] = js.native
    
    /**
      * Like extend, but only copies own properties over to the destination object. (alias: extendOwn)
      */
    def assign(destination: Any, source: Any*): Any = js.native
    
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
    def bind(func: js.Function, context: Any, args: Any*): js.Function0[Any] = js.native
    
    /**
      * Binds a number of methods on the object, specified by methodNames, to be run in the context of that object
      * whenever they are invoked. Very handy for binding functions that are going to be used as event handlers,
      * which would otherwise be invoked with a fairly useless this. If no methodNames are provided, all of the
      * object's function properties will be bound to it.
      * @param object The object to bind the methods `methodName` to.
      * @param methodNames The methods to bind to `object`, optional and if not provided all of `object`'s
      * methods are bound.
      **/
    def bindAll(`object`: Any, methodNames: String*): Any = js.native
    
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
    def chunk[V /* <: typings.underscore.mod.List[Any] */](list: V, length: Double): js.Array[js.Array[TypeOfList[V]]] = js.native
    
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
    def collect[V /* <: Collection[Any] */](collection: V): js.Array[IterateeResult[Null, TypeOfCollection[V, scala.Nothing]]] = js.native
    /**
      * @see map
      **/
    def collect[V /* <: Collection[Any] */](collection: V, iteratee: String): js.Array[IterateeResult[String, TypeOfCollection[V, scala.Nothing]]] = js.native
    def collect[V /* <: Collection[Any] */](collection: V, iteratee: String, context: Any): js.Array[IterateeResult[String, TypeOfCollection[V, scala.Nothing]]] = js.native
    /**
      * @see map
      **/
    def collect[V /* <: Collection[Any] */](collection: V, iteratee: js.Array[String | Double]): js.Array[IterateeResult[js.Array[String | Double], TypeOfCollection[V, scala.Nothing]]] = js.native
    def collect[V /* <: Collection[Any] */](collection: V, iteratee: js.Array[String | Double], context: Any): js.Array[IterateeResult[js.Array[String | Double], TypeOfCollection[V, scala.Nothing]]] = js.native
    /**
      * @see map
      **/
    def collect[V /* <: Collection[Any] */](collection: V, iteratee: Double): js.Array[IterateeResult[Double, TypeOfCollection[V, scala.Nothing]]] = js.native
    def collect[V /* <: Collection[Any] */](collection: V, iteratee: Double, context: Any): js.Array[IterateeResult[Double, TypeOfCollection[V, scala.Nothing]]] = js.native
    def collect[V /* <: Collection[Any] */](collection: V, iteratee: Null, context: Any): js.Array[IterateeResult[Null, TypeOfCollection[V, scala.Nothing]]] = js.native
    def collect[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): js.Array[IterateeResult[Unit, TypeOfCollection[V, scala.Nothing]]] = js.native
    /**
      * @see map
      **/
    def collect[V /* <: Collection[Any] */, I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](collection: V, iteratee: I): js.Array[IterateeResult[I, TypeOfCollection[V, scala.Nothing]]] = js.native
    def collect[V /* <: Collection[Any] */, I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](collection: V, iteratee: I, context: Any): js.Array[IterateeResult[I, TypeOfCollection[V, scala.Nothing]]] = js.native
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
    def compact[V /* <: js.UndefOr[typings.underscore.mod.List[Any] | Null] */](list: V): js.Array[Truthy[TypeOfList[V]]] = js.native
    
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
    def contains[V /* <: Collection[Any] */](collection: V, value: Any): Boolean = js.native
    def contains[V /* <: Collection[Any] */](collection: V, value: Any, fromIndex: Double): Boolean = js.native
    
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
    def countBy[V /* <: Collection[Any] */](collection: V): Dictionary[Double] = js.native
    def countBy[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): Dictionary[Double] = js.native
    def countBy[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Dictionary[Double] = js.native
    def countBy[V /* <: Collection[Any] */](
      collection: V,
      iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]],
      context: Any
    ): Dictionary[Double] = js.native
    
    /**
      * Creates an object that inherits from the given prototype object.
      * If additional properties are provided then they will be added to the
      * created object.
      * @param prototype The prototype that the returned object will inherit from.
      * @param props Additional props added to the returned object.
      **/
    def create(prototype: Any): Any = js.native
    def create(prototype: Any, props: js.Object): Any = js.native
    
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
    def debounce[T /* <: js.Function */](fn: T, wait: Double): T & Cancelable = js.native
    def debounce[T /* <: js.Function */](fn: T, wait: Double, immediate: Boolean): T & Cancelable = js.native
    
    /**
      * Fill in null and undefined properties in object with values from the defaults objects,
      * and return the object. As soon as the property is filled, further defaults will have no effect.
      * @param object Fill this object with default values.
      * @param defaults The default values to add to `object`.
      * @return `object` with added `defaults` values.
      **/
    def defaults(`object`: Any, defaults: Any*): Any = js.native
    
    /**
      * Defers invoking the function until the current call stack has cleared, similar to using setTimeout
      * with a delay of 0. Useful for performing expensive computations or HTML rendering in chunks without
      * blocking the UI thread from updating. If you pass the optional arguments, they will be forwarded on
      * to the function when it is invoked.
      * @param fn The function to defer.
      * @param arguments Additional arguments to pass to `fn`.
      **/
    def defer(fn: js.Function, args: Any*): Unit = js.native
    
    /**
      * @see _delay
      **/
    def delay(func: js.Function, args: Any*): Any = js.native
    /**
      * Much like setTimeout, invokes function after wait milliseconds. If you pass the optional arguments,
      * they will be forwarded on to the function when it is invoked.
      * @param func Function to delay `waitMS` amount of ms.
      * @param wait The amount of milliseconds to delay `fn`.
      * @arguments Additional arguments to pass to `fn`.
      **/
    def delay(func: js.Function, wait: Double, args: Any*): Any = js.native
    
    /**
      * @see find
      **/
    def detect[V /* <: Collection[Any] */](collection: V): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    def detect[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    def detect[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    def detect[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    /**
      * @see find
      **/
    @JSName("detect")
    var detect_Original: js.Function3[
        /* collection */ Collection[Any], 
        /* iteratee */ js.UndefOr[
          Iteratee[Collection[Any], Boolean, TypeOfCollection[Collection[Any], scala.Nothing]]
        ], 
        /* context */ js.UndefOr[Any], 
        js.UndefOr[TypeOfCollection[Collection[Any], scala.Nothing]]
      ] = js.native
    
    /**
      * Similar to without, but returns the values from `list` that are not
      * present in `others`.
      * @param list The starting list.
      * @param others The lists of values to exclude from `list`.
      * @returns The contents of `list` without the values in `others`.
      **/
    def difference[T](list: typings.underscore.mod.List[T], others: typings.underscore.mod.List[T]*): js.Array[T] = js.native
    
    /**
      * @see rest
      **/
    def drop[V /* <: typings.underscore.mod.List[Any] */](list: V): js.Array[TypeOfList[V]] = js.native
    def drop[V /* <: typings.underscore.mod.List[Any] */](list: V, index: Double): js.Array[TypeOfList[V]] = js.native
    /**
      * @see rest
      **/
    @JSName("drop")
    var drop_Original: js.Function2[
        /* list */ typings.underscore.mod.List[Any], 
        /* index */ js.UndefOr[Double], 
        js.Array[TypeOfList[typings.underscore.mod.List[Any]]]
      ] = js.native
    
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
    def each[V /* <: Collection[Any] */](collection: V, iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V]): V = js.native
    def each[V /* <: Collection[Any] */](
      collection: V,
      iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V],
      context: Any
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
    def every[V /* <: Collection[Any] */](collection: V): Boolean = js.native
    def every[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): Boolean = js.native
    def every[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
    def every[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Boolean = js.native
    
    /**
      * Copy all of the properties in the source objects over to the destination object, and return
      * the destination object. It's in-order, so the last source will override properties of the
      * same name in previous arguments.
      * @param destination Object to extend all the properties from `sources`.
      * @param sources Extends `destination` with all properties from these source objects.
      * @return `destination` extended with all the properties from the `sources` objects.
      **/
    def extend(destination: Any, sources: Any*): Any = js.native
    
    /**
      * Like extend, but only copies own properties over to the destination object. (alias: assign)
      */
    def extendOwn(destination: Any, source: Any*): Any = js.native
    
    /**
      * Looks through each value in `collection`, returning an array of
      * all the values that pass a truth test (`iteratee`).
      * @param collection The collection to filter.
      * @param iteratee The truth test to apply.
      * @param context `this` object in `iteratee`, optional.
      * @returns The set of values that pass the truth test.
      **/
    def filter[V /* <: Collection[Any] */](collection: V): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    def filter[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    def filter[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    def filter[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    
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
    def find[V /* <: Collection[Any] */](collection: V): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    def find[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    def find[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    def find[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    
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
    def findIndex[V /* <: typings.underscore.mod.List[Any] */](list: V): Double = js.native
    def findIndex[V /* <: typings.underscore.mod.List[Any] */](list: V, iteratee: Unit, context: Any): Double = js.native
    def findIndex[V /* <: typings.underscore.mod.List[Any] */](list: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Double = js.native
    def findIndex[V /* <: typings.underscore.mod.List[Any] */](list: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Double = js.native
    
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
    def findKey[V /* <: js.Object */](`object`: V, iteratee: Unit, context: Any): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
    def findKey[V /* <: js.Object */](`object`: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, Any]]): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
    def findKey[V /* <: js.Object */](`object`: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, Any]], context: Any): js.UndefOr[Extract[/* keyof V */ String, String]] = js.native
    
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
    def findLastIndex[V /* <: typings.underscore.mod.List[Any] */](list: V): Double = js.native
    def findLastIndex[V /* <: typings.underscore.mod.List[Any] */](list: V, iteratee: Unit, context: Any): Double = js.native
    def findLastIndex[V /* <: typings.underscore.mod.List[Any] */](list: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Double = js.native
    def findLastIndex[V /* <: typings.underscore.mod.List[Any] */](list: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Double = js.native
    
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
    def findWhere[V /* <: Collection[Any] */](collection: V, properties: Partial[TypeOfCollection[V, scala.Nothing]]): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    
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
    def first[V /* <: typings.underscore.mod.List[Any] */](list: V): js.UndefOr[TypeOfList[V]] = js.native
    def first[V /* <: typings.underscore.mod.List[Any] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
    
    def flatten[V /* <: typings.underscore.mod.List[Any] */](list: V): js.Array[DeepestListItemOrSelf[TypeOfList[V]]] = js.native
    /**
      * Flattens a nested `list` (the nesting can be to any depth). If you
      * pass true or 1 as the depth, the `list` will only be flattened a
      * single level. Passing a greater number will cause the flattening to
      * descend deeper into the nesting hierarchy. Omitting the depth
      * argument, or passing false or Infinity, flattens the `list` all the
      * way to the deepest nesting level.
      * @param list The list to flatten.
      * @param depth True to only flatten one level, optional,
      * default = false.
      * @returns The flattened `list`.
      **/
    def flatten[V /* <: typings.underscore.mod.List[Any] */](list: V, depth: `1` | `true`): js.Array[ListItemOrSelf[TypeOfList[V]]] = js.native
    def flatten[V /* <: typings.underscore.mod.List[Any] */](list: V, depth: Double): js.Array[DeepestListItemOrSelf[TypeOfList[V]]] = js.native
    @JSName("flatten")
    def flatten_false[V /* <: typings.underscore.mod.List[Any] */](list: V, depth: `false`): js.Array[DeepestListItemOrSelf[TypeOfList[V]]] = js.native
    
    /**
      * @see reduce
      **/
    def foldl[V /* <: Collection[Any] */, TResult](
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
    def foldl[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult
    ): TResult = js.native
    def foldl[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
    ): TResult = js.native
    /**
      * @see reduce
      **/
    @JSName("foldl")
    var foldl_Original: FnCallCollectionIterateeMemoContext = js.native
    
    /**
      * @see reduceRight
      **/
    def foldr[V /* <: Collection[Any] */, TResult](
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
    def foldr[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult
    ): TResult = js.native
    def foldr[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
    ): TResult = js.native
    /**
      * @see reduceRight
      **/
    @JSName("foldr")
    var foldr_Original: FnCallCollectionIterateeMemoContext = js.native
    
    /**
      * @see each
      **/
    def forEach[V /* <: Collection[Any] */](collection: V, iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V]): V = js.native
    def forEach[V /* <: Collection[Any] */](
      collection: V,
      iteratee: CollectionIterator[TypeOfCollection[V, scala.Nothing], Unit, V],
      context: Any
    ): V = js.native
    /**
      * @see each
      **/
    @JSName("forEach")
    var forEach_Original: js.Function3[
        /* collection */ Collection[Any], 
        /* iteratee */ CollectionIterator[TypeOfCollection[Collection[Any], scala.Nothing], Unit, Collection[Any]], 
        /* context */ js.UndefOr[Any], 
        Collection[Any]
      ] = js.native
    
    /**
      * Returns a sorted list of the names of every method in an object - that is to say,
      * the name of every function property of the object.
      * @param object Object to pluck all function property names from.
      * @return List of all the function names on `object`.
      **/
    def functions(`object`: Any): js.Array[String] = js.native
    
    /**
      * Returns the specified property of `object`. `path` may be specified
      * as a simple key, or as an array of object keys or array indexes,
      * for deep property fetching. If the property does not exist or is `undefined`,
      * the optional default is returned.
      * @param object The object that maybe contains the property.
      * @param path The path to the property on `object`.
      * @param defaultValue Default if not found.
      * @returns The item on the `object` or the `defaultValue`
      **/
    def get(`object`: Null, path: String): Unit = js.native
    def get(`object`: Null, path: js.Array[String]): Unit = js.native
    def get(`object`: Unit, path: String): Unit = js.native
    def get(`object`: Unit, path: js.Array[String]): Unit = js.native
    def get[V /* <: Collection[Any] */](`object`: V, path: String): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    def get[V /* <: Collection[Any] */](`object`: V, path: js.Array[String]): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    def get[U](`object`: Null, path: String, defaultValue: U): U = js.native
    def get[U](`object`: Null, path: js.Array[String], defaultValue: U): U = js.native
    def get[U](`object`: Unit, path: String, defaultValue: U): U = js.native
    def get[U](`object`: Unit, path: js.Array[String], defaultValue: U): U = js.native
    def get[V /* <: Collection[Any] */, U](`object`: V, path: String, defaultValue: U): (TypeOfCollection[V, scala.Nothing]) | U = js.native
    def get[V /* <: Collection[Any] */, U](`object`: V, path: js.Array[String], defaultValue: U): (TypeOfCollection[V, scala.Nothing]) | U = js.native
    @JSName("get")
    def get_U_U[U](`object`: Null, path: String): U = js.native
    @JSName("get")
    def get_U_U[U](`object`: Null, path: js.Array[String]): U = js.native
    @JSName("get")
    def get_U_U[U](`object`: Unit, path: String): U = js.native
    @JSName("get")
    def get_U_U[U](`object`: Unit, path: js.Array[String]): U = js.native
    @JSName("get")
    def get_VU[V /* <: Collection[Any] */, U](`object`: V, path: String): (TypeOfCollection[V, scala.Nothing]) | U = js.native
    @JSName("get")
    def get_VU[V /* <: Collection[Any] */, U](`object`: V, path: js.Array[String]): (TypeOfCollection[V, scala.Nothing]) | U = js.native
    
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
    def groupBy[V /* <: Collection[Any] */](collection: V): Dictionary[js.Array[TypeOfCollection[V, scala.Nothing]]] = js.native
    def groupBy[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): Dictionary[js.Array[TypeOfCollection[V, scala.Nothing]]] = js.native
    def groupBy[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Dictionary[js.Array[TypeOfCollection[V, scala.Nothing]]] = js.native
    def groupBy[V /* <: Collection[Any] */](
      collection: V,
      iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]],
      context: Any
    ): Dictionary[js.Array[TypeOfCollection[V, scala.Nothing]]] = js.native
    
    /**
      * Does the object contain the given key? Identical to object.hasOwnProperty(key), but uses a safe
      * reference to the hasOwnProperty function, in case it's been overridden accidentally.
      * @param object Object to check for `key`.
      * @param key The key to check for on `object`.
      * @return True if `key` is a property on `object`, otherwise false.
      **/
    def has(`object`: Any, key: String): Boolean = js.native
    
    /**
      * @see first
      **/
    def head[V /* <: typings.underscore.mod.List[Any] */](list: V): js.UndefOr[TypeOfList[V]] = js.native
    /**
      * @see first
      **/
    def head[V /* <: typings.underscore.mod.List[Any] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
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
    def include[V /* <: Collection[Any] */](collection: V, value: Any): Boolean = js.native
    def include[V /* <: Collection[Any] */](collection: V, value: Any, fromIndex: Double): Boolean = js.native
    /**
      * @see contains
      **/
    @JSName("include")
    var include_Original: js.Function3[
        /* collection */ Collection[Any], 
        /* value */ Any, 
        /* fromIndex */ js.UndefOr[Double], 
        Boolean
      ] = js.native
    
    /**
      * @see contains
      **/
    def includes[V /* <: Collection[Any] */](collection: V, value: Any): Boolean = js.native
    def includes[V /* <: Collection[Any] */](collection: V, value: Any, fromIndex: Double): Boolean = js.native
    /**
      * @see contains
      **/
    @JSName("includes")
    var includes_Original: js.Function3[
        /* collection */ Collection[Any], 
        /* value */ Any, 
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
    def indexBy[V /* <: Collection[Any] */](collection: V): Dictionary[TypeOfCollection[V, scala.Nothing]] = js.native
    def indexBy[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): Dictionary[TypeOfCollection[V, scala.Nothing]] = js.native
    def indexBy[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]]): Dictionary[TypeOfCollection[V, scala.Nothing]] = js.native
    def indexBy[V /* <: Collection[Any] */](
      collection: V,
      iteratee: Iteratee[V, String | Double, TypeOfCollection[V, scala.Nothing]],
      context: Any
    ): Dictionary[TypeOfCollection[V, scala.Nothing]] = js.native
    
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
    def indexOf[V /* <: typings.underscore.mod.List[Any] */](list: V, value: TypeOfList[V]): Double = js.native
    def indexOf[V /* <: typings.underscore.mod.List[Any] */](list: V, value: TypeOfList[V], isSortedOrFromIndex: Boolean): Double = js.native
    def indexOf[V /* <: typings.underscore.mod.List[Any] */](list: V, value: TypeOfList[V], isSortedOrFromIndex: Double): Double = js.native
    
    /**
      * Returns everything but the last entry of `list`. Especially useful
      * on the arguments object. Pass `n` to exclude the last
      * `n` elements from the result.
      * @param list The list to retrieve elements from.
      * @param n The number of elements from the end of `list` to omit,
      * optional, default = 1.
      * @returns The elements of `list` with the last `n` items omitted.
      **/
    def initial[V /* <: typings.underscore.mod.List[Any] */](list: V): js.Array[TypeOfList[V]] = js.native
    def initial[V /* <: typings.underscore.mod.List[Any] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
    
    /**
      * @see reduce
      **/
    def inject[V /* <: Collection[Any] */, TResult](
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
    def inject[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult
    ): TResult = js.native
    def inject[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
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
    def intersection[T](lists: typings.underscore.mod.List[T]*): js.Array[T] = js.native
    
    /**
      * Returns a copy of the object where the keys have become the values and the values the keys.
      * For this to work, all of your object's values should be unique and string serializable.
      * @param object Object to invert key/value pairs.
      * @return An inverted key/value paired version of `object`.
      **/
    def invert(`object`: Any): Any = js.native
    
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
    def invoke(list: Collection[Any], methodName: String, args: Any*): js.Array[Any] = js.native
    
    /**
      * Returns true if `object` is an Arguments object.
      * @param object The object to check.
      * @returns True if `object` is an Arguments object, otherwise false.
      **/
    def isArguments(`object`: Any): /* is std.IArguments */ Boolean = js.native
    
    /**
      * Returns true if `object` is an Array.
      * @param object The object to check.
      * @returns True if `object` is an Array, otherwise false.
      **/
    def isArray(`object`: Any): /* is std.Array<any> */ Boolean = js.native
    
    /**
      * Returns true if `object` is an ArrayBuffer.
      * @param object The object to check.
      * @returns True if `object` is an ArrayBuffer, otherwise false.
      **/
    def isArrayBuffer(`object`: Any): /* is std.ArrayBuffer */ Boolean = js.native
    
    /**
      * Returns true if `object` is a Boolean.
      * @param object The object to check.
      * @returns True if `object` is a Boolean, otherwise false.
      **/
    def isBoolean(`object`: Any): /* is boolean */ Boolean = js.native
    
    /**
      * Returns true if `object` is a DataView.
      * @param object The object to check.
      * @returns True if `object` is a DataView, otherwise false.
      **/
    def isDataView(`object`: Any): /* is std.DataView */ Boolean = js.native
    
    /**
      * Returns true if `object` is a Date.
      * @param object The object to check.
      * @returns True if `object` is a Date, otherwise false.
      **/
    def isDate(`object`: Any): /* is std.Date */ Boolean = js.native
    
    /**
      * Returns true if `object` is a DOM element.
      * @param object The object to check.
      * @returns True if `object` is a DOM element, otherwise false.
      **/
    def isElement(`object`: Any): /* is std.Element */ Boolean = js.native
    
    /**
      * Returns true if `collection` contains no values.
      * For strings and array-like objects checks if the length property is
      * 0.
      * @param collection The collection to check.
      * @returns True if `collection` has no elements.
      **/
    def isEmpty(collection: Any): Boolean = js.native
    
    /**
      * Performs an optimized deep comparison between `object` and `other`
      * to determine if they should be considered equal.
      * @param object Compare to `other`.
      * @param other Compare to `object`.
      * @returns True if `object` should be considered equal to `other`.
      **/
    def isEqual(`object`: Any, other: Any): Boolean = js.native
    
    /**
      * Returns true if `object` is an Error.
      * @param object The object to check.
      * @returns True if `object` is a Error, otherwise false.
      **/
    def isError(`object`: Any): /* is std.Error */ Boolean = js.native
    
    /**
      * Returns true if `object` is a finite Number.
      * @param object The object to check.
      * @returns True if `object` is a finite Number.
      **/
    def isFinite(`object`: Any): Boolean = js.native
    
    /**
      * Returns true if `object` is a Function.
      * @param object The object to check.
      * @returns True if `object` is a Function, otherwise false.
      **/
    def isFunction(`object`: Any): /* is std.Function */ Boolean = js.native
    
    /**
      * Returns true if the keys and values in `properties` are contained in
      * `object`.
      * @param object The object to check.
      * @param properties The properties to check for in `object`.
      * @returns True if all keys and values in `properties` are also in
      * `object`.
      **/
    def isMatch(`object`: Any, properties: Any): Boolean = js.native
    
    /**
      * Returns true if `object` is NaN.
      * Note: this is not the same as the native isNaN function,
      * which will also return true if the variable is undefined.
      * @param object The object to check.
      * @returns True if `object` is NaN, otherwise false.
      **/
    def isNaN(`object`: Any): Boolean = js.native
    
    /**
      * Returns true if `object` is null.
      * @param object The object to check.
      * @returns True if `object` is null, otherwise false.
      **/
    def isNull(`object`: Any): /* is null */ Boolean = js.native
    
    /**
      * Returns true if `object` is a Number (including NaN).
      * @param object The object to check.
      * @returns True if `object` is a Number, otherwise false.
      **/
    def isNumber(`object`: Any): /* is number */ Boolean = js.native
    
    /**
      * Returns true if `object` is an Object. Note that JavaScript arrays
      * and functions are objects,
      * while (normal) strings and numbers are not.
      * @param object The object to check.
      * @returns True if `object` is an Object, otherwise false.
      **/
    def isObject(`object`: Any): Boolean = js.native
    
    /**
      * Returns true if `object` is a RegExp.
      * @param object The object to check.
      * @returns True if `object` is a RegExp, otherwise false.
      **/
    def isRegExp(`object`: Any): /* is std.RegExp */ Boolean = js.native
    
    /**
      * Returns true if `object` is a String.
      * @param object The object to check.
      * @returns True if `object` is a String, otherwise false.
      **/
    def isString(`object`: Any): /* is string */ Boolean = js.native
    
    /**
      * Returns true if `object` is a Symbol.
      * @param object The object to check.
      * @returns True if `object` is a Symbol, otherwise false.
      **/
    def isSymbol(`object`: Any): /* is symbol */ Boolean = js.native
    
    /**
      * Returns true if `object` is a TypedArray.
      * @param object The object to check.
      * @returns True if `object` is a TypedArray, otherwise false.
      **/
    def isTypedArray(`object`: Any): /* is underscore.underscore.TypedArray */ Boolean = js.native
    
    /**
      * Returns true if `object` is undefined.
      * @param object The object to check.
      * @returns True if `object` is undefined, otherwise false.
      **/
    def isUndefined(`object`: Any): /* is undefined */ Boolean = js.native
    
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
    def iteratee(value: js.Function, context: Any): js.Function = js.native
    def iteratee(value: js.Object): js.Function = js.native
    
    /***********
      * Objects *
      ***********/
    /**
      * Retrieve all the names of the object's properties.
      * @param object Retrieve the key or property names from this object.
      * @return List of all the property names on `object`.
      **/
    def keys(`object`: Any): js.Array[String] = js.native
    
    /**
      * Returns the last element of `list`. Passing `n` will return the last
      * `n` elements of `list`.
      * @param list The list to retrieve elements from.
      * @param n The number of elements to retrieve, optional.
      * @returns The last `n` elements of `list` or the last element if `n`
      * is omitted.
      **/
    def last[V /* <: typings.underscore.mod.List[Any] */](list: V): js.UndefOr[TypeOfList[V]] = js.native
    def last[V /* <: typings.underscore.mod.List[Any] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
    
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
    def lastIndexOf[V /* <: typings.underscore.mod.List[Any] */](list: V, value: TypeOfList[V]): Double = js.native
    def lastIndexOf[V /* <: typings.underscore.mod.List[Any] */](list: V, value: TypeOfList[V], fromIndex: Double): Double = js.native
    
    def map[V /* <: Collection[Any] */](collection: V): js.Array[IterateeResult[Null, TypeOfCollection[V, scala.Nothing]]] = js.native
    /**
      * Produces a new array of values by mapping each value in `collection`
      * through a transformation `iteratee`.
      * @param collection The collection to transform.
      * @param iteratee The iteratee to use to transform each item in
      * `collection`.
      * @param context `this` object in `iteratee`, optional.
      * @returns The mapped result.
      **/
    def map[V /* <: Collection[Any] */](collection: V, iteratee: String): js.Array[IterateeResult[String, TypeOfCollection[V, scala.Nothing]]] = js.native
    def map[V /* <: Collection[Any] */](collection: V, iteratee: String, context: Any): js.Array[IterateeResult[String, TypeOfCollection[V, scala.Nothing]]] = js.native
    def map[V /* <: Collection[Any] */](collection: V, iteratee: js.Array[String | Double]): js.Array[IterateeResult[js.Array[String | Double], TypeOfCollection[V, scala.Nothing]]] = js.native
    def map[V /* <: Collection[Any] */](collection: V, iteratee: js.Array[String | Double], context: Any): js.Array[IterateeResult[js.Array[String | Double], TypeOfCollection[V, scala.Nothing]]] = js.native
    def map[V /* <: Collection[Any] */](collection: V, iteratee: Double): js.Array[IterateeResult[Double, TypeOfCollection[V, scala.Nothing]]] = js.native
    def map[V /* <: Collection[Any] */](collection: V, iteratee: Double, context: Any): js.Array[IterateeResult[Double, TypeOfCollection[V, scala.Nothing]]] = js.native
    def map[V /* <: Collection[Any] */](collection: V, iteratee: Null, context: Any): js.Array[IterateeResult[Null, TypeOfCollection[V, scala.Nothing]]] = js.native
    def map[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): js.Array[IterateeResult[Unit, TypeOfCollection[V, scala.Nothing]]] = js.native
    def map[V /* <: Collection[Any] */, I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](collection: V, iteratee: I): js.Array[IterateeResult[I, TypeOfCollection[V, scala.Nothing]]] = js.native
    def map[V /* <: Collection[Any] */, I /* <: (CollectionIterator[TypeOfCollection[V, scala.Nothing], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, never> ]:? underscore.underscore.TypeOfCollection<V, never>[P]}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & (TopLevel[TypeOfCollection[V, scala.Nothing]])) */](collection: V, iteratee: I, context: Any): js.Array[IterateeResult[I, TypeOfCollection[V, scala.Nothing]]] = js.native
    
    def mapObject[V /* <: js.Object */](`object`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<null, V[K]>}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & TopLevel[V] = js.native
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
      */ typings.underscore.underscoreStrings.UnderscoreStatic & TopLevel[V] = js.native
    def mapObject[V /* <: js.Object */](`object`: V, iteratee: String, context: Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<string, V[K]>}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & TopLevel[V] = js.native
    def mapObject[V /* <: js.Object */](`object`: V, iteratee: js.Array[String | Double]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<std.Array<string | number>, V[K]>}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & TopLevel[V] = js.native
    def mapObject[V /* <: js.Object */](`object`: V, iteratee: js.Array[String | Double], context: Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<std.Array<string | number>, V[K]>}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & TopLevel[V] = js.native
    def mapObject[V /* <: js.Object */](`object`: V, iteratee: Double): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<number, V[K]>}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & TopLevel[V] = js.native
    def mapObject[V /* <: js.Object */](`object`: V, iteratee: Double, context: Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<number, V[K]>}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & TopLevel[V] = js.native
    def mapObject[V /* <: js.Object */](`object`: V, iteratee: Null, context: Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<null, V[K]>}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & TopLevel[V] = js.native
    def mapObject[V /* <: js.Object */](`object`: V, iteratee: Unit, context: Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<undefined, V[K]>}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & TopLevel[V] = js.native
    def mapObject[V /* <: js.Object */, I /* <: (CollectionIterator[TypeOfCollection[V, Any], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, any> ]:? underscore.underscore.TypeOfCollection<V, any>[P]}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & (TopLevel[TypeOfCollection[V, Any]])) */](`object`: V, iteratee: I): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<I, V[K]>}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & TopLevel[V] = js.native
    def mapObject[V /* <: js.Object */, I /* <: (CollectionIterator[TypeOfCollection[V, Any], Any, V]) | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof underscore.underscore.TypeOfCollection<V, any> ]:? underscore.underscore.TypeOfCollection<V, any>[P]}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & (TopLevel[TypeOfCollection[V, Any]])) */](`object`: V, iteratee: I, context: Any): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof V ]: underscore.underscore.IterateeResult<I, V[K]>}
      */ typings.underscore.underscoreStrings.UnderscoreStatic & TopLevel[V] = js.native
    
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
    def max[V /* <: Collection[Any] */](collection: V): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
    def max[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
    def max[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
    def max[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
    
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
    def memoize[T](fn: T, hashFn: js.Function1[/* repeated */ Any, String]): T = js.native
    
    /**
      * @see _functions
      **/
    def methods(`object`: Any): js.Array[String] = js.native
    
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
    def min[V /* <: Collection[Any] */](list: V): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
    def min[V /* <: Collection[Any] */](list: V, iteratee: Unit, context: Any): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
    def min[V /* <: Collection[Any] */](list: V, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
    def min[V /* <: Collection[Any] */](list: V, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): (TypeOfCollection[V, scala.Nothing]) | Double = js.native
    
    /**
      * Allows you to extend Underscore with your own utility functions. Pass a hash of
      * {name: function} definitions to have your functions added to the Underscore object,
      * as well as the OOP wrapper.
      * @param object Mixin object containing key/function pairs to add to the Underscore object.
      **/
    def mixin(`object`: Any): Unit = js.native
    
    /**
      * Returns a negated version of the pass-in predicate.
      * @param (...args: any[]) => boolean predicate
      * @return (...args: any[]) => boolean
      **/
    def negate(predicate: js.Function1[/* repeated */ Any, Boolean]): js.Function1[/* repeated */ Any, Boolean] = js.native
    
    /***********
      * Utility *
      ***********/
    /**
      * Give control of the "_" variable back to its previous owner.
      * Returns a reference to the Underscore object.
      * @return Underscore object reference.
      **/
    def noConflict(): Any = js.native
    
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
    
    def `object`[TList /* <: typings.underscore.mod.List[typings.underscore.mod.List[Any]] */](list: TList): Dictionary[PairValue[TypeOfList[TList]]] = js.native
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
    def `object`[TList /* <: typings.underscore.mod.List[String | Double] */, TValue](list: TList, values: typings.underscore.mod.List[TValue]): Dictionary[js.UndefOr[TValue]] = js.native
    
    /**
      * Return a copy of `object` that is filtered to not have values for
      * the keys selected by a truth test.
      * @param object The object to omit specific keys from.
      * @param iterator A truth test that selects the keys to omit from
      * `object`.
      * @returns A copy of `object` without the keys selected by
      * `iterator`.
      **/
    def omit[V](`object`: V, iterator: ObjectIterator[TypeOfDictionary[V, Any], Boolean, V]): Partial[V] = js.native
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
    def pairs[V /* <: js.Object */](`object`: V): js.Array[js.Tuple2[Extract[/* keyof V */ String, String], TypeOfCollection[V, Any]]] = js.native
    
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
    def partition[V /* <: Collection[Any] */](list: V): js.Tuple2[
        js.Array[TypeOfCollection[V, scala.Nothing]], 
        js.Array[TypeOfCollection[V, scala.Nothing]]
      ] = js.native
    def partition[V /* <: Collection[Any] */](list: V, iteratee: Unit, context: Any): js.Tuple2[
        js.Array[TypeOfCollection[V, scala.Nothing]], 
        js.Array[TypeOfCollection[V, scala.Nothing]]
      ] = js.native
    def partition[V /* <: Collection[Any] */](list: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Tuple2[
        js.Array[TypeOfCollection[V, scala.Nothing]], 
        js.Array[TypeOfCollection[V, scala.Nothing]]
      ] = js.native
    def partition[V /* <: Collection[Any] */](list: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): js.Tuple2[
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
    def pick[V](`object`: V, iterator: ObjectIterator[TypeOfDictionary[V, Any], Boolean, V]): Partial[V] = js.native
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
    def pluck[V /* <: Collection[Any] */](collection: V, propertyName: String): js.Array[PropertyTypeOrAny[TypeOfCollection[V, scala.Nothing], String]] = js.native
    def pluck[V /* <: Collection[Any] */](collection: V, propertyName: Double): js.Array[PropertyTypeOrAny[TypeOfCollection[V, scala.Nothing], Double]] = js.native
    
    /**
      * Returns a function that will itself return the key property of any passed-in object.
      * @param key Property of the object.
      * @return Function which accept an object an returns the value of key in that object.
      **/
    def property(key: String): js.Function1[/* object */ Any, Any] = js.native
    def property(key: js.Array[String | Double]): js.Function1[/* object */ Any, Any] = js.native
    def property(key: Double): js.Function1[/* object */ Any, Any] = js.native
    
    /**
      * Returns a function that will itself return the value of a object key property.
      * @param key The object to get the property value from.
      * @return Function which accept a key property in `object` and returns its value.
      **/
    def propertyOf(`object`: js.Object): js.Function1[/* key */ String | Double | (js.Array[String | Double]), Any] = js.native
    
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
    def range(startOrStop: Double, stop: Double): js.Array[Double] = js.native
    def range(startOrStop: Double, stop: Double, step: Double): js.Array[Double] = js.native
    def range(startOrStop: Double, stop: Unit, step: Double): js.Array[Double] = js.native
    
    def reduce[V /* <: Collection[Any] */, TResult](
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
    def reduce[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult
    ): TResult = js.native
    def reduce[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
    ): TResult = js.native
    
    def reduceRight[V /* <: Collection[Any] */, TResult](
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
    def reduceRight[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult
    ): TResult = js.native
    def reduceRight[V /* <: Collection[Any] */, TResult](
      collection: V,
      iteratee: MemoCollectionIterator[TypeOfCollection[V, scala.Nothing], TResult, V],
      memo: TResult,
      context: Any
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
    def reject[V /* <: Collection[Any] */](collection: V): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    def reject[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    def reject[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    def reject[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    
    /**
      * Returns the rest of the elements in `list`. Pass an `index` to
      * return the values of the list from that index onward.
      * @param list The list to retrieve elements from.
      * @param index The index to start retrieving elements from, optional,
      * default = 1.
      * @returns The elements of `list` from `index` to the end of the list.
      **/
    def rest[V /* <: typings.underscore.mod.List[Any] */](list: V): js.Array[TypeOfList[V]] = js.native
    def rest[V /* <: typings.underscore.mod.List[Any] */](list: V, index: Double): js.Array[TypeOfList[V]] = js.native
    
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
    def result(`object`: Any, property: String): Any = js.native
    def result(`object`: Any, property: String, defaultValue: Any): Any = js.native
    
    def sample[V /* <: Collection[Any] */](collection: V): js.UndefOr[TypeOfCollection[V, scala.Nothing]] = js.native
    /**
      * Produce a random sample from `collection`. Pass a number to return
      * `n` random elements from `collection`. Otherwise a single random
      * item will be returned.
      * @param collection The collection to sample.
      * @param n The number of elements to sample from `collection`.
      * @returns A random sample of `n` elements from `collection` or a
      * single element if `n` is not specified.
      **/
    def sample[V /* <: Collection[Any] */](collection: V, n: Double): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    
    /**
      * @see filter
      **/
    def select[V /* <: Collection[Any] */](collection: V): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    def select[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    def select[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    def select[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    /**
      * @see filter
      **/
    @JSName("select")
    var select_Original: js.Function3[
        /* collection */ Collection[Any], 
        /* iteratee */ js.UndefOr[
          Iteratee[Collection[Any], Boolean, TypeOfCollection[Collection[Any], scala.Nothing]]
        ], 
        /* context */ js.UndefOr[Any], 
        js.Array[TypeOfCollection[Collection[Any], scala.Nothing]]
      ] = js.native
    
    /**
      * Returns a shuffled copy of `collection`, using a version of the
      * Fisher-Yates shuffle.
      * @param collection The collection to shuffle.
      * @returns A shuffled copy of `collection`.
      **/
    def shuffle[V /* <: Collection[Any] */](collection: V): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    
    /**
      * Determines the number of values in `collection`.
      * @param collection The collection to determine the number of values
      * for.
      * @returns The number of values in `collection`.
      **/
    def size(collection: Collection[Any]): Double = js.native
    
    /**
      * Returns true if any of the values in `collection` pass the
      * `iteratee` truth test. Short-circuits and stops traversing
      * `collection` if a true element is found.
      * @param collection The collection to evaluate.
      * @param iteratee The truth test to apply.
      * @param context `this` object in `iteratee`, optional.
      * @returns True if any element passed the truth test, otherwise false.
      **/
    def some[V /* <: Collection[Any] */](collection: V): Boolean = js.native
    def some[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): Boolean = js.native
    def some[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]]): Boolean = js.native
    def some[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Boolean, TypeOfCollection[V, scala.Nothing]], context: Any): Boolean = js.native
    
    /**
      * Returns a (stably) sorted copy of `collection`, ranked in ascending
      * order by the results of running each value through `iteratee`.
      * @param collection The collection to sort.
      * @param iteratee An iteratee that provides the value to sort by for
      * each item in `collection`.
      * @param context `this` object in `iteratee`, optional.
      * @returns A sorted copy of `collection`.
      **/
    def sortBy[V /* <: Collection[Any] */](collection: V): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    def sortBy[V /* <: Collection[Any] */](collection: V, iteratee: Unit, context: Any): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    def sortBy[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    def sortBy[V /* <: Collection[Any] */](collection: V, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    
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
    def sortedIndex[V /* <: typings.underscore.mod.List[Any] */](list: V, value: TypeOfList[V]): Double = js.native
    def sortedIndex[V /* <: typings.underscore.mod.List[Any] */](list: V, value: TypeOfList[V], iteratee: Unit, context: Any): Double = js.native
    def sortedIndex[V /* <: typings.underscore.mod.List[Any] */](
      list: V,
      value: TypeOfList[V],
      iteratee: Iteratee[js.UndefOr[V], Any, TypeOfCollection[js.UndefOr[V], scala.Nothing]]
    ): Double = js.native
    def sortedIndex[V /* <: typings.underscore.mod.List[Any] */](
      list: V,
      value: TypeOfList[V],
      iteratee: Iteratee[js.UndefOr[V], Any, TypeOfCollection[js.UndefOr[V], scala.Nothing]],
      context: Any
    ): Double = js.native
    
    /**
      * @see rest
      **/
    def tail[V /* <: typings.underscore.mod.List[Any] */](list: V): js.Array[TypeOfList[V]] = js.native
    def tail[V /* <: typings.underscore.mod.List[Any] */](list: V, index: Double): js.Array[TypeOfList[V]] = js.native
    /**
      * @see rest
      **/
    @JSName("tail")
    var tail_Original: js.Function2[
        /* list */ typings.underscore.mod.List[Any], 
        /* index */ js.UndefOr[Double], 
        js.Array[TypeOfList[typings.underscore.mod.List[Any]]]
      ] = js.native
    
    /**
      * @see first
      **/
    def take[V /* <: typings.underscore.mod.List[Any] */](list: V): js.UndefOr[TypeOfList[V]] = js.native
    /**
      * @see first
      **/
    def take[V /* <: typings.underscore.mod.List[Any] */](list: V, n: Double): js.Array[TypeOfList[V]] = js.native
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
    def throttle[T /* <: js.Function */](func: T, wait: Double): T & Cancelable = js.native
    def throttle[T /* <: js.Function */](func: T, wait: Double, options: ThrottleSettings): T & Cancelable = js.native
    
    /**
      * Invokes the given iterator function n times.
      * Each invocation of iterator is called with an index argument
      * @param n Number of times to invoke `iterator`.
      * @param iterator Function iterator to invoke `n` times.
      * @param context `this` object in `iterator`, optional.
      **/
    def times[TResult](n: Double, iterator: js.Function1[/* n */ Double, TResult]): js.Array[TResult] = js.native
    def times[TResult](n: Double, iterator: js.Function1[/* n */ Double, TResult], context: Any): js.Array[TResult] = js.native
    
    /**
      * Creates a real Array from `collection` (anything that can be
      * iterated over). Useful for transmuting the arguments object.
      * @param collection The collection to transform into an array.
      * @returns An array containing the elements of `collection`.
      **/
    def toArray[V /* <: Collection[Any] */](collection: V): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    
    def transpose(lists: typings.underscore.mod.List[typings.underscore.mod.List[Any]]): js.Array[js.Array[Any]] = js.native
    
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
    def union[T](lists: typings.underscore.mod.List[T]*): js.Array[T] = js.native
    
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
    def uniq[V /* <: typings.underscore.mod.List[Any] */](list: V): js.Array[TypeOfList[V]] = js.native
    def uniq[V /* <: typings.underscore.mod.List[Any] */](list: V, isSorted: Boolean): js.Array[TypeOfList[V]] = js.native
    def uniq[V /* <: typings.underscore.mod.List[Any] */](list: V, isSorted: Boolean, iteratee: Unit, context: Any): js.Array[TypeOfList[V]] = js.native
    def uniq[V /* <: typings.underscore.mod.List[Any] */](list: V, isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfList[V]] = js.native
    def uniq[V /* <: typings.underscore.mod.List[Any] */](
      list: V,
      isSorted: Boolean,
      iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]],
      context: Any
    ): js.Array[TypeOfList[V]] = js.native
    def uniq[V /* <: typings.underscore.mod.List[Any] */](list: V, isSorted: Unit, iteratee: Any | (Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]])): js.Array[TypeOfList[V]] = js.native
    def uniq[V /* <: typings.underscore.mod.List[Any] */](list: V, isSorted: Unit, iteratee: Unit, context: Any): js.Array[TypeOfList[V]] = js.native
    def uniq[V /* <: typings.underscore.mod.List[Any] */](
      list: V,
      isSorted: Unit,
      iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]],
      context: Any
    ): js.Array[TypeOfList[V]] = js.native
    def uniq[V /* <: typings.underscore.mod.List[Any] */](list: V, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfList[V]] = js.native
    def uniq[V /* <: typings.underscore.mod.List[Any] */](list: V, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[TypeOfList[V]] = js.native
    
    /**
      * @see uniq
      **/
    def unique[V /* <: typings.underscore.mod.List[Any] */](list: V): js.Array[TypeOfList[V]] = js.native
    def unique[V /* <: typings.underscore.mod.List[Any] */](list: V, isSorted: Boolean): js.Array[TypeOfList[V]] = js.native
    def unique[V /* <: typings.underscore.mod.List[Any] */](list: V, isSorted: Boolean, iteratee: Unit, context: Any): js.Array[TypeOfList[V]] = js.native
    def unique[V /* <: typings.underscore.mod.List[Any] */](list: V, isSorted: Boolean, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfList[V]] = js.native
    def unique[V /* <: typings.underscore.mod.List[Any] */](
      list: V,
      isSorted: Boolean,
      iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]],
      context: Any
    ): js.Array[TypeOfList[V]] = js.native
    def unique[V /* <: typings.underscore.mod.List[Any] */](list: V, isSorted: Unit, iteratee: Any | (Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]])): js.Array[TypeOfList[V]] = js.native
    def unique[V /* <: typings.underscore.mod.List[Any] */](list: V, isSorted: Unit, iteratee: Unit, context: Any): js.Array[TypeOfList[V]] = js.native
    def unique[V /* <: typings.underscore.mod.List[Any] */](
      list: V,
      isSorted: Unit,
      iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]],
      context: Any
    ): js.Array[TypeOfList[V]] = js.native
    def unique[V /* <: typings.underscore.mod.List[Any] */](list: V, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfList[V]] = js.native
    def unique[V /* <: typings.underscore.mod.List[Any] */](list: V, iteratee: Iteratee[V, Any, TypeOfCollection[V, scala.Nothing]], context: Any): js.Array[TypeOfList[V]] = js.native
    
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
      * elements, and so on. (alias: transpose)
      * @param lists The lists to unzip.
      * @returns The unzipped version of `lists`.
      **/
    def unzip(lists: typings.underscore.mod.List[typings.underscore.mod.List[Any]]): js.Array[js.Array[Any]] = js.native
    
    /**
      * Return all of the values of the object's properties.
      * @param object Retrieve the values of all the properties on this object.
      * @return List of all the values on `object`.
      **/
    def values(`object`: Any): js.Array[Any] = js.native
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
    def where[V /* <: Collection[Any] */](collection: V, properties: Partial[TypeOfCollection[V, scala.Nothing]]): js.Array[TypeOfCollection[V, scala.Nothing]] = js.native
    
    /**
      * Returns a copy of `list` with all instances of `values` removed.
      * @param list The list to exclude `values` from.
      * @param values The values to exclude from `list`.
      * @returns An array that contains all elements of `list` except for
      * `values`.
      **/
    def without[V /* <: typings.underscore.mod.List[Any] */](list: V, values: TypeOfList[V]*): js.Array[TypeOfList[V]] = js.native
    
    /**
      * Wraps the first function inside of the wrapper function, passing it as the first argument. This allows
      * the wrapper to execute code before and after the function runs, adjust the arguments, and execute it
      * conditionally.
      * @param fn Function to wrap.
      * @param wrapper The function that will wrap `fn`.
      * @return Wrapped version of `fn.
      **/
    def wrap(fn: js.Function, wrapper: js.Function2[/* fn */ js.Function, /* repeated */ Any, Any]): js.Function = js.native
    
    /**
      * Merges together the values of each of the `lists` with the values at
      * the corresponding position. Useful when you have separate data
      * sources that are coordinated through matching list indexes.
      * @param lists The lists to zip.
      * @returns The zipped version of `lists`.
      **/
    def zip(lists: typings.underscore.mod.List[Any]*): js.Array[js.Array[Any]] = js.native
  }
  
  trait _AnyFalsy extends StObject
  
  type _To = UnderscoreStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: UnderscoreStatic = ^
}
