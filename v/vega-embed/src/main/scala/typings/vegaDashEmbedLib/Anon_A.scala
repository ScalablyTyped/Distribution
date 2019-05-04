package typings
package vegaDashEmbedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_A extends js.Object {
  def accessPathDepth(path: java.lang.String): scala.Double = js.native
  def accessPathWithDatum(path: java.lang.String): java.lang.String = js.native
  def accessPathWithDatum(path: java.lang.String, datum: java.lang.String): java.lang.String = js.native
  def contains[T](array: js.Array[T], item: T): scala.Boolean = js.native
  def deleteNestedProperty(obj: js.Any, orderedProps: js.Array[java.lang.String]): scala.Boolean = js.native
  def differ[T](dict: vegaDashLiteLib.buildSrcUtilMod.Dict[T], other: vegaDashLiteLib.buildSrcUtilMod.Dict[T]): scala.Boolean = js.native
  def differArray[T](array: js.Array[T], other: js.Array[T]): scala.Boolean = js.native
  def duplicate[T](obj: T): T = js.native
  def every[T](
    arr: js.Array[T],
    f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], scala.Boolean]
  ): scala.Boolean = js.native
  def flagKeys[S /* <: java.lang.String */](f: vegaDashLiteLib.buildSrcUtilMod.Flag[S]): js.Array[S] = js.native
  def flatAccessWithDatum(path: java.lang.String): java.lang.String = js.native
  def flatAccessWithDatum(path: java.lang.String, datum: java.lang.String): java.lang.String = js.native
  def flatten(arrays: js.Array[_]): js.Any = js.native
  def hasIntersection(a: vegaDashLiteLib.buildSrcUtilMod.StringSet, b: vegaDashLiteLib.buildSrcUtilMod.StringSet): scala.Boolean = js.native
  def hash(a: js.Any): java.lang.String | scala.Double = js.native
  def isBoolean(b: js.Any): /* is boolean */ scala.Boolean = js.native
  def isNumeric(num: java.lang.String): scala.Boolean = js.native
  def isNumeric(num: scala.Double): scala.Boolean = js.native
  def keys[T](o: T): js.Array[stdLib.Extract[java.lang.String, java.lang.String]] = js.native
  def logicalExpr[T](op: vegaDashLiteLib.buildSrcLogicalMod.LogicalOperand[T], cb: js.Function): java.lang.String = js.native
  def mergeDeep[T](dest: T, src: stdLib.Partial[T]*): T = js.native
  def omit[T /* <: js.Object */, K /* <: java.lang.String */](obj: T, props: js.Array[K]): vegaDashLiteLib.buildSrcUtilMod.Omit[T, K] = js.native
  def pick[T /* <: js.Object */, K /* <: java.lang.String */](obj: T, props: js.Array[K]): stdLib.Pick[T, K] = js.native
  def removePathFromField(path: java.lang.String): java.lang.String = js.native
  def replacePathInField(path: java.lang.String): java.lang.String = js.native
  def some[T](
    arr: js.Array[T],
    f: js.Function3[/* d */ T, /* k */ js.UndefOr[js.Any], /* i */ js.UndefOr[js.Any], scala.Boolean]
  ): scala.Boolean = js.native
  def stringify(obj: js.Any): java.lang.String = js.native
  def stringify(obj: js.Any, opts: jsonDashStableDashStringifyLib.jsonDashStableDashStringifyMod.Comparator): java.lang.String = js.native
  def stringify(obj: js.Any, opts: jsonDashStableDashStringifyLib.jsonDashStableDashStringifyMod.Options): java.lang.String = js.native
  def titlecase(s: java.lang.String): java.lang.String = js.native
  def union[T](array: js.Array[T], other: js.Array[T]): js.Array[T] = js.native
  def unique[T](values: js.Array[T], f: js.Function1[/* item */ T, java.lang.String | scala.Double]): js.Array[T] = js.native
  def vals[T](x: org.scalablytyped.runtime.StringDictionary[T]): js.Array[T] = js.native
  def varName(s: java.lang.String): java.lang.String = js.native
  def without[T](array: js.Array[T], excludedItems: js.Array[T]): js.Array[T] = js.native
}

