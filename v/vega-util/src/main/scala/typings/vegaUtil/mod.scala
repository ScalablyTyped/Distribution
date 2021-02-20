package typings.vegaUtil

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Error
import typings.std.Partial
import typings.std.PropertyKey
import typings.vegaUtil.anon.Fields
import typings.vegaUtil.vegaUtilBooleans.`false`
import typings.vegaUtil.vegaUtilBooleans.`true`
import typings.vegaUtil.vegaUtilNumbers.`0`
import typings.vegaUtil.vegaUtilNumbers.`1`
import typings.vegaUtil.vegaUtilStrings.center
import typings.vegaUtil.vegaUtilStrings.left
import typings.vegaUtil.vegaUtilStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-util", "Debug")
  @js.native
  val Debug: Double = js.native
  
  @JSImport("vega-util", "Error")
  @js.native
  val Error_ : Double = js.native
  
  @JSImport("vega-util", "Info")
  @js.native
  val Info: Double = js.native
  
  @JSImport("vega-util", "None")
  @js.native
  val None: Double = js.native
  
  @JSImport("vega-util", "Warn")
  @js.native
  val Warn: Double = js.native
  
  @JSImport("vega-util", "accessor")
  @js.native
  def accessor[R](fn: Fn[R]): AccessorFn[R] = js.native
  @JSImport("vega-util", "accessor")
  @js.native
  def accessor[R](fn: Fn[R], fields: js.UndefOr[scala.Nothing], name: String): AccessorFn[R] = js.native
  @JSImport("vega-util", "accessor")
  @js.native
  def accessor[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = js.native
  @JSImport("vega-util", "accessor")
  @js.native
  def accessor[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = js.native
  
  @JSImport("vega-util", "accessorFields")
  @js.native
  def accessorFields(fn: AccessorFn[_]): js.Array[String] = js.native
  
  @JSImport("vega-util", "accessorName")
  @js.native
  def accessorName(fn: AccessorFn[_]): String = js.native
  
  @JSImport("vega-util", "array")
  @js.native
  def array[T](v: T): js.Array[T] = js.native
  @JSImport("vega-util", "array")
  @js.native
  def array[T](v: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("vega-util", "ascending")
  @js.native
  def ascending(a: js.Any, b: js.Any): Double = js.native
  
  @JSImport("vega-util", "clampRange")
  @js.native
  def clampRange(range: js.Array[Double], min: Double, max: Double): js.Array[Double] = js.native
  
  @JSImport("vega-util", "compare")
  @js.native
  def compare(fields: String): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-util", "compare")
  @js.native
  def compare(fields: String, orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-util", "compare")
  @js.native
  def compare(fields: String, orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-util", "compare")
  @js.native
  def compare(fields: js.Array[AccessorFn[_] | String]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-util", "compare")
  @js.native
  def compare(fields: js.Array[AccessorFn[_] | String], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-util", "compare")
  @js.native
  def compare(fields: js.Array[AccessorFn[_] | String], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-util", "compare")
  @js.native
  def compare(fields: AccessorFn[_]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-util", "compare")
  @js.native
  def compare(fields: AccessorFn[_], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  @JSImport("vega-util", "compare")
  @js.native
  def compare(fields: AccessorFn[_], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  
  @JSImport("vega-util", "constant")
  @js.native
  def constant[V](v: V): js.Function0[V] = js.native
  
  @JSImport("vega-util", "debounce")
  @js.native
  def debounce[F /* <: js.Function */](delay: Double, func: F): F = js.native
  
  @JSImport("vega-util", "error")
  @js.native
  def error(msg: String): Error = js.native
  
  @JSImport("vega-util", "extend")
  @js.native
  def extend[T](target: T, source: Partial[T]*): T = js.native
  
  @JSImport("vega-util", "extent")
  @js.native
  def extent(array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("vega-util", "extent")
  @js.native
  def extent(array: js.Array[Double], accessor: AccessorFn[_]): js.Array[Double] = js.native
  
  @JSImport("vega-util", "extentIndex")
  @js.native
  def extentIndex(array: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("vega-util", "extentIndex")
  @js.native
  def extentIndex(array: js.Array[Double], accessor: AccessorFn[_]): js.Array[Double] = js.native
  
  @JSImport("vega-util", "falsy")
  @js.native
  def falsy(): `false` = js.native
  
  @JSImport("vega-util", "fastmap")
  @js.native
  def fastmap(): FastMap_ = js.native
  @JSImport("vega-util", "fastmap")
  @js.native
  def fastmap(_underscore: js.Object): FastMap_ = js.native
  
  @JSImport("vega-util", "field")
  @js.native
  def field(field: String): AccessorFn[_] = js.native
  @JSImport("vega-util", "field")
  @js.native
  def field(field: String, name: String): AccessorFn[_] = js.native
  
  @JSImport("vega-util", "flush")
  @js.native
  def flush[T /* <: js.Any */](range: js.Array[Double], value: Double, threshold: Double, left: T, right: T, center: T): T = js.native
  
  @JSImport("vega-util", "hasOwnProperty")
  @js.native
  def hasOwnProperty_(`object`: js.Object, property: PropertyKey): Boolean = js.native
  
  @JSImport("vega-util", "id")
  @js.native
  def id(_underscore: js.Object): js.Symbol = js.native
  
  @JSImport("vega-util", "identity")
  @js.native
  def identity[V](v: V): V = js.native
  
  @JSImport("vega-util", "inherits")
  @js.native
  def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P): C with P = js.native
  @JSImport("vega-util", "inherits")
  @js.native
  def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P, members: js.Object): C with P = js.native
  
  @JSImport("vega-util", "inrange")
  @js.native
  def inrange(value: Double, range: js.Array[Double], left: Boolean, right: Boolean): Boolean = js.native
  
  @JSImport("vega-util", "isArray")
  @js.native
  def isArray[T](a: js.Any): /* is std.Array<T> */ Boolean = js.native
  @JSImport("vega-util", "isArray")
  @js.native
  def isArray[T](a: js.Array[T]): /* is std.Array<T> */ Boolean = js.native
  
  @JSImport("vega-util", "isBoolean")
  @js.native
  def isBoolean(a: js.Any): /* is boolean */ Boolean = js.native
  
  @JSImport("vega-util", "isDate")
  @js.native
  def isDate(a: js.Any): /* is std.Date */ Boolean = js.native
  
  @JSImport("vega-util", "isFunction")
  @js.native
  def isFunction(a: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("vega-util", "isIterable")
  @js.native
  def isIterable(a: js.Any): Boolean = js.native
  
  @JSImport("vega-util", "isNumber")
  @js.native
  def isNumber(a: js.Any): /* is number */ Boolean = js.native
  
  @JSImport("vega-util", "isObject")
  @js.native
  def isObject(a: js.Any): /* is object */ Boolean = js.native
  
  @JSImport("vega-util", "isRegExp")
  @js.native
  def isRegExp(a: js.Any): /* is std.RegExp */ Boolean = js.native
  
  @JSImport("vega-util", "isString")
  @js.native
  def isString(a: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("vega-util", "key")
  @js.native
  def key(fields: js.Array[String]): js.Function1[/* _ */ js.Object, String] = js.native
  @JSImport("vega-util", "key")
  @js.native
  def key(fields: js.Array[String], flat: Boolean): js.Function1[/* _ */ js.Object, String] = js.native
  
  @JSImport("vega-util", "lerp")
  @js.native
  def lerp(array: js.Array[Double], fraction: Double): Double = js.native
  
  @JSImport("vega-util", "log")
  @js.native
  def log(args: js.Any*): Unit = js.native
  
  @JSImport("vega-util", "logger")
  @js.native
  def logger(): LoggerInterface = js.native
  @JSImport("vega-util", "logger")
  @js.native
  def logger(_underscore: js.UndefOr[scala.Nothing], method: String): LoggerInterface = js.native
  @JSImport("vega-util", "logger")
  @js.native
  def logger(_underscore: Double): LoggerInterface = js.native
  @JSImport("vega-util", "logger")
  @js.native
  def logger(_underscore: Double, method: String): LoggerInterface = js.native
  
  @JSImport("vega-util", "merge")
  @js.native
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_]
  ): Unit = js.native
  @JSImport("vega-util", "merge")
  @js.native
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_],
    output: js.Array[_]
  ): Unit = js.native
  
  @JSImport("vega-util", "mergeConfig")
  @js.native
  def mergeConfig[C /* <: js.Object */](c: C*): C = js.native
  
  @JSImport("vega-util", "merge")
  @js.native
  def merge_Array(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_]
  ): js.Array[_] = js.native
  
  @JSImport("vega-util", "one")
  @js.native
  def one(): `1` = js.native
  
  @JSImport("vega-util", "pad")
  @js.native
  def pad(str: String, len: Double): String = js.native
  @JSImport("vega-util", "pad")
  @js.native
  def pad(str: String, len: Double, char: String): String = js.native
  @JSImport("vega-util", "pad")
  @js.native
  def pad_center(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: center): String = js.native
  @JSImport("vega-util", "pad")
  @js.native
  def pad_center(str: String, len: Double, char: String, align: center): String = js.native
  @JSImport("vega-util", "pad")
  @js.native
  def pad_left(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: left): String = js.native
  @JSImport("vega-util", "pad")
  @js.native
  def pad_left(str: String, len: Double, char: String, align: left): String = js.native
  @JSImport("vega-util", "pad")
  @js.native
  def pad_right(str: String, len: Double, char: js.UndefOr[scala.Nothing], align: right): String = js.native
  @JSImport("vega-util", "pad")
  @js.native
  def pad_right(str: String, len: Double, char: String, align: right): String = js.native
  
  @JSImport("vega-util", "panLinear")
  @js.native
  def panLinear(domain: js.Array[Double], delta: Double): js.Array[Double] = js.native
  
  @JSImport("vega-util", "panLog")
  @js.native
  def panLog(domain: js.Array[Double], delta: Double): js.Array[Double] = js.native
  
  @JSImport("vega-util", "panPow")
  @js.native
  def panPow(domain: js.Array[Double], delta: Double, exponent: Double): js.Array[Double] = js.native
  
  @JSImport("vega-util", "panSymlog")
  @js.native
  def panSymlog(domain: js.Array[Double], delta: Double, constant: Double): js.Array[Double] = js.native
  
  @JSImport("vega-util", "peek")
  @js.native
  def peek(array: js.Array[_]): js.Any = js.native
  
  @JSImport("vega-util", "quarter")
  @js.native
  def quarter(date: Double): Double = js.native
  @JSImport("vega-util", "quarter")
  @js.native
  def quarter(date: Date): Double = js.native
  
  @JSImport("vega-util", "repeat")
  @js.native
  def repeat(str: String, count: Double): String = js.native
  
  @JSImport("vega-util", "span")
  @js.native
  def span(array: js.Array[Double]): Double = js.native
  
  @JSImport("vega-util", "splitAccessPath")
  @js.native
  def splitAccessPath(path: String): js.Array[String] = js.native
  
  @JSImport("vega-util", "stringValue")
  @js.native
  def stringValue(a: js.Any): String = js.native
  
  @JSImport("vega-util", "toBoolean")
  @js.native
  def toBoolean(a: js.Any): Boolean = js.native
  
  @JSImport("vega-util", "toDate")
  @js.native
  def toDate(a: js.Any): Double = js.native
  @JSImport("vega-util", "toDate")
  @js.native
  def toDate(a: js.Any, parser: js.Function1[/* _ */ js.Any, Double]): Double = js.native
  
  @JSImport("vega-util", "toNumber")
  @js.native
  def toNumber(a: js.Any): Double = js.native
  
  @JSImport("vega-util", "toSet")
  @js.native
  def toSet[T](array: js.Array[T]): StringDictionary[`true`] = js.native
  
  @JSImport("vega-util", "toString")
  @js.native
  def toString_(a: js.Any): String = js.native
  
  @JSImport("vega-util", "truncate")
  @js.native
  def truncate(a: String, length: Double): String = js.native
  @JSImport("vega-util", "truncate")
  @js.native
  def truncate(a: String, length: Double, align: js.UndefOr[scala.Nothing], ellipsis: String): String = js.native
  @JSImport("vega-util", "truncate")
  @js.native
  def truncate_center(a: String, length: Double, align: center): String = js.native
  @JSImport("vega-util", "truncate")
  @js.native
  def truncate_center(a: String, length: Double, align: center, ellipsis: String): String = js.native
  @JSImport("vega-util", "truncate")
  @js.native
  def truncate_left(a: String, length: Double, align: left): String = js.native
  @JSImport("vega-util", "truncate")
  @js.native
  def truncate_left(a: String, length: Double, align: left, ellipsis: String): String = js.native
  @JSImport("vega-util", "truncate")
  @js.native
  def truncate_right(a: String, length: Double, align: right): String = js.native
  @JSImport("vega-util", "truncate")
  @js.native
  def truncate_right(a: String, length: Double, align: right, ellipsis: String): String = js.native
  
  @JSImport("vega-util", "truthy")
  @js.native
  def truthy(): `true` = js.native
  
  @JSImport("vega-util", "utcquarter")
  @js.native
  def utcquarter(date: Double): Double = js.native
  @JSImport("vega-util", "utcquarter")
  @js.native
  def utcquarter(date: Date): Double = js.native
  
  @JSImport("vega-util", "visitArray")
  @js.native
  def visitArray(
    array: js.UndefOr[scala.Nothing],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
  ): Unit = js.native
  @JSImport("vega-util", "visitArray")
  @js.native
  def visitArray(
    array: js.Array[_],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
  ): Unit = js.native
  
  @JSImport("vega-util", "writeConfig")
  @js.native
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any): Unit = js.native
  @JSImport("vega-util", "writeConfig")
  @js.native
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: js.Object): Unit = js.native
  @JSImport("vega-util", "writeConfig")
  @js.native
  def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: Boolean): Unit = js.native
  
  @JSImport("vega-util", "zero")
  @js.native
  def zero(): `0` = js.native
  
  @JSImport("vega-util", "zoomLinear")
  @js.native
  def zoomLinear(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = js.native
  @JSImport("vega-util", "zoomLinear")
  @js.native
  def zoomLinear(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = js.native
  
  @JSImport("vega-util", "zoomLog")
  @js.native
  def zoomLog(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = js.native
  @JSImport("vega-util", "zoomLog")
  @js.native
  def zoomLog(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = js.native
  
  @JSImport("vega-util", "zoomPow")
  @js.native
  def zoomPow(domain: js.Array[Double], anchor: Double, scale: Double, exponent: Double): js.Array[Double] = js.native
  @JSImport("vega-util", "zoomPow")
  @js.native
  def zoomPow(domain: js.Array[Double], anchor: Null, scale: Double, exponent: Double): js.Array[Double] = js.native
  
  @JSImport("vega-util", "zoomSymlog")
  @js.native
  def zoomSymlog(domain: js.Array[Double], anchor: Double, scale: Double, constant: Double): js.Array[Double] = js.native
  @JSImport("vega-util", "zoomSymlog")
  @js.native
  def zoomSymlog(domain: js.Array[Double], anchor: Null, scale: Double, constant: Double): js.Array[Double] = js.native
  
  type AccessorFn[R] = Fn[R] with Fields
  
  @js.native
  trait FastMap_ extends StObject {
    
    def clean(): Unit = js.native
    
    def delete(f: String): Unit = js.native
    
    var empty: Double = js.native
    
    def get(f: String): js.Any = js.native
    
    def has(f: String): Boolean = js.native
    
    def set(f: String, v: js.Any): Unit = js.native
    
    var size: Double = js.native
  }
  object FastMap_ {
    
    @scala.inline
    def apply(
      clean: () => Unit,
      delete: String => Unit,
      empty: Double,
      get: String => js.Any,
      has: String => Boolean,
      set: (String, js.Any) => Unit,
      size: Double
    ): FastMap_ = {
      val __obj = js.Dynamic.literal(clean = js.Any.fromFunction0(clean), delete = js.Any.fromFunction1(delete), empty = empty.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), set = js.Any.fromFunction2(set), size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastMap_]
    }
    
    @scala.inline
    implicit class FastMap_MutableBuilder[Self <: FastMap_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClean(value: () => Unit): Self = StObject.set(x, "clean", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmpty(value: Double): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  type Fn[R] = js.Function1[/* repeated */ js.Any, R]
  
  @js.native
  trait LoggerInterface extends StObject {
    
    def debug(args: js.Any*): this.type = js.native
    
    def error(args: js.Any*): this.type = js.native
    
    def info(args: js.Any*): this.type = js.native
    
    def level(): Double = js.native
    def level(_underscore: Double): this.type = js.native
    
    def warn(args: js.Any*): this.type = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaUtil.vegaUtilStrings.ascending
    - typings.vegaUtil.vegaUtilStrings.descending
  */
  trait Order extends StObject
  object Order {
    
    @scala.inline
    def ascending: typings.vegaUtil.vegaUtilStrings.ascending = "ascending".asInstanceOf[typings.vegaUtil.vegaUtilStrings.ascending]
    
    @scala.inline
    def descending: typings.vegaUtil.vegaUtilStrings.descending = "descending".asInstanceOf[typings.vegaUtil.vegaUtilStrings.descending]
  }
}
