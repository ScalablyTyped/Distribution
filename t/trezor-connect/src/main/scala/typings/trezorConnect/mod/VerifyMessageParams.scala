package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifyMessageParams
  extends StObject
     with CommonParams {
  
  var address: String
  
  var coin: String
  
  var message: String
  
  var signature: String
}
object VerifyMessageParams {
  
  @scala.inline
  def apply(address: String, coin: String, message: String, signature: String): VerifyMessageParams = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], coin = coin.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyMessageParams]
  }
  
  @scala.inline
  implicit class VerifyMessageParamsMutableBuilder[Self <: VerifyMessageParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
