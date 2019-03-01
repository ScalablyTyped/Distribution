package typings
package vue2DashDatepickerLib.vue2DashDatepickerMod.DatepickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerOptions extends js.Object {
  var end: java.lang.String
  var start: java.lang.String
  var step: java.lang.String
}

object TimePickerOptions {
  @scala.inline
  def apply(end: java.lang.String, start: java.lang.String, step: java.lang.String): TimePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[TimePickerOptions]
  }
}

