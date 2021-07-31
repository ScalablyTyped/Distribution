package typings.webdriverio

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptsIsFocusedMod {
  
  @JSImport("webdriverio/build/scripts/isFocused", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(elem: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(elem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
