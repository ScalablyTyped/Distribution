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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  // Styles
  /**
    * Adds the given style to the document and returns the injected style element.
    */
  inline def GMAddStyle(css: String): HTMLStyleElement = js.Dynamic.global.applyDynamic("GM_addStyle")(css.asInstanceOf[js.Any]).asInstanceOf[HTMLStyleElement]
  
  /**
    * Adds a change listener to the storage and returns the listener ID.
    * The `remote` argument of the callback function shows whether this value was
    * modified from the instance of another tab (`true`) or within this script
    * instance (`false`). Therefore this functionality can be used by scripts of
    * different browser tabs to communicate with each other.
    * @param name Name of the observed variable
    */
  inline def GMAddValueChangeListener(name: String, listener: ValueChangeListener): Double = (js.Dynamic.global.applyDynamic("GM_addValueChangeListener")(name.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** Deletes 'name' from storage */
  inline def GMDeleteValue(name: String): Unit = js.Dynamic.global.applyDynamic("GM_deleteValue")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Downloads a given URL to the local disk */
  inline def GMDownload(details: DownloadRequest): AbortHandle[Boolean] = js.Dynamic.global.applyDynamic("GM_download")(details.asInstanceOf[js.Any]).asInstanceOf[AbortHandle[Boolean]]
  inline def GMDownload(url: String, name: String): AbortHandle[Boolean] = (js.Dynamic.global.applyDynamic("GM_download")(url.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[AbortHandle[Boolean]]
  
  // Resources
  /** Get the content of a predefined `@resource` tag at the script header */
  inline def GMGetResourceText(name: String): String = js.Dynamic.global.applyDynamic("GM_getResourceText")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Get the base64 encoded URI of a predefined `@resource` tag at the script
    * header
    */
  inline def GMGetResourceURL(name: String): String = js.Dynamic.global.applyDynamic("GM_getResourceURL")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /** Gets a object that is persistent as long as this tab is open */
  inline def GMGetTab(callback: js.Function1[/* obj */ js.Any, Unit]): Unit = js.Dynamic.global.applyDynamic("GM_getTab")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Gets all tab objects as a hash to communicate with other script instances */
  inline def GMGetTabs(callback: js.Function1[/* tabsMap */ NumberDictionary[js.Any], Unit]): Unit = js.Dynamic.global.applyDynamic("GM_getTabs")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** Gets the value of 'name' from storage */
  inline def GMGetValue[TValue](name: String): TValue = js.Dynamic.global.applyDynamic("GM_getValue")(name.asInstanceOf[js.Any]).asInstanceOf[TValue]
  inline def GMGetValue[TValue](name: String, defaultValue: TValue): TValue = (js.Dynamic.global.applyDynamic("GM_getValue")(name.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[TValue]
  
  /** Lists all names of the storage */
  inline def GMListValues(): js.Array[String] = js.Dynamic.global.applyDynamic("GM_listValues")().asInstanceOf[js.Array[String]]
  
  // Utils
  /** Log a message to the console */
  inline def GMLog(message: js.Any*): Unit = js.Dynamic.global.applyDynamic("GM_log")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Shows a HTML5 Desktop notification and/or highlight the current tab.
    * @param ondone If specified used instead of `details.ondone`
    */
  inline def GMNotification(details: NotificationDetails): Unit = js.Dynamic.global.applyDynamic("GM_notification")(details.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def GMNotification(details: NotificationDetails, ondone: NotificationOnDone): Unit = (js.Dynamic.global.applyDynamic("GM_notification")(details.asInstanceOf[js.Any], ondone.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Shows a HTML5 Desktop notification and/or highlight the current tab.
    * @param text Text of the notification
    * @param title Notification title. If not specified the script name is used
    * @param onclick Called in case the user clicks the notification
    */
  inline def GMNotification(text: String): Unit = js.Dynamic.global.applyDynamic("GM_notification")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def GMNotification(text: String, title: String): Unit = (js.Dynamic.global.applyDynamic("GM_notification")(text.asInstanceOf[js.Any], title.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def GMNotification(text: String, title: String, image: String): Unit = (js.Dynamic.global.applyDynamic("GM_notification")(text.asInstanceOf[js.Any], title.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def GMNotification(text: String, title: String, image: String, onclick: NotificationOnClick): Unit = (js.Dynamic.global.applyDynamic("GM_notification")(text.asInstanceOf[js.Any], title.asInstanceOf[js.Any], image.asInstanceOf[js.Any], onclick.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def GMNotification(text: String, title: String, image: Unit, onclick: NotificationOnClick): Unit = (js.Dynamic.global.applyDynamic("GM_notification")(text.asInstanceOf[js.Any], title.asInstanceOf[js.Any], image.asInstanceOf[js.Any], onclick.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def GMNotification(text: String, title: Unit, image: String): Unit = (js.Dynamic.global.applyDynamic("GM_notification")(text.asInstanceOf[js.Any], title.asInstanceOf[js.Any], image.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def GMNotification(text: String, title: Unit, image: String, onclick: NotificationOnClick): Unit = (js.Dynamic.global.applyDynamic("GM_notification")(text.asInstanceOf[js.Any], title.asInstanceOf[js.Any], image.asInstanceOf[js.Any], onclick.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def GMNotification(text: String, title: Unit, image: Unit, onclick: NotificationOnClick): Unit = (js.Dynamic.global.applyDynamic("GM_notification")(text.asInstanceOf[js.Any], title.asInstanceOf[js.Any], image.asInstanceOf[js.Any], onclick.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def GMOpenInTab(url: String): OpenTabObject = js.Dynamic.global.applyDynamic("GM_openInTab")(url.asInstanceOf[js.Any]).asInstanceOf[OpenTabObject]
  inline def GMOpenInTab(url: String, options: Boolean): OpenTabObject = (js.Dynamic.global.applyDynamic("GM_openInTab")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OpenTabObject]
  inline def GMOpenInTab(url: String, options: OpenTabOptions): OpenTabObject = (js.Dynamic.global.applyDynamic("GM_openInTab")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OpenTabObject]
  
  // Menu commands
  /**
    * Register a menu to be displayed at the Tampermonkey menu at pages where this
    * script runs and returns a menu command ID.
    */
  inline def GMRegisterMenuCommand(name: String, onClick: js.Function0[Unit]): Double = (js.Dynamic.global.applyDynamic("GM_registerMenuCommand")(name.asInstanceOf[js.Any], onClick.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def GMRegisterMenuCommand(name: String, onClick: js.Function0[Unit], accessKey: String): Double = (js.Dynamic.global.applyDynamic("GM_registerMenuCommand")(name.asInstanceOf[js.Any], onClick.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /** Removes a change listener by its ID */
  inline def GMRemoveValueChangeListener(listenerId: Double): Unit = js.Dynamic.global.applyDynamic("GM_removeValueChangeListener")(listenerId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // Tabs
  /** Saves the tab object to reopen it after a page unload */
  inline def GMSaveTab(obj: js.Object): Unit = js.Dynamic.global.applyDynamic("GM_saveTab")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Copies data into the clipboard.
    * The parameter 'info' can be an object like
    * `{ type: 'text', mimetype: 'text/plain'}` or just a string expressing the
    * type ("text" or "html").
    */
  inline def GMSetClipboard(data: String): Unit = js.Dynamic.global.applyDynamic("GM_setClipboard")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def GMSetClipboard(data: String, info: String): Unit = (js.Dynamic.global.applyDynamic("GM_setClipboard")(data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def GMSetClipboard(data: String, info: Mimetype): Unit = (js.Dynamic.global.applyDynamic("GM_setClipboard")(data.asInstanceOf[js.Any], info.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // Storage
  /** Sets the value of `name` to the storage */
  inline def GMSetValue(name: String, value: js.Any): Unit = (js.Dynamic.global.applyDynamic("GM_setValue")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    *  Unregister a menu command that was previously registered by
    * `GM_registerMenuCommand` with the given menu command ID.
    */
  inline def GMUnregisterMenuCommand(menuCommandId: Double): Unit = js.Dynamic.global.applyDynamic("GM_unregisterMenuCommand")(menuCommandId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  // Requests
  /** Makes an xmlHttpRequest */
  inline def GMXmlhttpRequest[TContext](details: Request[TContext]): AbortHandle[Unit] = js.Dynamic.global.applyDynamic("GM_xmlhttpRequest")(details.asInstanceOf[js.Any]).asInstanceOf[AbortHandle[Unit]]
  
  object Tampermonkey {
    
    // Response
    @JSGlobal("Tampermonkey.ReadyState")
    @js.native
    object ReadyState extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.tampermonkey.Tampermonkey.ReadyState & Double] = js.native
      
      /* 4 */ val Done: typings.tampermonkey.Tampermonkey.ReadyState.Done & Double = js.native
      
      /* 2 */ val HeadersReceived: typings.tampermonkey.Tampermonkey.ReadyState.HeadersReceived & Double = js.native
      
      /* 3 */ val Loading: typings.tampermonkey.Tampermonkey.ReadyState.Loading & Double = js.native
      
      /* 1 */ val Opened: typings.tampermonkey.Tampermonkey.ReadyState.Opened & Double = js.native
      
      /* 0 */ val Unsent: typings.tampermonkey.Tampermonkey.ReadyState.Unsent & Double = js.native
    }
  }
  
  /**
    * The unsafeWindow object provides full access to the pages javascript
    * functions and variables
    */
  @JSGlobal("unsafeWindow")
  @js.native
  def unsafeWindow: Window = js.native
  inline def unsafeWindow_=(x: Window): Unit = js.Dynamic.global.updateDynamic("unsafeWindow")(x.asInstanceOf[js.Any])
}
