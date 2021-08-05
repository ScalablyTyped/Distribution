package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'logits'> */
trait SoftmaxInputs extends StObject {
  
  var logits: js.UndefOr[js.Any] = js.undefined
}
object SoftmaxInputs {
  
  inline def apply(): SoftmaxInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftmaxInputs]
  }
  
  extension [Self <: SoftmaxInputs](x: Self) {
    
    inline def setLogits(value: js.Any): Self = StObject.set(x, "logits", value.asInstanceOf[js.Any])
    
    inline def setLogitsUndefined: Self = StObject.set(x, "logits", js.undefined)
  }
}
