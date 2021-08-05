package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.ComplexInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendMathBackendCPU extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: ComplexInputs
}
object BackendMathBackendCPU {
  
  inline def apply(backend: MathBackendCPU, inputs: ComplexInputs): BackendMathBackendCPU = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendMathBackendCPU]
  }
  
  extension [Self <: BackendMathBackendCPU](x: Self) {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ComplexInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
