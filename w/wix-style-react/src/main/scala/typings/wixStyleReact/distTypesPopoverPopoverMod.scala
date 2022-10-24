package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.FunctionComponent
import typings.react.mod.PureComponent
import typings.wixStyleReact.anon.Enter
import typings.wixStyleReact.anon.X
import typings.wixStyleReact.distTypesPopoverPopoverCoreUtilsUtilsMod.ElementProps
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.PopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverPopoverMod {
  
  @JSImport("wix-style-react/dist/types/Popover/Popover", JSImport.Default)
  @js.native
  open class default () extends Popover
  object default {
    
    @JSImport("wix-style-react/dist/types/Popover/Popover", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Popover/Popover", "default.Content")
    @js.native
    def Content: FunctionComponent[ElementProps] = js.native
    inline def Content_=(x: FunctionComponent[ElementProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Popover/Popover", "default.Element")
    @js.native
    def Element: FunctionComponent[ElementProps] = js.native
    inline def Element_=(x: FunctionComponent[ElementProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.defaultProps.animate")
      @js.native
      def animate: Boolean = js.native
      inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.defaultProps.appendTo")
      @js.native
      def appendTo: String = js.native
      inline def appendTo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.defaultProps.theme")
      @js.native
      def theme: String = js.native
      inline def theme_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/Popover/Popover", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Adds enter and exit animation */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.animate")
      @js.native
      def animate: Requireable[Boolean] = js.native
      inline def animate_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
      
      /** Enables calculations in relation to a dom element */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.appendTo")
      @js.native
      def appendTo: Requireable[String] = js.native
      inline def appendTo_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(x.asInstanceOf[js.Any])
      
      /** custom classname */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** the classname to be passed to the popover's content container */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.contentClassName")
      @js.native
      def contentClassName: Requireable[String] = js.native
      inline def contentClassName_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contentClassName")(x.asInstanceOf[js.Any])
      
      /** Custom arrow element */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.customArrow")
      @js.native
      def customArrow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def customArrow_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customArrow")(x.asInstanceOf[js.Any])
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Breaking change: When true - onClickOutside will be called only when popover content is shown */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.disableClickOutsideWhenClosed")
      @js.native
      def disableClickOutsideWhenClosed: Requireable[Boolean] = js.native
      inline def disableClickOutsideWhenClosed_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableClickOutsideWhenClosed")(x.asInstanceOf[js.Any])
      
      /** popovers content is set to minnimum width of trigger element, but it can expand up to the value of maxWidth. */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.dynamicWidth")
      @js.native
      def dynamicWidth: Requireable[Boolean] = js.native
      inline def dynamicWidth_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dynamicWidth")(x.asInstanceOf[js.Any])
      
      /** Clicking on elements with this excluded class will will not trigger onClickOutside callback */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.excludeClass")
      @js.native
      def excludeClass: Requireable[String] = js.native
      inline def excludeClass_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("excludeClass")(x.asInstanceOf[js.Any])
      
      /**
        * Whether to enable the fixed behaviour. This behaviour is used to keep the `<Popover/>` at it's
        * original placement even when it's being positioned outside the boundary.
        */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.fixed")
      @js.native
      def fixed: Requireable[Boolean] = js.native
      inline def fixed_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixed")(x.asInstanceOf[js.Any])
      
      /**
        * Whether to enable the flip behaviour. This behaviour is used to flip the `<Popover/>`'s placement
        * when it starts to overlap the target element (`<Popover.Element/>`).
        */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.flip")
      @js.native
      def flip: Requireable[Boolean] = js.native
      inline def flip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flip")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.fluid")
      @js.native
      def fluid: Requireable[Boolean] = js.native
      inline def fluid_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fluid")(x.asInstanceOf[js.Any])
      
      /** Hide Delay in ms */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.hideDelay")
      @js.native
      def hideDelay: Requireable[Double] = js.native
      inline def hideDelay_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideDelay")(x.asInstanceOf[js.Any])
      
      /** Id */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.id")
      @js.native
      def id: Requireable[String] = js.native
      inline def id_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      /**
        * popover content maxWidth value
        * - `number` value which converts to css with `px`
        * - `string` value that contains `px`
        */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.maxWidth")
      @js.native
      def maxWidth: Requireable[String | Double] = js.native
      inline def maxWidth_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
      
      /**
        * popover content minWidth value
        * - `number` value which converts to css with `px`
        * - `string` value that contains `px`
        */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.minWidth")
      @js.native
      def minWidth: Requireable[String | Double] = js.native
      inline def minWidth_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(x.asInstanceOf[js.Any])
      
      /** Moves arrow by amount */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.moveArrowTo")
      @js.native
      def moveArrowTo: Requireable[Double] = js.native
      inline def moveArrowTo_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moveArrowTo")(x.asInstanceOf[js.Any])
      
      /** Moves popover relative to the parent */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.moveBy")
      @js.native
      def moveBy: Requireable[InferProps[X]] = js.native
      inline def moveBy_=(x: Requireable[InferProps[X]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moveBy")(x.asInstanceOf[js.Any])
      
      /** onClick on the component */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.onClick")
      @js.native
      def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      /** Provides callback to invoke when clicked outside of the popover */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.onClickOutside")
      @js.native
      def onClickOutside: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClickOutside_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClickOutside")(x.asInstanceOf[js.Any])
      
      inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
      
      /** onKeyDown on the target component */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.onKeyDown")
      @js.native
      def onKeyDown: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onKeyDown_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(x.asInstanceOf[js.Any])
      
      /** onMouseEnter on the component */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.onMouseEnter")
      @js.native
      def onMouseEnter: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseEnter_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
      
      /** onMouseLeave on the component */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.onMouseLeave")
      @js.native
      def onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseLeave_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      /** The Popover's placement:
        *  * auto-start
        *  * auto
        *  * auto-end
        *  * top-start
        *  * top
        *  * top-end
        *  * right-start
        *  * right
        *  * right-end
        *  * bottom-end
        *  * bottom
        *  * bottom-start
        *  * left-end
        *  * left
        *  * left-start
        */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.placement")
      @js.native
      def placement: Requireable[String] = js.native
      inline def placement_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      /** target element role value */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.role")
      @js.native
      def role: Requireable[String] = js.native
      inline def role_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
      
      /** Show show arrow from the content */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.showArrow")
      @js.native
      def showArrow: Requireable[Boolean] = js.native
      inline def showArrow_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      /** Show Delay in ms */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.showDelay")
      @js.native
      def showDelay: Requireable[Double] = js.native
      inline def showDelay_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showDelay")(x.asInstanceOf[js.Any])
      
      /** Is the content shown or not */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.shown")
      @js.native
      def shown: Requireable[Boolean] = js.native
      inline def shown_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shown")(x.asInstanceOf[js.Any])
      
      /** Inline style */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.style")
      @js.native
      def style: Requireable[js.Object] = js.native
      inline def style_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("style")(x.asInstanceOf[js.Any])
      
      /** The theme of the popover */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.theme")
      @js.native
      def theme: Requireable[String] = js.native
      inline def theme_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      
      /** Animation timer */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.timeout")
      @js.native
      def timeout: Requireable[Double | InferProps[Enter]] = js.native
      inline def timeout_=(x: Requireable[Double | InferProps[Enter]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
      
      /**
        * popover content width value
        * - `number` value which converts to css with `px`
        * - `string` value that contains `px`
        */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.width")
      @js.native
      def width: Requireable[String | Double] = js.native
      inline def width_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
      
      /** popover z-index */
      @JSImport("wix-style-react/dist/types/Popover/Popover", "default.propTypes.zIndex")
      @js.native
      def zIndex: Requireable[Double] = js.native
      inline def zIndex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Popover
    extends PureComponent[PopoverProps, js.Object, Any]
}
