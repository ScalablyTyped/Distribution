package typings.victoryBrushLine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  var max: Width
  
  var min: Width
}
object Max {
  
  inline def apply(max: Width, min: Width): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Width): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Width): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
