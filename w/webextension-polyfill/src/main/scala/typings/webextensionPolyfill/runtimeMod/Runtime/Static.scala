package typings.webextensionPolyfill.runtimeMod.Runtime

import typings.std.Window
import typings.webextensionPolyfill.eventsMod.Events.Event
import typings.webextensionPolyfill.manifestMod.Manifest.WebExtensionManifest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Static extends StObject {
  
  /**
    * Attempts to connect to connect listeners within an extension/app (such as the background page), or other extensions/apps.
    * This is useful for content scripts connecting to their extension processes, inter-app/extension communication,
    * and $(topic:manifest/externally_connectable)[web messaging]. Note that this does not connect to any listeners in a
    * content script. Extensions may connect to content scripts embedded in tabs via $(ref:tabs.connect).
    *
    * @param extensionId Optional. The ID of the extension or app to connect to. If omitted,
    * a connection will be attempted with your own extension. Required if sending messages from a web page for
    * $(topic:manifest/externally_connectable)[web messaging].
    * @param connectInfo Optional.
    * @returns Port through which messages can be sent and received. The port's $(ref:runtime.Port onDisconnect)
    * event is fired if the extension/app does not exist.
    */
  def connect(): Port = js.native
  def connect(connectInfo: ConnectConnectInfoType): Port = js.native
  def connect(extensionId: String): Port = js.native
  def connect(extensionId: String, connectInfo: ConnectConnectInfoType): Port = js.native
  def connect(extensionId: Unit, connectInfo: ConnectConnectInfoType): Port = js.native
  
  /**
    * Connects to a native application in the host machine.
    *
    * @param application The name of the registered application to connect to.
    * @returns Port through which messages can be sent and received with the application
    */
  def connectNative(application: String): Port = js.native
  
  /**
    * Retrieves the JavaScript 'window' object for the background page running inside the current extension/app.
    * If the background page is an event page, the system will ensure it is loaded before calling the callback.
    * If there is no background page, an error is set.
    */
  def getBackgroundPage(): js.Promise[Window] = js.native
  
  /**
    * Returns information about the current browser.
    *
    * @returns Called with results
    */
  def getBrowserInfo(): js.Promise[BrowserInfo] = js.native
  
  /**
    * Get the frameId of any window global or frame element.
    *
    * @param target A WindowProxy or a Browsing Context container element (IFrame, Frame, Embed, Object) for the target frame.
    * @returns The frameId of the target frame, or -1 if it doesn't exist.
    */
  def getFrameId(target: Any): Double = js.native
  
  /**
    * Returns details about the app or extension from the manifest. The object returned is a serialization of the full
    * $(topic:manifest)[manifest file].
    *
    * @returns The manifest details.
    */
  def getManifest(): WebExtensionManifest = js.native
  
  /**
    * Returns information about the current platform.
    *
    * @returns Called with results
    */
  def getPlatformInfo(): js.Promise[PlatformInfo] = js.native
  
  /**
    * Converts a relative path within an app/extension install directory to a fully-qualified URL.
    *
    * @param path A path to a resource within an app/extension expressed relative to its install directory.
    * @returns The fully-qualified URL to the resource.
    */
  def getURL(path: String): String = js.native
  
  /**
    * The ID of the extension/app.
    */
  var id: String = js.native
  
  /**
    * This will be defined during an API method callback if there was an error
    * Optional.
    */
  var lastError: js.UndefOr[PropertyLastErrorType] = js.native
  
  /**
    * Fired when a connection is made from either an extension process or a content script.
    *
    * @param port
    */
  var onConnect: Event[js.Function1[/* port */ Port, Unit]] = js.native
  
  /**
    * Fired when a connection is made from another extension.
    *
    * @param port
    */
  var onConnectExternal: Event[js.Function1[/* port */ Port, Unit]] = js.native
  
  /**
    * Fired when the extension is first installed, when the extension is updated to a new version,
    * and when the browser is updated to a new version.
    *
    * @param details
    */
  var onInstalled: Event[js.Function1[/* details */ OnInstalledDetailsType, Unit]] = js.native
  
  /**
    * Fired when a message is sent from either an extension process or a content script.
    *
    * @param message Optional. The message sent by the calling script.
    * @param sender
    */
  var onMessage: Event[
    js.Function2[/* message */ Any, /* sender */ MessageSender, js.Promise[Any] | Unit]
  ] = js.native
  
  /**
    * Fired when a message is sent from another extension/app. Cannot be used in a content script.
    *
    * @param message Optional. The message sent by the calling script.
    * @param sender
    */
  var onMessageExternal: Event[
    js.Function2[/* message */ Any, /* sender */ MessageSender, js.Promise[Any] | Unit]
  ] = js.native
  
  /**
    * Fired when a profile that has this extension installed first starts up. This event is not fired for incognito profiles.
    */
  var onStartup: Event[js.Function0[Unit]] = js.native
  
  /**
    * Sent to the event page just before it is unloaded. This gives the extension opportunity to do some clean up.
    * Note that since the page is unloading, any asynchronous operations started while handling this event are not guaranteed
    * to complete. If more activity for the event page occurs before it gets unloaded the onSuspendCanceled event will be sent
    * and the page won't be unloaded.
    */
  var onSuspend: Event[js.Function0[Unit]] = js.native
  
  /**
    * Sent after onSuspend to indicate that the app won't be unloaded after all.
    */
  var onSuspendCanceled: Event[js.Function0[Unit]] = js.native
  
  /**
    * Fired when an update is available, but isn't installed immediately because the app is currently running.
    * If you do nothing, the update will be installed the next time the background page gets unloaded,
    * if you want it to be installed sooner you can explicitly call $(ref:runtime.reload).
    * If your extension is using a persistent background page, the background page of course never gets unloaded,
    * so unless you call $(ref:runtime.reload) manually in response to this event the update will not get installed until the
    * next time the browser itself restarts. If no handlers are listening for this event,
    * and your extension has a persistent background page, it behaves as if $(ref:runtime.reload)
    * is called in response to this event.
    *
    * @param details The manifest details of the available update.
    */
  var onUpdateAvailable: Event[js.Function1[/* details */ OnUpdateAvailableDetailsType, Unit]] = js.native
  
  /**
    * <p>Open your Extension's options page, if possible.</p><p>The precise behavior may depend on your manifest's <code>
    * $(topic:optionsV2)[options_ui]</code> or <code>$(topic:options)[options_page]</code> key,
    * or what the browser happens to support at the time.</p><p>If your Extension does not declare an options page,
    * or the browser failed to create one for some other reason, the callback will set $(ref:lastError).</p>
    */
  def openOptionsPage(): js.Promise[Unit] = js.native
  
  /**
    * Reloads the app or extension.
    */
  def reload(): Unit = js.native
  
  /**
    * Requests an update check for this app/extension.
    */
  def requestUpdateCheck(): js.Promise[js.Tuple2[RequestUpdateCheckStatus, RequestUpdateCheckCallbackDetailsType]] = js.native
  
  /**
    * Sends a single message to event listeners within your extension/app or a different extension/app.
    * Similar to $(ref:runtime.connect) but only sends a single message, with an optional response.
    * If sending to your extension, the $(ref:runtime.onMessage) event will be fired in each page, or $(ref:runtime.
    * onMessageExternal), if a different extension. Note that extensions cannot send messages to content scripts using this
    * method. To send messages to content scripts, use $(ref:tabs.sendMessage).
    *
    * @param extensionId Optional. The ID of the extension/app to send the message to. If omitted,
    * the message will be sent to your own extension/app. Required if sending messages from a web page for
    * $(topic:manifest/externally_connectable)[web messaging].
    * @param message
    * @param options Optional.
    */
  def sendMessage(extensionId: String, message: Any): js.Promise[Any] = js.native
  def sendMessage(extensionId: String, message: Any, options: SendMessageOptionsType): js.Promise[Any] = js.native
  def sendMessage(extensionId: Unit, message: Any): js.Promise[Any] = js.native
  def sendMessage(extensionId: Unit, message: Any, options: SendMessageOptionsType): js.Promise[Any] = js.native
  /**
    * Sends a single message to event listeners within your extension/app or a different extension/app.
    * Similar to $(ref:runtime.connect) but only sends a single message, with an optional response.
    * If sending to your extension, the $(ref:runtime.onMessage) event will be fired in each page, or $(ref:runtime.
    * onMessageExternal), if a different extension. Note that extensions cannot send messages to content scripts using this
    * method. To send messages to content scripts, use $(ref:tabs.sendMessage).
    *
    * @param message
    * @param options Optional.
    */
  def sendMessage(message: Any): js.Promise[Any] = js.native
  def sendMessage(message: Any, options: SendMessageOptionsType): js.Promise[Any] = js.native
  
  /**
    * Send a single message to a native application.
    *
    * @param application The name of the native messaging host.
    * @param message The message that will be passed to the native messaging host.
    */
  def sendNativeMessage(application: String, message: Any): js.Promise[Any] = js.native
  
  /**
    * Sets the URL to be visited upon uninstallation. This may be used to clean up server-side data, do analytics,
    * and implement surveys. Maximum 255 characters.
    *
    * @param url Optional. URL to be opened after the extension is uninstalled. This URL must have an http: or https: scheme.
    * Set an empty string to not open a new tab upon uninstallation.
    * @returns Called when the uninstall URL is set. If the given URL is invalid, $(ref:runtime.lastError) will be set.
    */
  def setUninstallURL(): js.Promise[Unit] = js.native
  def setUninstallURL(url: String): js.Promise[Unit] = js.native
}
