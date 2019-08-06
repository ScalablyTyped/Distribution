package typings.vue2DashDatepicker.vue2DashDatepickerMod.DatepickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSelectOptions extends js.Object {
  var hours: js.Array[Double]
  var minutes: js.Array[Double]
  var seconds: js.Array[Double]
}

object TimeSelectOptions {
  @scala.inline
  def apply(hours: js.Array[Double], minutes: js.Array[Double], seconds: js.Array[Double]): TimeSelectOptions = {
    val __obj = js.Dynamic.literal(hours = hours, minutes = minutes, seconds = seconds)
  
    __obj.asInstanceOf[TimeSelectOptions]
  }
}

