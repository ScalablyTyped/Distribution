package typings.timelinejs3.TL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineDate extends js.Object {
  var day: js.UndefOr[Double] = js.undefined
  /*
    * A string for presenting the date. Useful if Timeline's date formatting doesn't fit your needs.
    */
  var display_date: js.UndefOr[String] = js.undefined
  /*
    * 0-23
    */
  var hour: js.UndefOr[Double] = js.undefined
  var millisecond: js.UndefOr[Double] = js.undefined
  /*
    * 0-59
    */
  var minute: js.UndefOr[Double] = js.undefined
  /*
    * 1-12
    */
  var month: js.UndefOr[Double] = js.undefined
  /*
    * 0-59
    */
  var second: js.UndefOr[Double] = js.undefined
  /*
    * BCE years should be negative numbers.
    */
  var year: Double
}

object ITimelineDate {
  @scala.inline
  def apply(
    year: Double,
    day: Int | Double = null,
    display_date: String = null,
    hour: Int | Double = null,
    millisecond: Int | Double = null,
    minute: Int | Double = null,
    month: Int | Double = null,
    second: Int | Double = null
  ): ITimelineDate = {
    val __obj = js.Dynamic.literal(year = year.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (display_date != null) __obj.updateDynamic("display_date")(display_date.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineDate]
  }
}

