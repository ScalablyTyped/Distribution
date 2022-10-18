package typings.uint8arrays

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcXorMod {
  
  @JSImport("uint8arrays/dist/src/xor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def xor(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("xor")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
