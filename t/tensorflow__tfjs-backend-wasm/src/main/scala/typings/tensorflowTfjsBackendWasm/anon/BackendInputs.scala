package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.backendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.kernelNamesMod.DepthToSpaceAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.DepthToSpaceInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendInputs extends StObject {
  
  var attrs: DepthToSpaceAttrs
  
  var backend: BackendWasm
  
  var inputs: DepthToSpaceInputs
}
object BackendInputs {
  
  inline def apply(attrs: DepthToSpaceAttrs, backend: BackendWasm, inputs: DepthToSpaceInputs): BackendInputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendInputs]
  }
  
  extension [Self <: BackendInputs](x: Self) {
    
    inline def setAttrs(value: DepthToSpaceAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: DepthToSpaceInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
