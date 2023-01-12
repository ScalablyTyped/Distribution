package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.SparseFillEmptyRowsInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsSparseFillEmptyRowsInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: SparseFillEmptyRowsInputs
}
object InputsSparseFillEmptyRowsInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: SparseFillEmptyRowsInputs): InputsSparseFillEmptyRowsInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsSparseFillEmptyRowsInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsSparseFillEmptyRowsInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SparseFillEmptyRowsInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
