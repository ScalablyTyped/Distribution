package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.LRNAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.LRNInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsLRNAttrs extends StObject {
  
  var attrs: LRNAttrs
  
  var backend: BackendWasm
  
  var inputs: LRNInputs
}
object AttrsLRNAttrs {
  
  inline def apply(attrs: LRNAttrs, backend: BackendWasm, inputs: LRNInputs): AttrsLRNAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsLRNAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsLRNAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: LRNAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: LRNInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
