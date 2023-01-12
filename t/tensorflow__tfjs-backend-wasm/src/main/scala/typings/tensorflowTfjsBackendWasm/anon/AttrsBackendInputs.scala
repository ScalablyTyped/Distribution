package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.ExpandDimsAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.ExpandDimsInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBackendInputs extends StObject {
  
  var attrs: ExpandDimsAttrs
  
  var backend: BackendWasm
  
  var inputs: ExpandDimsInputs
}
object AttrsBackendInputs {
  
  inline def apply(attrs: ExpandDimsAttrs, backend: BackendWasm, inputs: ExpandDimsInputs): AttrsBackendInputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackendInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsBackendInputs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: ExpandDimsAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: ExpandDimsInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
