package typings.uint8arrays

import typings.uint8arrays.distSrcUtilBasesMod.SupportedEncodings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcToStringMod {
  
  @JSImport("uint8arrays/dist/src/to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toString_(array: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toString_(array: js.typedarray.Uint8Array, encoding: SupportedEncodings): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(array.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
}
