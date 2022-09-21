package typings.uint8arrays

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object equalsMod {
  
  @JSImport("uint8arrays/types/src/equals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def equals_(a: js.typedarray.Uint8Array, b: js.typedarray.Uint8Array): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
