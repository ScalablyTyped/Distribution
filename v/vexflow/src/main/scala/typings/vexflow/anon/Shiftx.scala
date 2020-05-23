package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shiftx extends js.Object {
  var shift_x: js.UndefOr[Double] = js.undefined
  var shift_y: js.UndefOr[Double] = js.undefined
}

object Shiftx {
  @scala.inline
  def apply(shift_x: js.UndefOr[Double] = js.undefined, shift_y: js.UndefOr[Double] = js.undefined): Shiftx = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(shift_x)) __obj.updateDynamic("shift_x")(shift_x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shift_y)) __obj.updateDynamic("shift_y")(shift_y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shiftx]
  }
}

