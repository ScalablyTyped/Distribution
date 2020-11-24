package typings.titanium.Titanium.UI

import typings.titanium.Font
import typings.titanium.TextFieldPadding
import typings.titanium.textFieldSelectedParams
import typings.titanium.titaniumStrings.`return`
import typings.titanium.titaniumStrings.blur
import typings.titanium.titaniumStrings.change
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single line text field.
  */
@js.native
trait TextField extends View {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_blur(name: blur, callback: js.ThisFunction1[/* this */ this.type, /* event */ TextFieldBlurEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TextFieldChangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_return(
    name: `return`,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TextFieldReturnEvent, Unit]
  ): Unit = js.native
  
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
    * Forces the field to lose focus.
    */
  def blur(): Unit = js.native
  
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
  var color: String | Color = js.native
  
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
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_blur(name: blur): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_blur(name: blur, event: TextFieldBlurEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: TextFieldChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: TextFieldClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: TextFieldDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: TextFieldDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: TextFieldFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: TextFieldKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: TextFieldLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: TextFieldLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: TextFieldPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: TextFieldPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_return(name: `return`): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_return(name: `return`, event: TextFieldReturnEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: TextFieldSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: TextFieldSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: TextFieldTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: TextFieldTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: TextFieldTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: TextFieldTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: TextFieldTwofingertapEvent): Unit = js.native
  
  /**
    * Forces the field to gain focus.
    */
  def focus(): Unit = js.native
  
  /**
    * Determines whether this TextField has focus.
    */
  val focused: Boolean = js.native
  
  /**
    * Font to use for text.
    */
  var font: Font = js.native
  
  /**
    * Leave some space above the keyboard in landscape mode or not.
    */
  var fullscreen: Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.attributedHintText> property.
    * @deprecated Access <Titanium.UI.TextField.attributedHintText> instead.
    */
  def getAttributedHintText(): AttributedString = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.attributedString> property.
    * @deprecated Access <Titanium.UI.TextField.attributedString> instead.
    */
  def getAttributedString(): AttributedString = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.autoLink> property.
    * @deprecated Access <Titanium.UI.TextField.autoLink> instead.
    */
  def getAutoLink(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.autocapitalization> property.
    * @deprecated Access <Titanium.UI.TextField.autocapitalization> instead.
    */
  def getAutocapitalization(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.autocorrect> property.
    * @deprecated Access <Titanium.UI.TextField.autocorrect> instead.
    */
  def getAutocorrect(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.autofillType> property.
    * @deprecated Access <Titanium.UI.TextField.autofillType> instead.
    */
  def getAutofillType(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.borderStyle> property.
    * @deprecated Access <Titanium.UI.TextField.borderStyle> instead.
    */
  def getBorderStyle(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.clearButtonMode> property.
    * @deprecated Access <Titanium.UI.TextField.clearButtonMode> instead.
    */
  def getClearButtonMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.clearOnEdit> property.
    * @deprecated Access <Titanium.UI.TextField.clearOnEdit> instead.
    */
  def getClearOnEdit(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.color> property.
    * @deprecated Access <Titanium.UI.TextField.color> instead.
    */
  def getColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.editable> property.
    * @deprecated Access <Titanium.UI.TextField.editable> instead.
    */
  def getEditable(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.ellipsize> property.
    * @deprecated Access <Titanium.UI.TextField.ellipsize> instead.
    */
  def getEllipsize(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.enableReturnKey> property.
    * @deprecated Access <Titanium.UI.TextField.enableReturnKey> instead.
    */
  def getEnableReturnKey(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.focused> property.
    * @deprecated Access <Titanium.UI.TextField.focused> instead.
    */
  def getFocused(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.font> property.
    * @deprecated Access <Titanium.UI.TextField.font> instead.
    */
  def getFont(): Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.fullscreen> property.
    * @deprecated Access <Titanium.UI.TextField.fullscreen> instead.
    */
  def getFullscreen(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.hintText> property.
    * @deprecated Access <Titanium.UI.TextField.hintText> instead.
    */
  def getHintText(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.hintTextColor> property.
    * @deprecated Access <Titanium.UI.TextField.hintTextColor> instead.
    */
  def getHintTextColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.hintType> property.
    * @deprecated Access <Titanium.UI.TextField.hintType> instead.
    */
  def getHintType(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.hinttextid> property.
    * @deprecated Access <Titanium.UI.TextField.hinttextid> instead.
    */
  def getHinttextid(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.inputType> property.
    * @deprecated Access <Titanium.UI.TextField.inputType> instead.
    */
  def getInputType(): js.Array[Double] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.keyboardAppearance> property.
    * @deprecated Access <Titanium.UI.TextField.keyboardAppearance> instead.
    */
  def getKeyboardAppearance(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.keyboardToolbar> property.
    * @deprecated Access <Titanium.UI.TextField.keyboardToolbar> instead.
    */
  def getKeyboardToolbar(): js.Array[View] | Toolbar | typings.titanium.Titanium.UI.iOS.Toolbar = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.keyboardToolbarColor> property.
    * @deprecated Access <Titanium.UI.TextField.keyboardToolbarColor> instead.
    */
  def getKeyboardToolbarColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.keyboardToolbarHeight> property.
    * @deprecated Access <Titanium.UI.TextField.keyboardToolbarHeight> instead.
    */
  def getKeyboardToolbarHeight(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.keyboardType> property.
    * @deprecated Access <Titanium.UI.TextField.keyboardType> instead.
    */
  def getKeyboardType(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.leftButton> property.
    * @deprecated Access <Titanium.UI.TextField.leftButton> instead.
    */
  def getLeftButton(): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.leftButtonMode> property.
    * @deprecated Access <Titanium.UI.TextField.leftButtonMode> instead.
    */
  def getLeftButtonMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.leftButtonPadding> property.
    * @deprecated Access <Titanium.UI.TextField.leftButtonPadding> instead.
    */
  def getLeftButtonPadding(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.maxLength> property.
    * @deprecated Access <Titanium.UI.TextField.maxLength> instead.
    */
  def getMaxLength(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.minimumFontSize> property.
    * @deprecated Access <Titanium.UI.TextField.minimumFontSize> instead.
    */
  def getMinimumFontSize(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.padding> property.
    * @deprecated Access <Titanium.UI.TextField.padding> instead.
    */
  def getPadding(): TextFieldPadding = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.passwordMask> property.
    * @deprecated Access <Titanium.UI.TextField.passwordMask> instead.
    */
  def getPasswordMask(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.passwordRules> property.
    * @deprecated Access <Titanium.UI.TextField.passwordRules> instead.
    */
  def getPasswordRules(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.returnKeyType> property.
    * @deprecated Access <Titanium.UI.TextField.returnKeyType> instead.
    */
  def getReturnKeyType(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.rightButton> property.
    * @deprecated Access <Titanium.UI.TextField.rightButton> instead.
    */
  def getRightButton(): View = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.rightButtonMode> property.
    * @deprecated Access <Titanium.UI.TextField.rightButtonMode> instead.
    */
  def getRightButtonMode(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.rightButtonPadding> property.
    * @deprecated Access <Titanium.UI.TextField.rightButtonPadding> instead.
    */
  def getRightButtonPadding(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.selection> property.
    * @deprecated Access <Titanium.UI.TextField.selection> instead.
    */
  def getSelection(): textFieldSelectedParams = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.showUndoRedoActions> property.
    * @deprecated Access <Titanium.UI.TextField.showUndoRedoActions> instead.
    */
  def getShowUndoRedoActions(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.suppressReturn> property.
    * @deprecated Access <Titanium.UI.TextField.suppressReturn> instead.
    */
  def getSuppressReturn(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.textAlign> property.
    * @deprecated Access <Titanium.UI.TextField.textAlign> instead.
    */
  def getTextAlign(): String | Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.value> property.
    * @deprecated Access <Titanium.UI.TextField.value> instead.
    */
  def getValue(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextField.verticalAlign> property.
    * @deprecated Access <Titanium.UI.TextField.verticalAlign> instead.
    */
  def getVerticalAlign(): Double | String = js.native
  
  /**
    * Returns `true` if this text field contains text.
    */
  def hasText(): Boolean = js.native
  
  /**
    * Hint text to display when the field is empty.
    */
  var hintText: String = js.native
  
  /**
    * Hint text color to display when the field is empty.
    */
  var hintTextColor: String | Color = js.native
  
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
  var keyboardToolbar: js.Array[View] | Toolbar | typings.titanium.Titanium.UI.iOS.Toolbar = js.native
  
  /**
    * Color of the keyboard toolbar if keyboardToolbar is an array, as a color name or hex triplet.
    */
  var keyboardToolbarColor: String | Color = js.native
  
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
  var leftButton: View = js.native
  
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
  var padding: TextFieldPadding = js.native
  
  /**
    * Obscure the input text from the user.
    */
  var passwordMask: Boolean = js.native
  
  /**
    * Set password rules that should be used for this text field.
    */
  var passwordRules: String = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_blur(name: blur, callback: js.ThisFunction1[/* this */ this.type, /* event */ TextFieldBlurEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TextFieldChangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_return(
    name: `return`,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TextFieldReturnEvent, Unit]
  ): Unit = js.native
  
  /**
    * Specifies the text to display on the keyboard `Return` key when this field is focused.
    */
  var returnKeyType: Double = js.native
  
  /**
    * Right button view.
    */
  var rightButton: View = js.native
  
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
    * Sets the value of the <Titanium.UI.TextField.attributedHintText> property.
    * @deprecated Set the value using <Titanium.UI.TextField.attributedHintText> instead.
    */
  def setAttributedHintText(attributedHintText: AttributedString): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.attributedString> property.
    * @deprecated Set the value using <Titanium.UI.TextField.attributedString> instead.
    */
  def setAttributedString(attributedString: AttributedString): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.autoLink> property.
    * @deprecated Set the value using <Titanium.UI.TextField.autoLink> instead.
    */
  def setAutoLink(autoLink: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.autocapitalization> property.
    * @deprecated Set the value using <Titanium.UI.TextField.autocapitalization> instead.
    */
  def setAutocapitalization(autocapitalization: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.autocorrect> property.
    * @deprecated Set the value using <Titanium.UI.TextField.autocorrect> instead.
    */
  def setAutocorrect(autocorrect: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.autofillType> property.
    * @deprecated Set the value using <Titanium.UI.TextField.autofillType> instead.
    */
  def setAutofillType(autofillType: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.borderStyle> property.
    * @deprecated Set the value using <Titanium.UI.TextField.borderStyle> instead.
    */
  def setBorderStyle(borderStyle: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.clearButtonMode> property.
    * @deprecated Set the value using <Titanium.UI.TextField.clearButtonMode> instead.
    */
  def setClearButtonMode(clearButtonMode: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.clearOnEdit> property.
    * @deprecated Set the value using <Titanium.UI.TextField.clearOnEdit> instead.
    */
  def setClearOnEdit(clearOnEdit: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.color> property.
    * @deprecated Set the value using <Titanium.UI.TextField.color> instead.
    */
  def setColor(color: String): Unit = js.native
  def setColor(color: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.editable> property.
    * @deprecated Set the value using <Titanium.UI.TextField.editable> instead.
    */
  def setEditable(editable: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.ellipsize> property.
    * @deprecated Set the value using <Titanium.UI.TextField.ellipsize> instead.
    */
  def setEllipsize(ellipsize: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.enableReturnKey> property.
    * @deprecated Set the value using <Titanium.UI.TextField.enableReturnKey> instead.
    */
  def setEnableReturnKey(enableReturnKey: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.font> property.
    * @deprecated Set the value using <Titanium.UI.TextField.font> instead.
    */
  def setFont(font: Font): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.fullscreen> property.
    * @deprecated Set the value using <Titanium.UI.TextField.fullscreen> instead.
    */
  def setFullscreen(fullscreen: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.hintText> property.
    * @deprecated Set the value using <Titanium.UI.TextField.hintText> instead.
    */
  def setHintText(hintText: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.hintTextColor> property.
    * @deprecated Set the value using <Titanium.UI.TextField.hintTextColor> instead.
    */
  def setHintTextColor(hintTextColor: String): Unit = js.native
  def setHintTextColor(hintTextColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.hintType> property.
    * @deprecated Set the value using <Titanium.UI.TextField.hintType> instead.
    */
  def setHintType(hintType: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.hinttextid> property.
    * @deprecated Set the value using <Titanium.UI.TextField.hinttextid> instead.
    */
  def setHinttextid(hinttextid: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.inputType> property.
    * @deprecated Set the value using <Titanium.UI.TextField.inputType> instead.
    */
  def setInputType(inputType: js.Array[Double]): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.keyboardAppearance> property.
    * @deprecated Set the value using <Titanium.UI.TextField.keyboardAppearance> instead.
    */
  def setKeyboardAppearance(keyboardAppearance: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.keyboardToolbar> property.
    * @deprecated Set the value using <Titanium.UI.TextField.keyboardToolbar> instead.
    */
  def setKeyboardToolbar(keyboardToolbar: js.Array[View]): Unit = js.native
  def setKeyboardToolbar(keyboardToolbar: Toolbar): Unit = js.native
  def setKeyboardToolbar(keyboardToolbar: typings.titanium.Titanium.UI.iOS.Toolbar): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.keyboardToolbarColor> property.
    * @deprecated Set the value using <Titanium.UI.TextField.keyboardToolbarColor> instead.
    */
  def setKeyboardToolbarColor(keyboardToolbarColor: String): Unit = js.native
  def setKeyboardToolbarColor(keyboardToolbarColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.keyboardToolbarHeight> property.
    * @deprecated Set the value using <Titanium.UI.TextField.keyboardToolbarHeight> instead.
    */
  def setKeyboardToolbarHeight(keyboardToolbarHeight: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.keyboardType> property.
    * @deprecated Set the value using <Titanium.UI.TextField.keyboardType> instead.
    */
  def setKeyboardType(keyboardType: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.leftButton> property.
    * @deprecated Set the value using <Titanium.UI.TextField.leftButton> instead.
    */
  def setLeftButton(leftButton: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.leftButtonMode> property.
    * @deprecated Set the value using <Titanium.UI.TextField.leftButtonMode> instead.
    */
  def setLeftButtonMode(leftButtonMode: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.leftButtonPadding> property.
    * @deprecated Set the value using <Titanium.UI.TextField.leftButtonPadding> instead.
    */
  def setLeftButtonPadding(leftButtonPadding: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.maxLength> property.
    * @deprecated Set the value using <Titanium.UI.TextField.maxLength> instead.
    */
  def setMaxLength(maxLength: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.minimumFontSize> property.
    * @deprecated Set the value using <Titanium.UI.TextField.minimumFontSize> instead.
    */
  def setMinimumFontSize(minimumFontSize: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.padding> property.
    * @deprecated Set the value using <Titanium.UI.TextField.padding> instead.
    */
  def setPadding(padding: TextFieldPadding): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.passwordMask> property.
    * @deprecated Set the value using <Titanium.UI.TextField.passwordMask> instead.
    */
  def setPasswordMask(passwordMask: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.passwordRules> property.
    * @deprecated Set the value using <Titanium.UI.TextField.passwordRules> instead.
    */
  def setPasswordRules(passwordRules: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.returnKeyType> property.
    * @deprecated Set the value using <Titanium.UI.TextField.returnKeyType> instead.
    */
  def setReturnKeyType(returnKeyType: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.rightButton> property.
    * @deprecated Set the value using <Titanium.UI.TextField.rightButton> instead.
    */
  def setRightButton(rightButton: View): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.rightButtonMode> property.
    * @deprecated Set the value using <Titanium.UI.TextField.rightButtonMode> instead.
    */
  def setRightButtonMode(rightButtonMode: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.rightButtonPadding> property.
    * @deprecated Set the value using <Titanium.UI.TextField.rightButtonPadding> instead.
    */
  def setRightButtonPadding(rightButtonPadding: Double): Unit = js.native
  
  /**
    * Selects the text in range (start, end).
    */
  def setSelection(start: Double, end: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.showUndoRedoActions> property.
    * @deprecated Set the value using <Titanium.UI.TextField.showUndoRedoActions> instead.
    */
  def setShowUndoRedoActions(showUndoRedoActions: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.suppressReturn> property.
    * @deprecated Set the value using <Titanium.UI.TextField.suppressReturn> instead.
    */
  def setSuppressReturn(suppressReturn: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.textAlign> property.
    * @deprecated Set the value using <Titanium.UI.TextField.textAlign> instead.
    */
  def setTextAlign(textAlign: String): Unit = js.native
  def setTextAlign(textAlign: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextField.value> property.
    * @deprecated Set the value using <Titanium.UI.TextField.value> instead.
    */
  def setValue(value: String): Unit = js.native
  
  def setVerticalAlign(verticalAlign: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TextField.verticalAlign> property.
    * @deprecated Set the value using <Titanium.UI.TextField.verticalAlign> instead.
    */
  def setVerticalAlign(verticalAlign: Double): Unit = js.native
  
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
}
