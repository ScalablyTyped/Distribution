package typings.sugar.sugarjsNs.ObjectNs

import typings.std.RegExp
import typings.sugar.sugarjsNs.SugarDefaultChainable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def add[T](obj: js.Object): SugarDefaultChainable[js.Object] = js.native
  def add[T](obj: js.Object, options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
  def addAll[T](sources: js.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
  def addAll[T](sources: js.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
  def average[T, U](): SugarDefaultChainable[Double] = js.native
  def average[T, U](map: String): SugarDefaultChainable[Double] = js.native
  def average[T, U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
  def clone(deep: Boolean): SugarDefaultChainable[js.Object] = js.native
  def count[T](search: T): SugarDefaultChainable[Double] = js.native
  def count[T](search: searchFn[T]): SugarDefaultChainable[Double] = js.native
  def defaults[T](sources: js.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
  def defaults[T](sources: js.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
  def every[T](search: T): SugarDefaultChainable[Boolean] = js.native
  def every[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
  def exclude[T](search: T): SugarDefaultChainable[js.Object] = js.native
  def exclude[T](search: searchFn[T]): SugarDefaultChainable[js.Object] = js.native
  def filter[T](search: T): SugarDefaultChainable[js.Array[T]] = js.native
  def filter[T](search: searchFn[T]): SugarDefaultChainable[js.Array[T]] = js.native
  def find[T](search: T): SugarDefaultChainable[Boolean] = js.native
  def find[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
  def forEach[T](
    eachFn: js.Function3[/* val */ T, /* key */ String, /* obj */ js.Object, SugarDefaultChainable[Unit]]
  ): SugarDefaultChainable[js.Object] = js.native
  def get[T](key: String): SugarDefaultChainable[T] = js.native
  def get[T](key: String, inherited: Boolean): SugarDefaultChainable[T] = js.native
  def has(key: String): SugarDefaultChainable[Boolean] = js.native
  def has(key: String, inherited: Boolean): SugarDefaultChainable[Boolean] = js.native
  def intersect(obj: js.Object): SugarDefaultChainable[js.Object] = js.native
  def invert(): SugarDefaultChainable[js.Object] = js.native
  def invert(multi: Boolean): SugarDefaultChainable[js.Object] = js.native
  def isArguments(): SugarDefaultChainable[Boolean] = js.native
  def isArray(): SugarDefaultChainable[Boolean] = js.native
  def isBoolean(): SugarDefaultChainable[Boolean] = js.native
  def isDate(): SugarDefaultChainable[Boolean] = js.native
  def isEmpty(): SugarDefaultChainable[Boolean] = js.native
  def isEqual(obj: js.Object): SugarDefaultChainable[Boolean] = js.native
  def isError(): SugarDefaultChainable[Boolean] = js.native
  def isFunction(): SugarDefaultChainable[Boolean] = js.native
  def isMap(): SugarDefaultChainable[Boolean] = js.native
  def isNumber(): SugarDefaultChainable[Boolean] = js.native
  def isObject(): SugarDefaultChainable[Boolean] = js.native
  def isRegExp(): SugarDefaultChainable[Boolean] = js.native
  def isSet(): SugarDefaultChainable[Boolean] = js.native
  def isString(): SugarDefaultChainable[Boolean] = js.native
  def keys[T](): SugarDefaultChainable[js.Array[T]] = js.native
  def least[T, U](): SugarDefaultChainable[T] = js.native
  def least[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
  def least[T, U](all: Boolean, map: String): SugarDefaultChainable[T] = js.native
  def least[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
  def least[T, U](map: String): SugarDefaultChainable[T] = js.native
  def least[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
  def map[T, U](map: String): SugarDefaultChainable[js.Object] = js.native
  def map[T, U](map: mapFn[T, U]): SugarDefaultChainable[js.Object] = js.native
  def max[T, U](): SugarDefaultChainable[T] = js.native
  def max[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
  def max[T, U](all: Boolean, map: String): SugarDefaultChainable[T] = js.native
  def max[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
  def max[T, U](map: String): SugarDefaultChainable[T] = js.native
  def max[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
  def median[T, U](): SugarDefaultChainable[Double] = js.native
  def median[T, U](map: String): SugarDefaultChainable[Double] = js.native
  def median[T, U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
  def merge[T](source: js.Object): SugarDefaultChainable[js.Object] = js.native
  def merge[T](source: js.Object, options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
  def mergeAll[T](sources: js.Array[js.Object]): SugarDefaultChainable[js.Object] = js.native
  def mergeAll[T](sources: js.Array[js.Object], options: ObjectMergeOptions[T]): SugarDefaultChainable[js.Object] = js.native
  def min[T, U](): SugarDefaultChainable[T] = js.native
  def min[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
  def min[T, U](all: Boolean, map: String): SugarDefaultChainable[T] = js.native
  def min[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
  def min[T, U](map: String): SugarDefaultChainable[T] = js.native
  def min[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
  def most[T, U](): SugarDefaultChainable[T] = js.native
  def most[T, U](all: Boolean): SugarDefaultChainable[T] = js.native
  def most[T, U](all: Boolean, map: String): SugarDefaultChainable[T] = js.native
  def most[T, U](all: Boolean, map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
  def most[T, U](map: String): SugarDefaultChainable[T] = js.native
  def most[T, U](map: mapFn[T, U]): SugarDefaultChainable[T] = js.native
  def none[T](search: T): SugarDefaultChainable[Boolean] = js.native
  def none[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
  def reduce[T](
    reduceFn: js.Function4[
      /* acc */ T, 
      /* val */ T, 
      /* key */ String, 
      /* obj */ js.Object, 
      SugarDefaultChainable[Unit]
    ]
  ): SugarDefaultChainable[T] = js.native
  def reduce[T](
    reduceFn: js.Function4[
      /* acc */ T, 
      /* val */ T, 
      /* key */ String, 
      /* obj */ js.Object, 
      SugarDefaultChainable[Unit]
    ],
    init: js.Any
  ): SugarDefaultChainable[T] = js.native
  def reject(find: String): SugarDefaultChainable[js.Object] = js.native
  def reject(find: js.Array[String]): SugarDefaultChainable[js.Object] = js.native
  def reject(find: js.Object): SugarDefaultChainable[js.Object] = js.native
  def reject(find: RegExp): SugarDefaultChainable[js.Object] = js.native
  def remove[T](search: T): SugarDefaultChainable[js.Object] = js.native
  def remove[T](search: searchFn[T]): SugarDefaultChainable[js.Object] = js.native
  def select(find: String): SugarDefaultChainable[js.Object] = js.native
  def select(find: js.Array[String]): SugarDefaultChainable[js.Object] = js.native
  def select(find: js.Object): SugarDefaultChainable[js.Object] = js.native
  def select(find: RegExp): SugarDefaultChainable[js.Object] = js.native
  def set[T](key: String, `val`: T): SugarDefaultChainable[js.Object] = js.native
  def size(): SugarDefaultChainable[Double] = js.native
  def some[T](search: T): SugarDefaultChainable[Boolean] = js.native
  def some[T](search: searchFn[T]): SugarDefaultChainable[Boolean] = js.native
  def subtract(obj: js.Object): SugarDefaultChainable[js.Object] = js.native
  def sum[T, U](): SugarDefaultChainable[Double] = js.native
  def sum[T, U](map: String): SugarDefaultChainable[Double] = js.native
  def sum[T, U](map: mapFn[T, U]): SugarDefaultChainable[Double] = js.native
  def tap(tapFn: js.Function1[/* obj */ js.Object, SugarDefaultChainable[_]]): SugarDefaultChainable[js.Object] = js.native
  def toQueryString[T, U](): SugarDefaultChainable[js.Object] = js.native
  def toQueryString[T, U](options: QueryStringOptions[T, U]): SugarDefaultChainable[js.Object] = js.native
  def values[T](): SugarDefaultChainable[js.Array[T]] = js.native
}

