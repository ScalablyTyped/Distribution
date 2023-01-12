package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy' | 'input' | 'output'> */
trait MaxPoolGradInputs extends StObject {
  
  var dy: js.UndefOr[scala.Any] = js.undefined
  
  var input: js.UndefOr[scala.Any] = js.undefined
  
  var output: js.UndefOr[scala.Any] = js.undefined
}
object MaxPoolGradInputs {
  
  inline def apply(): MaxPoolGradInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxPoolGradInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxPoolGradInputs] (val x: Self) extends AnyVal {
    
    inline def setDy(value: scala.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setInput(value: scala.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setOutput(value: scala.Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
