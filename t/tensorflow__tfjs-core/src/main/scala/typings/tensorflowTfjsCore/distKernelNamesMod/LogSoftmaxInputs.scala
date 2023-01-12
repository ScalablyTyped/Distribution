package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'logits'> */
trait LogSoftmaxInputs extends StObject {
  
  var logits: js.UndefOr[scala.Any] = js.undefined
}
object LogSoftmaxInputs {
  
  inline def apply(): LogSoftmaxInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogSoftmaxInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogSoftmaxInputs] (val x: Self) extends AnyVal {
    
    inline def setLogits(value: scala.Any): Self = StObject.set(x, "logits", value.asInstanceOf[js.Any])
    
    inline def setLogitsUndefined: Self = StObject.set(x, "logits", js.undefined)
  }
}
