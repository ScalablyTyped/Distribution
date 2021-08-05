package typings.wixUiCore

import typings.popperJs.mod.Boundary
import typings.popperJs.mod.Placement
import typings.popperJs.mod.Popper.Modifiers
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsGetModifiersMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover/utils/getModifiers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModifiers(
    hasWidthMoveByAppendToShouldAnimateFlipFixedPlacementIsTestEnvMinWidthDynamicWidth: ModifiersParams
  ): Modifiers = ^.asInstanceOf[js.Dynamic].applyDynamic("getModifiers")(hasWidthMoveByAppendToShouldAnimateFlipFixedPlacementIsTestEnvMinWidthDynamicWidth.asInstanceOf[js.Any]).asInstanceOf[Modifiers]
  
  trait ModifiersParams extends StObject {
    
    var appendTo: js.UndefOr[Boundary | Element] = js.undefined
    
    var dynamicWidth: js.UndefOr[Boolean] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var isTestEnv: Boolean
    
    var minWidth: js.UndefOr[String | Double] = js.undefined
    
    var moveBy: js.UndefOr[MoveBy] = js.undefined
    
    var placement: Placement
    
    var shouldAnimate: Boolean
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object ModifiersParams {
    
    inline def apply(isTestEnv: Boolean, placement: Placement, shouldAnimate: Boolean): ModifiersParams = {
      val __obj = js.Dynamic.literal(isTestEnv = isTestEnv.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldAnimate = shouldAnimate.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModifiersParams]
    }
    
    extension [Self <: ModifiersParams](x: Self) {
      
      inline def setAppendTo(value: Boundary | Element): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setDynamicWidth(value: Boolean): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
      
      inline def setDynamicWidthUndefined: Self = StObject.set(x, "dynamicWidth", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setIsTestEnv(value: Boolean): Self = StObject.set(x, "isTestEnv", value.asInstanceOf[js.Any])
      
      inline def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMoveBy(value: MoveBy): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setShouldAnimate(value: Boolean): Self = StObject.set(x, "shouldAnimate", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Inlined std.Partial<{  x :number,   y :number}> */
  trait MoveBy extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object MoveBy {
    
    inline def apply(): MoveBy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveBy]
    }
    
    extension [Self <: MoveBy](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
