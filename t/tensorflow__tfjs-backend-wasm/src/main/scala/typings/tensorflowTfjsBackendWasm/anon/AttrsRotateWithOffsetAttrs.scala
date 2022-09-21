package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.backendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.kernelNamesMod.RotateWithOffsetAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.RotateWithOffsetInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsRotateWithOffsetAttrs extends StObject {
  
  var attrs: RotateWithOffsetAttrs
  
  var backend: BackendWasm
  
  var inputs: RotateWithOffsetInputs
}
object AttrsRotateWithOffsetAttrs {
  
  inline def apply(attrs: RotateWithOffsetAttrs, backend: BackendWasm, inputs: RotateWithOffsetInputs): AttrsRotateWithOffsetAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsRotateWithOffsetAttrs]
  }
  
  extension [Self <: AttrsRotateWithOffsetAttrs](x: Self) {
    
    inline def setAttrs(value: RotateWithOffsetAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: RotateWithOffsetInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
