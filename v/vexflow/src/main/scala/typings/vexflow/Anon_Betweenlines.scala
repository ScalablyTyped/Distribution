package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Betweenlines extends js.Object {
  var between_lines: Boolean
  var code: String
  var shift_down: Double
  var shift_right: Double
  var shift_up: Double
  var width: Double
}

object Anon_Betweenlines {
  @scala.inline
  def apply(
    between_lines: Boolean,
    code: String,
    shift_down: Double,
    shift_right: Double,
    shift_up: Double,
    width: Double
  ): Anon_Betweenlines = {
    val __obj = js.Dynamic.literal(between_lines = between_lines, code = code, shift_down = shift_down, shift_right = shift_right, shift_up = shift_up, width = width)
  
    __obj.asInstanceOf[Anon_Betweenlines]
  }
}

