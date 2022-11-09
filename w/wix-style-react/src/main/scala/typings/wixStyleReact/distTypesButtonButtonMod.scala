package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.Context
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.std.HTMLButtonElement
import typings.wixStyleReact.distTypesButtonButtonDottypesMod.ButtonProps
import typings.wixStyleReact.distTypesWixStyleReactDefaultsOverrideProviderWixStyleReactDefaultsOverrideProviderMod.WixStyleReactDefaultsOverride
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonButtonMod {
  
  @JSImport("wix-style-react/dist/types/Button/Button", JSImport.Default)
  @js.native
  open class default protected () extends Button {
    def this(props: ButtonProps) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/Button/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Button/Button", "default.contextType")
    @js.native
    def contextType: Context[WixStyleReactDefaultsOverride] = js.native
    inline def contextType_=(x: Context[WixStyleReactDefaultsOverride]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Button/Button", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.as")
      @js.native
      def as: Requireable[String | js.Object] = js.native
      inline def as_=(x: Requireable[String | js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("as")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.disabled")
      @js.native
      def disabled: Requireable[Boolean] = js.native
      inline def disabled_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.ellipsis")
      @js.native
      def ellipsis: Requireable[Boolean] = js.native
      inline def ellipsis_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.fullWidth")
      @js.native
      def fullWidth: Requireable[Boolean] = js.native
      inline def fullWidth_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.prefixIcon")
      @js.native
      def prefixIcon: Requireable[ReactElementLike] = js.native
      inline def prefixIcon_=(x: Requireable[ReactElementLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.priority")
      @js.native
      def priority: Requireable[String] = js.native
      inline def priority_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("priority")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.showTooltip")
      @js.native
      def showTooltip: Requireable[Boolean] = js.native
      inline def showTooltip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTooltip")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.size")
      @js.native
      def size: Requireable[String] = js.native
      inline def size_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("size")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.skin")
      @js.native
      def skin: Requireable[String] = js.native
      inline def skin_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skin")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.suffixIcon")
      @js.native
      def suffixIcon: Requireable[ReactElementLike] = js.native
      inline def suffixIcon_=(x: Requireable[ReactElementLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("suffixIcon")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Button/Button", "default.propTypes.tooltipProps")
      @js.native
      def tooltipProps: Requireable[InferProps[Any]] = js.native
      inline def tooltipProps_=(x: Requireable[InferProps[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipProps")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Button
    extends PureComponent[ButtonProps, js.Object, Any] {
    
    var button: RefObject[HTMLButtonElement] = js.native
    
    /**
      * Sets focus on the element
      */
    def focus(): Unit = js.native
  }
}
