package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.RaggedTensorToTensorAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.RaggedTensorToTensorInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsRaggedTensorToTensorAttrs extends StObject {
  
  var attrs: RaggedTensorToTensorAttrs
  
  var backend: MathBackendCPU
  
  var inputs: RaggedTensorToTensorInputs
}
object AttrsRaggedTensorToTensorAttrs {
  
  inline def apply(attrs: RaggedTensorToTensorAttrs, backend: MathBackendCPU, inputs: RaggedTensorToTensorInputs): AttrsRaggedTensorToTensorAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsRaggedTensorToTensorAttrs]
  }
  
  extension [Self <: AttrsRaggedTensorToTensorAttrs](x: Self) {
    
    inline def setAttrs(value: RaggedTensorToTensorAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: RaggedTensorToTensorInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
