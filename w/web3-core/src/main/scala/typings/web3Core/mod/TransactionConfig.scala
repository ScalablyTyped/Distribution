package typings.web3Core.mod

import typings.bnJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionConfig extends StObject {
  
  var chain: js.UndefOr[String] = js.undefined
  
  var chainId: js.UndefOr[Double] = js.undefined
  
  var common: js.UndefOr[Common] = js.undefined
  
  var data: js.UndefOr[String] = js.undefined
  
  var from: js.UndefOr[String | Double] = js.undefined
  
  var gas: js.UndefOr[Double | String] = js.undefined
  
  var gasPrice: js.UndefOr[Double | String | ^] = js.undefined
  
  var hardfork: js.UndefOr[String] = js.undefined
  
  var maxFeePerGas: js.UndefOr[Double | String | ^] = js.undefined
  
  var maxPriorityFeePerGas: js.UndefOr[Double | String | ^] = js.undefined
  
  var nonce: js.UndefOr[Double] = js.undefined
  
  var to: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double | String | ^] = js.undefined
}
object TransactionConfig {
  
  inline def apply(): TransactionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionConfig]
  }
  
  extension [Self <: TransactionConfig](x: Self) {
    
    inline def setChain(value: String): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    inline def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
    
    inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
    
    inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    inline def setCommon(value: Common): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFrom(value: String | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setGas(value: Double | String): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
    
    inline def setGasPrice(value: Double | String | ^): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
    
    inline def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
    
    inline def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
    
    inline def setHardfork(value: String): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
    
    inline def setHardforkUndefined: Self = StObject.set(x, "hardfork", js.undefined)
    
    inline def setMaxFeePerGas(value: Double | String | ^): Self = StObject.set(x, "maxFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setMaxFeePerGasUndefined: Self = StObject.set(x, "maxFeePerGas", js.undefined)
    
    inline def setMaxPriorityFeePerGas(value: Double | String | ^): Self = StObject.set(x, "maxPriorityFeePerGas", value.asInstanceOf[js.Any])
    
    inline def setMaxPriorityFeePerGasUndefined: Self = StObject.set(x, "maxPriorityFeePerGas", js.undefined)
    
    inline def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setValue(value: Double | String | ^): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
