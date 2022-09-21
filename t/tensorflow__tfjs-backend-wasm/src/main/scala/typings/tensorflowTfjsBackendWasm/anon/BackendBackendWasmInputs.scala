package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.backendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.kernelNamesMod.SparseSegmentMeanInputs
import typings.tensorflowTfjsCore.kernelNamesMod.SparseSegmentSumInputs
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
  
  extension [Self <: BackendBackendWasmInputs](x: Self) {
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SparseSegmentSumInputs | SparseSegmentMeanInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
