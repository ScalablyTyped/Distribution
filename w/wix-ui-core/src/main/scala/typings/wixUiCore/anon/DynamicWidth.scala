package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicWidth extends StObject {
  
  var appendTo: js.Any
  
  var dynamicWidth: js.Any
  
  var fixed: js.Any
  
  var flip: js.Any
  
  var isTestEnv: js.Any
  
  var minWidth: js.Any
  
  var moveBy: js.Any
  
  var placement: js.Any
  
  var shouldAnimate: js.Any
  
  var width: js.Any
}
object DynamicWidth {
  
  @scala.inline
  def apply(
    appendTo: js.Any,
    dynamicWidth: js.Any,
    fixed: js.Any,
    flip: js.Any,
    isTestEnv: js.Any,
    minWidth: js.Any,
    moveBy: js.Any,
    placement: js.Any,
    shouldAnimate: js.Any,
    width: js.Any
  ): DynamicWidth = {
    val __obj = js.Dynamic.literal(appendTo = appendTo.asInstanceOf[js.Any], dynamicWidth = dynamicWidth.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], isTestEnv = isTestEnv.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], moveBy = moveBy.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldAnimate = shouldAnimate.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicWidth]
  }
  
  @scala.inline
  implicit class DynamicWidthMutableBuilder[Self <: DynamicWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendTo(value: js.Any): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicWidth(value: js.Any): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixed(value: js.Any): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlip(value: js.Any): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTestEnv(value: js.Any): Self = StObject.set(x, "isTestEnv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidth(value: js.Any): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveBy(value: js.Any): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: js.Any): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldAnimate(value: js.Any): Self = StObject.set(x, "shouldAnimate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
