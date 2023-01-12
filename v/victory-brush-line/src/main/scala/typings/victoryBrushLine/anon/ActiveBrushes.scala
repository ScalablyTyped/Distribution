package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveBrushes extends StObject {
  
  var activeBrushes: Brush
  
  var brushDomain: Any
  
  var parentSVG: Any
}
object ActiveBrushes {
  
  inline def apply(activeBrushes: Brush, brushDomain: Any, parentSVG: Any): ActiveBrushes = {
    val __obj = js.Dynamic.literal(activeBrushes = activeBrushes.asInstanceOf[js.Any], brushDomain = brushDomain.asInstanceOf[js.Any], parentSVG = parentSVG.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveBrushes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveBrushes] (val x: Self) extends AnyVal {
    
    inline def setActiveBrushes(value: Brush): Self = StObject.set(x, "activeBrushes", value.asInstanceOf[js.Any])
    
    inline def setBrushDomain(value: Any): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
    
    inline def setParentSVG(value: Any): Self = StObject.set(x, "parentSVG", value.asInstanceOf[js.Any])
  }
}
