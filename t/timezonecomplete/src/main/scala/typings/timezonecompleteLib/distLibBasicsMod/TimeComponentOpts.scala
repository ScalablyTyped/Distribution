package typings
package timezonecompleteLib.distLibBasicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeComponentOpts extends js.Object {
  /**
    * Day of month 1-31, default 1
    */
  var day: js.UndefOr[scala.Double] = js.undefined
  /**
    * Hour of day 0-23, default 0
    */
  var hour: js.UndefOr[scala.Double] = js.undefined
  /**
    * Millisecond 0-999, default 0
    */
  var milli: js.UndefOr[scala.Double] = js.undefined
  /**
    * Minute 0-59, default 0
    */
  var minute: js.UndefOr[scala.Double] = js.undefined
  /**
    * Month 1-12, default 1
    */
  var month: js.UndefOr[scala.Double] = js.undefined
  /**
    * Second 0-59, default 0
    */
  var second: js.UndefOr[scala.Double] = js.undefined
  /**
    * Year, default 1970
    */
  var year: js.UndefOr[scala.Double] = js.undefined
}

object TimeComponentOpts {
  @scala.inline
  def apply(
    day: scala.Int | scala.Double = null,
    hour: scala.Int | scala.Double = null,
    milli: scala.Int | scala.Double = null,
    minute: scala.Int | scala.Double = null,
    month: scala.Int | scala.Double = null,
    second: scala.Int | scala.Double = null,
    year: scala.Int | scala.Double = null
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

