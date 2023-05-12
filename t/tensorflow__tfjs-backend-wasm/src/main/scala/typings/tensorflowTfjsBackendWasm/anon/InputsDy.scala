package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.Dilation2DAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputsDy extends StObject {
  
  var attrs: Dilation2DAttrs
  
  var backend: BackendWasm
  
  var inputs: Dy
}
object InputsDy {
  
  inline def apply(attrs: Dilation2DAttrs, backend: BackendWasm, inputs: Dy): InputsDy = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputsDy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputsDy] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: Dilation2DAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: Dy): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
