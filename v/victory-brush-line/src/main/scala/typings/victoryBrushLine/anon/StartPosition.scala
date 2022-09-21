package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPosition extends StObject {
  
  var activeBrushes: Any
  
  var activeHandle: Null
  
  var brushDomain: Any
  
  var isPanning: Boolean
  
  var isSelecting: Boolean
  
  var startPosition: Null
}
object StartPosition {
  
  inline def apply(
    activeBrushes: Any,
    activeHandle: Null,
    brushDomain: Any,
    isPanning: Boolean,
    isSelecting: Boolean,
    startPosition: Null
  ): StartPosition = {
    val __obj = js.Dynamic.literal(activeBrushes = activeBrushes.asInstanceOf[js.Any], activeHandle = activeHandle.asInstanceOf[js.Any], brushDomain = brushDomain.asInstanceOf[js.Any], isPanning = isPanning.asInstanceOf[js.Any], isSelecting = isSelecting.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPosition]
  }
  
  extension [Self <: StartPosition](x: Self) {
    
    inline def setActiveBrushes(value: Any): Self = StObject.set(x, "activeBrushes", value.asInstanceOf[js.Any])
    
    inline def setActiveHandle(value: Null): Self = StObject.set(x, "activeHandle", value.asInstanceOf[js.Any])
    
    inline def setBrushDomain(value: Any): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
    
    inline def setIsPanning(value: Boolean): Self = StObject.set(x, "isPanning", value.asInstanceOf[js.Any])
    
    inline def setIsSelecting(value: Boolean): Self = StObject.set(x, "isSelecting", value.asInstanceOf[js.Any])
    
    inline def setStartPosition(value: Null): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
