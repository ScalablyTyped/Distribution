package typings.vue2Datepicker.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstDayOfWeek extends js.Object {
  var firstDayOfWeek: Double = js.native
  var firstWeekContainsDate: Double = js.native
  var meridiemParse: RegExp = js.native
  var months: js.Array[String] = js.native
  var monthsShort: js.Array[String] = js.native
  var weekdays: js.Array[String] = js.native
  var weekdaysMin: js.Array[String] = js.native
  var weekdaysShort: js.Array[String] = js.native
  def isPM(input: String): Boolean = js.native
  def meridiem(h: Double, _underscore: Double, isLowercase: Boolean): Boolean = js.native
}

object FirstDayOfWeek {
  @scala.inline
  def apply(
    firstDayOfWeek: Double,
    firstWeekContainsDate: Double,
    isPM: String => Boolean,
    meridiem: (Double, Double, Boolean) => Boolean,
    meridiemParse: RegExp,
    months: js.Array[String],
    monthsShort: js.Array[String],
    weekdays: js.Array[String],
    weekdaysMin: js.Array[String],
    weekdaysShort: js.Array[String]
  ): FirstDayOfWeek = {
    val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekContainsDate = firstWeekContainsDate.asInstanceOf[js.Any], isPM = js.Any.fromFunction1(isPM), meridiem = js.Any.fromFunction3(meridiem), meridiemParse = meridiemParse.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysMin = weekdaysMin.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDayOfWeek]
  }
  @scala.inline
  implicit class FirstDayOfWeekOps[Self <: FirstDayOfWeek] (val x: Self) extends AnyVal {
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
    def setFirstDayOfWeek(value: Double): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstWeekContainsDate(value: Double): Self = this.set("firstWeekContainsDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPM(value: String => Boolean): Self = this.set("isPM", js.Any.fromFunction1(value))
    @scala.inline
    def setMeridiem(value: (Double, Double, Boolean) => Boolean): Self = this.set("meridiem", js.Any.fromFunction3(value))
    @scala.inline
    def setMeridiemParse(value: RegExp): Self = this.set("meridiemParse", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthsShortVarargs(value: String*): Self = this.set("monthsShort", js.Array(value :_*))
    @scala.inline
    def setMonthsShort(value: js.Array[String]): Self = this.set("monthsShort", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdaysVarargs(value: String*): Self = this.set("weekdays", js.Array(value :_*))
    @scala.inline
    def setWeekdays(value: js.Array[String]): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdaysMinVarargs(value: String*): Self = this.set("weekdaysMin", js.Array(value :_*))
    @scala.inline
    def setWeekdaysMin(value: js.Array[String]): Self = this.set("weekdaysMin", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekdaysShortVarargs(value: String*): Self = this.set("weekdaysShort", js.Array(value :_*))
    @scala.inline
    def setWeekdaysShort(value: js.Array[String]): Self = this.set("weekdaysShort", value.asInstanceOf[js.Any])
  }
  
}

