package typings.tinySecp256k1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWasmPathMod {
  
  @JSImport("tiny-secp256k1/lib/wasm_path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def path(wasmFilename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(wasmFilename.asInstanceOf[js.Any]).asInstanceOf[String]
}
