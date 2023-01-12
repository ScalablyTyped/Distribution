package typings.trezorConnect.libTypescriptNetworksCardanoMod

import typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxAuxiliaryDataSupplementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoAuxiliaryDataSupplement extends StObject {
  
  var auxiliaryDataHash: String
  
  var catalystSignature: js.UndefOr[String] = js.undefined
  
  var `type`: CardanoTxAuxiliaryDataSupplementType
}
object CardanoAuxiliaryDataSupplement {
  
  inline def apply(auxiliaryDataHash: String, `type`: CardanoTxAuxiliaryDataSupplementType): CardanoAuxiliaryDataSupplement = {
    val __obj = js.Dynamic.literal(auxiliaryDataHash = auxiliaryDataHash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoAuxiliaryDataSupplement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoAuxiliaryDataSupplement] (val x: Self) extends AnyVal {
    
    inline def setAuxiliaryDataHash(value: String): Self = StObject.set(x, "auxiliaryDataHash", value.asInstanceOf[js.Any])
    
    inline def setCatalystSignature(value: String): Self = StObject.set(x, "catalystSignature", value.asInstanceOf[js.Any])
    
    inline def setCatalystSignatureUndefined: Self = StObject.set(x, "catalystSignature", js.undefined)
    
    inline def setType(value: CardanoTxAuxiliaryDataSupplementType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
