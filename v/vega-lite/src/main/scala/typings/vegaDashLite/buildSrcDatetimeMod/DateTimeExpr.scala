package typings.vegaDashLite.buildSrcDatetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeExpr extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var day: js.UndefOr[String] = js.undefined
  var hours: js.UndefOr[String] = js.undefined
  var milliseconds: js.UndefOr[String] = js.undefined
  var minutes: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
  var quarter: js.UndefOr[String] = js.undefined
  var seconds: js.UndefOr[String] = js.undefined
  var utc: js.UndefOr[Boolean] = js.undefined
  var year: js.UndefOr[String] = js.undefined
}

object DateTimeExpr {
  @scala.inline
  def apply(
    date: String = null,
    day: String = null,
    hours: String = null,
    milliseconds: String = null,
    minutes: String = null,
    month: String = null,
    quarter: String = null,
    seconds: String = null,
    utc: js.UndefOr[Boolean] = js.undefined,
    year: String = null
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

