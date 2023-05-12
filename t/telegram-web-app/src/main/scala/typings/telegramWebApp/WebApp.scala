package typings.telegramWebApp

import typings.telegramWebApp.anon.Buttonid
import typings.telegramWebApp.anon.Data
import typings.telegramWebApp.anon.IsStateStable
import typings.telegramWebApp.anon.Status
import typings.telegramWebApp.anon.Tryinstantview
import typings.telegramWebApp.anon.`0`
import typings.telegramWebApp.telegramWebAppStrings.backButtonClicked
import typings.telegramWebApp.telegramWebAppStrings.bg_color
import typings.telegramWebApp.telegramWebAppStrings.bots
import typings.telegramWebApp.telegramWebAppStrings.cancelled
import typings.telegramWebApp.telegramWebAppStrings.channels
import typings.telegramWebApp.telegramWebAppStrings.clipboardTextReceived
import typings.telegramWebApp.telegramWebAppStrings.dark
import typings.telegramWebApp.telegramWebAppStrings.failed
import typings.telegramWebApp.telegramWebAppStrings.groups
import typings.telegramWebApp.telegramWebAppStrings.invoiceClosed
import typings.telegramWebApp.telegramWebAppStrings.light
import typings.telegramWebApp.telegramWebAppStrings.mainButtonClicked
import typings.telegramWebApp.telegramWebAppStrings.paid
import typings.telegramWebApp.telegramWebAppStrings.pending
import typings.telegramWebApp.telegramWebAppStrings.popupClosed
import typings.telegramWebApp.telegramWebAppStrings.qrTextReceived
import typings.telegramWebApp.telegramWebAppStrings.secondary_bg_color
import typings.telegramWebApp.telegramWebAppStrings.settingsButtonClicked
import typings.telegramWebApp.telegramWebAppStrings.themeChanged
import typings.telegramWebApp.telegramWebAppStrings.users
import typings.telegramWebApp.telegramWebAppStrings.viewportChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebApp extends StObject {
  
  /**
    * An object for controlling the back button which can be displayed in the
    * header of the Web App in the Telegram interface.
    */
  var BackButton: typings.telegramWebApp.BackButton = js.native
  
  /**
    * An object for controlling haptic feedback.
    */
  var HapticFeedback: typings.telegramWebApp.HapticFeedback = js.native
  
  /**
    * An object for controlling the main button, which is displayed at the
    * bottom of the Web App in the Telegram interface.
    */
  var MainButton: typings.telegramWebApp.MainButton = js.native
  
  /**
    * Current background color in the #RRGGBB format.
    */
  var backgroundColor: String = js.native
  
  /** A method that closes the Web App. */
  def close(): Unit = js.native
  
  /**
    * A method that closes the native popup for scanning a QR code opened with the
    * showScanQrPopup method. Run it if you received valid data in the event qrTextReceived.
    */
  def closeScanQrPopup(): Unit = js.native
  
  /**
    * The color scheme currently used in the Telegram app. Either “light” or
    * “dark”. Also available as the CSS variable var(--tg-color-scheme).
    */
  var colorScheme: light | dark = js.native
  
  /**
    * A method that disables the confirmation dialog while the user is trying to close the Web App.
    */
  def disableClosingConfirmation(): Unit = js.native
  
  /**
    * A method that enables a confirmation dialog while the user is trying to close the Web App.
    */
  def enableClosingConfirmation(): Unit = js.native
  
  /**
    * A method that expands the Web App to the maximum available height. To find
    * out if the Web App is expanded to the maximum height, refer to the value of
    * the Telegram.WebApp.isExpanded parameter
    */
  def expand(): Unit = js.native
  
  /**
    * Current header color in the #RRGGBB format.
    */
  var headerColor: String = js.native
  
  /**
    * A string with raw data transferred to the Web App, convenient for
    * validating data. WARNING: Validate data from this field before using it on
    * the bot's server.
    */
  var initData: String = js.native
  
  /**
    * An object with input data transferred to the Web App. WARNING: Data from
    * this field should not be trusted. You should only use data from initData on
    * the bot's server and only after it has been validated.
    */
  var initDataUnsafe: WebAppInitData = js.native
  
  /**
    * True, if the confirmation dialog is enabled while the user is trying to close the Web App.
    * False, if the confirmation dialog is disabled.
    */
  var isClosingConfirmationEnabled: Boolean = js.native
  
  /**
    *  True if the Web App is expanded to the maximum available height. False, if
    *  the Web App occupies part of the screen and can be expanded to the full
    *  height using the expand() method.
    */
  var isExpanded: Boolean = js.native
  
  /**
    * Returns true if the user's app supports a version of the Bot API that is
    * equal to or higher than the version passed as the parameter.
    */
  def isVersionAtLeast(version: String): Boolean = js.native
  
  /** A method that deletes a previously set event handler. */
  def offEvent(
    eventType: themeChanged | mainButtonClicked | backButtonClicked | settingsButtonClicked,
    eventHandler: js.Function0[Unit]
  ): Unit = js.native
  @JSName("offEvent")
  def offEvent_clipboardTextReceived(eventType: clipboardTextReceived, eventHandler: js.Function1[/* eventData */ `0`, Unit]): Unit = js.native
  @JSName("offEvent")
  def offEvent_invoiceClosed(eventType: invoiceClosed, eventHandler: js.Function1[/* eventData */ Status, Unit]): Unit = js.native
  @JSName("offEvent")
  def offEvent_popupClosed(eventType: popupClosed, eventHandler: js.Function1[/* eventData */ Buttonid, Unit]): Unit = js.native
  @JSName("offEvent")
  def offEvent_qrTextReceived(eventType: qrTextReceived, eventHandler: js.Function1[/* eventData */ Data, Unit]): Unit = js.native
  @JSName("offEvent")
  def offEvent_viewportChanged(eventType: viewportChanged, eventHandler: js.Function1[/* eventData */ IsStateStable, Unit]): Unit = js.native
  
  /**
    * A method that sets the app event handler. Check the list of available
    * events.
    */
  def onEvent(
    eventType: themeChanged | mainButtonClicked | backButtonClicked | settingsButtonClicked,
    eventHandler: js.Function0[Unit]
  ): Unit = js.native
  @JSName("onEvent")
  def onEvent_clipboardTextReceived(eventType: clipboardTextReceived, eventHandler: js.Function1[/* eventData */ `0`, Unit]): Unit = js.native
  @JSName("onEvent")
  def onEvent_invoiceClosed(eventType: invoiceClosed, eventHandler: js.Function1[/* eventData */ Status, Unit]): Unit = js.native
  @JSName("onEvent")
  def onEvent_popupClosed(eventType: popupClosed, eventHandler: js.Function1[/* eventData */ Buttonid, Unit]): Unit = js.native
  @JSName("onEvent")
  def onEvent_qrTextReceived(eventType: qrTextReceived, eventHandler: js.Function1[/* eventData */ Data, Unit]): Unit = js.native
  @JSName("onEvent")
  def onEvent_viewportChanged(eventType: viewportChanged, eventHandler: js.Function1[/* eventData */ IsStateStable, Unit]): Unit = js.native
  
  /**
    * A method that opens an invoice using the link url. The Web App will
    *  receive the event invoiceClosed when the invoice is closed. If an
    *  optional callback parameter was passed, the callback function will be
    *  called and the invoice status will be passed as the first argument.
    */
  def openInvoice(
    url: String,
    callback: js.Function2[/* url */ String, /* status */ paid | cancelled | failed | pending, Unit]
  ): Unit = js.native
  
  /**
    * A method that opens a link in an external browser.
    * The Web App will not be closed.
    * If the optional options parameter is passed with the field
    * @param try_instant_view the link will be opened in Instant View mode if possible.
    *
    * Note that this method can be called only in response to user interaction with
    * the Web App interface (e.g. a click inside the Web App or on the main button)
    */
  def openLink(url: String): Unit = js.native
  def openLink(url: String, options: Tryinstantview): Unit = js.native
  
  /**
    * A method that opens a telegram link inside Telegram app. The Web App will
    * be closed.
    */
  def openTelegramLink(url: String): Unit = js.native
  
  /**
    * The name of the platform of the user's Telegram app.
    */
  var platform: String = js.native
  
  /**
    * A method that requests text from the clipboard. The Web App will receive the event clipboardTextReceived.
    * If an optional callback parameter was passed, the callback function will be
    * called and the text from the clipboard will be passed as the first argument.
    *
    * Note: this method can be called only for Web Apps launched from the attachment menu and only
    * in response to a user interaction with the Web App interface (e.g. a click inside the Web App or on the main button).
    */
  def readTextFromClipboard(): Unit = js.native
  def readTextFromClipboard(callback: js.Function1[/* data */ String | Null, Unit]): Unit = js.native
  
  /**
    * A method that informs the Telegram app that the Web App is ready to be
    * displayed. It is recommended to call this method as early as possible, as
    * soon as all essential interface elements are loaded. Once this method is
    * called, the loading placeholder is hidden and the Web App is shown. If the
    * method is not called, the placeholder will be hidden only when the page is
    * fully loaded.
    */
  def ready(): Unit = js.native
  
  /**
    * A method used to send data to the bot. When this method is called, a
    * service message is sent to the bot containing the data data of the length
    * up to 4096 bytes, and the Web App is closed. See the field web_app_data in
    * the class Message.
    *
    * This method is only available for Web Apps launched via a Keyboard button.
    */
  def sendData(data: String): Unit = js.native
  
  def setBackgroundColor(color: bg_color | secondary_bg_color): Unit = js.native
  /**
    * A method that sets the app background color in the #RRGGBB format or you
    * can use keywords bg_color, secondary_bg_color instead.
    */
  def setBackgroundColor(color: String): Unit = js.native
  
  /**
    * A method that sets the app header color. You can only pass
    * Telegram.WebApp.themeParams.bg_color or
    * Telegram.WebApp.themeParams.secondary_bg_colo as a color or you can use
    * keywords bg_color, secondary_bg_color instead.
    */
  def setHeaderColor(color: bg_color | secondary_bg_color): Unit = js.native
  
  /**
    * A method that shows message in a simple alert with a 'Close' button. If an optional callback
    * parameter was passed, the callback function will be called when the popup is closed.
    */
  def showAlert(message: String): Unit = js.native
  def showAlert(message: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * A method that shows message in a simple confirmation window with 'OK' and 'Cancel' buttons.
    * If an optional callback parameter was passed, the callback function will be called when the
    * popup is closed and the first argument will be a boolean indicating whether the user
    * pressed the 'OK' button.
    */
  def showConfirm(message: String): Unit = js.native
  def showConfirm(message: String, callback: js.Function1[/* ok */ js.UndefOr[Boolean], Unit]): Unit = js.native
  
  /**
    * A method that shows a native popup described by the params argument of the type PopupParams.
    * The Web App will receive the event popupClosed when the popup is closed. If an optional
    * callback parameter was passed, the callback function will be called and the field id of the
    * pressed button will be passed as the first argument.
    */
  def showPopup(params: PopupParams): Unit = js.native
  def showPopup(params: PopupParams, callback: js.Function1[/* button_id */ String, Unit]): Unit = js.native
  
  /**
    * A method that shows a native popup for scanning a QR code described by the params argument of the type ScanQrPopupParams.
    * The Web App will receive the event qrTextReceived every time the scanner catches a code with text data.
    * If an optional callback parameter was passed, the callback function will be called and the text from the QR
    * code will be passed as the first argument. Returning true inside this callback function causes the popup to be closed.
    */
  def showScanQrPopup(params: ScanQrPopupParams): Unit = js.native
  def showScanQrPopup(params: ScanQrPopupParams, callback: js.Function1[/* data */ String, Unit]): Unit = js.native
  
  /**
    * A method that inserts the bot's username and the specified inline query in the current chat's input field.
    * Query may be empty, in which case only the bot's username will be inserted.
    * If an optional choose_chat_types parameter was passed, the client prompts the user to choose a specific chat,
    * then opens that chat and inserts the bot's username and the specified inline query in the input field.
    * You can specify which types of chats the user will be able to choose from.
    * It can be one or more of the following types: users, bots, groups, channels.
    */
  def switchInlineQuery(query: String): Unit = js.native
  def switchInlineQuery(query: String, choose_chat_types: js.Array[users | bots | groups | channels]): Unit = js.native
  
  /**
    * An object containing the current theme settings used in the Telegram app.
    */
  var themeParams: ThemeParams = js.native
  
  /**
    * The version of the Bot API available in the user's Telegram app.
    */
  var version: String = js.native
  
  /**
    * The current height of the visible area of the Web App. Also available in
    * CSS as the variable var(--tg-viewport-height).
    *
    * The application can display just the top part of the Web App, with its
    * lower part remaining outside the screen area. From this position, the user
    * can “pull” the Web App to its maximum height, while the bot can do the same
    * by calling the expand() method. As the position of the Web App changes, the
    * current height value of the visible area will be updated in real time.
    *
    * Please note that the refresh rate of this value is not sufficient to
    * smoothly follow the lower border of the window. It should not be used to
    * pin interface elements to the bottom of the visible area. It's more
    * appropriate to use the value of the viewportStableHeight field for this
    * purpose.
    */
  var viewportHeight: Double = js.native
  
  /**
    * The height of the visible area of the Web App in its last stable state.
    * Also available in CSS as a variable var(--tg-viewport-stable-height).
    *
    * The application can display just the top part of the Web App, with its
    * lower part remaining outside the screen area. From this position, the user
    * can “pull” the Web App to its maximum height, while the bot can do the same
    * by calling the expand() method. Unlike the value of viewportHeight, the
    * value of viewportStableHeight does not change as the position of the Web
    * App changes with user gestures or during animations. The value of
    * viewportStableHeight will be updated after all gestures and animations are
    * completed and the Web App reaches its final size.
    *
    * Note the event viewportChanged with the passed parameter
    * isStateStable=true, which will allow you to track when the stable state of
    * the height of the visible area changes.
    */
  var viewportStableHeight: Double = js.native
}
