package typings.trezorConnect.libTypescriptBackendBlockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainGetFiatRatesForTimestamps extends StObject {
  
  var coin: String
  
  var timestamps: js.Array[Double]
}
object BlockchainGetFiatRatesForTimestamps {
  
  inline def apply(coin: String, timestamps: js.Array[Double]): BlockchainGetFiatRatesForTimestamps = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], timestamps = timestamps.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainGetFiatRatesForTimestamps]
  }
  
  extension [Self <: BlockchainGetFiatRatesForTimestamps](x: Self) {
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setTimestamps(value: js.Array[Double]): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsVarargs(value: Double*): Self = StObject.set(x, "timestamps", js.Array(value*))
  }
}
