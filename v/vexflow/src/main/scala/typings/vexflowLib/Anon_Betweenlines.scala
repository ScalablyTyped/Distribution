package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Betweenlines extends js.Object {
  var between_lines: scala.Boolean
  var code: java.lang.String
  var shift_down: scala.Double
  var shift_right: scala.Double
  var shift_up: scala.Double
  var width: scala.Double
}

object Anon_Betweenlines {
  @scala.inline
  def apply(
    between_lines: scala.Boolean,
    code: java.lang.String,
    shift_down: scala.Double,
    shift_right: scala.Double,
    shift_up: scala.Double,
    width: scala.Double
  ): Anon_Betweenlines = {
    val __obj = js.Dynamic.literal(between_lines = between_lines, code = code, shift_down = shift_down, shift_right = shift_right, shift_up = shift_up, width = width)
  
    __obj.asInstanceOf[Anon_Betweenlines]
  }
}

