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
    day: js.UndefOr[Double] = js.undefined,
    display_date: String = null,
    hour: js.UndefOr[Double] = js.undefined,
    millisecond: js.UndefOr[Double] = js.undefined,
    minute: js.UndefOr[Double] = js.undefined,
    month: js.UndefOr[Double] = js.undefined,
    second: js.UndefOr[Double] = js.undefined
  ): ITimelineDate = {
    val __obj = js.Dynamic.literal(year = year.asInstanceOf[js.Any])
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day.get.asInstanceOf[js.Any])
    if (display_date != null) __obj.updateDynamic("display_date")(display_date.asInstanceOf[js.Any])
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(millisecond)) __obj.updateDynamic("millisecond")(millisecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(second)) __obj.updateDynamic("second")(second.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimelineDate]
  }
}

