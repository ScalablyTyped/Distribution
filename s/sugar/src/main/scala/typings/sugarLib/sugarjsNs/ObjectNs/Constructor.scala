package typings
package sugarLib.sugarjsNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends sugarLib.sugarjsNs.SugarNamespace
     with ScalablyTyped.runtime.Instantiable0[Chainable[js.Object]]
     with ScalablyTyped.runtime.Instantiable1[/* raw */ js.Object, Chainable[js.Object]] {
  def apply(): Chainable[js.Object] = js.native
  def apply(raw: js.Object): Chainable[js.Object] = js.native
  def add(instance: js.Object, obj: js.Object): js.Object = js.native
  def add(instance: js.Object, obj: js.Object, options: ObjectMergeOptions): js.Object = js.native
  def addAll(instance: js.Object, sources: js.Array[js.Object]): js.Object = js.native
  def addAll(instance: js.Object, sources: js.Array[js.Object], options: ObjectMergeOptions): js.Object = js.native
  def average(instance: js.Object): scala.Double = js.native
  def average(instance: js.Object, map: java.lang.String): scala.Double = js.native
  def average(instance: js.Object, map: mapFn): scala.Double = js.native
  def clone(instance: js.Object): js.Object = js.native
  def clone(instance: js.Object, deep: scala.Boolean): js.Object = js.native
  def count[T](instance: js.Object, search: T): scala.Double = js.native
  def count[T](instance: js.Object, search: searchFn): scala.Double = js.native
  def defaults(instance: js.Object, sources: js.Array[js.Object]): js.Object = js.native
  def defaults(instance: js.Object, sources: js.Array[js.Object], options: ObjectMergeOptions): js.Object = js.native
  def every[T](instance: js.Object, search: T): scala.Boolean = js.native
  def every[T](instance: js.Object, search: searchFn): scala.Boolean = js.native
  def exclude[T](instance: js.Object, search: T): js.Object = js.native
  def exclude[T](instance: js.Object, search: searchFn): js.Object = js.native
  def filter[T](instance: js.Object, search: T): js.Array[T] = js.native
  def filter[T](instance: js.Object, search: searchFn): js.Array[T] = js.native
  def find[T](instance: js.Object, search: T): scala.Boolean = js.native
  def find[T](instance: js.Object, search: searchFn): scala.Boolean = js.native
  def forEach[T](
    instance: js.Object,
    fn: js.Function3[/* val */ T, /* key */ java.lang.String, /* obj */ js.Object, scala.Unit]
  ): js.Object = js.native
  def fromQueryString(str: java.lang.String): js.Object = js.native
  def fromQueryString(str: java.lang.String, options: QueryStringParseOptions): js.Object = js.native
  def get[T](instance: js.Object, key: java.lang.String): T = js.native
  def get[T](instance: js.Object, key: java.lang.String, inherited: scala.Boolean): T = js.native
  def has(instance: js.Object, key: java.lang.String): scala.Boolean = js.native
  def has(instance: js.Object, key: java.lang.String, inherited: scala.Boolean): scala.Boolean = js.native
  def intersect(instance: js.Object, obj: js.Object): js.Object = js.native
  def invert(instance: js.Object): js.Object = js.native
  def invert(instance: js.Object, multi: scala.Boolean): js.Object = js.native
  def isArguments(instance: js.Object): scala.Boolean = js.native
  def isArray[T](instance: js.Object): /* is Array */scala.Boolean = js.native
  def isBoolean(instance: js.Object): /* is boolean */scala.Boolean = js.native
  def isDate(instance: js.Object): /* is Date */scala.Boolean = js.native
  def isEmpty(instance: js.Object): scala.Boolean = js.native
  def isEqual(instance: js.Object, obj: js.Object): scala.Boolean = js.native
  def isError(instance: js.Object): /* is Error */scala.Boolean = js.native
  def isFunction(instance: js.Object): /* is Function */scala.Boolean = js.native
  def isMap[K, V](instance: js.Object): /* is Map */scala.Boolean = js.native
  def isNumber(instance: js.Object): /* is number */scala.Boolean = js.native
  def isObject(instance: js.Object): scala.Boolean = js.native
  def isRegExp(instance: js.Object): /* is RegExp */scala.Boolean = js.native
  def isSet[T](instance: js.Object): /* is Set */scala.Boolean = js.native
  def isString(instance: js.Object): /* is string */scala.Boolean = js.native
  def keys[T](instance: js.Object): js.Array[T] = js.native
  def least[T](instance: js.Object): T = js.native
  def least[T](instance: js.Object, all: scala.Boolean): T = js.native
  def least[T](instance: js.Object, all: scala.Boolean, map: java.lang.String): T = js.native
  def least[T](instance: js.Object, all: scala.Boolean, map: mapFn): T = js.native
  def least[T](instance: js.Object, map: java.lang.String): T = js.native
  def least[T](instance: js.Object, map: mapFn): T = js.native
  def map(instance: js.Object, map: java.lang.String): js.Object = js.native
  def map(instance: js.Object, map: mapFn): js.Object = js.native
  def max[T](instance: js.Object): T = js.native
  def max[T](instance: js.Object, all: scala.Boolean): T = js.native
  def max[T](instance: js.Object, all: scala.Boolean, map: java.lang.String): T = js.native
  def max[T](instance: js.Object, all: scala.Boolean, map: mapFn): T = js.native
  def max[T](instance: js.Object, map: java.lang.String): T = js.native
  def max[T](instance: js.Object, map: mapFn): T = js.native
  def median(instance: js.Object): scala.Double = js.native
  def median(instance: js.Object, map: java.lang.String): scala.Double = js.native
  def median(instance: js.Object, map: mapFn): scala.Double = js.native
  def merge(instance: js.Object, source: js.Object): js.Object = js.native
  def merge(instance: js.Object, source: js.Object, options: ObjectMergeOptions): js.Object = js.native
  def mergeAll(instance: js.Object, sources: js.Array[js.Object]): js.Object = js.native
  def mergeAll(instance: js.Object, sources: js.Array[js.Object], options: ObjectMergeOptions): js.Object = js.native
  def min[T](instance: js.Object): T = js.native
  def min[T](instance: js.Object, all: scala.Boolean): T = js.native
  def min[T](instance: js.Object, all: scala.Boolean, map: java.lang.String): T = js.native
  def min[T](instance: js.Object, all: scala.Boolean, map: mapFn): T = js.native
  def min[T](instance: js.Object, map: java.lang.String): T = js.native
  def min[T](instance: js.Object, map: mapFn): T = js.native
  def most[T](instance: js.Object): T = js.native
  def most[T](instance: js.Object, all: scala.Boolean): T = js.native
  def most[T](instance: js.Object, all: scala.Boolean, map: java.lang.String): T = js.native
  def most[T](instance: js.Object, all: scala.Boolean, map: mapFn): T = js.native
  def most[T](instance: js.Object, map: java.lang.String): T = js.native
  def most[T](instance: js.Object, map: mapFn): T = js.native
  def none[T](instance: js.Object, search: T): scala.Boolean = js.native
  def none[T](instance: js.Object, search: searchFn): scala.Boolean = js.native
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
  def remove[T](instance: js.Object, search: searchFn): js.Object = js.native
  def select(instance: js.Object, find: java.lang.String): js.Object = js.native
  def select(instance: js.Object, find: js.Array[java.lang.String]): js.Object = js.native
  def select(instance: js.Object, find: js.Object): js.Object = js.native
  def select(instance: js.Object, find: stdLib.RegExp): js.Object = js.native
  def set[T](instance: js.Object, key: java.lang.String, `val`: T): js.Object = js.native
  def size(instance: js.Object): scala.Double = js.native
  def some[T](instance: js.Object, search: T): scala.Boolean = js.native
  def some[T](instance: js.Object, search: searchFn): scala.Boolean = js.native
  def subtract(instance: js.Object, obj: js.Object): js.Object = js.native
  def sum(instance: js.Object): scala.Double = js.native
  def sum(instance: js.Object, map: java.lang.String): scala.Double = js.native
  def sum(instance: js.Object, map: mapFn): scala.Double = js.native
  def tap(instance: js.Object, fn: js.Function1[/* obj */ js.Object, _]): js.Object = js.native
  def toQueryString(instance: js.Object): js.Object = js.native
  def toQueryString(instance: js.Object, options: QueryStringOptions): js.Object = js.native
  def values[T](instance: js.Object): js.Array[T] = js.native
}

