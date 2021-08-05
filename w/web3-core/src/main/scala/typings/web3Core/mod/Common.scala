package typings.web3Core.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Common extends StObject {
  
  var baseChain: js.UndefOr[chain] = js.undefined
  
  var customChain: CustomChainParams
  
  var hardfork: js.UndefOr[typings.web3Core.mod.hardfork] = js.undefined
}
object Common {
  
  inline def apply(customChain: CustomChainParams): Common = {
    val __obj = js.Dynamic.literal(customChain = customChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
  
  extension [Self <: Common](x: Self) {
    
    inline def setBaseChain(value: chain): Self = StObject.set(x, "baseChain", value.asInstanceOf[js.Any])
    
    inline def setBaseChainUndefined: Self = StObject.set(x, "baseChain", js.undefined)
    
    inline def setCustomChain(value: CustomChainParams): Self = StObject.set(x, "customChain", value.asInstanceOf[js.Any])
    
    inline def setHardfork(value: hardfork): Self = StObject.set(x, "hardfork", value.asInstanceOf[js.Any])
    
    inline def setHardforkUndefined: Self = StObject.set(x, "hardfork", js.undefined)
  }
}
