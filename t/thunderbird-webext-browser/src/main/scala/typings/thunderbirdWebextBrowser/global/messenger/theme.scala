package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.manifest.ThemeType
import typings.thunderbirdWebextBrowser.messenger.theme.ThemeUpdateInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object theme {
  
  @JSGlobal("messenger.theme")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCurrent(): js.Promise[ThemeType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")().asInstanceOf[js.Promise[ThemeType]]
  inline def getCurrent(windowId: Double): js.Promise[ThemeType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")(windowId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ThemeType]]
  
  @JSGlobal("messenger.theme.onUpdated")
  @js.native
  val onUpdated: WebExtEvent[js.Function1[/* updateInfo */ ThemeUpdateInfo, Unit]] = js.native
  
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  inline def reset(windowId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")(windowId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def update(details: ThemeType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def update(windowId: Double, details: ThemeType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(windowId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
