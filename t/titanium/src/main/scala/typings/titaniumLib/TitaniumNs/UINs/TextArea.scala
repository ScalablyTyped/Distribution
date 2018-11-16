package typings
package titaniumLib.TitaniumNs.UINs

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
  var appearance: scala.Double = js.native
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
  var autoLink: scala.Double = js.native
  /**
  			 * Determines how text is capitalized during typing.
  			 */
  var autocapitalization: scala.Double = js.native
  /**
  			 * Determines whether to automatically correct text entered into this text area.
  			 */
  var autocorrect: scala.Boolean = js.native
  /**
  			 * Sets the autofill type for the text area.
  			 */
  var autofillType: java.lang.String = js.native
  /**
  			 * Determines whether the value of this text area should be cleared when it is focused.
  			 */
  var clearOnEdit: scala.Boolean = js.native
  /**
  			 * Color of the text in this text area, as a color name or hex triplet.
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
  			 * area.
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
  			 * Specifies if the text area should allow user interaction with the given URL in the given range of text.
  			 */
  var handleLinks: scala.Boolean = js.native
  /**
  			 * Hint text to display when the field is empty.
  			 */
  var hintText: java.lang.String = js.native
  /**
  			 * Color of hint text that displays when field is empty.
  			 */
  var hintTextColor: java.lang.String = js.native
  /**
  			 * Hint type to display on the text field.
  			 */
  var hintType: scala.Double = js.native
  /**
  			 * Determines the appearance of the keyboard displayed when this text area is focused.
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
  			 * Keyboard type to display when this text area is focused.
  			 */
  var keyboardType: scala.Double = js.native
  /**
  			 * Number of lines tall the text area height will be, if set.
  			 */
  var lines: scala.Double = js.native
  /**
  			 * Maximum length of text field input.
  			 */
  var maxLength: scala.Double = js.native
  /**
  			 * Maximum line count of text field input.
  			 */
  var maxLines: scala.Double = js.native
  /**
  			 * Sets the left and right padding of this TextArea. The text will always be vertically centered.
  			 */
  var padding: titaniumLib.TextAreaPadding = js.native
  /**
  			 * Specifies the text to display on the keyboard `Return` key when this text area is focused.
  			 */
  var returnKeyType: scala.Double = js.native
  /**
  			 * Determines whether this text area can be scrolled.
  			 */
  var scrollable: scala.Boolean = js.native
  /**
  			 * Controls whether the scroll-to-top gesture is effective.
  			 */
  var scrollsToTop: scala.Boolean = js.native
  /**
  			 * Returns the currently selected text of the text area.
  			 */
  val selection: titaniumLib.textAreaSelectedParams = js.native
  /**
  			 * Determinates if the undo and redo buttons on the left side of the keyboard should be displayed or not. Only valid on iOS9 and above. This property can only be set upon creation.
  			 */
  var showUndoRedoActions: scala.Boolean = js.native
  /**
  			 * Determines if the return key should be suppressed during text entry.
  			 */
  var suppressReturn: scala.Boolean = js.native
  /**
  			 * Text alignment within this text area.
  			 * This has no effect on `hintText` when `hintType` is Ti.UI.HINT_TYPE_ANIMATED.
  			 */
  var textAlign: java.lang.String | scala.Double = js.native
  /**
  			 * Value of this text area, which may be set programmatically and modified by the user.
  			 */
  var value: java.lang.String = js.native
  /**
  			 * Vertical alignment within this text area.
  			 */
  var verticalAlign: scala.Double | java.lang.String = js.native
  /**
  			 * Forces this text area to lose focus.
  			 */
  def blur(): scala.Unit = js.native
  /**
  			 * Forces this text area to gain focus.
  			 */
  def focus(): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.appearance> property.
  			 */
  def getAppearance(): scala.Double = js.native
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
  def getAutoLink(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.autocapitalization> property.
  			 */
  def getAutocapitalization(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.autocorrect> property.
  			 */
  def getAutocorrect(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.autofillType> property.
  			 */
  def getAutofillType(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.clearOnEdit> property.
  			 */
  def getClearOnEdit(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.color> property.
  			 */
  def getColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.editable> property.
  			 */
  def getEditable(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.ellipsize> property.
  			 */
  def getEllipsize(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.enableReturnKey> property.
  			 */
  def getEnableReturnKey(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.font> property.
  			 */
  def getFont(): titaniumLib.Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.fullscreen> property.
  			 */
  def getFullscreen(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.handleLinks> property.
  			 */
  def getHandleLinks(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.hintText> property.
  			 */
  def getHintText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.hintTextColor> property.
  			 */
  def getHintTextColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.hintType> property.
  			 */
  def getHintType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.keyboardAppearance> property.
  			 */
  def getKeyboardAppearance(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.keyboardToolbar> property.
  			 */
  def getKeyboardToolbar(): js.Array[View] | titaniumLib.TitaniumNs.UINs.iOSNs.Toolbar = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.keyboardToolbarColor> property.
  			 */
  def getKeyboardToolbarColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.keyboardToolbarHeight> property.
  			 */
  def getKeyboardToolbarHeight(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.keyboardType> property.
  			 */
  def getKeyboardType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.lines> property.
  			 */
  def getLines(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.maxLength> property.
  			 */
  def getMaxLength(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.maxLines> property.
  			 */
  def getMaxLines(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.padding> property.
  			 */
  def getPadding(): titaniumLib.TextAreaPadding = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.returnKeyType> property.
  			 */
  def getReturnKeyType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.scrollable> property.
  			 */
  def getScrollable(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.scrollsToTop> property.
  			 */
  def getScrollsToTop(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.selection> property.
  			 */
  def getSelection(): titaniumLib.textAreaSelectedParams = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.showUndoRedoActions> property.
  			 */
  def getShowUndoRedoActions(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.suppressReturn> property.
  			 */
  def getSuppressReturn(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.textAlign> property.
  			 */
  def getTextAlign(): java.lang.String | scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.value> property.
  			 */
  def getValue(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.TextArea.verticalAlign> property.
  			 */
  def getVerticalAlign(): scala.Double | java.lang.String = js.native
  /**
  			 * Returns `true` if this text area contains text.
  			 */
  def hasText(): scala.Boolean = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.appearance> property.
  			 */
  def setAppearance(appearance: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.attributedHintText> property.
  			 */
  def setAttributedHintText(attributedHintText: AttributedString): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.attributedString> property.
  			 */
  def setAttributedString(attributedString: AttributedString): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.autoLink> property.
  			 */
  def setAutoLink(autoLink: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.autocapitalization> property.
  			 */
  def setAutocapitalization(autocapitalization: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.autocorrect> property.
  			 */
  def setAutocorrect(autocorrect: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.autofillType> property.
  			 */
  def setAutofillType(autofillType: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.clearOnEdit> property.
  			 */
  def setClearOnEdit(clearOnEdit: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.color> property.
  			 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.editable> property.
  			 */
  def setEditable(editable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.ellipsize> property.
  			 */
  def setEllipsize(ellipsize: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.enableReturnKey> property.
  			 */
  def setEnableReturnKey(enableReturnKey: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.font> property.
  			 */
  def setFont(font: titaniumLib.Font): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.fullscreen> property.
  			 */
  def setFullscreen(fullscreen: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.handleLinks> property.
  			 */
  def setHandleLinks(handleLinks: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.hintText> property.
  			 */
  def setHintText(hintText: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.hintTextColor> property.
  			 */
  def setHintTextColor(hintTextColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.hintType> property.
  			 */
  def setHintType(hintType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.keyboardAppearance> property.
  			 */
  def setKeyboardAppearance(keyboardAppearance: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.keyboardToolbar> property.
  			 */
  def setKeyboardToolbar(keyboardToolbar: js.Array[_]): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.keyboardToolbar> property.
  			 */
  def setKeyboardToolbar(keyboardToolbar: titaniumLib.TitaniumNs.UINs.iOSNs.Toolbar): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.keyboardToolbarColor> property.
  			 */
  def setKeyboardToolbarColor(keyboardToolbarColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.keyboardToolbarHeight> property.
  			 */
  def setKeyboardToolbarHeight(keyboardToolbarHeight: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.keyboardType> property.
  			 */
  def setKeyboardType(keyboardType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.lines> property.
  			 */
  def setLines(lines: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.maxLength> property.
  			 */
  def setMaxLength(maxLength: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.maxLines> property.
  			 */
  def setMaxLines(maxLines: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.padding> property.
  			 */
  def setPadding(padding: titaniumLib.TextAreaPadding): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.returnKeyType> property.
  			 */
  def setReturnKeyType(returnKeyType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.scrollable> property.
  			 */
  def setScrollable(scrollable: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.scrollsToTop> property.
  			 */
  def setScrollsToTop(scrollsToTop: scala.Boolean): scala.Unit = js.native
  /**
  			 * Selects the text in range (start, end).
  			 */
  def setSelection(start: scala.Double, end: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.showUndoRedoActions> property.
  			 */
  def setShowUndoRedoActions(showUndoRedoActions: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.suppressReturn> property.
  			 */
  def setSuppressReturn(suppressReturn: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.textAlign> property.
  			 */
  def setTextAlign(textAlign: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.textAlign> property.
  			 */
  def setTextAlign(textAlign: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.value> property.
  			 */
  def setValue(value: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.TextArea.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: scala.Double): scala.Unit = js.native
}

