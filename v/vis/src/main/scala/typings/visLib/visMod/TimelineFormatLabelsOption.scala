package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineFormatLabelsOption extends js.Object {
  var day: js.UndefOr[java.lang.String] = js.undefined
  var hour: js.UndefOr[java.lang.String] = js.undefined
  var millisecond: js.UndefOr[java.lang.String] = js.undefined
  var minute: js.UndefOr[java.lang.String] = js.undefined
  var month: js.UndefOr[java.lang.String] = js.undefined
  var second: js.UndefOr[java.lang.String] = js.undefined
  var week: js.UndefOr[java.lang.String] = js.undefined
  var weekday: js.UndefOr[java.lang.String] = js.undefined
  var year: js.UndefOr[java.lang.String] = js.undefined
}

object TimelineFormatLabelsOption {
  @scala.inline
  def apply(
    day: java.lang.String = null,
    hour: java.lang.String = null,
    millisecond: java.lang.String = null,
    minute: java.lang.String = null,
    month: java.lang.String = null,
    second: java.lang.String = null,
    week: java.lang.String = null,
    weekday: java.lang.String = null,
    year: java.lang.String = null
  ): TimelineFormatLabelsOption = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month)
    if (second != null) __obj.updateDynamic("second")(second)
    if (week != null) __obj.updateDynamic("week")(week)
    if (weekday != null) __obj.updateDynamic("weekday")(weekday)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[TimelineFormatLabelsOption]
  }
}

