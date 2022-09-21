package typings.trezorConnect.blockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainGetAccountBalanceHistory extends StObject {
  
  var coin: String
  
  var descriptor: String
  
  var from: js.UndefOr[Double] = js.undefined
  
  var groupBy: js.UndefOr[Double] = js.undefined
  
  var to: js.UndefOr[Double] = js.undefined
}
object BlockchainGetAccountBalanceHistory {
  
  inline def apply(coin: String, descriptor: String): BlockchainGetAccountBalanceHistory = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], descriptor = descriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainGetAccountBalanceHistory]
  }
  
  extension [Self <: BlockchainGetAccountBalanceHistory](x: Self) {
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setDescriptor(value: String): Self = StObject.set(x, "descriptor", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setGroupBy(value: Double): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "groupBy", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
