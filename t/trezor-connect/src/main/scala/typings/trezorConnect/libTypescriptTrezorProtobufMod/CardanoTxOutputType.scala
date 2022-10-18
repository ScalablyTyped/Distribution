package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxOutputType extends StObject {
  
  var address: js.UndefOr[String] = js.undefined
  
  var address_parameters: js.UndefOr[CardanoAddressParametersType] = js.undefined
  
  var amount: UintType
  
  var token_bundle: js.Array[CardanoAssetGroupType]
}
object CardanoTxOutputType {
  
  inline def apply(amount: UintType, token_bundle: js.Array[CardanoAssetGroupType]): CardanoTxOutputType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], token_bundle = token_bundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTxOutputType]
  }
  
  extension [Self <: CardanoTxOutputType](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddress_parameters(value: CardanoAddressParametersType): Self = StObject.set(x, "address_parameters", value.asInstanceOf[js.Any])
    
    inline def setAddress_parametersUndefined: Self = StObject.set(x, "address_parameters", js.undefined)
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setToken_bundle(value: js.Array[CardanoAssetGroupType]): Self = StObject.set(x, "token_bundle", value.asInstanceOf[js.Any])
    
    inline def setToken_bundleVarargs(value: CardanoAssetGroupType*): Self = StObject.set(x, "token_bundle", js.Array(value*))
  }
}
