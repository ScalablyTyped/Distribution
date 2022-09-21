package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxWithdrawal extends StObject {
  
  var amount: UintType
  
  var key_hash: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[js.Array[Double]] = js.undefined
  
  var script_hash: js.UndefOr[String] = js.undefined
}
object CardanoTxWithdrawal {
  
  inline def apply(amount: UintType): CardanoTxWithdrawal = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTxWithdrawal]
  }
  
  extension [Self <: CardanoTxWithdrawal](x: Self) {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setKey_hash(value: String): Self = StObject.set(x, "key_hash", value.asInstanceOf[js.Any])
    
    inline def setKey_hashUndefined: Self = StObject.set(x, "key_hash", js.undefined)
    
    inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setScript_hash(value: String): Self = StObject.set(x, "script_hash", value.asInstanceOf[js.Any])
    
    inline def setScript_hashUndefined: Self = StObject.set(x, "script_hash", js.undefined)
  }
}
