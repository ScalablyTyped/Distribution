package typings.trezorConnect.eventsMod

import typings.trezorConnect.anon.Granted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceivePermission
  extends StObject
     with UiResponse {
  
  var payload: Granted
  
  var `type`: /* "ui-receive_permission" */ String
}
object ReceivePermission {
  
  inline def apply(payload: Granted, `type`: /* "ui-receive_permission" */ String): ReceivePermission = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivePermission]
  }
  
  extension [Self <: ReceivePermission](x: Self) {
    
    inline def setPayload(value: Granted): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-receive_permission" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
