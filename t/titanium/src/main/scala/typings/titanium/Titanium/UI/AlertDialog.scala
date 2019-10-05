package typings.titanium.Titanium.UI

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
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.buttonClickRequired> property.
  			 */
  def getButtonClickRequired(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.buttonNames> property.
  			 */
  def getButtonNames(): js.Array[String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.cancel> property.
  			 */
  def getCancel(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.canceledOnTouchOutside> property.
  			 */
  def getCanceledOnTouchOutside(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.destructive> property.
  			 */
  def getDestructive(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.hintText> property.
  			 */
  def getHintText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.hinttextid> property.
  			 */
  def getHinttextid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.keyboardAppearance> property.
  			 */
  def getKeyboardAppearance(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.keyboardType> property.
  			 */
  def getKeyboardType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.loginHintText> property.
  			 */
  def getLoginHintText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.loginKeyboardType> property.
  			 */
  def getLoginKeyboardType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.loginPlaceholder> property.
  			 */
  def getLoginPlaceholder(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.loginReturnKeyType> property.
  			 */
  def getLoginReturnKeyType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.loginValue> property.
  			 */
  def getLoginValue(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.loginhinttextid> property.
  			 */
  def getLoginhinttextid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.message> property.
  			 */
  def getMessage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.messageid> property.
  			 */
  def getMessageid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.ok> property.
  			 */
  def getOk(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.okid> property.
  			 */
  def getOkid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.passwordHintText> property.
  			 */
  def getPasswordHintText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.passwordKeyboardType> property.
  			 */
  def getPasswordKeyboardType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.passwordPlaceholder> property.
  			 */
  def getPasswordPlaceholder(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.passwordReturnKeyType> property.
  			 */
  def getPasswordReturnKeyType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.passwordValue> property.
  			 */
  def getPasswordValue(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.passwordhinttextid> property.
  			 */
  def getPasswordhinttextid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.persistent> property.
  			 */
  def getPersistent(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.placeholder> property.
  			 */
  def getPlaceholder(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.preferred> property.
  			 */
  def getPreferred(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.returnKeyType> property.
  			 */
  def getReturnKeyType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.style> property.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.title> property.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.titleid> property.
  			 */
  def getTitleid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.value> property.
  			 */
  def getValue(): String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.buttonClickRequired> property.
  			 */
  def setButtonClickRequired(buttonClickRequired: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.buttonNames> property.
  			 */
  def setButtonNames(buttonNames: js.Array[String]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.cancel> property.
  			 */
  def setCancel(cancel: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.canceledOnTouchOutside> property.
  			 */
  def setCanceledOnTouchOutside(canceledOnTouchOutside: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.destructive> property.
  			 */
  def setDestructive(destructive: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.hintText> property.
  			 */
  def setHintText(hintText: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.hinttextid> property.
  			 */
  def setHinttextid(hinttextid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.keyboardAppearance> property.
  			 */
  def setKeyboardAppearance(keyboardAppearance: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.keyboardType> property.
  			 */
  def setKeyboardType(keyboardType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.loginHintText> property.
  			 */
  def setLoginHintText(loginHintText: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.loginKeyboardType> property.
  			 */
  def setLoginKeyboardType(loginKeyboardType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.loginPlaceholder> property.
  			 */
  def setLoginPlaceholder(loginPlaceholder: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.loginReturnKeyType> property.
  			 */
  def setLoginReturnKeyType(loginReturnKeyType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.loginValue> property.
  			 */
  def setLoginValue(loginValue: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.loginhinttextid> property.
  			 */
  def setLoginhinttextid(loginhinttextid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.message> property.
  			 */
  def setMessage(message: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.messageid> property.
  			 */
  def setMessageid(messageid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.ok> property.
  			 */
  def setOk(ok: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.okid> property.
  			 */
  def setOkid(okid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.passwordHintText> property.
  			 */
  def setPasswordHintText(passwordHintText: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.passwordKeyboardType> property.
  			 */
  def setPasswordKeyboardType(passwordKeyboardType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.passwordPlaceholder> property.
  			 */
  def setPasswordPlaceholder(passwordPlaceholder: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.passwordReturnKeyType> property.
  			 */
  def setPasswordReturnKeyType(passwordReturnKeyType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.passwordValue> property.
  			 */
  def setPasswordValue(passwordValue: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.passwordhinttextid> property.
  			 */
  def setPasswordhinttextid(passwordhinttextid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.persistent> property.
  			 */
  def setPersistent(persistent: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.placeholder> property.
  			 */
  def setPlaceholder(placeholder: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.preferred> property.
  			 */
  def setPreferred(preferred: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.returnKeyType> property.
  			 */
  def setReturnKeyType(returnKeyType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.style> property.
  			 */
  def setStyle(style: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.title> property.
  			 */
  def setTitle(title: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.titleid> property.
  			 */
  def setTitleid(titleid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.value> property.
  			 */
  def setValue(value: String): Unit = js.native
}

