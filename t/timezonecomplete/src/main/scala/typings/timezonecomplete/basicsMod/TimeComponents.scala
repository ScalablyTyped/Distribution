package typings.timezonecomplete.basicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeComponents extends js.Object {
  /**
    * Day of month 1-31
    */
  var day: Double = js.native
  /**
    * Hour 0-23
    */
  var hour: Double = js.native
  /**
    * Millisecond 0-999
    */
  var milli: Double = js.native
  /**
    * Minute
    */
  var minute: Double = js.native
  /**
    * Month 1-12
    */
  var month: Double = js.native
  /**
    * Second
    */
  var second: Double = js.native
  /**
    * Year
    */
  var year: Double = js.native
}

object TimeComponents {
  @scala.inline
  def apply(
    day: Double,
    hour: Double,
    milli: Double,
    minute: Double,
    month: Double,
    second: Double,
    year: Double
  ): TimeComponents = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], milli = milli.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeComponents]
  }
  @scala.inline
  implicit class TimeComponentsOps[Self <: TimeComponents] (val x: Self) extends AnyVal {
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
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setMilli(value: Double): Self = this.set("milli", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
  }
  
}

