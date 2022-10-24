package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DateVal
import typings.wixStyleReact.anon.DynamicWidth
import typings.wixStyleReact.anon.IsDateInputFocusable
import typings.wixStyleReact.anon.ZIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDatePickerDatePickerMod {
  
  @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", JSImport.Default)
  @js.native
  open class default protected () extends DatePicker {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.defaultProps.dateStyle")
      @js.native
      def dateStyle: String = js.native
      inline def dateStyle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateStyle")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.defaultProps.disableKeyboardType")
      @js.native
      def disableKeyboardType: Boolean = js.native
      inline def disableKeyboardType_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableKeyboardType")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      inline def filterDate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("filterDate")().asInstanceOf[Boolean]
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.defaultProps.inputDataHook")
      @js.native
      def inputDataHook: String = js.native
      inline def inputDataHook_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputDataHook")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.defaultProps.popoverProps")
      @js.native
      def popoverProps: ZIndex = js.native
      inline def popoverProps_=(x: ZIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popoverProps")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.defaultProps.rtl")
      @js.native
      def rtl: Boolean = js.native
      inline def rtl_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rtl")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.defaultProps.width")
      @js.native
      def width: String = js.native
      inline def width_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.defaultProps.zIndex")
      @js.native
      def zIndex: Double = js.native
      inline def zIndex_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.autoFocus")
      @js.native
      val autoFocus: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.calendarDataHook")
      @js.native
      val calendarDataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.clearButton")
      @js.native
      val clearButton: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.customInput")
      @js.native
      val customInput: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.dateIndication")
      @js.native
      val dateIndication: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.dateStyle")
      @js.native
      val dateStyle: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.disableKeyboardType")
      @js.native
      val disableKeyboardType: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.disabled")
      @js.native
      val disabled: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.excludePastDates")
      @js.native
      val excludePastDates: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.filterDate")
      @js.native
      val filterDate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.firstDayOfWeek")
      @js.native
      val firstDayOfWeek: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.initialOpen")
      @js.native
      val initialOpen: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.inputDataHook")
      @js.native
      val inputDataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.inputProps")
      @js.native
      val inputProps: Requireable[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.leftArrowAriaLabel")
      @js.native
      val leftArrowAriaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.leftArrowAriaLabelledBy")
      @js.native
      val leftArrowAriaLabelledBy: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.locale")
      @js.native
      val locale: Requireable[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 54, starting with typings.wixStyleReact.wixStyleReactStrings.th, typings.wixStyleReact.wixStyleReactStrings.tr, typings.wixStyleReact.wixStyleReactStrings.id */ Any
          ] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.monthDropdownAriaLabel")
      @js.native
      val monthDropdownAriaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.monthDropdownAriaLabelledBy")
      @js.native
      val monthDropdownAriaLabelledBy: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.onChange")
      @js.native
      val onChange: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.onClear")
      @js.native
      val onClear: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.onClose")
      @js.native
      val onClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.onMonthChange")
      @js.native
      val onMonthChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.onValidate")
      @js.native
      val onValidate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.placeholderText")
      @js.native
      val placeholderText: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.popoverProps")
      @js.native
      val popoverProps: Requireable[InferProps[DynamicWidth]] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.readOnly")
      @js.native
      val readOnly: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.rightArrowAriaLabel")
      @js.native
      val rightArrowAriaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.rightArrowAriaLabelledBy")
      @js.native
      val rightArrowAriaLabelledBy: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.rtl")
      @js.native
      val rtl: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.shouldCloseOnSelect")
      @js.native
      val shouldCloseOnSelect: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.showMonthDropdown")
      @js.native
      val showMonthDropdown: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.showYearDropdown")
      @js.native
      val showYearDropdown: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.status")
      @js.native
      val status: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.statusMessage")
      @js.native
      val statusMessage: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.today")
      @js.native
      val today: Requireable[String | js.Date] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.validate")
      @js.native
      val validate: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.value")
      @js.native
      val value: Requireable[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.width")
      @js.native
      val width: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.yearDropdownAriaLabel")
      @js.native
      val yearDropdownAriaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.yearDropdownAriaLabelledBy")
      @js.native
      val yearDropdownAriaLabelledBy: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DatePicker/DatePicker", "default.propTypes.zIndex")
      @js.native
      val zIndex: Requireable[Double] = js.native
    }
  }
  
  @js.native
  trait DatePicker extends PureComponent[Any, Any, Any] {
    
    def _getLocale(): Any = js.native
    
    def _handleChange(value: Any, modifiers: Any): Unit = js.native
    
    def _handleInputChange(param0: DateVal): Unit = js.native
    
    def _handleKeyDown(event: Any): Unit = js.native
    
    def _renderInput(): Element = js.native
    
    def _saveNewValue(value: Any): Unit = js.native
    def _saveNewValue(value: Any, modifiers: js.Object): Unit = js.native
    
    def _transformDate(value: Any, oldValue: Any): Any = js.native
    
    def closeCalendar(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDatePicker(prevProps: Any): Unit = js.native
    
    def makeInputFocusable(): Unit = js.native
    
    def openCalendar(): Unit = js.native
    
    @JSName("state")
    var state_DatePicker: IsDateInputFocusable = js.native
  }
}
