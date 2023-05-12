package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.commands.Command
import typings.thunderbirdWebextBrowser.browser.commands.UpdateDetail
import typings.thunderbirdWebextBrowser.browser.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commands {
  
  @JSGlobal("browser.commands")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAll(): js.Promise[js.Array[Command]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Promise[js.Array[Command]]]
  
  @JSGlobal("browser.commands.onCommand")
  @js.native
  val onCommand: WebExtEvent[js.Function2[/* command */ String, /* tab */ Tab, Unit]] = js.native
  
  inline def reset(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def update(detail: UpdateDetail): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(detail.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
