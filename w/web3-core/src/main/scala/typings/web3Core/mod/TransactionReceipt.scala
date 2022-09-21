package typings.web3Core.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionReceipt extends StObject {
  
  var blockHash: String
  
  var blockNumber: Double
  
  var contractAddress: js.UndefOr[String] = js.undefined
  
  var cumulativeGasUsed: Double
  
  var effectiveGasPrice: Double
  
  var events: js.UndefOr[StringDictionary[EventLog]] = js.undefined
  
  var from: String
  
  var gasUsed: Double
  
  var logs: js.Array[Log]
  
  var logsBloom: String
  
  var status: Boolean
  
  var to: String
  
  var transactionHash: String
  
  var transactionIndex: Double
}
object TransactionReceipt {
  
  inline def apply(
    blockHash: String,
    blockNumber: Double,
    cumulativeGasUsed: Double,
    effectiveGasPrice: Double,
    from: String,
    gasUsed: Double,
    logs: js.Array[Log],
    logsBloom: String,
    status: Boolean,
    to: String,
    transactionHash: String,
    transactionIndex: Double
  ): TransactionReceipt = {
    val __obj = js.Dynamic.literal(blockHash = blockHash.asInstanceOf[js.Any], blockNumber = blockNumber.asInstanceOf[js.Any], cumulativeGasUsed = cumulativeGasUsed.asInstanceOf[js.Any], effectiveGasPrice = effectiveGasPrice.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], logs = logs.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], transactionHash = transactionHash.asInstanceOf[js.Any], transactionIndex = transactionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionReceipt]
  }
  
  extension [Self <: TransactionReceipt](x: Self) {
    
    inline def setBlockHash(value: String): Self = StObject.set(x, "blockHash", value.asInstanceOf[js.Any])
    
    inline def setBlockNumber(value: Double): Self = StObject.set(x, "blockNumber", value.asInstanceOf[js.Any])
    
    inline def setContractAddress(value: String): Self = StObject.set(x, "contractAddress", value.asInstanceOf[js.Any])
    
    inline def setContractAddressUndefined: Self = StObject.set(x, "contractAddress", js.undefined)
    
    inline def setCumulativeGasUsed(value: Double): Self = StObject.set(x, "cumulativeGasUsed", value.asInstanceOf[js.Any])
    
    inline def setEffectiveGasPrice(value: Double): Self = StObject.set(x, "effectiveGasPrice", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: StringDictionary[EventLog]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setGasUsed(value: Double): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
    
    inline def setLogs(value: js.Array[Log]): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    inline def setLogsBloom(value: String): Self = StObject.set(x, "logsBloom", value.asInstanceOf[js.Any])
    
    inline def setLogsVarargs(value: Log*): Self = StObject.set(x, "logs", js.Array(value*))
    
    inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setTransactionHash(value: String): Self = StObject.set(x, "transactionHash", value.asInstanceOf[js.Any])
    
    inline def setTransactionIndex(value: Double): Self = StObject.set(x, "transactionIndex", value.asInstanceOf[js.Any])
  }
}
