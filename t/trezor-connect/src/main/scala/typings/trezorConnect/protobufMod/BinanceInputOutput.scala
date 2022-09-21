package typings.trezorConnect.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinanceInputOutput extends StObject {
  
  var address: String
  
  var coins: js.Array[BinanceCoin]
}
object BinanceInputOutput {
  
  inline def apply(address: String, coins: js.Array[BinanceCoin]): BinanceInputOutput = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], coins = coins.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinanceInputOutput]
  }
  
  extension [Self <: BinanceInputOutput](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCoins(value: js.Array[BinanceCoin]): Self = StObject.set(x, "coins", value.asInstanceOf[js.Any])
    
    inline def setCoinsVarargs(value: BinanceCoin*): Self = StObject.set(x, "coins", js.Array(value*))
  }
}
