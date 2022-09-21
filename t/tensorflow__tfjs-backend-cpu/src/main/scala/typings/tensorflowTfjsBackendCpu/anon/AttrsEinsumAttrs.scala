package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.EinsumAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.EinsumInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsEinsumAttrs extends StObject {
  
  var attrs: EinsumAttrs
  
  var backend: MathBackendCPU
  
  var inputs: EinsumInputs
}
object AttrsEinsumAttrs {
  
  inline def apply(attrs: EinsumAttrs, backend: MathBackendCPU, inputs: EinsumInputs): AttrsEinsumAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsEinsumAttrs]
  }
  
  extension [Self <: AttrsEinsumAttrs](x: Self) {
    
    inline def setAttrs(value: EinsumAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: EinsumInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: TensorInfo*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}
