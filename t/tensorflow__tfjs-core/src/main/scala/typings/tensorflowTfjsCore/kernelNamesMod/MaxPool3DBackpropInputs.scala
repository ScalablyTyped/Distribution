package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy' | 'input' | 'output'> */
trait MaxPool3DBackpropInputs extends StObject {
  
  var dy: js.UndefOr[js.Any] = js.undefined
  
  var input: js.UndefOr[js.Any] = js.undefined
  
  var output: js.UndefOr[js.Any] = js.undefined
}
object MaxPool3DBackpropInputs {
  
  @scala.inline
  def apply(): MaxPool3DBackpropInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxPool3DBackpropInputs]
  }
  
  @scala.inline
  implicit class MaxPool3DBackpropInputsMutableBuilder[Self <: MaxPool3DBackpropInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDy(value: js.Any): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setInput(value: js.Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setOutput(value: js.Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
