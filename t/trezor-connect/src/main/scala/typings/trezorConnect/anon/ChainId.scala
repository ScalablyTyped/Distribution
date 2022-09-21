package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChainId extends StObject {
  
  var chainId: js.UndefOr[Double | js.BigInt] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var salt: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  var verifyingContract: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object ChainId {
  
  inline def apply(): ChainId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChainId]
  }
  
  extension [Self <: ChainId](x: Self) {
    
    inline def setChainId(value: Double | js.BigInt): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
    
    inline def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSalt(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    
    inline def setVerifyingContract(value: String): Self = StObject.set(x, "verifyingContract", value.asInstanceOf[js.Any])
    
    inline def setVerifyingContractUndefined: Self = StObject.set(x, "verifyingContract", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
