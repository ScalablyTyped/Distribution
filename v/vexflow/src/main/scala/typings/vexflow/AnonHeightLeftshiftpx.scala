package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeightLeftshiftpx extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var left_shift_px: Double
  var right_shift_px: Double
  var y_shift: Double
}

object AnonHeightLeftshiftpx {
  @scala.inline
  def apply(left_shift_px: Double, right_shift_px: Double, y_shift: Double, height: Int | Double = null): AnonHeightLeftshiftpx = {
    val __obj = js.Dynamic.literal(left_shift_px = left_shift_px.asInstanceOf[js.Any], right_shift_px = right_shift_px.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeightLeftshiftpx]
  }
}

