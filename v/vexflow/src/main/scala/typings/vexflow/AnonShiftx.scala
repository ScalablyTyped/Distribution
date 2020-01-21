package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShiftx extends js.Object {
  var shift_x: js.UndefOr[Double] = js.undefined
  var shift_y: js.UndefOr[Double] = js.undefined
}

object AnonShiftx {
  @scala.inline
  def apply(shift_x: Int | Double = null, shift_y: Int | Double = null): AnonShiftx = {
    val __obj = js.Dynamic.literal()
    if (shift_x != null) __obj.updateDynamic("shift_x")(shift_x.asInstanceOf[js.Any])
    if (shift_y != null) __obj.updateDynamic("shift_y")(shift_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShiftx]
  }
}

