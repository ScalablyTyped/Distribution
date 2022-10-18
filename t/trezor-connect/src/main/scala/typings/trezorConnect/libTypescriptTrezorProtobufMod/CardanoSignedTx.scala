package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoSignedTx extends StObject {
  
  var serialized_tx: js.UndefOr[String] = js.undefined
  
  var tx_hash: String
}
object CardanoSignedTx {
  
  inline def apply(tx_hash: String): CardanoSignedTx = {
    val __obj = js.Dynamic.literal(tx_hash = tx_hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoSignedTx]
  }
  
  extension [Self <: CardanoSignedTx](x: Self) {
    
    inline def setSerialized_tx(value: String): Self = StObject.set(x, "serialized_tx", value.asInstanceOf[js.Any])
    
    inline def setSerialized_txUndefined: Self = StObject.set(x, "serialized_tx", js.undefined)
    
    inline def setTx_hash(value: String): Self = StObject.set(x, "tx_hash", value.asInstanceOf[js.Any])
  }
}
