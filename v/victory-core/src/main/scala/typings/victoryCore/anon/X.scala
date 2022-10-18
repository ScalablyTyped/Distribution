package typings.victoryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  var x: Double | js.Date
  
  var y: Double | js.Date
}
object X {
  
  inline def apply(x: Double | js.Date, y: Double | js.Date): X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
  
  extension [Self <: X](x: Self) {
    
    inline def setX(value: Double | js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double | js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
