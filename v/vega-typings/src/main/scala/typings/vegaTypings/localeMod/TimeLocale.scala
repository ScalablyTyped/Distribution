package typings.vegaTypings.localeMod

import typings.vegaTypings.utilMod.Vector12
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector7
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeLocale extends js.Object {
  /**
    * The date (%x) format specifier (e.g., "%m/%d/%Y").
    */
  var date: String = js.native
  /**
    * The date and time (%c) format specifier (e.g., "%a %b %e %X %Y").
    */
  var dateTime: String = js.native
  /**
    * The full names of the weekdays, starting with Sunday.
    */
  var days: Vector7[String] = js.native
  /**
    * The full names of the months (starting with January).
    */
  var months: Vector12[String] = js.native
  /**
    * The A.M. and P.M. equivalents (e.g., ["AM", "PM"]).
    */
  var periods: Vector2[String] = js.native
  /**
    * The abbreviated names of the weekdays, starting with Sunday.
    */
  var shortDays: Vector7[String] = js.native
  /**
    * The abbreviated names of the months (starting with January).
    */
  var shortMonths: Vector12[String] = js.native
  /**
    * The time (%X) format specifier (e.g., "%H:%M:%S").
    */
  var time: String = js.native
}

object TimeLocale {
  @scala.inline
  def apply(
    date: String,
    dateTime: String,
    days: Vector7[String],
    months: Vector12[String],
    periods: Vector2[String],
    shortDays: Vector7[String],
    shortMonths: Vector12[String],
    time: String
  ): TimeLocale = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], periods = periods.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeLocale]
  }
  @scala.inline
  implicit class TimeLocaleOps[Self <: TimeLocale] (val x: Self) extends AnyVal {
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
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateTime(value: String): Self = this.set("dateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDays(value: Vector7[String]): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonths(value: Vector12[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeriods(value: Vector2[String]): Self = this.set("periods", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDays(value: Vector7[String]): Self = this.set("shortDays", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortMonths(value: Vector12[String]): Self = this.set("shortMonths", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

