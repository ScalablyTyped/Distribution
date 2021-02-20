package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolBackpropAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.AvgPoolBackpropInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inputs extends StObject {
  
  var attrs: AvgPoolBackpropAttrs = js.native
  
  var backend: MathBackendCPU = js.native
  
  var inputs: AvgPoolBackpropInputs = js.native
}
object Inputs {
  
  @scala.inline
  def apply(attrs: AvgPoolBackpropAttrs, backend: MathBackendCPU, inputs: AvgPoolBackpropInputs): Inputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
  
  @scala.inline
  implicit class InputsMutableBuilder[Self <: Inputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: AvgPoolBackpropAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: AvgPoolBackpropInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
