package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy' | 'input'> */
trait AvgPool3DBackpropInputs extends StObject {
  
  var dy: js.UndefOr[js.Any] = js.undefined
  
  var input: js.UndefOr[js.Any] = js.undefined
}
object AvgPool3DBackpropInputs {
  
  inline def apply(): AvgPool3DBackpropInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvgPool3DBackpropInputs]
  }
  
  extension [Self <: AvgPool3DBackpropInputs](x: Self) {
    
    inline def setDy(value: js.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setInput(value: js.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
  }
}
