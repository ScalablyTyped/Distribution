package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTextButtonTextButtonMod {
  
  @JSImport("wix-style-react/dist/types/TextButton/TextButton", JSImport.Default)
  @js.native
  open class default protected () extends TextButton {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/TextButton/TextButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.defaultProps.fluid")
      @js.native
      def fluid: Boolean = js.native
      inline def fluid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fluid")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.defaultProps.underline")
      @js.native
      def underline: String = js.native
      inline def underline_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("underline")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.defaultProps.weight")
      @js.native
      def weight: String = js.native
      inline def weight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weight")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Indicates to screen reader users whether the collapsable content below is in the expanded or in the collapsed state */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.ariaExpanded")
      @js.native
      def ariaExpanded: Requireable[Boolean] = js.native
      inline def ariaExpanded_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaExpanded")(x.asInstanceOf[js.Any])
      
      /** Indicates to screen reader users whether an interactive popup element, such as menu or dialog, can be triggered by a button */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.ariaHaspopup")
      @js.native
      def ariaHaspopup: Requireable[String] = js.native
      inline def ariaHaspopup_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaHaspopup")(x.asInstanceOf[js.Any])
      
      /** Defines a string value that labels the button element to screen reader users */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.ariaLabel")
      @js.native
      def ariaLabel: Requireable[String] = js.native
      inline def ariaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
      
      /** Identifies the element that labels the button element */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.ariaLabelledBy")
      @js.native
      def ariaLabelledBy: Requireable[String] = js.native
      inline def ariaLabelledBy_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(x.asInstanceOf[js.Any])
      
      /** Renders component as any other component or a given HTML tag */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.as")
      @js.native
      def as: Requireable[String | js.Object] = js.native
      inline def as_=(x: Requireable[String | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("as")(x.asInstanceOf[js.Any])
      
      /** Accepts any item as a child element. For all common cases pass a standard text string. */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Specifies a CSS class name to be appended to the component’s root element */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Specifies whether user interactions are disabled */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** Specifies whether component handles text overflow with ellipsis. If enabled, label that exceed available space will be displayed inside of a tooltip when user hover over a button. */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.ellipsis")
      @js.native
      def ellipsis: Requireable[Boolean] = js.native
      inline def ellipsis_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
      
      /** Stretches button to fill a 100% of its parent container width */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.fluid")
      @js.native
      def fluid: Requireable[Boolean] = js.native
      inline def fluid_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fluid")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called every time a button is clicked */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      /** Pass an icon or a component to display at the front of a label (e.g., svg, image, etc.) */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.prefixIcon")
      @js.native
      def prefixIcon: Requireable[ReactElementLike] = js.native
      inline def prefixIcon_=(x: Requireable[ReactElementLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixIcon")(x.asInstanceOf[js.Any])
      
      /** Specifies whether the full button label is displayed in a tooltip when label overflows available space.
        *
        * Behaviour is enabled by default. Set property value to false to show ellipsis without a tooltip. */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.showTooltip")
      @js.native
      def showTooltip: Requireable[Boolean] = js.native
      inline def showTooltip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(x.asInstanceOf[js.Any])
      
      /** Controls the size of a button */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** Specifies the skin of a button */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      /** Pass an icon or a component to display at the end of a label (e.g., svg, image, etc.) */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.suffixIcon")
      @js.native
      def suffixIcon: Requireable[ReactElementLike] = js.native
      inline def suffixIcon_=(x: Requireable[ReactElementLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(x.asInstanceOf[js.Any])
      
      /** Allows to pass all common tooltip props. Use it to customize a tooltip created from text ellipsis.  Check `<Tooltip/>` for a full API. */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.tooltipProps")
      @js.native
      def tooltipProps: Requireable[InferProps[Any]] = js.native
      inline def tooltipProps_=(x: Requireable[InferProps[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipProps")(x.asInstanceOf[js.Any])
      
      /** Specifies whether to display and when to display an underline below button label */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.underline")
      @js.native
      def underline: Requireable[String] = js.native
      inline def underline_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("underline")(x.asInstanceOf[js.Any])
      
      /** Controls the font weight of button label */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.weight")
      @js.native
      def weight: Requireable[String] = js.native
      inline def weight_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weight")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TextButton extends PureComponent[Any, Any, Any] {
    
    var button: RefObject[Any] = js.native
    
    /**
      * Sets focus on the element
      */
    def focus(): Unit = js.native
  }
}
