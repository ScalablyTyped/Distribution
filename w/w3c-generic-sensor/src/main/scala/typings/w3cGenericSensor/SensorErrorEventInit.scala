package typings.w3cGenericSensor

import typings.std.Error
import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SensorErrorEventInit
  extends StObject
     with EventInit {
  
  var error: Error
}
object SensorErrorEventInit {
  
  inline def apply(error: Error): SensorErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[SensorErrorEventInit]
  }
  
  extension [Self <: SensorErrorEventInit](x: Self) {
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
