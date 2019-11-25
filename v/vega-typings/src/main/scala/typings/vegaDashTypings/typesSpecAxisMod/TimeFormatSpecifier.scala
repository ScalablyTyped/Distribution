package typings.vegaDashTypings.typesSpecAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeFormatSpecifier extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var day: js.UndefOr[String] = js.undefined
  var hours: js.UndefOr[String] = js.undefined
  var milliseconds: js.UndefOr[String] = js.undefined
  var minutes: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
  var quarter: js.UndefOr[String] = js.undefined
  var seconds: js.UndefOr[String] = js.undefined
  var week: js.UndefOr[String] = js.undefined
  var year: js.UndefOr[String] = js.undefined
}

object TimeFormatSpecifier {
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
    week: String = null,
    year: String = null
  ): TimeFormatSpecifier = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hours != null) __obj.updateDynamic("hours")(hours.asInstanceOf[js.Any])
    if (milliseconds != null) __obj.updateDynamic("milliseconds")(milliseconds.asInstanceOf[js.Any])
    if (minutes != null) __obj.updateDynamic("minutes")(minutes.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (quarter != null) __obj.updateDynamic("quarter")(quarter.asInstanceOf[js.Any])
    if (seconds != null) __obj.updateDynamic("seconds")(seconds.asInstanceOf[js.Any])
    if (week != null) __obj.updateDynamic("week")(week.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeFormatSpecifier]
  }
}

