package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.backendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.kernelNamesMod.CumprodAttrs
import typings.tensorflowTfjsCore.kernelNamesMod.CumprodInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Inputs extends StObject {
  
  var attrs: CumprodAttrs
  
  var backend: BackendWasm
  
  var inputs: CumprodInputs
}
object Inputs {
  
  inline def apply(attrs: CumprodAttrs, backend: BackendWasm, inputs: CumprodInputs): Inputs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inputs]
  }
  
  extension [Self <: Inputs](x: Self) {
    
    inline def setAttrs(value: CumprodAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: CumprodInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
