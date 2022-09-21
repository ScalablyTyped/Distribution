package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'logits'> */
trait MultinomialInputs extends StObject {
  
  var logits: js.UndefOr[scala.Any] = js.undefined
}
object MultinomialInputs {
  
  inline def apply(): MultinomialInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultinomialInputs]
  }
  
  extension [Self <: MultinomialInputs](x: Self) {
    
    inline def setLogits(value: scala.Any): Self = StObject.set(x, "logits", value.asInstanceOf[js.Any])
    
    inline def setLogitsUndefined: Self = StObject.set(x, "logits", js.undefined)
  }
}
