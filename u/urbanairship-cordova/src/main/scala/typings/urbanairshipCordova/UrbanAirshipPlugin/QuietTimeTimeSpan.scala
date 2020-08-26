package typings.urbanairshipCordova.UrbanAirshipPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a timespan during which notifications should be silenced.
  *
  * For example, 10PM - 6AM would be:
  * { startHour: 22, startMinute: 0, endHour: 6, endMinute: 0 }
  */
@js.native
trait QuietTimeTimeSpan extends js.Object {
  var endHour: Double = js.native
  var endMinute: Double = js.native
  var startHour: Double = js.native
  var startMinute: Double = js.native
}

object QuietTimeTimeSpan {
  @scala.inline
  def apply(endHour: Double, endMinute: Double, startHour: Double, startMinute: Double): QuietTimeTimeSpan = {
    val __obj = js.Dynamic.literal(endHour = endHour.asInstanceOf[js.Any], endMinute = endMinute.asInstanceOf[js.Any], startHour = startHour.asInstanceOf[js.Any], startMinute = startMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuietTimeTimeSpan]
  }
  @scala.inline
  implicit class QuietTimeTimeSpanOps[Self <: QuietTimeTimeSpan] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndHour(value: Double): Self = this.set("endHour", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndMinute(value: Double): Self = this.set("endMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartHour(value: Double): Self = this.set("startHour", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartMinute(value: Double): Self = this.set("startMinute", value.asInstanceOf[js.Any])
  }
  
}

