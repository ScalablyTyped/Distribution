package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactElementLike
import typings.propTypes.mod.ReactNodeArray
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.wixStyleReact.anon.ListAutoFocus
import typings.wixStyleReact.anon.OverrideStyle
import typings.wixStyleReact.anon.ReadonlychildrenReactNode
import typings.wixStyleReact.anon.ValueRequireable
import typings.wixStyleReact.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDropdownBaseDropdownBaseMod {
  
  @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", JSImport.Default)
  @js.native
  open class default protected () extends DropdownBase {
    def this(props: Any) = this()
  }
  object default {
    
    @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.defaultProps.animate")
      @js.native
      def animate: Boolean = js.native
      inline def animate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.defaultProps.appendTo")
      @js.native
      def appendTo: String = js.native
      inline def appendTo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.defaultProps.fluid")
      @js.native
      def fluid: Boolean = js.native
      inline def fluid_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fluid")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.defaultProps.listType")
      @js.native
      def listType: String = js.native
      inline def listType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listType")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.defaultProps.maxHeight")
      @js.native
      def maxHeight: String = js.native
      inline def maxHeight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(x.asInstanceOf[js.Any])
      
      inline def onHide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onHide")().asInstanceOf[Unit]
      
      inline def onShow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onShow")().asInstanceOf[Unit]
      
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.defaultProps.placement")
      @js.native
      def placement: String = js.native
      inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.defaultProps.showArrow")
      @js.native
      def showArrow: Boolean = js.native
      inline def showArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Adds enter and exit animation */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.animate")
      @js.native
      def animate: Requireable[Boolean] = js.native
      inline def animate_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animate")(x.asInstanceOf[js.Any])
      
      /** Specifies where popover should be inserted as a last child - whether `parent` or `window` containers */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.appendTo")
      @js.native
      def appendTo: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray] = js.native
      inline def appendTo_=(x: Requireable[String | Double | Boolean | ReactElementLike | ReactNodeArray]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appendTo")(x.asInstanceOf[js.Any])
      
      /** Specifies whether first list item should be focused */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.autoFocus")
      @js.native
      def autoFocus: Requireable[Boolean] = js.native
      inline def autoFocus_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoFocus")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies a target component to be rendered. If a regular node is passed, it'll be rendered as-is.
        * If a function is passed, it's expected to return a React element.
        * The function accepts an object containing the following properties:
        *
        *  * `open` - will open the Popover
        *  * `close` - will close the Popover
        *  * `toggle` - will toggle the Popover
        *  * `isOpen` - indicates whether the items list is currently open
        *  * `delegateKeyDown` - the underlying DropdownLayout's keydown handler. It can be called
        *                        inside another keyDown event in order to delegate it.
        *  * `selectedOption` - the currently selected option
        *
        * Check inserted component documentation for more information on available properties.
        */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.children")
      @js.native
      def children: Requireable[
            String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
          ] = js.native
      inline def children_=(
        x: Requireable[
              String | Double | Boolean | (js.Function1[/* repeated */ Any, Any]) | ReactElementLike | ReactNodeArray
            ]
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      /** Specifies a CSS class name to be appended to the component’s root element */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.className")
      @js.native
      def className: Requireable[String] = js.native
      inline def className_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      /** Applies a data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /**
        * Set popover's content width to a minimum width of a trigger element,
        * but it can expand up to the defined value of `maxWidth`
        */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.dynamicWidth")
      @js.native
      def dynamicWidth: Requireable[Boolean] = js.native
      inline def dynamicWidth_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dynamicWidth")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies whether to enable the fixed behaviour. If enabled, <Popover/> keep its
        * original placement even when it's being positioned outside the boundary.
        */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.fixed")
      @js.native
      def fixed: Requireable[Boolean] = js.native
      
      /** A fixed footer to the list */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.fixedFooter")
      @js.native
      def fixedFooter: Requireable[ReactNodeLike] = js.native
      inline def fixedFooter_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixedFooter")(x.asInstanceOf[js.Any])
      
      /** A fixed header to the list */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.fixedHeader")
      @js.native
      def fixedHeader: Requireable[ReactNodeLike] = js.native
      inline def fixedHeader_=(x: Requireable[ReactNodeLike]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixedHeader")(x.asInstanceOf[js.Any])
      
      inline def fixed_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fixed")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies whether to flip the <Popover/> placement
        * when it starts to overlap the target element (<Popover.Element/>)
        */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.flip")
      @js.native
      def flip: Requireable[Boolean] = js.native
      inline def flip_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flip")(x.asInstanceOf[js.Any])
      
      /** Stretches trigger element to fill its parent container width */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.fluid")
      @js.native
      def fluid: Requireable[Boolean] = js.native
      inline def fluid_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fluid")(x.asInstanceOf[js.Any])
      
      /** Focus to the specified option when dropdown is opened */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.focusOnOption")
      @js.native
      def focusOnOption: Requireable[Double] = js.native
      inline def focusOnOption_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusOnOption")(x.asInstanceOf[js.Any])
      
      /** Focus to the selected option when dropdown is opened */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.focusOnSelectedOption")
      @js.native
      def focusOnSelectedOption: Requireable[Boolean] = js.native
      inline def focusOnSelectedOption_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusOnSelectedOption")(x.asInstanceOf[js.Any])
      
      /** Specifies whether there are more items to load */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.hasMore")
      @js.native
      def hasMore: Requireable[Boolean] = js.native
      inline def hasMore_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasMore")(x.asInstanceOf[js.Any])
      
      /** Specifies whether lazy loading of the dropdown items is enabled */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.infiniteScroll")
      @js.native
      def infiniteScroll: Requireable[Boolean] = js.native
      inline def infiniteScroll_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infiniteScroll")(x.asInstanceOf[js.Any])
      
      /**
        * Sets the initially selected option in the list. Used when selection
        * behaviour is being controlled.
        */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.initialSelectedId")
      @js.native
      def initialSelectedId: Requireable[String | Double] = js.native
      inline def initialSelectedId_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedId")(x.asInstanceOf[js.Any])
      
      /** Defines type of behavior applied in list */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.listType")
      @js.native
      def listType: Requireable[String] = js.native
      inline def listType_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listType")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called on a request to render more list items */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.loadMore")
      @js.native
      def loadMore: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def loadMore_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadMore")(x.asInstanceOf[js.Any])
      
      /** Sets the initial marking of an option in the list when opened:
        *  - `false` - no initially hovered list item
        *  - `true` - hover first selectable option
        *  - any `number/string` specify the id of an option to be hovered
        */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.markedOption")
      @js.native
      def markedOption: Requireable[String | Double | Boolean] = js.native
      inline def markedOption_=(x: Requireable[String | Double | Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("markedOption")(x.asInstanceOf[js.Any])
      
      /** Controls the maximum height of dropdown layout */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.maxHeight")
      @js.native
      def maxHeight: Requireable[String | Double] = js.native
      inline def maxHeight_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(x.asInstanceOf[js.Any])
      
      /** Controls the maximum width of dropdown layout */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.maxWidth")
      @js.native
      def maxWidth: Requireable[String | Double] = js.native
      inline def maxWidth_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(x.asInstanceOf[js.Any])
      
      /** Controls the minimum width of dropdown layout */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.minWidth")
      @js.native
      def minWidth: Requireable[String | Double] = js.native
      inline def minWidth_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(x.asInstanceOf[js.Any])
      
      /** Moves dropdown content relative to the parent on X or Y axis by a defined amount of pixels */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.moveBy")
      @js.native
      def moveBy: Requireable[InferProps[X]] = js.native
      inline def moveBy_=(x: Requireable[InferProps[X]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("moveBy")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called when user clicks outside of a dropdown */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.onClickOutside")
      @js.native
      def onClickOutside: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onClickOutside_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClickOutside")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called when dropdown is closed */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.onHide")
      @js.native
      def onHide: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onHide_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onHide")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called on `onMouseEnter` event on the entire component */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.onMouseEnter")
      @js.native
      def onMouseEnter: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseEnter_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called on `onMouseLeave` event on the entire component */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.onMouseLeave")
      @js.native
      def onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onMouseLeave_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called whenever user selects a different option in the list */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.onSelect")
      @js.native
      def onSelect: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onSelect_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(x.asInstanceOf[js.Any])
      
      /** Defines a callback function which is called when dropdown is opened */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.onShow")
      @js.native
      def onShow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onShow_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onShow")(x.asInstanceOf[js.Any])
      
      /** Control whether the <Popover/> should be opened */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.open")
      @js.native
      def open: Requireable[Boolean] = js.native
      inline def open_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("open")(x.asInstanceOf[js.Any])
      
      /**
        * Specifies an array of options for a dropdown list. Objects must have an id and can include string value or node.
        * If value is '-', a divider will be rendered instead (dividers do not require and id).
        */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.options")
      @js.native
      def options: Requireable[js.Array[js.UndefOr[(InferProps[OverrideStyle | ValueRequireable]) | Null]]] = js.native
      inline def options_=(x: Requireable[js.Array[js.UndefOr[(InferProps[OverrideStyle | ValueRequireable]) | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
      
      /** Handles container overflow behaviour */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.overflow")
      @js.native
      def overflow: Requireable[String] = js.native
      inline def overflow_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overflow")(x.asInstanceOf[js.Any])
      
      /** Control popover placement */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.placement")
      @js.native
      def placement: Requireable[String] = js.native
      inline def placement_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      /** Scrolls to the specified option when dropdown is opened without marking it */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.scrollToOption")
      @js.native
      def scrollToOption: Requireable[String | Double] = js.native
      inline def scrollToOption_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollToOption")(x.asInstanceOf[js.Any])
      
      /** Define the selected option in the list */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.selectedId")
      @js.native
      def selectedId: Requireable[String | Double] = js.native
      inline def selectedId_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectedId")(x.asInstanceOf[js.Any])
      
      /** Specifies whether popover arrow should be shown */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.showArrow")
      @js.native
      def showArrow: Requireable[Boolean] = js.native
      inline def showArrow_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      
      /** Indicates that element can be focused and where it participates in sequential keyboard navigation */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.tabIndex")
      @js.native
      def tabIndex: Requireable[Double] = js.native
      inline def tabIndex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(x.asInstanceOf[js.Any])
      
      /** Specifies the stack order (`z-index`) of a dropdown layout */
      @JSImport("wix-style-react/dist/types/DropdownBase/DropdownBase", "default.propTypes.zIndex")
      @js.native
      def zIndex: Requireable[Double] = js.native
      inline def zIndex_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DropdownBase extends PureComponent[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MDropdownBase(nextProps: Any): Unit = js.native
    
    def _close(e: Any): Unit = js.native
    
    def _delegateKeyDown(e: Any): Any = js.native
    
    var _dropdownLayoutRef: Null = js.native
    
    def _getSelectedOption(selectedId: Any): Any = js.native
    
    def _handleClickOutside(): Unit = js.native
    
    def _handleClose(): Unit = js.native
    
    /**
      * A common `keydown` event that can be used for the target elements. It will automatically
      * delegate the event to the underlying <DropdownLayout/>, and will determine when to open the
      * dropdown depending on the pressed key.
      */
    def _handleKeyDown(e: Any): Unit = js.native
    
    def _handlePopoverMouseEnter(): Unit = js.native
    
    def _handlePopoverMouseLeave(): Unit = js.native
    
    def _handleSelect(selectedOption: Any): Unit = js.native
    
    def _isClosingKey(key: Any): Boolean = js.native
    
    /**
      * Return `true` if the `open` prop is being controlled
      */
    def _isControllingOpen(): Boolean = js.native
    def _isControllingOpen(props: Any & ReadonlychildrenReactNode): Boolean = js.native
    
    /**
      * Return `true` if the selection behaviour is being controlled
      */
    def _isControllingSelection(): Boolean = js.native
    def _isControllingSelection(props: Any & ReadonlychildrenReactNode): Boolean = js.native
    
    /**
      * Determine if a certain key should open the DropdownLayout
      */
    def _isOpenKey(key: Any): Boolean = js.native
    
    def _open(): Unit = js.native
    
    def _renderChildren(): Any = js.native
    
    var _shouldCloseOnMouseLeave: Boolean = js.native
    
    def _toggle(): Unit = js.native
    
    @JSName("state")
    var state_DropdownBase: ListAutoFocus = js.native
    
    var triggerElementRef: RefObject[Any] = js.native
  }
}
