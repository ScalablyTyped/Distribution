package typings.trezorConnect.blockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainFiatRatesForTimestamps extends StObject {
  
  var tickers: js.Array[BlockchainTimestampedFiatRates]
}
object BlockchainFiatRatesForTimestamps {
  
  inline def apply(tickers: js.Array[BlockchainTimestampedFiatRates]): BlockchainFiatRatesForTimestamps = {
    val __obj = js.Dynamic.literal(tickers = tickers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainFiatRatesForTimestamps]
  }
  
  extension [Self <: BlockchainFiatRatesForTimestamps](x: Self) {
    
    inline def setTickers(value: js.Array[BlockchainTimestampedFiatRates]): Self = StObject.set(x, "tickers", value.asInstanceOf[js.Any])
    
    inline def setTickersVarargs(value: BlockchainTimestampedFiatRates*): Self = StObject.set(x, "tickers", js.Array(value*))
  }
}
