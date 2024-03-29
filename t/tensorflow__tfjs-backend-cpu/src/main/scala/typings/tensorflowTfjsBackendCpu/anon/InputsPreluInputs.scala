package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.PreluInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsPreluInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: PreluInputs
}
object InputsPreluInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: PreluInputs): InputsPreluInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsPreluInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsPreluInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: PreluInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
