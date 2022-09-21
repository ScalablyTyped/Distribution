package typings.webix.mod.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.mod.Date
import typings.webix.mod.EventHash
import typings.webix.mod.WebixCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait calendarConfig extends StObject {
  
  var animate: js.UndefOr[Any] = js.undefined
  
  var blockDates: js.UndefOr[WebixCallback] = js.undefined
  
  var blockTime: js.UndefOr[WebixCallback] = js.undefined
  
  var borderless: js.UndefOr[Boolean] = js.undefined
  
  var calendarHeader: js.UndefOr[String] = js.undefined
  
  var calendarTime: js.UndefOr[String] = js.undefined
  
  var calendarWeekHeader: js.UndefOr[String] = js.undefined
  
  var cellHeight: js.UndefOr[Double | String] = js.undefined
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var css: js.UndefOr[Any] = js.undefined
  
  var date: js.UndefOr[Date | String] = js.undefined
  
  var dayTemplate: js.UndefOr[WebixCallback] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var events: js.UndefOr[WebixCallback] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var headerHeight: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var icons: js.UndefOr[Any] = js.undefined
  
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
  
  var onClick: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var onContext: js.UndefOr[StringDictionary[Any]] = js.undefined
  
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
  
  inline def apply(): calendarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[calendarConfig]
  }
  
  extension [Self <: calendarConfig](x: Self) {
    
    inline def setAnimate(value: Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setBlockDates(value: WebixCallback): Self = StObject.set(x, "blockDates", value.asInstanceOf[js.Any])
    
    inline def setBlockDatesUndefined: Self = StObject.set(x, "blockDates", js.undefined)
    
    inline def setBlockTime(value: WebixCallback): Self = StObject.set(x, "blockTime", value.asInstanceOf[js.Any])
    
    inline def setBlockTimeUndefined: Self = StObject.set(x, "blockTime", js.undefined)
    
    inline def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    inline def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    inline def setCalendarHeader(value: String): Self = StObject.set(x, "calendarHeader", value.asInstanceOf[js.Any])
    
    inline def setCalendarHeaderUndefined: Self = StObject.set(x, "calendarHeader", js.undefined)
    
    inline def setCalendarTime(value: String): Self = StObject.set(x, "calendarTime", value.asInstanceOf[js.Any])
    
    inline def setCalendarTimeUndefined: Self = StObject.set(x, "calendarTime", js.undefined)
    
    inline def setCalendarWeekHeader(value: String): Self = StObject.set(x, "calendarWeekHeader", value.asInstanceOf[js.Any])
    
    inline def setCalendarWeekHeaderUndefined: Self = StObject.set(x, "calendarWeekHeader", js.undefined)
    
    inline def setCellHeight(value: Double | String): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setCss(value: Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setDate(value: Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDayTemplate(value: WebixCallback): Self = StObject.set(x, "dayTemplate", value.asInstanceOf[js.Any])
    
    inline def setDayTemplateUndefined: Self = StObject.set(x, "dayTemplate", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEvents(value: WebixCallback): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
    
    inline def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIcons(value: Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKeyPressTimeout(value: Double): Self = StObject.set(x, "keyPressTimeout", value.asInstanceOf[js.Any])
    
    inline def setKeyPressTimeoutUndefined: Self = StObject.set(x, "keyPressTimeout", js.undefined)
    
    inline def setMaxDate(value: Date | String): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinDate(value: Date | String): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
    
    inline def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    inline def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
    
    inline def setMonthHeader(value: Boolean): Self = StObject.set(x, "monthHeader", value.asInstanceOf[js.Any])
    
    inline def setMonthHeaderUndefined: Self = StObject.set(x, "monthHeader", js.undefined)
    
    inline def setMonthSelect(value: Boolean): Self = StObject.set(x, "monthSelect", value.asInstanceOf[js.Any])
    
    inline def setMonthSelectUndefined: Self = StObject.set(x, "monthSelect", js.undefined)
    
    inline def setMouseEventDelay(value: Double): Self = StObject.set(x, "mouseEventDelay", value.asInstanceOf[js.Any])
    
    inline def setMouseEventDelayUndefined: Self = StObject.set(x, "mouseEventDelay", js.undefined)
    
    inline def setMultiselect(value: Boolean | String): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    inline def setNavigation(value: Boolean): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: StringDictionary[Any]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnContext(value: StringDictionary[Any]): Self = StObject.set(x, "onContext", value.asInstanceOf[js.Any])
    
    inline def setOnContextUndefined: Self = StObject.set(x, "onContext", js.undefined)
    
    inline def setOnDblClick(value: WebixCallback): Self = StObject.set(x, "onDblClick", value.asInstanceOf[js.Any])
    
    inline def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
    
    inline def setOnMouseMove(value: WebixCallback): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    inline def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSkipEmptyWeeks(value: Boolean): Self = StObject.set(x, "skipEmptyWeeks", value.asInstanceOf[js.Any])
    
    inline def setSkipEmptyWeeksUndefined: Self = StObject.set(x, "skipEmptyWeeks", js.undefined)
    
    inline def setTimeIcon(value: String): Self = StObject.set(x, "timeIcon", value.asInstanceOf[js.Any])
    
    inline def setTimeIconUndefined: Self = StObject.set(x, "timeIcon", js.undefined)
    
    inline def setTimepicker(value: Boolean): Self = StObject.set(x, "timepicker", value.asInstanceOf[js.Any])
    
    inline def setTimepickerHeight(value: Double): Self = StObject.set(x, "timepickerHeight", value.asInstanceOf[js.Any])
    
    inline def setTimepickerHeightUndefined: Self = StObject.set(x, "timepickerHeight", js.undefined)
    
    inline def setTimepickerUndefined: Self = StObject.set(x, "timepicker", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWeekHeader(value: Boolean): Self = StObject.set(x, "weekHeader", value.asInstanceOf[js.Any])
    
    inline def setWeekHeaderUndefined: Self = StObject.set(x, "weekHeader", js.undefined)
    
    inline def setWeekNumber(value: Boolean): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    
    inline def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
