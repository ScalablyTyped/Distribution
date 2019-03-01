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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("between_lines")(between_lines)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("shift_down")(shift_down)
    __obj.updateDynamic("shift_right")(shift_right)
    __obj.updateDynamic("shift_up")(shift_up)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Betweenlines]
  }
}

