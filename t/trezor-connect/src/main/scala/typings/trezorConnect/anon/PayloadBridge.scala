package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptEventsMod.TransportEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadBridge
  extends StObject
     with TransportEvent {
  
  var payload: Bridge
  
  var `type`: /* "transport-error" */ String
}
object PayloadBridge {
  
  inline def apply(payload: Bridge, `type`: /* "transport-error" */ String): PayloadBridge = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadBridge]
  }
  
  extension [Self <: PayloadBridge](x: Self) {
    
    inline def setPayload(value: Bridge): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "transport-error" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
