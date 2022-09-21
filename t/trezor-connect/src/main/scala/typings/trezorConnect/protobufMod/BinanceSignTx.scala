package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinanceSignTx extends StObject {
  
  var account_number: Double
  
  var address_n: js.Array[Double]
  
  var chain_id: js.UndefOr[String] = js.undefined
  
  var memo: js.UndefOr[String] = js.undefined
  
  var msg_count: Double
  
  var sequence: Double
  
  var source: Double
}
object BinanceSignTx {
  
  inline def apply(
    account_number: Double,
    address_n: js.Array[Double],
    msg_count: Double,
    sequence: Double,
    source: Double
  ): BinanceSignTx = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], address_n = address_n.asInstanceOf[js.Any], msg_count = msg_count.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinanceSignTx]
  }
  
  extension [Self <: BinanceSignTx](x: Self) {
    
    inline def setAccount_number(value: Double): Self = StObject.set(x, "account_number", value.asInstanceOf[js.Any])
    
    inline def setAddress_n(value: js.Array[Double]): Self = StObject.set(x, "address_n", value.asInstanceOf[js.Any])
    
    inline def setAddress_nVarargs(value: Double*): Self = StObject.set(x, "address_n", js.Array(value*))
    
    inline def setChain_id(value: String): Self = StObject.set(x, "chain_id", value.asInstanceOf[js.Any])
    
    inline def setChain_idUndefined: Self = StObject.set(x, "chain_id", js.undefined)
    
    inline def setMemo(value: String): Self = StObject.set(x, "memo", value.asInstanceOf[js.Any])
    
    inline def setMemoUndefined: Self = StObject.set(x, "memo", js.undefined)
    
    inline def setMsg_count(value: Double): Self = StObject.set(x, "msg_count", value.asInstanceOf[js.Any])
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
