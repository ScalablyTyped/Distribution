package typings
package underscoreLib.underscoreMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Underscore[T] extends js.Object {
  /**
          * Wrapped type `number`.
          * @see _.after
          **/
  def after(fn: js.Function): js.Function = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.all
          **/
  def all(): scala.Boolean = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.all
          **/
  def all(iterator: ListIterator[T, scala.Boolean]): scala.Boolean = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.all
          **/
  def all(iterator: ListIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.allKeys
          **/
  def allKeys(): js.Array[java.lang.String] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.any
          **/
  def any(): scala.Boolean = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.any
          **/
  def any(iterator: ListIterator[T, scala.Boolean]): scala.Boolean = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.any
          **/
  def any(iterator: ListIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  /**
          * Wrapped type `number`.
          * @see _.before
          **/
  def before(fn: js.Function): js.Function = js.native
  /* ***********
          * Functions *
          ************ */
  
  /**
          * Wrapped type `Function`.
          * @see _.bind
          **/
  def bind(`object`: js.Any, args: js.Any*): js.Function = js.native
  /**
          * Wrapped type `object`.
          * @see _.bindAll
          **/
  def bindAll(methodNames: java.lang.String*): js.Any = js.native
  /********** *
           * Chaining *
          *********** */
  
  /**
          * Wrapped type `any`.
          * @see _.chain
          **/
  def chain(): _Chain[T] = js.native
  /**
           * Wrapped type any[][].
           * @see _.chunk
           **/
  def chunk(): js.Array[js.Array[_]] = js.native
  /**
          * @see _.map
          **/
  def collect[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult])): js.Array[TResult] = js.native
  /**
          * @see _.map
          **/
  def collect[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult]), context: js.Any): js.Array[TResult] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.compact
          **/
  def compact(): js.Array[T] = js.native
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
          * Wrapped type `any[]`.
          * @see _.contains
          **/
  def contains(value: T): scala.Boolean = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.contains
          **/
  def contains(value: T, fromIndex: scala.Double): scala.Boolean = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.countBy
          **/
  def countBy(): Dictionary[scala.Double] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.countBy
          **/
  def countBy(iterator: java.lang.String): Dictionary[scala.Double] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.countBy
          **/
  def countBy(iterator: java.lang.String, context: js.Any): Dictionary[scala.Double] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.countBy
          **/
  def countBy(iterator: ListIterator[T, _]): Dictionary[scala.Double] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.countBy
          **/
  def countBy(iterator: ListIterator[T, _], context: js.Any): Dictionary[scala.Double] = js.native
  /**
          * Wrapped type `any`.
          * @see _.create
          **/
  def create(): js.Any = js.native
  /**
          * Wrapped type `any`.
          * @see _.create
          **/
  def create(props: js.Object): js.Any = js.native
  /**
          * Wrapped type `Function`.
          * @see _.debounce
          **/
  def debounce(wait: scala.Double): js.Function with Cancelable = js.native
  /**
          * Wrapped type `Function`.
          * @see _.debounce
          **/
  def debounce(wait: scala.Double, immediate: scala.Boolean): js.Function with Cancelable = js.native
  /**
          * Wrapped type `object`.
          * @see _.defaults
          **/
  def defaults(defaults: js.Any*): js.Any = js.native
  /**
          * Wrapped type `Function`.
          * @see _.defer
          **/
  def defer(args: js.Any*): scala.Unit = js.native
  /**
          * @see _.delay
          **/
  def delay(args: js.Any*): js.Any = js.native
  /**
          * Wrapped type `Function`.
          * @see _.delay
          **/
  def delay(wait: scala.Double, args: js.Any*): js.Any = js.native
  /**
          * @see _.find
          **/
  def detect[T](): js.UndefOr[T] = js.native
  /**
          * @see _.find
          **/
  def detect[T](interator: java.lang.String): js.UndefOr[T] = js.native
  /**
          * @see _.find
          **/
  def detect[T](iterator: (ListIterator[T, scala.Boolean]) | (ObjectIterator[T, scala.Boolean])): js.UndefOr[T] = js.native
  /**
          * @see _.find
          **/
  def detect[T](iterator: (ListIterator[T, scala.Boolean]) | (ObjectIterator[T, scala.Boolean]), context: js.Any): js.UndefOr[T] = js.native
  /**
          * @see _.find
          **/
  def detect[T, U /* <: js.Object */](interator: U): js.UndefOr[T] = js.native
  /**
          * @see _.find
          **/
  @JSName("detect")
  def detect_TUObject[T, U /* <: js.Object */](): js.UndefOr[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.difference
          **/
  def difference(others: List[T]*): js.Array[T] = js.native
  /**
          * @see _.rest
          **/
  def drop(): js.Array[T] = js.native
  /**
          * @see _.rest
          **/
  def drop(n: scala.Double): js.Array[T] = js.native
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
  def each(iterator: (ListIterator[T, scala.Unit]) | (ObjectIterator[T, scala.Unit])): List[T] = js.native
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
  def each(iterator: (ListIterator[T, scala.Unit]) | (ObjectIterator[T, scala.Unit]), context: js.Any): List[T] = js.native
  /**
          * Wrapped type `string`.
          * @see _.escape
          **/
  def escape(): java.lang.String = js.native
  /**
          * @see _.all
          **/
  def every(): scala.Boolean = js.native
  /**
          * @see _.all
          **/
  def every(iterator: ListIterator[T, scala.Boolean]): scala.Boolean = js.native
  /**
          * @see _.all
          **/
  def every(iterator: ListIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.extend
          **/
  def extend(sources: js.Any*): js.Any = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.filter
          **/
  def filter(iterator: ListIterator[T, scala.Boolean]): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.filter
          **/
  def filter(iterator: ListIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  /**
          * @see _.find
          **/
  def find[T](interator: java.lang.String): js.UndefOr[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.find
          **/
  def find[T](iterator: (ListIterator[T, scala.Boolean]) | (ObjectIterator[T, scala.Boolean])): js.UndefOr[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.find
          **/
  def find[T](iterator: (ListIterator[T, scala.Boolean]) | (ObjectIterator[T, scala.Boolean]), context: js.Any): js.UndefOr[T] = js.native
  /**
          * @see _.find
          **/
  def find[T, U /* <: js.Object */](interator: U): js.UndefOr[T] = js.native
  /**
          * @see _.findIndex
          **/
  def findIndex[T](array: List[T], predicate: js.Object): scala.Double = js.native
  /**
          * @see _.findIndex
          **/
  def findIndex[T](array: List[T], predicate: js.Object, context: js.Any): scala.Double = js.native
  /**
          * @see _.findIndex
          **/
  def findIndex[T](array: List[T], predicate: ListIterator[T, scala.Boolean]): scala.Double = js.native
  /**
          * @see _.findIndex
          **/
  def findIndex[T](array: List[T], predicate: ListIterator[T, scala.Boolean], context: js.Any): scala.Double = js.native
  /**
          * Wrapped type `object`.
          * @see _.extend
          **/
  def findKey(predicate: ObjectIterator[_, scala.Boolean]): js.Any = js.native
  /**
          * Wrapped type `object`.
          * @see _.extend
          **/
  def findKey(predicate: ObjectIterator[_, scala.Boolean], context: js.Any): js.Any = js.native
  /**
          * @see _.findLastIndex
          **/
  def findLastIndex[T](array: List[T], predicate: js.Object): scala.Double = js.native
  /**
          * @see _.findLastIndex
          **/
  def findLastIndex[T](array: List[T], predicate: js.Object, context: js.Any): scala.Double = js.native
  /**
          * @see _.findLastIndex
          **/
  def findLastIndex[T](array: List[T], predicate: ListIterator[T, scala.Boolean]): scala.Double = js.native
  /**
          * @see _.findLastIndex
          **/
  def findLastIndex[T](array: List[T], predicate: ListIterator[T, scala.Boolean], context: js.Any): scala.Double = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.findWhere
          **/
  def findWhere[U /* <: js.Object */](properties: U): js.UndefOr[T] = js.native
  /*********
          * Arrays *
          **********/
  
  /**
          * Wrapped type `any[]`.
          * @see _.first
          **/
  def first(): js.UndefOr[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.first
          **/
  def first(n: scala.Double): js.Array[T] = js.native
  /**
          * Wrapped type `any`.
          * @see _.flatten
          **/
  def flatten(): js.Array[_] = js.native
  /**
          * Wrapped type `any`.
          * @see _.flatten
          **/
  def flatten(shallow: scala.Boolean): js.Array[_] = js.native
  /**
          * @see _.reduce
          **/
  def foldl[TResult](iterator: MemoIterator[T, TResult]): TResult = js.native
  /**
          * @see _.reduce
          **/
  def foldl[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  /**
          * @see _.reduce
          **/
  def foldl[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
          * @see _.reduceRight
          **/
  def foldr[TResult](iterator: MemoIterator[T, TResult]): TResult = js.native
  /**
          * @see _.reduceRight
          **/
  def foldr[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  /**
          * @see _.reduceRight
          **/
  def foldr[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
          * @see _.each
          **/
  def forEach(iterator: (ListIterator[T, scala.Unit]) | (ObjectIterator[T, scala.Unit])): List[T] = js.native
  /**
          * @see _.each
          **/
  def forEach(iterator: (ListIterator[T, scala.Unit]) | (ObjectIterator[T, scala.Unit]), context: js.Any): List[T] = js.native
  /**
          * Wrapped type `object`.
          * @see _.functions
          **/
  def functions(): js.Array[java.lang.String] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.groupBy
          **/
  def groupBy(): Dictionary[List[T]] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.groupBy
          **/
  def groupBy(iterator: java.lang.String): Dictionary[js.Array[T]] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.groupBy
          **/
  def groupBy(iterator: java.lang.String, context: js.Any): Dictionary[js.Array[T]] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.groupBy
          **/
  def groupBy(iterator: ListIterator[T, _]): Dictionary[List[T]] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.groupBy
          **/
  def groupBy(iterator: ListIterator[T, _], context: js.Any): Dictionary[List[T]] = js.native
  /**
          * Wrapped type `object`.
          * @see _.has
          **/
  def has(key: java.lang.String): scala.Boolean = js.native
  /**
          * @see _.first
          **/
  def head(): js.UndefOr[T] = js.native
  /**
          * @see _.first
          **/
  def head(n: scala.Double): js.Array[T] = js.native
  /********* *
           * Utility *
          ********** */
  
  /**
          * Wrapped type `any`.
          * @see _.identity
          **/
  def identity(): js.Any = js.native
  /**
          * Alias for 'contains'.
          * @see contains
          **/
  def include(value: T): scala.Boolean = js.native
  /**
          * Alias for 'contains'.
          * @see contains
          **/
  def include(value: T, fromIndex: scala.Double): scala.Boolean = js.native
  /**
           * Alias for 'contains'.
           * @see contains
           **/
  def includes(value: T): scala.Boolean = js.native
  /**
           * Alias for 'contains'.
           * @see contains
           **/
  def includes(value: T, fromIndex: scala.Double): scala.Boolean = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.indexBy
          **/
  def indexBy(iterator: java.lang.String): Dictionary[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.indexBy
          **/
  def indexBy(iterator: java.lang.String, context: js.Any): Dictionary[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.indexBy
          **/
  def indexBy(iterator: ListIterator[T, _]): Dictionary[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.indexBy
          **/
  def indexBy(iterator: ListIterator[T, _], context: js.Any): Dictionary[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.indexOf
          **/
  def indexOf(value: T): scala.Double = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.indexOf
          **/
  def indexOf(value: T, isSorted: scala.Boolean): scala.Double = js.native
  /**
          * @see _.indexOf
          **/
  def indexOf(value: T, startFrom: scala.Double): scala.Double = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.initial
          **/
  def initial(): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.initial
          **/
  def initial(n: scala.Double): js.Array[T] = js.native
  /**
          * @see _.reduce
          **/
  def inject[TResult](iterator: MemoIterator[T, TResult]): TResult = js.native
  /**
          * @see _.reduce
          **/
  def inject[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  /**
          * @see _.reduce
          **/
  def inject[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
          * Wrapped type `any[][]`.
          * @see _.intersection
          **/
  def intersection(arrays: List[T]*): js.Array[T] = js.native
  /**
          * Wrapped type `object`.
          * @see _.invert
          **/
  def invert(): js.Any = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.invoke
          **/
  def invoke(methodName: java.lang.String, args: js.Any*): js.Any = js.native
  /**
          * Wrapped type `object`.
          * @see _.isArguments
          **/
  def isArguments(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isArray
          **/
  def isArray(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isBoolean
          **/
  def isBoolean(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isDate
          **/
  def isDate(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isElement
          **/
  def isElement(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isEmpty
          **/
  def isEmpty(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isEqual
          **/
  def isEqual(other: js.Any): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isError
          **/
  def isError(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isFinite
          **/
  def isFinite(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isFunction
          **/
  def isFunction(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isMatch
          **/
  def isMatch(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isNaN
          **/
  def isNaN(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isNull
          **/
  def isNull(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isNumber
          **/
  def isNumber(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isObject
          **/
  def isObject(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isRegExp
          **/
  def isRegExp(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isString
          **/
  def isString(): scala.Boolean = js.native
  /**
           * Wrapped type `object`.
           * @see _.isSymbol
           **/
  def isSymbol(): scala.Boolean = js.native
  /**
          * Wrapped type `object`.
          * @see _.isUndefined
          **/
  def isUndefined(): scala.Boolean = js.native
  /**
          * Wrapped type `string|Function|Object`.
          * @see _.iteratee
          **/
  def iteratee(): js.Function = js.native
  /**
          * Wrapped type `string|Function|Object`.
          * @see _.iteratee
          **/
  def iteratee(context: js.Any): js.Function = js.native
  /********* *
           * Objects *
          ********** */
  
  /**
          * Wrapped type `object`.
          * @see _.keys
          **/
  def keys(): js.Array[java.lang.String] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.last
          **/
  def last(): js.UndefOr[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.last
          **/
  def last(n: scala.Double): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.lastIndexOf
          **/
  def lastIndexOf(value: T): scala.Double = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.lastIndexOf
          **/
  def lastIndexOf(value: T, from: scala.Double): scala.Double = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.map
          **/
  def map[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult])): js.Array[TResult] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.map
          **/
  def map[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult]), context: js.Any): js.Array[TResult] = js.native
  /**
           * Wrapped type `any[]`.
           * @see _.matcher
           **/
  def matcher(): ListIterator[T, scala.Boolean] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.matches
          **/
  def matches(): ListIterator[T, scala.Boolean] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.max
          **/
  def max(): T = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.max
          **/
  def max(iterator: ListIterator[T, _ | scala.Double]): T = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.max
          **/
  def max(iterator: ListIterator[T, _ | scala.Double], context: js.Any): T = js.native
  /**
          * Wrapped type `number[]`.
          * @see _.max
          **/
  @JSName("max")
  def max_Double(): scala.Double = js.native
  /**
          * Wrapped type `Function`.
          * @see _.memoize
          **/
  def memoize(): js.Function = js.native
  /**
          * Wrapped type `Function`.
          * @see _.memoize
          **/
  def memoize(hashFn: js.Function1[/* n */ js.Any, java.lang.String]): js.Function = js.native
  /**
          * @see _.functions
          **/
  def methods(): js.Array[java.lang.String] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.min
          **/
  def min(): T = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.min
          **/
  def min(iterator: ListIterator[T, _ | scala.Double]): T = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.min
          **/
  def min(iterator: ListIterator[T, _ | scala.Double], context: js.Any): T = js.native
  /**
          * Wrapped type `number[]`.
          * @see _.min
          **/
  @JSName("min")
  def min_Double(): scala.Double = js.native
  /**
          * Wrapped type `object`.
          * @see _.mixin
          **/
  def mixin(): scala.Unit = js.native
  /**
          * Wrapped type `Function`.
          * @see _.negate
          **/
  def negate(): js.Function1[/* repeated */js.Any, scala.Boolean] = js.native
  /**
          * Wrapped type `any`.
          * @see _.noop
          **/
  def noop(): scala.Unit = js.native
  /**
          * @see _.object
          **/
  def `object`(): js.Any = js.native
  /**
          * Wrapped type `any[][]`.
          * @see _.object
          **/
  def `object`(keyValuePairs: js.Array[_]*): js.Any = js.native
  /**
          * @see _.object
          **/
  def `object`(values: js.Any): js.Any = js.native
  def omit(fn: js.Function): js.Any = js.native
  /**
          * Wrapped type `object`.
          * @see _.omit
          **/
  def omit(keys: java.lang.String*): js.Any = js.native
  def omit(keys: js.Array[java.lang.String]): js.Any = js.native
  /**
          * Wrapped type `Function`.
          * @see _.once
          **/
  def once(): js.Function = js.native
  /**
          * Wrapped type `object`.
          * @see _.pairs
          **/
  def pairs(): js.Array[js.Tuple2[java.lang.String, _]] = js.native
  /**
          * Wrapped type `Function`.
          * @see _.partial
          **/
  def partial(args: js.Any*): js.Function = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.partition
          **/
  def partition(iterator: ListIterator[T, scala.Boolean]): js.Array[js.Array[T]] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.partition
          **/
  def partition(iterator: ListIterator[T, scala.Boolean], context: js.Any): js.Array[js.Array[T]] = js.native
  def pick(fn: js.Function3[/* value */ js.Any, /* key */ js.Any, /* object */ js.Any, _]): js.Any = js.native
  /**
          * Wrapped type `object`.
          * @see _.pick
          **/
  def pick(keys: js.Any*): js.Any = js.native
  def pick(keys: js.Array[_]): js.Any = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.pluck
          **/
  def pluck(propertyName: java.lang.String): js.Array[_] = js.native
  /**
          * Wrapped type `string`.
          * @see _.property
          **/
  def property(): js.Function1[/* object */ js.Object, _] = js.native
  /**
          * Wrapped type `object`.
          * @see _.propertyOf
          **/
  def propertyOf(): js.Function1[/* key */ java.lang.String, _] = js.native
  /**
          * Wrapped type `number`.
          * @see _.random
          **/
  def random(): scala.Double = js.native
  /**
          * Wrapped type `number`.
          * @see _.random
          **/
  def random(max: scala.Double): scala.Double = js.native
  /**
          * Wrapped type `number`.
          * @see _.range
          **/
  def range(): js.Array[scala.Double] = js.native
  /**
          * Wrapped type `number`.
          * @see _.range
          **/
  def range(stop: scala.Double): js.Array[scala.Double] = js.native
  /**
          * Wrapped type `number`.
          * @see _.range
          **/
  def range(stop: scala.Double, step: scala.Double): js.Array[scala.Double] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.reduce
          **/
  def reduce[TResult](iterator: MemoIterator[T, TResult]): TResult = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.reduce
          **/
  def reduce[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.reduce
          **/
  def reduce[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.reduceRight
          **/
  def reduceRight[TResult](iterator: MemoIterator[T, TResult]): TResult = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.reduceRight
          **/
  def reduceRight[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.reduceRight
          **/
  def reduceRight[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.reject
          **/
  def reject(iterator: ListIterator[T, scala.Boolean]): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.reject
          **/
  def reject(iterator: ListIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.rest
          **/
  def rest(): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.rest
          **/
  def rest(n: scala.Double): js.Array[T] = js.native
  /**
          * Wrapped type `Function`.
          * @see _.once
          **/
  def restArgs(): js.Function = js.native
  /**
          * Wrapped type `Function`.
          * @see _.once
          **/
  def restArgs(starIndex: scala.Double): js.Function = js.native
  /**
          * Wrapped type `object`.
          * @see _.result
          **/
  def result(property: java.lang.String): js.Any = js.native
  /**
          * Wrapped type `object`.
          * @see _.result
          **/
  def result(property: java.lang.String, defaultValue: js.Any): js.Any = js.native
  /**
          * @see _.sample
          **/
  def sample[T](): T = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.sample
          **/
  def sample[T](n: scala.Double): js.Array[T] = js.native
  /**
          * @see _.filter
          **/
  def select(iterator: ListIterator[T, scala.Boolean]): js.Array[T] = js.native
  /**
          * @see _.filter
          **/
  def select(iterator: ListIterator[T, scala.Boolean], context: js.Any): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.shuffle
          **/
  def shuffle(): js.Array[T] = js.native
  /**
          * Wrapped type `any`.
          * @see _.size
          **/
  def size(): scala.Double = js.native
  /**
          * @see _.any
          **/
  def some(): scala.Boolean = js.native
  /**
          * @see _.any
          **/
  def some(iterator: ListIterator[T, scala.Boolean]): scala.Boolean = js.native
  /**
          * @see _.any
          **/
  def some(iterator: ListIterator[T, scala.Boolean], context: js.Any): scala.Boolean = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.sortBy
          **/
  def sortBy(): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.sortBy
          **/
  def sortBy(iterator: java.lang.String): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.sortBy
          **/
  def sortBy(iterator: java.lang.String, context: js.Any): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.sortBy
          **/
  def sortBy(iterator: ListIterator[T, _]): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.sortBy
          **/
  def sortBy(iterator: ListIterator[T, _], context: js.Any): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.sortedIndex
          **/
  def sortedIndex(value: T): scala.Double = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.sortedIndex
          **/
  def sortedIndex(value: T, iterator: js.Function1[/* x */ T, _]): scala.Double = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.sortedIndex
          **/
  def sortedIndex(value: T, iterator: js.Function1[/* x */ T, _], context: js.Any): scala.Double = js.native
  /**
          * @see _.rest
          **/
  def tail(): js.Array[T] = js.native
  /**
          * @see _.rest
          **/
  def tail(n: scala.Double): js.Array[T] = js.native
  /**
          * @see _.first
          **/
  def take(): T = js.native
  /**
          * @see _.first
          **/
  def take(n: scala.Double): js.Array[T] = js.native
  /**
          * Wrapped type `object`.
          * @see _.tap
          **/
  def tap(interceptor: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  /**
          * Wrapped type `string`.
          * @see _.template
          **/
  def template(): js.Function1[/* repeated */js.Any, java.lang.String] = js.native
  /**
          * Wrapped type `string`.
          * @see _.template
          **/
  def template(settings: TemplateSettings): js.Function1[/* repeated */js.Any, java.lang.String] = js.native
  /**
          * Wrapped type `Function`.
          * @see _.throttle
          **/
  def throttle(wait: scala.Double): js.Function with Cancelable = js.native
  /**
          * Wrapped type `Function`.
          * @see _.throttle
          **/
  def throttle(wait: scala.Double, options: ThrottleSettings): js.Function with Cancelable = js.native
  /**
          * Wrapped type `number`.
          * @see _.times
          **/
  def times[TResult](iterator: js.Function1[/* n */ scala.Double, TResult]): js.Array[TResult] = js.native
  /**
          * Wrapped type `number`.
          * @see _.times
          **/
  def times[TResult](iterator: js.Function1[/* n */ scala.Double, TResult], context: js.Any): js.Array[TResult] = js.native
  /**
          * Wrapped type `any`.
          * @see _.toArray
          **/
  def toArray(): js.Array[T] = js.native
  /**
          * Wrapped type `string`.
          * @see _.unescape
          **/
  def unescape(): java.lang.String = js.native
  /**
          * Wrapped type `any[][]`.
          * @see _.union
          **/
  def union(arrays: List[T]*): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.uniq
          **/
  def uniq(): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.uniq
          **/
  def uniq(isSorted: scala.Boolean): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.uniq
          **/
  def uniq(isSorted: scala.Boolean, iterator: IterateePropertyShorthand): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.uniq
          **/
  def uniq(isSorted: scala.Boolean, iterator: ListIterator[T, _]): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.uniq
          **/
  def uniq[TSort](iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.uniq
          **/
  def uniq[TSort](iterator: ListIterator[T, TSort], context: js.Any): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.uniq
          **/
  @JSName("uniq")
  def uniq_TSort[TSort](): js.Array[T] = js.native
  /**
          * @see _.uniq
          **/
  def unique[TSort](): js.Array[T] = js.native
  /**
          * @see _.uniq
          **/
  def unique[TSort](isSorted: scala.Boolean): js.Array[T] = js.native
  /**
          * @see _.uniq
          **/
  def unique[TSort](isSorted: scala.Boolean, iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  /**
          * @see _.uniq
          **/
  def unique[TSort](iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  /**
          * @see _.uniq
          **/
  def unique[TSort](iterator: ListIterator[T, TSort], context: js.Any): js.Array[T] = js.native
  /**
          * Wrapped type `string`.
          * @see _.uniqueId
          **/
  def uniqueId(): java.lang.String = js.native
  /**
          * Wrapped type `any[][]`.
          * @see _.unzip
          **/
  def unzip(arrays: js.Array[_]*): js.Array[js.Array[_]] = js.native
  /**
          * Wrapped type `any`.
          * Extracts the value of a wrapped object.
          * @return Value of the wrapped object.
          **/
  def value[TResult](): TResult = js.native
  /**
          * Wrapped type `object`.
          * @see _.values
          **/
  def values(): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.where
          **/
  def where[U /* <: js.Object */](properties: U): js.Array[T] = js.native
  /**
          * Wrapped type `any[]`.
          * @see _.without
          **/
  def without(values: T*): js.Array[T] = js.native
  /**
          * Wrapped type `Function`.
          * @see _.wrap
          **/
  def wrap(wrapper: js.Function): js.Function0[js.Function] = js.native
  /**
          * Wrapped type `any[][]`.
          * @see _.zip
          **/
  def zip(arrays: js.Array[_]*): js.Array[js.Array[_]] = js.native
}

