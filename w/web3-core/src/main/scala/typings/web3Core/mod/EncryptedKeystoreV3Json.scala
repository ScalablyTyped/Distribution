package typings.web3Core.mod

import typings.web3Core.anon.Cipher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptedKeystoreV3Json extends StObject {
  
  var address: String
  
  var crypto: Cipher
  
  var id: String
  
  var version: Double
}
object EncryptedKeystoreV3Json {
  
  @scala.inline
  def apply(address: String, crypto: Cipher, id: String, version: Double): EncryptedKeystoreV3Json = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], crypto = crypto.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedKeystoreV3Json]
  }
  
  @scala.inline
  implicit class EncryptedKeystoreV3JsonMutableBuilder[Self <: EncryptedKeystoreV3Json] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrypto(value: Cipher): Self = StObject.set(x, "crypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
