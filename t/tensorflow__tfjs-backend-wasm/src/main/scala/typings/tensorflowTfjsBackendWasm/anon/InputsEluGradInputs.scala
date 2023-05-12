package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.EluGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsEluGradInputs extends StObject {
  
  var backend: BackendWasm
  
  var inputs: EluGradInputs
}
object InputsEluGradInputs {
  
  inline def apply(backend: BackendWasm, inputs: EluGradInputs): InputsEluGradInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsEluGradInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsEluGradInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: EluGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
