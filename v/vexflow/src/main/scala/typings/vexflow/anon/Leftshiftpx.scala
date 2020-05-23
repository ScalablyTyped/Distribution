package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Leftshiftpx extends js.Object {
  var height: js.UndefOr[Double] = js.undefined
  var left_shift_px: Double
  var right_shift_px: Double
  var y_shift: Double
}

object Leftshiftpx {
  @scala.inline
  def apply(
    left_shift_px: Double,
    right_shift_px: Double,
    y_shift: Double,
    height: js.UndefOr[Double] = js.undefined
  ): Leftshiftpx = {
    val __obj = js.Dynamic.literal(left_shift_px = left_shift_px.asInstanceOf[js.Any], right_shift_px = right_shift_px.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leftshiftpx]
  }
}

