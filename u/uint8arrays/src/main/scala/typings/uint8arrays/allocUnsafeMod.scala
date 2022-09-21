package typings.uint8arrays

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object allocUnsafeMod {
  
  @JSImport("uint8arrays/types/src/util/alloc-unsafe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def allocUnsafe(length: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("allocUnsafe")(length.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
