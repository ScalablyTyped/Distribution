package typings.tampermonkey

import org.scalablytyped.runtime.NumberDictionary
import typings.std.HTMLStyleElement
import typings.std.Window
import typings.tampermonkey.Tampermonkey.AbortHandle
import typings.tampermonkey.Tampermonkey.DownloadRequest
import typings.tampermonkey.Tampermonkey.NotificationDetails
import typings.tampermonkey.Tampermonkey.NotificationOnClick
import typings.tampermonkey.Tampermonkey.NotificationOnDone
import typings.tampermonkey.Tampermonkey.OpenTabObject
import typings.tampermonkey.Tampermonkey.OpenTabOptions
import typings.tampermonkey.Tampermonkey.Request
import typings.tampermonkey.Tampermonkey.ValueChangeListener
import typings.tampermonkey.anon.Mimetype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  /**
    * The unsafeWindow object provides full access to the pages javascript
    * functions and variables
    */
  var unsafeWindow: Window = js.native
  // Styles
  /**
    * Adds the given style to the document and returns the injected style element.
    */
  @JSName("GM_addStyle")
  def GMAddStyle(css: String): HTMLStyleElement = js.native
  /**
    * Adds a change listener to the storage and returns the listener ID.
    * The `remote` argument of the callback function shows whether this value was
    * modified from the instance of another tab (`true`) or within this script
    * instance (`false`). Therefore this functionality can be used by scripts of
    * different browser tabs to communicate with each other.
    * @param name Name of the observed variable
    */
  @JSName("GM_addValueChangeListener")
  def GMAddValueChangeListener(name: String, listener: ValueChangeListener): Double = js.native
  /** Deletes 'name' from storage */
  @JSName("GM_deleteValue")
  def GMDeleteValue(name: String): Unit = js.native
  /** Downloads a given URL to the local disk */
  @JSName("GM_download")
  def GMDownload(details: DownloadRequest): AbortHandle[Boolean] = js.native
  @JSName("GM_download")
  def GMDownload(url: String, name: String): AbortHandle[Boolean] = js.native
  // Resources
  /** Get the content of a predefined `@resource` tag at the script header */
  @JSName("GM_getResourceText")
  def GMGetResourceText(name: String): String = js.native
  /**
    * Get the base64 encoded URI of a predefined `@resource` tag at the script
    * header
    */
  @JSName("GM_getResourceURL")
  def GMGetResourceURL(name: String): String = js.native
  /** Gets a object that is persistent as long as this tab is open */
  @JSName("GM_getTab")
  def GMGetTab(callback: js.Function1[/* obj */ js.Any, Unit]): Unit = js.native
  /** Gets all tab objects as a hash to communicate with other script instances */
  @JSName("GM_getTabs")
  def GMGetTabs(callback: js.Function1[/* tabsMap */ NumberDictionary[js.Any], Unit]): Unit = js.native
  /** Gets the value of 'name' from storage */
  @JSName("GM_getValue")
  def GMGetValue[TValue](name: String): TValue = js.native
  @JSName("GM_getValue")
  def GMGetValue[TValue](name: String, defaultValue: TValue): TValue = js.native
  /** Lists all names of the storage */
  @JSName("GM_listValues")
  def GMListValues(): js.Array[String] = js.native
  // Utils
  /** Log a message to the console */
  @JSName("GM_log")
  def GMLog(message: js.Any*): Unit = js.native
  /**
    * Shows a HTML5 Desktop notification and/or highlight the current tab.
    * @param ondone If specified used instead of `details.ondone`
    */
  @JSName("GM_notification")
  def GMNotification(details: NotificationDetails): Unit = js.native
  @JSName("GM_notification")
  def GMNotification(details: NotificationDetails, ondone: NotificationOnDone): Unit = js.native
  /**
    * Shows a HTML5 Desktop notification and/or highlight the current tab.
    * @param text Text of the notification
    * @param title Notification title. If not specified the script name is used
    * @param onclick Called in case the user clicks the notification
    */
  @JSName("GM_notification")
  def GMNotification(text: String): Unit = js.native
  @JSName("GM_notification")
  def GMNotification(
    text: String,
    title: js.UndefOr[scala.Nothing],
    image: js.UndefOr[scala.Nothing],
    onclick: NotificationOnClick
  ): Unit = js.native
  @JSName("GM_notification")
  def GMNotification(text: String, title: js.UndefOr[scala.Nothing], image: String): Unit = js.native
  @JSName("GM_notification")
  def GMNotification(text: String, title: js.UndefOr[scala.Nothing], image: String, onclick: NotificationOnClick): Unit = js.native
  @JSName("GM_notification")
  def GMNotification(text: String, title: String): Unit = js.native
  @JSName("GM_notification")
  def GMNotification(text: String, title: String, image: js.UndefOr[scala.Nothing], onclick: NotificationOnClick): Unit = js.native
  @JSName("GM_notification")
  def GMNotification(text: String, title: String, image: String): Unit = js.native
  @JSName("GM_notification")
  def GMNotification(text: String, title: String, image: String, onclick: NotificationOnClick): Unit = js.native
  /**
    * Opens a new tab with this url.
    * The options object can have the following properties:
    * - `active` decides whether the new tab should be focused,
    * - `insert` that inserts the new tab after the current one and
    * - `setParent` makes the browser re-focus the current tab on close.
    *
    * Otherwise the new tab is just appended.
    * If `options` is boolean (loadInBackground) it has the opposite meaning of
    * active and was added to achieve Greasemonkey 3.x compatibility.
    *
    * If neither active nor loadInBackground is given, then the tab will not be
    * focused.
    * @returns Object with the function `close`, the listener `onclosed` and a flag
    * called `closed`.
    */
  @JSName("GM_openInTab")
  def GMOpenInTab(url: String): OpenTabObject = js.native
  @JSName("GM_openInTab")
  def GMOpenInTab(url: String, options: Boolean): OpenTabObject = js.native
  @JSName("GM_openInTab")
  def GMOpenInTab(url: String, options: OpenTabOptions): OpenTabObject = js.native
  // Menu commands
  /**
    * Register a menu to be displayed at the Tampermonkey menu at pages where this
    * script runs and returns a menu command ID.
    */
  @JSName("GM_registerMenuCommand")
  def GMRegisterMenuCommand(name: String, onClick: js.Function0[Unit]): Double = js.native
  @JSName("GM_registerMenuCommand")
  def GMRegisterMenuCommand(name: String, onClick: js.Function0[Unit], accessKey: String): Double = js.native
  /** Removes a change listener by its ID */
  @JSName("GM_removeValueChangeListener")
  def GMRemoveValueChangeListener(listenerId: Double): Unit = js.native
  // Tabs
  /** Saves the tab object to reopen it after a page unload */
  @JSName("GM_saveTab")
  def GMSaveTab(obj: js.Object): Unit = js.native
  /**
    * Copies data into the clipboard.
    * The parameter 'info' can be an object like
    * `{ type: 'text', mimetype: 'text/plain'}` or just a string expressing the
    * type ("text" or "html").
    */
  @JSName("GM_setClipboard")
  def GMSetClipboard(data: String): Unit = js.native
  @JSName("GM_setClipboard")
  def GMSetClipboard(data: String, info: String): Unit = js.native
  @JSName("GM_setClipboard")
  def GMSetClipboard(data: String, info: Mimetype): Unit = js.native
  // Storage
  /** Sets the value of `name` to the storage */
  @JSName("GM_setValue")
  def GMSetValue(name: String, value: js.Any): Unit = js.native
  /**
    *  Unregister a menu command that was previously registered by
    * `GM_registerMenuCommand` with the given menu command ID.
    */
  @JSName("GM_unregisterMenuCommand")
  def GMUnregisterMenuCommand(menuCommandId: Double): Unit = js.native
  // Requests
  /** Makes an xmlHttpRequest */
  @JSName("GM_xmlhttpRequest")
  def GMXmlhttpRequest[TContext](details: Request[TContext]): AbortHandle[Unit] = js.native
  @js.native
  object Tampermonkey extends js.Object {
    // Response
    @js.native
    object ReadyState extends js.Object {
      /* 4 */ val Done: typings.tampermonkey.Tampermonkey.ReadyState.Done with Double = js.native
      /* 2 */ val HeadersReceived: typings.tampermonkey.Tampermonkey.ReadyState.HeadersReceived with Double = js.native
      /* 3 */ val Loading: typings.tampermonkey.Tampermonkey.ReadyState.Loading with Double = js.native
      /* 1 */ val Opened: typings.tampermonkey.Tampermonkey.ReadyState.Opened with Double = js.native
      /* 0 */ val Unsent: typings.tampermonkey.Tampermonkey.ReadyState.Unsent with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.tampermonkey.Tampermonkey.ReadyState with Double] = js.native
    }
    
  }
  
}

