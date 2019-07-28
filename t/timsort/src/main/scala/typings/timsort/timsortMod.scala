package typings.timsort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timsort", JSImport.Namespace)
@js.native
object timsortMod extends js.Object {
  def sort(array: js.Array[_], lo: Double): Unit = js.native
  def sort(array: js.Array[_], lo: Double, hi: Double): Unit = js.native
  def sort[T](array: js.Array[T]): Unit = js.native
  def sort[T](array: js.Array[T], compare: js.Function2[/* a */ T, /* b */ T, Double]): Unit = js.native
  def sort[T](array: js.Array[T], compare: js.Function2[/* a */ T, /* b */ T, Double], lo: Double): Unit = js.native
  def sort[T](array: js.Array[T], compare: js.Function2[/* a */ T, /* b */ T, Double], lo: Double, hi: Double): Unit = js.native
}

