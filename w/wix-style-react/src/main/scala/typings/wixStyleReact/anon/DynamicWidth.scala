package typings.wixStyleReact.anon

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicWidth extends StObject {
  
  var appendTo: Requireable[String]
  
  var dynamicWidth: Requireable[Boolean]
  
  var fixed: Requireable[Boolean]
  
  var flip: Requireable[Boolean]
  
  var hideDelay: Requireable[Double]
  
  var maxWidth: Requireable[String | Double]
  
  var minWidth: Requireable[String | Double]
  
  var moveArrowTo: Requireable[Double]
  
  var moveBy: Requireable[InferProps[X]]
  
  var onMouseEnter: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var placement: Requireable[String]
  
  var showDelay: Requireable[Double]
  
  var timeout: Requireable[Double | InferProps[Enter]]
  
  var width: Requireable[String | Double]
  
  var zIndex: Requireable[Double]
}
object DynamicWidth {
  
  inline def apply(
    appendTo: Requireable[String],
    dynamicWidth: Requireable[Boolean],
    fixed: Requireable[Boolean],
    flip: Requireable[Boolean],
    hideDelay: Requireable[Double],
    maxWidth: Requireable[String | Double],
    minWidth: Requireable[String | Double],
    moveArrowTo: Requireable[Double],
    moveBy: Requireable[InferProps[X]],
    onMouseEnter: Requireable[js.Function1[/* repeated */ Any, Any]],
    onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]],
    placement: Requireable[String],
    showDelay: Requireable[Double],
    timeout: Requireable[Double | InferProps[Enter]],
    width: Requireable[String | Double],
    zIndex: Requireable[Double]
  ): DynamicWidth = {
    val __obj = js.Dynamic.literal(appendTo = appendTo.asInstanceOf[js.Any], dynamicWidth = dynamicWidth.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], flip = flip.asInstanceOf[js.Any], hideDelay = hideDelay.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], moveArrowTo = moveArrowTo.asInstanceOf[js.Any], moveBy = moveBy.asInstanceOf[js.Any], onMouseEnter = onMouseEnter.asInstanceOf[js.Any], onMouseLeave = onMouseLeave.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], showDelay = showDelay.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicWidth]
  }
  
  extension [Self <: DynamicWidth](x: Self) {
    
    inline def setAppendTo(value: Requireable[String]): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
    
    inline def setDynamicWidth(value: Requireable[Boolean]): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
    
    inline def setFixed(value: Requireable[Boolean]): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
    
    inline def setFlip(value: Requireable[Boolean]): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
    
    inline def setHideDelay(value: Requireable[Double]): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Requireable[String | Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Requireable[String | Double]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMoveArrowTo(value: Requireable[Double]): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
    
    inline def setMoveBy(value: Requireable[InferProps[X]]): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnter(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def setOnMouseLeave(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: Requireable[String]): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setShowDelay(value: Requireable[Double]): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Requireable[Double | InferProps[Enter]]): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Requireable[String | Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Requireable[Double]): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
  }
}
