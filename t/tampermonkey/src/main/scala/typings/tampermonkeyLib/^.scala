package typings
package tampermonkeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * The unsafeWindow object provides full access to the pages javascript
    * functions and variables
    */
  var unsafeWindow: stdLib.Window = js.native
  // Styles
  /**
    * Adds the given style to the document and returns the injected style element.
    */
  def GM_addStyle(css: java.lang.String): stdLib.HTMLStyleElement = js.native
  /**
    * Adds a change listener to the storage and returns the listener ID.
    * The `remote` argument of the callback function shows whether this value was
    * modified from the instance of another tab (`true`) or within this script
    * instance (`false`). Therefore this functionality can be used by scripts of
    * different browser tabs to communicate with each other.
    * @param name Name of the observed variable
    */
  def GM_addValueChangeListener(name: java.lang.String, listener: tampermonkeyLib.TampermonkeyNs.ValueChangeListener): scala.Double = js.native
  /** Deletes 'name' from storage */
  def GM_deleteValue(name: java.lang.String): scala.Unit = js.native
  /** Downloads a given URL to the local disk */
  def GM_download(details: tampermonkeyLib.TampermonkeyNs.DownloadRequest): tampermonkeyLib.TampermonkeyNs.AbortHandle[scala.Boolean] = js.native
  def GM_download(url: java.lang.String, name: java.lang.String): tampermonkeyLib.TampermonkeyNs.AbortHandle[scala.Boolean] = js.native
  // Resources
  /** Get the content of a predefined `@resource` tag at the script header */
  def GM_getResourceText(name: java.lang.String): java.lang.String = js.native
  /**
    * Get the base64 encoded URI of a predefined `@resource` tag at the script
    * header
    */
  def GM_getResourceURL(name: java.lang.String): java.lang.String = js.native
  /** Gets a object that is persistent as long as this tab is open */
  def GM_getTab(callback: js.Function1[/* obj */ js.Any, scala.Unit]): scala.Unit = js.native
  /** Gets all tab objects as a hash to communicate with other script instances */
  def GM_getTabs(
    callback: js.Function1[/* tabsMap */ org.scalablytyped.runtime.NumberDictionary[js.Any], scala.Unit]
  ): scala.Unit = js.native
  /** Gets the value of 'name' from storage */
  def GM_getValue[TValue](name: java.lang.String): TValue = js.native
  def GM_getValue[TValue](name: java.lang.String, defaultValue: TValue): TValue = js.native
  /** Lists all names of the storage */
  def GM_listValues(): js.Array[java.lang.String] = js.native
  // Utils
  /** Log a message to the console */
  def GM_log(message: js.Any*): scala.Unit = js.native
  /**
    * Shows a HTML5 Desktop notification and/or highlight the current tab.
    * @param ondone If specified used instead of `details.ondone`
    */
  def GM_notification(details: tampermonkeyLib.TampermonkeyNs.NotificationDetails): scala.Unit = js.native
  def GM_notification(
    details: tampermonkeyLib.TampermonkeyNs.NotificationDetails,
    ondone: tampermonkeyLib.TampermonkeyNs.NotificationOnDone
  ): scala.Unit = js.native
  /**
    * Shows a HTML5 Desktop notification and/or highlight the current tab.
    * @param text Text of the notification
    * @param title Notification title. If not specified the script name is used
    * @param onclick Called in case the user clicks the notification
    */
  def GM_notification(text: java.lang.String): scala.Unit = js.native
  def GM_notification(text: java.lang.String, title: java.lang.String): scala.Unit = js.native
  def GM_notification(text: java.lang.String, title: java.lang.String, image: java.lang.String): scala.Unit = js.native
  def GM_notification(
    text: java.lang.String,
    title: java.lang.String,
    image: java.lang.String,
    onclick: tampermonkeyLib.TampermonkeyNs.NotificationOnClick
  ): scala.Unit = js.native
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
  def GM_openInTab(url: java.lang.String): tampermonkeyLib.TampermonkeyNs.OpenTabObject = js.native
  def GM_openInTab(url: java.lang.String, options: scala.Boolean): tampermonkeyLib.TampermonkeyNs.OpenTabObject = js.native
  def GM_openInTab(url: java.lang.String, options: tampermonkeyLib.TampermonkeyNs.OpenTabOptions): tampermonkeyLib.TampermonkeyNs.OpenTabObject = js.native
  // Menu commands
  /**
    * Register a menu to be displayed at the Tampermonkey menu at pages where this
    * script runs and returns a menu command ID.
    */
  def GM_registerMenuCommand(name: java.lang.String, onClick: js.Function0[scala.Unit]): scala.Double = js.native
  def GM_registerMenuCommand(name: java.lang.String, onClick: js.Function0[scala.Unit], accessKey: java.lang.String): scala.Double = js.native
  /** Removes a change listener by its ID */
  def GM_removeValueChangeListener(listenerId: scala.Double): scala.Unit = js.native
  // Tabs
  /** Saves the tab object to reopen it after a page unload */
  def GM_saveTab(obj: js.Object): scala.Unit = js.native
  /**
    * Copies data into the clipboard.
    * The parameter 'info' can be an object like
    * `{ type: 'text', mimetype: 'text/plain'}` or just a string expressing the
    * type ("text" or "html").
    */
  def GM_setClipboard(data: java.lang.String): scala.Unit = js.native
  def GM_setClipboard(data: java.lang.String, info: java.lang.String): scala.Unit = js.native
  def GM_setClipboard(data: java.lang.String, info: Anon_Mimetype): scala.Unit = js.native
  // Storage
  /** Sets the value of `name` to the storage */
  def GM_setValue(name: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
    *  Unregister a menu command that was previously registered by
    * `GM_registerMenuCommand` with the given menu command ID.
    */
  def GM_unregisterMenuCommand(menuCommandId: scala.Double): scala.Unit = js.native
  // Requests
  /** Makes an xmlHttpRequest */
  def GM_xmlhttpRequest[TContext](details: tampermonkeyLib.TampermonkeyNs.Request[TContext]): tampermonkeyLib.TampermonkeyNs.AbortHandle[scala.Unit] = js.native
}

