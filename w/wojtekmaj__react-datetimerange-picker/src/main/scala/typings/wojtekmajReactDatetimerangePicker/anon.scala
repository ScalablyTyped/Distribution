package typings.wojtekmajReactDatetimerangePicker

import org.scalablytyped.runtime.Instantiable0
import typings.propTypes.mod.Requireable
import typings.react.mod.FocusEvent
import typings.react.mod.ReactNode
import typings.reactCalendar.anon.ActiveStartDate
import typings.reactCalendar.anon.GoToRangeStartOnSelect
import typings.reactCalendar.mod.default
import typings.reactClock.distCjsClockMod.ClockProps
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.NonNullable
import typings.std.Record
import typings.wojtekmajReactDatetimerangePicker.distCjsDateTimeRangePickerMod.IconOrRenderFunction
import typings.wojtekmajReactDatetimerangePicker.distCjsSharedTypesMod.ClassName
import typings.wojtekmajReactDatetimerangePicker.distCjsSharedTypesMod.Detail
import typings.wojtekmajReactDatetimerangePicker.distCjsSharedTypesMod.LooseValue
import typings.wojtekmajReactDatetimerangePicker.distCjsSharedTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AmPmAriaLabel extends StObject {
    
    var amPmAriaLabel: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var calendarAriaLabel: js.UndefOr[String] = js.undefined
    
    var calendarClassName: js.UndefOr[ClassName] = js.undefined
    
    var calendarIcon: js.UndefOr[IconOrRenderFunction | Null] = js.undefined
    
    var className: js.UndefOr[ClassName] = js.undefined
    
    var clearAriaLabel: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[IconOrRenderFunction | Null] = js.undefined
    
    var clockClassName: js.UndefOr[ClassName] = js.undefined
    
    var closeWidgets: js.UndefOr[Boolean] = js.undefined
    
    var `data-testid`: js.UndefOr[String] = js.undefined
    
    var dayAriaLabel: js.UndefOr[String] = js.undefined
    
    var dayPlaceholder: js.UndefOr[String] = js.undefined
    
    var disableCalendar: js.UndefOr[Boolean] = js.undefined
    
    var disableClock: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var hourAriaLabel: js.UndefOr[String] = js.undefined
    
    var hourPlaceholder: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isCalendarOpen: js.UndefOr[Boolean] = js.undefined
    
    var isClockOpen: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var maxDetail: js.UndefOr[Detail] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var minuteAriaLabel: js.UndefOr[String] = js.undefined
    
    var minutePlaceholder: js.UndefOr[String] = js.undefined
    
    var monthAriaLabel: js.UndefOr[String] = js.undefined
    
    var monthPlaceholder: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nativeInputAriaLabel: js.UndefOr[String] = js.undefined
    
    var onCalendarClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onCalendarOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.undefined
    
    var onClockClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClockOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLDivElement, Element], Unit]] = js.undefined
    
    var openWidgetsOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var portalContainer: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var rangeDivider: js.UndefOr[ReactNode] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var secondAriaLabel: js.UndefOr[String] = js.undefined
    
    var secondPlaceholder: js.UndefOr[String] = js.undefined
    
    var showLeadingZeros: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[LooseValue] = js.undefined
    
    var yearAriaLabel: js.UndefOr[String] = js.undefined
    
    var yearPlaceholder: js.UndefOr[String] = js.undefined
  }
  object AmPmAriaLabel {
    
    inline def apply(): AmPmAriaLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AmPmAriaLabel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AmPmAriaLabel] (val x: Self) extends AnyVal {
      
      inline def setAmPmAriaLabel(value: String): Self = StObject.set(x, "amPmAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setAmPmAriaLabelUndefined: Self = StObject.set(x, "amPmAriaLabel", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCalendarAriaLabel(value: String): Self = StObject.set(x, "calendarAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCalendarAriaLabelUndefined: Self = StObject.set(x, "calendarAriaLabel", js.undefined)
      
      inline def setCalendarClassName(value: ClassName): Self = StObject.set(x, "calendarClassName", value.asInstanceOf[js.Any])
      
      inline def setCalendarClassNameNull: Self = StObject.set(x, "calendarClassName", null)
      
      inline def setCalendarClassNameUndefined: Self = StObject.set(x, "calendarClassName", js.undefined)
      
      inline def setCalendarClassNameVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "calendarClassName", js.Array(value*))
      
      inline def setCalendarIcon(value: IconOrRenderFunction): Self = StObject.set(x, "calendarIcon", value.asInstanceOf[js.Any])
      
      inline def setCalendarIconNull: Self = StObject.set(x, "calendarIcon", null)
      
      inline def setCalendarIconUndefined: Self = StObject.set(x, "calendarIcon", js.undefined)
      
      inline def setClassName(value: ClassName): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "className", js.Array(value*))
      
      inline def setClearAriaLabel(value: String): Self = StObject.set(x, "clearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setClearAriaLabelUndefined: Self = StObject.set(x, "clearAriaLabel", js.undefined)
      
      inline def setClearIcon(value: IconOrRenderFunction): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconNull: Self = StObject.set(x, "clearIcon", null)
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setClockClassName(value: ClassName): Self = StObject.set(x, "clockClassName", value.asInstanceOf[js.Any])
      
      inline def setClockClassNameNull: Self = StObject.set(x, "clockClassName", null)
      
      inline def setClockClassNameUndefined: Self = StObject.set(x, "clockClassName", js.undefined)
      
      inline def setClockClassNameVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "clockClassName", js.Array(value*))
      
      inline def setCloseWidgets(value: Boolean): Self = StObject.set(x, "closeWidgets", value.asInstanceOf[js.Any])
      
      inline def setCloseWidgetsUndefined: Self = StObject.set(x, "closeWidgets", js.undefined)
      
      inline def `setData-testid`(value: String): Self = StObject.set(x, "data-testid", value.asInstanceOf[js.Any])
      
      inline def `setData-testidUndefined`: Self = StObject.set(x, "data-testid", js.undefined)
      
      inline def setDayAriaLabel(value: String): Self = StObject.set(x, "dayAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setDayAriaLabelUndefined: Self = StObject.set(x, "dayAriaLabel", js.undefined)
      
      inline def setDayPlaceholder(value: String): Self = StObject.set(x, "dayPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setDayPlaceholderUndefined: Self = StObject.set(x, "dayPlaceholder", js.undefined)
      
      inline def setDisableCalendar(value: Boolean): Self = StObject.set(x, "disableCalendar", value.asInstanceOf[js.Any])
      
      inline def setDisableCalendarUndefined: Self = StObject.set(x, "disableCalendar", js.undefined)
      
      inline def setDisableClock(value: Boolean): Self = StObject.set(x, "disableClock", value.asInstanceOf[js.Any])
      
      inline def setDisableClockUndefined: Self = StObject.set(x, "disableClock", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setHourAriaLabelUndefined: Self = StObject.set(x, "hourAriaLabel", js.undefined)
      
      inline def setHourPlaceholder(value: String): Self = StObject.set(x, "hourPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setHourPlaceholderUndefined: Self = StObject.set(x, "hourPlaceholder", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsCalendarOpen(value: Boolean): Self = StObject.set(x, "isCalendarOpen", value.asInstanceOf[js.Any])
      
      inline def setIsCalendarOpenUndefined: Self = StObject.set(x, "isCalendarOpen", js.undefined)
      
      inline def setIsClockOpen(value: Boolean): Self = StObject.set(x, "isClockOpen", value.asInstanceOf[js.Any])
      
      inline def setIsClockOpenUndefined: Self = StObject.set(x, "isClockOpen", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxDetail(value: Detail): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      inline def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMinuteAriaLabelUndefined: Self = StObject.set(x, "minuteAriaLabel", js.undefined)
      
      inline def setMinutePlaceholder(value: String): Self = StObject.set(x, "minutePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMinutePlaceholderUndefined: Self = StObject.set(x, "minutePlaceholder", js.undefined)
      
      inline def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthAriaLabelUndefined: Self = StObject.set(x, "monthAriaLabel", js.undefined)
      
      inline def setMonthPlaceholder(value: String): Self = StObject.set(x, "monthPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMonthPlaceholderUndefined: Self = StObject.set(x, "monthPlaceholder", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNativeInputAriaLabel(value: String): Self = StObject.set(x, "nativeInputAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNativeInputAriaLabelUndefined: Self = StObject.set(x, "nativeInputAriaLabel", js.undefined)
      
      inline def setOnCalendarClose(value: () => Unit): Self = StObject.set(x, "onCalendarClose", js.Any.fromFunction0(value))
      
      inline def setOnCalendarCloseUndefined: Self = StObject.set(x, "onCalendarClose", js.undefined)
      
      inline def setOnCalendarOpen(value: () => Unit): Self = StObject.set(x, "onCalendarOpen", js.Any.fromFunction0(value))
      
      inline def setOnCalendarOpenUndefined: Self = StObject.set(x, "onCalendarOpen", js.undefined)
      
      inline def setOnChange(value: /* value */ Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClockClose(value: () => Unit): Self = StObject.set(x, "onClockClose", js.Any.fromFunction0(value))
      
      inline def setOnClockCloseUndefined: Self = StObject.set(x, "onClockClose", js.undefined)
      
      inline def setOnClockOpen(value: () => Unit): Self = StObject.set(x, "onClockOpen", js.Any.fromFunction0(value))
      
      inline def setOnClockOpenUndefined: Self = StObject.set(x, "onClockOpen", js.undefined)
      
      inline def setOnFocus(value: /* event */ FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOpenWidgetsOnFocus(value: Boolean): Self = StObject.set(x, "openWidgetsOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenWidgetsOnFocusUndefined: Self = StObject.set(x, "openWidgetsOnFocus", js.undefined)
      
      inline def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      inline def setPortalContainerNull: Self = StObject.set(x, "portalContainer", null)
      
      inline def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      inline def setRangeDivider(value: ReactNode): Self = StObject.set(x, "rangeDivider", value.asInstanceOf[js.Any])
      
      inline def setRangeDividerUndefined: Self = StObject.set(x, "rangeDivider", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSecondAriaLabel(value: String): Self = StObject.set(x, "secondAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondAriaLabelUndefined: Self = StObject.set(x, "secondAriaLabel", js.undefined)
      
      inline def setSecondPlaceholder(value: String): Self = StObject.set(x, "secondPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSecondPlaceholderUndefined: Self = StObject.set(x, "secondPlaceholder", js.undefined)
      
      inline def setShowLeadingZeros(value: Boolean): Self = StObject.set(x, "showLeadingZeros", value.asInstanceOf[js.Any])
      
      inline def setShowLeadingZerosUndefined: Self = StObject.set(x, "showLeadingZeros", js.undefined)
      
      inline def setValue(value: LooseValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabelUndefined: Self = StObject.set(x, "yearAriaLabel", js.undefined)
      
      inline def setYearPlaceholder(value: String): Self = StObject.set(x, "yearPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setYearPlaceholderUndefined: Self = StObject.set(x, "yearPlaceholder", js.undefined)
    }
  }
  
  @js.native
  trait TypeofCalendar
    extends StObject
       with Instantiable0[default] {
    
    var defaultProps: GoToRangeStartOnSelect = js.native
    
    var propTypes: ActiveStartDate = js.native
  }
  
  @js.native
  trait TypeofClock extends StObject {
    
    def apply(param0: ClockProps): typings.react.mod.global.JSX.Element = js.native
    
    val propTypes: TypeofpropTypes = js.native
  }
  
  trait TypeofpropTypes extends StObject {
    
    var className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]
    
    var formatHour: Requireable[js.Function1[/* repeated */ Any, Any]]
    
    def hourHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    def hourHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    var hourHandWidth: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ]
    
    def hourMarksLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    var hourMarksWidth: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ]
    
    var locale: Requireable[String]
    
    def minuteHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    def minuteHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    var minuteHandWidth: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ]
    
    def minuteMarksLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    var minuteMarksWidth: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ]
    
    var renderHourMarks: Requireable[Boolean]
    
    var renderMinuteHand: Requireable[Boolean]
    
    var renderMinuteMarks: Requireable[Boolean]
    
    var renderNumbers: Requireable[Boolean]
    
    var renderSecondHand: Requireable[Boolean]
    
    def secondHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    def secondHandOppositeLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null
    
    var secondHandWidth: js.Function3[
        /* props */ Record[String, Any], 
        /* propName */ String, 
        /* componentName */ String, 
        js.Error | Null
      ]
    
    var size: Requireable[NonNullable[js.UndefOr[String | Double | Null]]]
    
    var value: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]]
  }
  object TypeofpropTypes {
    
    inline def apply(
      className: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]],
      formatHour: Requireable[js.Function1[/* repeated */ Any, Any]],
      hourHandLength: (Record[String, Any], String, String) => js.Error | Null,
      hourHandOppositeLength: (Record[String, Any], String, String) => js.Error | Null,
      hourHandWidth: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null,
      hourMarksLength: (Record[String, Any], String, String) => js.Error | Null,
      hourMarksWidth: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null,
      locale: Requireable[String],
      minuteHandLength: (Record[String, Any], String, String) => js.Error | Null,
      minuteHandOppositeLength: (Record[String, Any], String, String) => js.Error | Null,
      minuteHandWidth: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null,
      minuteMarksLength: (Record[String, Any], String, String) => js.Error | Null,
      minuteMarksWidth: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null,
      renderHourMarks: Requireable[Boolean],
      renderMinuteHand: Requireable[Boolean],
      renderMinuteMarks: Requireable[Boolean],
      renderNumbers: Requireable[Boolean],
      renderSecondHand: Requireable[Boolean],
      secondHandLength: (Record[String, Any], String, String) => js.Error | Null,
      secondHandOppositeLength: (Record[String, Any], String, String) => js.Error | Null,
      secondHandWidth: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null,
      size: Requireable[NonNullable[js.UndefOr[String | Double | Null]]],
      value: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]]
    ): TypeofpropTypes = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], formatHour = formatHour.asInstanceOf[js.Any], hourHandLength = js.Any.fromFunction3(hourHandLength), hourHandOppositeLength = js.Any.fromFunction3(hourHandOppositeLength), hourHandWidth = js.Any.fromFunction3(hourHandWidth), hourMarksLength = js.Any.fromFunction3(hourMarksLength), hourMarksWidth = js.Any.fromFunction3(hourMarksWidth), locale = locale.asInstanceOf[js.Any], minuteHandLength = js.Any.fromFunction3(minuteHandLength), minuteHandOppositeLength = js.Any.fromFunction3(minuteHandOppositeLength), minuteHandWidth = js.Any.fromFunction3(minuteHandWidth), minuteMarksLength = js.Any.fromFunction3(minuteMarksLength), minuteMarksWidth = js.Any.fromFunction3(minuteMarksWidth), renderHourMarks = renderHourMarks.asInstanceOf[js.Any], renderMinuteHand = renderMinuteHand.asInstanceOf[js.Any], renderMinuteMarks = renderMinuteMarks.asInstanceOf[js.Any], renderNumbers = renderNumbers.asInstanceOf[js.Any], renderSecondHand = renderSecondHand.asInstanceOf[js.Any], secondHandLength = js.Any.fromFunction3(secondHandLength), secondHandOppositeLength = js.Any.fromFunction3(secondHandOppositeLength), secondHandWidth = js.Any.fromFunction3(secondHandWidth), size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofpropTypes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofpropTypes] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: Requireable[NonNullable[js.UndefOr[String | (js.Array[js.UndefOr[String | Null]]) | Null]]]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setFormatHour(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "formatHour", value.asInstanceOf[js.Any])
      
      inline def setHourHandLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "hourHandLength", js.Any.fromFunction3(value))
      
      inline def setHourHandOppositeLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "hourHandOppositeLength", js.Any.fromFunction3(value))
      
      inline def setHourHandWidth(
        value: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null
      ): Self = StObject.set(x, "hourHandWidth", js.Any.fromFunction3(value))
      
      inline def setHourMarksLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "hourMarksLength", js.Any.fromFunction3(value))
      
      inline def setHourMarksWidth(
        value: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null
      ): Self = StObject.set(x, "hourMarksWidth", js.Any.fromFunction3(value))
      
      inline def setLocale(value: Requireable[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setMinuteHandLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "minuteHandLength", js.Any.fromFunction3(value))
      
      inline def setMinuteHandOppositeLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "minuteHandOppositeLength", js.Any.fromFunction3(value))
      
      inline def setMinuteHandWidth(
        value: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null
      ): Self = StObject.set(x, "minuteHandWidth", js.Any.fromFunction3(value))
      
      inline def setMinuteMarksLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "minuteMarksLength", js.Any.fromFunction3(value))
      
      inline def setMinuteMarksWidth(
        value: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null
      ): Self = StObject.set(x, "minuteMarksWidth", js.Any.fromFunction3(value))
      
      inline def setRenderHourMarks(value: Requireable[Boolean]): Self = StObject.set(x, "renderHourMarks", value.asInstanceOf[js.Any])
      
      inline def setRenderMinuteHand(value: Requireable[Boolean]): Self = StObject.set(x, "renderMinuteHand", value.asInstanceOf[js.Any])
      
      inline def setRenderMinuteMarks(value: Requireable[Boolean]): Self = StObject.set(x, "renderMinuteMarks", value.asInstanceOf[js.Any])
      
      inline def setRenderNumbers(value: Requireable[Boolean]): Self = StObject.set(x, "renderNumbers", value.asInstanceOf[js.Any])
      
      inline def setRenderSecondHand(value: Requireable[Boolean]): Self = StObject.set(x, "renderSecondHand", value.asInstanceOf[js.Any])
      
      inline def setSecondHandLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "secondHandLength", js.Any.fromFunction3(value))
      
      inline def setSecondHandOppositeLength(value: (Record[String, Any], String, String) => js.Error | Null): Self = StObject.set(x, "secondHandOppositeLength", js.Any.fromFunction3(value))
      
      inline def setSecondHandWidth(
        value: (/* props */ Record[String, Any], /* propName */ String, /* componentName */ String) => js.Error | Null
      ): Self = StObject.set(x, "secondHandWidth", js.Any.fromFunction3(value))
      
      inline def setSize(value: Requireable[NonNullable[js.UndefOr[String | Double | Null]]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Requireable[NonNullable[js.UndefOr[String | js.Date | Null]]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
