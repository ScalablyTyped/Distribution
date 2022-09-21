package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.GatherNdInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsGatherNdInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: GatherNdInputs
}
object InputsGatherNdInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: GatherNdInputs): InputsGatherNdInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsGatherNdInputs]
  }
  
  extension [Self <: InputsGatherNdInputs](x: Self) {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: GatherNdInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
