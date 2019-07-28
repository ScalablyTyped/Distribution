package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Shiftx extends js.Object {
  var shift_x: js.UndefOr[Double] = js.undefined
  var shift_y: js.UndefOr[Double] = js.undefined
}

object Anon_Shiftx {
  @scala.inline
  def apply(shift_x: Int | Double = null, shift_y: Int | Double = null): Anon_Shiftx = {
    val __obj = js.Dynamic.literal()
    if (shift_x != null) __obj.updateDynamic("shift_x")(shift_x.asInstanceOf[js.Any])
    if (shift_y != null) __obj.updateDynamic("shift_y")(shift_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Shiftx]
  }
}

