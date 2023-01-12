package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxWitnessResponse extends StObject {
  
  var chain_code: js.UndefOr[String] = js.undefined
  
  var pub_key: String
  
  var signature: String
  
  var `type`: CardanoTxWitnessType
}
object CardanoTxWitnessResponse {
  
  inline def apply(pub_key: String, signature: String, `type`: CardanoTxWitnessType): CardanoTxWitnessResponse = {
    val __obj = js.Dynamic.literal(pub_key = pub_key.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTxWitnessResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoTxWitnessResponse] (val x: Self) extends AnyVal {
    
    inline def setChain_code(value: String): Self = StObject.set(x, "chain_code", value.asInstanceOf[js.Any])
    
    inline def setChain_codeUndefined: Self = StObject.set(x, "chain_code", js.undefined)
    
    inline def setPub_key(value: String): Self = StObject.set(x, "pub_key", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setType(value: CardanoTxWitnessType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
