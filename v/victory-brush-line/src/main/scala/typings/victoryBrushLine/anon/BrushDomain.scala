package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrushDomain extends StObject {
  
  var activeBrushes: Any
  
  var brushDomain: Any
  
  var isPanning: Any
  
  var parentSVG: Any
  
  var startPosition: Any
}
object BrushDomain {
  
  inline def apply(activeBrushes: Any, brushDomain: Any, isPanning: Any, parentSVG: Any, startPosition: Any): BrushDomain = {
    val __obj = js.Dynamic.literal(activeBrushes = activeBrushes.asInstanceOf[js.Any], brushDomain = brushDomain.asInstanceOf[js.Any], isPanning = isPanning.asInstanceOf[js.Any], parentSVG = parentSVG.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrushDomain]
  }
  
  extension [Self <: BrushDomain](x: Self) {
    
    inline def setActiveBrushes(value: Any): Self = StObject.set(x, "activeBrushes", value.asInstanceOf[js.Any])
    
    inline def setBrushDomain(value: Any): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
    
    inline def setIsPanning(value: Any): Self = StObject.set(x, "isPanning", value.asInstanceOf[js.Any])
    
    inline def setParentSVG(value: Any): Self = StObject.set(x, "parentSVG", value.asInstanceOf[js.Any])
    
    inline def setStartPosition(value: Any): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
