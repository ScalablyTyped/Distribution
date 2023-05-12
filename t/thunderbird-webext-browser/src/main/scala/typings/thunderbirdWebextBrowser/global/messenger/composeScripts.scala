package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.messenger.composeScripts.RegisteredComposeScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composeScripts {
  
  @JSGlobal("messenger.composeScripts")
  @js.native
  val ^ : js.Any = js.native
  
  inline def register(composeScriptOptions: RegisteredComposeScriptOptions): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(composeScriptOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
