package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.ComplexInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsComplexInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: ComplexInputs
}
object InputsComplexInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: ComplexInputs): InputsComplexInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsComplexInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsComplexInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ComplexInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
