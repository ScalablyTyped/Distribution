package typings
package vegaDashLiteLib.buildSrcDatetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeExpr extends js.Object {
  var date: js.UndefOr[java.lang.String] = js.undefined
  var day: js.UndefOr[java.lang.String] = js.undefined
  var hours: js.UndefOr[java.lang.String] = js.undefined
  var milliseconds: js.UndefOr[java.lang.String] = js.undefined
  var minutes: js.UndefOr[java.lang.String] = js.undefined
  var month: js.UndefOr[java.lang.String] = js.undefined
  var quarter: js.UndefOr[java.lang.String] = js.undefined
  var seconds: js.UndefOr[java.lang.String] = js.undefined
  var utc: js.UndefOr[scala.Boolean] = js.undefined
  var year: js.UndefOr[java.lang.String] = js.undefined
}

object DateTimeExpr {
  @scala.inline
  def apply(
    date: java.lang.String = null,
    day: java.lang.String = null,
    hours: java.lang.String = null,
    milliseconds: java.lang.String = null,
    minutes: java.lang.String = null,
    month: java.lang.String = null,
    quarter: java.lang.String = null,
    seconds: java.lang.String = null,
    utc: js.UndefOr[scala.Boolean] = js.undefined,
    year: java.lang.String = null
  ): DateTimeExpr = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (day != null) __obj.updateDynamic("day")(day)
    if (hours != null) __obj.updateDynamic("hours")(hours)
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds)
    if (minutes != null) __obj.updateDynamic("minutes")(minutes)
    if (month != null) __obj.updateDynamic("month")(month)
    if (quarter != null) __obj.updateDynamic("quarter")(quarter)
    if (seconds != null) __obj.updateDynamic("seconds")(seconds)
    if (!js.isUndefined(utc)) __obj.updateDynamic("utc")(utc)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[DateTimeExpr]
  }
}

