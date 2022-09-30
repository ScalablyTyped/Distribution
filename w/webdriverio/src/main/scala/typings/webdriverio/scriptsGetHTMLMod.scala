package typings.webdriverio

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptsGetHTMLMod {
  
  @JSImport("webdriverio/build/scripts/getHTML", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(element: HTMLElement, includeSelectorTag: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(element.asInstanceOf[js.Any], includeSelectorTag.asInstanceOf[js.Any])).asInstanceOf[String]
}
