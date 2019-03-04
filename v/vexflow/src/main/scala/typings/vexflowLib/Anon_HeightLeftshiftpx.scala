package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightLeftshiftpx extends js.Object {
  var height: js.UndefOr[scala.Double] = js.undefined
  var left_shift_px: scala.Double
  var right_shift_px: scala.Double
  var y_shift: scala.Double
}

object Anon_HeightLeftshiftpx {
  @scala.inline
  def apply(
    left_shift_px: scala.Double,
    right_shift_px: scala.Double,
    y_shift: scala.Double,
    height: scala.Int | scala.Double = null
  ): Anon_HeightLeftshiftpx = {
    val __obj = js.Dynamic.literal(left_shift_px = left_shift_px, right_shift_px = right_shift_px, y_shift = y_shift)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightLeftshiftpx]
  }
}

