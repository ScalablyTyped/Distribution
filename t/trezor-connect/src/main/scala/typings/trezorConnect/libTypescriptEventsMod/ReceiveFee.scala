package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.TypeValue
import typings.trezorConnect.anon.Value
import typings.trezorConnect.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiveFee
  extends StObject
     with UiResponse {
  
  var payload: Value | `0` | TypeValue
  
  var `type`: /* "ui-receive_fee" */ String
}
object ReceiveFee {
  
  inline def apply(payload: Value | `0` | TypeValue, `type`: /* "ui-receive_fee" */ String): ReceiveFee = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveFee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReceiveFee] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Value | `0` | TypeValue): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-receive_fee" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
