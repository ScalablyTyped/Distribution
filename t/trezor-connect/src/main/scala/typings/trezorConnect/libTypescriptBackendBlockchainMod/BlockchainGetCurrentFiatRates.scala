package typings.trezorConnect.libTypescriptBackendBlockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainGetCurrentFiatRates extends StObject {
  
  var coin: String
  
  var currencies: js.UndefOr[js.Array[String]] = js.undefined
}
object BlockchainGetCurrentFiatRates {
  
  inline def apply(coin: String): BlockchainGetCurrentFiatRates = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainGetCurrentFiatRates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockchainGetCurrentFiatRates] (val x: Self) extends AnyVal {
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setCurrencies(value: js.Array[String]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
    
    inline def setCurrenciesUndefined: Self = StObject.set(x, "currencies", js.undefined)
    
    inline def setCurrenciesVarargs(value: String*): Self = StObject.set(x, "currencies", js.Array(value*))
  }
}
