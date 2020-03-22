package typings.vue2Datepicker

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirstDayOfWeek extends js.Object {
  var firstDayOfWeek: Double
  var firstWeekContainsDate: Double
  var meridiemParse: RegExp
  var months: js.Array[String]
  var monthsShort: js.Array[String]
  var weekdays: js.Array[String]
  var weekdaysMin: js.Array[String]
  var weekdaysShort: js.Array[String]
  def isPM(input: String): Boolean
  def meridiem(h: Double, _underscore: Double, isLowercase: Boolean): Boolean
}

object AnonFirstDayOfWeek {
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
  ): AnonFirstDayOfWeek = {
    val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekContainsDate = firstWeekContainsDate.asInstanceOf[js.Any], isPM = js.Any.fromFunction1(isPM), meridiem = js.Any.fromFunction3(meridiem), meridiemParse = meridiemParse.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysMin = weekdaysMin.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFirstDayOfWeek]
  }
}

