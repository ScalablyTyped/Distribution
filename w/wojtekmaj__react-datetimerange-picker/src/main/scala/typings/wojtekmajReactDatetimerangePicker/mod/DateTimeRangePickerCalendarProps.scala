package typings.wojtekmajReactDatetimerangePicker.mod

import typings.reactCalendar.anon.CalendarTilePropertiesact
import typings.reactCalendar.mod.CalendarTileProperties
import typings.reactCalendar.mod.CalendarType
import typings.reactCalendar.mod.ClickWeekNumberCallback
import typings.reactCalendar.mod.DateCallback
import typings.reactCalendar.mod.Detail
import typings.reactCalendar.mod.FormatterCallback
import typings.reactCalendar.mod.ViewCallback
import typings.reactCalendar.mod.ViewCallbackProperties
import typings.std.Date
import typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.end
import typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.range
import typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<react-calendar.react-calendar.CalendarProps, 'maxDetail' | 'onChange' | 'value'> */
@js.native
trait DateTimeRangePickerCalendarProps extends js.Object {
  
  var activeStartDate: js.UndefOr[Date] = js.native
  
  var allowPartialRange: js.UndefOr[Boolean] = js.native
  
  var calendarType: js.UndefOr[CalendarType] = js.native
  
  var className: js.UndefOr[String | js.Array[String]] = js.native
  
  var defaultActiveStartDate: js.UndefOr[Date] = js.native
  
  var defaultValue: js.UndefOr[Date | js.Array[Date]] = js.native
  
  var defaultView: js.UndefOr[Detail] = js.native
  
  var formatLongDate: js.UndefOr[FormatterCallback] = js.native
  
  var formatMonth: js.UndefOr[FormatterCallback] = js.native
  
  var formatMonthYear: js.UndefOr[FormatterCallback] = js.native
  
  var formatShortWeekday: js.UndefOr[FormatterCallback] = js.native
  
  var formatYear: js.UndefOr[FormatterCallback] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var maxDate: js.UndefOr[Date] = js.native
  
  var minDate: js.UndefOr[Date] = js.native
  
  var minDetail: js.UndefOr[Detail] = js.native
  
  var navigationAriaLabel: js.UndefOr[String] = js.native
  
  var navigationLabel: js.UndefOr[
    js.Function1[
      /* props */ typings.reactCalendar.anon.Date, 
      String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ]
  ] = js.native
  
  var next2AriaLabel: js.UndefOr[String] = js.native
  
  var next2Label: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
  ] = js.native
  
  var nextAriaLabel: js.UndefOr[String] = js.native
  
  var nextLabel: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
  ] = js.native
  
  var onActiveStartDateChange: js.UndefOr[ViewCallback] = js.native
  
  var onClickDay: js.UndefOr[DateCallback] = js.native
  
  var onClickDecade: js.UndefOr[DateCallback] = js.native
  
  var onClickMonth: js.UndefOr[DateCallback] = js.native
  
  var onClickWeekNumber: js.UndefOr[ClickWeekNumberCallback] = js.native
  
  var onClickYear: js.UndefOr[DateCallback] = js.native
  
  var onDrillDown: js.UndefOr[ViewCallback] = js.native
  
  var onDrillUp: js.UndefOr[ViewCallback] = js.native
  
  var onViewChange: js.UndefOr[ViewCallback] = js.native
  
  var prev2AriaLabel: js.UndefOr[String] = js.native
  
  var prev2Label: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | Null
  ] = js.native
  
  var prevAriaLabel: js.UndefOr[String] = js.native
  
  var prevLabel: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
  ] = js.native
  
  var renderChildren: js.UndefOr[
    js.Function1[
      /* props */ CalendarTileProperties, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ]
  ] = js.native
  
  var returnValue: js.UndefOr[start | end | range] = js.native
  
  var selectRange: js.UndefOr[Boolean] = js.native
  
  var showDoubleView: js.UndefOr[Boolean] = js.native
  
  var showFixedNumberOfWeeks: js.UndefOr[Boolean] = js.native
  
  var showNavigation: js.UndefOr[Boolean] = js.native
  
  var showNeighboringMonth: js.UndefOr[Boolean] = js.native
  
  var showWeekNumbers: js.UndefOr[Boolean] = js.native
  
  var tileClassName: js.UndefOr[
    String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
  ] = js.native
  
  var tileContent: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
      /* props */ CalendarTileProperties, 
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ])
  ] = js.native
  
  var tileDisabled: js.UndefOr[js.Function1[/* props */ CalendarTilePropertiesact, Boolean]] = js.native
  
  var view: js.UndefOr[Detail] = js.native
}
object DateTimeRangePickerCalendarProps {
  
