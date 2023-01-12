package typings.trezorConnect.libTypescriptAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComposeParams extends StObject {
  
  var baseFee: js.UndefOr[Double] = js.undefined
  
  var coin: String
  
  var floorBaseFee: js.UndefOr[Boolean] = js.undefined
  
  var outputs: js.Array[ComposeOutput]
  
  var push: js.UndefOr[Boolean] = js.undefined
  
  var sequence: js.UndefOr[Double] = js.undefined
  
  var skipPermutation: js.UndefOr[Boolean] = js.undefined
}
object ComposeParams {
  
  inline def apply(coin: String, outputs: js.Array[ComposeOutput]): ComposeParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComposeParams] (val x: Self) extends AnyVal {
    
    inline def setBaseFee(value: Double): Self = StObject.set(x, "baseFee", value.asInstanceOf[js.Any])
    
    inline def setBaseFeeUndefined: Self = StObject.set(x, "baseFee", js.undefined)
    
    inline def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setFloorBaseFee(value: Boolean): Self = StObject.set(x, "floorBaseFee", value.asInstanceOf[js.Any])
    
    inline def setFloorBaseFeeUndefined: Self = StObject.set(x, "floorBaseFee", js.undefined)
    
    inline def setOutputs(value: js.Array[ComposeOutput]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsVarargs(value: ComposeOutput*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    inline def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    inline def setSequence(value: Double): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    inline def setSkipPermutation(value: Boolean): Self = StObject.set(x, "skipPermutation", value.asInstanceOf[js.Any])
    
    inline def setSkipPermutationUndefined: Self = StObject.set(x, "skipPermutation", js.undefined)
  }
}
