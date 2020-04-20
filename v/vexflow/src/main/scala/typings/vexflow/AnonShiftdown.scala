package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShiftdown extends js.Object {
  var code: String
  var shift_down: Double
  var shift_right: Double
  var shift_up: Double
  var width: Double
}

object AnonShiftdown {
  @scala.inline
  def apply(code: String, shift_down: Double, shift_right: Double, shift_up: Double, width: Double): AnonShiftdown = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], shift_down = shift_down.asInstanceOf[js.Any], shift_right = shift_right.asInstanceOf[js.Any], shift_up = shift_up.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShiftdown]
  }
}

