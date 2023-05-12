package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.browser.contentScripts.RegisteredContentScript
import typings.thunderbirdWebextBrowser.browser.contentScripts.RegisteredContentScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentScripts {
  
  @JSGlobal("browser.contentScripts")
  @js.native
  val ^ : js.Any = js.native
  
  inline def register(contentScriptOptions: RegisteredContentScriptOptions): js.Promise[RegisteredContentScript] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(contentScriptOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RegisteredContentScript]]
}
