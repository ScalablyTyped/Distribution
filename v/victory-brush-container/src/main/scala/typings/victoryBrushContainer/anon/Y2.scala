package typings.victoryBrushContainer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y2 extends StObject {
  
  var x1: Any
  
  var x2: Any
  
  var y1: Any
  
  var y2: Any
}
object Y2 {
  
  inline def apply(x1: Any, x2: Any, y1: Any, y2: Any): Y2 = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y2]
  }
  
  extension [Self <: Y2](x: Self) {
    
    inline def setX1(value: Any): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    inline def setX2(value: Any): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    inline def setY1(value: Any): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    inline def setY2(value: Any): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
