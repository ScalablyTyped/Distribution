package typings.vegaDashEmbed

import org.scalablytyped.runtime.StringDictionary
import typings.jsonDashStableDashStringify.jsonDashStableDashStringifyMod.Comparator
import typings.jsonDashStableDashStringify.jsonDashStableDashStringifyMod.Options
import typings.std.Extract
import typings.std.Partial
import typings.std.Pick
import typings.vegaDashLite.buildSrcLogicalMod.LogicalOperand
import typings.vegaDashLite.buildSrcUtilMod.Dict
import typings.vegaDashLite.buildSrcUtilMod.Flag
import typings.vegaDashLite.buildSrcUtilMod.Omit
import typings.vegaDashLite.buildSrcUtilMod.StringSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofutil extends js.Object {
  def accessPathDepth(path: String): Double = js.native
  def accessPathWithDatum(path: String): String = js.native
  def accessPathWithDatum(path: String, datum: String): String = js.native
  def contains[T](array: js.Array[T], item: T): Boolean = js.native
  def deleteNestedProperty(obj: js.Any, orderedProps: js.Array[String]): Boolean = js.native
  def differ[T](dict: Dict[T], other: Dict[T]): Boolean = js.native
  def differArray[T](array: js.Array[T], other: js.Array[T]): Boolean = js.native
  def duplicate[T](obj: T): T = js.native
  def every[T](
    arr: js.Array[T],
    f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], Boolean]
  ): Boolean = js.native
  def flagKeys[S /* <: String */](f: Flag[S]): js.Array[S] = js.native
  def flatAccessWithDatum(path: String): String = js.native
  def flatAccessWithDatum(path: String, datum: String): String = js.native
  def flatten(arrays: js.Array[_]): js.Any = js.native
  def hasIntersection(a: StringSet, b: StringSet): Boolean = js.native
  def hash(a: js.Any): String | Double = js.native
  def isBoolean(b: js.Any): /* is boolean */ Boolean = js.native
  def isNumeric(num: String): Boolean = js.native
  def isNumeric(num: Double): Boolean = js.native
  def keys[T](o: T): js.Array[Extract[String, String]] = js.native
  def logicalExpr[T](op: LogicalOperand[T], cb: js.Function): String = js.native
  def mergeDeep[T](dest: T, src: Partial[T]*): T = js.native
  def omit[T /* <: js.Object */, K /* <: String */](obj: T, props: js.Array[K]): Omit[T, K] = js.native
  def pick[T /* <: js.Object */, K /* <: String */](obj: T, props: js.Array[K]): Pick[T, K] = js.native
  def removePathFromField(path: String): String = js.native
  def replacePathInField(path: String): String = js.native
  def some[T](
    arr: js.Array[T],
    f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], Boolean]
  ): Boolean = js.native
  def stringify(obj: js.Any): String = js.native
  def stringify(obj: js.Any, opts: Comparator): String = js.native
  def stringify(obj: js.Any, opts: Options): String = js.native
  def titlecase(s: String): String = js.native
  def union[T](array: js.Array[T], other: js.Array[T]): js.Array[T] = js.native
  def unique[T](values: js.Array[T], f: js.Function1[/* item */ T, String | Double]): js.Array[T] = js.native
  def vals[T](x: StringDictionary[T]): js.Array[T] = js.native
  def varName(s: String): String = js.native
  def without[T](array: js.Array[T], excludedItems: js.Array[T]): js.Array[T] = js.native
}

