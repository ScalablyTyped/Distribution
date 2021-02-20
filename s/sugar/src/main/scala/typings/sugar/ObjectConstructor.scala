package typings.sugar

import typings.sugar.sugarjs.Object.ObjectMergeOptions
import typings.sugar.sugarjs.Object.QueryStringOptions
import typings.sugar.sugarjs.Object.QueryStringParseOptions
import typings.sugar.sugarjs.Object.mapFn
import typings.sugar.sugarjs.Object.searchFn
import typings.sugar.sugarjs._NativeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectConstructor extends _NativeConstructor {
  
  def add[T](instance: js.Object, obj: js.Object): js.Object = js.native
  def add[T](instance: js.Object, obj: js.Object, options: ObjectMergeOptions[T]): js.Object = js.native
  
  def addAll[T](instance: js.Object, sources: Array[js.Object]): js.Object = js.native
  def addAll[T](instance: js.Object, sources: Array[js.Object], options: ObjectMergeOptions[T]): js.Object = js.native
  
  def average[T, U](instance: js.Object): Double = js.native
  def average[T, U](instance: js.Object, map: java.lang.String): Double = js.native
  def average[T, U](instance: js.Object, map: mapFn[T, U]): Double = js.native
  
  def clone(instance: js.Object): js.Object = js.native
  def clone(instance: js.Object, deep: Boolean): js.Object = js.native
  
  def count[T](instance: js.Object, search: T): Double = js.native
  def count[T](instance: js.Object, search: searchFn[T]): Double = js.native
  
  def defaults[T](instance: js.Object, sources: Array[js.Object]): js.Object = js.native
  def defaults[T](instance: js.Object, sources: Array[js.Object], options: ObjectMergeOptions[T]): js.Object = js.native
  
  def every[T](instance: js.Object, search: T): Boolean = js.native
  def every[T](instance: js.Object, search: searchFn[T]): Boolean = js.native
  
  def exclude[T](instance: js.Object, search: T): js.Object = js.native
  def exclude[T](instance: js.Object, search: searchFn[T]): js.Object = js.native
  
  def filter[T](instance: js.Object, search: T): Array[T] = js.native
  def filter[T](instance: js.Object, search: searchFn[T]): Array[T] = js.native
  
  def find[T](instance: js.Object, search: T): Boolean = js.native
  def find[T](instance: js.Object, search: searchFn[T]): Boolean = js.native
  
  def forEach[T](
    instance: js.Object,
    eachFn: js.Function3[/* val */ T, /* key */ java.lang.String, /* obj */ js.Object, Unit]
  ): js.Object = js.native
  
  def fromQueryString[T, U](str: java.lang.String): js.Object = js.native
  def fromQueryString[T, U](str: java.lang.String, options: QueryStringParseOptions[T, U]): js.Object = js.native
  
  def get[T](instance: js.Object, key: java.lang.String): T = js.native
  def get[T](instance: js.Object, key: java.lang.String, inherited: Boolean): T = js.native
  
  def has(instance: js.Object, key: java.lang.String): Boolean = js.native
  def has(instance: js.Object, key: java.lang.String, inherited: Boolean): Boolean = js.native
  
  def intersect(instance: js.Object, obj: js.Object): js.Object = js.native
  
  def invert(instance: js.Object): js.Object = js.native
  def invert(instance: js.Object, multi: Boolean): js.Object = js.native
  
  def isArguments(instance: js.Object): Boolean = js.native
  
  def isArray(instance: js.Any): /* is sugar.Array<any> */ Boolean = js.native
  
  def isBoolean(instance: js.Any): /* is boolean */ Boolean = js.native
  
  def isDate(instance: js.Any): /* is sugar.Date */ Boolean = js.native
  
  def isEmpty(instance: js.Object): Boolean = js.native
  
  def isEqual(instance: js.Object, obj: js.Object): Boolean = js.native
  
  def isError(instance: js.Any): /* is std.Error */ Boolean = js.native
  
  def isFunction(instance: js.Any): /* is sugar.Function */ Boolean = js.native
  
  def isMap(instance: js.Any): /* is std.Map<any, any> */ Boolean = js.native
  
  def isNumber(instance: js.Any): /* is number */ Boolean = js.native
  
  def isObject(instance: js.Object): Boolean = js.native
  
  def isRegExp(instance: js.Any): /* is sugar.RegExp */ Boolean = js.native
  
  def isSet(instance: js.Any): /* is std.Set<any> */ Boolean = js.native
  
  def isString(instance: js.Any): /* is string */ Boolean = js.native
  
  def keys[T](instance: js.Object): Array[T] = js.native
  
  def least[T, U](instance: js.Object): T = js.native
  def least[T, U](instance: js.Object, all: js.UndefOr[scala.Nothing], map: java.lang.String): T = js.native
  def least[T, U](instance: js.Object, all: js.UndefOr[scala.Nothing], map: mapFn[T, U]): T = js.native
  def least[T, U](instance: js.Object, all: Boolean): T = js.native
  def least[T, U](instance: js.Object, all: Boolean, map: java.lang.String): T = js.native
  def least[T, U](instance: js.Object, all: Boolean, map: mapFn[T, U]): T = js.native
  def least[T, U](instance: js.Object, map: java.lang.String): T = js.native
  def least[T, U](instance: js.Object, map: mapFn[T, U]): T = js.native
  
  def map[T, U](instance: js.Object, map: java.lang.String): js.Object = js.native
  def map[T, U](instance: js.Object, map: mapFn[T, U]): js.Object = js.native
  
  def max[T, U](instance: js.Object): T = js.native
  def max[T, U](instance: js.Object, all: js.UndefOr[scala.Nothing], map: java.lang.String): T = js.native
  def max[T, U](instance: js.Object, all: js.UndefOr[scala.Nothing], map: mapFn[T, U]): T = js.native
  def max[T, U](instance: js.Object, all: Boolean): T = js.native
  def max[T, U](instance: js.Object, all: Boolean, map: java.lang.String): T = js.native
  def max[T, U](instance: js.Object, all: Boolean, map: mapFn[T, U]): T = js.native
  def max[T, U](instance: js.Object, map: java.lang.String): T = js.native
  def max[T, U](instance: js.Object, map: mapFn[T, U]): T = js.native
  
  def median[T, U](instance: js.Object): Double = js.native
  def median[T, U](instance: js.Object, map: java.lang.String): Double = js.native
  def median[T, U](instance: js.Object, map: mapFn[T, U]): Double = js.native
  
  def merge[T](instance: js.Object, source: js.Object): js.Object = js.native
  def merge[T](instance: js.Object, source: js.Object, options: ObjectMergeOptions[T]): js.Object = js.native
  
  def mergeAll[T](instance: js.Object, sources: Array[js.Object]): js.Object = js.native
  def mergeAll[T](instance: js.Object, sources: Array[js.Object], options: ObjectMergeOptions[T]): js.Object = js.native
  
  def min[T, U](instance: js.Object): T = js.native
  def min[T, U](instance: js.Object, all: js.UndefOr[scala.Nothing], map: java.lang.String): T = js.native
  def min[T, U](instance: js.Object, all: js.UndefOr[scala.Nothing], map: mapFn[T, U]): T = js.native
  def min[T, U](instance: js.Object, all: Boolean): T = js.native
  def min[T, U](instance: js.Object, all: Boolean, map: java.lang.String): T = js.native
  def min[T, U](instance: js.Object, all: Boolean, map: mapFn[T, U]): T = js.native
  def min[T, U](instance: js.Object, map: java.lang.String): T = js.native
  def min[T, U](instance: js.Object, map: mapFn[T, U]): T = js.native
  
  def most[T, U](instance: js.Object): T = js.native
  def most[T, U](instance: js.Object, all: js.UndefOr[scala.Nothing], map: java.lang.String): T = js.native
  def most[T, U](instance: js.Object, all: js.UndefOr[scala.Nothing], map: mapFn[T, U]): T = js.native
  def most[T, U](instance: js.Object, all: Boolean): T = js.native
  def most[T, U](instance: js.Object, all: Boolean, map: java.lang.String): T = js.native
  def most[T, U](instance: js.Object, all: Boolean, map: mapFn[T, U]): T = js.native
  def most[T, U](instance: js.Object, map: java.lang.String): T = js.native
  def most[T, U](instance: js.Object, map: mapFn[T, U]): T = js.native
  
  def none[T](instance: js.Object, search: T): Boolean = js.native
  def none[T](instance: js.Object, search: searchFn[T]): Boolean = js.native
  
  def reduce[T](
    instance: js.Object,
    reduceFn: js.Function4[/* acc */ T, /* val */ T, /* key */ java.lang.String, /* obj */ js.Object, Unit]
  ): T = js.native
  def reduce[T](
    instance: js.Object,
    reduceFn: js.Function4[/* acc */ T, /* val */ T, /* key */ java.lang.String, /* obj */ js.Object, Unit],
    init: js.Any
  ): T = js.native
  
  def reject(instance: js.Object, find: java.lang.String): js.Object = js.native
  def reject(instance: js.Object, find: js.Object): js.Object = js.native
  def reject(instance: js.Object, find: Array[java.lang.String]): js.Object = js.native
  def reject(instance: js.Object, find: RegExp): js.Object = js.native
  
  def remove[T](instance: js.Object, search: T): js.Object = js.native
  def remove[T](instance: js.Object, search: searchFn[T]): js.Object = js.native
  
  def select(instance: js.Object, find: java.lang.String): js.Object = js.native
  def select(instance: js.Object, find: js.Object): js.Object = js.native
  def select(instance: js.Object, find: Array[java.lang.String]): js.Object = js.native
  def select(instance: js.Object, find: RegExp): js.Object = js.native
  
  def set[T](instance: js.Object, key: java.lang.String, `val`: T): js.Object = js.native
  
  def size(instance: js.Object): Double = js.native
  
  def some[T](instance: js.Object, search: T): Boolean = js.native
  def some[T](instance: js.Object, search: searchFn[T]): Boolean = js.native
  
  def subtract(instance: js.Object, obj: js.Object): js.Object = js.native
  
  def sum[T, U](instance: js.Object): Double = js.native
  def sum[T, U](instance: js.Object, map: java.lang.String): Double = js.native
  def sum[T, U](instance: js.Object, map: mapFn[T, U]): Double = js.native
  
  def tap(instance: js.Object, tapFn: js.Function1[/* obj */ js.Object, _]): js.Object = js.native
  
  def toQueryString[T, U](instance: js.Object): js.Object = js.native
  def toQueryString[T, U](instance: js.Object, options: QueryStringOptions[T, U]): js.Object = js.native
  
  def values[T](instance: js.Object): Array[T] = js.native
}
