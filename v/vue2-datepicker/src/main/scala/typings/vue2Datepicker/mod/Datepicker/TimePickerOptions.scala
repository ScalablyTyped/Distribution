package typings.vue2Datepicker.mod.Datepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerOptions extends js.Object {
  var end: String
  var format: String
  var start: String
  var step: String
}

object TimePickerOptions {
  @scala.inline
  def apply(end: String, format: String, start: String, step: String): TimePickerOptions = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerOptions]
  }
}

