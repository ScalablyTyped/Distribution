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
    day: js.UndefOr[Double] = js.undefined,
    hour: js.UndefOr[Double] = js.undefined,
    milli: js.UndefOr[Double] = js.undefined,
    minute: js.UndefOr[Double] = js.undefined,
    month: js.UndefOr[Double] = js.undefined,
    second: js.UndefOr[Double] = js.undefined,
    year: js.UndefOr[Double] = js.undefined
  ): TimeComponentOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(day)) __obj.updateDynamic("day")(day.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hour)) __obj.updateDynamic("hour")(hour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(milli)) __obj.updateDynamic("milli")(milli.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minute)) __obj.updateDynamic("minute")(minute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(month)) __obj.updateDynamic("month")(month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(second)) __obj.updateDynamic("second")(second.get.asInstanceOf[js.Any])
    if (!js.isUndefined(year)) __obj.updateDynamic("year")(year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeComponentOpts]
  }
}

