package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.MaxPoolBackpropAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.MaxPoolBackpropInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMaxPoolBackpropAttrs extends StObject {
  
  var attrs: MaxPoolBackpropAttrs
  
  var backend: MathBackendCPU
  
  var inputs: MaxPoolBackpropInputs
}
object AttrsMaxPoolBackpropAttrs {
  
  @scala.inline
  def apply(attrs: MaxPoolBackpropAttrs, backend: MathBackendCPU, inputs: MaxPoolBackpropInputs): AttrsMaxPoolBackpropAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMaxPoolBackpropAttrs]
  }
  
  @scala.inline
  implicit class AttrsMaxPoolBackpropAttrsMutableBuilder[Self <: AttrsMaxPoolBackpropAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: MaxPoolBackpropAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: MaxPoolBackpropInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
