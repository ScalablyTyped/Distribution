package typings.timezoneSupport.index19002050Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Time extends js.Object {
  var day: Double = js.native
  var dayOfWeek: js.UndefOr[Double] = js.native
  var epoch: js.UndefOr[Double] = js.native
  var hours: Double = js.native
  var milliseconds: js.UndefOr[Double] = js.native
  var minutes: Double = js.native
  var month: Double = js.native
  var seconds: js.UndefOr[Double] = js.native
  var year: Double = js.native
  var zone: js.UndefOr[TimeZoneOffset] = js.native
}

object Time {
  @scala.inline
  def apply(day: Double, hours: Double, minutes: Double, month: Double, year: Double): Time = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  @scala.inline
  implicit class TimeOps[Self <: Time] (val x: Self) extends AnyVal {
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
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayOfWeek(value: Double): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    @scala.inline
    def setEpoch(value: Double): Self = this.set("epoch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpoch: Self = this.set("epoch", js.undefined)
    @scala.inline
    def setMilliseconds(value: Double): Self = this.set("milliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilliseconds: Self = this.set("milliseconds", js.undefined)
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
    @scala.inline
    def setZone(value: TimeZoneOffset): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

