package typings.trezorConnect.libTypescriptBackendBlockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainAccountBalanceHistory extends StObject {
  
  var rates: BlockchainFiatRates
  
  var received: String
  
  var sent: String
  
  var sentToSelf: js.UndefOr[String] = js.undefined
  
  var time: Double
  
  var txs: Double
}
object BlockchainAccountBalanceHistory {
  
  inline def apply(rates: BlockchainFiatRates, received: String, sent: String, time: Double, txs: Double): BlockchainAccountBalanceHistory = {
    val __obj = js.Dynamic.literal(rates = rates.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], txs = txs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainAccountBalanceHistory]
  }
  
  extension [Self <: BlockchainAccountBalanceHistory](x: Self) {
    
    inline def setRates(value: BlockchainFiatRates): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    
    inline def setReceived(value: String): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
    
    inline def setSent(value: String): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
    
    inline def setSentToSelf(value: String): Self = StObject.set(x, "sentToSelf", value.asInstanceOf[js.Any])
    
    inline def setSentToSelfUndefined: Self = StObject.set(x, "sentToSelf", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTxs(value: Double): Self = StObject.set(x, "txs", value.asInstanceOf[js.Any])
  }
}
