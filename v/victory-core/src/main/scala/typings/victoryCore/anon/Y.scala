package typings.victoryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Y extends StObject {
  
  var x: Double | js.Date
  
  var y: Double | js.Date
}
object Y {
  
  inline def apply(x: Double | js.Date, y: Double | js.Date): Y = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Y]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Y] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double | js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double | js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
