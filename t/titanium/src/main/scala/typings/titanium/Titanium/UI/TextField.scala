package typings.titanium.Titanium.UI

import typings.titanium.Font
import typings.titanium.ViewPadding
import typings.titanium.textFieldSelectedParams
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
  var appearance: Double = js.native
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
  var autoLink: Double = js.native
  /**
  			 * Determines how text is capitalized during typing.
  			 */
  var autocapitalization: Double = js.native
  /**
  			 * Determines whether to automatically correct text entered into this text field.
  			 */
  var autocorrect: Boolean = js.native
  /**
  			 * Sets the autofill type for the text field.
  			 */
  var autofillType: String = js.native
  /**
  			 * Border style for the field.
  			 */
  var borderStyle: Double = js.native
  /**
  			 * Determines when the clear button is displayed.
  			 */
  var clearButtonMode: Double = js.native
  /**
  			 * Determines whether the value of this text field should be cleared when it is focused.
  			 */
  var clearOnEdit: Boolean = js.native
  /**
  			 * Color of the text in this text field, as a color name or hex triplet.
  			 */
  var color: String = js.native
  /**
  			 * Determines whether this field can be edited.
  			 */
  var editable: Boolean = js.native
  /**
  			 * Determines whether an ellipsis (`...`) should be used to indicate truncated text.
  			 */
  var ellipsize: Boolean = js.native
  /**
  			 * Determines whether the return key is enabled automatically when there is text in this text
  			 * field.
  			 */
  var enableReturnKey: Boolean = js.native
  /**
  			 * Font to use for text.
  			 */
  var font: Font = js.native
  /**
  			 * Leave some space above the keyboard in landscape mode or not.
  			 */
  var fullscreen: Boolean = js.native
  /**
  			 * Hint text to display when the field is empty.
  			 */
  var hintText: String = js.native
  /**
  			 * Hint text color to display when the field is empty.
  			 */
  var hintTextColor: String = js.native
  /**
  			 * Hint type to display on the text field.
  			 */
  var hintType: Double = js.native
  /**
  			 * Key identifying a string from the locale file to use for the
  			 * [hintText](Titanium.UI.TextField.hintText) property.
  			 */
  var hinttextid: String = js.native
  /**
  			 * Input type to accept in the text field. Also influences the Keyboard type to display.
  			 */
  var inputType: js.Array[Double] = js.native
  /**
  			 * Determines the appearance of the keyboard displayed when this field is focused.
  			 */
  var keyboardAppearance: Double = js.native
  /**
  			 * Array of toolbar button objects or a [toolbar](Titanium.UI.iOS.Toolbar) to be used when the
  			 * keyboard is displayed.
  			 */
  var keyboardToolbar: js.Array[View] | typings.titanium.Titanium.UI.iOS.Toolbar = js.native
  /**
  			 * Color of the keyboard toolbar if keyboardToolbar is an array, as a color name or hex triplet.
  			 */
  var keyboardToolbarColor: String = js.native
  /**
  			 * Height of the keyboard toolbar if keyboardToolbar is an array.
  			 */
  var keyboardToolbarHeight: Double = js.native
  /**
  			 * Keyboard type to display when this text field is focused.
  			 */
  var keyboardType: Double = js.native
  /**
  			 * Left button view to display in the `TextField`.
  			 */
  var leftButton: js.Any = js.native
  /**
  			 * Determines when to display the left button view.
  			 */
  var leftButtonMode: Double = js.native
  /**
  			 * Padding between the left button and the edge of the field.
  			 */
  var leftButtonPadding: Double = js.native
  /**
  			 * Maximum length of text field input.
  			 */
  var maxLength: Double = js.native
  /**
  			 * Minimum size of the font when the font is sized based on the contents.  Enables font
  			 * scaling to fit.
  			 */
  var minimumFontSize: Double = js.native
  /**
  			 * Sets the padding of this text field.
  			 */
  var padding: ViewPadding = js.native
  /**
  			 * Left padding of this text field.
  			 */
  var paddingLeft: Double = js.native
  /**
  			 * Right padding of this text field.
  			 */
  var paddingRight: Double = js.native
  /**
  			 * Obscure the input text from the user.
  			 */
  var passwordMask: Boolean = js.native
  /**
  			 * Set password rules that should be used for this text field.
  			 */
  var passwordRules: String = js.native
  /**
  			 * Specifies the text to display on the keyboard `Return` key when this field is focused.
  			 */
  var returnKeyType: Double = js.native
  /**
  			 * Right button view.
  			 */
  var rightButton: js.Any = js.native
  /**
  			 * Determines when to display the right button view.
  			 */
  var rightButtonMode: Double = js.native
  /**
  			 * Padding between the right button and the edge of the field.
  			 */
  var rightButtonPadding: Double = js.native
  /**
  			 * Returns the currently selected text of the text field.
  			 */
  val selection: textFieldSelectedParams = js.native
  /**
  			 * Determinates if the undo and redo buttons on the left side of the keyboard should be displayed or not. Only valid on iOS9 and above.
  			 */
  var showUndoRedoActions: Boolean = js.native
  /**
  			 * Determines whether the return key should be suppressed during entry.
  			 */
  var suppressReturn: Boolean = js.native
  /**
  			 * Text alignment within this text field.
  			 * This has no effect on `hintText` when `hintType` is Ti.UI.HINT_TYPE_ANIMATED.
  			 */
  var textAlign: String | Double = js.native
  /**
  			 * Value of this text field, which may be set programmatically and modified by the user.
  			 */
  var value: String = js.native
  /**
  			 * Vertical alignment within this text field.
  			 */
  var verticalAlign: Double | String = js.native
  /**
  			 * Forces the field to lose focus.
  			 */
  def blur(): Unit = js.native
  /**
  			 * Forces the field to gain focus.
  			 */
  def focus(): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.appearance> property.
  			 */
  def getAppearance(): Double = js.native
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
  def getAutoLink(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.autocapitalization> property.
  			 */
  def getAutocapitalization(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.autocorrect> property.
  			 */
  def getAutocorrect(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.autofillType> property.
  			 */
  def getAutofillType(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.borderStyle> property.
  			 */
  def getBorderStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.clearButtonMode> property.
  			 */
  def getClearButtonMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.clearOnEdit> property.
  			 */
  def getClearOnEdit(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.color> property.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.editable> property.
  			 */
  def getEditable(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.ellipsize> property.
  			 */
  def getEllipsize(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.enableReturnKey> property.
  			 */
  def getEnableReturnKey(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.font> property.
  			 */
  def getFont(): Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.fullscreen> property.
  			 */
  def getFullscreen(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.hintText> property.
  			 */
  def getHintText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.hintTextColor> property.
  			 */
  def getHintTextColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.hintType> property.
  			 */
  def getHintType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.hinttextid> property.
  			 */
  def getHinttextid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.inputType> property.
  			 */
  def getInputType(): js.Array[Double] = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.keyboardAppearance> property.
  			 */
  def getKeyboardAppearance(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.keyboardToolbar> property.
  			 */
  def getKeyboardToolbar(): js.Array[View] | typings.titanium.Titanium.UI.iOS.Toolbar = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.keyboardToolbarColor> property.
  			 */
  def getKeyboardToolbarColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.keyboardToolbarHeight> property.
  			 */
  def getKeyboardToolbarHeight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.keyboardType> property.
  			 */
  def getKeyboardType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.leftButton> property.
  			 */
  def getLeftButton(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.leftButtonMode> property.
  			 */
  def getLeftButtonMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.leftButtonPadding> property.
  			 */
  def getLeftButtonPadding(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.maxLength> property.
  			 */
  def getMaxLength(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.minimumFontSize> property.
  			 */
  def getMinimumFontSize(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.padding> property.
  			 */
  def getPadding(): ViewPadding = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.paddingLeft> property.
  			 */
  def getPaddingLeft(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.paddingRight> property.
  			 */
  def getPaddingRight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.passwordMask> property.
  			 */
  def getPasswordMask(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.passwordRules> property.
  			 */
  def getPasswordRules(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.returnKeyType> property.
  			 */
  def getReturnKeyType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.rightButton> property.
  			 */
  def getRightButton(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.rightButtonMode> property.
  			 */
  def getRightButtonMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.rightButtonPadding> property.
  			 */
  def getRightButtonPadding(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.selection> property.
  			 */
  def getSelection(): textFieldSelectedParams = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.showUndoRedoActions> property.
  			 */
  def getShowUndoRedoActions(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.suppressReturn> property.
  			 */
  def getSuppressReturn(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.textAlign> property.
  			 */
  def getTextAlign(): String | Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.value> property.
  			 */
  def getValue(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextField.verticalAlign> property.
  			 */
  def getVerticalAlign(): Double | String = js.native
  /**
  			 * Returns `true` if this text field contains text.
  			 */
  def hasText(): Boolean = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.appearance> property.
  			 */
  def setAppearance(appearance: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.attributedHintText> property.
  			 */
  def setAttributedHintText(attributedHintText: AttributedString): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.attributedString> property.
  			 */
  def setAttributedString(attributedString: AttributedString): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.autoLink> property.
  			 */
  def setAutoLink(autoLink: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.autocapitalization> property.
  			 */
  def setAutocapitalization(autocapitalization: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.autocorrect> property.
  			 */
  def setAutocorrect(autocorrect: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.autofillType> property.
  			 */
  def setAutofillType(autofillType: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.borderStyle> property.
  			 */
  def setBorderStyle(borderStyle: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.clearButtonMode> property.
  			 */
  def setClearButtonMode(clearButtonMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.clearOnEdit> property.
  			 */
  def setClearOnEdit(clearOnEdit: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.color> property.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.editable> property.
  			 */
  def setEditable(editable: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.ellipsize> property.
  			 */
  def setEllipsize(ellipsize: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.enableReturnKey> property.
  			 */
  def setEnableReturnKey(enableReturnKey: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.font> property.
  			 */
  def setFont(font: Font): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.fullscreen> property.
  			 */
  def setFullscreen(fullscreen: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.hintText> property.
  			 */
  def setHintText(hintText: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.hintTextColor> property.
  			 */
  def setHintTextColor(hintTextColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.hintType> property.
  			 */
  def setHintType(hintType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.hinttextid> property.
  			 */
  def setHinttextid(hinttextid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.inputType> property.
  			 */
  def setInputType(inputType: js.Array[Double]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.keyboardAppearance> property.
  			 */
  def setKeyboardAppearance(keyboardAppearance: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.keyboardToolbar> property.
  			 */
  def setKeyboardToolbar(keyboardToolbar: js.Array[_]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.keyboardToolbar> property.
  			 */
  def setKeyboardToolbar(keyboardToolbar: typings.titanium.Titanium.UI.iOS.Toolbar): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.keyboardToolbarColor> property.
  			 */
  def setKeyboardToolbarColor(keyboardToolbarColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.keyboardToolbarHeight> property.
  			 */
  def setKeyboardToolbarHeight(keyboardToolbarHeight: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.keyboardType> property.
  			 */
  def setKeyboardType(keyboardType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.leftButton> property.
  			 */
  def setLeftButton(leftButton: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.leftButtonMode> property.
  			 */
  def setLeftButtonMode(leftButtonMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.leftButtonPadding> property.
  			 */
  def setLeftButtonPadding(leftButtonPadding: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.maxLength> property.
  			 */
  def setMaxLength(maxLength: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.minimumFontSize> property.
  			 */
  def setMinimumFontSize(minimumFontSize: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.padding> property.
  			 */
  def setPadding(padding: ViewPadding): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.paddingLeft> property.
  			 */
  def setPaddingLeft(paddingLeft: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.paddingRight> property.
  			 */
  def setPaddingRight(paddingRight: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.passwordMask> property.
  			 */
  def setPasswordMask(passwordMask: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.passwordRules> property.
  			 */
  def setPasswordRules(passwordRules: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.returnKeyType> property.
  			 */
  def setReturnKeyType(returnKeyType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.rightButton> property.
  			 */
  def setRightButton(rightButton: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.rightButtonMode> property.
  			 */
  def setRightButtonMode(rightButtonMode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.rightButtonPadding> property.
  			 */
  def setRightButtonPadding(rightButtonPadding: Double): Unit = js.native
  /**
  			 * Selects the text in range (start, end).
  			 */
  def setSelection(start: Double, end: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.showUndoRedoActions> property.
  			 */
  def setShowUndoRedoActions(showUndoRedoActions: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.suppressReturn> property.
  			 */
  def setSuppressReturn(suppressReturn: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.textAlign> property.
  			 */
  def setTextAlign(textAlign: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.textAlign> property.
  			 */
  def setTextAlign(textAlign: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.value> property.
  			 */
  def setValue(value: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextField.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: Double): Unit = js.native
}

