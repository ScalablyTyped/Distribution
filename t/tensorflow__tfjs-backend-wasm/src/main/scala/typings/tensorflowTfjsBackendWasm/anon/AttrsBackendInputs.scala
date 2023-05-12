package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.Conv3DAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.Conv3DInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsBackendInputs extends StObject {
  
  var attrs: Conv3DAttrs
  
  var backend: BackendWasm
  
  var inputs: Conv3DInputs
}
object AttrsBackendInputs {
  
  inline def apply(attrs: Conv3DAttrs, backend: BackendWasm, inputs: Conv3DInputs): AttrsBackendInputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsBackendInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsBackendInputs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: Conv3DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: Conv3DInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
