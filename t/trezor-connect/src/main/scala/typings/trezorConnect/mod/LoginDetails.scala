package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginDetails extends StObject {
  
  var address: String
  
  var publicKey: String
  
  var signature: String
}
object LoginDetails {
  
  @scala.inline
  def apply(address: String, publicKey: String, signature: String): LoginDetails = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginDetails]
  }
  
  @scala.inline
  implicit class LoginDetailsMutableBuilder[Self <: LoginDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicKey(value: String): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
