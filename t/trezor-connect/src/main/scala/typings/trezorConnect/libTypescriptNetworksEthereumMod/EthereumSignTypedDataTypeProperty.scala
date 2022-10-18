package typings.trezorConnect.libTypescriptNetworksEthereumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// sign typed message (eip-712)
trait EthereumSignTypedDataTypeProperty extends StObject {
  
  var name: String
  
  var `type`: String
}
object EthereumSignTypedDataTypeProperty {
  
  inline def apply(name: String, `type`: String): EthereumSignTypedDataTypeProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignTypedDataTypeProperty]
  }
  
  extension [Self <: EthereumSignTypedDataTypeProperty](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
