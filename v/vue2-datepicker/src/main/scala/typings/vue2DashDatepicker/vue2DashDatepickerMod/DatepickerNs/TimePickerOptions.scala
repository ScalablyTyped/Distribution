package typings.vue2DashDatepicker.vue2DashDatepickerMod.DatepickerNs

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
    val __obj = js.Dynamic.literal(end = end, start = start, step = step)
  
    __obj.asInstanceOf[TimePickerOptions]
  }
}

