package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumSignTypedHash extends StObject {
  
  var address_n: js.Array[Double]
  
  var domain_separator_hash: String
  
  var message_hash: js.UndefOr[String] = js.undefined
}
object EthereumSignTypedHash {
  
  inline def apply(address_n: js.Array[Double], domain_separator_hash: String): EthereumSignTypedHash = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], domain_separator_hash = domain_separator_hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignTypedHash]
  }
  
  extension [Self <: EthereumSignTypedHash](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setDomain_separator_hash(value: String): Self = StObject.set(x, "domain_separator_hash", value.asInstanceOf[js.Any])
    
    inline def setMessage_hash(value: String): Self = StObject.set(x, "message_hash", value.asInstanceOf[js.Any])
    
    inline def setMessage_hashUndefined: Self = StObject.set(x, "message_hash", js.undefined)
  }
}
