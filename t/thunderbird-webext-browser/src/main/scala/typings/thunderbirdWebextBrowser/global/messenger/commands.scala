package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.commands.Command
import typings.thunderbirdWebextBrowser.messenger.commands.UpdateDetail
import typings.thunderbirdWebextBrowser.messenger.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commands {
  
  @JSGlobal("messenger.commands")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAll(): js.Promise[js.Array[Command]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Promise[js.Array[Command]]]
  
  @JSGlobal("messenger.commands.onCommand")
  @js.native
  val onCommand: WebExtEvent[js.Function2[/* command */ String, /* tab */ Tab, Unit]] = js.native
  
  inline def reset(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def update(detail: UpdateDetail): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(detail.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
