package typings.titanium.Titanium.UI

import typings.titanium.Font
import typings.titanium.ViewPadding
import typings.titanium.textAreaSelectedParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A multiline text field that supports editing and scrolling.
		 */
@js.native
trait TextArea extends View {
  /**
  			 * Determines the appearance of the keyboard displayed when this text area is focused.
  			 */
  var appearance: Double = js.native
  /**
  			 * Hint text attributed string.
  			 */
  var attributedHintText: AttributedString = js.native
  /**
  			 * TextArea attributed string.
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
  			 * Determines whether to automatically correct text entered into this text area.
  			 */
  var autocorrect: Boolean = js.native
  /**
  			 * Sets the autofill type for the text area.
  			 */
  var autofillType: String = js.native
  /**
  			 * Determines whether the value of this text area should be cleared when it is focused.
  			 */
  var clearOnEdit: Boolean = js.native
  /**
  			 * Color of the text in this text area, as a color name or hex triplet.
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
  			 * area.
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
  			 * Specifies if the text area should allow user interaction with the given URL in the given range of text.
  			 */
  var handleLinks: Boolean = js.native
  /**
  			 * Hint text to display when the field is empty.
  			 */
  var hintText: String = js.native
  /**
  			 * Color of hint text that displays when field is empty.
  			 */
  var hintTextColor: String = js.native
  /**
  			 * Hint type to display on the text field.
  			 */
  var hintType: Double = js.native
  /**
  			 * Determines the appearance of the keyboard displayed when this text area is focused.
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
  			 * Keyboard type to display when this text area is focused.
  			 */
  var keyboardType: Double = js.native
  /**
  			 * Number of lines tall the text area height will be, if set.
  			 */
  var lines: Double = js.native
  /**
  			 * Maximum length of text field input.
  			 */
  var maxLength: Double = js.native
  /**
  			 * Maximum line count of text field input.
  			 */
  var maxLines: Double = js.native
  /**
  			 * Sets the left and right padding of this TextArea. The text will always be vertically centered.
  			 */
  var padding: ViewPadding = js.native
  /**
  			 * Specifies the text to display on the keyboard `Return` key when this text area is focused.
  			 */
  var returnKeyType: Double = js.native
  /**
  			 * Determines whether this text area can be scrolled.
  			 */
  var scrollable: Boolean = js.native
  /**
  			 * Controls whether the scroll-to-top gesture is effective.
  			 */
  var scrollsToTop: Boolean = js.native
  /**
  			 * Returns the currently selected text of the text area.
  			 */
  val selection: textAreaSelectedParams = js.native
  /**
  			 * Determinates if the undo and redo buttons on the left side of the keyboard should be displayed or not. Only valid on iOS9 and above. This property can only be set upon creation.
  			 */
  var showUndoRedoActions: Boolean = js.native
  /**
  			 * Determines if the return key should be suppressed during text entry.
  			 */
  var suppressReturn: Boolean = js.native
  /**
  			 * Text alignment within this text area.
  			 * This has no effect on `hintText` when `hintType` is Ti.UI.HINT_TYPE_ANIMATED.
  			 */
  var textAlign: String | Double = js.native
  /**
  			 * Value of this text area, which may be set programmatically and modified by the user.
  			 */
  var value: String = js.native
  /**
  			 * Vertical alignment within this text area.
  			 */
  var verticalAlign: Double | String = js.native
  /**
  			 * Forces this text area to lose focus.
  			 */
  def blur(): Unit = js.native
  /**
  			 * Forces this text area to gain focus.
  			 */
  def focus(): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.appearance> property.
  			 */
  def getAppearance(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.attributedHintText> property.
  			 */
  def getAttributedHintText(): AttributedString = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.attributedString> property.
  			 */
  def getAttributedString(): AttributedString = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.autoLink> property.
  			 */
  def getAutoLink(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.autocapitalization> property.
  			 */
  def getAutocapitalization(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.autocorrect> property.
  			 */
  def getAutocorrect(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.autofillType> property.
  			 */
  def getAutofillType(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.clearOnEdit> property.
  			 */
  def getClearOnEdit(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.color> property.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.editable> property.
  			 */
  def getEditable(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.ellipsize> property.
  			 */
  def getEllipsize(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.enableReturnKey> property.
  			 */
  def getEnableReturnKey(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.font> property.
  			 */
  def getFont(): Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.fullscreen> property.
  			 */
  def getFullscreen(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.handleLinks> property.
  			 */
  def getHandleLinks(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.hintText> property.
  			 */
  def getHintText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.hintTextColor> property.
  			 */
  def getHintTextColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.hintType> property.
  			 */
  def getHintType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.keyboardAppearance> property.
  			 */
  def getKeyboardAppearance(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.keyboardToolbar> property.
  			 */
  def getKeyboardToolbar(): js.Array[View] | typings.titanium.Titanium.UI.iOS.Toolbar = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.keyboardToolbarColor> property.
  			 */
  def getKeyboardToolbarColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.keyboardToolbarHeight> property.
  			 */
  def getKeyboardToolbarHeight(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.keyboardType> property.
  			 */
  def getKeyboardType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.lines> property.
  			 */
  def getLines(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.maxLength> property.
  			 */
  def getMaxLength(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.maxLines> property.
  			 */
  def getMaxLines(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.padding> property.
  			 */
  def getPadding(): ViewPadding = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.returnKeyType> property.
  			 */
  def getReturnKeyType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.scrollable> property.
  			 */
  def getScrollable(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.scrollsToTop> property.
  			 */
  def getScrollsToTop(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.selection> property.
  			 */
  def getSelection(): textAreaSelectedParams = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.showUndoRedoActions> property.
  			 */
  def getShowUndoRedoActions(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.suppressReturn> property.
  			 */
  def getSuppressReturn(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.textAlign> property.
  			 */
  def getTextAlign(): String | Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.value> property.
  			 */
  def getValue(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.verticalAlign> property.
  			 */
  def getVerticalAlign(): Double | String = js.native
  /**
  			 * Returns `true` if this text area contains text.
  			 */
  def hasText(): Boolean = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.appearance> property.
  			 */
  def setAppearance(appearance: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.attributedHintText> property.
  			 */
  def setAttributedHintText(attributedHintText: AttributedString): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.attributedString> property.
  			 */
  def setAttributedString(attributedString: AttributedString): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.autoLink> property.
  			 */
  def setAutoLink(autoLink: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.autocapitalization> property.
  			 */
  def setAutocapitalization(autocapitalization: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.autocorrect> property.
  			 */
  def setAutocorrect(autocorrect: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.autofillType> property.
  			 */
  def setAutofillType(autofillType: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.clearOnEdit> property.
  			 */
  def setClearOnEdit(clearOnEdit: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.color> property.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.editable> property.
  			 */
  def setEditable(editable: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.ellipsize> property.
  			 */
  def setEllipsize(ellipsize: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.enableReturnKey> property.
  			 */
  def setEnableReturnKey(enableReturnKey: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.font> property.
  			 */
  def setFont(font: Font): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.fullscreen> property.
  			 */
  def setFullscreen(fullscreen: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.handleLinks> property.
  			 */
  def setHandleLinks(handleLinks: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.hintText> property.
  			 */
  def setHintText(hintText: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.hintTextColor> property.
  			 */
  def setHintTextColor(hintTextColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.hintType> property.
  			 */
  def setHintType(hintType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.keyboardAppearance> property.
  			 */
  def setKeyboardAppearance(keyboardAppearance: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.keyboardToolbar> property.
  			 */
  def setKeyboardToolbar(keyboardToolbar: js.Array[_]): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.keyboardToolbar> property.
  			 */
  def setKeyboardToolbar(keyboardToolbar: typings.titanium.Titanium.UI.iOS.Toolbar): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.keyboardToolbarColor> property.
  			 */
  def setKeyboardToolbarColor(keyboardToolbarColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.keyboardToolbarHeight> property.
  			 */
  def setKeyboardToolbarHeight(keyboardToolbarHeight: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.keyboardType> property.
  			 */
  def setKeyboardType(keyboardType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.lines> property.
  			 */
  def setLines(lines: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.maxLength> property.
  			 */
  def setMaxLength(maxLength: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.maxLines> property.
  			 */
  def setMaxLines(maxLines: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.padding> property.
  			 */
  def setPadding(padding: ViewPadding): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.returnKeyType> property.
  			 */
  def setReturnKeyType(returnKeyType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.scrollable> property.
  			 */
  def setScrollable(scrollable: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.scrollsToTop> property.
  			 */
  def setScrollsToTop(scrollsToTop: Boolean): Unit = js.native
  /**
  			 * Selects the text in range (start, end).
  			 */
  def setSelection(start: Double, end: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.showUndoRedoActions> property.
  			 */
  def setShowUndoRedoActions(showUndoRedoActions: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.suppressReturn> property.
  			 */
  def setSuppressReturn(suppressReturn: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.textAlign> property.
  			 */
  def setTextAlign(textAlign: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.textAlign> property.
  			 */
  def setTextAlign(textAlign: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.value> property.
  			 */
  def setValue(value: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: Double): Unit = js.native
}

