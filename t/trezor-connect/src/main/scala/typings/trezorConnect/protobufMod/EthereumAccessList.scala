package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumAccessList extends StObject {
  
  var address: String
  
  var storage_keys: js.Array[String]
}
object EthereumAccessList {
  
  inline def apply(address: String, storage_keys: js.Array[String]): EthereumAccessList = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], storage_keys = storage_keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumAccessList]
  }
  
  extension [Self <: EthereumAccessList](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setStorage_keys(value: js.Array[String]): Self = StObject.set(x, "storage_keys", value.asInstanceOf[js.Any])
    
    inline def setStorage_keysVarargs(value: String*): Self = StObject.set(x, "storage_keys", js.Array(value*))
  }
}
