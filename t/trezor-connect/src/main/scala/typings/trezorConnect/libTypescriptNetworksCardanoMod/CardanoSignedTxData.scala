package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoSignedTxData extends StObject {
  
  var auxiliaryDataSupplement: js.UndefOr[CardanoAuxiliaryDataSupplement] = js.undefined
  
  var hash: String
  
  var witnesses: js.Array[CardanoSignedTxWitness]
}
object CardanoSignedTxData {
  
  inline def apply(hash: String, witnesses: js.Array[CardanoSignedTxWitness]): CardanoSignedTxData = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], witnesses = witnesses.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoSignedTxData]
  }
  
  extension [Self <: CardanoSignedTxData](x: Self) {
    
    inline def setAuxiliaryDataSupplement(value: CardanoAuxiliaryDataSupplement): Self = StObject.set(x, "auxiliaryDataSupplement", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryDataSupplementUndefined: Self = StObject.set(x, "auxiliaryDataSupplement", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setWitnesses(value: js.Array[CardanoSignedTxWitness]): Self = StObject.set(x, "witnesses", value.asInstanceOf[js.Any])
    
    inline def setWitnessesVarargs(value: CardanoSignedTxWitness*): Self = StObject.set(x, "witnesses", js.Array(value*))
  }
}
