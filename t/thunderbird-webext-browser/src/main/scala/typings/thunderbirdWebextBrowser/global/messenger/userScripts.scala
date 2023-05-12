package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.userScripts.OnBeforeScriptUserScript
import typings.thunderbirdWebextBrowser.messenger.userScripts.RegisteredUserScript
import typings.thunderbirdWebextBrowser.messenger.userScripts.UserScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userScripts {
  
  @JSGlobal("messenger.userScripts")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("messenger.userScripts.onBeforeScript")
  @js.native
  val onBeforeScript: WebExtEvent[js.Function1[/* userScript */ OnBeforeScriptUserScript, Unit]] = js.native
  
  inline def register(userScriptOptions: UserScriptOptions): js.Promise[RegisteredUserScript] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(userScriptOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RegisteredUserScript]]
}
