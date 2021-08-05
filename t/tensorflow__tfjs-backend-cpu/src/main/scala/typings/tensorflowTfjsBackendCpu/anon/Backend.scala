package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backend extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: PickNamedTensorInfoMapx
}
object Backend {
  
  inline def apply(backend: MathBackendCPU, inputs: PickNamedTensorInfoMapx): Backend = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend]
  }
  
  extension [Self <: Backend](x: Self) {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PickNamedTensorInfoMapx): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
