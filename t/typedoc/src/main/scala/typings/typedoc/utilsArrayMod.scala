package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/array", JSImport.Namespace)
@js.native
object utilsArrayMod extends js.Object {
  def binaryFindPartition[T](arr: js.Array[T], partition: js.Function1[/* item */ T, Boolean]): Double = js.native
  def insertPrioritySorted[T /* <: AnonPriority */](arr: js.Array[T], item: T): js.Array[T] = js.native
  def removeIfPresent[T](arr: js.UndefOr[scala.Nothing], item: T): Unit = js.native
  def removeIfPresent[T](arr: js.Array[T], item: T): Unit = js.native
}

