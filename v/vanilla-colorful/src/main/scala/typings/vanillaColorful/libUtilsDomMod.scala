package typings.vanillaColorful

import typings.std.HTMLElement
import typings.std.HTMLTemplateElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsDomMod {
  
  @JSImport("vanilla-colorful/lib/utils/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fire(target: HTMLElement, `type`: String, detail: Record[String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fire")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def tpl(html: String): HTMLTemplateElement = ^.asInstanceOf[js.Dynamic].applyDynamic("tpl")(html.asInstanceOf[js.Any]).asInstanceOf[HTMLTemplateElement]
}
