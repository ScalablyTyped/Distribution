package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSelecting extends StObject {
  
  var activeBrushes: Any
  
  var brushDomain: Null
  
  var isSelecting: Any
  
  var parentSVG: Any
  
  var startPosition: Any
}
object IsSelecting {
  
  inline def apply(activeBrushes: Any, brushDomain: Null, isSelecting: Any, parentSVG: Any, startPosition: Any): IsSelecting = {
    val __obj = js.Dynamic.literal(activeBrushes = activeBrushes.asInstanceOf[js.Any], brushDomain = brushDomain.asInstanceOf[js.Any], isSelecting = isSelecting.asInstanceOf[js.Any], parentSVG = parentSVG.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsSelecting]
  }
  
  extension [Self <: IsSelecting](x: Self) {
    
    inline def setActiveBrushes(value: Any): Self = StObject.set(x, "activeBrushes", value.asInstanceOf[js.Any])
    
    inline def setBrushDomain(value: Null): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
    
    inline def setIsSelecting(value: Any): Self = StObject.set(x, "isSelecting", value.asInstanceOf[js.Any])
    
    inline def setParentSVG(value: Any): Self = StObject.set(x, "parentSVG", value.asInstanceOf[js.Any])
    
    inline def setStartPosition(value: Any): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
