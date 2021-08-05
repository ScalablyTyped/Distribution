package typings.vegaUtil

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Error
import typings.std.Partial
import typings.std.PropertyKey
import typings.vegaUtil.vegaUtilBooleans.`false`
import typings.vegaUtil.vegaUtilBooleans.`true`
import typings.vegaUtil.vegaUtilNumbers.`0`
import typings.vegaUtil.vegaUtilNumbers.`1`
import typings.vegaUtil.vegaUtilStrings.center
import typings.vegaUtil.vegaUtilStrings.left
import typings.vegaUtil.vegaUtilStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vega-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  inline def accessor[R](fn: Fn[R]): AccessorFn[R] = ^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any]).asInstanceOf[AccessorFn[R]]
  inline def accessor[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[R]]
  inline def accessor[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[R]]
  inline def accessor[R](fn: Fn[R], fields: Unit, name: String): AccessorFn[R] = (^.asInstanceOf[js.Dynamic].applyDynamic("accessor")(fn.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[R]]
  
  inline def accessorFields(fn: AccessorFn[js.Any]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("accessorFields")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def accessorName(fn: AccessorFn[js.Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("accessorName")(fn.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def array[T](v: T): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  inline def array[T](v: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(v.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def ascending(a: js.Any, b: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ascending")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def clampRange(range: js.Array[Double], min: Double, max: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("clampRange")(range.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def compare(fields: String): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: String, orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: String, orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: js.Array[AccessorFn[js.Any] | String]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: js.Array[AccessorFn[js.Any] | String], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: js.Array[AccessorFn[js.Any] | String], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: AccessorFn[js.Any]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: AccessorFn[js.Any], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  inline def compare(fields: AccessorFn[js.Any], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(fields.asInstanceOf[js.Any], orders.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* a */ js.Any, /* b */ js.Any, Double]]
  
  inline def constant[V](v: V): js.Function0[V] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(v.asInstanceOf[js.Any]).asInstanceOf[js.Function0[V]]
  
  inline def debounce[F /* <: js.Function */](delay: Double, func: F): F = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(delay.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[F]
  
  inline def error(msg: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  inline def extend[T](target: T, source: Partial[T]*): T = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def extent(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("extent")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def extent(array: js.Array[Double], accessor: AccessorFn[js.Any]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extent")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def extentIndex(array: js.Array[Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("extentIndex")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def extentIndex(array: js.Array[Double], accessor: AccessorFn[js.Any]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("extentIndex")(array.asInstanceOf[js.Any], accessor.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def falsy(): `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("falsy")().asInstanceOf[`false`]
  
  inline def fastmap(): FastMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fastmap")().asInstanceOf[FastMap_]
  inline def fastmap(_underscore: js.Object): FastMap_ = ^.asInstanceOf[js.Dynamic].applyDynamic("fastmap")(_underscore.asInstanceOf[js.Any]).asInstanceOf[FastMap_]
  
  inline def field(field: String): AccessorFn[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("field")(field.asInstanceOf[js.Any]).asInstanceOf[AccessorFn[js.Any]]
  inline def field(field: String, name: String): AccessorFn[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("field")(field.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AccessorFn[js.Any]]
  
  inline def flush[T /* <: js.Any */](range: js.Array[Double], value: Double, threshold: Double, left: T, right: T, center: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("flush")(range.asInstanceOf[js.Any], value.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], center.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def hasOwnProperty_(`object`: js.Object, property: PropertyKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(`object`.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def id(_underscore: js.Object): js.Symbol = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(_underscore.asInstanceOf[js.Any]).asInstanceOf[js.Symbol]
  
  inline def identity[V](v: V): V = ^.asInstanceOf[js.Dynamic].applyDynamic("identity")(v.asInstanceOf[js.Any]).asInstanceOf[V]
  
  inline def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P): C & P = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[C & P]
  inline def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P, members: js.Object): C & P = (^.asInstanceOf[js.Dynamic].applyDynamic("inherits")(child.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], members.asInstanceOf[js.Any])).asInstanceOf[C & P]
  
  inline def inrange(value: Double, range: js.Array[Double], left: Boolean, right: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inrange")(value.asInstanceOf[js.Any], range.asInstanceOf[js.Any], left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isArray[T](a: js.Any): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  inline def isArray[T](a: js.Array[T]): /* is std.Array<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Array<T> */ Boolean]
  
  inline def isBoolean(a: js.Any): /* is boolean */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(a.asInstanceOf[js.Any]).asInstanceOf[/* is boolean */ Boolean]
  
  inline def isDate(a: js.Any): /* is std.Date */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Date */ Boolean]
  
  inline def isFunction(a: js.Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isIterable(a: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIterable")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNumber(a: js.Any): /* is number */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(a.asInstanceOf[js.Any]).asInstanceOf[/* is number */ Boolean]
  
  inline def isObject(a: js.Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(a.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isRegExp(a: js.Any): /* is std.RegExp */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(a.asInstanceOf[js.Any]).asInstanceOf[/* is std.RegExp */ Boolean]
  
  inline def isString(a: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(a.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def key(fields: js.Array[String]): js.Function1[/* _ */ js.Object, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(fields.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* _ */ js.Object, String]]
  inline def key(fields: js.Array[String], flat: Boolean): js.Function1[/* _ */ js.Object, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("key")(fields.asInstanceOf[js.Any], flat.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* _ */ js.Object, String]]
  
  inline def lerp(array: js.Array[Double], fraction: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(array.asInstanceOf[js.Any], fraction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def log(args: js.Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def logger(): LoggerInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")().asInstanceOf[LoggerInterface]
  inline def logger(_underscore: Double): LoggerInterface = ^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any]).asInstanceOf[LoggerInterface]
  inline def logger(_underscore: Double, method: String): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
  inline def logger(_underscore: Unit, method: String): LoggerInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("logger")(_underscore.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[LoggerInterface]
  
  inline def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[js.Any],
    array2: js.Array[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[js.Any],
    array2: js.Array[js.Any],
    output: js.Array[js.Any]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mergeConfig[C /* <: js.Object */](c: C*): C = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeConfig")(c.asInstanceOf[js.Any]).asInstanceOf[C]
  
  inline def merge_Array(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[js.Any],
    array2: js.Array[js.Any]
  ): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(compare.asInstanceOf[js.Any], array1.asInstanceOf[js.Any], array2.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def one(): `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("one")().asInstanceOf[`1`]
  
  inline def pad(str: String, len: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad(str: String, len: Double, char: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pad_center(str: String, len: Double, char: String, align: center): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad_center(str: String, len: Double, char: Unit, align: center): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pad_left(str: String, len: Double, char: String, align: left): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad_left(str: String, len: Double, char: Unit, align: left): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pad_right(str: String, len: Double, char: String, align: right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pad_right(str: String, len: Double, char: Unit, align: right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pad")(str.asInstanceOf[js.Any], len.asInstanceOf[js.Any], char.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def panLinear(domain: js.Array[Double], delta: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panLinear")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def panLog(domain: js.Array[Double], delta: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panLog")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def panPow(domain: js.Array[Double], delta: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panPow")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def panSymlog(domain: js.Array[Double], delta: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("panSymlog")(domain.asInstanceOf[js.Any], delta.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def peek(array: js.Array[js.Any]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("peek")(array.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def quarter(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def quarter(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def repeat(str: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(str.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def span(array: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("span")(array.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def splitAccessPath(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitAccessPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def stringValue(a: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringValue")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def toBoolean(a: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("toBoolean")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def toDate(a: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def toDate(a: js.Any, parser: js.Function1[/* _ */ js.Any, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toDate")(a.asInstanceOf[js.Any], parser.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def toNumber(a: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def toSet[T](array: js.Array[T]): StringDictionary[`true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("toSet")(array.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[`true`]]
  
  inline def toString_(a: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def truncate(a: String, length: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncate(a: String, length: Double, align: Unit, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def truncate_center(a: String, length: Double, align: center): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncate_center(a: String, length: Double, align: center, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def truncate_left(a: String, length: Double, align: left): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncate_left(a: String, length: Double, align: left, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def truncate_right(a: String, length: Double, align: right): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncate_right(a: String, length: Double, align: right, ellipsis: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(a.asInstanceOf[js.Any], length.asInstanceOf[js.Any], align.asInstanceOf[js.Any], ellipsis.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def truthy(): `true` = ^.asInstanceOf[js.Dynamic].applyDynamic("truthy")().asInstanceOf[`true`]
  
  inline def utcquarter(date: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utcquarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def utcquarter(date: Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("utcquarter")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def visitArray(
    array: js.Array[js.Any],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[js.Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitArray")(array.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def visitArray(
    array: Unit,
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[js.Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visitArray")(array.asInstanceOf[js.Any], filter.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeConfig[C /* <: js.Object */](c: C, key: String, value: js.Any, recurse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeConfig")(c.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recurse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def zero(): `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("zero")().asInstanceOf[`0`]
  
  inline def zoomLinear(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLinear")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def zoomLinear(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLinear")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def zoomLog(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def zoomLog(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomLog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def zoomPow(domain: js.Array[Double], anchor: Double, scale: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomPow")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def zoomPow(domain: js.Array[Double], anchor: Null, scale: Double, exponent: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomPow")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], exponent.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def zoomSymlog(domain: js.Array[Double], anchor: Double, scale: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomSymlog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def zoomSymlog(domain: js.Array[Double], anchor: Null, scale: Double, constant: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("zoomSymlog")(domain.asInstanceOf[js.Any], anchor.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], constant.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @js.native
  trait AccessorFn[R]
    extends StObject
       with Fn[R] {
    
    var fields: js.Array[String] = js.native
    
    var fname: js.UndefOr[String] = js.native
  }
  
  trait FastMap_ extends StObject {
    
    def clean(): Unit
    
    def delete(f: String): Unit
    
    var empty: Double
    
    def get(f: String): js.Any
    
    def has(f: String): Boolean
    
    def set(f: String, v: js.Any): Unit
    
    var size: Double
  }
  object FastMap_ {
    
    inline def apply(
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
    
    extension [Self <: FastMap_](x: Self) {
      
      inline def setClean(value: () => Unit): Self = StObject.set(x, "clean", js.Any.fromFunction0(value))
      
      inline def setDelete(value: String => Unit): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
      
      inline def setEmpty(value: Double): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      inline def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: String => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, js.Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fn[R] extends StObject {
    
    def apply(args: js.Any*): R = js.native
  }
  
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
    
    inline def ascending: typings.vegaUtil.vegaUtilStrings.ascending = "ascending".asInstanceOf[typings.vegaUtil.vegaUtilStrings.ascending]
    
    inline def descending: typings.vegaUtil.vegaUtilStrings.descending = "descending".asInstanceOf[typings.vegaUtil.vegaUtilStrings.descending]
  }
}
