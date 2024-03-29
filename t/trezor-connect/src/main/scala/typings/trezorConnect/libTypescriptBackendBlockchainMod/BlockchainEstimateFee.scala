package typings.trezorConnect.libTypescriptBackendBlockchainMod

import typings.trezorConnect.anon.Blocks
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainEstimateFee extends StObject {
  
  var coin: String
  
  var request: js.UndefOr[Blocks] = js.undefined
}
object BlockchainEstimateFee {
  
  inline def apply(coin: String): BlockchainEstimateFee = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainEstimateFee]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockchainEstimateFee] (val x: Self) extends AnyVal {
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: Blocks): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
