package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: /* "BLOCKCHAIN_EVENT" */ String
}
object Event {
  
  inline def apply(event: /* "BLOCKCHAIN_EVENT" */ String): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: /* "BLOCKCHAIN_EVENT" */ String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
