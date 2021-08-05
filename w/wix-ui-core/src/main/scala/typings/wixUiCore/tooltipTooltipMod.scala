package typings.wixUiCore

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.wixUiCore.anon.Enter
import typings.wixUiCore.anon.IsOpenBoolean
import typings.wixUiCore.anon.PartialTooltipPropsAppendTo
import typings.wixUiCore.popoverPopoverMod.AppendTo
import typings.wixUiCore.popoverPopoverMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipTooltipMod {
  
  @JSImport("wix-ui-core/dist/src/components/tooltip/Tooltip", "Tooltip")
  @js.native
  class Tooltip protected ()
    extends PureComponent[TooltipProps, TooltipState, js.Any] {
    def this(props: TooltipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TooltipProps, context: js.Any) = this()
    
    def _handleClickOutside(): js.Any = js.native
    
    def _onBlur(event: js.Any, handlers: js.Any): js.Any = js.native
    
    def _onFocus(event: js.Any, handlers: js.Any): js.Any = js.native
    
    def _renderElement(): js.Object = js.native
    
    def close(): Unit = js.native
    
    def isShown(): Boolean = js.native
    
    def open(): Unit = js.native
    
    @JSName("state")
    var state_Tooltip: IsOpenBoolean = js.native
  }
  /* static members */
  object Tooltip {
    
    @JSImport("wix-ui-core/dist/src/components/tooltip/Tooltip", "Tooltip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/tooltip/Tooltip", "Tooltip.defaultProps")
    @js.native
    def defaultProps: PartialTooltipPropsAppendTo = js.native
    inline def defaultProps_=(x: PartialTooltipPropsAppendTo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/tooltip/Tooltip", "Tooltip.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait Point extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object Point {
    
    inline def apply(x: Double, y: Double): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipProps extends StObject {
    
    /** Enables calculations in relation to the parent element*/
    var appendTo: js.UndefOr[AppendTo] = js.undefined
    
    /** unique identifier to map target element and content element for screen readers */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /** children to render that will be the target of the tooltip */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** the content to put inside the tooltip */
    var content: js.UndefOr[ReactNode] = js.undefined
    
    /** Custom arrow element */
    var customArrow: js.UndefOr[js.Function2[/* placement */ Placement, /* arrowProps */ js.Object, ReactNode]] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** disabled tooltip showup on mouse enter */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** whether to enable the fixed behaviour. This behaviour is used to keep the Tooltip at it's original placement even when it's being positioned outside the boundary. */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /** whether to enable the flip behaviour. This behaviour is used to flip the Tooltips placement when it starts to overlap the target element. */
    var flip: js.UndefOr[Boolean] = js.undefined
    
    /** time in milliseconds to wait before hiding the tooltip. */
    var hideDelay: js.UndefOr[Double] = js.undefined
    
    /** content element maxWidth value */
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    /** content element minWidth value */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    /** offset for the arrow */
    var moveArrowTo: js.UndefOr[Double] = js.undefined
    
    /** object that describes re-positioning of the tooltip */
    var moveBy: js.UndefOr[Point] = js.undefined
    
    /** Provides callback to invoke when outside of tooltip is clicked */
    var onClickOutside: js.UndefOr[js.Function] = js.undefined
    
    /** callback to call when the tooltip is being hidden */
    var onHide: js.UndefOr[js.Function] = js.undefined
    
    /** callback to call when the tooltip is shown */
    var onShow: js.UndefOr[js.Function] = js.undefined
    
    /** tooltip's placement in relation to the target element */
    var placement: js.UndefOr[Placement] = js.undefined
    
    /** If true, makes tooltip close when clicked outside (incase it was open) */
    var shouldCloseOnClickOutside: js.UndefOr[Boolean] = js.undefined
    
    /** If true, shows the tooltip arrow */
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    /** time in milliseconds to wait before showing the tooltip. */
    var showDelay: js.UndefOr[Double] = js.undefined
    
    /** shows tooltip when true. This makes Tooltip controlled */
    var shown: js.UndefOr[Boolean] = js.undefined
    
    /** Animation timer */
    var timeout: js.UndefOr[Double | Enter] = js.undefined
    
    /** Tooltip's content zindex */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setAppendTo(value: AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToFunction1(value: /* s */ Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCustomArrow(value: (/* placement */ Placement, /* arrowProps */ js.Object) => ReactNode): Self = StObject.set(x, "customArrow", js.Any.fromFunction2(value))
      
      inline def setCustomArrowUndefined: Self = StObject.set(x, "customArrow", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
      
      inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      inline def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      inline def setMoveBy(value: Point): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnClickOutside(value: js.Function): Self = StObject.set(x, "onClickOutside", value.asInstanceOf[js.Any])
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: js.Function): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setShouldCloseOnClickOutside(value: Boolean): Self = StObject.set(x, "shouldCloseOnClickOutside", value.asInstanceOf[js.Any])
      
      inline def setShouldCloseOnClickOutsideUndefined: Self = StObject.set(x, "shouldCloseOnClickOutside", js.undefined)
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
      
      inline def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
      
      inline def setShown(value: Boolean): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
      
      inline def setShownUndefined: Self = StObject.set(x, "shown", js.undefined)
      
      inline def setTimeout(value: Double | Enter): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait TooltipState extends StObject {
    
    var isOpen: Boolean
  }
  object TooltipState {
    
    inline def apply(isOpen: Boolean): TooltipState = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipState]
    }
    
    extension [Self <: TooltipState](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
