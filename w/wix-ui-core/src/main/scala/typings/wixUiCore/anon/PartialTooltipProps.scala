package typings.wixUiCore.anon

import typings.react.mod.ReactNode
import typings.wixUiCore.popoverPopoverMod.Placement
import typings.wixUiCore.tooltipNextTooltipNextMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-ui-core.wix-ui-core/dist/src/components/tooltip-next/tooltip-next.TooltipProps> */
trait PartialTooltipProps extends StObject {
  
  var appendTo: js.UndefOr[typings.wixUiCore.popoverPopoverMod.AppendTo] = js.undefined
  
  var `aria-describedby`: js.UndefOr[String] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var content: js.UndefOr[ReactNode] = js.undefined
  
  var customArrow: js.UndefOr[js.Function2[/* placement */ Placement, /* arrowProps */ js.Object, ReactNode]] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  var flip: js.UndefOr[Boolean] = js.undefined
  
  var hideDelay: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var moveArrowTo: js.UndefOr[Double] = js.undefined
  
  var moveBy: js.UndefOr[Point] = js.undefined
  
  var onClickOutside: js.UndefOr[js.Function] = js.undefined
  
  var onHide: js.UndefOr[js.Function] = js.undefined
  
  var onShow: js.UndefOr[js.Function] = js.undefined
  
  var placement: js.UndefOr[Placement] = js.undefined
  
  var shouldCloseOnClickOutside: js.UndefOr[Boolean] = js.undefined
  
  var showArrow: js.UndefOr[Boolean] = js.undefined
  
  var showDelay: js.UndefOr[Double] = js.undefined
  
  var shown: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double | Enter] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object PartialTooltipProps {
  
  @scala.inline
  def apply(): PartialTooltipProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTooltipProps]
  }
  
  @scala.inline
  implicit class PartialTooltipPropsMutableBuilder[Self <: PartialTooltipProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendTo(value: typings.wixUiCore.popoverPopoverMod.AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendToFunction1(value: /* s */ typings.std.Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    @scala.inline
    def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCustomArrow(value: (/* placement */ Placement, /* arrowProps */ js.Object) => ReactNode): Self = StObject.set(x, "customArrow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCustomArrowUndefined: Self = StObject.set(x, "customArrow", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    @scala.inline
    def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    @scala.inline
    def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
    
    @scala.inline
    def setMoveBy(value: Point): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
    
    @scala.inline
    def setOnClickOutside(value: js.Function): Self = StObject.set(x, "onClickOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
    
    @scala.inline
    def setOnHide(value: js.Function): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    @scala.inline
    def setOnShow(value: js.Function): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    @scala.inline
    def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    @scala.inline
    def setShouldCloseOnClickOutside(value: Boolean): Self = StObject.set(x, "shouldCloseOnClickOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldCloseOnClickOutsideUndefined: Self = StObject.set(x, "shouldCloseOnClickOutside", js.undefined)
    
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
    def setShownUndefined: Self = StObject.set(x, "shown", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double | Enter): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
