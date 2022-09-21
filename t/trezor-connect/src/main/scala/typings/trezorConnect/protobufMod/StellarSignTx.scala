package typings.trezorConnect.protobufMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StellarSignTx extends StObject {
  
  var address_n: js.Array[Double]
  
  var fee: UintType
  
  var memo_hash: js.UndefOr[Buffer | String] = js.undefined
  
  var memo_id: js.UndefOr[String] = js.undefined
  
  var memo_text: js.UndefOr[String] = js.undefined
  
  var memo_type: StellarMemoType
  
  var network_passphrase: String
  
  var num_operations: Double
  
  var sequence_number: UintType
  
  var source_account: String
  
  var timebounds_end: Double
  
  var timebounds_start: Double
}
object StellarSignTx {
  
  inline def apply(
    address_n: js.Array[Double],
    fee: UintType,
    memo_type: StellarMemoType,
    network_passphrase: String,
    num_operations: Double,
    sequence_number: UintType,
    source_account: String,
    timebounds_end: Double,
    timebounds_start: Double
  ): StellarSignTx = {
    val __obj = js.Dynamic.literal(address_n = address_n.asInstanceOf[js.Any], fee = fee.asInstanceOf[js.Any], memo_type = memo_type.asInstanceOf[js.Any], network_passphrase = network_passphrase.asInstanceOf[js.Any], num_operations = num_operations.asInstanceOf[js.Any], sequence_number = sequence_number.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], timebounds_end = timebounds_end.asInstanceOf[js.Any], timebounds_start = timebounds_start.asInstanceOf[js.Any])
    __obj.asInstanceOf[StellarSignTx]
  }
  
  extension [Self <: StellarSignTx](x: Self) {
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setFee(value: UintType): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setMemo_hash(value: Buffer | String): Self = StObject.set(x, "memo_hash", value.asInstanceOf[js.Any])
    
    inline def setMemo_hashUndefined: Self = StObject.set(x, "memo_hash", js.undefined)
    
    inline def setMemo_id(value: String): Self = StObject.set(x, "memo_id", value.asInstanceOf[js.Any])
    
    inline def setMemo_idUndefined: Self = StObject.set(x, "memo_id", js.undefined)
    
    inline def setMemo_text(value: String): Self = StObject.set(x, "memo_text", value.asInstanceOf[js.Any])
    
    inline def setMemo_textUndefined: Self = StObject.set(x, "memo_text", js.undefined)
    
    inline def setMemo_type(value: StellarMemoType): Self = StObject.set(x, "memo_type", value.asInstanceOf[js.Any])
    
    inline def setNetwork_passphrase(value: String): Self = StObject.set(x, "network_passphrase", value.asInstanceOf[js.Any])
    
    inline def setNum_operations(value: Double): Self = StObject.set(x, "num_operations", value.asInstanceOf[js.Any])
    
    inline def setSequence_number(value: UintType): Self = StObject.set(x, "sequence_number", value.asInstanceOf[js.Any])
    
    inline def setSource_account(value: String): Self = StObject.set(x, "source_account", value.asInstanceOf[js.Any])
    
    inline def setTimebounds_end(value: Double): Self = StObject.set(x, "timebounds_end", value.asInstanceOf[js.Any])
    
    inline def setTimebounds_start(value: Double): Self = StObject.set(x, "timebounds_start", value.asInstanceOf[js.Any])
  }
}
