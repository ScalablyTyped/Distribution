package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.IdentityInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsIdentityInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: IdentityInputs
}
object InputsIdentityInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: IdentityInputs): InputsIdentityInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsIdentityInputs]
  }
  
  extension [Self <: InputsIdentityInputs](x: Self) {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: IdentityInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
