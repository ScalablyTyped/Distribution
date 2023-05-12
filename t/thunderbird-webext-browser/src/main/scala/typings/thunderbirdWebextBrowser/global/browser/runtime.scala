package typings.thunderbirdWebextBrowser.global.browser

import typings.std.Window
import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.manifest.WebExtensionManifest
import typings.thunderbirdWebextBrowser.browser.runtime.BrowserInfo
import typings.thunderbirdWebextBrowser.browser.runtime.ConnectConnectInfo
import typings.thunderbirdWebextBrowser.browser.runtime.DirectoryEntry
import typings.thunderbirdWebextBrowser.browser.runtime.LastError
import typings.thunderbirdWebextBrowser.browser.runtime.MessageSender
import typings.thunderbirdWebextBrowser.browser.runtime.OnInstalledDetails
import typings.thunderbirdWebextBrowser.browser.runtime.OnRestartRequiredReason
import typings.thunderbirdWebextBrowser.browser.runtime.OnUpdateAvailableDetails
import typings.thunderbirdWebextBrowser.browser.runtime.PlatformInfo
import typings.thunderbirdWebextBrowser.browser.runtime.Port
import typings.thunderbirdWebextBrowser.browser.runtime.SendMessageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtime {
  
  @JSGlobal("browser.runtime")
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[Port]
  inline def connect(connectInfo: ConnectConnectInfo): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(connectInfo.asInstanceOf[js.Any]).asInstanceOf[Port]
  inline def connect(extensionId: String): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(extensionId.asInstanceOf[js.Any]).asInstanceOf[Port]
  inline def connect(extensionId: String, connectInfo: ConnectConnectInfo): Port = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(extensionId.asInstanceOf[js.Any], connectInfo.asInstanceOf[js.Any])).asInstanceOf[Port]
  
  inline def connectNative(application: String): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connectNative")(application.asInstanceOf[js.Any]).asInstanceOf[Port]
  
  inline def getBackgroundPage(): js.Promise[Window] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundPage")().asInstanceOf[js.Promise[Window]]
  
  inline def getBrowserInfo(): js.Promise[BrowserInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBrowserInfo")().asInstanceOf[js.Promise[BrowserInfo]]
  
  inline def getFrameId(target: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFrameId")(target.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getManifest(): WebExtensionManifest = ^.asInstanceOf[js.Dynamic].applyDynamic("getManifest")().asInstanceOf[WebExtensionManifest]
  
  inline def getPackageDirectoryEntry(): js.Promise[DirectoryEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageDirectoryEntry")().asInstanceOf[js.Promise[DirectoryEntry]]
  
  inline def getPlatformInfo(): js.Promise[PlatformInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlatformInfo")().asInstanceOf[js.Promise[PlatformInfo]]
  
  inline def getURL(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getURL")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSGlobal("browser.runtime.id")
  @js.native
  val id: String = js.native
  
  @JSGlobal("browser.runtime.lastError")
  @js.native
  val lastError: js.UndefOr[LastError] = js.native
  
  @JSGlobal("browser.runtime.onBrowserUpdateAvailable")
  @js.native
  val onBrowserUpdateAvailable: js.UndefOr[WebExtEvent[js.Function0[Unit]]] = js.native
  
  @JSGlobal("browser.runtime.onConnect")
  @js.native
  val onConnect: WebExtEvent[js.Function1[/* port */ Port, Unit]] = js.native
  
  @JSGlobal("browser.runtime.onConnectExternal")
  @js.native
  val onConnectExternal: WebExtEvent[js.Function1[/* port */ Port, Unit]] = js.native
  
  @JSGlobal("browser.runtime.onInstalled")
  @js.native
  val onInstalled: WebExtEvent[js.Function1[/* details */ OnInstalledDetails, Unit]] = js.native
  
  @JSGlobal("browser.runtime.onMessage")
  @js.native
  val onMessage: WebExtEvent[
    js.Function3[
      /* message */ Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[Any], Unit], 
      Boolean | js.Promise[Any] | Unit
    ]
  ] = js.native
  
  @JSGlobal("browser.runtime.onMessageExternal")
  @js.native
  val onMessageExternal: WebExtEvent[
    js.Function3[
      /* message */ Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[Any], Unit], 
      Boolean | js.Promise[Any] | Unit
    ]
  ] = js.native
  
  @JSGlobal("browser.runtime.onRestartRequired")
  @js.native
  val onRestartRequired: js.UndefOr[WebExtEvent[js.Function1[/* reason */ OnRestartRequiredReason, Unit]]] = js.native
  
  @JSGlobal("browser.runtime.onStartup")
  @js.native
  val onStartup: WebExtEvent[js.Function0[Unit]] = js.native
  
  @JSGlobal("browser.runtime.onSuspend")
  @js.native
  val onSuspend: WebExtEvent[js.Function0[Unit]] = js.native
  
  @JSGlobal("browser.runtime.onSuspendCanceled")
  @js.native
  val onSuspendCanceled: WebExtEvent[js.Function0[Unit]] = js.native
  
  @JSGlobal("browser.runtime.onUpdateAvailable")
  @js.native
  val onUpdateAvailable: WebExtEvent[js.Function1[/* details */ OnUpdateAvailableDetails, Unit]] = js.native
  
  inline def openOptionsPage(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openOptionsPage")().asInstanceOf[js.Promise[Unit]]
  
  inline def reload(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[Unit]
  
  inline def requestUpdateCheck(): js.Promise[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestUpdateCheck")().asInstanceOf[js.Promise[js.Object]]
  
  inline def restart(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restart")().asInstanceOf[Unit]
  
  inline def sendMessage(extensionId: String, message: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def sendMessage(extensionId: String, message: Any, options: SendMessageOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(extensionId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def sendMessage(message: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def sendMessage(message: Any, options: SendMessageOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def sendNativeMessage(application: String, message: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendNativeMessage")(application.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def setUninstallURL(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUninstallURL")().asInstanceOf[js.Promise[Unit]]
  inline def setUninstallURL(url: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setUninstallURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
