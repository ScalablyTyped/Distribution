package typings.trezorConnect.libTypescriptNetworksEthereumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.trezorConnect.libTypescriptNetworksEthereumMod.EthereumSignTypedHash because var conflicts: path. Inlined domain_separator_hash, message_hash */ trait EthereumSignTypedHashAndData[T /* <: EthereumSignTypedDataTypes */]
  extends StObject
     with EthereumSignTypedData[T] {
  
  var domain_separator_hash: String
  
  /** Not required for domain-only signing, when EIP712Domain is the `primaryType` */
  var message_hash: js.UndefOr[String] = js.undefined
}
object EthereumSignTypedHashAndData {
  
  inline def apply[T /* <: EthereumSignTypedDataTypes */](
    data: EthereumSignTypedDataMessage[T],
    domain_separator_hash: String,
    metamask_v4_compat: Boolean,
    path: String | js.Array[Double]
  ): EthereumSignTypedHashAndData[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], domain_separator_hash = domain_separator_hash.asInstanceOf[js.Any], metamask_v4_compat = metamask_v4_compat.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignTypedHashAndData[T]]
  }
  
  extension [Self <: EthereumSignTypedHashAndData[?], T /* <: EthereumSignTypedDataTypes */](x: Self & EthereumSignTypedHashAndData[T]) {
    
    inline def setDomain_separator_hash(value: String): Self = StObject.set(x, "domain_separator_hash", value.asInstanceOf[js.Any])
    
    inline def setMessage_hash(value: String): Self = StObject.set(x, "message_hash", value.asInstanceOf[js.Any])
    
    inline def setMessage_hashUndefined: Self = StObject.set(x, "message_hash", js.undefined)
  }
}
