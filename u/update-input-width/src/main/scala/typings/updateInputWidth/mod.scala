package typings.updateInputWidth

import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("update-input-width", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: HTMLInputElement): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  inline def getFontShorthand(element: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontShorthand")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def measureText(text: String, font: String): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("measureText")(text.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  inline def updateInputWidth(element: HTMLInputElement): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("updateInputWidth")(element.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
}
