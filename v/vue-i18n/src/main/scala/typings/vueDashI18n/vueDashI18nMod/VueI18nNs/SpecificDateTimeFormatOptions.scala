package typings.vueDashI18n.vueDashI18nMod.VueI18nNs

import typings.vueDashI18n.vueDashI18nStrings.long
import typings.vueDashI18n.vueDashI18nStrings.short
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecificDateTimeFormatOptions
  extends typings.std.IntlNs.DateTimeFormatOptions {
  @JSName("day")
  var day_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
  @JSName("era")
  var era_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.undefined
  @JSName("formatMatcher")
  var formatMatcher_SpecificDateTimeFormatOptions: js.UndefOr[FormatMatcher] = js.undefined
  @JSName("hour")
  var hour_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
  @JSName("localeMatcher")
  var localeMatcher_SpecificDateTimeFormatOptions: js.UndefOr[LocaleMatcher] = js.undefined
  @JSName("minute")
  var minute_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
  @JSName("month")
  var month_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital | DateTimeHumanReadable] = js.undefined
  @JSName("second")
  var second_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
  @JSName("timeZoneName")
  var timeZoneName_SpecificDateTimeFormatOptions: js.UndefOr[long | short] = js.undefined
  @JSName("weekday")
  var weekday_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeHumanReadable] = js.undefined
  @JSName("year")
  var year_SpecificDateTimeFormatOptions: js.UndefOr[DateTimeDigital] = js.undefined
}

object SpecificDateTimeFormatOptions {
  @scala.inline
  def apply(
    day: DateTimeDigital = null,
    era: DateTimeHumanReadable = null,
    formatMatcher: FormatMatcher = null,
    hour: DateTimeDigital = null,
    hour12: js.UndefOr[Boolean] = js.undefined,
    localeMatcher: LocaleMatcher = null,
    minute: DateTimeDigital = null,
    month: DateTimeDigital | DateTimeHumanReadable = null,
    second: DateTimeDigital = null,
    timeZone: String = null,
    timeZoneName: long | short = null,
    weekday: DateTimeHumanReadable = null,
    year: DateTimeDigital = null
  ): SpecificDateTimeFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day)
    if (era != null) __obj.updateDynamic("era")(era)
    if (formatMatcher != null) __obj.updateDynamic("formatMatcher")(formatMatcher)
    if (hour != null) __obj.updateDynamic("hour")(hour)
    if (!js.isUndefined(hour12)) __obj.updateDynamic("hour12")(hour12)
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher)
    if (minute != null) __obj.updateDynamic("minute")(minute)
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    if (second != null) __obj.updateDynamic("second")(second)
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone)
    if (timeZoneName != null) __obj.updateDynamic("timeZoneName")(timeZoneName.asInstanceOf[js.Any])
    if (weekday != null) __obj.updateDynamic("weekday")(weekday)
    if (year != null) __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[SpecificDateTimeFormatOptions]
  }
}

