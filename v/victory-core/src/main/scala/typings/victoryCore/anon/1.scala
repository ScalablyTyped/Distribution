package typings.victoryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var x: Double | js.Date
  
  var y: Double | js.Date
}
object `1` {
  
  inline def apply(x: Double | js.Date, y: Double | js.Date): `1` = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setX(value: Double | js.Date): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double | js.Date): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
