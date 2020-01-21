package typings.timezonecomplete.basicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeComponentOpts extends js.Object {
  /**
    * Day of month 1-31, default 1
    */
  var day: js.UndefOr[Double] = js.undefined
  /**
    * Hour of day 0-23, default 0
    */
  var hour: js.UndefOr[Double] = js.undefined
  /**
    * Millisecond 0-999, default 0
    */
  var milli: js.UndefOr[Double] = js.undefined
  /**
    * Minute 0-59, default 0
    */
  var minute: js.UndefOr[Double] = js.undefined
  /**
    * Month 1-12, default 1
    */
  var month: js.UndefOr[Double] = js.undefined
  /**
    * Second 0-59, default 0
    */
  var second: js.UndefOr[Double] = js.undefined
  /**
    * Year, default 1970
    */
  var year: js.UndefOr[Double] = js.undefined
}

object TimeComponentOpts {
  @scala.inline
  def apply(
    day: Int | Double = null,
    hour: Int | Double = null,
    milli: Int | Double = null,
    minute: Int | Double = null,
    month: Int | Double = null,
    second: Int | Double = null,
    year: Int | Double = null
  ): TimeComponentOpts = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (milli != null) __obj.updateDynamic("milli")(milli.asInstanceOf[js.Any])
    if (minute != null) __obj.updateDynamic("minute")(minute.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeComponentOpts]
  }
}

