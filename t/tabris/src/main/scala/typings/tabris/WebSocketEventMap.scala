package typings.tabris

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebSocketEventMap extends StObject {
  
  var close: CloseEvent
  
  var error: Event
  
  var message: MessageEvent
  
  var open: Event
}
object WebSocketEventMap {
  
  inline def apply(close: CloseEvent, error: Event, message: MessageEvent, open: Event): WebSocketEventMap = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebSocketEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebSocketEventMap] (val x: Self) extends AnyVal {
    
    inline def setClose(value: CloseEvent): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setError(value: Event): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: MessageEvent): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Event): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
