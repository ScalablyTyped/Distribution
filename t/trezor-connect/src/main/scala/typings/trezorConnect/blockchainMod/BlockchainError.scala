package typings.trezorConnect.blockchainMod

import typings.trezorConnect.coinInfoMod.CoinInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainError extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var coin: CoinInfo
  
  var error: String
}
object BlockchainError {
  
  inline def apply(coin: CoinInfo, error: String): BlockchainError = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainError]
  }
  
  extension [Self <: BlockchainError](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setCoin(value: CoinInfo): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
