package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/array", JSImport.Namespace)
@js.native
object distLibUtilsArrayMod extends js.Object {
  def binaryFindPartition[T](arr: js.Array[T], partition: js.Function1[/* item */ T, Boolean]): Double = js.native
  def insertPrioritySorted[T /* <: Anon_Priority */](arr: js.Array[T], item: T): js.Array[T] = js.native
}

