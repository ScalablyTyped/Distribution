package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.ImagInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputsImagInputs extends StObject {
  
  var backend: MathBackendCPU = js.native
  
  var inputs: ImagInputs = js.native
}
object InputsImagInputs {
  
  @scala.inline
  def apply(backend: MathBackendCPU, inputs: ImagInputs): InputsImagInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsImagInputs]
  }
  
  @scala.inline
  implicit class InputsImagInputsMutableBuilder[Self <: InputsImagInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: ImagInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
