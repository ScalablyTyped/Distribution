package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.wixStyleReact.anon.FromRequireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarPanelCalendarPanelMod {
  
  @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", JSImport.Default)
  @js.native
  open class default protected () extends CalendarPanel {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.defaultProps.numOfMonths")
      @js.native
      def numOfMonths: Double = js.native
      inline def numOfMonths_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numOfMonths")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Specifies a CSS class name to be appended to the component’s root element */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Specifies whether past dates should be selectable or not */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.excludePastDates")
      @js.native
      def excludePastDates: Requireable[Boolean] = js.native
      inline def excludePastDates_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludePastDates")(x.asInstanceOf[js.Any])
      
      /** Specifies dates that are selectable. Only the dates that match defined criteria will be available for a user to select. */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.filterDate")
      @js.native
      def filterDate: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def filterDate_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filterDate")(x.asInstanceOf[js.Any])
      
      /** Renders a panel footer. Pass `<CalendarPanelFooter/>` in all common cases. `({selectedDays, submitDisabled}) => void` - `selectedDays` is the same as the CalendarPanel's `value` prop. `submitDisabled` is true when the current selectedDays is not valida for submission. */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.footer")
      @js.native
      def footer: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def footer_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footer")(x.asInstanceOf[js.Any])
      
      /** Specifies date picker instance locale */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.locale")
      @js.native
      def locale: Requireable[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.wixStyleReact.wixStyleReactStrings.th, typings.wixStyleReact.wixStyleReactStrings.tr, typings.wixStyleReact.wixStyleReactStrings.id */ Any
          ] = js.native
      inline def locale_=(
        x: Requireable[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 55, starting with typings.wixStyleReact.wixStyleReactStrings.th, typings.wixStyleReact.wixStyleReactStrings.tr, typings.wixStyleReact.wixStyleReactStrings.id */ Any
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
      
      /** Defines a number of months to display inside of a panel */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.numOfMonths")
      @js.native
      def numOfMonths: Requireable[Double] = js.native
      inline def numOfMonths_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numOfMonths")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function  which is called whenever the user selects a day or a date range in the calendar */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.onChange")
      @js.native
      def onChange: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called whenever user press `escape` or click outside of the element */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.onClose")
      @js.native
      def onClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClose_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClose")(x.asInstanceOf[js.Any])
      
      /** Defines an array of predefined calendar presets that are displayed as select items on the left side of a panel */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.presets")
      @js.native
      def presets: Requireable[js.Array[Any]] = js.native
      inline def presets_=(x: Requireable[js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("presets")(x.asInstanceOf[js.Any])
      
      /** Specifies if user can select a single day or a date range */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.selectionMode")
      @js.native
      def selectionMode: Requireable[String] = js.native
      inline def selectionMode_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(x.asInstanceOf[js.Any])
      
      /** Specifies whether calendar should close on a day selection */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.shouldCloseOnSelect")
      @js.native
      def shouldCloseOnSelect: Requireable[Boolean] = js.native
      inline def shouldCloseOnSelect_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shouldCloseOnSelect")(x.asInstanceOf[js.Any])
      
      /** Specifies whether to display a month selection dropdown inside of a calendar */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.showMonthDropdown")
      @js.native
      def showMonthDropdown: Requireable[Boolean] = js.native
      inline def showMonthDropdown_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showMonthDropdown")(x.asInstanceOf[js.Any])
      
      /** Specifies whether to display a year selection dropdown inside of a calendar */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.showYearDropdown")
      @js.native
      def showYearDropdown: Requireable[Boolean] = js.native
      inline def showYearDropdown_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showYearDropdown")(x.asInstanceOf[js.Any])
      
      /** Defines a selected date or date range */
      @JSImport("wix-style-react/dist/types/CalendarPanel/CalendarPanel", "default.propTypes.value")
      @js.native
      def value: Requireable[String | js.Date | InferProps[FromRequireable]] = js.native
      inline def value_=(x: Requireable[String | js.Date | InferProps[FromRequireable]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CalendarPanel extends Component[Any, Any, Any] {
    
    def getSelectedPresetId(): Any = js.native
    
    def isSubmitDisabled(): Boolean = js.native
    
    def onSelectPreset(preset: Any): Unit = js.native
  }
}
