package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.backendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.kernelNamesMod.ComplexInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendMathBackendCPU extends StObject {
  
  var backend: MathBackendCPU = js.native
  
  var inputs: ComplexInputs = js.native
}
object BackendMathBackendCPU {
  
  @scala.inline
  def apply(backend: MathBackendCPU, inputs: ComplexInputs): BackendMathBackendCPU = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendMathBackendCPU]
  }
  
  @scala.inline
  implicit class BackendMathBackendCPUMutableBuilder[Self <: BackendMathBackendCPU] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: ComplexInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
