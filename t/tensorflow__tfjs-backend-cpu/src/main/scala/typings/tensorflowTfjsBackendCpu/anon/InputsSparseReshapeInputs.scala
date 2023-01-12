package typings.tensorflowTfjsBackendCpu.anon

import typings.tensorflowTfjsBackendCpu.distBackendCpuMod.MathBackendCPU
import typings.tensorflowTfjsCore.distKernelNamesMod.SparseReshapeInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsSparseReshapeInputs extends StObject {
  
  var backend: MathBackendCPU
  
  var inputs: SparseReshapeInputs
}
object InputsSparseReshapeInputs {
  
  inline def apply(backend: MathBackendCPU, inputs: SparseReshapeInputs): InputsSparseReshapeInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsSparseReshapeInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsSparseReshapeInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: MathBackendCPU): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SparseReshapeInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
