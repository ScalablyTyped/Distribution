package typings.trezorConnect.accountMod

import typings.trezorConnect.anon.Addresses
import typings.trezorConnect.anon.FeePerUnit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrecomposeParams extends StObject {
  
  var account: Addresses
  
  var baseFee: js.UndefOr[Double] = js.undefined
  
  var coin: String
  
  var feeLevels: js.Array[FeePerUnit]
  
  var floorBaseFee: js.UndefOr[Boolean] = js.undefined
  
  var outputs: js.Array[ComposeOutput]
  
  var sequence: js.UndefOr[Double] = js.undefined
  
  var skipPermutation: js.UndefOr[Boolean] = js.undefined
}
object PrecomposeParams {
  
  inline def apply(
    account: Addresses,
    coin: String,
    feeLevels: js.Array[FeePerUnit],
    outputs: js.Array[ComposeOutput]
  ): PrecomposeParams = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], coin = coin.asInstanceOf[js.Any], feeLevels = feeLevels.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrecomposeParams]
  }
  
  extension [Self <: PrecomposeParams](x: Self) {
    
    inline def setAccount(value: Addresses): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setBaseFee(value: Double): Self = StObject.set(x, "baseFee", value.asInstanceOf[js.Any])
    
    inline def setBaseFeeUndefined: Self = StObject.set(x, "baseFee", js.undefined)
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setFeeLevels(value: js.Array[FeePerUnit]): Self = StObject.set(x, "feeLevels", value.asInstanceOf[js.Any])
    
    inline def setFeeLevelsVarargs(value: FeePerUnit*): Self = StObject.set(x, "feeLevels", js.Array(value*))
    
    inline def setFloorBaseFee(value: Boolean): Self = StObject.set(x, "floorBaseFee", value.asInstanceOf[js.Any])
    
    inline def setFloorBaseFeeUndefined: Self = StObject.set(x, "floorBaseFee", js.undefined)
    
    inline def setOutputs(value: js.Array[ComposeOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: ComposeOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setSkipPermutation(value: Boolean): Self = StObject.set(x, "skipPermutation", value.asInstanceOf[js.Any])
    
    inline def setSkipPermutationUndefined: Self = StObject.set(x, "skipPermutation", js.undefined)
  }
}
