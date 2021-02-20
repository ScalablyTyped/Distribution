package typings.wojtekmajReactDatetimerangePicker

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
import typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.hour
import typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.minute
import typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.range
import typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.second
import typings.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wojtekmaj/react-datetimerange-picker", JSImport.Default)
  @js.native
  def default(props: DateTimeRangePickerProps[DateTimeRangePickerValue]): js.Any = js.native
  
  /* Inlined std.Omit<react-calendar.react-calendar.CalendarProps, 'maxDetail' | 'onChange' | 'value'> */
  @js.native
  trait DateTimeRangePickerCalendarProps extends StObject {
    
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
    implicit class DateTimeRangePickerCalendarPropsMutableBuilder[Self <: DateTimeRangePickerCalendarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStartDate(value: Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStartDateUndefined: Self = StObject.set(x, "activeStartDate", js.undefined)
      
      @scala.inline
      def setAllowPartialRange(value: Boolean): Self = StObject.set(x, "allowPartialRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowPartialRangeUndefined: Self = StObject.set(x, "allowPartialRange", js.undefined)
      
      @scala.inline
      def setCalendarType(value: CalendarType): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarTypeUndefined: Self = StObject.set(x, "calendarType", js.undefined)
      
      @scala.inline
      def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value :_*))
      
      @scala.inline
      def setDefaultActiveStartDate(value: Date): Self = StObject.set(x, "defaultActiveStartDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveStartDateUndefined: Self = StObject.set(x, "defaultActiveStartDate", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Date | js.Array[Date]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: Date*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDefaultView(value: Detail): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultViewUndefined: Self = StObject.set(x, "defaultView", js.undefined)
      
      @scala.inline
      def setFormatLongDate(value: (/* locale */ String, /* date */ Date) => String): Self = StObject.set(x, "formatLongDate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatLongDateUndefined: Self = StObject.set(x, "formatLongDate", js.undefined)
      
      @scala.inline
      def setFormatMonth(value: (/* locale */ String, /* date */ Date) => String): Self = StObject.set(x, "formatMonth", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatMonthUndefined: Self = StObject.set(x, "formatMonth", js.undefined)
      
      @scala.inline
      def setFormatMonthYear(value: (/* locale */ String, /* date */ Date) => String): Self = StObject.set(x, "formatMonthYear", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatMonthYearUndefined: Self = StObject.set(x, "formatMonthYear", js.undefined)
      
      @scala.inline
      def setFormatShortWeekday(value: (/* locale */ String, /* date */ Date) => String): Self = StObject.set(x, "formatShortWeekday", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatShortWeekdayUndefined: Self = StObject.set(x, "formatShortWeekday", js.undefined)
      
      @scala.inline
      def setFormatYear(value: (/* locale */ String, /* date */ Date) => String): Self = StObject.set(x, "formatYear", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatYearUndefined: Self = StObject.set(x, "formatYear", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      @scala.inline
      def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      @scala.inline
      def setMinDetail(value: Detail): Self = StObject.set(x, "minDetail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDetailUndefined: Self = StObject.set(x, "minDetail", js.undefined)
      
      @scala.inline
      def setNavigationAriaLabel(value: String): Self = StObject.set(x, "navigationAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavigationAriaLabelUndefined: Self = StObject.set(x, "navigationAriaLabel", js.undefined)
      
      @scala.inline
      def setNavigationLabel(
        value: /* props */ typings.reactCalendar.anon.Date => String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
      ): Self = StObject.set(x, "navigationLabel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNavigationLabelUndefined: Self = StObject.set(x, "navigationLabel", js.undefined)
      
      @scala.inline
      def setNext2AriaLabel(value: String): Self = StObject.set(x, "next2AriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext2AriaLabelUndefined: Self = StObject.set(x, "next2AriaLabel", js.undefined)
      
      @scala.inline
      def setNext2Label(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "next2Label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext2LabelNull: Self = StObject.set(x, "next2Label", null)
      
      @scala.inline
      def setNext2LabelUndefined: Self = StObject.set(x, "next2Label", js.undefined)
      
      @scala.inline
      def setNextAriaLabel(value: String): Self = StObject.set(x, "nextAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextAriaLabelUndefined: Self = StObject.set(x, "nextAriaLabel", js.undefined)
      
      @scala.inline
      def setNextLabel(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      @scala.inline
      def setOnActiveStartDateChange(value: /* props */ ViewCallbackProperties => Unit): Self = StObject.set(x, "onActiveStartDateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActiveStartDateChangeUndefined: Self = StObject.set(x, "onActiveStartDateChange", js.undefined)
      
      @scala.inline
      def setOnClickDay(value: /* date */ Date => Unit): Self = StObject.set(x, "onClickDay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickDayUndefined: Self = StObject.set(x, "onClickDay", js.undefined)
      
      @scala.inline
      def setOnClickDecade(value: /* date */ Date => Unit): Self = StObject.set(x, "onClickDecade", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickDecadeUndefined: Self = StObject.set(x, "onClickDecade", js.undefined)
      
      @scala.inline
      def setOnClickMonth(value: /* date */ Date => Unit): Self = StObject.set(x, "onClickMonth", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickMonthUndefined: Self = StObject.set(x, "onClickMonth", js.undefined)
      
      @scala.inline
      def setOnClickWeekNumber(value: (/* weekNumber */ Double, /* date */ Date) => Unit): Self = StObject.set(x, "onClickWeekNumber", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickWeekNumberUndefined: Self = StObject.set(x, "onClickWeekNumber", js.undefined)
      
      @scala.inline
      def setOnClickYear(value: /* date */ Date => Unit): Self = StObject.set(x, "onClickYear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickYearUndefined: Self = StObject.set(x, "onClickYear", js.undefined)
      
      @scala.inline
      def setOnDrillDown(value: /* props */ ViewCallbackProperties => Unit): Self = StObject.set(x, "onDrillDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDrillDownUndefined: Self = StObject.set(x, "onDrillDown", js.undefined)
      
      @scala.inline
      def setOnDrillUp(value: /* props */ ViewCallbackProperties => Unit): Self = StObject.set(x, "onDrillUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDrillUpUndefined: Self = StObject.set(x, "onDrillUp", js.undefined)
      
      @scala.inline
      def setOnViewChange(value: /* props */ ViewCallbackProperties => Unit): Self = StObject.set(x, "onViewChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnViewChangeUndefined: Self = StObject.set(x, "onViewChange", js.undefined)
      
      @scala.inline
      def setPrev2AriaLabel(value: String): Self = StObject.set(x, "prev2AriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev2AriaLabelUndefined: Self = StObject.set(x, "prev2AriaLabel", js.undefined)
      
      @scala.inline
      def setPrev2Label(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "prev2Label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrev2LabelNull: Self = StObject.set(x, "prev2Label", null)
      
      @scala.inline
      def setPrev2LabelUndefined: Self = StObject.set(x, "prev2Label", js.undefined)
      
      @scala.inline
      def setPrevAriaLabel(value: String): Self = StObject.set(x, "prevAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevAriaLabelUndefined: Self = StObject.set(x, "prevAriaLabel", js.undefined)
      
      @scala.inline
      def setPrevLabel(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "prevLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevLabelUndefined: Self = StObject.set(x, "prevLabel", js.undefined)
      
      @scala.inline
      def setRenderChildren(
        value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
      ): Self = StObject.set(x, "renderChildren", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderChildrenUndefined: Self = StObject.set(x, "renderChildren", js.undefined)
      
      @scala.inline
      def setReturnValue(value: start | end | range): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      @scala.inline
      def setSelectRange(value: Boolean): Self = StObject.set(x, "selectRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectRangeUndefined: Self = StObject.set(x, "selectRange", js.undefined)
      
      @scala.inline
      def setShowDoubleView(value: Boolean): Self = StObject.set(x, "showDoubleView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDoubleViewUndefined: Self = StObject.set(x, "showDoubleView", js.undefined)
      
      @scala.inline
      def setShowFixedNumberOfWeeks(value: Boolean): Self = StObject.set(x, "showFixedNumberOfWeeks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowFixedNumberOfWeeksUndefined: Self = StObject.set(x, "showFixedNumberOfWeeks", js.undefined)
      
      @scala.inline
      def setShowNavigation(value: Boolean): Self = StObject.set(x, "showNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNavigationUndefined: Self = StObject.set(x, "showNavigation", js.undefined)
      
      @scala.inline
      def setShowNeighboringMonth(value: Boolean): Self = StObject.set(x, "showNeighboringMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNeighboringMonthUndefined: Self = StObject.set(x, "showNeighboringMonth", js.undefined)
      
      @scala.inline
      def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      @scala.inline
      def setTileClassName(
        value: String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
      ): Self = StObject.set(x, "tileClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileClassNameFunction1(value: /* props */ CalendarTileProperties => String | js.Array[String] | Null): Self = StObject.set(x, "tileClassName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTileClassNameUndefined: Self = StObject.set(x, "tileClassName", js.undefined)
      
      @scala.inline
      def setTileClassNameVarargs(value: String*): Self = StObject.set(x, "tileClassName", js.Array(value :_*))
      
      @scala.inline
      def setTileContent(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any) | (js.Function1[
              /* props */ CalendarTileProperties, 
              (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
            ])
      ): Self = StObject.set(x, "tileContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileContentFunction1(
        value: /* props */ CalendarTileProperties => (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ _) | Null
      ): Self = StObject.set(x, "tileContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTileContentUndefined: Self = StObject.set(x, "tileContent", js.undefined)
      
      @scala.inline
      def setTileDisabled(value: /* props */ CalendarTilePropertiesact => Boolean): Self = StObject.set(x, "tileDisabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTileDisabledUndefined: Self = StObject.set(x, "tileDisabled", js.undefined)
      
      @scala.inline
      def setView(value: Detail): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  @js.native
  trait DateTimeRangePickerProps[T] extends DateTimeRangePickerCalendarProps {
    
    var amPmAriaLabel: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var calendarAriaLabel: js.UndefOr[String] = js.native
    
    var calendarClassName: js.UndefOr[String | js.Array[String]] = js.native
    
    var calendarIcon: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ] = js.native
    
    var clearAriaLabel: js.UndefOr[String] = js.native
    
    var clearIcon: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ] = js.native
    
    var clockClassName: js.UndefOr[String | js.Array[String]] = js.native
    
    var closeWidgets: js.UndefOr[Boolean] = js.native
    
    var dayAriaLabel: js.UndefOr[String] = js.native
    
    var dayPlaceholder: js.UndefOr[String] = js.native
    
    var disableCalendar: js.UndefOr[Boolean] = js.native
    
    var disableClock: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var hourAriaLabel: js.UndefOr[String] = js.native
    
    var hourPlaceholder: js.UndefOr[String] = js.native
    
    var isCalendarOpen: js.UndefOr[Boolean] = js.native
    
    var isClockOpen: js.UndefOr[Boolean] = js.native
    
    var maxDetail: js.UndefOr[hour | minute | second] = js.native
    
    var minuteAriaLabel: js.UndefOr[String] = js.native
    
    var minutePlaceholder: js.UndefOr[String] = js.native
    
    var monthAriaLabel: js.UndefOr[String] = js.native
    
    var monthPlaceholder: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nativeInputAriaLabel: js.UndefOr[String] = js.native
    
    var onCalendarClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onCalendarOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* val */ T, Unit]] = js.native
    
    var onClockClose: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onClockOpen: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.native
    
    var rangeDivider: js.UndefOr[
        String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var secondAriaLabel: js.UndefOr[String] = js.native
    
    var secondPlaceholder: js.UndefOr[String] = js.native
    
    var showLeadingZeros: js.UndefOr[Boolean] = js.native
    
    var value: T = js.native
    
    var yearAriaLabel: js.UndefOr[String] = js.native
    
    var yearPlaceholder: js.UndefOr[String] = js.native
  }
  object DateTimeRangePickerProps {
    
    @scala.inline
    def apply[T](value: T): DateTimeRangePickerProps[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DateTimeRangePickerProps[T]]
    }
    
    @scala.inline
    implicit class DateTimeRangePickerPropsMutableBuilder[Self <: DateTimeRangePickerProps[_], T] (val x: Self with DateTimeRangePickerProps[T]) extends AnyVal {
      
      @scala.inline
      def setAmPmAriaLabel(value: String): Self = StObject.set(x, "amPmAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmPmAriaLabelUndefined: Self = StObject.set(x, "amPmAriaLabel", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setCalendarAriaLabel(value: String): Self = StObject.set(x, "calendarAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarAriaLabelUndefined: Self = StObject.set(x, "calendarAriaLabel", js.undefined)
      
      @scala.inline
      def setCalendarClassName(value: String | js.Array[String]): Self = StObject.set(x, "calendarClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarClassNameUndefined: Self = StObject.set(x, "calendarClassName", js.undefined)
      
      @scala.inline
      def setCalendarClassNameVarargs(value: String*): Self = StObject.set(x, "calendarClassName", js.Array(value :_*))
      
      @scala.inline
      def setCalendarIcon(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "calendarIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarIconUndefined: Self = StObject.set(x, "calendarIcon", js.undefined)
      
      @scala.inline
      def setClearAriaLabel(value: String): Self = StObject.set(x, "clearAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearAriaLabelUndefined: Self = StObject.set(x, "clearAriaLabel", js.undefined)
      
      @scala.inline
      def setClearIcon(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      @scala.inline
      def setClockClassName(value: String | js.Array[String]): Self = StObject.set(x, "clockClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClockClassNameUndefined: Self = StObject.set(x, "clockClassName", js.undefined)
      
      @scala.inline
      def setClockClassNameVarargs(value: String*): Self = StObject.set(x, "clockClassName", js.Array(value :_*))
      
      @scala.inline
      def setCloseWidgets(value: Boolean): Self = StObject.set(x, "closeWidgets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseWidgetsUndefined: Self = StObject.set(x, "closeWidgets", js.undefined)
      
      @scala.inline
      def setDayAriaLabel(value: String): Self = StObject.set(x, "dayAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayAriaLabelUndefined: Self = StObject.set(x, "dayAriaLabel", js.undefined)
      
      @scala.inline
      def setDayPlaceholder(value: String): Self = StObject.set(x, "dayPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayPlaceholderUndefined: Self = StObject.set(x, "dayPlaceholder", js.undefined)
      
      @scala.inline
      def setDisableCalendar(value: Boolean): Self = StObject.set(x, "disableCalendar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCalendarUndefined: Self = StObject.set(x, "disableCalendar", js.undefined)
      
      @scala.inline
      def setDisableClock(value: Boolean): Self = StObject.set(x, "disableClock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableClockUndefined: Self = StObject.set(x, "disableClock", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourAriaLabelUndefined: Self = StObject.set(x, "hourAriaLabel", js.undefined)
      
      @scala.inline
      def setHourPlaceholder(value: String): Self = StObject.set(x, "hourPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourPlaceholderUndefined: Self = StObject.set(x, "hourPlaceholder", js.undefined)
      
      @scala.inline
      def setIsCalendarOpen(value: Boolean): Self = StObject.set(x, "isCalendarOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCalendarOpenUndefined: Self = StObject.set(x, "isCalendarOpen", js.undefined)
      
      @scala.inline
      def setIsClockOpen(value: Boolean): Self = StObject.set(x, "isClockOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsClockOpenUndefined: Self = StObject.set(x, "isClockOpen", js.undefined)
      
      @scala.inline
      def setMaxDetail(value: hour | minute | second): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      @scala.inline
      def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinuteAriaLabelUndefined: Self = StObject.set(x, "minuteAriaLabel", js.undefined)
      
      @scala.inline
      def setMinutePlaceholder(value: String): Self = StObject.set(x, "minutePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutePlaceholderUndefined: Self = StObject.set(x, "minutePlaceholder", js.undefined)
      
      @scala.inline
      def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthAriaLabelUndefined: Self = StObject.set(x, "monthAriaLabel", js.undefined)
      
      @scala.inline
      def setMonthPlaceholder(value: String): Self = StObject.set(x, "monthPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthPlaceholderUndefined: Self = StObject.set(x, "monthPlaceholder", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNativeInputAriaLabel(value: String): Self = StObject.set(x, "nativeInputAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeInputAriaLabelUndefined: Self = StObject.set(x, "nativeInputAriaLabel", js.undefined)
      
      @scala.inline
      def setOnCalendarClose(value: () => Unit): Self = StObject.set(x, "onCalendarClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCalendarCloseUndefined: Self = StObject.set(x, "onCalendarClose", js.undefined)
      
      @scala.inline
      def setOnCalendarOpen(value: () => Unit): Self = StObject.set(x, "onCalendarOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCalendarOpenUndefined: Self = StObject.set(x, "onCalendarOpen", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* val */ T => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClockClose(value: () => Unit): Self = StObject.set(x, "onClockClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClockCloseUndefined: Self = StObject.set(x, "onClockClose", js.undefined)
      
      @scala.inline
      def setOnClockOpen(value: () => Unit): Self = StObject.set(x, "onClockOpen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClockOpenUndefined: Self = StObject.set(x, "onClockOpen", js.undefined)
      
      @scala.inline
      def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setRangeDivider(
        value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JSX.Element */ js.Any)
      ): Self = StObject.set(x, "rangeDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeDividerUndefined: Self = StObject.set(x, "rangeDivider", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setSecondAriaLabel(value: String): Self = StObject.set(x, "secondAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondAriaLabelUndefined: Self = StObject.set(x, "secondAriaLabel", js.undefined)
      
      @scala.inline
      def setSecondPlaceholder(value: String): Self = StObject.set(x, "secondPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondPlaceholderUndefined: Self = StObject.set(x, "secondPlaceholder", js.undefined)
      
      @scala.inline
      def setShowLeadingZeros(value: Boolean): Self = StObject.set(x, "showLeadingZeros", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLeadingZerosUndefined: Self = StObject.set(x, "showLeadingZeros", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearAriaLabelUndefined: Self = StObject.set(x, "yearAriaLabel", js.undefined)
      
      @scala.inline
      def setYearPlaceholder(value: String): Self = StObject.set(x, "yearPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearPlaceholderUndefined: Self = StObject.set(x, "yearPlaceholder", js.undefined)
    }
  }
  
  type DateTimeRangePickerValue = String | Date | js.Array[Date]
}
