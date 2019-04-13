package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A single line text field.
		 */
@js.native
trait TextField extends View {
  /**
  			 * Determines the appearance of the keyboard displayed when this field is focused.
  			 */
  var appearance: scala.Double = js.native
  /**
  			 * Hint text attributed string.
  			 */
  var attributedHintText: AttributedString = js.native
  /**
  			 * TextField attributed string.
  			 */
  var attributedString: AttributedString = js.native
  /**
  			 * Automatically convert text to clickable links.
  			 */
  var autoLink: scala.Double = js.native
  /**
  			 * Determines how text is capitalized during typing.
  			 */
  var autocapitalization: scala.Double = js.native
  /**
  			 * Determines whether to automatically correct text entered into this text field.
  			 */
  var autocorrect: scala.Boolean = js.native
  /**
  			 * Sets the autofill type for the text field.
  			 */
  var autofillType: java.lang.String = js.native
  /**
  			 * Border style for the field.
  			 */
  var borderStyle: scala.Double = js.native
  /**
  			 * Determines when the clear button is displayed.
  			 */
  var clearButtonMode: scala.Double = js.native
  /**
  			 * Determines whether the value of this text field should be cleared when it is focused.
  			 */
  var clearOnEdit: scala.Boolean = js.native
  /**
  			 * Color of the text in this text field, as a color name or hex triplet.
  			 */
  var color: java.lang.String = js.native
  /**
  			 * Determines whether this field can be edited.
  			 */
  var editable: scala.Boolean = js.native
  /**
  			 * Determines whether an ellipsis (`...`) should be used to indicate truncated text.
  			 */
  var ellipsize: scala.Boolean = js.native
  /**
  			 * Determines whether the return key is enabled automatically when there is text in this text
  			 * field.
  			 */
  var enableReturnKey: scala.Boolean = js.native
  /**
  			 * Font to use for text.
  			 */
  var font: titaniumLib.Font = js.native
  /**
  			 * Leave some space above the keyboard in landscape mode or not.
  			 */
  var fullscreen: scala.Boolean = js.native
  /**
  			 * Hint text to display when the field is empty.
  			 */
  var hintText: java.lang.String = js.native
  /**
  			 * Hint text color to display when the field is empty.
  			 */
  var hintTextColor: java.lang.String = js.native
  /**
  			 * Hint type to display on the text field.
  			 */
  var hintType: scala.Double = js.native
  /**
  			 * Key identifying a string from the locale file to use for the
  			 * [hintText](Titanium.UI.TextField.hintText) property.
  			 */
  var hinttextid: java.lang.String = js.native
  /**
  			 * Input type to accept in the text field. Also influences the Keyboard type to display.
  			 */
  var inputType: js.Array[scala.Double] = js.native
  /**
  			 * Determines the appearance of the keyboard displayed when this field is focused.
  			 */
  var keyboardAppearance: scala.Double = js.native
  /**
  			 * Array of toolbar button objects or a [toolbar](Titanium.UI.iOS.Toolbar) to be used when the
  			 * keyboard is displayed.
  			 */
  var keyboardToolbar: js.Array[View] | titaniumLib.TitaniumNs.UINs.iOSNs.Toolbar = js.native
  /**
  			 * Color of the keyboard toolbar if keyboardToolbar is an array, as a color name or hex triplet.
  			 */
  var keyboardToolbarColor: java.lang.String = js.native
  /**
  			 * Height of the keyboard toolbar if keyboardToolbar is an array.
  			 */
  var keyboardToolbarHeight: scala.Double = js.native
  /**
  			 * Keyboard type to display when this text field is focused.
  			 */
  var keyboardType: scala.Double = js.native
  /**
  			 * Left button view to display in the `TextField`.
  			 */
  var leftButton: js.Any = js.native
  /**
  			 * Determines when to display the left button view.
  			 */
  var leftButtonMode: scala.Double = js.native
  /**
  			 * Padding between the left button and the edge of the field.
  			 */
  var leftButtonPadding: scala.Double = js.native
  /**
  			 * Maximum length of text field input.
  			 */
  var maxLength: scala.Double = js.native
  /**
  			 * Minimum size of the font when the font is sized based on the contents.  Enables font
  			 * scaling to fit.
  			 */
  var minimumFontSize: scala.Double = js.native
  /**
  			 * Sets the padding of this text field.
  			 */
  var padding: titaniumLib.ViewPadding = js.native
  /**
  			 * Left padding of this text field.
  			 */
  var paddingLeft: scala.Double = js.native
  /**
  			 * Right padding of this text field.
  			 */
  var paddingRight: scala.Double = js.native
  /**
  			 * Obscure the input text from the user.
  			 */
  var passwordMask: scala.Boolean = js.native
  /**
  			 * Set password rules that should be used for this text field.
  			 */
  var passwordRules: java.lang.String = js.native
  /**
  			 * Specifies the text to display on the keyboard `Return` key when this field is focused.
  			 */
  var returnKeyType: scala.Double = js.native
  /**
  			 * Right button view.
  			 */
  var rightButton: js.Any = js.native
  /**
  			 * Determines when to display the right button view.
  			 */
  var rightButtonMode: scala.Double = js.native
  /**
  			 * Padding between the right button and the edge of the field.
  			 */
  var rightButtonPadding: scala.Double = js.native
  /**
  			 * Returns the currently selected text of the text field.
  			 */
  val selection: titaniumLib.textFieldSelectedParams = js.native
  /**
  			 * Determinates if the undo and redo buttons on the left side of the keyboard should be displayed or not. Only valid on iOS9 and above.
  			 */
  var showUndoRedoActions: scala.Boolean = js.native
  /**
  			 * Determines whether the return key should be suppressed during entry.
  			 */
  var suppressReturn: scala.Boolean = js.native
  /**
  			 * Text alignment within this text field.
  			 * This has no effect on `hintText` when `hintType` is Ti.UI.HINT_TYPE_ANIMATED.
  			 */
  var textAlign: java.lang.String | scala.Double = js.native
  /**
  			 * Value of this text field, which may be set programmatically and modified by the user.
  			 */
  var value: java.lang.String = js.native
  /**
  			 * Vertical alignment within this text field.
  			 */
  var verticalAlign: scala.Double | java.lang.String = js.native
  /**
  			 * Forces the field to lose focus.
  			 */
  def blur(): scala.Unit = js.native
  /**
  			 * Forces the field to gain focus.
  			 */
  def focus(): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.appearance> property.
  			 */
  def getAppearance(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.attributedHintText> property.
  			 */
  def getAttributedHintText(): AttributedString = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.attributedString> property.
  			 */
  def getAttributedString(): AttributedString = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.autoLink> property.
  			 */
  def getAutoLink(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.autocapitalization> property.
  			 */
  def getAutocapitalization(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.autocorrect> property.
  			 */
  def getAutocorrect(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.autofillType> property.
  			 */
  def getAutofillType(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.borderStyle> property.
  			 */
  def getBorderStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.clearButtonMode> property.
  			 */
  def getClearButtonMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.clearOnEdit> property.
  			 */
  def getClearOnEdit(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.color> property.
  			 */
  def getColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.editable> property.
  			 */
  def getEditable(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.ellipsize> property.
  			 */
  def getEllipsize(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.enableReturnKey> property.
  			 */
  def getEnableReturnKey(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.font> property.
  			 */
  def getFont(): titaniumLib.Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.fullscreen> property.
  			 */
  def getFullscreen(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.hintText> property.
  			 */
  def getHintText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.hintTextColor> property.
  			 */
  def getHintTextColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.hintType> property.
  			 */
  def getHintType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.hinttextid> property.
  			 */
  def getHinttextid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.inputType> property.
  			 */
  def getInputType(): js.Array[scala.Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.keyboardAppearance> property.
  			 */
  def getKeyboardAppearance(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.keyboardToolbar> property.
  			 */
  def getKeyboardToolbar(): js.Array[View] | titaniumLib.TitaniumNs.UINs.iOSNs.Toolbar = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.keyboardToolbarColor> property.
  			 */
  def getKeyboardToolbarColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.keyboardToolbarHeight> property.
  			 */
  def getKeyboardToolbarHeight(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.keyboardType> property.
  			 */
  def getKeyboardType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.leftButton> property.
  			 */
  def getLeftButton(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.leftButtonMode> property.
  			 */
  def getLeftButtonMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.leftButtonPadding> property.
  			 */
  def getLeftButtonPadding(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.maxLength> property.
  			 */
  def getMaxLength(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.minimumFontSize> property.
  			 */
  def getMinimumFontSize(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.padding> property.
  			 */
  def getPadding(): titaniumLib.ViewPadding = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.paddingLeft> property.
  			 */
  def getPaddingLeft(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.paddingRight> property.
  			 */
  def getPaddingRight(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.passwordMask> property.
  			 */
  def getPasswordMask(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.passwordRules> property.
  			 */
  def getPasswordRules(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.returnKeyType> property.
  			 */
  def getReturnKeyType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.rightButton> property.
  			 */
  def getRightButton(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.rightButtonMode> property.
  			 */
  def getRightButtonMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.rightButtonPadding> property.
  			 */
  def getRightButtonPadding(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.selection> property.
  			 */
  def getSelection(): titaniumLib.textFieldSelectedParams = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.showUndoRedoActions> property.
  			 */
  def getShowUndoRedoActions(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.suppressReturn> property.
  			 */
  def getSuppressReturn(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.textAlign> property.
  			 */
  def getTextAlign(): java.lang.String | scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.value> property.
  			 */
  def getValue(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.verticalAlign> property.
  			 */
  def getVerticalAlign(): scala.Double | java.lang.String = js.native
  /**
  			 * Returns `true` if this text field contains text.
  			 */
  def hasText(): scala.Boolean = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.appearance> property.
  			 */
  def setAppearance(appearance: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.attributedHintText> property.
  			 */
  def setAttributedHintText(attributedHintText: AttributedString): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.attributedString> property.
  			 */
  def setAttributedString(attributedString: AttributedString): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.autoLink> property.
  			 */
  def setAutoLink(autoLink: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.autocapitalization> property.
  			 */
  def setAutocapitalization(autocapitalization: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.autocorrect> property.
  			 */
  def setAutocorrect(autocorrect: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.autofillType> property.
  			 */
  def setAutofillType(autofillType: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.borderStyle> property.
  			 */
  def setBorderStyle(borderStyle: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.clearButtonMode> property.
  			 */
  def setClearButtonMode(clearButtonMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.clearOnEdit> property.
  			 */
  def setClearOnEdit(clearOnEdit: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.color> property.
  			 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.editable> property.
  			 */
  def setEditable(editable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.ellipsize> property.
  			 */
  def setEllipsize(ellipsize: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.enableReturnKey> property.
  			 */
  def setEnableReturnKey(enableReturnKey: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.font> property.
  			 */
  def setFont(font: titaniumLib.Font): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.fullscreen> property.
  			 */
  def setFullscreen(fullscreen: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.hintText> property.
  			 */
  def setHintText(hintText: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.hintTextColor> property.
  			 */
  def setHintTextColor(hintTextColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.hintType> property.
  			 */
  def setHintType(hintType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.hinttextid> property.
  			 */
  def setHinttextid(hinttextid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.inputType> property.
  			 */
  def setInputType(inputType: js.Array[scala.Double]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.keyboardAppearance> property.
  			 */
  def setKeyboardAppearance(keyboardAppearance: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.keyboardToolbar> property.
  			 */
  def setKeyboardToolbar(keyboardToolbar: js.Array[_]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.keyboardToolbar> property.
  			 */
  def setKeyboardToolbar(keyboardToolbar: titaniumLib.TitaniumNs.UINs.iOSNs.Toolbar): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.keyboardToolbarColor> property.
  			 */
  def setKeyboardToolbarColor(keyboardToolbarColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.keyboardToolbarHeight> property.
  			 */
  def setKeyboardToolbarHeight(keyboardToolbarHeight: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.keyboardType> property.
  			 */
  def setKeyboardType(keyboardType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.leftButton> property.
  			 */
  def setLeftButton(leftButton: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.leftButtonMode> property.
  			 */
  def setLeftButtonMode(leftButtonMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.leftButtonPadding> property.
  			 */
  def setLeftButtonPadding(leftButtonPadding: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.maxLength> property.
  			 */
  def setMaxLength(maxLength: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.minimumFontSize> property.
  			 */
  def setMinimumFontSize(minimumFontSize: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.padding> property.
  			 */
  def setPadding(padding: titaniumLib.ViewPadding): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.paddingLeft> property.
  			 */
  def setPaddingLeft(paddingLeft: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.paddingRight> property.
  			 */
  def setPaddingRight(paddingRight: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.passwordMask> property.
  			 */
  def setPasswordMask(passwordMask: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.passwordRules> property.
  			 */
  def setPasswordRules(passwordRules: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.returnKeyType> property.
  			 */
  def setReturnKeyType(returnKeyType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.rightButton> property.
  			 */
  def setRightButton(rightButton: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.rightButtonMode> property.
  			 */
  def setRightButtonMode(rightButtonMode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.rightButtonPadding> property.
  			 */
  def setRightButtonPadding(rightButtonPadding: scala.Double): scala.Unit = js.native
  /**
  			 * Selects the text in range (start, end).
  			 */
  def setSelection(start: scala.Double, end: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.showUndoRedoActions> property.
  			 */
  def setShowUndoRedoActions(showUndoRedoActions: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.suppressReturn> property.
  			 */
  def setSuppressReturn(suppressReturn: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.textAlign> property.
  			 */
  def setTextAlign(textAlign: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.textAlign> property.
  			 */
  def setTextAlign(textAlign: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.value> property.
  			 */
  def setValue(value: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: scala.Double): scala.Unit = js.native
}

