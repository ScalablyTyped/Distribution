package typings.tablestore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxSockets extends StObject {
  
  var maxSockets: Double
  
  var timeout: Double
}
object MaxSockets {
  
  inline def apply(maxSockets: Double, timeout: Double): MaxSockets = {
    val __obj = js.Dynamic.literal(maxSockets = maxSockets.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxSockets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxSockets] (val x: Self) extends AnyVal {
    
    inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
