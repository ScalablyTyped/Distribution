package typings.twix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwixFormatOptions extends js.Object {
  var allDay: js.UndefOr[js.Any] = js.undefined
  var dayFormat: js.UndefOr[String] = js.undefined
   // boolean | string
  var explicitAllDay: js.UndefOr[Boolean] = js.undefined
  var groupMeridiems: js.UndefOr[Boolean] = js.undefined
  var hideDate: js.UndefOr[Boolean] = js.undefined
  var hideTime: js.UndefOr[Boolean] = js.undefined
  var hideYear: js.UndefOr[Boolean] = js.undefined
  var hourFormat: js.UndefOr[String] = js.undefined
  var implicitMinutes: js.UndefOr[Boolean] = js.undefined
  var implicitYear: js.UndefOr[Boolean] = js.undefined
  var lastNightEndsAt: js.UndefOr[Double] = js.undefined
  var meridiemFormat: js.UndefOr[String] = js.undefined
  var minuteFormat: js.UndefOr[String] = js.undefined
  var monthFormat: js.UndefOr[String] = js.undefined
  var showDate: js.UndefOr[Boolean] = js.undefined
  var showDayOfWeek: js.UndefOr[Boolean] = js.undefined
  var spaceBeforeMeridiem: js.UndefOr[Boolean] = js.undefined
  var twentyFourHour: js.UndefOr[Boolean] = js.undefined
  var weekdayFormat: js.UndefOr[String] = js.undefined
  var yearFormat: js.UndefOr[String] = js.undefined
}

object TwixFormatOptions {
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
    lastNightEndsAt: js.UndefOr[Double] = js.undefined,
    meridiemFormat: String = null,
    minuteFormat: String = null,
    monthFormat: String = null,
    showDate: js.UndefOr[Boolean] = js.undefined,
    showDayOfWeek: js.UndefOr[Boolean] = js.undefined,
    spaceBeforeMeridiem: js.UndefOr[Boolean] = js.undefined,
    twentyFourHour: js.UndefOr[Boolean] = js.undefined,
    weekdayFormat: String = null,
    yearFormat: String = null
  ): TwixFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (allDay != null) __obj.updateDynamic("allDay")(allDay.asInstanceOf[js.Any])
    if (dayFormat != null) __obj.updateDynamic("dayFormat")(dayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitAllDay)) __obj.updateDynamic("explicitAllDay")(explicitAllDay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupMeridiems)) __obj.updateDynamic("groupMeridiems")(groupMeridiems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDate)) __obj.updateDynamic("hideDate")(hideDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideTime)) __obj.updateDynamic("hideTime")(hideTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideYear)) __obj.updateDynamic("hideYear")(hideYear.get.asInstanceOf[js.Any])
    if (hourFormat != null) __obj.updateDynamic("hourFormat")(hourFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(implicitMinutes)) __obj.updateDynamic("implicitMinutes")(implicitMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(implicitYear)) __obj.updateDynamic("implicitYear")(implicitYear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastNightEndsAt)) __obj.updateDynamic("lastNightEndsAt")(lastNightEndsAt.get.asInstanceOf[js.Any])
    if (meridiemFormat != null) __obj.updateDynamic("meridiemFormat")(meridiemFormat.asInstanceOf[js.Any])
    if (minuteFormat != null) __obj.updateDynamic("minuteFormat")(minuteFormat.asInstanceOf[js.Any])
    if (monthFormat != null) __obj.updateDynamic("monthFormat")(monthFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(showDate)) __obj.updateDynamic("showDate")(showDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showDayOfWeek)) __obj.updateDynamic("showDayOfWeek")(showDayOfWeek.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spaceBeforeMeridiem)) __obj.updateDynamic("spaceBeforeMeridiem")(spaceBeforeMeridiem.get.asInstanceOf[js.Any])
    if (!js.isUndefined(twentyFourHour)) __obj.updateDynamic("twentyFourHour")(twentyFourHour.get.asInstanceOf[js.Any])
    if (weekdayFormat != null) __obj.updateDynamic("weekdayFormat")(weekdayFormat.asInstanceOf[js.Any])
    if (yearFormat != null) __obj.updateDynamic("yearFormat")(yearFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwixFormatOptions]
  }
}

