package typings.vue2DashDatepicker.vue2DashDatepickerMod.Datepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerOptions extends js.Object {
  var end: String
  var start: String
  var step: String
}

object TimePickerOptions {
  @scala.inline
  def apply(end: String, start: String, step: String): TimePickerOptions = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TimePickerOptions]
  }
}

