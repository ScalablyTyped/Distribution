package typings.wixUiCore

import typings.popperJs.mod.Boundary
import typings.popperJs.mod.Placement
import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.wixUiCore.anon.Enter
import typings.wixUiCore.anon.Fixed
import typings.wixUiCore.getAppendToElementMod.Predicate
import typings.wixUiCore.getModifiersMod.MoveBy
import typings.wixUiCore.srcUtilsMod.ElementProps
import typings.wixUiCore.wixUiCoreStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverNextPopoverNextMod {
  
  @JSImport("wix-ui-core/dist/src/components/popover-next/popover-next", "PopoverNext")
  @js.native
  class PopoverNext protected ()
    extends Component[PopoverNextProps, PopoverNextState, js.Any] {
    def this(props: js.Any) = this()
    
    def _handleClickOutside(): Unit = js.native
    
    var _hideTimeout: js.Any = js.native
    
    var _showTimeout: js.Any = js.native
    
    var appendToNode: HTMLElement = js.native
    
    def applyStylesToPortaledNode(): Unit = js.native
    
    var clickOutsideRef: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPopoverNext(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPopoverNext(prevProps: js.Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPopoverNext(): Unit = js.native
    
    var contentHook: String = js.native
    
    def hidePopover(): Unit = js.native
    
    def initAppendToNode(): Unit = js.native
    
    def popperScheduleUpdate(): Unit = js.native
    
    var portalClasses: String = js.native
    
    var portalNode: HTMLElement = js.native
    
    def recoverFromError(event: js.Any): Unit = js.native
    
    def renderPopperContent(childrenObject: js.Any): Element = js.native
    
    def showPopover(): Unit = js.native
    
    var targetRef: HTMLElement = js.native
    
    def updatePosition(): Unit = js.native
  }
  /* static members */
  object PopoverNext {
    
    @JSImport("wix-ui-core/dist/src/components/popover-next/popover-next", "PopoverNext")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/popover-next/popover-next", "PopoverNext.Content")
    @js.native
    def Content: FunctionComponent[ElementProps] = js.native
    @scala.inline
    def Content_=(x: FunctionComponent[ElementProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/popover-next/popover-next", "PopoverNext.Element")
    @js.native
    def Element: FunctionComponent[ElementProps] = js.native
    @scala.inline
    def Element_=(x: FunctionComponent[ElementProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/popover-next/popover-next", "PopoverNext.defaultProps")
    @js.native
    def defaultProps: Fixed = js.native
    @scala.inline
    def defaultProps_=(x: Fixed): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/popover-next/popover-next", "PopoverNext.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait PopoverNextProps extends StObject {
    
    /** Enables calculations in relation to a dom element */
    var appendTo: js.UndefOr[Boundary | parent | typings.std.Element | Predicate] = js.undefined
    
    /** custom classname */
    var className: js.UndefOr[String] = js.undefined
    
    /** Custom arrow element */
    var customArrow: js.UndefOr[js.Function2[/* placement */ Placement, /* arrowProps */ js.Object, ReactNode]] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /**
      * popovers content is set to minnimum width of trigger element,
      * but it can expand up to the value of maxWidth.
      */
    var dynamicWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Clicking on elements with this excluded class will will not trigger onClickOutside callback
      */
    var excludeClass: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to enable the fixed behaviour. This behaviour is used to keep the `<Popover/>` at it's
      * original placement even when it's being positioned outside the boundary.
      */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to enable the flip behaviour. This behaviour is used to flip the `<Popover/>`'s placement
      * when it starts to overlap the target element (`<Popover.Element/>`).
      */
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** Hide Delay in ms */
    var hideDelay: js.UndefOr[Double] = js.undefined
    
    /** Id */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * popover content maxWidth value
      * - `number` value which converts to css with `px`
      * - `string` value that contains `px`
      */
    var maxWidth: js.UndefOr[Double | String] = js.undefined
    
    /**
      * popover content minWidth value
      * - `number` value which converts to css with `px`
      * - `string` value that contains `px`
      */
    var minWidth: js.UndefOr[Double | String] = js.undefined
    
    /** Moves arrow by amount */
    var moveArrowTo: js.UndefOr[Double] = js.undefined
    
    /** Moves popover relative to the parent */
    var moveBy: js.UndefOr[MoveBy] = js.undefined
    
    /** onClick on the component */
    var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    /** Provides callback to invoke when clicked outside of the popover */
    var onClickOutside: js.UndefOr[js.Function] = js.undefined
    
    /** onKeyDown on the target component */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.undefined
    
    /** onMouseEnter on the component */
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    /** onMouseLeave on the component */
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
    
    /** The location to display the content */
    var placement: Placement
    
    /** target element role value */
    var role: js.UndefOr[String] = js.undefined
    
    /** Show show arrow from the content */
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    /** Show Delay in ms */
    var showDelay: js.UndefOr[Double] = js.undefined
    
    /** Is the content shown or not */
    var shown: Boolean
    
    /** Inline style */
    var style: js.UndefOr[js.Object] = js.undefined
    
    /** Animation timer */
    var timeout: js.UndefOr[Double | Enter] = js.undefined
    
    /**
      * popover content width value
      * - `number` value which converts to css with `px`
      * - `string` value that contains `px`
      */
    var width: js.UndefOr[Double | String] = js.undefined
    
    /** popover z-index */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PopoverNextProps {
    
    @scala.inline
    def apply(placement: Placement, shown: Boolean): PopoverNextProps = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverNextProps]
    }
    
    @scala.inline
    implicit class PopoverNextPropsMutableBuilder[Self <: PopoverNextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: Boundary | parent | typings.std.Element | Predicate): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToFunction1(value: /* s */ typings.std.Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCustomArrow(value: (/* placement */ Placement, /* arrowProps */ js.Object) => ReactNode): Self = StObject.set(x, "customArrow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCustomArrowUndefined: Self = StObject.set(x, "customArrow", js.undefined)
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setDynamicWidth(value: Boolean): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicWidthUndefined: Self = StObject.set(x, "dynamicWidth", js.undefined)
      
      @scala.inline
      def setExcludeClass(value: String): Self = StObject.set(x, "excludeClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeClassUndefined: Self = StObject.set(x, "excludeClass", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      @scala.inline
      def setMoveBy(value: MoveBy): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickOutside(value: js.Function): Self = StObject.set(x, "onClickOutside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      @scala.inline
      def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
      
      @scala.inline
      def setShown(value: Boolean): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double | Enter): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait PopoverNextState extends StObject {
    
    var cacheId: Double
    
    var isMounted: Boolean
    
    var loaded: Boolean
    
    var shown: Boolean
  }
  object PopoverNextState {
    
    @scala.inline
    def apply(cacheId: Double, isMounted: Boolean, loaded: Boolean, shown: Boolean): PopoverNextState = {
      val __obj = js.Dynamic.literal(cacheId = cacheId.asInstanceOf[js.Any], isMounted = isMounted.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverNextState]
    }
    
    @scala.inline
    implicit class PopoverNextStateMutableBuilder[Self <: PopoverNextState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheId(value: Double): Self = StObject.set(x, "cacheId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShown(value: Boolean): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopoverNextType
    extends StObject
       with PopoverNextProps {
    
    var Content: js.UndefOr[FunctionComponent[ElementProps]] = js.undefined
    
    var Element: js.UndefOr[FunctionComponent[ElementProps]] = js.undefined
  }
  object PopoverNextType {
    
    @scala.inline
    def apply(placement: Placement, shown: Boolean): PopoverNextType = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverNextType]
    }
    
    @scala.inline
    implicit class PopoverNextTypeMutableBuilder[Self <: PopoverNextType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: FunctionComponent[ElementProps]): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
      
      @scala.inline
      def setElement(value: FunctionComponent[ElementProps]): Self = StObject.set(x, "Element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "Element", js.undefined)
    }
  }
}
