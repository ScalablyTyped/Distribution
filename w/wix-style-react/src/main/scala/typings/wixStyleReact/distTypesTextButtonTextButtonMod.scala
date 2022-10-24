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
      
      /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.ariaHaspopup")
      @js.native
      def ariaHaspopup: Requireable[String] = js.native
      inline def ariaHaspopup_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaHaspopup")(x.asInstanceOf[js.Any])
      
      /** Defines a string value that labels the button element */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.ariaLabel")
      @js.native
      def ariaLabel: Requireable[String] = js.native
      inline def ariaLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(x.asInstanceOf[js.Any])
      
      /** Identifies the element that labels the button element */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.ariaLabelledBy")
      @js.native
      def ariaLabelledBy: Requireable[String] = js.native
      inline def ariaLabelledBy_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ariaLabelledBy")(x.asInstanceOf[js.Any])
      
      /** render as some other component or DOM tag */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.as")
      @js.native
      def as: Requireable[String | js.Object] = js.native
      inline def as_=(x: Requireable[String | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("as")(x.asInstanceOf[js.Any])
      
      /** String based node */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Additional classes */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** String based data hook */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Applies disabled styles */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** should the text get ellipsized with tooltip, or should it get broken into lines when it reaches the end of its container */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.ellipsis")
      @js.native
      def ellipsis: Requireable[Boolean] = js.native
      inline def ellipsis_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
      
      /** Stretches text button to its container width */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.fluid")
      @js.native
      def fluid: Requireable[Boolean] = js.native
      inline def fluid_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fluid")(x.asInstanceOf[js.Any])
      
      /** Click event handler  */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      /** Element based icon (svg, image etc.) */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.prefixIcon")
      @js.native
      def prefixIcon: Requireable[ReactElementLike] = js.native
      inline def prefixIcon_=(x: Requireable[ReactElementLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixIcon")(x.asInstanceOf[js.Any])
      
      /** True by default, set it to false in order to show ellipsis without a tooltip. */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.showTooltip")
      @js.native
      def showTooltip: Requireable[Boolean] = js.native
      inline def showTooltip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(x.asInstanceOf[js.Any])
      
      /** Size of TextButton content */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** Skins of TextButton content */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      /** Element based icon (svg, image etc.) */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.suffixIcon")
      @js.native
      def suffixIcon: Requireable[ReactElementLike] = js.native
      inline def suffixIcon_=(x: Requireable[ReactElementLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(x.asInstanceOf[js.Any])
      
      /** Props that modify the Tooltip created from text ellipsis */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.tooltipProps")
      @js.native
      def tooltipProps: Requireable[InferProps[Any]] = js.native
      inline def tooltipProps_=(x: Requireable[InferProps[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipProps")(x.asInstanceOf[js.Any])
      
      /** Underline of TextButton content */
      @JSImport("wix-style-react/dist/types/TextButton/TextButton", "default.propTypes.underline")
      @js.native
      def underline: Requireable[String] = js.native
      inline def underline_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("underline")(x.asInstanceOf[js.Any])
      
      /** Weight of TextButton content */
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
