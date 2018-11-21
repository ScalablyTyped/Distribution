package typings
package timsortLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timsort", JSImport.Namespace)
@js.native
object timsortMod extends js.Object {
  def sort(array: js.Array[_], lo: scala.Double): scala.Unit = js.native
  def sort(array: js.Array[_], lo: scala.Double, hi: scala.Double): scala.Unit = js.native
  def sort[T](array: js.Array[T]): scala.Unit = js.native
  def sort[T](array: js.Array[T], compare: js.Function2[/* a */ T, /* b */ T, scala.Double]): scala.Unit = js.native
  def sort[T](array: js.Array[T], compare: js.Function2[/* a */ T, /* b */ T, scala.Double], lo: scala.Double): scala.Unit = js.native
  def sort[T](
    array: js.Array[T],
    compare: js.Function2[/* a */ T, /* b */ T, scala.Double],
    lo: scala.Double,
    hi: scala.Double
  ): scala.Unit = js.native
}

