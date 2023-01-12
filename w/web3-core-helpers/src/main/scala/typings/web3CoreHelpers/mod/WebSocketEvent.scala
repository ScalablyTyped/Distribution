package typings.web3CoreHelpers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketEvent extends StObject {
  
  var code: js.UndefOr[Double] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
}
object WebSocketEvent {
  
  inline def apply(): WebSocketEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebSocketEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebSocketEvent] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
