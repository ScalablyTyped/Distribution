package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBetweenlines extends js.Object {
  var between_lines: Boolean
  var code: String
  var shift_down: Double
  var shift_right: Double
  var shift_up: Double
  var width: Double
}

object AnonBetweenlines {
  @scala.inline
  def apply(
    between_lines: Boolean,
    code: String,
    shift_down: Double,
    shift_right: Double,
    shift_up: Double,
    width: Double
  ): AnonBetweenlines = {
    val __obj = js.Dynamic.literal(between_lines = between_lines.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], shift_down = shift_down.asInstanceOf[js.Any], shift_right = shift_right.asInstanceOf[js.Any], shift_up = shift_up.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBetweenlines]
  }
}

