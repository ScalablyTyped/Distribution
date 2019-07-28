package typings.underscore.underscoreMod

import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _Chain[T, V] extends js.Object {
  /**
    * Wrapped type `number`.
    * @see _.after
    **/
  def after(func: js.Function): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.all
    **/
  def all(): _ChainSingle[Boolean] = js.native
  def all(iterator: ListIterator[T, Boolean]): _ChainSingle[Boolean] = js.native
  def all(iterator: ListIterator[T, Boolean], context: js.Any): _ChainSingle[Boolean] = js.native
  /**
    * Wrapped type `object`.
    * @see _.allKeys
    **/
  def allKeys(): _Chain[String, String] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.any
    **/
  def any(): _ChainSingle[Boolean] = js.native
  def any(iterator: ListIterator[T, Boolean]): _ChainSingle[Boolean] = js.native
  def any(iterator: ListIterator[T, Boolean], context: js.Any): _ChainSingle[Boolean] = js.native
  /**
    * Wrapped type `number`.
    * @see _.before
    **/
  def before(fn: js.Function): _Chain[T, T] = js.native
  /* ***********
    * Functions *
    ************ */
  /**
    * Wrapped type `Function`.
    * @see _.bind
    **/
  def bind(`object`: js.Any, args: js.Any*): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.bindAll
    **/
  def bindAll(methodNames: String*): _Chain[T, T] = js.native
  /********** *
    * Chaining *
    *********** */
  /**
    * Wrapped type `any`.
    * @see _.chain
    **/
  def chain(): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[][]`.
    * @see _.chunk
    **/
  def chunk(): _Chain[T, T] = js.native
  /**
    * @see _.map
    **/
  def collect[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult])): _Chain[TResult, TResult] = js.native
  def collect[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult]), context: js.Any): _Chain[TResult, TResult] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.compact
    **/
  def compact(): _Chain[T, T] = js.native
  /**
    * Wrapped type `Function[]`.
    * @see _.compose
    **/
  def compose(functions: js.Function*): _Chain[T, T] = js.native
  /************* *
    * Array proxy *
    ************** */
  /**
    * Returns a new array comprised of the array on which it is called
    * joined with the array(s) and/or value(s) provided as arguments.
    * @param arr Arrays and/or values to concatenate into a new array. See the discussion below for details.
    * @return A new array comprised of the array on which it is called
    **/
  def concat(arr: js.Array[T]*): _Chain[T, T] = js.native
  /**
    * Wrapped type `any`.
    * @see _.constant
    **/
  def constant(): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.contains
    **/
  def contains(value: T): _ChainSingle[Boolean] = js.native
  def contains(value: T, fromIndex: Double): _ChainSingle[Boolean] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.countBy
    **/
  def countBy(): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.countBy
    **/
  def countBy(iterator: String): _Chain[T, T] = js.native
  def countBy(iterator: String, context: js.Any): _Chain[T, T] = js.native
  def countBy(iterator: ListIterator[T, _]): _Chain[T, T] = js.native
  def countBy(iterator: ListIterator[T, _], context: js.Any): _Chain[T, T] = js.native
  /**
    * Wrapped type `any`.
    * @see _.create
    **/
  def create(): _Chain[T, T] = js.native
  def create(props: js.Object): _Chain[T, T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.debounce
    **/
  def debounce(wait: Double): _Chain[T, T] = js.native
  def debounce(wait: Double, immediate: Boolean): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.defaults
    **/
  def defaults(defaults: js.Any*): _Chain[T, T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.defer
    **/
  def defer(args: js.Any*): _Chain[T, T] = js.native
  /**
    * @see _.delay
    **/
  def delay(args: js.Any*): _Chain[T, T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.delay
    **/
  def delay(wait: Double, args: js.Any*): _Chain[T, T] = js.native
  /**
    * @see _.find
    **/
  def detect[T](interator: String): _ChainSingle[js.UndefOr[T]] = js.native
  /**
    * @see _.find
    **/
  def detect[T](iterator: (ListIterator[T, Boolean]) | (ObjectIterator[T, Boolean])): _ChainSingle[js.UndefOr[T]] = js.native
  def detect[T](iterator: (ListIterator[T, Boolean]) | (ObjectIterator[T, Boolean]), context: js.Any): _ChainSingle[js.UndefOr[T]] = js.native
  /**
    * @see _.find
    **/
  def detect[T, U /* <: js.Object */](interator: U): _ChainSingle[js.UndefOr[T]] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.difference
    **/
  def difference(others: List[T]*): _Chain[T, T] = js.native
  /**
    * @see _.rest
    **/
  def drop(): _Chain[T, T] = js.native
  def drop(n: Double): _Chain[T, T] = js.native
  /* *************
    * Collections *
    ************* */
  /**
    * Wrapped type `any[]`.
    * @see _.each
    **/
  /**
    * @see _.each
    **/
  def each(iterator: (ListIterator[T, Unit]) | (ObjectIterator[T, Unit])): _Chain[T, T] = js.native
  def each(iterator: (ListIterator[T, Unit]) | (ObjectIterator[T, Unit]), context: js.Any): _Chain[T, T] = js.native
  /**
    * Wrapped type `string`.
    * @see _.escape
    **/
  def escape(): _Chain[T, T] = js.native
  /**
    * @see _.all
    **/
  def every(): _ChainSingle[Boolean] = js.native
  def every(iterator: ListIterator[T, Boolean]): _ChainSingle[Boolean] = js.native
  def every(iterator: ListIterator[T, Boolean], context: js.Any): _ChainSingle[Boolean] = js.native
  /**
    * Wrapped type `object`.
    * @see _.extend
    **/
  def extend(sources: js.Any*): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.filter
    **/
  def filter(iterator: ListIterator[T, Boolean]): _Chain[T, T] = js.native
  def filter(iterator: ListIterator[T, Boolean], context: js.Any): _Chain[T, T] = js.native
  /**
    * @see _.find
    **/
  def find[T](interator: String): _ChainSingle[js.UndefOr[T]] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.find
    **/
  def find[T](iterator: (ListIterator[T, Boolean]) | (ObjectIterator[T, Boolean])): _ChainSingle[js.UndefOr[T]] = js.native
  def find[T](iterator: (ListIterator[T, Boolean]) | (ObjectIterator[T, Boolean]), context: js.Any): _ChainSingle[js.UndefOr[T]] = js.native
  /**
    * @see _.find
    **/
  def find[T, U /* <: js.Object */](interator: U): _ChainSingle[js.UndefOr[T]] = js.native
  def findIndex[T](predicate: js.Object): _ChainSingle[Double] = js.native
  def findIndex[T](predicate: js.Object, context: js.Any): _ChainSingle[Double] = js.native
  /**
    * @see _.findIndex
    **/
  def findIndex[T](predicate: ListIterator[T, Boolean]): _ChainSingle[Double] = js.native
  def findIndex[T](predicate: ListIterator[T, Boolean], context: js.Any): _ChainSingle[Double] = js.native
  /**
    * Wrapped type `object`.
    * @see _.extend
    **/
  def findKey(predicate: ObjectIterator[_, Boolean]): _Chain[T, T] = js.native
  def findKey(predicate: ObjectIterator[_, Boolean], context: js.Any): _Chain[T, T] = js.native
  def findLastIndex[T](predicate: js.Object): _ChainSingle[Double] = js.native
  def findLastIndex[T](predicate: js.Object, context: js.Any): _ChainSingle[Double] = js.native
  /**
    * @see _.findLastIndex
    **/
  def findLastIndex[T](predicate: ListIterator[T, Boolean]): _ChainSingle[Double] = js.native
  def findLastIndex[T](predicate: ListIterator[T, Boolean], context: js.Any): _ChainSingle[Double] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.findWhere
    **/
  def findWhere[U /* <: js.Object */](properties: U): _ChainSingle[T] = js.native
  /*********
    * Arrays *
    **********/
  /**
    * Wrapped type `any[]`.
    * @see _.first
    **/
  def first(): _ChainSingle[js.UndefOr[T]] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.first
    **/
  def first(n: Double): _Chain[T, T] = js.native
  /**
    * Wrapped type `any`.
    * @see _.flatten
    **/
  def flatten(): _Chain[_, _] = js.native
  def flatten(shallow: Boolean): _Chain[_, _] = js.native
  /**
    * @see _.reduce
    **/
  def foldl[TResult](iterator: MemoIterator[T, TResult]): _ChainSingle[TResult] = js.native
  def foldl[TResult](iterator: MemoIterator[T, TResult], memo: TResult): _ChainSingle[TResult] = js.native
  def foldl[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): _ChainSingle[TResult] = js.native
  /**
    * @see _.reduceRight
    **/
  def foldr[TResult](iterator: MemoIterator[T, TResult]): _ChainSingle[TResult] = js.native
  def foldr[TResult](iterator: MemoIterator[T, TResult], memo: TResult): _ChainSingle[TResult] = js.native
  def foldr[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): _ChainSingle[TResult] = js.native
  /**
    * @see _.each
    **/
  def forEach(iterator: (ListIterator[T, Unit]) | (ObjectIterator[T, Unit])): _Chain[T, T] = js.native
  def forEach(iterator: (ListIterator[T, Unit]) | (ObjectIterator[T, Unit]), context: js.Any): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.functions
    **/
  def functions(): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.groupBy
    **/
  def groupBy(): _ChainOfArrays[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.groupBy
    **/
  def groupBy(iterator: String): _ChainOfArrays[T] = js.native
  def groupBy(iterator: String, context: js.Any): _ChainOfArrays[T] = js.native
  def groupBy(iterator: ListIterator[T, _]): _ChainOfArrays[T] = js.native
  def groupBy(iterator: ListIterator[T, _], context: js.Any): _ChainOfArrays[T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.has
    **/
  def has(key: String): _Chain[T, T] = js.native
  /**
    * @see _.first
    **/
  def head(): _Chain[T, T] = js.native
  /**
    * @see _.first
    **/
  def head(n: Double): _Chain[T, T] = js.native
  /********* *
    * Utility *
    ********** */
  /**
    * Wrapped type `any`.
    * @see _.identity
    **/
  def identity(): _Chain[T, T] = js.native
  /**
    * Alias for 'contains'.
    * @see contains
    **/
  def include(value: T): _ChainSingle[Boolean] = js.native
  def include(value: T, fromIndex: Double): _ChainSingle[Boolean] = js.native
  /**
    * Alias for 'contains'.
    * @see contains
    **/
  def includes(value: T): _ChainSingle[Boolean] = js.native
  def includes(value: T, fromIndex: Double): _ChainSingle[Boolean] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.indexBy
    **/
  def indexBy(iterator: String): _Chain[T, T] = js.native
  def indexBy(iterator: String, context: js.Any): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.indexBy
    **/
  def indexBy(iterator: ListIterator[T, _]): _Chain[T, T] = js.native
  def indexBy(iterator: ListIterator[T, _], context: js.Any): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.indexOf
    **/
  def indexOf(value: T): _ChainSingle[Double] = js.native
  def indexOf(value: T, isSorted: Boolean): _ChainSingle[Double] = js.native
  /**
    * @see _.indexOf
    **/
  def indexOf(value: T, startFrom: Double): _ChainSingle[Double] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.initial
    **/
  def initial(): _Chain[T, T] = js.native
  def initial(n: Double): _Chain[T, T] = js.native
  /**
    * @see _.reduce
    **/
  def inject[TResult](iterator: MemoIterator[T, TResult]): _ChainSingle[TResult] = js.native
  def inject[TResult](iterator: MemoIterator[T, TResult], memo: TResult): _ChainSingle[TResult] = js.native
  def inject[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): _ChainSingle[TResult] = js.native
  /**
    * Wrapped type `any[][]`.
    * @see _.intersection
    **/
  def intersection(arrays: List[T]*): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.invert
    **/
  def invert(): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.invoke
    **/
  def invoke(methodName: String, args: js.Any*): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isArguments
    **/
  def isArguments(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isArray
    **/
  def isArray(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isBoolean
    **/
  def isBoolean(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isDate
    **/
  def isDate(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isElement
    **/
  def isElement(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isEmpty
    **/
  def isEmpty(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isEqual
    **/
  def isEqual(other: js.Any): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isError
    **/
  def isError(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isFinite
    **/
  def isFinite(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isFunction
    **/
  def isFunction(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isMatch
    **/
  def isMatch(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isNaN
    **/
  def isNaN(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isNull
    **/
  def isNull(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isNumber
    **/
  def isNumber(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isObject
    **/
  def isObject(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isRegExp
    **/
  def isRegExp(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isString
    **/
  def isString(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isSymbol
    **/
  def isSymbol(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.isUndefined
    **/
  def isUndefined(): _Chain[T, T] = js.native
  /**
    * Wrapped type `string|Function|Object`.
    * @see _.iteratee
    **/
  def iteratee(): _Chain[T, T] = js.native
  def iteratee(context: js.Any): _Chain[T, T] = js.native
  /**
    * Join all elements of an array into a string.
    * @param separator Optional. Specifies a string to separate each element of the array. The separator is converted to a string if necessary. If omitted, the array elements are separated with a comma.
    * @return The string conversions of all array elements joined into one string.
    **/
  def join(): _ChainSingle[T] = js.native
  def join(separator: js.Any): _ChainSingle[T] = js.native
  /********* *
    * Objects *
    ********** */
  /**
    * Wrapped type `object`.
    * @see _.keys
    **/
  def keys(): _Chain[String, String] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.last
    **/
  def last(): _ChainSingle[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.last
    **/
  def last(n: Double): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.lastIndexOf
    **/
  def lastIndexOf(value: T): _ChainSingle[Double] = js.native
  def lastIndexOf(value: T, from: Double): _ChainSingle[Double] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.map
    **/
  def map[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult])): _Chain[TResult, js.Array[TResult]] = js.native
  def map[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult]), context: js.Any): _Chain[TResult, js.Array[TResult]] = js.native
  /**
    * Wrapped type `object`.
    * @see _.mapObject
    **/
  def mapObject(fn: ListIterator[T, _]): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.map
    **/
  @JSName("map")
  def map_TArray__ChainOfArrays[TArray](iterator: (ListIterator[T, js.Array[TArray]]) | (ObjectIterator[T, js.Array[TArray]])): _ChainOfArrays[TArray] = js.native
  @JSName("map")
  def map_TArray__ChainOfArrays[TArray](
    iterator: (ListIterator[T, js.Array[TArray]]) | (ObjectIterator[T, js.Array[TArray]]),
    context: js.Any
  ): _ChainOfArrays[TArray] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.matcher
    **/
  def matcher(): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.matches
    **/
  def matches(): _Chain[T, T] = js.native
  /**
    * Wrapped type `number[]`.
    * @see _.max
    **/
  def max(): _ChainSingle[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.max
    **/
  def max(iterator: ListIterator[T, _ | Double]): _ChainSingle[T] = js.native
  def max(iterator: ListIterator[T, _ | Double], context: js.Any): _ChainSingle[T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.memoize
    **/
  def memoize(): _Chain[T, T] = js.native
  def memoize(hashFn: js.Function1[/* n */ js.Any, String]): _Chain[T, T] = js.native
  /**
    * @see _.functions
    **/
  def methods(): _Chain[T, T] = js.native
  /**
    * Wrapped type `number[]`.
    * @see _.min
    **/
  def min(): _ChainSingle[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.min
    **/
  def min(iterator: ListIterator[T, _ | Double]): _ChainSingle[T] = js.native
  def min(iterator: ListIterator[T, _ | Double], context: js.Any): _ChainSingle[T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.mixin
    **/
  def mixin(): _Chain[T, T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.negate
    **/
  def negate(): _Chain[T, T] = js.native
  /**
    * Wrapped type `any`.
    * @see _.noop
    **/
  def noop(): _Chain[T, T] = js.native
  /**
    * @see _.object
    **/
  def `object`(): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[][]`.
    * @see _.object
    **/
  def `object`(keyValuePairs: js.Array[_]*): _Chain[T, T] = js.native
  def `object`(values: js.Any): _Chain[T, T] = js.native
  def omit(iteratee: js.Function): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.omit
    **/
  def omit(keys: String*): _Chain[T, T] = js.native
  def omit(keys: js.Array[String]): _Chain[T, T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.once
    **/
  def once(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.pairs
    **/
  def pairs(): _Chain[js.Tuple2[String, _], js.Tuple2[String, _]] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.partial
    **/
  def partial(args: js.Any*): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.partition
    **/
  def partition(iterator: ListIterator[T, Boolean]): _Chain[js.Array[T], js.Array[T]] = js.native
  def partition(iterator: ListIterator[T, Boolean], context: js.Any): _Chain[js.Array[T], js.Array[T]] = js.native
  /**
    * Wrapped type `object`.
    * @see _.pick
    **/
  def pick[K /* <: String */](keys: K*): _Chain[TypeOfDictionary[Pick[V, K]], Pick[V, K]] = js.native
  def pick[K /* <: String */](keys: js.Array[K]): _Chain[TypeOfDictionary[Pick[V, K]], Pick[V, K]] = js.native
  def pick[K /* <: String */](
    predicate: ObjectIterator[
      /* import warning: ImportType.apply Failed type conversion: V[K] */ js.Any, 
      Boolean
    ]
  ): _Chain[TypeOfDictionary[Pick[V, K]], Pick[V, K]] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.pluck
    **/
  def pluck(propertyName: String): _Chain[_, _] = js.native
  /**
    * Removes the last element from an array and returns that element.
    * @return Returns the popped element.
    **/
  def pop(): _ChainSingle[T] = js.native
  /**
    * Wrapped type `string`.
    * @see _.property
    **/
  def property(): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.propertyOf
    **/
  def propertyOf(): _Chain[T, T] = js.native
  /**
    * Adds one or more elements to the end of an array and returns the new length of the array.
    * @param item The elements to add to the end of the array.
    * @return The array with the element added to the end.
    **/
  def push(item: T*): _Chain[T, T] = js.native
  /**
    * Wrapped type `number`.
    * @see _.random
    **/
  def random(): _Chain[T, T] = js.native
  /**
    * Wrapped type `number`.
    * @see _.random
    **/
  def random(max: Double): _Chain[T, T] = js.native
  /**
    * Wrapped type `number`.
    * @see _.range
    **/
  def range(): _Chain[T, T] = js.native
  /**
    * Wrapped type `number`.
    * @see _.range
    **/
  def range(stop: Double): _Chain[T, T] = js.native
  def range(stop: Double, step: Double): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.reduce
    **/
  def reduce[TResult](iterator: MemoIterator[T, TResult]): _ChainSingle[TResult] = js.native
  def reduce[TResult](iterator: MemoIterator[T, TResult], memo: TResult): _ChainSingle[TResult] = js.native
  def reduce[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): _ChainSingle[TResult] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.reduceRight
    **/
  def reduceRight[TResult](iterator: MemoIterator[T, TResult]): _ChainSingle[TResult] = js.native
  def reduceRight[TResult](iterator: MemoIterator[T, TResult], memo: TResult): _ChainSingle[TResult] = js.native
  def reduceRight[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): _ChainSingle[TResult] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.reject
    **/
  def reject(iterator: ListIterator[T, Boolean]): _Chain[T, T] = js.native
  def reject(iterator: ListIterator[T, Boolean], context: js.Any): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.rest
    **/
  def rest(): _Chain[T, T] = js.native
  def rest(n: Double): _Chain[T, T] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.once
    **/
  def restArgs(): _Chain[T, T] = js.native
  def restArgs(startIndex: Double): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.result
    **/
  def result(property: String): _Chain[T, T] = js.native
  def result(property: String, defaultValue: js.Any): _Chain[T, T] = js.native
  /**
    * Reverses an array in place. The first array element becomes the last and the last becomes the first.
    * @return The reversed array.
    **/
  def reverse(): _Chain[T, T] = js.native
  /**
    * @see _.sample
    **/
  def sample[T](): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.sample
    **/
  def sample[T](n: Double): _Chain[T, T] = js.native
  /**
    * @see _.filter
    **/
  def select(iterator: ListIterator[T, Boolean]): _Chain[T, T] = js.native
  def select(iterator: ListIterator[T, Boolean], context: js.Any): _Chain[T, T] = js.native
  /**
    * Removes the first element from an array and returns that element. This method changes the length of the array.
    * @return The shifted element.
    **/
  def shift(): _ChainSingle[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.shuffle
    **/
  def shuffle(): _Chain[T, T] = js.native
  /**
    * Wrapped type `any`.
    * @see _.size
    **/
  def size(): _ChainSingle[Double] = js.native
  /**
    * Returns a shallow copy of a portion of an array into a new array object.
    * @param start Zero-based index at which to begin extraction.
    * @param end Optional. Zero-based index at which to end extraction. slice extracts up to but not including end.
    * @return A shallow copy of a portion of an array into a new array object.
    **/
  def slice(start: Double): _Chain[T, T] = js.native
  def slice(start: Double, end: Double): _Chain[T, T] = js.native
  /**
    * @see _.any
    **/
  def some(): _ChainSingle[Boolean] = js.native
  def some(iterator: ListIterator[T, Boolean]): _ChainSingle[Boolean] = js.native
  def some(iterator: ListIterator[T, Boolean], context: js.Any): _ChainSingle[Boolean] = js.native
  /**
    * Sorts the elements of an array in place and returns the array. The sort is not necessarily stable. The default sort order is according to string Unicode code points.
    * @param compareFn Optional. Specifies a function that defines the sort order. If omitted, the array is sorted according to each character's Unicode code point value, according to the string conversion of each element.
    * @return The sorted array.
    **/
  def sort(): _Chain[T, T] = js.native
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, Boolean]): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.sortBy
    **/
  def sortBy(): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.sortBy
    **/
  def sortBy(iterator: String): _Chain[T, T] = js.native
  def sortBy(iterator: String, context: js.Any): _Chain[T, T] = js.native
  def sortBy(iterator: ListIterator[T, _]): _Chain[T, T] = js.native
  def sortBy(iterator: ListIterator[T, _], context: js.Any): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.sortedIndex
    **/
  def sortedIndex(value: T): _ChainSingle[Double] = js.native
  def sortedIndex(value: T, iterator: js.Function1[/* x */ T, _]): _ChainSingle[Double] = js.native
  def sortedIndex(value: T, iterator: js.Function1[/* x */ T, _], context: js.Any): _ChainSingle[Double] = js.native
  /**
    * Changes the content of an array by removing existing elements and/or adding new elements.
    * @param index Index at which to start changing the array. If greater than the length of the array, actual starting index will be set to the length of the array. If negative, will begin that many elements from the end.
    * @param quantity An integer indicating the number of old array elements to remove. If deleteCount is 0, no elements are removed. In this case, you should specify at least one new element. If deleteCount is greater than the number of elements left in the array starting at index, then all of the elements through the end of the array will be deleted.
    * @param items The element to add to the array. If you don't specify any elements, splice will only remove elements from the array.
    * @return An array containing the deleted elements. If only one element is removed, an array of one element is returned. If no elements are removed, an empty array is returned.
    **/
  def splice(index: Double, quantity: Double, items: T*): _Chain[T, T] = js.native
  /**
    * @see _.rest
    **/
  def tail(): _Chain[T, T] = js.native
  def tail(n: Double): _Chain[T, T] = js.native
  /**
    * @see _.first
    **/
  def take(): _Chain[T, T] = js.native
  /**
    * @see _.first
    **/
  def take(n: Double): _Chain[T, T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.tap
    **/
  def tap(interceptor: js.Function1[/* repeated */ js.Any, _]): _Chain[T, T] = js.native
  /**
    * Wrapped type `string`.
    * @see _.template
    **/
  def template(): js.Function1[/* repeated */ js.Any, _Chain[T, T]] = js.native
  def template(settings: TemplateSettings): js.Function1[/* repeated */ js.Any, _Chain[T, T]] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.throttle
    **/
  def throttle(wait: Double): _Chain[T, T] = js.native
  def throttle(wait: Double, options: ThrottleSettings): _Chain[T, T] = js.native
  /**
    * Wrapped type `number`.
    * @see _.times
    **/
  def times[TResult](iterator: js.Function1[/* n */ Double, TResult]): _Chain[T, T] = js.native
  def times[TResult](iterator: js.Function1[/* n */ Double, TResult], context: js.Any): _Chain[T, T] = js.native
  /**
    * Wrapped type `any`.
    * @see _.toArray
    **/
  def toArray(): _Chain[T, T] = js.native
  /**
    * Wrapped type `string`.
    * @see _.unescape
    **/
  def unescape(): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[][]`.
    * @see _.union
    **/
  def union(arrays: List[T]*): _Chain[T, js.Array[T]] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.uniq
    **/
  def uniq(): _Chain[T, T] = js.native
  def uniq(isSorted: Boolean): _Chain[T, T] = js.native
  def uniq(isSorted: Boolean, iterator: IterateePropertyShorthand): _Chain[T, T] = js.native
  def uniq(isSorted: Boolean, iterator: ListIterator[T, _]): _Chain[T, T] = js.native
  def uniq[TSort](iterator: IterateePropertyShorthand): _Chain[T, T] = js.native
  def uniq[TSort](iterator: IterateePropertyShorthand, context: js.Any): _Chain[T, T] = js.native
  def uniq[TSort](iterator: ListIterator[T, TSort]): _Chain[T, T] = js.native
  def uniq[TSort](iterator: ListIterator[T, TSort], context: js.Any): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.uniq
    **/
  @JSName("uniq")
  def uniq_TSort[TSort](): _Chain[T, T] = js.native
  /**
    * @see _.uniq
    **/
  def unique[TSort](): _Chain[T, T] = js.native
  def unique[TSort](isSorted: Boolean): _Chain[T, T] = js.native
  def unique[TSort](isSorted: Boolean, iterator: IterateePropertyShorthand): _Chain[T, T] = js.native
  def unique[TSort](isSorted: Boolean, iterator: ListIterator[T, TSort]): _Chain[T, T] = js.native
  def unique[TSort](iterator: IterateePropertyShorthand): _Chain[T, T] = js.native
  def unique[TSort](iterator: IterateePropertyShorthand, context: js.Any): _Chain[T, T] = js.native
  def unique[TSort](iterator: ListIterator[T, TSort]): _Chain[T, T] = js.native
  def unique[TSort](iterator: ListIterator[T, TSort], context: js.Any): _Chain[T, T] = js.native
  /**
    * Wrapped type `string`.
    * @see _.uniqueId
    **/
  def uniqueId(): _Chain[T, T] = js.native
  /**
    * Adds one or more elements to the beginning of an array and returns the new length of the array.
    * @param items The elements to add to the front of the array.
    * @return The array with the element added to the beginning.
    **/
  def unshift(items: T*): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[][]`.
    * @see _.unzip
    **/
  def unzip(arrays: js.Array[_]*): _Chain[T, T] = js.native
  /**
    * Wrapped type `any`.
    * @see _.value
    **/
  def value(): V = js.native
  /**
    * Wrapped type `object`.
    * @see _.values
    **/
  def values(): _Chain[_, _] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.where
    **/
  def where[U /* <: js.Object */](properties: U): _Chain[T, T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.without
    **/
  def without(values: T*): _Chain[T, js.Array[T]] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.wrap
    **/
  def wrap(wrapper: js.Function): js.Function0[_Chain[T, T]] = js.native
  /**
    * Wrapped type `any[][]`.
    * @see _.zip
    **/
  def zip(arrays: js.Array[_]*): _Chain[T, T] = js.native
}

