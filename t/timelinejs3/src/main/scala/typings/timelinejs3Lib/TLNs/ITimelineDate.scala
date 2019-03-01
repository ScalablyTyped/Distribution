package typings
package timelinejs3Lib.TLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimelineDate extends js.Object {
  var day: js.UndefOr[scala.Double] = js.undefined
  /*
    * A string for presenting the date. Useful if Timeline's date formatting doesn't fit your needs.
    */
  var display_date: js.UndefOr[java.lang.String] = js.undefined
  /*
    * 0-23
    */
  var hour: js.UndefOr[scala.Double] = js.undefined
  var millisecond: js.UndefOr[scala.Double] = js.undefined
  /*
    * 0-59
    */
  var minute: js.UndefOr[scala.Double] = js.undefined
  /*
    * 1-12
    */
  var month: js.UndefOr[scala.Double] = js.undefined
  /*
    * 0-59
    */
  var second: js.UndefOr[scala.Double] = js.undefined
  /*
    * BCE years should be negative numbers.
    */
  var year: scala.Double
}

object ITimelineDate {
  @scala.inline
  def apply(
    year: scala.Double,
    day: scala.Int | scala.Double = null,
    display_date: java.lang.String = null,
    hour: scala.Int | scala.Double = null,
    millisecond: scala.Int | scala.Double = null,
    minute: scala.Int | scala.Double = null,
    month: scala.Int | scala.Double = null,
    second: scala.Int | scala.Double = null
  ): ITimelineDate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("year")(year)
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (display_date != null) __obj.updateDynamic("display_date")(display_date)
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (millisecond != null) __obj.updateDynamic("millisecond")(millisecond.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineDate]
  }
}

