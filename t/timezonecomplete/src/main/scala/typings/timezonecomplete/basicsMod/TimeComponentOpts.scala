package typings.timezonecomplete.basicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeComponentOpts extends js.Object {
  /**
    * Day of month 1-31, default 1
    */
  var day: js.UndefOr[Double] = js.native
  /**
    * Hour of day 0-23, default 0
    */
  var hour: js.UndefOr[Double] = js.native
  /**
    * Millisecond 0-999, default 0
    */
  var milli: js.UndefOr[Double] = js.native
  /**
    * Minute 0-59, default 0
    */
  var minute: js.UndefOr[Double] = js.native
  /**
    * Month 1-12, default 1
    */
  var month: js.UndefOr[Double] = js.native
  /**
    * Second 0-59, default 0
    */
  var second: js.UndefOr[Double] = js.native
  /**
    * Year, default 1970
    */
  var year: js.UndefOr[Double] = js.native
}

object TimeComponentOpts {
  @scala.inline
  def apply(): TimeComponentOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeComponentOpts]
  }
  @scala.inline
  implicit class TimeComponentOptsOps[Self <: TimeComponentOpts] (val x: Self) extends AnyVal {
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
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    @scala.inline
    def setMilli(value: Double): Self = this.set("milli", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilli: Self = this.set("milli", js.undefined)
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
  
}

