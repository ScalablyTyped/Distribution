package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.BatchMatMulAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.BatchMatMulInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBackend extends StObject {
  
  var attrs: BatchMatMulAttrs
  
  var backend: MathBackendCPU
  
  var inputs: BatchMatMulInputs
}
object AttrsBackend {
  
  @scala.inline
  def apply(attrs: BatchMatMulAttrs, backend: MathBackendCPU, inputs: BatchMatMulInputs): AttrsBackend = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackend]
  }
  
  @scala.inline
  implicit class AttrsBackendMutableBuilder[Self <: AttrsBackend] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttrs(value: BatchMatMulAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: BatchMatMulInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
