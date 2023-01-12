package typings.winrt.Windows.Networking.Sockets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebSocketClosedEventArgs extends StObject {
  
  var code: Double
  
  var reason: String
}
object IWebSocketClosedEventArgs {
  
  inline def apply(code: Double, reason: String): IWebSocketClosedEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketClosedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebSocketClosedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
