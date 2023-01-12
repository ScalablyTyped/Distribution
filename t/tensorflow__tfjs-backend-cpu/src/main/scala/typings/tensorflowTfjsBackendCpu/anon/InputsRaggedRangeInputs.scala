package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.RaggedRangeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsRaggedRangeInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: RaggedRangeInputs
}
object InputsRaggedRangeInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: RaggedRangeInputs): InputsRaggedRangeInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsRaggedRangeInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsRaggedRangeInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: RaggedRangeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
