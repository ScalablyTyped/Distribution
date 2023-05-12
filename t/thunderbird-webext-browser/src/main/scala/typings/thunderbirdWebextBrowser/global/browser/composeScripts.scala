package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.browser.composeScripts.RegisteredComposeScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composeScripts {
  
  @JSGlobal("browser.composeScripts")
  @js.native
  val ^ : js.Any = js.native
  
  inline def register(composeScriptOptions: RegisteredComposeScriptOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(composeScriptOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
