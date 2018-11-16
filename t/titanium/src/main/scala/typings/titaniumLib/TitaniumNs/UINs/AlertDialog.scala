package typings
package titaniumLib.TitaniumNs.UINs

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
  var buttonClickRequired: scala.Boolean = js.native
  /**
  			 * Name of each button to create.
  			 */
  var buttonNames: js.Array[java.lang.String] = js.native
  /**
  			 * Index to define the cancel button.
  			 */
  var cancel: scala.Double = js.native
  /**
  			 * When this is set to `true`, the dialog is canceled when touched outside the window's bounds.
  			 */
  var canceledOnTouchOutside: scala.Boolean = js.native
  /**
  			 * Index to define the destructive button.
  			 */
  var destructive: scala.Double = js.native
  /**
  			 * Hint text of the text field inside the dialog.
  			 */
  var hintText: java.lang.String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the
  			 * [hintText](Titanium.UI.AlertDialog.hintText) property.
  			 */
  var hinttextid: java.lang.String = js.native
  /**
  			 * Keyboard appearance to be displayed when the text field inside the dialog is focused.
  			 */
  var keyboardAppearance: scala.Double = js.native
  /**
  			 * Keyboard type to display when this text field inside the dialog is focused.
  			 */
  var keyboardType: scala.Double = js.native
  /**
  			 * Hint text of the login text field inside the dialog.
  			 */
  var loginHintText: java.lang.String = js.native
  /**
  			 * Keyboard type to display when this text field inside the dialog is focused.
  			 */
  var loginKeyboardType: scala.Double = js.native
  /**
  			 * Placeholder of the login text field inside the dialog.
  			 */
  var loginPlaceholder: java.lang.String = js.native
  /**
  			 * Specifies the text to display on the keyboard `Return` key when this field is focused.
  			 */
  var loginReturnKeyType: scala.Double = js.native
  /**
  			 * Value of the login text field inside the dialog.
  			 */
  var loginValue: java.lang.String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the
  			 * [loginHintText](Titanium.UI.AlertDialog.loginHintText) property.
  			 */
  var loginhinttextid: java.lang.String = js.native
  /**
  			 * Dialog message.
  			 */
  var message: java.lang.String = js.native
  /**
  			 * Key identifying a string in the locale file to use for the message text.
  			 */
  var messageid: java.lang.String = js.native
  /**
  			 * Text for the `OK` button.
  			 */
  var ok: java.lang.String = js.native
  /**
  			 * Key identifying a string in the locale file to use for the `ok` text.
  			 */
  var okid: java.lang.String = js.native
  /**
  			 * Hint text of the password text field inside the dialog.
  			 */
  var passwordHintText: java.lang.String = js.native
  /**
  			 * Keyboard type to display when this text field inside the dialog is focused.
  			 */
  var passwordKeyboardType: scala.Double = js.native
  /**
  			 * Placeholder of the password text field inside the dialog.
  			 */
  var passwordPlaceholder: java.lang.String = js.native
  /**
  			 * Specifies the text to display on the keyboard `Return` key when this field is focused.
  			 */
  var passwordReturnKeyType: scala.Double = js.native
  /**
  			 * Value of the password text field inside the dialog.
  			 */
  var passwordValue: java.lang.String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the
  			 * [passwordHintText](Titanium.UI.AlertDialog.passwordHintText) property.
  			 */
  var passwordhinttextid: java.lang.String = js.native
  /**
  			 * Boolean value indicating if the alert dialog should only be cancelled by user gesture or by hide method.
  			 */
  var persistent: scala.Boolean = js.native
  /**
  			 * Placeholder of the text field inside the dialog.
  			 */
  var placeholder: java.lang.String = js.native
  /**
  			 * Index to define the preferred button.
  			 */
  var preferred: scala.Double = js.native
  /**
  			 * Specifies the text to display on the keyboard `Return` key when this field is focused.
  			 */
  var returnKeyType: scala.Double = js.native
  /**
  			 * The style for the alert dialog.
  			 */
  var style: scala.Double = js.native
  /**
  			 * Title of the dialog.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Key identifying a string in the locale file to use for the title text.
  			 */
  var titleid: java.lang.String = js.native
  /**
  			 * Value of the text field inside the dialog.
  			 */
  var value: java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.buttonClickRequired> property.
  			 */
  def getButtonClickRequired(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.buttonNames> property.
  			 */
  def getButtonNames(): js.Array[java.lang.String] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.cancel> property.
  			 */
  def getCancel(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.canceledOnTouchOutside> property.
  			 */
  def getCanceledOnTouchOutside(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.destructive> property.
  			 */
  def getDestructive(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.hintText> property.
  			 */
  def getHintText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.hinttextid> property.
  			 */
  def getHinttextid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.keyboardAppearance> property.
  			 */
  def getKeyboardAppearance(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.keyboardType> property.
  			 */
  def getKeyboardType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.loginHintText> property.
  			 */
  def getLoginHintText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.loginKeyboardType> property.
  			 */
  def getLoginKeyboardType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.loginPlaceholder> property.
  			 */
  def getLoginPlaceholder(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.loginReturnKeyType> property.
  			 */
  def getLoginReturnKeyType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.loginValue> property.
  			 */
  def getLoginValue(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.loginhinttextid> property.
  			 */
  def getLoginhinttextid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.message> property.
  			 */
  def getMessage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.messageid> property.
  			 */
  def getMessageid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.ok> property.
  			 */
  def getOk(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.okid> property.
  			 */
  def getOkid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.passwordHintText> property.
  			 */
  def getPasswordHintText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.passwordKeyboardType> property.
  			 */
  def getPasswordKeyboardType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.passwordPlaceholder> property.
  			 */
  def getPasswordPlaceholder(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.passwordReturnKeyType> property.
  			 */
  def getPasswordReturnKeyType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.passwordValue> property.
  			 */
  def getPasswordValue(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.passwordhinttextid> property.
  			 */
  def getPasswordhinttextid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.persistent> property.
  			 */
  def getPersistent(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.placeholder> property.
  			 */
  def getPlaceholder(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.preferred> property.
  			 */
  def getPreferred(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.returnKeyType> property.
  			 */
  def getReturnKeyType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.style> property.
  			 */
  def getStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.titleid> property.
  			 */
  def getTitleid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.AlertDialog.value> property.
  			 */
  def getValue(): java.lang.String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.buttonClickRequired> property.
  			 */
  def setButtonClickRequired(buttonClickRequired: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.buttonNames> property.
  			 */
  def setButtonNames(buttonNames: js.Array[java.lang.String]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.cancel> property.
  			 */
  def setCancel(cancel: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.canceledOnTouchOutside> property.
  			 */
  def setCanceledOnTouchOutside(canceledOnTouchOutside: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.destructive> property.
  			 */
  def setDestructive(destructive: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.hintText> property.
  			 */
  def setHintText(hintText: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.hinttextid> property.
  			 */
  def setHinttextid(hinttextid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.keyboardAppearance> property.
  			 */
  def setKeyboardAppearance(keyboardAppearance: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.keyboardType> property.
  			 */
  def setKeyboardType(keyboardType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.loginHintText> property.
  			 */
  def setLoginHintText(loginHintText: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.loginKeyboardType> property.
  			 */
  def setLoginKeyboardType(loginKeyboardType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.loginPlaceholder> property.
  			 */
  def setLoginPlaceholder(loginPlaceholder: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.loginReturnKeyType> property.
  			 */
  def setLoginReturnKeyType(loginReturnKeyType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.loginValue> property.
  			 */
  def setLoginValue(loginValue: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.loginhinttextid> property.
  			 */
  def setLoginhinttextid(loginhinttextid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.message> property.
  			 */
  def setMessage(message: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.messageid> property.
  			 */
  def setMessageid(messageid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.ok> property.
  			 */
  def setOk(ok: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.okid> property.
  			 */
  def setOkid(okid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.passwordHintText> property.
  			 */
  def setPasswordHintText(passwordHintText: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.passwordKeyboardType> property.
  			 */
  def setPasswordKeyboardType(passwordKeyboardType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.passwordPlaceholder> property.
  			 */
  def setPasswordPlaceholder(passwordPlaceholder: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.passwordReturnKeyType> property.
  			 */
  def setPasswordReturnKeyType(passwordReturnKeyType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.passwordValue> property.
  			 */
  def setPasswordValue(passwordValue: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.passwordhinttextid> property.
  			 */
  def setPasswordhinttextid(passwordhinttextid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.persistent> property.
  			 */
  def setPersistent(persistent: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.placeholder> property.
  			 */
  def setPlaceholder(placeholder: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.preferred> property.
  			 */
  def setPreferred(preferred: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.returnKeyType> property.
  			 */
  def setReturnKeyType(returnKeyType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.style> property.
  			 */
  def setStyle(style: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.titleid> property.
  			 */
  def setTitleid(titleid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.AlertDialog.value> property.
  			 */
  def setValue(value: java.lang.String): scala.Unit = js.native
}

