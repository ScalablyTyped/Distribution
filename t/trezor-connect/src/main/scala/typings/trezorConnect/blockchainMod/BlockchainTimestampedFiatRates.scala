package typings.trezorConnect.blockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainTimestampedFiatRates extends StObject {
  
  var rates: BlockchainFiatRates
  
  var ts: Double
}
object BlockchainTimestampedFiatRates {
  
  inline def apply(rates: BlockchainFiatRates, ts: Double): BlockchainTimestampedFiatRates = {
    val __obj = js.Dynamic.literal(rates = rates.asInstanceOf[js.Any], ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainTimestampedFiatRates]
  }
  
  extension [Self <: BlockchainTimestampedFiatRates](x: Self) {
    
    inline def setRates(value: BlockchainFiatRates): Self = StObject.set(x, "rates", value.asInstanceOf[js.Any])
    
    inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
  }
}
