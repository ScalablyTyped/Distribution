package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.FromRequireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarPanelFooterCalendarPanelFooterMod {
  
  @JSImport("wix-style-react/dist/types/CalendarPanelFooter/CalendarPanelFooter", JSImport.Default)
  @js.native
  open class default protected () extends CalendarPanelFooter {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/CalendarPanelFooter/CalendarPanelFooter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/CalendarPanelFooter/CalendarPanelFooter", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/CalendarPanelFooter/CalendarPanelFooter", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Applies a data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/CalendarPanelFooter/CalendarPanelFooter", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Formats date into a string for displaying the current selected days. Receives a Date instance (not undefined). */
      @JSImport("wix-style-react/dist/types/CalendarPanelFooter/CalendarPanelFooter", "default.propTypes.dateToString")
      @js.native
      def dateToString: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def dateToString_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dateToString")(x.asInstanceOf[js.Any])
      
      /** Specifies whether primary action is disabled */
      @JSImport("wix-style-react/dist/types/CalendarPanelFooter/CalendarPanelFooter", "default.propTypes.primaryActionDisabled")
      @js.native
      def primaryActionDisabled: Validator[Boolean] = js.native
      inline def primaryActionDisabled_=(x: Validator[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primaryActionDisabled")(x.asInstanceOf[js.Any])
      
      /** Defines primary (submit) action label */
      @JSImport("wix-style-react/dist/types/CalendarPanelFooter/CalendarPanelFooter", "default.propTypes.primaryActionLabel")
      @js.native
      def primaryActionLabel: Validator[String] = js.native
      inline def primaryActionLabel_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primaryActionLabel")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called every time primary button is clicked */
      @JSImport("wix-style-react/dist/types/CalendarPanelFooter/CalendarPanelFooter", "default.propTypes.primaryActionOnClick")
      @js.native
      def primaryActionOnClick: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def primaryActionOnClick_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primaryActionOnClick")(x.asInstanceOf[js.Any])
      
      /** Defines secondary (cancel) action label */
      @JSImport("wix-style-react/dist/types/CalendarPanelFooter/CalendarPanelFooter", "default.propTypes.secondaryActionLabel")
      @js.native
      def secondaryActionLabel: Validator[String] = js.native
      inline def secondaryActionLabel_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryActionLabel")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called every time secondary button is clicked */
      @JSImport("wix-style-react/dist/types/CalendarPanelFooter/CalendarPanelFooter", "default.propTypes.secondaryActionOnClick")
      @js.native
      def secondaryActionOnClick: Validator[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def secondaryActionOnClick_=(x: Validator[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryActionOnClick")(x.asInstanceOf[js.Any])
      
      /** Defines an active date or a date range selection */
      @JSImport("wix-style-react/dist/types/CalendarPanelFooter/CalendarPanelFooter", "default.propTypes.selectedDays")
      @js.native
      def selectedDays: Requireable[String | js.Date | InferProps[FromRequireable]] = js.native
      inline def selectedDays_=(x: Requireable[String | js.Date | InferProps[FromRequireable]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectedDays")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CalendarPanelFooter extends PureComponent[Any, Any, Any]
}
