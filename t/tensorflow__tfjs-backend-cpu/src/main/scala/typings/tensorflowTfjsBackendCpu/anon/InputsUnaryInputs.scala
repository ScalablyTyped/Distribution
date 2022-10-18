package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.UnaryInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsUnaryInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: UnaryInputs
}
object InputsUnaryInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: UnaryInputs): InputsUnaryInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsUnaryInputs]
  }
  
  extension [Self <: InputsUnaryInputs](x: Self) {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: UnaryInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
