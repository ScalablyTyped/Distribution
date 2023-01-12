package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxInput extends StObject {
  
  var prev_hash: String
  
  var prev_index: Double
}
object CardanoTxInput {
  
  inline def apply(prev_hash: String, prev_index: Double): CardanoTxInput = {
    val __obj = js.Dynamic.literal(prev_hash = prev_hash.asInstanceOf[js.Any], prev_index = prev_index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTxInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardanoTxInput] (val x: Self) extends AnyVal {
    
    inline def setPrev_hash(value: String): Self = StObject.set(x, "prev_hash", value.asInstanceOf[js.Any])
    
    inline def setPrev_index(value: Double): Self = StObject.set(x, "prev_index", value.asInstanceOf[js.Any])
  }
}
