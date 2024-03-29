package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.RotateWithOffsetAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.RotateWithOffsetInputs
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsRotateWithOffsetAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: RotateWithOffsetAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: RotateWithOffsetInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
