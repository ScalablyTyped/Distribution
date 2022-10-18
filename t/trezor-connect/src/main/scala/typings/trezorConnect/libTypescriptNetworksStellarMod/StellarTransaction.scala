package typings.trezorConnect.libTypescriptNetworksStellarMod

import typings.trezorConnect.anon.Hash
import typings.trezorConnect.anon.MaxTime
import typings.trezorConnect.libTypescriptTrezorProtobufMod.UintType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarTransaction extends StObject {
  
  // Proto: "source_account"
  var fee: Double
  
  var memo: js.UndefOr[Hash] = js.undefined
  
  var operations: js.Array[StellarOperation]
  
  // Proto: ok
  var sequence: UintType
  
  var source: String
  
  // Proto: "sequence_number"
  var timebounds: js.UndefOr[MaxTime] = js.undefined
}
object StellarTransaction {
  
  inline def apply(fee: Double, operations: js.Array[StellarOperation], sequence: UintType, source: String): StellarTransaction = {
    val __obj = js.Dynamic.literal(fee = fee.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarTransaction]
  }
  
  extension [Self <: StellarTransaction](x: Self) {
    
    inline def setFee(value: Double): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setMemo(value: Hash): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
    
    inline def setMemoUndefined: Self = StObject.set(x, "memo", js.undefined)
    
    inline def setOperations(value: js.Array[StellarOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: StellarOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setSequence(value: UintType): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTimebounds(value: MaxTime): Self = StObject.set(x, "timebounds", value.asInstanceOf[js.Any])
    
    inline def setTimeboundsUndefined: Self = StObject.set(x, "timebounds", js.undefined)
  }
}
