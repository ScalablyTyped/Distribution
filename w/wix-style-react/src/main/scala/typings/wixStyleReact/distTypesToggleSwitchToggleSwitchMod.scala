package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToggleSwitchToggleSwitchMod {
  
  /** toggle switch */
  @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", JSImport.Default)
  @js.native
  open class default protected () extends ToggleSwitch {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Specifies whether toggle is checked. */
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.propTypes.checked")
      @js.native
      def checked: Requireable[Boolean] = js.native
      inline def checked_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("checked")(x.asInstanceOf[js.Any])
      
      /** Specifies a CSS class name to be appended to the component’s root element. */
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute that can be used in the tests. */
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Specifies whether toggle is disabled. */
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** Assigns an unique identifier for the root element. */
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.propTypes.id")
      @js.native
      def id: Requireable[String] = js.native
      inline def id_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called every time toggle state changes. */
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onChange_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      /** Controls the size of a toggle. */
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** Controls the skin of a toggle. */
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      /** Indicates that element can be focused and where it participates in sequential keyboard navigation. */
      @JSImport("wix-style-react/dist/types/ToggleSwitch/ToggleSwitch", "default.propTypes.tabIndex")
      @js.native
      def tabIndex: Requireable[Double] = js.native
      inline def tabIndex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
    }
  }
  
  /** toggle switch */
  @js.native
  trait ToggleSwitch extends PureComponent[Any, Any, Any]
}
