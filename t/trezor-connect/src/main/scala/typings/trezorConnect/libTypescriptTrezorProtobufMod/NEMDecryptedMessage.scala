package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NEMDecryptedMessage extends StObject {
  
  var payload: String
}
object NEMDecryptedMessage {
  
  inline def apply(payload: String): NEMDecryptedMessage = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[NEMDecryptedMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NEMDecryptedMessage] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
  }
}
