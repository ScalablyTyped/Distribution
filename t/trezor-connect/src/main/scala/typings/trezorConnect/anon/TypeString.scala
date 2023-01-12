package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptEventsMod.DeviceMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeString
  extends StObject
     with DeviceMessage {
  
  var payload: Type
  
  var `type`: /* "ui-request_word" */ String
}
object TypeString {
  
  inline def apply(payload: Type, `type`: /* "ui-request_word" */ String): TypeString = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeString] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Type): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-request_word" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
