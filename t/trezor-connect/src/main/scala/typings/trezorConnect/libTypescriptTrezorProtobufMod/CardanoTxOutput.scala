package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxOutput extends StObject {
  
  var address: js.UndefOr[String] = js.undefined
  
  var address_parameters: js.UndefOr[CardanoAddressParametersType] = js.undefined
  
  var amount: UintType
  
  var asset_groups_count: Double
  
  var datum_hash: js.UndefOr[String] = js.undefined
}
object CardanoTxOutput {
  
  inline def apply(amount: UintType, asset_groups_count: Double): CardanoTxOutput = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], asset_groups_count = asset_groups_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTxOutput]
  }
  
  extension [Self <: CardanoTxOutput](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setAddress_parameters(value: CardanoAddressParametersType): Self = StObject.set(x, "address_parameters", value.asInstanceOf[js.Any])
    
    inline def setAddress_parametersUndefined: Self = StObject.set(x, "address_parameters", js.undefined)
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAsset_groups_count(value: Double): Self = StObject.set(x, "asset_groups_count", value.asInstanceOf[js.Any])
    
    inline def setDatum_hash(value: String): Self = StObject.set(x, "datum_hash", value.asInstanceOf[js.Any])
    
    inline def setDatum_hashUndefined: Self = StObject.set(x, "datum_hash", js.undefined)
  }
}
