package typings.wixStyleReact.anon

import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipSize
import typings.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipTextAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wix-style-react.wix-style-react/dist/types/common.TooltipCommonProps & {  content :react.react.ReactNode | undefined} */
trait TooltipCommonPropscontent extends StObject {
  
  var appendTo: js.UndefOr[typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo] = js.undefined
  
  var content: js.UndefOr[ReactNode] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var enterDelay: js.UndefOr[Double] = js.undefined
  
  var exitDelay: js.UndefOr[Double] = js.undefined
  
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  var flip: js.UndefOr[Boolean] = js.undefined
  
  var maxWidth: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
  ] = js.undefined
  
  var moveArrowTo: js.UndefOr[Double] = js.undefined
  
  var moveBy: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/Popover/Popover.types.PopoverProps['moveBy'] */ js.Any
  ] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var placement: js.UndefOr[typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement] = js.undefined
  
  var size: js.UndefOr[TooltipSize] = js.undefined
  
  var textAlign: js.UndefOr[TooltipTextAlign] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object TooltipCommonPropscontent {
  
  inline def apply(): TooltipCommonPropscontent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipCommonPropscontent]
  }
  
  extension [Self <: TooltipCommonPropscontent](x: Self) {
    
    inline def setAppendTo(value: typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToFunction1(value: /* s */ typings.std.Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
    
    inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
    
    inline def setExitDelay(value: Double): Self = StObject.set(x, "exitDelay", value.asInstanceOf[js.Any])
    
    inline def setExitDelayUndefined: Self = StObject.set(x, "exitDelay", js.undefined)
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    inline def setMaxWidth(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
    ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
    
    inline def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
    
    inline def setMoveBy(
      value: /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/Popover/Popover.types.PopoverProps['moveBy'] */ js.Any
    ): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
    
    inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setPlacement(value: typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setSize(value: TooltipSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTextAlign(value: TooltipTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
