package typings
package sugarLib.sugarjsNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def add(obj: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def add(obj: js.Object, options: ObjectMergeOptions): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def addAll(sources: js.Array[js.Object]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def addAll(sources: js.Array[js.Object], options: ObjectMergeOptions): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def average(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def average(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def average(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def clone(deep: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def count[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def count[T](search: searchFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def defaults(sources: js.Array[js.Object]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def defaults(sources: js.Array[js.Object], options: ObjectMergeOptions): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def every[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def every[T](search: searchFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def exclude[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def exclude[T](search: searchFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def filter[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def filter[T](search: searchFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def find[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def find[T](search: searchFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def forEach[T](
    fn: js.Function3[
      /* val */ T, 
      /* key */ java.lang.String, 
      /* obj */ js.Object, 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def get[T](key: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def get[T](key: java.lang.String, inherited: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def has(key: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def has(key: java.lang.String, inherited: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def intersect(obj: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def invert(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def invert(multi: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def isArguments(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isArray(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isBoolean(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isDate(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isEmpty(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isEqual(obj: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isError(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isFunction(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isMap(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isNumber(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isObject(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isRegExp(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isSet(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isString(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def keys[T](): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def least[T](): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def least[T](all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def least[T](all: scala.Boolean, map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def least[T](all: scala.Boolean, map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def least[T](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def least[T](map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def map(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def map(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def max[T](): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max[T](all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max[T](all: scala.Boolean, map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max[T](all: scala.Boolean, map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max[T](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max[T](map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def median(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def median(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def median(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def merge(source: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def merge(source: js.Object, options: ObjectMergeOptions): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def mergeAll(sources: js.Array[js.Object]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def mergeAll(sources: js.Array[js.Object], options: ObjectMergeOptions): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def min[T](): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min[T](all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min[T](all: scala.Boolean, map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min[T](all: scala.Boolean, map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min[T](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min[T](map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most[T](): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most[T](all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most[T](all: scala.Boolean, map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most[T](all: scala.Boolean, map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most[T](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most[T](map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def none[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def none[T](search: searchFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def reduce[T](
    reduceFn: js.Function4[
      /* acc */ T, 
      /* val */ T, 
      /* key */ java.lang.String, 
      /* obj */ js.Object, 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reduce[T](
    reduceFn: js.Function4[
      /* acc */ T, 
      /* val */ T, 
      /* key */ java.lang.String, 
      /* obj */ js.Object, 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ],
    init: js.Any
  ): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def reject(find: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def reject(find: js.Array[java.lang.String]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def reject(find: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def reject(find: stdLib.RegExp): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def remove[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def remove[T](search: searchFn): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def select(find: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def select(find: js.Array[java.lang.String]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def select(find: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def select(find: stdLib.RegExp): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def set[T](key: java.lang.String, `val`: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def size(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def some[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def some[T](search: searchFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def subtract(obj: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def sum(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def sum(map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def sum(map: mapFn): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def tap(fn: js.Function1[/* obj */ js.Object, sugarLib.sugarjsNs.SugarDefaultChainable[_]]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def toQueryString(): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def toQueryString(options: QueryStringOptions): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def values[T](): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
}

