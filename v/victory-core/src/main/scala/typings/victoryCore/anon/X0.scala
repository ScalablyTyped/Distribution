package typings.victoryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X0 extends StObject {
  
  var x: Any
  
  var x0: Any
  
  var y: Any
  
  var y0: Any
}
object X0 {
  
  inline def apply(x: Any, x0: Any, y: Any, y0: Any): X0 = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[X0]
  }
  
  extension [Self <: X0](x: Self) {
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX0(value: Any): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Any): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
  }
}
