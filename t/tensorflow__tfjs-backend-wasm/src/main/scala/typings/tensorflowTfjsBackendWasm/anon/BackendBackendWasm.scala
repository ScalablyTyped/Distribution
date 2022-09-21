package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.backendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.kernelNamesMod.FlipLeftRightInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendBackendWasm extends StObject {
  
  var backend: BackendWasm
  
  var inputs: FlipLeftRightInputs
}
object BackendBackendWasm {
  
  inline def apply(backend: BackendWasm, inputs: FlipLeftRightInputs): BackendBackendWasm = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendBackendWasm]
  }
  
  extension [Self <: BackendBackendWasm](x: Self) {
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: FlipLeftRightInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
