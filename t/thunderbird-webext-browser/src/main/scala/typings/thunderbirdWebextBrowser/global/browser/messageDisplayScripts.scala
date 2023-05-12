package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.browser.messageDisplayScripts.RegisteredMessageDisplayScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageDisplayScripts {
  
  @JSGlobal("browser.messageDisplayScripts")
  @js.native
  val ^ : js.Any = js.native
  
  inline def register(messageDisplayScriptOptions: RegisteredMessageDisplayScriptOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(messageDisplayScriptOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
