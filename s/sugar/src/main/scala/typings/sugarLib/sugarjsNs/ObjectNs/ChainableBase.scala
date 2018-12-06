package typings
package sugarLib.sugarjsNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def add[T](obj: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def add[T](obj: js.Object, options: ObjectMergeOptions[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def addAll[T](sources: js.Array[js.Object]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def addAll[T](sources: js.Array[js.Object], options: ObjectMergeOptions[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def average[T, U](): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def average[T, U](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def average[T, U](map: mapFn[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def clone(deep: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def count[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def count[T](search: searchFn[T]): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def defaults[T](sources: js.Array[js.Object]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def defaults[T](sources: js.Array[js.Object], options: ObjectMergeOptions[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def every[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def every[T](search: searchFn[T]): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def exclude[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def exclude[T](search: searchFn[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def filter[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def filter[T](search: searchFn[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def find[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def find[T](search: searchFn[T]): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def forEach[T](
    eachFn: js.Function3[
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
  def least[T, U](): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def least[T, U](all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def least[T, U](all: scala.Boolean, map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def least[T, U](all: scala.Boolean, map: mapFn[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def least[T, U](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def least[T, U](map: mapFn[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def map[T, U](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def map[T, U](map: mapFn[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def max[T, U](): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max[T, U](all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max[T, U](all: scala.Boolean, map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max[T, U](all: scala.Boolean, map: mapFn[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max[T, U](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def max[T, U](map: mapFn[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def median[T, U](): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def median[T, U](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def median[T, U](map: mapFn[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def merge[T](source: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def merge[T](source: js.Object, options: ObjectMergeOptions[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def mergeAll[T](sources: js.Array[js.Object]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def mergeAll[T](sources: js.Array[js.Object], options: ObjectMergeOptions[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def min[T, U](): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min[T, U](all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min[T, U](all: scala.Boolean, map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min[T, U](all: scala.Boolean, map: mapFn[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min[T, U](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def min[T, U](map: mapFn[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most[T, U](): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most[T, U](all: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most[T, U](all: scala.Boolean, map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most[T, U](all: scala.Boolean, map: mapFn[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most[T, U](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def most[T, U](map: mapFn[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def none[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def none[T](search: searchFn[T]): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
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
  def remove[T](search: searchFn[T]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def select(find: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def select(find: js.Array[java.lang.String]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def select(find: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def select(find: stdLib.RegExp): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def set[T](key: java.lang.String, `val`: T): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def size(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def some[T](search: T): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def some[T](search: searchFn[T]): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def subtract(obj: js.Object): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def sum[T, U](): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def sum[T, U](map: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def sum[T, U](map: mapFn[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def tap(tapFn: js.Function1[/* obj */ js.Object, sugarLib.sugarjsNs.SugarDefaultChainable[_]]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def toQueryString[T, U](): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def toQueryString[T, U](options: QueryStringOptions[T, U]): sugarLib.sugarjsNs.SugarDefaultChainable[js.Object] = js.native
  def values[T](): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
}

