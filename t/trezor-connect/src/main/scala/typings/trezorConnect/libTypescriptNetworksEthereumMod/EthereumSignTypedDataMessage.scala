package typings.trezorConnect.libTypescriptNetworksEthereumMod

import org.scalablytyped.runtime.StringDictionary
import typings.trezorConnect.anon.ChainId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumSignTypedDataMessage[T /* <: EthereumSignTypedDataTypes */] extends StObject {
  
  var domain: ChainId
  
  var message: StringDictionary[Any]
  
  var primaryType: /* keyof T */ String
  
  var types: T
}
object EthereumSignTypedDataMessage {
  
  inline def apply[T /* <: EthereumSignTypedDataTypes */](domain: ChainId, message: StringDictionary[Any], primaryType: /* keyof T */ String, types: T): EthereumSignTypedDataMessage[T] = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], primaryType = primaryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignTypedDataMessage[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EthereumSignTypedDataMessage[?], T /* <: EthereumSignTypedDataTypes */] (val x: Self & EthereumSignTypedDataMessage[T]) extends AnyVal {
    
    inline def setDomain(value: ChainId): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: StringDictionary[Any]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPrimaryType(value: /* keyof T */ String): Self = StObject.set(x, "primaryType", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: T): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
