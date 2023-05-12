package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.DepthToSpaceAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.DepthToSpaceInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsDepthToSpaceAttrs extends StObject {
  
  var attrs: DepthToSpaceAttrs
  
  var backend: BackendWasm
  
  var inputs: DepthToSpaceInputs
}
object AttrsDepthToSpaceAttrs {
  
  inline def apply(attrs: DepthToSpaceAttrs, backend: BackendWasm, inputs: DepthToSpaceInputs): AttrsDepthToSpaceAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsDepthToSpaceAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsDepthToSpaceAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: DepthToSpaceAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: DepthToSpaceInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
