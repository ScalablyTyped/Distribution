package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveHandle extends StObject {
  
  var activeBrushes: Any
  
  var activeHandle: Any
  
  var brushDomain: Any
  
  var isSelecting: Boolean
  
  var parentSVG: Any
  
  var startPosition: Any
}
object ActiveHandle {
  
  inline def apply(
    activeBrushes: Any,
    activeHandle: Any,
    brushDomain: Any,
    isSelecting: Boolean,
    parentSVG: Any,
    startPosition: Any
  ): ActiveHandle = {
    val __obj = js.Dynamic.literal(activeBrushes = activeBrushes.asInstanceOf[js.Any], activeHandle = activeHandle.asInstanceOf[js.Any], brushDomain = brushDomain.asInstanceOf[js.Any], isSelecting = isSelecting.asInstanceOf[js.Any], parentSVG = parentSVG.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveHandle] (val x: Self) extends AnyVal {
    
    inline def setActiveBrushes(value: Any): Self = StObject.set(x, "activeBrushes", value.asInstanceOf[js.Any])
    
    inline def setActiveHandle(value: Any): Self = StObject.set(x, "activeHandle", value.asInstanceOf[js.Any])
    
    inline def setBrushDomain(value: Any): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
    
    inline def setIsSelecting(value: Boolean): Self = StObject.set(x, "isSelecting", value.asInstanceOf[js.Any])
    
    inline def setParentSVG(value: Any): Self = StObject.set(x, "parentSVG", value.asInstanceOf[js.Any])
    
    inline def setStartPosition(value: Any): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
