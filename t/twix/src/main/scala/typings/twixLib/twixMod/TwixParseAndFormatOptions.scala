package typings
package twixLib.twixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwixParseAndFormatOptions extends TwixFormatOptions {
  var parseStrict: js.UndefOr[scala.Boolean] = js.undefined
}

object TwixParseAndFormatOptions {
  @scala.inline
  def apply(
    allDay: js.Any = null,
    dayFormat: java.lang.String = null,
    explicitAllDay: js.UndefOr[scala.Boolean] = js.undefined,
    groupMeridiems: js.UndefOr[scala.Boolean] = js.undefined,
    hideDate: js.UndefOr[scala.Boolean] = js.undefined,
    hideTime: js.UndefOr[scala.Boolean] = js.undefined,
    hideYear: js.UndefOr[scala.Boolean] = js.undefined,
    hourFormat: java.lang.String = null,
    implicitMinutes: js.UndefOr[scala.Boolean] = js.undefined,
    implicitYear: js.UndefOr[scala.Boolean] = js.undefined,
    lastNightEndsAt: scala.Int | scala.Double = null,
    meridiemFormat: java.lang.String = null,
    minuteFormat: java.lang.String = null,
    monthFormat: java.lang.String = null,
    parseStrict: js.UndefOr[scala.Boolean] = js.undefined,
    showDate: js.UndefOr[scala.Boolean] = js.undefined,
    showDayOfWeek: js.UndefOr[scala.Boolean] = js.undefined,
    spaceBeforeMeridiem: js.UndefOr[scala.Boolean] = js.undefined,
    twentyFourHour: js.UndefOr[scala.Boolean] = js.undefined,
    weekdayFormat: java.lang.String = null,
    yearFormat: java.lang.String = null
  ): TwixParseAndFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (allDay != null) __obj.updateDynamic("allDay")(allDay)
    if (dayFormat != null) __obj.updateDynamic("dayFormat")(dayFormat)
    if (!js.isUndefined(explicitAllDay)) __obj.updateDynamic("explicitAllDay")(explicitAllDay)
    if (!js.isUndefined(groupMeridiems)) __obj.updateDynamic("groupMeridiems")(groupMeridiems)
    if (!js.isUndefined(hideDate)) __obj.updateDynamic("hideDate")(hideDate)
    if (!js.isUndefined(hideTime)) __obj.updateDynamic("hideTime")(hideTime)
    if (!js.isUndefined(hideYear)) __obj.updateDynamic("hideYear")(hideYear)
    if (hourFormat != null) __obj.updateDynamic("hourFormat")(hourFormat)
    if (!js.isUndefined(implicitMinutes)) __obj.updateDynamic("implicitMinutes")(implicitMinutes)
    if (!js.isUndefined(implicitYear)) __obj.updateDynamic("implicitYear")(implicitYear)
    if (lastNightEndsAt != null) __obj.updateDynamic("lastNightEndsAt")(lastNightEndsAt.asInstanceOf[js.Any])
    if (meridiemFormat != null) __obj.updateDynamic("meridiemFormat")(meridiemFormat)
    if (minuteFormat != null) __obj.updateDynamic("minuteFormat")(minuteFormat)
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat)
    if (!js.isUndefined(parseStrict)) __obj.updateDynamic("parseStrict")(parseStrict)
    if (!js.isUndefined(showDate)) __obj.updateDynamic("showDate")(showDate)
    if (!js.isUndefined(showDayOfWeek)) __obj.updateDynamic("showDayOfWeek")(showDayOfWeek)
    if (!js.isUndefined(spaceBeforeMeridiem)) __obj.updateDynamic("spaceBeforeMeridiem")(spaceBeforeMeridiem)
    if (!js.isUndefined(twentyFourHour)) __obj.updateDynamic("twentyFourHour")(twentyFourHour)
    if (weekdayFormat != null) __obj.updateDynamic("weekdayFormat")(weekdayFormat)
    if (yearFormat != null) __obj.updateDynamic("yearFormat")(yearFormat)
    __obj.asInstanceOf[TwixParseAndFormatOptions]
  }
}

