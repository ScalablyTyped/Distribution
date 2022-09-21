package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumAddress extends StObject {
  
  var _old_address: js.UndefOr[String] = js.undefined
  
  var address: String
}
object EthereumAddress {
  
  inline def apply(address: String): EthereumAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumAddress]
  }
  
  extension [Self <: EthereumAddress](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def set_old_address(value: String): Self = StObject.set(x, "_old_address", value.asInstanceOf[js.Any])
    
    inline def set_old_addressUndefined: Self = StObject.set(x, "_old_address", js.undefined)
  }
}
