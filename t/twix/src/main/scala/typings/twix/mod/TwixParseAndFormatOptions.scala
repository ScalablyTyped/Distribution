package typings.twix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwixParseAndFormatOptions extends TwixFormatOptions {
  var parseStrict: js.UndefOr[Boolean] = js.undefined
}

object TwixParseAndFormatOptions {
  @scala.inline
  def apply(
    allDay: js.Any = null,
    dayFormat: String = null,
    explicitAllDay: js.UndefOr[Boolean] = js.undefined,
    groupMeridiems: js.UndefOr[Boolean] = js.undefined,
    hideDate: js.UndefOr[Boolean] = js.undefined,
    hideTime: js.UndefOr[Boolean] = js.undefined,
    hideYear: js.UndefOr[Boolean] = js.undefined,
    hourFormat: String = null,
    implicitMinutes: js.UndefOr[Boolean] = js.undefined,
    implicitYear: js.UndefOr[Boolean] = js.undefined,
    lastNightEndsAt: Int | Double = null,
    meridiemFormat: String = null,
    minuteFormat: String = null,
    monthFormat: String = null,
    parseStrict: js.UndefOr[Boolean] = js.undefined,
    showDate: js.UndefOr[Boolean] = js.undefined,
    showDayOfWeek: js.UndefOr[Boolean] = js.undefined,
    spaceBeforeMeridiem: js.UndefOr[Boolean] = js.undefined,
    twentyFourHour: js.UndefOr[Boolean] = js.undefined,
    weekdayFormat: String = null,
    yearFormat: String = null
  ): TwixParseAndFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (allDay != null) __obj.updateDynamic("allDay")(allDay.asInstanceOf[js.Any])
    if (dayFormat != null) __obj.updateDynamic("dayFormat")(dayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitAllDay)) __obj.updateDynamic("explicitAllDay")(explicitAllDay.asInstanceOf[js.Any])
    if (!js.isUndefined(groupMeridiems)) __obj.updateDynamic("groupMeridiems")(groupMeridiems.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDate)) __obj.updateDynamic("hideDate")(hideDate.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTime)) __obj.updateDynamic("hideTime")(hideTime.asInstanceOf[js.Any])
    if (!js.isUndefined(hideYear)) __obj.updateDynamic("hideYear")(hideYear.asInstanceOf[js.Any])
    if (hourFormat != null) __obj.updateDynamic("hourFormat")(hourFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(implicitMinutes)) __obj.updateDynamic("implicitMinutes")(implicitMinutes.asInstanceOf[js.Any])
    if (!js.isUndefined(implicitYear)) __obj.updateDynamic("implicitYear")(implicitYear.asInstanceOf[js.Any])
    if (lastNightEndsAt != null) __obj.updateDynamic("lastNightEndsAt")(lastNightEndsAt.asInstanceOf[js.Any])
    if (meridiemFormat != null) __obj.updateDynamic("meridiemFormat")(meridiemFormat.asInstanceOf[js.Any])
    if (minuteFormat != null) __obj.updateDynamic("minuteFormat")(minuteFormat.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(parseStrict)) __obj.updateDynamic("parseStrict")(parseStrict.asInstanceOf[js.Any])
    if (!js.isUndefined(showDate)) __obj.updateDynamic("showDate")(showDate.asInstanceOf[js.Any])
    if (!js.isUndefined(showDayOfWeek)) __obj.updateDynamic("showDayOfWeek")(showDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBeforeMeridiem)) __obj.updateDynamic("spaceBeforeMeridiem")(spaceBeforeMeridiem.asInstanceOf[js.Any])
    if (!js.isUndefined(twentyFourHour)) __obj.updateDynamic("twentyFourHour")(twentyFourHour.asInstanceOf[js.Any])
    if (weekdayFormat != null) __obj.updateDynamic("weekdayFormat")(weekdayFormat.asInstanceOf[js.Any])
    if (yearFormat != null) __obj.updateDynamic("yearFormat")(yearFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwixParseAndFormatOptions]
  }
}

