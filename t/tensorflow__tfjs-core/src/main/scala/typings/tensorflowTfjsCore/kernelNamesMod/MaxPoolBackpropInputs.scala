package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/kernel_registry.NamedTensorInfoMap, 'dy' | 'input' | 'output'> */
@js.native
trait MaxPoolBackpropInputs extends StObject {
  
  var dy: js.UndefOr[js.Any] = js.native
  
  var input: js.UndefOr[js.Any] = js.native
  
  var output: js.UndefOr[js.Any] = js.native
}
object MaxPoolBackpropInputs {
  
  @scala.inline
  def apply(): MaxPoolBackpropInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxPoolBackpropInputs]
  }
  
  @scala.inline
  implicit class MaxPoolBackpropInputsMutableBuilder[Self <: MaxPoolBackpropInputs] (val x: Self) extends AnyVal {
    
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
