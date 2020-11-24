package typings.web3Core.mod

import typings.bnJs.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionConfig extends js.Object {
  
  var chain: js.UndefOr[String] = js.native
  
  var chainId: js.UndefOr[Double] = js.native
  
  var common: js.UndefOr[Common] = js.native
  
  var data: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[String | Double] = js.native
  
  var gas: js.UndefOr[Double | String] = js.native
  
  var gasPrice: js.UndefOr[Double | String | ^ ] = js.native
  
  var hardfork: js.UndefOr[String] = js.native
  
  var nonce: js.UndefOr[Double] = js.native
  
  var to: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double | String | ^ ] = js.native
}
object TransactionConfig {
  
  @scala.inline
  def apply(): TransactionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionConfig]
  }
  
  @scala.inline
  implicit class TransactionConfigOps[Self <: TransactionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChain(value: String): Self = this.set("chain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChain: Self = this.set("chain", js.undefined)
    
    @scala.inline
    def setChainId(value: Double): Self = this.set("chainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChainId: Self = this.set("chainId", js.undefined)
    
    @scala.inline
    def setCommon(value: Common): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFrom(value: String | Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setGas(value: Double | String): Self = this.set("gas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGas: Self = this.set("gas", js.undefined)
    
    @scala.inline
    def setGasPrice(value: Double | String | ^ ): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGasPrice: Self = this.set("gasPrice", js.undefined)
    
    @scala.inline
    def setHardfork(value: String): Self = this.set("hardfork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardfork: Self = this.set("hardfork", js.undefined)
    
    @scala.inline
    def setNonce(value: Double): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
    
    @scala.inline
    def setValue(value: Double | String | ^ ): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
