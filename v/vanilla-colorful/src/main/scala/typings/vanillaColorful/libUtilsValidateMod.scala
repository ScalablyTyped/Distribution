package typings.vanillaColorful

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsValidateMod {
  
  @JSImport("vanilla-colorful/lib/utils/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validHex(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validHex")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validHex(value: String, alpha: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validHex")(value.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
