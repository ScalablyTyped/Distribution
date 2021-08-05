package typings.vis.anon

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  var max: Date
  
  var min: Date
}
object Max {
  
  inline def apply(max: Date, min: Date): Max = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
  
  extension [Self <: Max](x: Self) {
    
    inline def setMax(value: Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
