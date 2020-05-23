package typings.titanium.Titanium.UI

import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.singletap
import typings.titanium.titaniumStrings.swipe
import typings.titanium.titaniumStrings.touchcancel
import typings.titanium.titaniumStrings.touchend
import typings.titanium.titaniumStrings.touchmove
import typings.titanium.titaniumStrings.touchstart
import typings.titanium.titaniumStrings.twofingertap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An alert dialog is a modal view that includes an optional title, a message and buttons,
  * positioned in the middle of the display.
  */
@js.native
trait AlertDialog extends View {
  /**
    * View to load inside the message area, to create a custom layout.
    */
  var androidView: View = js.native
  /**
    * Setting this to true requires the end-user to click a dialog button to close the dialog.
    */
  var buttonClickRequired: Boolean = js.native
  /**
    * Name of each button to create.
    */
  var buttonNames: js.Array[String] = js.native
  /**
    * Index to define the cancel button.
    */
  var cancel: Double = js.native
  /**
    * When this is set to `true`, the dialog is canceled when touched outside the window's bounds.
    */
  var canceledOnTouchOutside: Boolean = js.native
  /**
    * Index to define the destructive button.
    */
  var destructive: Double = js.native
  /**
    * Hint text of the text field inside the dialog.
    */
  var hintText: String = js.native
  /**
    * Key identifying a string from the locale file to use for the
    * [hintText](Titanium.UI.AlertDialog.hintText) property.
    */
  var hinttextid: String = js.native
  /**
    * Keyboard appearance to be displayed when the text field inside the dialog is focused.
    */
  var keyboardAppearance: Double = js.native
  /**
    * Keyboard type to display when this text field inside the dialog is focused.
    */
  var keyboardType: Double = js.native
  /**
    * Hint text of the login text field inside the dialog.
    */
  var loginHintText: String = js.native
  /**
    * Keyboard type to display when this text field inside the dialog is focused.
    */
  var loginKeyboardType: Double = js.native
  /**
    * Placeholder of the login text field inside the dialog.
    * @deprecated Use [Titanium.UI.AlertDialog.loginHintText](Titanium.UI.AlertDialog.loginHintText) instead.
    */
  var loginPlaceholder: String = js.native
  /**
    * Specifies the text to display on the keyboard `Return` key when this field is focused.
    */
  var loginReturnKeyType: Double = js.native
  /**
    * Value of the login text field inside the dialog.
    */
  var loginValue: String = js.native
  /**
    * Key identifying a string from the locale file to use for the
    * [loginHintText](Titanium.UI.AlertDialog.loginHintText) property.
    */
  var loginhinttextid: String = js.native
  /**
    * Dialog message.
    */
  var message: String = js.native
  /**
    * Key identifying a string in the locale file to use for the message text.
    */
  var messageid: String = js.native
  /**
    * Text for the `OK` button.
    */
  var ok: String = js.native
  /**
    * Key identifying a string in the locale file to use for the `ok` text.
    */
  var okid: String = js.native
  /**
    * Hint text of the password text field inside the dialog.
    */
  var passwordHintText: String = js.native
  /**
    * Keyboard type to display when this text field inside the dialog is focused.
    */
  var passwordKeyboardType: Double = js.native
  /**
    * Placeholder of the password text field inside the dialog.
    * @deprecated Use [Titanium.UI.AlertDialog.passwordHintText](Titanium.UI.AlertDialog.passwordHintText) instead.
    */
  var passwordPlaceholder: String = js.native
  /**
    * Specifies the text to display on the keyboard `Return` key when this field is focused.
    */
  var passwordReturnKeyType: Double = js.native
  /**
    * Value of the password text field inside the dialog.
    */
  var passwordValue: String = js.native
  /**
    * Key identifying a string from the locale file to use for the
    * [passwordHintText](Titanium.UI.AlertDialog.passwordHintText) property.
    */
  var passwordhinttextid: String = js.native
  /**
    * Boolean value indicating if the alert dialog should only be cancelled by user gesture or by hide method.
    */
  var persistent: Boolean = js.native
  /**
    * Placeholder of the text field inside the dialog.
    * @deprecated Use [Titanium.UI.AlertDialog.hintText](Titanium.UI.AlertDialog.hintText) instead.
    */
  var placeholder: String = js.native
  /**
    * Index to define the preferred button.
    */
  var preferred: Double = js.native
  /**
    * Specifies the text to display on the keyboard `Return` key when this field is focused.
    */
  var returnKeyType: Double = js.native
  /**
    * The style for the alert dialog.
    */
  var style: Double = js.native
  /**
    * Title of the dialog.
    */
  var title: String = js.native
  /**
    * Key identifying a string in the locale file to use for the title text.
    */
  var titleid: String = js.native
  /**
    * Value of the text field inside the dialog.
    */
  var value: String = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: AlertDialogClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: AlertDialogDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: AlertDialogDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: AlertDialogFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: AlertDialogKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: AlertDialogLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: AlertDialogLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: AlertDialogPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: AlertDialogPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: AlertDialogSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: AlertDialogSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: AlertDialogTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: AlertDialogTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: AlertDialogTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: AlertDialogTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: AlertDialogTwofingertapEvent): Unit = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.buttonClickRequired> property.
    * @deprecated Access <Titanium.UI.AlertDialog.buttonClickRequired> instead.
    */
  def getButtonClickRequired(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.buttonNames> property.
    * @deprecated Access <Titanium.UI.AlertDialog.buttonNames> instead.
    */
  def getButtonNames(): js.Array[String] = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.cancel> property.
    * @deprecated Access <Titanium.UI.AlertDialog.cancel> instead.
    */
  def getCancel(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.canceledOnTouchOutside> property.
    * @deprecated Access <Titanium.UI.AlertDialog.canceledOnTouchOutside> instead.
    */
  def getCanceledOnTouchOutside(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.destructive> property.
    * @deprecated Access <Titanium.UI.AlertDialog.destructive> instead.
    */
  def getDestructive(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.hintText> property.
    * @deprecated Access <Titanium.UI.AlertDialog.hintText> instead.
    */
  def getHintText(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.hinttextid> property.
    * @deprecated Access <Titanium.UI.AlertDialog.hinttextid> instead.
    */
  def getHinttextid(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.keyboardAppearance> property.
    * @deprecated Access <Titanium.UI.AlertDialog.keyboardAppearance> instead.
    */
  def getKeyboardAppearance(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.keyboardType> property.
    * @deprecated Access <Titanium.UI.AlertDialog.keyboardType> instead.
    */
  def getKeyboardType(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.loginHintText> property.
    * @deprecated Access <Titanium.UI.AlertDialog.loginHintText> instead.
    */
  def getLoginHintText(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.loginKeyboardType> property.
    * @deprecated Access <Titanium.UI.AlertDialog.loginKeyboardType> instead.
    */
  def getLoginKeyboardType(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.loginPlaceholder> property.
    * @deprecated Use [Titanium.UI.AlertDialog.loginHintText](Titanium.UI.AlertDialog.loginHintText) instead.
    */
  def getLoginPlaceholder(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.loginReturnKeyType> property.
    * @deprecated Access <Titanium.UI.AlertDialog.loginReturnKeyType> instead.
    */
  def getLoginReturnKeyType(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.loginValue> property.
    * @deprecated Access <Titanium.UI.AlertDialog.loginValue> instead.
    */
  def getLoginValue(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.loginhinttextid> property.
    * @deprecated Access <Titanium.UI.AlertDialog.loginhinttextid> instead.
    */
  def getLoginhinttextid(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.message> property.
    * @deprecated Access <Titanium.UI.AlertDialog.message> instead.
    */
  def getMessage(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.messageid> property.
    * @deprecated Access <Titanium.UI.AlertDialog.messageid> instead.
    */
  def getMessageid(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.ok> property.
    * @deprecated Access <Titanium.UI.AlertDialog.ok> instead.
    */
  def getOk(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.okid> property.
    * @deprecated Access <Titanium.UI.AlertDialog.okid> instead.
    */
  def getOkid(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.passwordHintText> property.
    * @deprecated Access <Titanium.UI.AlertDialog.passwordHintText> instead.
    */
  def getPasswordHintText(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.passwordKeyboardType> property.
    * @deprecated Access <Titanium.UI.AlertDialog.passwordKeyboardType> instead.
    */
  def getPasswordKeyboardType(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.passwordPlaceholder> property.
    * @deprecated Use [Titanium.UI.AlertDialog.passwordHintText](Titanium.UI.AlertDialog.passwordHintText) instead.
    */
  def getPasswordPlaceholder(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.passwordReturnKeyType> property.
    * @deprecated Access <Titanium.UI.AlertDialog.passwordReturnKeyType> instead.
    */
  def getPasswordReturnKeyType(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.passwordValue> property.
    * @deprecated Access <Titanium.UI.AlertDialog.passwordValue> instead.
    */
  def getPasswordValue(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.passwordhinttextid> property.
    * @deprecated Access <Titanium.UI.AlertDialog.passwordhinttextid> instead.
    */
  def getPasswordhinttextid(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.persistent> property.
    * @deprecated Access <Titanium.UI.AlertDialog.persistent> instead.
    */
  def getPersistent(): Boolean = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.placeholder> property.
    * @deprecated Use [Titanium.UI.AlertDialog.hintText](Titanium.UI.AlertDialog.hintText) instead.
    */
  def getPlaceholder(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.preferred> property.
    * @deprecated Access <Titanium.UI.AlertDialog.preferred> instead.
    */
  def getPreferred(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.returnKeyType> property.
    * @deprecated Access <Titanium.UI.AlertDialog.returnKeyType> instead.
    */
  def getReturnKeyType(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.style> property.
    * @deprecated Access <Titanium.UI.AlertDialog.style> instead.
    */
  def getStyle(): Double = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.title> property.
    * @deprecated Access <Titanium.UI.AlertDialog.title> instead.
    */
  def getTitle(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.titleid> property.
    * @deprecated Access <Titanium.UI.AlertDialog.titleid> instead.
    */
  def getTitleid(): String = js.native
  /**
    * Gets the value of the <Titanium.UI.AlertDialog.value> property.
    * @deprecated Access <Titanium.UI.AlertDialog.value> instead.
    */
  def getValue(): String = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.buttonClickRequired> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.buttonClickRequired> instead.
    */
  def setButtonClickRequired(buttonClickRequired: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.buttonNames> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.buttonNames> instead.
    */
  def setButtonNames(buttonNames: js.Array[String]): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.cancel> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.cancel> instead.
    */
  def setCancel(cancel: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.canceledOnTouchOutside> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.canceledOnTouchOutside> instead.
    */
  def setCanceledOnTouchOutside(canceledOnTouchOutside: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.destructive> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.destructive> instead.
    */
  def setDestructive(destructive: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.hintText> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.hintText> instead.
    */
  def setHintText(hintText: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.hinttextid> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.hinttextid> instead.
    */
  def setHinttextid(hinttextid: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.keyboardAppearance> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.keyboardAppearance> instead.
    */
  def setKeyboardAppearance(keyboardAppearance: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.keyboardType> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.keyboardType> instead.
    */
  def setKeyboardType(keyboardType: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.loginHintText> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.loginHintText> instead.
    */
  def setLoginHintText(loginHintText: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.loginKeyboardType> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.loginKeyboardType> instead.
    */
  def setLoginKeyboardType(loginKeyboardType: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.loginPlaceholder> property.
    * @deprecated Use [Titanium.UI.AlertDialog.loginHintText](Titanium.UI.AlertDialog.loginHintText) instead.
    */
  def setLoginPlaceholder(loginPlaceholder: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.loginReturnKeyType> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.loginReturnKeyType> instead.
    */
  def setLoginReturnKeyType(loginReturnKeyType: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.loginValue> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.loginValue> instead.
    */
  def setLoginValue(loginValue: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.loginhinttextid> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.loginhinttextid> instead.
    */
  def setLoginhinttextid(loginhinttextid: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.message> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.message> instead.
    */
  def setMessage(message: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.messageid> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.messageid> instead.
    */
  def setMessageid(messageid: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.ok> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.ok> instead.
    */
  def setOk(ok: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.okid> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.okid> instead.
    */
  def setOkid(okid: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.passwordHintText> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.passwordHintText> instead.
    */
  def setPasswordHintText(passwordHintText: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.passwordKeyboardType> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.passwordKeyboardType> instead.
    */
  def setPasswordKeyboardType(passwordKeyboardType: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.passwordPlaceholder> property.
    * @deprecated Use [Titanium.UI.AlertDialog.passwordHintText](Titanium.UI.AlertDialog.passwordHintText) instead.
    */
  def setPasswordPlaceholder(passwordPlaceholder: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.passwordReturnKeyType> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.passwordReturnKeyType> instead.
    */
  def setPasswordReturnKeyType(passwordReturnKeyType: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.passwordValue> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.passwordValue> instead.
    */
  def setPasswordValue(passwordValue: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.passwordhinttextid> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.passwordhinttextid> instead.
    */
  def setPasswordhinttextid(passwordhinttextid: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.persistent> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.persistent> instead.
    */
  def setPersistent(persistent: Boolean): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.placeholder> property.
    * @deprecated Use [Titanium.UI.AlertDialog.hintText](Titanium.UI.AlertDialog.hintText) instead.
    */
  def setPlaceholder(placeholder: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.preferred> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.preferred> instead.
    */
  def setPreferred(preferred: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.returnKeyType> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.returnKeyType> instead.
    */
  def setReturnKeyType(returnKeyType: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.style> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.style> instead.
    */
  def setStyle(style: Double): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.title> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.title> instead.
    */
  def setTitle(title: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.titleid> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.titleid> instead.
    */
  def setTitleid(titleid: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.AlertDialog.value> property.
    * @deprecated Set the value using <Titanium.UI.AlertDialog.value> instead.
    */
  def setValue(value: String): Unit = js.native
}

