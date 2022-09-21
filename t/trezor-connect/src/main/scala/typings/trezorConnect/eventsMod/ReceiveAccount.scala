package typings.trezorConnect.eventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiveAccount
  extends StObject
     with UiResponse {
  
  var payload: js.UndefOr[Double] = js.undefined
  
  var `type`: /* "ui-receive_account" */ String
}
object ReceiveAccount {
  
  inline def apply(`type`: /* "ui-receive_account" */ String): ReceiveAccount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveAccount]
  }
  
  extension [Self <: ReceiveAccount](x: Self) {
    
    inline def setPayload(value: Double): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setType(value: /* "ui-receive_account" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
