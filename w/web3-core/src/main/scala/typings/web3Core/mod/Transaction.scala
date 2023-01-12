package typings.web3Core.mod

import typings.bnJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction extends StObject {
  
  var blockHash: String | Null
  
  var blockNumber: Double | Null
  
  var from: String
  
  var gas: Double
  
  var gasPrice: String
  
  var hash: String
  
  var input: String
  
  var maxFeePerGas: js.UndefOr[Double | String | ^] = js.undefined
  
  var maxPriorityFeePerGas: js.UndefOr[Double | String | ^] = js.undefined
  
  var nonce: Double
  
  var to: String | Null
  
  var transactionIndex: Double | Null
  
  var value: String
}
object Transaction {
  
  inline def apply(
    from: String,
    gas: Double,
    gasPrice: String,
    hash: String,
    input: String,
    nonce: Double,
    value: String
  ): Transaction = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], gas = gas.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], blockHash = null, blockNumber = null, to = null, transactionIndex = null)
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
    
    inline def setBlockHashNull: Self = StObject.set(x, "blockHash", null)
    
    inline def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
    
    inline def setBlockNumberNull: Self = StObject.set(x, "blockNumber", null)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setGas(value: Double): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
    
    inline def setGasPrice(value: String): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setMaxFeePerGas(value: Double | String | ^): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
    
    inline def setMaxPriorityFeePerGas(value: Double | String | ^): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
    
    inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToNull: Self = StObject.set(x, "to", null)
    
    inline def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
    
    inline def setTransactionIndexNull: Self = StObject.set(x, "transactionIndex", null)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
