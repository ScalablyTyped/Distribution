package typings
package sugarLib.sugarjsNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends sugarLib.sugarjsNs.SugarNamespace
     with org.scalablytyped.runtime.Instantiable0[Chainable[js.Object]]
     with org.scalablytyped.runtime.Instantiable1[/* raw */ js.Object, Chainable[js.Object]] {
  def apply(): Chainable[js.Object] = js.native
  def apply(raw: js.Object): Chainable[js.Object] = js.native
  def add[T](instance: js.Object, obj: js.Object): js.Object = js.native
  def add[T](instance: js.Object, obj: js.Object, options: ObjectMergeOptions[T]): js.Object = js.native
  def addAll[T](instance: js.Object, sources: js.Array[js.Object]): js.Object = js.native
  def addAll[T](instance: js.Object, sources: js.Array[js.Object], options: ObjectMergeOptions[T]): js.Object = js.native
  def average[T, U](instance: js.Object): scala.Double = js.native
  def average[T, U](instance: js.Object, map: java.lang.String): scala.Double = js.native
  def average[T, U](instance: js.Object, map: mapFn[T, U]): scala.Double = js.native
  def clone(instance: js.Object): js.Object = js.native
  def clone(instance: js.Object, deep: scala.Boolean): js.Object = js.native
  def count[T](instance: js.Object, search: T): scala.Double = js.native
  def count[T](instance: js.Object, search: searchFn[T]): scala.Double = js.native
  def defaults[T](instance: js.Object, sources: js.Array[js.Object]): js.Object = js.native
  def defaults[T](instance: js.Object, sources: js.Array[js.Object], options: ObjectMergeOptions[T]): js.Object = js.native
  def every[T](instance: js.Object, search: T): scala.Boolean = js.native
  def every[T](instance: js.Object, search: searchFn[T]): scala.Boolean = js.native
  def exclude[T](instance: js.Object, search: T): js.Object = js.native
  def exclude[T](instance: js.Object, search: searchFn[T]): js.Object = js.native
  def filter[T](instance: js.Object, search: T): js.Array[T] = js.native
  def filter[T](instance: js.Object, search: searchFn[T]): js.Array[T] = js.native
  def find[T](instance: js.Object, search: T): scala.Boolean = js.native
  def find[T](instance: js.Object, search: searchFn[T]): scala.Boolean = js.native
  def forEach[T](
    instance: js.Object,
    eachFn: js.Function3[/* val */ T, /* key */ java.lang.String, /* obj */ js.Object, scala.Unit]
  ): js.Object = js.native
  def fromQueryString[T, U](str: java.lang.String): js.Object = js.native
  def fromQueryString[T, U](str: java.lang.String, options: QueryStringParseOptions[T, U]): js.Object = js.native
  def get[T](instance: js.Object, key: java.lang.String): T = js.native
  def get[T](instance: js.Object, key: java.lang.String, inherited: scala.Boolean): T = js.native
  def has(instance: js.Object, key: java.lang.String): scala.Boolean = js.native
  def has(instance: js.Object, key: java.lang.String, inherited: scala.Boolean): scala.Boolean = js.native
  def intersect(instance: js.Object, obj: js.Object): js.Object = js.native
  def invert(instance: js.Object): js.Object = js.native
  def invert(instance: js.Object, multi: scala.Boolean): js.Object = js.native
  def isArguments(instance: js.Object): scala.Boolean = js.native
  def isArray(instance: js.Any): /* is std.Array<any> */ scala.Boolean = js.native
  def isBoolean(instance: js.Any): /* is boolean */ scala.Boolean = js.native
  def isDate(instance: js.Any): /* is std.Date */ scala.Boolean = js.native
  def isEmpty(instance: js.Object): scala.Boolean = js.native
  def isEqual(instance: js.Object, obj: js.Object): scala.Boolean = js.native
  def isError(instance: js.Any): /* is std.Error */ scala.Boolean = js.native
  def isFunction(instance: js.Any): /* is std.Function */ scala.Boolean = js.native
  def isMap(instance: js.Any): /* is std.Map<any, any> */ scala.Boolean = js.native
  def isNumber(instance: js.Any): /* is number */ scala.Boolean = js.native
  def isObject(instance: js.Object): scala.Boolean = js.native
  def isRegExp(instance: js.Any): /* is std.RegExp */ scala.Boolean = js.native
  def isSet(instance: js.Any): /* is std.Set<any> */ scala.Boolean = js.native
  def isString(instance: js.Any): /* is string */ scala.Boolean = js.native
  def keys[T](instance: js.Object): js.Array[T] = js.native
  def least[T, U](instance: js.Object): T = js.native
  def least[T, U](instance: js.Object, all: scala.Boolean): T = js.native
  def least[T, U](instance: js.Object, all: scala.Boolean, map: java.lang.String): T = js.native
  def least[T, U](instance: js.Object, all: scala.Boolean, map: mapFn[T, U]): T = js.native
  def least[T, U](instance: js.Object, map: java.lang.String): T = js.native
  def least[T, U](instance: js.Object, map: mapFn[T, U]): T = js.native
  def map[T, U](instance: js.Object, map: java.lang.String): js.Object = js.native
  def map[T, U](instance: js.Object, map: mapFn[T, U]): js.Object = js.native
  def max[T, U](instance: js.Object): T = js.native
  def max[T, U](instance: js.Object, all: scala.Boolean): T = js.native
  def max[T, U](instance: js.Object, all: scala.Boolean, map: java.lang.String): T = js.native
  def max[T, U](instance: js.Object, all: scala.Boolean, map: mapFn[T, U]): T = js.native
  def max[T, U](instance: js.Object, map: java.lang.String): T = js.native
  def max[T, U](instance: js.Object, map: mapFn[T, U]): T = js.native
  def median[T, U](instance: js.Object): scala.Double = js.native
  def median[T, U](instance: js.Object, map: java.lang.String): scala.Double = js.native
  def median[T, U](instance: js.Object, map: mapFn[T, U]): scala.Double = js.native
  def merge[T](instance: js.Object, source: js.Object): js.Object = js.native
  def merge[T](instance: js.Object, source: js.Object, options: ObjectMergeOptions[T]): js.Object = js.native
  def mergeAll[T](instance: js.Object, sources: js.Array[js.Object]): js.Object = js.native
  def mergeAll[T](instance: js.Object, sources: js.Array[js.Object], options: ObjectMergeOptions[T]): js.Object = js.native
  def min[T, U](instance: js.Object): T = js.native
  def min[T, U](instance: js.Object, all: scala.Boolean): T = js.native
  def min[T, U](instance: js.Object, all: scala.Boolean, map: java.lang.String): T = js.native
  def min[T, U](instance: js.Object, all: scala.Boolean, map: mapFn[T, U]): T = js.native
  def min[T, U](instance: js.Object, map: java.lang.String): T = js.native
  def min[T, U](instance: js.Object, map: mapFn[T, U]): T = js.native
  def most[T, U](instance: js.Object): T = js.native
  def most[T, U](instance: js.Object, all: scala.Boolean): T = js.native
  def most[T, U](instance: js.Object, all: scala.Boolean, map: java.lang.String): T = js.native
  def most[T, U](instance: js.Object, all: scala.Boolean, map: mapFn[T, U]): T = js.native
  def most[T, U](instance: js.Object, map: java.lang.String): T = js.native
  def most[T, U](instance: js.Object, map: mapFn[T, U]): T = js.native
  def none[T](instance: js.Object, search: T): scala.Boolean = js.native
  def none[T](instance: js.Object, search: searchFn[T]): scala.Boolean = js.native
  def reduce[T](
    instance: js.Object,
    reduceFn: js.Function4[/* acc */ T, /* val */ T, /* key */ java.lang.String, /* obj */ js.Object, scala.Unit]
  ): T = js.native
  def reduce[T](
    instance: js.Object,
    reduceFn: js.Function4[/* acc */ T, /* val */ T, /* key */ java.lang.String, /* obj */ js.Object, scala.Unit],
    init: js.Any
  ): T = js.native
  def reject(instance: js.Object, find: java.lang.String): js.Object = js.native
  def reject(instance: js.Object, find: js.Array[java.lang.String]): js.Object = js.native
  def reject(instance: js.Object, find: js.Object): js.Object = js.native
  def reject(instance: js.Object, find: stdLib.RegExp): js.Object = js.native
  def remove[T](instance: js.Object, search: T): js.Object = js.native
  def remove[T](instance: js.Object, search: searchFn[T]): js.Object = js.native
  def select(instance: js.Object, find: java.lang.String): js.Object = js.native
  def select(instance: js.Object, find: js.Array[java.lang.String]): js.Object = js.native
  def select(instance: js.Object, find: js.Object): js.Object = js.native
  def select(instance: js.Object, find: stdLib.RegExp): js.Object = js.native
  def set[T](instance: js.Object, key: java.lang.String, `val`: T): js.Object = js.native
  def size(instance: js.Object): scala.Double = js.native
  def some[T](instance: js.Object, search: T): scala.Boolean = js.native
  def some[T](instance: js.Object, search: searchFn[T]): scala.Boolean = js.native
  def subtract(instance: js.Object, obj: js.Object): js.Object = js.native
  def sum[T, U](instance: js.Object): scala.Double = js.native
  def sum[T, U](instance: js.Object, map: java.lang.String): scala.Double = js.native
  def sum[T, U](instance: js.Object, map: mapFn[T, U]): scala.Double = js.native
  def tap(instance: js.Object, tapFn: js.Function1[/* obj */ js.Object, _]): js.Object = js.native
  def toQueryString[T, U](instance: js.Object): js.Object = js.native
  def toQueryString[T, U](instance: js.Object, options: QueryStringOptions[T, U]): js.Object = js.native
  def values[T](instance: js.Object): js.Array[T] = js.native
}

