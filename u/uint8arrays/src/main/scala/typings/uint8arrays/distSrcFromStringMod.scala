package typings.uint8arrays

import typings.uint8arrays.distSrcUtilBasesMod.SupportedEncodings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFromStringMod {
  
  @JSImport("uint8arrays/dist/src/from-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromString(string: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def fromString(string: String, encoding: SupportedEncodings): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
}
