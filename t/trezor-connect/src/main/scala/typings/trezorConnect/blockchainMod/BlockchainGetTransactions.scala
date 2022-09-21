package typings.trezorConnect.blockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainGetTransactions extends StObject {
  
  var coin: String
  
  var txs: js.Array[String]
}
object BlockchainGetTransactions {
  
  inline def apply(coin: String, txs: js.Array[String]): BlockchainGetTransactions = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], txs = txs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainGetTransactions]
  }
  
  extension [Self <: BlockchainGetTransactions](x: Self) {
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setTxs(value: js.Array[String]): Self = StObject.set(x, "txs", value.asInstanceOf[js.Any])
    
    inline def setTxsVarargs(value: String*): Self = StObject.set(x, "txs", js.Array(value*))
  }
}
