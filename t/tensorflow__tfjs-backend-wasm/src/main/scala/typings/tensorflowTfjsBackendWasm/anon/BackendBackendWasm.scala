package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.DiagInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendBackendWasm extends StObject {
  
  var backend: BackendWasm
  
  var inputs: DiagInputs
}
object BackendBackendWasm {
  
  inline def apply(backend: BackendWasm, inputs: DiagInputs): BackendBackendWasm = {
    val __obj = js.Dynamic.literal(backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendBackendWasm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackendBackendWasm] (val x: Self) extends AnyVal {
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: DiagInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
