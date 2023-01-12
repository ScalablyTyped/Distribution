package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.LeakyReluAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.LeakyReluInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsLeakyReluAttrs extends StObject {
  
  var attrs: LeakyReluAttrs
  
  var backend: BackendWasm
  
  var inputs: LeakyReluInputs
}
object AttrsLeakyReluAttrs {
  
  inline def apply(attrs: LeakyReluAttrs, backend: BackendWasm, inputs: LeakyReluInputs): AttrsLeakyReluAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsLeakyReluAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsLeakyReluAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: LeakyReluAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: LeakyReluInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
