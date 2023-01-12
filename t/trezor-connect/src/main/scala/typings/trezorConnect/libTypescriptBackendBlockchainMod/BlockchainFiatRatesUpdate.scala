package typings.trezorConnect.libTypescriptBackendBlockchainMod

import typings.trezorConnect.libTypescriptNetworksCoinInfoMod.CoinInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainFiatRatesUpdate extends StObject {
  
  var coin: CoinInfo
  
  var rates: BlockchainFiatRates
}
object BlockchainFiatRatesUpdate {
  
  inline def apply(coin: CoinInfo, rates: BlockchainFiatRates): BlockchainFiatRatesUpdate = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], rates = rates.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainFiatRatesUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockchainFiatRatesUpdate] (val x: Self) extends AnyVal {
    
    inline def setCoin(value: CoinInfo): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setRates(value: BlockchainFiatRates): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
  }
}
