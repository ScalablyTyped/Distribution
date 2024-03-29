package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.SparseSegmentMeanInputs
import typings.tensorflowTfjsCore.distKernelNamesMod.SparseSegmentSumInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendBackendWasmInputs extends StObject {
  
  var backend: BackendWasm
  
  var inputs: SparseSegmentSumInputs | SparseSegmentMeanInputs
}
object BackendBackendWasmInputs {
  
  inline def apply(backend: BackendWasm, inputs: SparseSegmentSumInputs | SparseSegmentMeanInputs): BackendBackendWasmInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendBackendWasmInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackendBackendWasmInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SparseSegmentSumInputs | SparseSegmentMeanInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
