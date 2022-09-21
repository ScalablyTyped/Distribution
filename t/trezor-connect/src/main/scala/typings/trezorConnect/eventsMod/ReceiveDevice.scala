package typings.trezorConnect.eventsMod

import typings.trezorConnect.anon.Remember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiveDevice
  extends StObject
     with UiResponse {
  
  var payload: Remember
  
  var `type`: /* "ui-receive_device" */ String
}
object ReceiveDevice {
  
  inline def apply(payload: Remember, `type`: /* "ui-receive_device" */ String): ReceiveDevice = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveDevice]
  }
  
  extension [Self <: ReceiveDevice](x: Self) {
    
    inline def setPayload(value: Remember): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-receive_device" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
