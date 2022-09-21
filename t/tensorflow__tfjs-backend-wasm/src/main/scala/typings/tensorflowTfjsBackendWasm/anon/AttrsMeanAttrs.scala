package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.backendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.kernelNamesMod.MeanAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.MeanInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsMeanAttrs extends StObject {
  
  var attrs: MeanAttrs
  
  var backend: BackendWasm
  
  var inputs: MeanInputs
}
object AttrsMeanAttrs {
  
  inline def apply(attrs: MeanAttrs, backend: BackendWasm, inputs: MeanInputs): AttrsMeanAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsMeanAttrs]
  }
  
  extension [Self <: AttrsMeanAttrs](x: Self) {
    
    inline def setAttrs(value: MeanAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: MeanInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
