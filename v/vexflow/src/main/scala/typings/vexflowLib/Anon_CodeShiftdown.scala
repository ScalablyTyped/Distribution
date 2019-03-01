package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeShiftdown extends js.Object {
  var code: java.lang.String
  var shift_down: scala.Double
  var shift_right: scala.Double
  var shift_up: scala.Double
  var width: scala.Double
}

object Anon_CodeShiftdown {
  @scala.inline
  def apply(
    code: java.lang.String,
    shift_down: scala.Double,
    shift_right: scala.Double,
    shift_up: scala.Double,
    width: scala.Double
  ): Anon_CodeShiftdown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("shift_down")(shift_down)
    __obj.updateDynamic("shift_right")(shift_right)
    __obj.updateDynamic("shift_up")(shift_up)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_CodeShiftdown]
  }
}

