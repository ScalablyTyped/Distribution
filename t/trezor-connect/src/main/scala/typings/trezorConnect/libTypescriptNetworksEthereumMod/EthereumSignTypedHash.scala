package typings.trezorConnect.libTypescriptNetworksEthereumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumSignTypedHash extends StObject {
  
  var domain_separator_hash: String
  
  /** Not required for domain-only signing, when EIP712Domain is the `primaryType` */
  var message_hash: js.UndefOr[String] = js.undefined
  
  var path: String | js.Array[Double]
}
object EthereumSignTypedHash {
  
  inline def apply(domain_separator_hash: String, path: String | js.Array[Double]): EthereumSignTypedHash = {
    val __obj = js.Dynamic.literal(domain_separator_hash = domain_separator_hash.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignTypedHash]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EthereumSignTypedHash] (val x: Self) extends AnyVal {
    
    inline def setDomain_separator_hash(value: String): Self = StObject.set(x, "domain_separator_hash", value.asInstanceOf[js.Any])
    
    inline def setMessage_hash(value: String): Self = StObject.set(x, "message_hash", value.asInstanceOf[js.Any])
    
    inline def setMessage_hashUndefined: Self = StObject.set(x, "message_hash", js.undefined)
    
    inline def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
