package typings.telegramWebApp

import typings.telegramWebApp.anon.IsStateStable
import typings.telegramWebApp.telegramWebAppStrings.backButtonClicked
import typings.telegramWebApp.telegramWebAppStrings.bg_color
import typings.telegramWebApp.telegramWebAppStrings.dark
import typings.telegramWebApp.telegramWebAppStrings.light
import typings.telegramWebApp.telegramWebAppStrings.mainButtonClicked
import typings.telegramWebApp.telegramWebAppStrings.popupClosed
import typings.telegramWebApp.telegramWebAppStrings.secondary_bg_color
import typings.telegramWebApp.telegramWebAppStrings.settingsButtonClicked
import typings.telegramWebApp.telegramWebAppStrings.themeChanged
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
    eventType: themeChanged | mainButtonClicked | backButtonClicked | settingsButtonClicked | popupClosed,
    eventHandler: js.Function0[Unit]
  ): Unit = js.native
  @JSName("offEvent")
  def offEvent_viewportChanged(eventType: viewportChanged, eventHandler: js.Function1[/* eventData */ IsStateStable, Unit]): Unit = js.native
  
  /**
    * A method that sets the app event handler. Check the list of available
    * events.
    */
  def onEvent(
    eventType: themeChanged | mainButtonClicked | backButtonClicked | settingsButtonClicked | popupClosed,
    eventHandler: js.Function0[Unit]
  ): Unit = js.native
  @JSName("onEvent")
  def onEvent_viewportChanged(eventType: viewportChanged, eventHandler: js.Function1[/* eventData */ IsStateStable, Unit]): Unit = js.native
  
  /**
    * A method that opens an invoice using the link url. The Web App will
    *  receive the event invoiceClosed when the invoice is closed. If an
    *  optional callback parameter was passed, the callback function will be
    *  called and the invoice status will be passed as the first argument.
    */
  def openInvoice(url: String, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * A method that opens a link in an external browser. The Web App will not
    * be closed. Note that this method can be called only in response to the
    * user interaction with the Web App interface (e.g. click inside the Web
    * App or on the main button)
    */
  def openLink(url: String): Unit = js.native
  
  /**
    * A method that opens a telegram link inside Telegram app. The Web App will
    * be closed.
    */
  def openTelegramLink(url: String): Unit = js.native
  
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
