package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.SparseFillEmptyRowsInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsSparseFillEmptyRowsInputs extends StObject {
  
  var backend: BackendWasm
  
  var inputs: SparseFillEmptyRowsInputs
}
object InputsSparseFillEmptyRowsInputs {
  
  inline def apply(backend: BackendWasm, inputs: SparseFillEmptyRowsInputs): InputsSparseFillEmptyRowsInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsSparseFillEmptyRowsInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsSparseFillEmptyRowsInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: SparseFillEmptyRowsInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