  @scala.inline
  def apply(): DateTimeRangePickerCalendarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeRangePickerCalendarProps]
  }
  
  @scala.inline
  implicit class DateTimeRangePickerCalendarPropsOps[Self <: DateTimeRangePickerCalendarProps] (val x: Self) extends AnyVal {
    
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
    def setActiveStartDate(value: Date): Self = this.set("activeStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveStartDate: Self = this.set("activeStartDate", js.undefined)
    
    @scala.inline
    def setAllowPartialRange(value: Boolean): Self = this.set("allowPartialRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPartialRange: Self = this.set("allowPartialRange", js.undefined)
    
    @scala.inline
    def setCalendarType(value: CalendarType): Self = this.set("calendarType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarType: Self = this.set("calendarType", js.undefined)
    
    @scala.inline
    def setClassNameVarargs(value: String*): Self = this.set("className", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String | js.Array[String]): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDefaultActiveStartDate(value: Date): Self = this.set("defaultActiveStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultActiveStartDate: Self = this.set("defaultActiveStartDate", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: Date*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: Date | js.Array[Date]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultView(value: Detail): Self = this.set("defaultView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultView: Self = this.set("defaultView", js.undefined)
    
    @scala.inline
    def setFormatLongDate(value: (/* locale */ String, /* date */ Date) => String): Self = this.set("formatLongDate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatLongDate: Self = this.set("formatLongDate", js.undefined)
    
    @scala.inline
    def setFormatMonth(value: (/* locale */ String, /* date */ Date) => String): Self = this.set("formatMonth", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatMonth: Self = this.set("formatMonth", js.undefined)
    
    @scala.inline
    def setFormatMonthYear(value: (/* locale */ String, /* date */ Date) => String): Self = this.set("formatMonthYear", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatMonthYear: Self = this.set("formatMonthYear", js.undefined)
    
    @scala.inline
    def setFormatShortWeekday(value: (/* locale */ String, /* date */ Date) => String): Self = this.set("formatShortWeekday", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatShortWeekday: Self = this.set("formatShortWeekday", js.undefined)
    
    @scala.inline
    def setFormatYear(value: (/* locale */ String, /* date */ Date) => String): Self = this.set("formatYear", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFormatYear: Self = this.set("formatYear", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    
    @scala.inline
    def setMinDetail(value: Detail): Self = this.set("minDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDetail: Self = this.set("minDetail", js.undefined)
    
    @scala.inline
    def setNavigationAriaLabel(value: String): Self = this.set("navigationAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationAriaLabel: Self = this.set("navigationAriaLabel", js.undefined)
    
    @scala.inline
    def setNavigationLabel(
      value: /* props */ typings.reactCalendar.anon.Date => String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ): Self = this.set("navigationLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNavigationLabel: Self = this.set("navigationLabel", js.undefined)
    
    @scala.inline
    def setNext2AriaLabel(value: String): Self = this.set("next2AriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext2AriaLabel: Self = this.set("next2AriaLabel", js.undefined)
    
    @scala.inline
    def setNext2Label(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = this.set("next2Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNext2Label: Self = this.set("next2Label", js.undefined)
    
    @scala.inline
    def setNext2LabelNull: Self = this.set("next2Label", null)
    
    @scala.inline
    def setNextAriaLabel(value: String): Self = this.set("nextAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextAriaLabel: Self = this.set("nextAriaLabel", js.undefined)
    
    @scala.inline
    def setNextLabel(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = this.set("nextLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextLabel: Self = this.set("nextLabel", js.undefined)
    
    @scala.inline
    def setOnActiveStartDateChange(value: /* props */ ViewCallbackProperties => Unit): Self = this.set("onActiveStartDateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnActiveStartDateChange: Self = this.set("onActiveStartDateChange", js.undefined)
    
    @scala.inline
    def setOnClickDay(value: /* date */ Date => Unit): Self = this.set("onClickDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClickDay: Self = this.set("onClickDay", js.undefined)
    
    @scala.inline
    def setOnClickDecade(value: /* date */ Date => Unit): Self = this.set("onClickDecade", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClickDecade: Self = this.set("onClickDecade", js.undefined)
    
    @scala.inline
    def setOnClickMonth(value: /* date */ Date => Unit): Self = this.set("onClickMonth", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClickMonth: Self = this.set("onClickMonth", js.undefined)
    
    @scala.inline
    def setOnClickWeekNumber(value: (/* weekNumber */ Double, /* date */ Date) => Unit): Self = this.set("onClickWeekNumber", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnClickWeekNumber: Self = this.set("onClickWeekNumber", js.undefined)
    
    @scala.inline
    def setOnClickYear(value: /* date */ Date => Unit): Self = this.set("onClickYear", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClickYear: Self = this.set("onClickYear", js.undefined)
    
    @scala.inline
    def setOnDrillDown(value: /* props */ ViewCallbackProperties => Unit): Self = this.set("onDrillDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrillDown: Self = this.set("onDrillDown", js.undefined)
    
    @scala.inline
    def setOnDrillUp(value: /* props */ ViewCallbackProperties => Unit): Self = this.set("onDrillUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDrillUp: Self = this.set("onDrillUp", js.undefined)
    
    @scala.inline
    def setOnViewChange(value: /* props */ ViewCallbackProperties => Unit): Self = this.set("onViewChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnViewChange: Self = this.set("onViewChange", js.undefined)
    
    @scala.inline
    def setPrev2AriaLabel(value: String): Self = this.set("prev2AriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrev2AriaLabel: Self = this.set("prev2AriaLabel", js.undefined)
    
    @scala.inline
    def setPrev2Label(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = this.set("prev2Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrev2Label: Self = this.set("prev2Label", js.undefined)
    
    @scala.inline
    def setPrev2LabelNull: Self = this.set("prev2Label", null)
    
    @scala.inline
    def setPrevAriaLabel(value: String): Self = this.set("prevAriaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevAriaLabel: Self = this.set("prevAriaLabel", js.undefined)
    
    @scala.inline
    def setPrevLabel(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
    ): Self = this.set("prevLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrevLabel: Self = this.set("prevLabel", js.undefined)
    
    @scala.inline
    def setRenderChildren(
      value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ): Self = this.set("renderChildren", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderChildren: Self = this.set("renderChildren", js.undefined)
    
    @scala.inline
    def setReturnValue(value: start | end | range): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnValue: Self = this.set("returnValue", js.undefined)
    
    @scala.inline
    def setSelectRange(value: Boolean): Self = this.set("selectRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectRange: Self = this.set("selectRange", js.undefined)
    
    @scala.inline
    def setShowDoubleView(value: Boolean): Self = this.set("showDoubleView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDoubleView: Self = this.set("showDoubleView", js.undefined)
    
    @scala.inline
    def setShowFixedNumberOfWeeks(value: Boolean): Self = this.set("showFixedNumberOfWeeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFixedNumberOfWeeks: Self = this.set("showFixedNumberOfWeeks", js.undefined)
    
    @scala.inline
    def setShowNavigation(value: Boolean): Self = this.set("showNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNavigation: Self = this.set("showNavigation", js.undefined)
    
    @scala.inline
    def setShowNeighboringMonth(value: Boolean): Self = this.set("showNeighboringMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNeighboringMonth: Self = this.set("showNeighboringMonth", js.undefined)
    
    @scala.inline
    def setShowWeekNumbers(value: Boolean): Self = this.set("showWeekNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowWeekNumbers: Self = this.set("showWeekNumbers", js.undefined)
    
    @scala.inline
    def setTileClassNameVarargs(value: String*): Self = this.set("tileClassName", js.Array(value :_*))
    
    @scala.inline
    def setTileClassNameFunction1(value: /* props */ CalendarTileProperties => String | js.Array[String] | Null): Self = this.set("tileClassName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTileClassName(
      value: String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
    ): Self = this.set("tileClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileClassName: Self = this.set("tileClassName", js.undefined)
    
    @scala.inline
    def setTileContentFunction1(
      value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
    ): Self = this.set("tileContent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTileContent(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
          /* props */ CalendarTileProperties, 
          (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
        ])
    ): Self = this.set("tileContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileContent: Self = this.set("tileContent", js.undefined)
    
    @scala.inline
    def setTileDisabled(value: /* props */ CalendarTilePropertiesact => Boolean): Self = this.set("tileDisabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTileDisabled: Self = this.set("tileDisabled", js.undefined)
    
    @scala.inline
    def setView(value: Detail): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
