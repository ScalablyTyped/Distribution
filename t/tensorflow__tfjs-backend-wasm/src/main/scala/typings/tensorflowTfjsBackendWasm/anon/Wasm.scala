package typings.tensorflowTfjsBackendWasm.anon

import typings.tensorflowTfjsBackendWasm.tfjsBackendWasmMod.BackendWasmModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wasm extends StObject {
  
  var wasm: BackendWasmModule
}
object Wasm {
  
  inline def apply(wasm: BackendWasmModule): Wasm = {
    val __obj = js.Dynamic.literal(wasm = wasm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wasm]
  }
  
  extension [Self <: Wasm](x: Self) {
    
    inline def setWasm(value: BackendWasmModule): Self = StObject.set(x, "wasm", value.asInstanceOf[js.Any])
  }
}
