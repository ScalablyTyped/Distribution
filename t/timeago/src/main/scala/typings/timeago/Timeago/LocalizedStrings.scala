package typings.timeago.Timeago

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedStrings extends js.Object {
  var day: String | DynamicMessage = js.native
  var days: String | DynamicMessage = js.native
  var hour: String | DynamicMessage = js.native
  var hours: String | DynamicMessage = js.native
  var inPast: String = js.native
  var minute: String | DynamicMessage = js.native
  var minutes: String | DynamicMessage = js.native
  var month: String | DynamicMessage = js.native
  var months: String | DynamicMessage = js.native
  var numbers: js.Array[String] = js.native
  var prefixAgo: String | Null = js.native
  var prefixFromNow: String | Null = js.native
  var seconds: String | DynamicMessage = js.native
  var suffixAgo: String | Null = js.native
  var suffixFromNow: String | Null = js.native
  var wordSeparator: String = js.native
  var year: String | DynamicMessage = js.native
  var years: String | DynamicMessage = js.native
}

object LocalizedStrings {
  @scala.inline
  def apply(
    day: String | DynamicMessage,
    days: String | DynamicMessage,
    hour: String | DynamicMessage,
    hours: String | DynamicMessage,
    inPast: String,
    minute: String | DynamicMessage,
    minutes: String | DynamicMessage,
    month: String | DynamicMessage,
    months: String | DynamicMessage,
    numbers: js.Array[String],
    seconds: String | DynamicMessage,
    wordSeparator: String,
    year: String | DynamicMessage,
    years: String | DynamicMessage
  ): LocalizedStrings = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], inPast = inPast.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], wordSeparator = wordSeparator.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedStrings]
  }
  @scala.inline
  implicit class LocalizedStringsOps[Self <: LocalizedStrings] (val x: Self) extends AnyVal {
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
    def setDayFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = this.set("day", js.Any.fromFunction2(value))
    @scala.inline
    def setDay(value: String | DynamicMessage): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def setDaysFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = this.set("days", js.Any.fromFunction2(value))
    @scala.inline
    def setDays(value: String | DynamicMessage): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def setHourFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = this.set("hour", js.Any.fromFunction2(value))
    @scala.inline
    def setHour(value: String | DynamicMessage): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoursFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = this.set("hours", js.Any.fromFunction2(value))
    @scala.inline
    def setHours(value: String | DynamicMessage): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def setInPast(value: String): Self = this.set("inPast", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinuteFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = this.set("minute", js.Any.fromFunction2(value))
    @scala.inline
    def setMinute(value: String | DynamicMessage): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinutesFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = this.set("minutes", js.Any.fromFunction2(value))
    @scala.inline
    def setMinutes(value: String | DynamicMessage): Self = this.set("minutes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = this.set("month", js.Any.fromFunction2(value))
    @scala.inline
    def setMonth(value: String | DynamicMessage): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthsFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = this.set("months", js.Any.fromFunction2(value))
    @scala.inline
    def setMonths(value: String | DynamicMessage): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumbersVarargs(value: String*): Self = this.set("numbers", js.Array(value :_*))
    @scala.inline
    def setNumbers(value: js.Array[String]): Self = this.set("numbers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondsFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = this.set("seconds", js.Any.fromFunction2(value))
    @scala.inline
    def setSeconds(value: String | DynamicMessage): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordSeparator(value: String): Self = this.set("wordSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = this.set("year", js.Any.fromFunction2(value))
    @scala.inline
    def setYear(value: String | DynamicMessage): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearsFunction2(value: (/* n */ Double, /* distanceMillis */ Double) => String): Self = this.set("years", js.Any.fromFunction2(value))
    @scala.inline
    def setYears(value: String | DynamicMessage): Self = this.set("years", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixAgo(value: String): Self = this.set("prefixAgo", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixAgoNull: Self = this.set("prefixAgo", null)
    @scala.inline
    def setPrefixFromNow(value: String): Self = this.set("prefixFromNow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixFromNowNull: Self = this.set("prefixFromNow", null)
    @scala.inline
    def setSuffixAgo(value: String): Self = this.set("suffixAgo", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffixAgoNull: Self = this.set("suffixAgo", null)
    @scala.inline
    def setSuffixFromNow(value: String): Self = this.set("suffixFromNow", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuffixFromNowNull: Self = this.set("suffixFromNow", null)
  }
  
}

