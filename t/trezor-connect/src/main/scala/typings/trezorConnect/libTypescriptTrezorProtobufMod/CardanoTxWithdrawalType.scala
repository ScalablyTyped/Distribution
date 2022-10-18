package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardanoTxWithdrawalType extends StObject {
  
  var amount: UintType
  
  var path: js.Array[Double]
}
object CardanoTxWithdrawalType {
  
  inline def apply(amount: UintType, path: js.Array[Double]): CardanoTxWithdrawalType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardanoTxWithdrawalType]
  }
  
  extension [Self <: CardanoTxWithdrawalType](x: Self) {
    
    inline def setAmount(value: UintType): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
