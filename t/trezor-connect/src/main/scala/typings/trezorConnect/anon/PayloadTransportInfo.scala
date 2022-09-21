package typings.trezorConnect.anon

import typings.trezorConnect.eventsMod.TransportEvent
import typings.trezorConnect.eventsMod.TransportInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadTransportInfo
  extends StObject
     with TransportEvent {
  
  var payload: TransportInfo
  
  var `type`: /* "transport-start" */ String
}
object PayloadTransportInfo {
  
  inline def apply(payload: TransportInfo, `type`: /* "transport-start" */ String): PayloadTransportInfo = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadTransportInfo]
  }
  
  extension [Self <: PayloadTransportInfo](x: Self) {
    
    inline def setPayload(value: TransportInfo): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "transport-start" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
