package typings.vue2DashDatepicker.vue2DashDatepickerMod.Datepicker

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueType extends js.Object {
  var date: Date
  var format: String
  var timestamp: Double
}

object ValueType {
  @scala.inline
  def apply(date: Date, format: String, timestamp: Double): ValueType = {
    val __obj = js.Dynamic.literal(date = date, format = format, timestamp = timestamp)
  
    __obj.asInstanceOf[ValueType]
  }
}

