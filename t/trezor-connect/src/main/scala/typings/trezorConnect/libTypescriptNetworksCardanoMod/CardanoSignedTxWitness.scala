package typings.trezorConnect.libTypescriptNetworksCardanoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoSignedTxWitness extends StObject {
  
  var chainCode: js.UndefOr[String] = js.undefined
  
  var pubKey: String
  
  var signature: String
  
  var `type`: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxWitnessType
}
object CardanoSignedTxWitness {
  
  inline def apply(
    pubKey: String,
    signature: String,
    `type`: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxWitnessType
  ): CardanoSignedTxWitness = {
    val __obj = js.Dynamic.literal(pubKey = pubKey.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoSignedTxWitness]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoSignedTxWitness] (val x: Self) extends AnyVal {
    
    inline def setChainCode(value: String): Self = StObject.set(x, "chainCode", value.asInstanceOf[js.Any])
    
    inline def setChainCodeUndefined: Self = StObject.set(x, "chainCode", js.undefined)
    
    inline def setPubKey(value: String): Self = StObject.set(x, "pubKey", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.trezorConnect.libTypescriptTrezorProtobufMod.CardanoTxWitnessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
