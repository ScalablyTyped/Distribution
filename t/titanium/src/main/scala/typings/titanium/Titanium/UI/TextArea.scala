package typings.titanium.Titanium.UI

import typings.titanium.Font
import typings.titanium.Padding
import typings.titanium.textAreaSelectedParams
import typings.titanium.titaniumStrings.`return`
import typings.titanium.titaniumStrings.blur
import typings.titanium.titaniumStrings.change
import typings.titanium.titaniumStrings.click
import typings.titanium.titaniumStrings.dblclick
import typings.titanium.titaniumStrings.doubletap
import typings.titanium.titaniumStrings.focus
import typings.titanium.titaniumStrings.keypressed
import typings.titanium.titaniumStrings.link
import typings.titanium.titaniumStrings.longclick
import typings.titanium.titaniumStrings.longpress
import typings.titanium.titaniumStrings.pinch
import typings.titanium.titaniumStrings.postlayout
import typings.titanium.titaniumStrings.selected
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
  * A multiline text field that supports editing and scrolling.
  */
@js.native
trait TextArea extends View {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_blur(name: blur, callback: js.ThisFunction1[/* this */ this.type, /* event */ TextAreaBlurEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TextAreaChangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_link(name: link, callback: js.ThisFunction1[/* this */ this.type, /* event */ TextAreaLinkEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_return(
    name: `return`,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TextAreaReturnEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_selected(
    name: selected,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TextAreaSelectedEvent, Unit]
  ): Unit = js.native
  
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
    * Forces this text area to lose focus.
    */
  def blur(): Unit = js.native
  
  /**
    * Determines whether the value of this text area should be cleared when it is focused.
    */
  var clearOnEdit: Boolean = js.native
  
  /**
    * Color of the text in this text area, as a color name or hex triplet.
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
    * area.
    */
  var enableReturnKey: Boolean = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_blur(name: blur): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_blur(name: blur, event: TextAreaBlurEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: TextAreaChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: TextAreaClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: TextAreaDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: TextAreaDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: TextAreaFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: TextAreaKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_link(name: link): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_link(name: link, event: TextAreaLinkEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: TextAreaLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: TextAreaLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: TextAreaPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: TextAreaPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_return(name: `return`): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_return(name: `return`, event: TextAreaReturnEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_selected(name: selected): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_selected(name: selected, event: TextAreaSelectedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: TextAreaSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: TextAreaSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: TextAreaTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: TextAreaTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: TextAreaTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: TextAreaTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: TextAreaTwofingertapEvent): Unit = js.native
  
  /**
    * Forces this text area to gain focus.
    */
  def focus(): Unit = js.native
  
  /**
    * Determines whether this TextArea has focus.
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
    * Gets the value of the <Titanium.UI.TextArea.attributedHintText> property.
    * @deprecated Access <Titanium.UI.TextArea.attributedHintText> instead.
    */
  def getAttributedHintText(): AttributedString = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.attributedString> property.
    * @deprecated Access <Titanium.UI.TextArea.attributedString> instead.
    */
  def getAttributedString(): AttributedString = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.autoLink> property.
    * @deprecated Access <Titanium.UI.TextArea.autoLink> instead.
    */
  def getAutoLink(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.autocapitalization> property.
    * @deprecated Access <Titanium.UI.TextArea.autocapitalization> instead.
    */
  def getAutocapitalization(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.autocorrect> property.
    * @deprecated Access <Titanium.UI.TextArea.autocorrect> instead.
    */
  def getAutocorrect(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.autofillType> property.
    * @deprecated Access <Titanium.UI.TextArea.autofillType> instead.
    */
  def getAutofillType(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.clearOnEdit> property.
    * @deprecated Access <Titanium.UI.TextArea.clearOnEdit> instead.
    */
  def getClearOnEdit(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.color> property.
    * @deprecated Access <Titanium.UI.TextArea.color> instead.
    */
  def getColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.editable> property.
    * @deprecated Access <Titanium.UI.TextArea.editable> instead.
    */
  def getEditable(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.ellipsize> property.
    * @deprecated Access <Titanium.UI.TextArea.ellipsize> instead.
    */
  def getEllipsize(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.enableReturnKey> property.
    * @deprecated Access <Titanium.UI.TextArea.enableReturnKey> instead.
    */
  def getEnableReturnKey(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.focused> property.
    * @deprecated Access <Titanium.UI.TextArea.focused> instead.
    */
  def getFocused(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.font> property.
    * @deprecated Access <Titanium.UI.TextArea.font> instead.
    */
  def getFont(): Font = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.fullscreen> property.
    * @deprecated Access <Titanium.UI.TextArea.fullscreen> instead.
    */
  def getFullscreen(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.handleLinks> property.
    * @deprecated Access <Titanium.UI.TextArea.handleLinks> instead.
    */
  def getHandleLinks(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.hintText> property.
    * @deprecated Access <Titanium.UI.TextArea.hintText> instead.
    */
  def getHintText(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.hintTextColor> property.
    * @deprecated Access <Titanium.UI.TextArea.hintTextColor> instead.
    */
  def getHintTextColor(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.hintType> property.
    * @deprecated Access <Titanium.UI.TextArea.hintType> instead.
    */
  def getHintType(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.keyboardAppearance> property.
    * @deprecated Access <Titanium.UI.TextArea.keyboardAppearance> instead.
    */
  def getKeyboardAppearance(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.keyboardToolbar> property.
    * @deprecated Access <Titanium.UI.TextArea.keyboardToolbar> instead.
    */
  def getKeyboardToolbar(): js.Array[View] | Toolbar | typings.titanium.Titanium.UI.iOS.Toolbar = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.keyboardToolbarColor> property.
    * @deprecated Access <Titanium.UI.TextArea.keyboardToolbarColor> instead.
    */
  def getKeyboardToolbarColor(): String | Color = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.keyboardToolbarHeight> property.
    * @deprecated Access <Titanium.UI.TextArea.keyboardToolbarHeight> instead.
    */
  def getKeyboardToolbarHeight(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.keyboardType> property.
    * @deprecated Access <Titanium.UI.TextArea.keyboardType> instead.
    */
  def getKeyboardType(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.lines> property.
    * @deprecated Access <Titanium.UI.TextArea.lines> instead.
    */
  def getLines(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.maxLength> property.
    * @deprecated Access <Titanium.UI.TextArea.maxLength> instead.
    */
  def getMaxLength(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.maxLines> property.
    * @deprecated Access <Titanium.UI.TextArea.maxLines> instead.
    */
  def getMaxLines(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.padding> property.
    * @deprecated Access <Titanium.UI.TextArea.padding> instead.
    */
  def getPadding(): Padding = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.returnKeyType> property.
    * @deprecated Access <Titanium.UI.TextArea.returnKeyType> instead.
    */
  def getReturnKeyType(): Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.scrollable> property.
    * @deprecated Access <Titanium.UI.TextArea.scrollable> instead.
    */
  def getScrollable(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.scrollsToTop> property.
    * @deprecated Access <Titanium.UI.TextArea.scrollsToTop> instead.
    */
  def getScrollsToTop(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.selection> property.
    * @deprecated Access <Titanium.UI.TextArea.selection> instead.
    */
  def getSelection(): textAreaSelectedParams = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.showUndoRedoActions> property.
    * @deprecated Access <Titanium.UI.TextArea.showUndoRedoActions> instead.
    */
  def getShowUndoRedoActions(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.suppressReturn> property.
    * @deprecated Access <Titanium.UI.TextArea.suppressReturn> instead.
    */
  def getSuppressReturn(): Boolean = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.textAlign> property.
    * @deprecated Access <Titanium.UI.TextArea.textAlign> instead.
    */
  def getTextAlign(): String | Double = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.value> property.
    * @deprecated Access <Titanium.UI.TextArea.value> instead.
    */
  def getValue(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.TextArea.verticalAlign> property.
    * @deprecated Access <Titanium.UI.TextArea.verticalAlign> instead.
    */
  def getVerticalAlign(): Double | String = js.native
  
  /**
    * Specifies if the text area should allow user interaction with the given URL in the given range of text.
    */
  var handleLinks: Boolean = js.native
  
  /**
    * Returns `true` if this text area contains text.
    */
  def hasText(): Boolean = js.native
  
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
  var padding: Padding = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_blur(name: blur, callback: js.ThisFunction1[/* this */ this.type, /* event */ TextAreaBlurEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TextAreaChangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_link(name: link, callback: js.ThisFunction1[/* this */ this.type, /* event */ TextAreaLinkEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_return(
    name: `return`,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TextAreaReturnEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_selected(
    name: selected,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ TextAreaSelectedEvent, Unit]
  ): Unit = js.native
  
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
    * Sets the value of the <Titanium.UI.TextArea.attributedHintText> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.attributedHintText> instead.
    */
  def setAttributedHintText(attributedHintText: AttributedString): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.attributedString> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.attributedString> instead.
    */
  def setAttributedString(attributedString: AttributedString): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.autoLink> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.autoLink> instead.
    */
  def setAutoLink(autoLink: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.autocapitalization> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.autocapitalization> instead.
    */
  def setAutocapitalization(autocapitalization: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.autocorrect> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.autocorrect> instead.
    */
  def setAutocorrect(autocorrect: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.autofillType> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.autofillType> instead.
    */
  def setAutofillType(autofillType: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.clearOnEdit> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.clearOnEdit> instead.
    */
  def setClearOnEdit(clearOnEdit: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.color> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.color> instead.
    */
  def setColor(color: String): Unit = js.native
  def setColor(color: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.editable> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.editable> instead.
    */
  def setEditable(editable: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.ellipsize> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.ellipsize> instead.
    */
  def setEllipsize(ellipsize: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.enableReturnKey> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.enableReturnKey> instead.
    */
  def setEnableReturnKey(enableReturnKey: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.font> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.font> instead.
    */
  def setFont(font: Font): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.fullscreen> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.fullscreen> instead.
    */
  def setFullscreen(fullscreen: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.handleLinks> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.handleLinks> instead.
    */
  def setHandleLinks(handleLinks: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.hintText> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.hintText> instead.
    */
  def setHintText(hintText: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.hintTextColor> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.hintTextColor> instead.
    */
  def setHintTextColor(hintTextColor: String): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.hintType> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.hintType> instead.
    */
  def setHintType(hintType: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.keyboardAppearance> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.keyboardAppearance> instead.
    */
  def setKeyboardAppearance(keyboardAppearance: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.keyboardToolbar> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.keyboardToolbar> instead.
    */
  def setKeyboardToolbar(keyboardToolbar: js.Array[View]): Unit = js.native
  def setKeyboardToolbar(keyboardToolbar: Toolbar): Unit = js.native
  def setKeyboardToolbar(keyboardToolbar: typings.titanium.Titanium.UI.iOS.Toolbar): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.keyboardToolbarColor> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.keyboardToolbarColor> instead.
    */
  def setKeyboardToolbarColor(keyboardToolbarColor: String): Unit = js.native
  def setKeyboardToolbarColor(keyboardToolbarColor: Color): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.keyboardToolbarHeight> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.keyboardToolbarHeight> instead.
    */
  def setKeyboardToolbarHeight(keyboardToolbarHeight: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.keyboardType> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.keyboardType> instead.
    */
  def setKeyboardType(keyboardType: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.lines> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.lines> instead.
    */
  def setLines(lines: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.maxLength> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.maxLength> instead.
    */
  def setMaxLength(maxLength: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.maxLines> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.maxLines> instead.
    */
  def setMaxLines(maxLines: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.padding> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.padding> instead.
    */
  def setPadding(padding: Padding): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.returnKeyType> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.returnKeyType> instead.
    */
  def setReturnKeyType(returnKeyType: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.scrollable> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.scrollable> instead.
    */
  def setScrollable(scrollable: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.scrollsToTop> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.scrollsToTop> instead.
    */
  def setScrollsToTop(scrollsToTop: Boolean): Unit = js.native
  
  /**
    * Selects the text in range (start, end).
    */
  def setSelection(start: Double, end: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.showUndoRedoActions> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.showUndoRedoActions> instead.
    */
  def setShowUndoRedoActions(showUndoRedoActions: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.suppressReturn> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.suppressReturn> instead.
    */
  def setSuppressReturn(suppressReturn: Boolean): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.textAlign> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.textAlign> instead.
    */
  def setTextAlign(textAlign: String): Unit = js.native
  def setTextAlign(textAlign: Double): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.TextArea.value> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.value> instead.
    */
  def setValue(value: String): Unit = js.native
  
  def setVerticalAlign(verticalAlign: String): Unit = js.native
  /**
    * Sets the value of the <Titanium.UI.TextArea.verticalAlign> property.
    * @deprecated Set the value using <Titanium.UI.TextArea.verticalAlign> instead.
    */
  def setVerticalAlign(verticalAlign: Double): Unit = js.native
  
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
}
