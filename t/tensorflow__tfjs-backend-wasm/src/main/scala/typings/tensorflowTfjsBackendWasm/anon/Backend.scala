package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.AvgPool3DGradAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.AvgPool3DGradInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backend extends StObject {
  
  var attrs: AvgPool3DGradAttrs
  
  var backend: BackendWasm
  
  var inputs: AvgPool3DGradInputs
}
object Backend {
  
  inline def apply(attrs: AvgPool3DGradAttrs, backend: BackendWasm, inputs: AvgPool3DGradInputs): Backend = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Backend] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: AvgPool3DGradAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: AvgPool3DGradInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
