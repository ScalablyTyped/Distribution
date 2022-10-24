package typings.wixStyleReact.anon

import typings.wixStyleReact.distTypesPopoverPopoverCoreUtilsGetModifiersMod.MoveBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flip extends StObject {
  
  var appendTo: js.UndefOr[typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo] = js.undefined
  
  var dynamicWidth: js.UndefOr[Boolean] = js.undefined
  
  var fixed: js.UndefOr[Boolean] = js.undefined
  
  var flip: js.UndefOr[Boolean] = js.undefined
  
  var isTestEnv: Boolean
  
  var minWidth: js.UndefOr[Double | String] = js.undefined
  
  var moveBy: js.UndefOr[MoveBy] = js.undefined
  
  var placement: Any
  
  var shouldAnimate: Boolean
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object Flip {
  
  inline def apply(isTestEnv: Boolean, placement: Any, shouldAnimate: Boolean): Flip = {
    val __obj = js.Dynamic.literal(isTestEnv = isTestEnv.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldAnimate = shouldAnimate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flip]
  }
  
  extension [Self <: Flip](x: Self) {
    
    inline def setAppendTo(value: typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setAppendToFunction1(value: /* s */ typings.std.Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
    
    inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
    
    inline def setDynamicWidth(value: Boolean): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
    
    inline def setDynamicWidthUndefined: Self = StObject.set(x, "dynamicWidth", js.undefined)
    
    inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
    
    inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
    
    inline def setIsTestEnv(value: Boolean): Self = StObject.set(x, "isTestEnv", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMoveBy(value: MoveBy): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
    
    inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
    
    inline def setPlacement(value: Any): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setShouldAnimate(value: Boolean): Self = StObject.set(x, "shouldAnimate", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
