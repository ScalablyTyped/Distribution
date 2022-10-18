package typings.trezorConnect.libTypescriptNetworksEthereumMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EthereumSignTypedDataTypes
  extends StObject
     with /* additionalProperties */ StringDictionary[js.Array[EthereumSignTypedDataTypeProperty]] {
  
  var EIP712Domain: js.Array[EthereumSignTypedDataTypeProperty]
}
object EthereumSignTypedDataTypes {
  
  inline def apply(EIP712Domain: js.Array[EthereumSignTypedDataTypeProperty]): EthereumSignTypedDataTypes = {
    val __obj = js.Dynamic.literal(EIP712Domain = EIP712Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthereumSignTypedDataTypes]
  }
  
  extension [Self <: EthereumSignTypedDataTypes](x: Self) {
    
    inline def setEIP712Domain(value: js.Array[EthereumSignTypedDataTypeProperty]): Self = StObject.set(x, "EIP712Domain", value.asInstanceOf[js.Any])
    
    inline def setEIP712DomainVarargs(value: EthereumSignTypedDataTypeProperty*): Self = StObject.set(x, "EIP712Domain", js.Array(value*))
  }
}
