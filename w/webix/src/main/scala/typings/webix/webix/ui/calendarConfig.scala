package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.webix.Date
import typings.webix.webix.EventHash
import typings.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait calendarConfig extends js.Object {
  var animate: js.UndefOr[js.Any] = js.undefined
  var blockDates: js.UndefOr[WebixCallback] = js.undefined
  var blockTime: js.UndefOr[WebixCallback] = js.undefined
  var borderless: js.UndefOr[Boolean] = js.undefined
  var calendarHeader: js.UndefOr[String] = js.undefined
  var calendarTime: js.UndefOr[String] = js.undefined
  var calendarWeekHeader: js.UndefOr[String] = js.undefined
  var cellHeight: js.UndefOr[Double | String] = js.undefined
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  var css: js.UndefOr[js.Any] = js.undefined
  var date: js.UndefOr[Date | String] = js.undefined
  var dayTemplate: js.UndefOr[WebixCallback] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var events: js.UndefOr[WebixCallback] = js.undefined
  var gravity: js.UndefOr[Double] = js.undefined
  var headerHeight: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var keyPressTimeout: js.UndefOr[Double] = js.undefined
  var maxDate: js.UndefOr[Date | String] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxTime: js.UndefOr[String] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minDate: js.UndefOr[Date | String] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minTime: js.UndefOr[String] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var minuteStep: js.UndefOr[Double] = js.undefined
  var monthHeader: js.UndefOr[Boolean] = js.undefined
  var monthSelect: js.UndefOr[Boolean] = js.undefined
  var mouseEventDelay: js.UndefOr[Double] = js.undefined
  var multiselect: js.UndefOr[Boolean | String] = js.undefined
  var navigation: js.UndefOr[Boolean] = js.undefined
  var on: js.UndefOr[EventHash] = js.undefined
  var onClick: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onContext: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var onDblClick: js.UndefOr[WebixCallback] = js.undefined
  var onMouseMove: js.UndefOr[WebixCallback] = js.undefined
  var select: js.UndefOr[Boolean] = js.undefined
  var skipEmptyWeeks: js.UndefOr[Boolean] = js.undefined
  var timeIcon: js.UndefOr[String] = js.undefined
  var timepicker: js.UndefOr[Boolean] = js.undefined
  var timepickerHeight: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var view: js.UndefOr[String] = js.undefined
  var weekHeader: js.UndefOr[Boolean] = js.undefined
  var weekNumber: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object calendarConfig {
  @scala.inline
  def apply(
    animate: js.Any = null,
    blockDates: /* repeated */ js.Any => js.Any = null,
    blockTime: /* repeated */ js.Any => js.Any = null,
    borderless: js.UndefOr[Boolean] = js.undefined,
    calendarHeader: String = null,
    calendarTime: String = null,
    calendarWeekHeader: String = null,
    cellHeight: Double | String = null,
    container: String | HTMLElement = null,
    css: js.Any = null,
    date: Date | String = null,
    dayTemplate: /* repeated */ js.Any => js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    events: /* repeated */ js.Any => js.Any = null,
    gravity: js.UndefOr[Double] = js.undefined,
    headerHeight: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    icons: js.Any = null,
    id: String | Double = null,
    keyPressTimeout: js.UndefOr[Double] = js.undefined,
    maxDate: Date | String = null,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxTime: String = null,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minDate: Date | String = null,
    minHeight: js.UndefOr[Double] = js.undefined,
    minTime: String = null,
    minWidth: js.UndefOr[Double] = js.undefined,
    minuteStep: js.UndefOr[Double] = js.undefined,
    monthHeader: js.UndefOr[Boolean] = js.undefined,
    monthSelect: js.UndefOr[Boolean] = js.undefined,
    mouseEventDelay: js.UndefOr[Double] = js.undefined,
    multiselect: Boolean | String = null,
    navigation: js.UndefOr[Boolean] = js.undefined,
    on: EventHash = null,
    onClick: StringDictionary[js.Any] = null,
    onContext: StringDictionary[js.Any] = null,
    onDblClick: /* repeated */ js.Any => js.Any = null,
    onMouseMove: /* repeated */ js.Any => js.Any = null,
    select: js.UndefOr[Boolean] = js.undefined,
    skipEmptyWeeks: js.UndefOr[Boolean] = js.undefined,
    timeIcon: String = null,
    timepicker: js.UndefOr[Boolean] = js.undefined,
    timepickerHeight: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    view: String = null,
    weekHeader: js.UndefOr[Boolean] = js.undefined,
    weekNumber: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): calendarConfig = {
    val __obj = js.Dynamic.literal()
    if (animate != null) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (blockDates != null) __obj.updateDynamic("blockDates")(js.Any.fromFunction1(blockDates))
    if (blockTime != null) __obj.updateDynamic("blockTime")(js.Any.fromFunction1(blockTime))
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless.get.asInstanceOf[js.Any])
    if (calendarHeader != null) __obj.updateDynamic("calendarHeader")(calendarHeader.asInstanceOf[js.Any])
    if (calendarTime != null) __obj.updateDynamic("calendarTime")(calendarTime.asInstanceOf[js.Any])
    if (calendarWeekHeader != null) __obj.updateDynamic("calendarWeekHeader")(calendarWeekHeader.asInstanceOf[js.Any])
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (css != null) __obj.updateDynamic("css")(css.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dayTemplate != null) __obj.updateDynamic("dayTemplate")(js.Any.fromFunction1(dayTemplate))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(js.Any.fromFunction1(events))
    if (!js.isUndefined(gravity)) __obj.updateDynamic("gravity")(gravity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerHeight)) __obj.updateDynamic("headerHeight")(headerHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(keyPressTimeout)) __obj.updateDynamic("keyPressTimeout")(keyPressTimeout.get.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minuteStep)) __obj.updateDynamic("minuteStep")(minuteStep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monthHeader)) __obj.updateDynamic("monthHeader")(monthHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(monthSelect)) __obj.updateDynamic("monthSelect")(monthSelect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseEventDelay)) __obj.updateDynamic("mouseEventDelay")(mouseEventDelay.get.asInstanceOf[js.Any])
    if (multiselect != null) __obj.updateDynamic("multiselect")(multiselect.asInstanceOf[js.Any])
    if (!js.isUndefined(navigation)) __obj.updateDynamic("navigation")(navigation.get.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(on.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onContext != null) __obj.updateDynamic("onContext")(onContext.asInstanceOf[js.Any])
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipEmptyWeeks)) __obj.updateDynamic("skipEmptyWeeks")(skipEmptyWeeks.get.asInstanceOf[js.Any])
    if (timeIcon != null) __obj.updateDynamic("timeIcon")(timeIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(timepicker)) __obj.updateDynamic("timepicker")(timepicker.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timepickerHeight)) __obj.updateDynamic("timepickerHeight")(timepickerHeight.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(weekHeader)) __obj.updateDynamic("weekHeader")(weekHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(weekNumber)) __obj.updateDynamic("weekNumber")(weekNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[calendarConfig]
  }
}

