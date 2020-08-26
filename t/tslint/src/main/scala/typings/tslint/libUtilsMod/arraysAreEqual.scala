package typings.tslint.libUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/utils", "arraysAreEqual")
@js.native
object arraysAreEqual extends js.Object {
  def apply[T](a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], eq: Equal[T]): Boolean = js.native
  def apply[T](a: js.UndefOr[scala.Nothing], b: js.Array[T], eq: Equal[T]): Boolean = js.native
  def apply[T](a: js.Array[T], b: js.UndefOr[scala.Nothing], eq: Equal[T]): Boolean = js.native
  def apply[T](a: js.Array[T], b: js.Array[T], eq: Equal[T]): Boolean = js.native
}

