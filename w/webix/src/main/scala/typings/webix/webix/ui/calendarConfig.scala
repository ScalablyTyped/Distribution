package typings.webix.webix.ui

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLElement
import typings.webix.webix.Date
import typings.webix.webix.EventHash
import typings.webix.webix.WebixCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait calendarConfig extends js.Object {
  
  var animate: js.UndefOr[js.Any] = js.native
  
  var blockDates: js.UndefOr[WebixCallback] = js.native
  
  var blockTime: js.UndefOr[WebixCallback] = js.native
  
  var borderless: js.UndefOr[Boolean] = js.native
  
  var calendarHeader: js.UndefOr[String] = js.native
  
  var calendarTime: js.UndefOr[String] = js.native
  
  var calendarWeekHeader: js.UndefOr[String] = js.native
  
  var cellHeight: js.UndefOr[Double | String] = js.native
  
  var container: js.UndefOr[String | HTMLElement] = js.native
  
  var css: js.UndefOr[js.Any] = js.native
  
  var date: js.UndefOr[Date | String] = js.native
  
  var dayTemplate: js.UndefOr[WebixCallback] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var events: js.UndefOr[WebixCallback] = js.native
  
  var gravity: js.UndefOr[Double] = js.native
  
  var headerHeight: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hidden: js.UndefOr[Boolean] = js.native
  
  var icons: js.UndefOr[js.Any] = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  var keyPressTimeout: js.UndefOr[Double] = js.native
  
  var maxDate: js.UndefOr[Date | String] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxTime: js.UndefOr[String] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var minDate: js.UndefOr[Date | String] = js.native
  
  var minHeight: js.UndefOr[Double] = js.native
  
  var minTime: js.UndefOr[String] = js.native
  
  var minWidth: js.UndefOr[Double] = js.native
  
  var minuteStep: js.UndefOr[Double] = js.native
  
  var monthHeader: js.UndefOr[Boolean] = js.native
  
  var monthSelect: js.UndefOr[Boolean] = js.native
  
  var mouseEventDelay: js.UndefOr[Double] = js.native
  
  var multiselect: js.UndefOr[Boolean | String] = js.native
  
  var navigation: js.UndefOr[Boolean] = js.native
  
  var on: js.UndefOr[EventHash] = js.native
  
  var onClick: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var onContext: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var onDblClick: js.UndefOr[WebixCallback] = js.native
  
  var onMouseMove: js.UndefOr[WebixCallback] = js.native
  
  var select: js.UndefOr[Boolean] = js.native
  
  var skipEmptyWeeks: js.UndefOr[Boolean] = js.native
  
  var timeIcon: js.UndefOr[String] = js.native
  
  var timepicker: js.UndefOr[Boolean] = js.native
  
  var timepickerHeight: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var view: js.UndefOr[String] = js.native
  
  var weekHeader: js.UndefOr[Boolean] = js.native
  
  var weekNumber: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object calendarConfig {
  
  @scala.inline
  def apply(): calendarConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[calendarConfig]
  }
  
  @scala.inline
  implicit class calendarConfigOps[Self <: calendarConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setBlockDates(value: /* repeated */ js.Any => js.Any): Self = this.set("blockDates", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBlockDates: Self = this.set("blockDates", js.undefined)
    
    @scala.inline
    def setBlockTime(value: /* repeated */ js.Any => js.Any): Self = this.set("blockTime", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBlockTime: Self = this.set("blockTime", js.undefined)
    
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    
    @scala.inline
    def setCalendarHeader(value: String): Self = this.set("calendarHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarHeader: Self = this.set("calendarHeader", js.undefined)
    
    @scala.inline
    def setCalendarTime(value: String): Self = this.set("calendarTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarTime: Self = this.set("calendarTime", js.undefined)
    
    @scala.inline
    def setCalendarWeekHeader(value: String): Self = this.set("calendarWeekHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarWeekHeader: Self = this.set("calendarWeekHeader", js.undefined)
    
    @scala.inline
    def setCellHeight(value: Double | String): Self = this.set("cellHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellHeight: Self = this.set("cellHeight", js.undefined)
    
    @scala.inline
    def setContainer(value: String | HTMLElement): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setDate(value: Date | String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDayTemplate(value: /* repeated */ js.Any => js.Any): Self = this.set("dayTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDayTemplate: Self = this.set("dayTemplate", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setEvents(value: /* repeated */ js.Any => js.Any): Self = this.set("events", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setGravity(value: Double): Self = this.set("gravity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGravity: Self = this.set("gravity", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: Double): Self = this.set("headerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setIcons(value: js.Any): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKeyPressTimeout(value: Double): Self = this.set("keyPressTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPressTimeout: Self = this.set("keyPressTimeout", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date | String): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxTime(value: String): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTime: Self = this.set("maxTime", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date | String): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeight: Self = this.set("minHeight", js.undefined)
    
    @scala.inline
    def setMinTime(value: String): Self = this.set("minTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTime: Self = this.set("minTime", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    
    @scala.inline
    def setMinuteStep(value: Double): Self = this.set("minuteStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinuteStep: Self = this.set("minuteStep", js.undefined)
    
    @scala.inline
    def setMonthHeader(value: Boolean): Self = this.set("monthHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthHeader: Self = this.set("monthHeader", js.undefined)
    
    @scala.inline
    def setMonthSelect(value: Boolean): Self = this.set("monthSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthSelect: Self = this.set("monthSelect", js.undefined)
    
    @scala.inline
    def setMouseEventDelay(value: Double): Self = this.set("mouseEventDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseEventDelay: Self = this.set("mouseEventDelay", js.undefined)
    
    @scala.inline
    def setMultiselect(value: Boolean | String): Self = this.set("multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiselect: Self = this.set("multiselect", js.undefined)
    
    @scala.inline
    def setNavigation(value: Boolean): Self = this.set("navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    
    @scala.inline
    def setOn(value: EventHash): Self = this.set("on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOn: Self = this.set("on", js.undefined)
    
    @scala.inline
    def setOnClick(value: StringDictionary[js.Any]): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnContext(value: StringDictionary[js.Any]): Self = this.set("onContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnContext: Self = this.set("onContext", js.undefined)
    
    @scala.inline
    def setOnDblClick(value: /* repeated */ js.Any => js.Any): Self = this.set("onDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDblClick: Self = this.set("onDblClick", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: /* repeated */ js.Any => js.Any): Self = this.set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    
    @scala.inline
    def setSelect(value: Boolean): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setSkipEmptyWeeks(value: Boolean): Self = this.set("skipEmptyWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipEmptyWeeks: Self = this.set("skipEmptyWeeks", js.undefined)
    
    @scala.inline
    def setTimeIcon(value: String): Self = this.set("timeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeIcon: Self = this.set("timeIcon", js.undefined)
    
    @scala.inline
    def setTimepicker(value: Boolean): Self = this.set("timepicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimepicker: Self = this.set("timepicker", js.undefined)
    
    @scala.inline
    def setTimepickerHeight(value: Double): Self = this.set("timepickerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimepickerHeight: Self = this.set("timepickerHeight", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setView(value: String): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setWeekHeader(value: Boolean): Self = this.set("weekHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekHeader: Self = this.set("weekHeader", js.undefined)
    
    @scala.inline
    def setWeekNumber(value: Boolean): Self = this.set("weekNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekNumber: Self = this.set("weekNumber", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
