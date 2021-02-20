package typings.web3Core.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Common extends StObject {
  
  var baseChain: js.UndefOr[chain] = js.native
  
  var customChain: CustomChainParams = js.native
  
  var hardfork: js.UndefOr[typings.web3Core.mod.hardfork] = js.native
}
object Common {
  
  @scala.inline
  def apply(customChain: CustomChainParams): Common = {
    val __obj = js.Dynamic.literal(customChain = customChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
  
  @scala.inline
  implicit class CommonMutableBuilder[Self <: Common] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseChain(value: chain): Self = StObject.set(x, "baseChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseChainUndefined: Self = StObject.set(x, "baseChain", js.undefined)
    
    @scala.inline
    def setCustomChain(value: CustomChainParams): Self = StObject.set(x, "customChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardfork(value: hardfork): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardforkUndefined: Self = StObject.set(x, "hardfork", js.undefined)
  }
}
