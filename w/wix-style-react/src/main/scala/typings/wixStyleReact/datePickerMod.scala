package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.calendarMod.CalendarProps
import typings.wixStyleReact.commonMod.PopoverCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @JSImport("wix-style-react/dist/es/src/DatePicker", JSImport.Default)
  @js.native
  class default () extends DatePicker
  
  @js.native
  trait DatePicker
    extends PureComponent[DatePickerProps, js.Object, js.Any] {
    
    def closeCalendar(): Unit = js.native
    
    def makeInputFocusable(): Unit = js.native
    
    def openCalendar(): Unit = js.native
  }
  
  trait DatePickerProps
    extends StObject
       with CalendarProps {
    
    var calendarDataHook: js.UndefOr[String] = js.undefined
    
    var customInput: js.UndefOr[ReactNode] = js.undefined
    
    var dateFormat: js.UndefOr[String | js.Function] = js.undefined
    
    var dateFormatV2: js.UndefOr[String | js.Function] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var initialOpen: js.UndefOr[Boolean] = js.undefined
    
    var inputDataHook: js.UndefOr[String] = js.undefined
    
    var inputProps: js.UndefOr[js.Object] = js.undefined
    
    var placeholderText: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[PopoverCommonProps] = js.undefined
    
    var status: js.UndefOr[DatePickerStatus] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
    
    @JSName("value")
    var value_DatePickerProps: js.UndefOr[js.Object] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object DatePickerProps {
    
    @scala.inline
    def apply(onChange: js.Function): DatePickerProps = {
      val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerProps]
    }
    
    @scala.inline
    implicit class DatePickerPropsMutableBuilder[Self <: DatePickerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalendarDataHook(value: String): Self = StObject.set(x, "calendarDataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarDataHookUndefined: Self = StObject.set(x, "calendarDataHook", js.undefined)
      
      @scala.inline
      def setCustomInput(value: ReactNode): Self = StObject.set(x, "customInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomInputUndefined: Self = StObject.set(x, "customInput", js.undefined)
      
      @scala.inline
      def setDateFormat(value: String | js.Function): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setDateFormatV2(value: String | js.Function): Self = StObject.set(x, "dateFormatV2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatV2Undefined: Self = StObject.set(x, "dateFormatV2", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInitialOpen(value: Boolean): Self = StObject.set(x, "initialOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialOpenUndefined: Self = StObject.set(x, "initialOpen", js.undefined)
      
      @scala.inline
      def setInputDataHook(value: String): Self = StObject.set(x, "inputDataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputDataHookUndefined: Self = StObject.set(x, "inputDataHook", js.undefined)
      
      @scala.inline
      def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setPlaceholderText(value: String): Self = StObject.set(x, "placeholderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderTextUndefined: Self = StObject.set(x, "placeholderText", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: PopoverCommonProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setStatus(value: DatePickerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: ReactNode): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.error
    - typings.wixStyleReact.wixStyleReactStrings.warning
    - typings.wixStyleReact.wixStyleReactStrings.loading
  */
  trait DatePickerStatus extends StObject
  object DatePickerStatus {
    
    @scala.inline
    def error: typings.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.error]
    
    @scala.inline
    def loading: typings.wixStyleReact.wixStyleReactStrings.loading = "loading".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.loading]
    
    @scala.inline
    def warning: typings.wixStyleReact.wixStyleReactStrings.warning = "warning".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.warning]
  }
}
