package typings.typeformEmbed

import typings.typeformEmbed.anon.Blue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hexRgbMod {
  
  @JSImport("@typeform/embed/types/utils/hex-rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hexRgb(hex: String): Blue = ^.asInstanceOf[js.Dynamic].applyDynamic("hexRgb")(hex.asInstanceOf[js.Any]).asInstanceOf[Blue]
}
