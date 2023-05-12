package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.distBackendWasmMod.BackendWasm
import typings.tensorflowTfjsCore.distKernelNamesMod.CumsumAttrs
import typings.tensorflowTfjsCore.distKernelNamesMod.CumsumInputs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttrsCumsumAttrs extends StObject {
  
  var attrs: CumsumAttrs
  
  var backend: BackendWasm
  
  var inputs: CumsumInputs
}
object AttrsCumsumAttrs {
  
  inline def apply(attrs: CumsumAttrs, backend: BackendWasm, inputs: CumsumInputs): AttrsCumsumAttrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], backend = backend.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttrsCumsumAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttrsCumsumAttrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: CumsumAttrs): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setBackend(value: BackendWasm): Self = StObject.set(x, "backend", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: CumsumInputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
  }
}
