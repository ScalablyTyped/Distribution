package typings.titanium.Titanium.UI

import typings.titanium.AnimatedOptions
import typings.titanium.titaniumStrings.`return`
import typings.titanium.titaniumStrings.blur
import typings.titanium.titaniumStrings.bookmark
import typings.titanium.titaniumStrings.cancel
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
import scala.scalajs.js.annotation._

/**
		 * A specialized text field for entering search text.
		 */
@JSGlobal("Titanium.UI.SearchBar")
@js.native
class SearchBar () extends View {
  /**
  			 * Determines how text is capitalized during typing.
  			 */
  var autocapitalization: Double = js.native
  /**
  			 * Determines whether the text in the search bar is autocorrected during typing.
  			 */
  var autocorrect: Boolean = js.native
  /**
  			 * Bar color of the search bar view, as a color name or hex triplet.
  			 */
  var barColor: String = js.native
  /**
  			 * The title of the cancel button when the search bar field is focused.
  			 */
  var cancelButtonTitle: String = js.native
  /**
  			 * Color of the text in this text field, as a color name or hex triplet.
  			 */
  var color: String = js.native
  /**
  			 * Background image of the text field in disabled state, specified as a local file path or URL.
  			 */
  var fieldBackgroundDisabledImage: String = js.native
  /**
  			 * Background image of the text field, specified as a local file path or URL.
  			 */
  var fieldBackgroundImage: String = js.native
  /**
  			 * Text to show when the search bar field is not focused.
  			 */
  var hintText: String = js.native
  /**
  			 * Hint text color to display when the field is empty.
  			 */
  var hintTextColor: String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the
  			 * [hintText](Titanium.UI.SearchBar.hintText) property.
  			 */
  var hinttextid: String = js.native
  /**
  			 * Determines the appearance of the keyboard to be displayed the field is focused.
  			 */
  var keyboardAppearance: Double = js.native
  /**
  			 * Keyboard type constant to use when the field is focused.
  			 */
  var keyboardType: Double = js.native
  /**
  			 * Single line of text displayed at the top of the search bar.
  			 */
  var prompt: String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the
  			 * [prompt](Titanium.UI.SearchBar.prompt) property.
  			 */
  var promptid: String = js.native
  /**
  			 * Determines whether the bookmark button is displayed.
  			 */
  var showBookmark: Boolean = js.native
  /**
  			 * Determines whether the cancel button is displayed.
  			 */
  var showCancel: Boolean = js.native
  /**
  			 * Determines the style of the search bar.
  			 */
  var style: Double = js.native
  /**
  			 * Value of the search bar.
  			 */
  var value: String = js.native
  /**
  			 * Adds the specified callback as an event listener for the named event.
  			 */
  @JSName("addEventListener")
  def addEventListener_blur(name: blur, callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchBarBlurEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_bookmark(
    name: bookmark,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchBarBookmarkEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cancel(
    name: cancel,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchBarCancelEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchBarChangeEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_return(
    name: `return`,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchBarReturnEvent, Unit]
  ): Unit = js.native
  /**
  			 * Causes the search bar to lose focus.
  			 */
  def blur(): Unit = js.native
  /**
  			 * Fires a synthesized event to any registered listeners.
  			 */
  @JSName("fireEvent")
  def fireEvent_blur(name: blur): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_blur(name: blur, event: SearchBarBlurEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_bookmark(name: bookmark): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_bookmark(name: bookmark, event: SearchBarBookmarkEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_cancel(name: cancel): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_cancel(name: cancel, event: SearchBarCancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_change(name: change, event: SearchBarChangeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: SearchBarClickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_dblclick(name: dblclick, event: SearchBarDblclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_doubletap(name: doubletap, event: SearchBarDoubletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_focus(name: focus, event: SearchBarFocusEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_keypressed(name: keypressed, event: SearchBarKeypressedEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longclick(name: longclick, event: SearchBarLongclickEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_longpress(name: longpress, event: SearchBarLongpressEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_pinch(name: pinch, event: SearchBarPinchEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_postlayout(name: postlayout, event: SearchBarPostlayoutEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_return(name: `return`): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_return(name: `return`, event: SearchBarReturnEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_singletap(name: singletap, event: SearchBarSingletapEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_swipe(name: swipe, event: SearchBarSwipeEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchcancel(name: touchcancel, event: SearchBarTouchcancelEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchend(name: touchend, event: SearchBarTouchendEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchmove(name: touchmove, event: SearchBarTouchmoveEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_touchstart(name: touchstart, event: SearchBarTouchstartEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_twofingertap(name: twofingertap, event: SearchBarTwofingertapEvent): Unit = js.native
  /**
  			 * Causes the search bar to gain focus.
  			 */
  def focus(): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.autocapitalization> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.autocapitalization> instead.
  			 */
  def getAutocapitalization(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.autocorrect> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.autocorrect> instead.
  			 */
  def getAutocorrect(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.barColor> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.barColor> instead.
  			 */
  def getBarColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.cancelButtonTitle> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.cancelButtonTitle> instead.
  			 */
  def getCancelButtonTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.color> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.color> instead.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.fieldBackgroundDisabledImage> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.fieldBackgroundDisabledImage> instead.
  			 */
  def getFieldBackgroundDisabledImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.fieldBackgroundImage> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.fieldBackgroundImage> instead.
  			 */
  def getFieldBackgroundImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.hintText> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.hintText> instead.
  			 */
  def getHintText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.hintTextColor> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.hintTextColor> instead.
  			 */
  def getHintTextColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.hinttextid> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.hinttextid> instead.
  			 */
  def getHinttextid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.keyboardAppearance> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.keyboardAppearance> instead.
  			 */
  def getKeyboardAppearance(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.keyboardType> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.keyboardType> instead.
  			 */
  def getKeyboardType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.prompt> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.prompt> instead.
  			 */
  def getPrompt(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.promptid> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.promptid> instead.
  			 */
  def getPromptid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.showBookmark> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.showBookmark> instead.
  			 */
  def getShowBookmark(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.showCancel> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.showCancel> instead.
  			 */
  def getShowCancel(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.style> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.style> instead.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.value> property.
  			 * @deprecated Access <Titanium.UI.SearchBar.value> instead.
  			 */
  def getValue(): String = js.native
  /**
  			 * Removes the specified callback as an event listener for the named event.
  			 */
  @JSName("removeEventListener")
  def removeEventListener_blur(name: blur, callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchBarBlurEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_bookmark(
    name: bookmark,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchBarBookmarkEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cancel(
    name: cancel,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchBarCancelEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    name: change,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchBarChangeEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_return(
    name: `return`,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ SearchBarReturnEvent, Unit]
  ): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.autocapitalization> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.autocapitalization> instead.
  			 */
  def setAutocapitalization(autocapitalization: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.autocorrect> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.autocorrect> instead.
  			 */
  def setAutocorrect(autocorrect: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.barColor> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.barColor> instead.
  			 */
  def setBarColor(barColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.cancelButtonTitle> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.cancelButtonTitle> instead.
  			 */
  def setCancelButtonTitle(cancelButtonTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.color> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.color> instead.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.fieldBackgroundDisabledImage> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.fieldBackgroundDisabledImage> instead.
  			 */
  def setFieldBackgroundDisabledImage(fieldBackgroundDisabledImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.fieldBackgroundImage> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.fieldBackgroundImage> instead.
  			 */
  def setFieldBackgroundImage(fieldBackgroundImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.hintText> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.hintText> instead.
  			 */
  def setHintText(hintText: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.hintTextColor> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.hintTextColor> instead.
  			 */
  def setHintTextColor(hintTextColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.hinttextid> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.hinttextid> instead.
  			 */
  def setHinttextid(hinttextid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.keyboardAppearance> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.keyboardAppearance> instead.
  			 */
  def setKeyboardAppearance(keyboardAppearance: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.keyboardType> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.keyboardType> instead.
  			 */
  def setKeyboardType(keyboardType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.prompt> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.prompt> instead.
  			 */
  def setPrompt(prompt: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.promptid> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.promptid> instead.
  			 */
  def setPromptid(promptid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.showBookmark> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.showBookmark> instead.
  			 */
  def setShowBookmark(showBookmark: Boolean): Unit = js.native
  /**
  			 * Shows or hides the cancel button.
  			 */
  def setShowCancel(showCancel: Boolean): Unit = js.native
  def setShowCancel(showCancel: Boolean, options: AnimatedOptions): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.style> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.style> instead.
  			 */
  def setStyle(style: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.value> property.
  			 * @deprecated Set the value using <Titanium.UI.SearchBar.value> instead.
  			 */
  def setValue(value: String): Unit = js.native
}

