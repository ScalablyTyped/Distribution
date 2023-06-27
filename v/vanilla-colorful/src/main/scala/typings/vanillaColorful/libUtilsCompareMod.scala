package typings.vanillaColorful

import typings.vanillaColorful.libTypesMod.ObjectColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsCompareMod {
  
  @JSImport("vanilla-colorful/lib/utils/compare", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def equalColorObjects(first: ObjectColor, second: ObjectColor): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalColorObjects")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def equalColorString(first: String, second: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalColorString")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def equalHex(first: String, second: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalHex")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
