package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToggleButtonToggleButtonMod {
  
  @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", JSImport.Default)
  @js.native
  open class default protected () extends ToggleButton {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.defaultProps.border")
      @js.native
      def border: Boolean = js.native
      inline def border_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("border")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.defaultProps.labelEllipsis")
      @js.native
      def labelEllipsis: Boolean = js.native
      inline def labelEllipsis_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelEllipsis")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.defaultProps.labelPlacement")
      @js.native
      def labelPlacement: String = js.native
      inline def labelPlacement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.defaultProps.labelValue")
      @js.native
      def labelValue: String = js.native
      inline def labelValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelValue")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.defaultProps.shape")
      @js.native
      def shape: String = js.native
      inline def shape_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shape")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.defaultProps.size")
      @js.native
      def size: String = js.native
      inline def size_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.defaultProps.skin")
      @js.native
      def skin: String = js.native
      inline def skin_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.defaultProps.tooltipProps")
      @js.native
      def tooltipProps: Placement = js.native
      inline def tooltipProps_=(x: Placement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipProps")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** render as some other component or DOM tag */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.as")
      @js.native
      def as: Requireable[String | js.Object] = js.native
      inline def as_=(x: Requireable[String | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("as")(x.asInstanceOf[js.Any])
      
      /** Applies border */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.border")
      @js.native
      def border: Requireable[Boolean] = js.native
      inline def border_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("border")(x.asInstanceOf[js.Any])
      
      /** Used for passing any wix-style-react icon. For external icon make sure to follow ux sizing guidelines */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** String based data hook */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Applies disabled styles */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      /** Whether label should have ellipsis */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.labelEllipsis")
      @js.native
      def labelEllipsis: Requireable[Boolean] = js.native
      inline def labelEllipsis_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelEllipsis")(x.asInstanceOf[js.Any])
      
      /** Label placement */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.labelPlacement")
      @js.native
      def labelPlacement: Requireable[String] = js.native
      inline def labelPlacement_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(x.asInstanceOf[js.Any])
      
      /** Label content */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.labelValue")
      @js.native
      def labelValue: Requireable[ReactNodeLike] = js.native
      inline def labelValue_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("labelValue")(x.asInstanceOf[js.Any])
      
      /** Click event handler  */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      /** Applies selected styles */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.selected")
      @js.native
      def selected: Requireable[Boolean] = js.native
      inline def selected_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selected")(x.asInstanceOf[js.Any])
      
      /** Button shape */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.shape")
      @js.native
      def shape: Requireable[String] = js.native
      inline def shape_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shape")(x.asInstanceOf[js.Any])
      
      /** Button size */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      /** Button skins */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      /** Tooltip props for label. Applied only when `labelPlacement` is `tooltip`. */
      @JSImport("wix-style-react/dist/types/ToggleButton/ToggleButton", "default.propTypes.tooltipProps")
      @js.native
      def tooltipProps: Requireable[InferProps[Any]] = js.native
      inline def tooltipProps_=(x: Requireable[InferProps[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipProps")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ToggleButton extends PureComponent[Any, Any, Any] {
    
    def renderLabel(): Element = js.native
  }
}
