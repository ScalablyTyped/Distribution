package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedMessage extends StObject {
  
  var address: String = js.native
  
  // signer address
  var signature: String = js.native
}
object SignedMessage {
  
  @scala.inline
  def apply(address: String, signature: String): SignedMessage = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedMessage]
  }
  
  @scala.inline
  implicit class SignedMessageMutableBuilder[Self <: SignedMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
