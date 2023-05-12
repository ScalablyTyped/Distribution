package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.management.ExtensionInfo
import typings.thunderbirdWebextBrowser.messenger.management.InstallOptions
import typings.thunderbirdWebextBrowser.messenger.management.InstallReturnResult
import typings.thunderbirdWebextBrowser.messenger.management.UninstallSelfOptions
import typings.thunderbirdWebextBrowser.messenger.manifest.ExtensionID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object management {
  
  @JSGlobal("messenger.management")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(id: ExtensionID): js.Promise[ExtensionInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExtensionInfo]]
  
  inline def getAll(): js.Promise[js.Array[ExtensionInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Promise[js.Array[ExtensionInfo]]]
  
  inline def getSelf(): js.Promise[ExtensionInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelf")().asInstanceOf[js.Promise[ExtensionInfo]]
  
  inline def install(options: InstallOptions): js.Promise[InstallReturnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[InstallReturnResult]]
  
  @JSGlobal("messenger.management.onDisabled")
  @js.native
  val onDisabled: WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
  
  @JSGlobal("messenger.management.onEnabled")
  @js.native
  val onEnabled: WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
  
  @JSGlobal("messenger.management.onInstalled")
  @js.native
  val onInstalled: WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
  
  @JSGlobal("messenger.management.onUninstalled")
  @js.native
  val onUninstalled: WebExtEvent[js.Function1[/* info */ ExtensionInfo, Unit]] = js.native
  
  inline def setEnabled(id: String, enabled: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setEnabled")(id.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def uninstallSelf(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")().asInstanceOf[js.Promise[Unit]]
  inline def uninstallSelf(options: UninstallSelfOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstallSelf")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
