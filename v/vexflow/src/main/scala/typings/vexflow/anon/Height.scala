package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var height: Double
  var left_shift_ticks: Double
  var right_shift_ticks: Double
  var y_shift: Double
}

object Height {
  @scala.inline
  def apply(height: Double, left_shift_ticks: Double, right_shift_ticks: Double, y_shift: Double): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left_shift_ticks = left_shift_ticks.asInstanceOf[js.Any], right_shift_ticks = right_shift_ticks.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

