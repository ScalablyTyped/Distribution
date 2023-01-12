package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CipherKeyValue extends StObject {
  
  var address_n: js.Array[Double]
  
  var ask_on_decrypt: js.UndefOr[Boolean] = js.undefined
  
  var ask_on_encrypt: js.UndefOr[Boolean] = js.undefined
  
  var encrypt: js.UndefOr[Boolean] = js.undefined
  
  var iv: js.UndefOr[String] = js.undefined
  
  var key: String
  
  var value: String
}
object CipherKeyValue {
  
  inline def apply(address_n: js.Array[Double], key: String, value: String): CipherKeyValue = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherKeyValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CipherKeyValue] (val x: Self) extends AnyVal {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setAsk_on_decrypt(value: Boolean): Self = StObject.set(x, "ask_on_decrypt", value.asInstanceOf[js.Any])
    
    inline def setAsk_on_decryptUndefined: Self = StObject.set(x, "ask_on_decrypt", js.undefined)
    
    inline def setAsk_on_encrypt(value: Boolean): Self = StObject.set(x, "ask_on_encrypt", value.asInstanceOf[js.Any])
    
    inline def setAsk_on_encryptUndefined: Self = StObject.set(x, "ask_on_encrypt", js.undefined)
    
    inline def setEncrypt(value: Boolean): Self = StObject.set(x, "encrypt", value.asInstanceOf[js.Any])
    
    inline def setEncryptUndefined: Self = StObject.set(x, "encrypt", js.undefined)
    
    inline def setIv(value: String): Self = StObject.set(x, "iv", value.asInstanceOf[js.Any])
    
    inline def setIvUndefined: Self = StObject.set(x, "iv", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
