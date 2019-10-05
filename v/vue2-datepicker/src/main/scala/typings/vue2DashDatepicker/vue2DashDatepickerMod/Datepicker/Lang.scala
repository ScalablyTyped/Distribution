package typings.vue2DashDatepicker.vue2DashDatepickerMod.Datepicker

import typings.vue2DashDatepicker.Anon_Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lang extends js.Object {
  var days: js.Array[String]
  var months: js.Array[String]
  var pickers: js.Array[String]
  var placeholder: Anon_Date
}

object Lang {
  @scala.inline
  def apply(
    days: js.Array[String],
    months: js.Array[String],
    pickers: js.Array[String],
    placeholder: Anon_Date
  ): Lang = {
    val __obj = js.Dynamic.literal(days = days, months = months, pickers = pickers, placeholder = placeholder)
  
    __obj.asInstanceOf[Lang]
  }
}

