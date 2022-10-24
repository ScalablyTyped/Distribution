package typings.wixStyleReact

import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import typings.wixDesignSystemsLocaleUtils.distTypesDateTimeFormatConstantsMod.SupportedWixLocales_
import typings.wixStyleReact.anon.Format
import typings.wixStyleReact.distTypesCalendarMod.dateIndicationProps
import typings.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import typings.wixStyleReact.wixStyleReactInts.`0`
import typings.wixStyleReact.wixStyleReactInts.`1`
import typings.wixStyleReact.wixStyleReactInts.`2`
import typings.wixStyleReact.wixStyleReactInts.`3`
import typings.wixStyleReact.wixStyleReactInts.`4`
import typings.wixStyleReact.wixStyleReactInts.`5`
import typings.wixStyleReact.wixStyleReactInts.`6`
import typings.wixStyleReact.wixStyleReactStrings.day
import typings.wixStyleReact.wixStyleReactStrings.large
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.range
import typings.wixStyleReact.wixStyleReactStrings.short
import typings.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDatePickerMod {
  
  @JSImport("wix-style-react/dist/types/DatePicker", JSImport.Default)
  @js.native
  open class default () extends DatePicker
  
  @js.native
  trait DatePicker
    extends PureComponent[DatePickerProps, js.Object, Any] {
    
    def closeCalendar(): Unit = js.native
    
    def makeInputFocusable(): Unit = js.native
    
    def openCalendar(): Unit = js.native
  }
  
  /* Inlined parent std.Omit<wix-style-react.wix-style-react/dist/types/Calendar.CalendarProps, 'size'> */
  trait DatePickerProps extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var calendarDataHook: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearButton: js.UndefOr[Boolean] = js.undefined
    
    var customInput: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dateIndication: js.UndefOr[FC[dateIndicationProps]] = js.undefined
    
    var dateStyle: js.UndefOr[short | medium] = js.undefined
    
    var disableKeyboardType: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var excludePastDates: js.UndefOr[Boolean] = js.undefined
    
    var filterDate: js.UndefOr[js.Function] = js.undefined
    
    var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
    
    var initialOpen: js.UndefOr[Boolean] = js.undefined
    
    var inputDataHook: js.UndefOr[String] = js.undefined
    
    var inputProps: js.UndefOr[js.Object] = js.undefined
    
    var leftArrowAriaLabel: js.UndefOr[String] = js.undefined
    
    var leftArrowAriaLabelledBy: js.UndefOr[String] = js.undefined
    
    var locale: js.UndefOr[SupportedWixLocales_] = js.undefined
    
    var monthDropdownAriaLabel: js.UndefOr[String] = js.undefined
    
    var monthDropdownAriaLabelledBy: js.UndefOr[String] = js.undefined
    
    var numOfMonths: js.UndefOr[`1` | `2`] = js.undefined
    
    var onChange: js.Function
    
    var onClear: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onClose: js.UndefOr[js.Function] = js.undefined
    
    var onMonthChange: js.UndefOr[js.Function1[/* monthStart */ js.Date, Unit]] = js.undefined
    
    var onValidate: js.UndefOr[js.Function1[/* param0 */ Format, Unit]] = js.undefined
    
    var placeholderText: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[PopoverCommonProps] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var rightArrowAriaLabel: js.UndefOr[String] = js.undefined
    
    var rightArrowAriaLabelledBy: js.UndefOr[String] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var selectionMode: js.UndefOr[day | range] = js.undefined
    
    var shouldCloseOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var showMonthDropdown: js.UndefOr[Boolean] = js.undefined
    
    var showYearDropdown: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large] = js.undefined
    
    var status: js.UndefOr[DatePickerStatus] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
    
    var today: js.UndefOr[js.Date] = js.undefined
    
    var validate: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[js.Date] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var yearDropdownAriaLabel: js.UndefOr[String] = js.undefined
    
    var yearDropdownAriaLabelledBy: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object DatePickerProps {
    
    inline def apply(onChange: js.Function): DatePickerProps = {
      val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerProps]
    }
    
    extension [Self <: DatePickerProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCalendarDataHook(value: String): Self = StObject.set(x, "calendarDataHook", value.asInstanceOf[js.Any])
      
      inline def setCalendarDataHookUndefined: Self = StObject.set(x, "calendarDataHook", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
      
      inline def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
      
      inline def setCustomInput(value: ReactNode): Self = StObject.set(x, "customInput", value.asInstanceOf[js.Any])
      
      inline def setCustomInputUndefined: Self = StObject.set(x, "customInput", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDateIndication(value: FC[dateIndicationProps]): Self = StObject.set(x, "dateIndication", value.asInstanceOf[js.Any])
      
      inline def setDateIndicationUndefined: Self = StObject.set(x, "dateIndication", js.undefined)
      
      inline def setDateStyle(value: short | medium): Self = StObject.set(x, "dateStyle", value.asInstanceOf[js.Any])
      
      inline def setDateStyleUndefined: Self = StObject.set(x, "dateStyle", js.undefined)
      
      inline def setDisableKeyboardType(value: Boolean): Self = StObject.set(x, "disableKeyboardType", value.asInstanceOf[js.Any])
      
      inline def setDisableKeyboardTypeUndefined: Self = StObject.set(x, "disableKeyboardType", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setExcludePastDates(value: Boolean): Self = StObject.set(x, "excludePastDates", value.asInstanceOf[js.Any])
      
      inline def setExcludePastDatesUndefined: Self = StObject.set(x, "excludePastDates", js.undefined)
      
      inline def setFilterDate(value: js.Function): Self = StObject.set(x, "filterDate", value.asInstanceOf[js.Any])
      
      inline def setFilterDateUndefined: Self = StObject.set(x, "filterDate", js.undefined)
      
      inline def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
      
      inline def setInitialOpen(value: Boolean): Self = StObject.set(x, "initialOpen", value.asInstanceOf[js.Any])
      
      inline def setInitialOpenUndefined: Self = StObject.set(x, "initialOpen", js.undefined)
      
      inline def setInputDataHook(value: String): Self = StObject.set(x, "inputDataHook", value.asInstanceOf[js.Any])
      
      inline def setInputDataHookUndefined: Self = StObject.set(x, "inputDataHook", js.undefined)
      
      inline def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setLeftArrowAriaLabel(value: String): Self = StObject.set(x, "leftArrowAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setLeftArrowAriaLabelUndefined: Self = StObject.set(x, "leftArrowAriaLabel", js.undefined)
      
      inline def setLeftArrowAriaLabelledBy(value: String): Self = StObject.set(x, "leftArrowAriaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setLeftArrowAriaLabelledByUndefined: Self = StObject.set(x, "leftArrowAriaLabelledBy", js.undefined)
      
      inline def setLocale(value: SupportedWixLocales_): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMonthDropdownAriaLabel(value: String): Self = StObject.set(x, "monthDropdownAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthDropdownAriaLabelUndefined: Self = StObject.set(x, "monthDropdownAriaLabel", js.undefined)
      
      inline def setMonthDropdownAriaLabelledBy(value: String): Self = StObject.set(x, "monthDropdownAriaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setMonthDropdownAriaLabelledByUndefined: Self = StObject.set(x, "monthDropdownAriaLabelledBy", js.undefined)
      
      inline def setNumOfMonths(value: `1` | `2`): Self = StObject.set(x, "numOfMonths", value.asInstanceOf[js.Any])
      
      inline def setNumOfMonthsUndefined: Self = StObject.set(x, "numOfMonths", js.undefined)
      
      inline def setOnChange(value: js.Function): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnClear(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnMonthChange(value: /* monthStart */ js.Date => Unit): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction1(value))
      
      inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
      
      inline def setOnValidate(value: /* param0 */ Format => Unit): Self = StObject.set(x, "onValidate", js.Any.fromFunction1(value))
      
      inline def setOnValidateUndefined: Self = StObject.set(x, "onValidate", js.undefined)
      
      inline def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      inline def setPopoverProps(value: PopoverCommonProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRightArrowAriaLabel(value: String): Self = StObject.set(x, "rightArrowAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setRightArrowAriaLabelUndefined: Self = StObject.set(x, "rightArrowAriaLabel", js.undefined)
      
      inline def setRightArrowAriaLabelledBy(value: String): Self = StObject.set(x, "rightArrowAriaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setRightArrowAriaLabelledByUndefined: Self = StObject.set(x, "rightArrowAriaLabelledBy", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSelectionMode(value: day | range): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      inline def setShouldCloseOnSelect(value: Boolean): Self = StObject.set(x, "shouldCloseOnSelect", value.asInstanceOf[js.Any])
      
      inline def setShouldCloseOnSelectUndefined: Self = StObject.set(x, "shouldCloseOnSelect", js.undefined)
      
      inline def setShowMonthDropdown(value: Boolean): Self = StObject.set(x, "showMonthDropdown", value.asInstanceOf[js.Any])
      
      inline def setShowMonthDropdownUndefined: Self = StObject.set(x, "showMonthDropdown", js.undefined)
      
      inline def setShowYearDropdown(value: Boolean): Self = StObject.set(x, "showYearDropdown", value.asInstanceOf[js.Any])
      
      inline def setShowYearDropdownUndefined: Self = StObject.set(x, "showYearDropdown", js.undefined)
      
      inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: DatePickerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: ReactNode): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setToday(value: js.Date): Self = StObject.set(x, "today", value.asInstanceOf[js.Any])
      
      inline def setTodayUndefined: Self = StObject.set(x, "today", js.undefined)
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setYearDropdownAriaLabel(value: String): Self = StObject.set(x, "yearDropdownAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearDropdownAriaLabelUndefined: Self = StObject.set(x, "yearDropdownAriaLabel", js.undefined)
      
      inline def setYearDropdownAriaLabelledBy(value: String): Self = StObject.set(x, "yearDropdownAriaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setYearDropdownAriaLabelledByUndefined: Self = StObject.set(x, "yearDropdownAriaLabelledBy", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.error
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.loading
  */
  trait DatePickerStatus extends StObject
  object DatePickerStatus {
    
    inline def error: typings.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.error]
    
    inline def loading: typings.wixStyleReact.wixStyleReactStrings.loading = "loading".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.loading]
    
    inline def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
  }
}
