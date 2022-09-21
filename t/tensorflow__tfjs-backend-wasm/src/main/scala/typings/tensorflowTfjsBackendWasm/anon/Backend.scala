package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.backendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.kernelNamesMod.ConcatAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.ConcatInputs
import typings.tensorflowTfjsCore.kernelRegistryMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backend extends StObject {
  
  var attrs: ConcatAttrs
  
  var backend: BackendWasm
  
  var inputs: ConcatInputs
}
object Backend {
  
  inline def apply(attrs: ConcatAttrs, backend: BackendWasm, inputs: ConcatInputs): Backend = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend]
  }
  
  extension [Self <: Backend](x: Self) {
    
    inline def setAttrs(value: ConcatAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ConcatInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsVarargs(value: TensorInfo*): Self = StObject.set(x, "inputs", js.Array(value*))
  }
}
