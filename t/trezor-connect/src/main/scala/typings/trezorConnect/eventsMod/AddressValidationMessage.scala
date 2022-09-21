package typings.trezorConnect.eventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressValidationMessage extends StObject {
  
  var payload: js.UndefOr[ButtonRequestData] = js.undefined
  
  var `type`: /* "ui-address_validation" */ String
}
object AddressValidationMessage {
  
  inline def apply(`type`: /* "ui-address_validation" */ String): AddressValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressValidationMessage]
  }
  
  extension [Self <: AddressValidationMessage](x: Self) {
    
    inline def setPayload(value: ButtonRequestData): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setType(value: /* "ui-address_validation" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
