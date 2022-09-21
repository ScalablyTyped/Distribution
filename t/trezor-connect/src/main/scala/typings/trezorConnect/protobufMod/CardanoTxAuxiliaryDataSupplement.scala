package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxAuxiliaryDataSupplement extends StObject {
  
  var auxiliary_data_hash: js.UndefOr[String] = js.undefined
  
  var catalyst_signature: js.UndefOr[String] = js.undefined
  
  var `type`: CardanoTxAuxiliaryDataSupplementType
}
object CardanoTxAuxiliaryDataSupplement {
  
  inline def apply(`type`: CardanoTxAuxiliaryDataSupplementType): CardanoTxAuxiliaryDataSupplement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTxAuxiliaryDataSupplement]
  }
  
  extension [Self <: CardanoTxAuxiliaryDataSupplement](x: Self) {
    
    inline def setAuxiliary_data_hash(value: String): Self = StObject.set(x, "auxiliary_data_hash", value.asInstanceOf[js.Any])
    
    inline def setAuxiliary_data_hashUndefined: Self = StObject.set(x, "auxiliary_data_hash", js.undefined)
    
    inline def setCatalyst_signature(value: String): Self = StObject.set(x, "catalyst_signature", value.asInstanceOf[js.Any])
    
    inline def setCatalyst_signatureUndefined: Self = StObject.set(x, "catalyst_signature", js.undefined)
    
    inline def setType(value: CardanoTxAuxiliaryDataSupplementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
