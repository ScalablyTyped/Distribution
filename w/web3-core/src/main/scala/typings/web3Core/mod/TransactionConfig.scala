package typings.web3Core.mod

import typings.bnJs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionConfig extends StObject {
  
  var chain: js.UndefOr[String] = js.native
  
  var chainId: js.UndefOr[Double] = js.native
  
  var common: js.UndefOr[Common] = js.native
  
  var data: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[String | Double] = js.native
  
  var gas: js.UndefOr[Double | String] = js.native
  
  var gasPrice: js.UndefOr[Double | String | ^] = js.native
  
  var hardfork: js.UndefOr[String] = js.native
  
  var nonce: js.UndefOr[Double] = js.native
  
  var to: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double | String | ^] = js.native
}
object TransactionConfig {
  
  @scala.inline
  def apply(): TransactionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionConfig]
  }
  
  @scala.inline
  implicit class TransactionConfigMutableBuilder[Self <: TransactionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChain(value: String): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainId(value: Double): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
    
    @scala.inline
    def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
    
    @scala.inline
    def setCommon(value: Common): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setFrom(value: String | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setGas(value: Double | String): Self = StObject.set(x, "gas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasPrice(value: Double | String | ^): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGasPriceUndefined: Self = StObject.set(x, "gasPrice", js.undefined)
    
    @scala.inline
    def setGasUndefined: Self = StObject.set(x, "gas", js.undefined)
    
    @scala.inline
    def setHardfork(value: String): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardforkUndefined: Self = StObject.set(x, "hardfork", js.undefined)
    
    @scala.inline
    def setNonce(value: Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String | ^): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
