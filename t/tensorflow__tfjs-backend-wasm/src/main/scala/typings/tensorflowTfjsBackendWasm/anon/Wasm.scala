package typings.tensorflowTfjsBackendWasm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wasm extends StObject {
  
  var wasm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BackendWasmModule */ Any
}
object Wasm {
  
  inline def apply(
    wasm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BackendWasmModule */ Any
  ): Wasm = {
    val __obj = js.Dynamic.literal(wasm = wasm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wasm]
  }
  
  extension [Self <: Wasm](x: Self) {
    
    inline def setWasm(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BackendWasmModule */ Any
    ): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
  }
}
