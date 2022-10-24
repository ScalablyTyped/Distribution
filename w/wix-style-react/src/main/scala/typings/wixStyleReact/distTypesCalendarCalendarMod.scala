package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.FormatDay
import typings.wixStyleReact.anon.Month
import typings.wixStyleReact.anon.To
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarCalendarMod {
  
  @JSImport("wix-style-react/dist/types/Calendar/Calendar", JSImport.Default)
  @js.native
  open class default protected () extends Calendar {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Calendar/Calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def areValuesEqual(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")().asInstanceOf[Boolean]
    inline def areValuesEqual(value1: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def areValuesEqual(value1: js.Object, value2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def areValuesEqual(value1: Unit, value2: js.Object): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areValuesEqual")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.defaultProps.autoFocus")
      @js.native
      def autoFocus: Boolean = js.native
      inline def autoFocus_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.defaultProps.className")
      @js.native
      def className: String = js.native
      inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      inline def dateIndication(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("dateIndication")().asInstanceOf[Null]
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.defaultProps.excludePastDates")
      @js.native
      def excludePastDates: Boolean = js.native
      inline def excludePastDates_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludePastDates")(x.asInstanceOf[js.Any])
      
      inline def filterDate(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("filterDate")().asInstanceOf[Boolean]
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.defaultProps.numOfMonths")
      @js.native
      def numOfMonths: Double = js.native
      inline def numOfMonths_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numOfMonths")(x.asInstanceOf[js.Any])
      
      inline def onClose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClose")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.defaultProps.selectionMode")
      @js.native
      def selectionMode: String = js.native
      inline def selectionMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.defaultProps.shouldCloseOnSelect")
      @js.native
      def shouldCloseOnSelect: Boolean = js.native
      inline def shouldCloseOnSelect_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldCloseOnSelect")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.defaultProps.showMonthDropdown")
      @js.native
      def showMonthDropdown: Boolean = js.native
      inline def showMonthDropdown_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showMonthDropdown")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.defaultProps.showYearDropdown")
      @js.native
      def showYearDropdown: Boolean = js.native
      inline def showYearDropdown_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showYearDropdown")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.getUpdatedMonth")
    @js.native
    def getUpdatedMonth: js.Function3[/* nextPropsValue */ Any, /* numOfMonths */ Any, /* currentMonthDate */ Any, Any] = js.native
    inline def getUpdatedMonth_=(x: js.Function3[/* nextPropsValue */ Any, /* numOfMonths */ Any, /* currentMonthDate */ Any, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getUpdatedMonth")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def isRangeValue(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRangeValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    inline def isSingleDay(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleDay")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.nextDay")
    @js.native
    def nextDay: Any = js.native
    inline def nextDay_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextDay")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.optionalParse")
    @js.native
    def optionalParse: Any = js.native
    inline def optionalParse_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("optionalParse")(x.asInstanceOf[js.Any])
    
    /** Return a value in which all string-dates are parsed into Date objects */
    /* static member */
    @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.parseValue")
    @js.native
    def parseValue: Any = js.native
    inline def parseValue_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseValue")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.prevDay")
    @js.native
    def prevDay: Any = js.native
    inline def prevDay_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prevDay")(x.asInstanceOf[js.Any])
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.autoFocus")
      @js.native
      val autoFocus: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.dateIndication")
      @js.native
      val dateIndication: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.excludePastDates")
      @js.native
      val excludePastDates: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.filterDate")
      @js.native
      val filterDate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.firstDayOfWeek")
      @js.native
      val firstDayOfWeek: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.leftArrowAriaLabel")
      @js.native
      val leftArrowAriaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.leftArrowAriaLabelledBy")
      @js.native
      val leftArrowAriaLabelledBy: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.locale")
      @js.native
      val locale: Requireable[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 54, starting with typings.wixStyleReact.wixStyleReactStrings.th, typings.wixStyleReact.wixStyleReactStrings.tr, typings.wixStyleReact.wixStyleReactStrings.id */ Any
          ] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.monthDropdownAriaLabel")
      @js.native
      val monthDropdownAriaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.monthDropdownAriaLabelledBy")
      @js.native
      val monthDropdownAriaLabelledBy: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.numOfMonths")
      @js.native
      val numOfMonths: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.onChange")
      @js.native
      val onChange: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.onClose")
      @js.native
      val onClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.onMonthChange")
      @js.native
      val onMonthChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.rightArrowAriaLabel")
      @js.native
      val rightArrowAriaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.rightArrowAriaLabelledBy")
      @js.native
      val rightArrowAriaLabelledBy: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.rtl")
      @js.native
      val rtl: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.selectionMode")
      @js.native
      val selectionMode: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.shouldCloseOnSelect")
      @js.native
      val shouldCloseOnSelect: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.showMonthDropdown")
      @js.native
      val showMonthDropdown: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.showYearDropdown")
      @js.native
      val showYearDropdown: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.size")
      @js.native
      val size: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.today")
      @js.native
      val today: Requireable[js.Date] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.value")
      @js.native
      val value: Requireable[js.Date | InferProps[To]] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.yearDropdownAriaLabel")
      @js.native
      val yearDropdownAriaLabel: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Calendar/Calendar", "default.propTypes.yearDropdownAriaLabelledBy")
      @js.native
      val yearDropdownAriaLabelledBy: Requireable[String] = js.native
    }
  }
  
  @js.native
  trait Calendar extends PureComponent[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCalendar(nextProps: Any): Unit = js.native
    
    def _createCaptionElement(): Element = js.native
    
    def _getLocale(): Any = js.native
    
    def _getLocaleUtilsFactory(locale: Any, firstDayOfWeek: Any): FormatDay = js.native
    
    def _setMonth(month: Any): Unit = js.native
    
    @JSName("state")
    var state_Calendar: Month = js.native
  }
}
