package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.messenger.contentScripts.RegisteredContentScript
import typings.thunderbirdWebextBrowser.messenger.contentScripts.RegisteredContentScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentScripts {
  
  @JSGlobal("messenger.contentScripts")
  @js.native
  val ^ : js.Any = js.native
  
  inline def register(contentScriptOptions: RegisteredContentScriptOptions): js.Promise[RegisteredContentScript] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(contentScriptOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RegisteredContentScript]]
}
