package typings.trezorConnect.libTypescriptBackendBlockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainSubscribeFiatRates extends StObject {
  
  var coin: String
  
  var currency: js.UndefOr[String] = js.undefined
}
object BlockchainSubscribeFiatRates {
  
  inline def apply(coin: String): BlockchainSubscribeFiatRates = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainSubscribeFiatRates]
  }
  
  extension [Self <: BlockchainSubscribeFiatRates](x: Self) {
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
  }
}
