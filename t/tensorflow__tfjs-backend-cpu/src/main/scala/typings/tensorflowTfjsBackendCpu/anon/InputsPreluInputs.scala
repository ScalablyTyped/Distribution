package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.PreluInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputsPreluInputs extends StObject {
  
  var backend: MathBackendCPU = js.native
  
  var inputs: PreluInputs = js.native
}
object InputsPreluInputs {
  
  @scala.inline
  def apply(backend: MathBackendCPU, inputs: PreluInputs): InputsPreluInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsPreluInputs]
  }
  
  @scala.inline
  implicit class InputsPreluInputsMutableBuilder[Self <: InputsPreluInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: PreluInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
