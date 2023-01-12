package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveBrushesActiveHandle extends StObject {
  
  var activeHandle: Null
  
  var brushDomain: Any
  
  var isPanning: Boolean
  
  var isSelecting: Boolean
  
  var startPosition: Null
}
object ActiveBrushesActiveHandle {
  
  inline def apply(
    activeHandle: Null,
    brushDomain: Any,
    isPanning: Boolean,
    isSelecting: Boolean,
    startPosition: Null
  ): ActiveBrushesActiveHandle = {
    val __obj = js.Dynamic.literal(activeHandle = activeHandle.asInstanceOf[js.Any], brushDomain = brushDomain.asInstanceOf[js.Any], isPanning = isPanning.asInstanceOf[js.Any], isSelecting = isSelecting.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveBrushesActiveHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveBrushesActiveHandle] (val x: Self) extends AnyVal {
    
    inline def setActiveHandle(value: Null): Self = StObject.set(x, "activeHandle", value.asInstanceOf[js.Any])
    
    inline def setBrushDomain(value: Any): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
    
    inline def setIsPanning(value: Boolean): Self = StObject.set(x, "isPanning", value.asInstanceOf[js.Any])
    
    inline def setIsSelecting(value: Boolean): Self = StObject.set(x, "isSelecting", value.asInstanceOf[js.Any])
    
    inline def setStartPosition(value: Null): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
