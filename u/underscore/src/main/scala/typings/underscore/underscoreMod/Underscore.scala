package typings.underscore.underscoreMod

import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Underscore[T, V] extends js.Object {
  /**
    * Wrapped type `number`.
    * @see _.after
    **/
  def after(fn: js.Function): js.Function = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.all
    **/
  def all(): Boolean = js.native
  def all(iterator: ListIterator[T, Boolean]): Boolean = js.native
  def all(iterator: ListIterator[T, Boolean], context: js.Any): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.allKeys
    **/
  def allKeys(): js.Array[String] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.any
    **/
  def any(): Boolean = js.native
  def any(iterator: ListIterator[T, Boolean]): Boolean = js.native
  def any(iterator: ListIterator[T, Boolean], context: js.Any): Boolean = js.native
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
  def bindAll(methodNames: String*): js.Any = js.native
  /********** *
    * Chaining *
    *********** */
  /**
    * Wrapped type `any`.
    * @see _.chain
    **/
  def chain(): _Chain[T, V] = js.native
  /**
    * Wrapped type any[][].
    * @see _.chunk
    **/
  def chunk(): js.Array[js.Array[_]] = js.native
  /**
    * @see _.map
    **/
  def collect[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult])): js.Array[TResult] = js.native
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
  def contains(value: T): Boolean = js.native
  def contains(value: T, fromIndex: Double): Boolean = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.countBy
    **/
  def countBy(): Dictionary[Double] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.countBy
    **/
  def countBy(iterator: String): Dictionary[Double] = js.native
  def countBy(iterator: String, context: js.Any): Dictionary[Double] = js.native
  def countBy(iterator: ListIterator[T, _]): Dictionary[Double] = js.native
  def countBy(iterator: ListIterator[T, _], context: js.Any): Dictionary[Double] = js.native
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
    * @see _.find
    **/
  def detect[T](): js.UndefOr[T] = js.native
  def detect[T](interator: String): js.UndefOr[T] = js.native
  /**
    * @see _.find
    **/
  def detect[T](iterator: (ListIterator[T, Boolean]) | (ObjectIterator[T, Boolean])): js.UndefOr[T] = js.native
  def detect[T](iterator: (ListIterator[T, Boolean]) | (ObjectIterator[T, Boolean]), context: js.Any): js.UndefOr[T] = js.native
  def detect[T, U /* <: js.Object */](interator: U): js.UndefOr[T] = js.native
  /**
    * @see _.find
    **/
  @JSName("detect")
  def detect_TU_Object[T, U /* <: js.Object */](): js.UndefOr[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.difference
    **/
  def difference(others: List[T]*): js.Array[T] = js.native
  /**
    * @see _.rest
    **/
  def drop(): js.Array[T] = js.native
  def drop(n: Double): js.Array[T] = js.native
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
  def each(iterator: (ListIterator[T, Unit]) | (ObjectIterator[T, Unit])): List[T] = js.native
  def each(iterator: (ListIterator[T, Unit]) | (ObjectIterator[T, Unit]), context: js.Any): List[T] = js.native
  /**
    * Wrapped type `string`.
    * @see _.escape
    **/
  def escape(): String = js.native
  /**
    * @see _.all
    **/
  def every(): Boolean = js.native
  def every(iterator: ListIterator[T, Boolean]): Boolean = js.native
  def every(iterator: ListIterator[T, Boolean], context: js.Any): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.extend
    **/
  def extend(sources: js.Any*): js.Any = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.filter
    **/
  def filter(iterator: ListIterator[T, Boolean]): js.Array[T] = js.native
  def filter(iterator: ListIterator[T, Boolean], context: js.Any): js.Array[T] = js.native
  /**
    * @see _.find
    **/
  def find[T](interator: String): js.UndefOr[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.find
    **/
  def find[T](iterator: (ListIterator[T, Boolean]) | (ObjectIterator[T, Boolean])): js.UndefOr[T] = js.native
  def find[T](iterator: (ListIterator[T, Boolean]) | (ObjectIterator[T, Boolean]), context: js.Any): js.UndefOr[T] = js.native
  /**
    * @see _.find
    **/
  def find[T, U /* <: js.Object */](interator: U): js.UndefOr[T] = js.native
  def findIndex[T](array: List[T], predicate: js.Object): Double = js.native
  def findIndex[T](array: List[T], predicate: js.Object, context: js.Any): Double = js.native
  /**
    * @see _.findIndex
    **/
  def findIndex[T](array: List[T], predicate: ListIterator[T, Boolean]): Double = js.native
  def findIndex[T](array: List[T], predicate: ListIterator[T, Boolean], context: js.Any): Double = js.native
  /**
    * Wrapped type `object`.
    * @see _.extend
    **/
  def findKey(predicate: ObjectIterator[_, Boolean]): js.Any = js.native
  def findKey(predicate: ObjectIterator[_, Boolean], context: js.Any): js.Any = js.native
  def findLastIndex[T](array: List[T], predicate: js.Object): Double = js.native
  def findLastIndex[T](array: List[T], predicate: js.Object, context: js.Any): Double = js.native
  /**
    * @see _.findLastIndex
    **/
  def findLastIndex[T](array: List[T], predicate: ListIterator[T, Boolean]): Double = js.native
  def findLastIndex[T](array: List[T], predicate: ListIterator[T, Boolean], context: js.Any): Double = js.native
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
  def first(n: Double): js.Array[T] = js.native
  /**
    * Wrapped type `any`.
    * @see _.flatten
    **/
  def flatten(): js.Array[_] = js.native
  def flatten(shallow: Boolean): js.Array[_] = js.native
  /**
    * @see _.reduce
    **/
  def foldl[TResult](iterator: MemoIterator[T, TResult]): TResult = js.native
  def foldl[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def foldl[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
    * @see _.reduceRight
    **/
  def foldr[TResult](iterator: MemoIterator[T, TResult]): TResult = js.native
  def foldr[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def foldr[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
    * @see _.each
    **/
  def forEach(iterator: (ListIterator[T, Unit]) | (ObjectIterator[T, Unit])): List[T] = js.native
  def forEach(iterator: (ListIterator[T, Unit]) | (ObjectIterator[T, Unit]), context: js.Any): List[T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.functions
    **/
  def functions(): js.Array[String] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.groupBy
    **/
  def groupBy(): Dictionary[List[T]] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.groupBy
    **/
  def groupBy(iterator: String): Dictionary[js.Array[T]] = js.native
  def groupBy(iterator: String, context: js.Any): Dictionary[js.Array[T]] = js.native
  def groupBy(iterator: ListIterator[T, _]): Dictionary[List[T]] = js.native
  def groupBy(iterator: ListIterator[T, _], context: js.Any): Dictionary[List[T]] = js.native
  /**
    * Wrapped type `object`.
    * @see _.has
    **/
  def has(key: String): Boolean = js.native
  /**
    * @see _.first
    **/
  def head(): js.UndefOr[T] = js.native
  /**
    * @see _.first
    **/
  def head(n: Double): js.Array[T] = js.native
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
  def include(value: T): Boolean = js.native
  def include(value: T, fromIndex: Double): Boolean = js.native
  /**
    * Alias for 'contains'.
    * @see contains
    **/
  def includes(value: T): Boolean = js.native
  def includes(value: T, fromIndex: Double): Boolean = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.indexBy
    **/
  def indexBy(iterator: String): Dictionary[T] = js.native
  def indexBy(iterator: String, context: js.Any): Dictionary[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.indexBy
    **/
  def indexBy(iterator: ListIterator[T, _]): Dictionary[T] = js.native
  def indexBy(iterator: ListIterator[T, _], context: js.Any): Dictionary[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.indexOf
    **/
  def indexOf(value: T): Double = js.native
  def indexOf(value: T, isSorted: Boolean): Double = js.native
  /**
    * @see _.indexOf
    **/
  def indexOf(value: T, startFrom: Double): Double = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.initial
    **/
  def initial(): js.Array[T] = js.native
  def initial(n: Double): js.Array[T] = js.native
  /**
    * @see _.reduce
    **/
  def inject[TResult](iterator: MemoIterator[T, TResult]): TResult = js.native
  def inject[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
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
  def invoke(methodName: String, args: js.Any*): js.Any = js.native
  /**
    * Wrapped type `object`.
    * @see _.isArguments
    **/
  def isArguments(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isArray
    **/
  def isArray(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isBoolean
    **/
  def isBoolean(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isDate
    **/
  def isDate(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isElement
    **/
  def isElement(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isEmpty
    **/
  def isEmpty(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isEqual
    **/
  def isEqual(other: js.Any): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isError
    **/
  def isError(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isFinite
    **/
  def isFinite(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isFunction
    **/
  def isFunction(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isMatch
    **/
  def isMatch(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isNaN
    **/
  def isNaN(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isNull
    **/
  def isNull(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isNumber
    **/
  def isNumber(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isObject
    **/
  def isObject(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isRegExp
    **/
  def isRegExp(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isString
    **/
  def isString(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isSymbol
    **/
  def isSymbol(): Boolean = js.native
  /**
    * Wrapped type `object`.
    * @see _.isUndefined
    **/
  def isUndefined(): Boolean = js.native
  /**
    * Wrapped type `string|Function|Object`.
    * @see _.iteratee
    **/
  def iteratee(): js.Function = js.native
  def iteratee(context: js.Any): js.Function = js.native
  /********* *
    * Objects *
    ********** */
  /**
    * Wrapped type `object`.
    * @see _.keys
    **/
  def keys(): js.Array[String] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.last
    **/
  def last(): js.UndefOr[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.last
    **/
  def last(n: Double): js.Array[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.lastIndexOf
    **/
  def lastIndexOf(value: T): Double = js.native
  def lastIndexOf(value: T, from: Double): Double = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.map
    **/
  def map[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult])): js.Array[TResult] = js.native
  def map[TResult](iterator: (ListIterator[T, TResult]) | (ObjectIterator[T, TResult]), context: js.Any): js.Array[TResult] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.matcher
    **/
  def matcher(): ListIterator[T, Boolean] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.matches
    **/
  def matches(): ListIterator[T, Boolean] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.max
    **/
  def max(): T = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.max
    **/
  def max(iterator: ListIterator[T, _ | Double]): T = js.native
  def max(iterator: ListIterator[T, _ | Double], context: js.Any): T = js.native
  /**
    * Wrapped type `number[]`.
    * @see _.max
    **/
  @JSName("max")
  def max_Double(): Double = js.native
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
    * Wrapped type `any[]`.
    * @see _.min
    **/
  def min(): T = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.min
    **/
  def min(iterator: ListIterator[T, _ | Double]): T = js.native
  def min(iterator: ListIterator[T, _ | Double], context: js.Any): T = js.native
  /**
    * Wrapped type `number[]`.
    * @see _.min
    **/
  @JSName("min")
  def min_Double(): Double = js.native
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
  /**
    * @see _.object
    **/
  def `object`(): js.Any = js.native
  /**
    * Wrapped type `any[][]`.
    * @see _.object
    **/
  def `object`(keyValuePairs: js.Array[_]*): js.Any = js.native
  def `object`(values: js.Any): js.Any = js.native
  def omit(fn: js.Function): js.Any = js.native
  /**
    * Wrapped type `object`.
    * @see _.omit
    **/
  def omit(keys: String*): js.Any = js.native
  def omit(keys: js.Array[String]): js.Any = js.native
  /**
    * Wrapped type `Function`.
    * @see _.once
    **/
  def once(): js.Function = js.native
  /**
    * Wrapped type `object`.
    * @see _.pairs
    **/
  def pairs(): js.Array[js.Tuple2[String, _]] = js.native
  /**
    * Wrapped type `Function`.
    * @see _.partial
    **/
  def partial(args: js.Any*): js.Function = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.partition
    **/
  def partition(iterator: ListIterator[T, Boolean]): js.Array[js.Array[T]] = js.native
  def partition(iterator: ListIterator[T, Boolean], context: js.Any): js.Array[js.Array[T]] = js.native
  /**
    * Wrapped type `object`.
    * @see _.pick
    **/
  def pick[K /* <: String */](keys: K*): Pick[V, K] = js.native
  def pick[K /* <: String */](keys: js.Array[K]): Pick[V, K] = js.native
  def pick[K /* <: String */](
    predicate: ObjectIterator[
      /* import warning: ImportType.apply Failed type conversion: V[K] */ js.Any, 
      Boolean
    ]
  ): Pick[V, K] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.pluck
    **/
  def pluck(propertyName: String): js.Array[_] = js.native
  /**
    * Wrapped type `string`.
    * @see _.property
    **/
  def property(): js.Function1[/* object */ js.Object, _] = js.native
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
    * Wrapped type `number`.
    * @see _.range
    **/
  def range(): js.Array[Double] = js.native
  /**
    * Wrapped type `number`.
    * @see _.range
    **/
  def range(stop: Double): js.Array[Double] = js.native
  def range(stop: Double, step: Double): js.Array[Double] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.reduce
    **/
  def reduce[TResult](iterator: MemoIterator[T, TResult]): TResult = js.native
  def reduce[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def reduce[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.reduceRight
    **/
  def reduceRight[TResult](iterator: MemoIterator[T, TResult]): TResult = js.native
  def reduceRight[TResult](iterator: MemoIterator[T, TResult], memo: TResult): TResult = js.native
  def reduceRight[TResult](iterator: MemoIterator[T, TResult], memo: TResult, context: js.Any): TResult = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.reject
    **/
  def reject(iterator: ListIterator[T, Boolean]): js.Array[T] = js.native
  def reject(iterator: ListIterator[T, Boolean], context: js.Any): js.Array[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.rest
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
  /**
    * @see _.sample
    **/
  def sample[T](): T = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.sample
    **/
  def sample[T](n: Double): js.Array[T] = js.native
  /**
    * @see _.filter
    **/
  def select(iterator: ListIterator[T, Boolean]): js.Array[T] = js.native
  def select(iterator: ListIterator[T, Boolean], context: js.Any): js.Array[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.shuffle
    **/
  def shuffle(): js.Array[T] = js.native
  /**
    * Wrapped type `any`.
    * @see _.size
    **/
  def size(): Double = js.native
  /**
    * @see _.any
    **/
  def some(): Boolean = js.native
  def some(iterator: ListIterator[T, Boolean]): Boolean = js.native
  def some(iterator: ListIterator[T, Boolean], context: js.Any): Boolean = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.sortBy
    **/
  def sortBy(): js.Array[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.sortBy
    **/
  def sortBy(iterator: String): js.Array[T] = js.native
  def sortBy(iterator: String, context: js.Any): js.Array[T] = js.native
  def sortBy(iterator: ListIterator[T, _]): js.Array[T] = js.native
  def sortBy(iterator: ListIterator[T, _], context: js.Any): js.Array[T] = js.native
  /**
    * Wrapped type `any[]`.
    * @see _.sortedIndex
    **/
  def sortedIndex(value: T): Double = js.native
  def sortedIndex(value: T, iterator: js.Function1[/* x */ T, _]): Double = js.native
  def sortedIndex(value: T, iterator: js.Function1[/* x */ T, _], context: js.Any): Double = js.native
  /**
    * @see _.rest
    **/
  def tail(): js.Array[T] = js.native
  def tail(n: Double): js.Array[T] = js.native
  /**
    * @see _.first
    **/
  def take(): T = js.native
  /**
    * @see _.first
    **/
  def take(n: Double): js.Array[T] = js.native
  /**
    * Wrapped type `object`.
    * @see _.tap
    **/
  def tap(interceptor: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  /**
    * Wrapped type `string`.
    * @see _.template
    **/
  def template(): js.Function1[/* repeated */ js.Any, String] = js.native
  def template(settings: TemplateSettings): js.Function1[/* repeated */ js.Any, String] = js.native
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
    * Wrapped type `any`.
    * @see _.toArray
    **/
  def toArray(): js.Array[T] = js.native
  /**
    * Wrapped type `string`.
    * @see _.unescape
    **/
  def unescape(): String = js.native
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
  def uniq(isSorted: Boolean): js.Array[T] = js.native
  def uniq(isSorted: Boolean, iterator: IterateePropertyShorthand): js.Array[T] = js.native
  def uniq(isSorted: Boolean, iterator: ListIterator[T, _]): js.Array[T] = js.native
  def uniq[TSort](iterator: ListIterator[T, TSort]): js.Array[T] = js.native
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
  def unique[TSort](isSorted: Boolean): js.Array[T] = js.native
  def unique[TSort](isSorted: Boolean, iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def unique[TSort](iterator: ListIterator[T, TSort]): js.Array[T] = js.native
  def unique[TSort](iterator: ListIterator[T, TSort], context: js.Any): js.Array[T] = js.native
  /**
    * Wrapped type `string`.
    * @see _.uniqueId
    **/
  def uniqueId(): String = js.native
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

