package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentSVG extends StObject {
  
  var activeBrushes: MaxHandle
  
  var activeHandle: Any
  
  var brushDomain: Any
  
  var isSelecting: Any
  
  var parentSVG: Any
  
  var startPosition: Any
}
object ParentSVG {
  
  inline def apply(
    activeBrushes: MaxHandle,
    activeHandle: Any,
    brushDomain: Any,
    isSelecting: Any,
    parentSVG: Any,
    startPosition: Any
  ): ParentSVG = {
    val __obj = js.Dynamic.literal(activeBrushes = activeBrushes.asInstanceOf[js.Any], activeHandle = activeHandle.asInstanceOf[js.Any], brushDomain = brushDomain.asInstanceOf[js.Any], isSelecting = isSelecting.asInstanceOf[js.Any], parentSVG = parentSVG.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentSVG]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentSVG] (val x: Self) extends AnyVal {
    
    inline def setActiveBrushes(value: MaxHandle): Self = StObject.set(x, "activeBrushes", value.asInstanceOf[js.Any])
    
    inline def setActiveHandle(value: Any): Self = StObject.set(x, "activeHandle", value.asInstanceOf[js.Any])
    
    inline def setBrushDomain(value: Any): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
    
    inline def setIsSelecting(value: Any): Self = StObject.set(x, "isSelecting", value.asInstanceOf[js.Any])
    
    inline def setParentSVG(value: Any): Self = StObject.set(x, "parentSVG", value.asInstanceOf[js.Any])
    
    inline def setStartPosition(value: Any): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
