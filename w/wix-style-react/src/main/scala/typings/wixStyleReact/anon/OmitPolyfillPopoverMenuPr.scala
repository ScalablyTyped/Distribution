package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesCommonMod.MoveByOffset
import typings.wixStyleReact.wixStyleReactStrings.medium
import typings.wixStyleReact.wixStyleReactStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined wix-style-react.wix-style-react/dist/types/common.OmitPolyfill<wix-style-react.wix-style-react/dist/types/PopoverMenu.PopoverMenuProps, 'triggerElement' | 'children' | 'dataHook' | 'className'> */
trait OmitPolyfillPopoverMenuPr extends StObject {
  
  var appendTo: js.UndefOr[typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo] = js.undefined
  
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  var flip: js.UndefOr[Boolean] = js.undefined
  
  var fluid: js.UndefOr[Boolean] = js.undefined
  
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  
  var maxWidth: js.UndefOr[typings.csstype.mod.Property.MaxWidth[String | Double]] = js.undefined
  
  var minWidth: js.UndefOr[typings.csstype.mod.Property.MinWidth[String | Double]] = js.undefined
  
  var moveBy: js.UndefOr[MoveByOffset] = js.undefined
  
  var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var placement: js.UndefOr[typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement] = js.undefined
  
  var showArrow: js.UndefOr[Boolean] = js.undefined
  
  var textSize: js.UndefOr[small | medium] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object OmitPolyfillPopoverMenuPr {
  
  inline def apply(): OmitPolyfillPopoverMenuPr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPolyfillPopoverMenuPr]
  }
  
  extension [Self <: OmitPolyfillPopoverMenuPr](x: Self) {
    
    inline def setAppendTo(value: typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToFunction1(value: /* s */ typings.std.Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
    
    inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
    
    inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
    
    inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: typings.csstype.mod.Property.MaxWidth[String | Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinWidth(value: typings.csstype.mod.Property.MinWidth[String | Double]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMoveBy(value: MoveByOffset): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
    
    inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setPlacement(value: typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
    
    inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
    
    inline def setTextSize(value: small | medium): Self = StObject.set(x, "textSize", value.asInstanceOf[js.Any])
    
    inline def setTextSizeUndefined: Self = StObject.set(x, "textSize", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
