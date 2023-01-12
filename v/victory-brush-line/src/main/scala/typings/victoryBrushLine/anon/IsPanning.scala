package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPanning extends StObject {
  
  var activeBrushes: BrushBoolean
  
  var brushDomain: js.Array[Any]
  
  var isPanning: Boolean
  
  var parentSVG: Any
  
  var startPosition: Any
}
object IsPanning {
  
  inline def apply(
    activeBrushes: BrushBoolean,
    brushDomain: js.Array[Any],
    isPanning: Boolean,
    parentSVG: Any,
    startPosition: Any
  ): IsPanning = {
    val __obj = js.Dynamic.literal(activeBrushes = activeBrushes.asInstanceOf[js.Any], brushDomain = brushDomain.asInstanceOf[js.Any], isPanning = isPanning.asInstanceOf[js.Any], parentSVG = parentSVG.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPanning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsPanning] (val x: Self) extends AnyVal {
    
    inline def setActiveBrushes(value: BrushBoolean): Self = StObject.set(x, "activeBrushes", value.asInstanceOf[js.Any])
    
    inline def setBrushDomain(value: js.Array[Any]): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
    
    inline def setBrushDomainVarargs(value: Any*): Self = StObject.set(x, "brushDomain", js.Array(value*))
    
    inline def setIsPanning(value: Boolean): Self = StObject.set(x, "isPanning", value.asInstanceOf[js.Any])
    
    inline def setParentSVG(value: Any): Self = StObject.set(x, "parentSVG", value.asInstanceOf[js.Any])
    
    inline def setStartPosition(value: Any): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
  }
}
