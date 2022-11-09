package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.wixStyleReact.anon.IsOpen
import typings.wixStyleReact.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverMenuPopoverMenuMod {
  
  /** PopoverMenu */
  @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", JSImport.Default)
  @js.native
  open class default protected () extends PopoverMenu {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object Divider {
      
      inline def apply(): js.Object = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Object]
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.Divider")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.Divider.displayName_1")
      @js.native
      val displayName1: String = js.native
    }
    
    object MenuItem {
      
      inline def apply(): js.Object = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Object]
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.MenuItem")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.MenuItem.displayName")
      @js.native
      val displayName: String = js.native
    }
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.defaultProps.appendTo")
      @js.native
      def appendTo: String = js.native
      inline def appendTo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.defaultProps.ellipsis")
      @js.native
      def ellipsis: Boolean = js.native
      inline def ellipsis_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.defaultProps.fixed")
      @js.native
      def fixed: Boolean = js.native
      inline def fixed_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixed")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.defaultProps.flip")
      @js.native
      def flip: Boolean = js.native
      inline def flip_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flip")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.defaultProps.maxHeight")
      @js.native
      def maxHeight: String = js.native
      inline def maxHeight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.defaultProps.maxWidth")
      @js.native
      def maxWidth: Double = js.native
      inline def maxWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.defaultProps.minWidth")
      @js.native
      def minWidth: Double = js.native
      inline def minWidth_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.defaultProps.placement")
      @js.native
      def placement: String = js.native
      inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.defaultProps.showArrow")
      @js.native
      def showArrow: Boolean = js.native
      inline def showArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.defaultProps.textSize")
      @js.native
      def textSize: String = js.native
      inline def textSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textSize")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Enables calculations in relation to a DOM element */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.appendTo")
      @js.native
      def appendTo: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      inline def appendTo_=(x: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(x.asInstanceOf[js.Any])
      
      /**
        * Stores Popover menu compound components:
        * - <PopoverMenu.MenuItem />
        * - <PopoverMenu.Divider /> (optional)
        *
        * `<PopoverMenu.MenuItem>` component has these fields:
        *  * `text` - Sets a label for a Popover menu item
        *  * `onClick` - Defines a callback function which is called when a Popover menu item is clicked on
        *  * `skin` - Controls the appearance of a Popover menu item (one of `standard`, `dark`, `destructive`)
        *  * `prefixIcon` - Contains an icon at the start of a Popover menu item
        *  * `dataHook` - Applies a data-hook HTML attribute to be used in the tests
        *  * `suffixIcon` - suffix icon property
        *  * `disabled` - Disables a Popover menu item
        *  * `subtitle` - Sets a text for a Popover menu item subtitle\
        *
        * `<PopoverMenu.Divider>` component has these fields:
        * * `dataHook` - Applies a data-hook HTML attribute to be used in the tests
        */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.children")
      @js.native
      def children: Requireable[ReactNodeLike] = js.native
      inline def children_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Applies a CSS class to the component’s root element */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute to be used in the tests */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Truncates menu item text that overflows component’s max Width */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.ellipsis")
      @js.native
      def ellipsis: Requireable[Boolean] = js.native
      inline def ellipsis_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(x.asInstanceOf[js.Any])
      
      /** Enables the fixed behaviour. This behaviour is used to keep the overlay at its original placement even when it is being positioned outside the boundary. */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.fixed")
      @js.native
      def fixed: Requireable[Boolean] = js.native
      inline def fixed_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixed")(x.asInstanceOf[js.Any])
      
      /** Enables the flip behaviour. This behaviour is used to flip the overlay placement when it starts to overlap the trigger element. */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.flip")
      @js.native
      def flip: Requireable[Boolean] = js.native
      inline def flip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flip")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.fluid")
      @js.native
      def fluid: Requireable[Boolean] = js.native
      inline def fluid_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fluid")(x.asInstanceOf[js.Any])
      
      /** Sets a maximum height for a Popover menu */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.maxHeight")
      @js.native
      def maxHeight: Requireable[String | Double] = js.native
      inline def maxHeight_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(x.asInstanceOf[js.Any])
      
      /** Sets a maximum width for a Popover menu */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.maxWidth")
      @js.native
      def maxWidth: Requireable[Double] = js.native
      inline def maxWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
      
      /** Sets a minimum width for a Popover menu */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.minWidth")
      @js.native
      def minWidth: Requireable[Double] = js.native
      inline def minWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(x.asInstanceOf[js.Any])
      
      /** Moves Popover menu overlay relative to its trigger element by a defined number of px:
        * - horizontally (on X-axis)
        * - or vertically (on Y-axis)
        */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.moveBy")
      @js.native
      def moveBy: Requireable[InferProps[X]] = js.native
      inline def moveBy_=(x: Requireable[InferProps[X]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moveBy")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called when a Popover menu is closed */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.onHide")
      @js.native
      def onHide: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onHide_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHide")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called when a Popover menu is opened */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.onShow")
      @js.native
      def onShow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onShow_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onShow")(x.asInstanceOf[js.Any])
      
      /** Defines the Popover menu’s overlay placement in relation to its trigger element:
        *  * auto-start
        *  * auto
        *  * auto-end
        *  * top-start
        *  * top
        *  * top-end
        *  * right-start
        *  * right
        *  * right-end
        *  * bottom-start
        *  * bottom
        *  * bottom-end
        *  * left-start
        *  * left
        *  * left-end
        */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.placement")
      @js.native
      def placement: Requireable[String] = js.native
      inline def placement_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      /** Controls visibility of the pointer arrow */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.showArrow")
      @js.native
      def showArrow: Requireable[Boolean] = js.native
      inline def showArrow_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      /** Sets the size of text in Popover menu items */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.textSize")
      @js.native
      def textSize: Requireable[String] = js.native
      inline def textSize_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textSize")(x.asInstanceOf[js.Any])
      
      /** Defines a component that calls out a Popover menu (`<IconButton />`, `<Button />` or `<Text Button />`) */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.triggerElement")
      @js.native
      def triggerElement: Validator[(js.Function1[/* repeated */ Any, Any]) | ReactElementLike] = js.native
      inline def triggerElement_=(x: Validator[(js.Function1[/* repeated */ Any, Any]) | ReactElementLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("triggerElement")(x.asInstanceOf[js.Any])
      
      /** Sets the Popover z-index */
      @JSImport("wix-style-react/dist/types/PopoverMenu/PopoverMenu", "default.propTypes.zIndex")
      @js.native
      def zIndex: Requireable[Double] = js.native
      inline def zIndex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
    }
  }
  
  /** PopoverMenu */
  @js.native
  trait PopoverMenu extends PureComponent[Any, Any, Any] {
    
    def _buildOptions(children: Any): Any = js.native
    
    def _filterChildren(children: Any): Any = js.native
    
    def _open(): Unit = js.native
    
    def _renderOptions(): Any = js.native
    
    def _renderTriggerElement(param0: IsOpen): Any = js.native
    
    var ref: RefObject[Any] = js.native
  }
}
