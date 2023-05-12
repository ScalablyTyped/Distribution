package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.FlipLeftRightInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsFlipLeftRightInputs extends StObject {
  
  var backend: BackendWasm
  
  var inputs: FlipLeftRightInputs
}
object InputsFlipLeftRightInputs {
  
  inline def apply(backend: BackendWasm, inputs: FlipLeftRightInputs): InputsFlipLeftRightInputs = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsFlipLeftRightInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsFlipLeftRightInputs] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: FlipLeftRightInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
