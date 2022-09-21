package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoSignedTxChunk extends StObject {
  
  var signed_tx_chunk: String
}
object CardanoSignedTxChunk {
  
  inline def apply(signed_tx_chunk: String): CardanoSignedTxChunk = {
    val __obj = js.Dynamic.literal(signed_tx_chunk = signed_tx_chunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoSignedTxChunk]
  }
  
  extension [Self <: CardanoSignedTxChunk](x: Self) {
    
    inline def setSigned_tx_chunk(value: String): Self = StObject.set(x, "signed_tx_chunk", value.asInstanceOf[js.Any])
  }
}
