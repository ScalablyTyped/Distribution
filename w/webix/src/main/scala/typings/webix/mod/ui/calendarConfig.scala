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
  def apply(): calendarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[calendarConfig]
  }
  
  @scala.inline
  implicit class calendarConfigMutableBuilder[Self <: calendarConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    @scala.inline
    def setBlockDates(value: WebixCallback): Self = StObject.set(x, "blockDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDatesUndefined: Self = StObject.set(x, "blockDates", js.undefined)
    
    @scala.inline
    def setBlockTime(value: WebixCallback): Self = StObject.set(x, "blockTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockTimeUndefined: Self = StObject.set(x, "blockTime", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = StObject.set(x, "borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderlessUndefined: Self = StObject.set(x, "borderless", js.undefined)
    
    @scala.inline
    def setCalendarHeader(value: String): Self = StObject.set(x, "calendarHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarHeaderUndefined: Self = StObject.set(x, "calendarHeader", js.undefined)
    
    @scala.inline
    def setCalendarTime(value: String): Self = StObject.set(x, "calendarTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarTimeUndefined: Self = StObject.set(x, "calendarTime", js.undefined)
    
    @scala.inline
    def setCalendarWeekHeader(value: String): Self = StObject.set(x, "calendarWeekHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarWeekHeaderUndefined: Self = StObject.set(x, "calendarWeekHeader", js.undefined)
    
    @scala.inline
    def setCellHeight(value: Double | String): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    @scala.inline
    def setDate(value: Date | String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDayTemplate(value: WebixCallback): Self = StObject.set(x, "dayTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayTemplateUndefined: Self = StObject.set(x, "dayTemplate", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEvents(value: WebixCallback): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setIcons(value: js.Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKeyPressTimeout(value: Double): Self = StObject.set(x, "keyPressTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPressTimeoutUndefined: Self = StObject.set(x, "keyPressTimeout", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date | String): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    @scala.inline
    def setMaxTime(value: String): Self = StObject.set(x, "maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeUndefined: Self = StObject.set(x, "maxTime", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date | String): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    @scala.inline
    def setMinTime(value: String): Self = StObject.set(x, "minTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTimeUndefined: Self = StObject.set(x, "minTime", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setMinuteStep(value: Double): Self = StObject.set(x, "minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteStepUndefined: Self = StObject.set(x, "minuteStep", js.undefined)
    
    @scala.inline
    def setMonthHeader(value: Boolean): Self = StObject.set(x, "monthHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthHeaderUndefined: Self = StObject.set(x, "monthHeader", js.undefined)
    
    @scala.inline
    def setMonthSelect(value: Boolean): Self = StObject.set(x, "monthSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthSelectUndefined: Self = StObject.set(x, "monthSelect", js.undefined)
    
    @scala.inline
    def setMouseEventDelay(value: Double): Self = StObject.set(x, "mouseEventDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseEventDelayUndefined: Self = StObject.set(x, "mouseEventDelay", js.undefined)
    
    @scala.inline
    def setMultiselect(value: Boolean | String): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    @scala.inline
    def setNavigation(value: Boolean): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: StringDictionary[js.Any]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnContext(value: StringDictionary[js.Any]): Self = StObject.set(x, "onContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnContextUndefined: Self = StObject.set(x, "onContext", js.undefined)
    
    @scala.inline
    def setOnDblClick(value: WebixCallback): Self = StObject.set(x, "onDblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDblClickUndefined: Self = StObject.set(x, "onDblClick", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: WebixCallback): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setSkipEmptyWeeks(value: Boolean): Self = StObject.set(x, "skipEmptyWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipEmptyWeeksUndefined: Self = StObject.set(x, "skipEmptyWeeks", js.undefined)
    
    @scala.inline
    def setTimeIcon(value: String): Self = StObject.set(x, "timeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeIconUndefined: Self = StObject.set(x, "timeIcon", js.undefined)
    
    @scala.inline
    def setTimepicker(value: Boolean): Self = StObject.set(x, "timepicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimepickerHeight(value: Double): Self = StObject.set(x, "timepickerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimepickerHeightUndefined: Self = StObject.set(x, "timepickerHeight", js.undefined)
    
    @scala.inline
    def setTimepickerUndefined: Self = StObject.set(x, "timepicker", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWeekHeader(value: Boolean): Self = StObject.set(x, "weekHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekHeaderUndefined: Self = StObject.set(x, "weekHeader", js.undefined)
    
    @scala.inline
    def setWeekNumber(value: Boolean): Self = StObject.set(x, "weekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekNumberUndefined: Self = StObject.set(x, "weekNumber", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
