package typings.wojtekmajReactDaterangePicker

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.FocusEvent
import typings.react.mod.ReactNode
import typings.reactCalendar.anon.ActiveStartDate
import typings.reactCalendar.anon.GoToRangeStartOnSelect
import typings.reactCalendar.mod.default
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.wojtekmajReactDaterangePicker.distCjsDateRangePickerMod.IconOrRenderFunction
import typings.wojtekmajReactDaterangePicker.distCjsSharedTypesMod.ClassName
import typings.wojtekmajReactDaterangePicker.distCjsSharedTypesMod.Detail
import typings.wojtekmajReactDaterangePicker.distCjsSharedTypesMod.LooseValue
import typings.wojtekmajReactDaterangePicker.distCjsSharedTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoFocus extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var calendarAriaLabel: js.UndefOr[String] = js.undefined
    
    var calendarClassName: js.UndefOr[ClassName] = js.undefined
    
    var calendarIcon: js.UndefOr[IconOrRenderFunction | Null] = js.undefined
    
    var className: js.UndefOr[ClassName] = js.undefined
    
    var clearAriaLabel: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[IconOrRenderFunction | Null] = js.undefined
    
    var closeCalendar: js.UndefOr[Boolean] = js.undefined
    
    var `data-testid`: js.UndefOr[String] = js.undefined
    
    var dayAriaLabel: js.UndefOr[String] = js.undefined
    
    var dayPlaceholder: js.UndefOr[String] = js.undefined
    
    var disableCalendar: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var isOpen: js.UndefOr[Boolean] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var maxDetail: js.UndefOr[Detail] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var monthAriaLabel: js.UndefOr[String] = js.undefined
    
    var monthPlaceholder: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nativeInputAriaLabel: js.UndefOr[String] = js.undefined
    
    var onCalendarClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onCalendarOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ Value, Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* event */ FocusEvent[HTMLDivElement, Element], Unit]] = js.undefined
    
    var openCalendarOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var portalContainer: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var rangeDivider: js.UndefOr[ReactNode] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var showLeadingZeros: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[LooseValue] = js.undefined
    
    var yearAriaLabel: js.UndefOr[String] = js.undefined
    
    var yearPlaceholder: js.UndefOr[String] = js.undefined
  }
  object AutoFocus {
    
    inline def apply(): AutoFocus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFocus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoFocus] (val x: Self) extends AnyVal {
      
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
      
      inline def setCloseCalendar(value: Boolean): Self = StObject.set(x, "closeCalendar", value.asInstanceOf[js.Any])
      
      inline def setCloseCalendarUndefined: Self = StObject.set(x, "closeCalendar", js.undefined)
      
      inline def `setData-testid`(value: String): Self = StObject.set(x, "data-testid", value.asInstanceOf[js.Any])
      
      inline def `setData-testidUndefined`: Self = StObject.set(x, "data-testid", js.undefined)
      
      inline def setDayAriaLabel(value: String): Self = StObject.set(x, "dayAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setDayAriaLabelUndefined: Self = StObject.set(x, "dayAriaLabel", js.undefined)
      
      inline def setDayPlaceholder(value: String): Self = StObject.set(x, "dayPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setDayPlaceholderUndefined: Self = StObject.set(x, "dayPlaceholder", js.undefined)
      
      inline def setDisableCalendar(value: Boolean): Self = StObject.set(x, "disableCalendar", value.asInstanceOf[js.Any])
      
      inline def setDisableCalendarUndefined: Self = StObject.set(x, "disableCalendar", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setIsOpenUndefined: Self = StObject.set(x, "isOpen", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxDetail(value: Detail): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      inline def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
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
      
      inline def setOnFocus(value: /* event */ FocusEvent[HTMLDivElement, Element] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOpenCalendarOnFocus(value: Boolean): Self = StObject.set(x, "openCalendarOnFocus", value.asInstanceOf[js.Any])
      
      inline def setOpenCalendarOnFocusUndefined: Self = StObject.set(x, "openCalendarOnFocus", js.undefined)
      
      inline def setPortalContainer(value: HTMLElement): Self = StObject.set(x, "portalContainer", value.asInstanceOf[js.Any])
      
      inline def setPortalContainerNull: Self = StObject.set(x, "portalContainer", null)
      
      inline def setPortalContainerUndefined: Self = StObject.set(x, "portalContainer", js.undefined)
      
      inline def setRangeDivider(value: ReactNode): Self = StObject.set(x, "rangeDivider", value.asInstanceOf[js.Any])
      
      inline def setRangeDividerUndefined: Self = StObject.set(x, "rangeDivider", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
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
}
