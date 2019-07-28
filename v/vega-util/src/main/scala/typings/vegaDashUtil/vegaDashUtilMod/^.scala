package typings.vegaDashUtil.vegaDashUtilMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.std.Error
import typings.std.Partial
import typings.vegaDashUtil.vegaDashUtilNumbers.`0`
import typings.vegaDashUtil.vegaDashUtilNumbers.`1`
import typings.vegaDashUtil.vegaDashUtilNumbers.`false`
import typings.vegaDashUtil.vegaDashUtilNumbers.`true`
import typings.vegaDashUtil.vegaDashUtilStrings.center
import typings.vegaDashUtil.vegaDashUtilStrings.left
import typings.vegaDashUtil.vegaDashUtilStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-util", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Debug: Double = js.native
  val Info: Double = js.native
  val None: Double = js.native
  val Warn: Double = js.native
  def accessor[R](fn: Fn[R]): AccessorFn[R] = js.native
  def accessor[R](fn: Fn[R], fields: js.Array[String]): AccessorFn[R] = js.native
  def accessor[R](fn: Fn[R], fields: js.Array[String], name: String): AccessorFn[R] = js.native
  def accessorFields(fn: AccessorFn[_]): js.Array[String] = js.native
  def accessorName(fn: AccessorFn[_]): String = js.native
  def array[T](v: T): js.Array[T] = js.native
  def array[T](v: js.Array[T]): js.Array[T] = js.native
  def clampRange(range: js.Array[Double], min: Double, max: Double): js.Array[Double] = js.native
  def compare(fields: String): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: String, orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: String, orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: js.Array[AccessorFn[_] | String]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: js.Array[AccessorFn[_] | String], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: js.Array[AccessorFn[_] | String], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: AccessorFn[_]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: AccessorFn[_], orders: js.Array[Order]): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def compare(fields: AccessorFn[_], orders: Order): js.Function2[/* a */ js.Any, /* b */ js.Any, Double] = js.native
  def constant[V](v: V): js.Function0[V] = js.native
  def debounce[F /* <: js.Function */](delay: Double, func: F): F = js.native
  def error(msg: String): Error = js.native
  def extend[T](target: T, source: Partial[T]*): T = js.native
  def extent(array: js.Array[Double]): js.Array[Double] = js.native
  def extent(array: js.Array[Double], accessor: AccessorFn[_]): js.Array[Double] = js.native
  def extentIndex(array: js.Array[Double]): js.Array[Double] = js.native
  def extentIndex(array: js.Array[Double], accessor: AccessorFn[_]): js.Array[Double] = js.native
  def falsy(): `false` = js.native
  def fastmap(): FastMap = js.native
  def fastmap(`_`: js.Object): FastMap = js.native
  def field(field: String): AccessorFn[_] = js.native
  def field(field: String, name: String): AccessorFn[_] = js.native
  def flush[T /* <: js.Any */](range: js.Array[Double], value: Double, threshold: Double, left: T, right: T, center: T): T = js.native
  def id(`_`: js.Object): js.Symbol = js.native
  def identity[V](v: V): V = js.native
  def inherits[C /* <: js.Object */, P /* <: js.Object */](child: C, parent: P): C with P = js.native
  def inrange(value: Double, range: js.Array[Double], left: Boolean, right: Boolean): Boolean = js.native
  def isArray[T](a: js.Any): /* is std.Array<T> */ Boolean = js.native
  def isArray[T](a: js.Array[T]): /* is std.Array<T> */ Boolean = js.native
  def isBoolean(a: js.Any): /* is boolean */ Boolean = js.native
  def isDate(a: js.Any): /* is std.Date */ Boolean = js.native
  def isFunction(a: js.Any): /* is std.Function */ Boolean = js.native
  def isNumber(a: js.Any): /* is number */ Boolean = js.native
  def isObject(a: js.Any): /* is object */ Boolean = js.native
  def isRegExp(a: js.Any): /* is std.RegExp */ Boolean = js.native
  def isString(a: js.Any): /* is string */ Boolean = js.native
  def key(fields: js.Array[String]): js.Function1[/* _ */ js.Object, String] = js.native
  def key(fields: js.Array[String], flat: Boolean): js.Function1[/* _ */ js.Object, String] = js.native
  def lerp(array: js.Array[Double], fraction: Double): Double = js.native
  def log(args: js.Any*): Unit = js.native
  def logger(): LoggerInterface = js.native
  def logger(`_`: Double): LoggerInterface = js.native
  def logger(`_`: Double, method: String): LoggerInterface = js.native
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_]
  ): js.Array[_] = js.native
  def merge(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_],
    output: js.Array[_]
  ): Unit = js.native
  @JSName("merge")
  def merge_Unit(
    compare: js.Function2[/* a */ js.Any, /* b */ js.Any, Double],
    array1: js.Array[_],
    array2: js.Array[_]
  ): Unit = js.native
  def one(): `1` = js.native
  def pad(str: String, len: Double): String = js.native
  def pad(str: String, len: Double, char: String): String = js.native
  @JSName("pad")
  def pad_center(str: String, len: Double, char: String, align: center): String = js.native
  @JSName("pad")
  def pad_left(str: String, len: Double, char: String, align: left): String = js.native
  @JSName("pad")
  def pad_right(str: String, len: Double, char: String, align: right): String = js.native
  def panLinear(domain: js.Array[Double], delta: Double): js.Array[Double] = js.native
  def panLog(domain: js.Array[Double], delta: Double): js.Array[Double] = js.native
  def panPow(domain: js.Array[Double], delta: Double, exponent: Double): js.Array[Double] = js.native
  def panSymlog(domain: js.Array[Double], delta: Double, constant: Double): js.Array[Double] = js.native
  def peek(array: js.Array[_]): js.Any = js.native
  def quarter(date: Double): Double = js.native
  def quarter(date: Date): Double = js.native
  def repeat(str: String, count: Double): String = js.native
  def span(array: js.Array[Double]): Double = js.native
  def splitAccessPath(path: String): js.Array[String] = js.native
  def stringValue(a: js.Any): String = js.native
  def toBoolean(a: js.Any): Boolean = js.native
  def toDate(a: js.Any): Double = js.native
  def toDate(a: js.Any, parser: js.Function1[/* _ */ js.Any, Double]): Double = js.native
  def toNumber(a: js.Any): Double = js.native
  def toSet[T](array: js.Array[T]): StringDictionary[`true`] = js.native
  def toString(a: js.Any): String = js.native
  def truncate(a: String, length: Double): String = js.native
  @JSName("truncate")
  def truncate_center(a: String, length: Double, align: center): String = js.native
  @JSName("truncate")
  def truncate_center(a: String, length: Double, align: center, ellipsis: String): String = js.native
  @JSName("truncate")
  def truncate_left(a: String, length: Double, align: left): String = js.native
  @JSName("truncate")
  def truncate_left(a: String, length: Double, align: left, ellipsis: String): String = js.native
  @JSName("truncate")
  def truncate_right(a: String, length: Double, align: right): String = js.native
  @JSName("truncate")
  def truncate_right(a: String, length: Double, align: right, ellipsis: String): String = js.native
  def truthy(): `true` = js.native
  def utcquarter(date: Double): Double = js.native
  def utcquarter(date: Date): Double = js.native
  def visitArray(
    array: js.UndefOr[scala.Nothing],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
  ): Unit = js.native
  def visitArray(
    array: js.Array[_],
    filter: js.Function1[/* any */ js.Any, js.UndefOr[Boolean]],
    visitor: js.Function3[/* v */ js.Any, /* i */ Double, /* arr */ js.Array[_], Unit]
  ): Unit = js.native
  def zero(): `0` = js.native
  def zoomLinear(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = js.native
  def zoomLinear(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = js.native
  def zoomLog(domain: js.Array[Double], anchor: Double, scale: Double): js.Array[Double] = js.native
  def zoomLog(domain: js.Array[Double], anchor: Null, scale: Double): js.Array[Double] = js.native
  def zoomPow(domain: js.Array[Double], anchor: Double, scale: Double, exponent: Double): js.Array[Double] = js.native
  def zoomPow(domain: js.Array[Double], anchor: Null, scale: Double, exponent: Double): js.Array[Double] = js.native
  def zoomSymlog(domain: js.Array[Double], anchor: Double, scale: Double, constant: Double): js.Array[Double] = js.native
  def zoomSymlog(domain: js.Array[Double], anchor: Null, scale: Double, constant: Double): js.Array[Double] = js.native
}

