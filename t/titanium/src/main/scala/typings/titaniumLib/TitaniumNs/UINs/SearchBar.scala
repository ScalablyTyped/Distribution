package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A specialized text field for entering search text.
		 */
@js.native
trait SearchBar extends View {
  /**
  			 * Determines how text is capitalized during typing.
  			 */
  var autocapitalization: scala.Double = js.native
  /**
  			 * Determines whether the text in the search bar is autocorrected during typing.
  			 */
  var autocorrect: scala.Boolean = js.native
  /**
  			 * Bar color of the search bar view, as a color name or hex triplet.
  			 */
  var barColor: java.lang.String = js.native
  /**
  			 * The title of the cancel button when the search bar field is focused.
  			 */
  var cancelButtonTitle: java.lang.String = js.native
  /**
  			 * Color of the text in this text field, as a color name or hex triplet.
  			 */
  var color: java.lang.String = js.native
  /**
  			 * Background image of the text field in disabled state, specified as a local file path or URL.
  			 */
  var fieldBackgroundDisabledImage: java.lang.String = js.native
  /**
  			 * Background image of the text field, specified as a local file path or URL.
  			 */
  var fieldBackgroundImage: java.lang.String = js.native
  /**
  			 * Text to show when the search bar field is not focused.
  			 */
  var hintText: java.lang.String = js.native
  /**
  			 * Hint text color to display when the field is empty.
  			 */
  var hintTextColor: java.lang.String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the
  			 * [hintText](Titanium.UI.SearchBar.hintText) property.
  			 */
  var hinttextid: java.lang.String = js.native
  /**
  			 * Determines the appearance of the keyboard to be displayed the field is focused.
  			 */
  var keyboardAppearance: scala.Double = js.native
  /**
  			 * Keyboard type constant to use when the field is focused.
  			 */
  var keyboardType: scala.Double = js.native
  /**
  			 * Single line of text displayed at the top of the search bar.
  			 */
  var prompt: java.lang.String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the
  			 * [prompt](Titanium.UI.SearchBar.prompt) property.
  			 */
  var promptid: java.lang.String = js.native
  /**
  			 * Determines whether the bookmark button is displayed.
  			 */
  var showBookmark: scala.Boolean = js.native
  /**
  			 * Determines whether the cancel button is displayed.
  			 */
  var showCancel: scala.Boolean = js.native
  /**
  			 * Determines the style of the search bar.
  			 */
  var style: scala.Double = js.native
  /**
  			 * Value of the search bar.
  			 */
  var value: java.lang.String = js.native
  /**
  			 * Causes the search bar to lose focus.
  			 */
  def blur(): scala.Unit = js.native
  /**
  			 * Causes the search bar to gain focus.
  			 */
  def focus(): scala.Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.autocapitalization> property.
  			 */
  def getAutocapitalization(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.autocorrect> property.
  			 */
  def getAutocorrect(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.barColor> property.
  			 */
  def getBarColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.cancelButtonTitle> property.
  			 */
  def getCancelButtonTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.color> property.
  			 */
  def getColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.fieldBackgroundDisabledImage> property.
  			 */
  def getFieldBackgroundDisabledImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.fieldBackgroundImage> property.
  			 */
  def getFieldBackgroundImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.hintText> property.
  			 */
  def getHintText(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.hintTextColor> property.
  			 */
  def getHintTextColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.hinttextid> property.
  			 */
  def getHinttextid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.keyboardAppearance> property.
  			 */
  def getKeyboardAppearance(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.keyboardType> property.
  			 */
  def getKeyboardType(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.prompt> property.
  			 */
  def getPrompt(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.promptid> property.
  			 */
  def getPromptid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.showBookmark> property.
  			 */
  def getShowBookmark(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.showCancel> property.
  			 */
  def getShowCancel(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.style> property.
  			 */
  def getStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.value> property.
  			 */
  def getValue(): java.lang.String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.autocapitalization> property.
  			 */
  def setAutocapitalization(autocapitalization: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.autocorrect> property.
  			 */
  def setAutocorrect(autocorrect: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.barColor> property.
  			 */
  def setBarColor(barColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.cancelButtonTitle> property.
  			 */
  def setCancelButtonTitle(cancelButtonTitle: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.color> property.
  			 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.fieldBackgroundDisabledImage> property.
  			 */
  def setFieldBackgroundDisabledImage(fieldBackgroundDisabledImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.fieldBackgroundImage> property.
  			 */
  def setFieldBackgroundImage(fieldBackgroundImage: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.hintText> property.
  			 */
  def setHintText(hintText: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.hintTextColor> property.
  			 */
  def setHintTextColor(hintTextColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.hinttextid> property.
  			 */
  def setHinttextid(hinttextid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.keyboardAppearance> property.
  			 */
  def setKeyboardAppearance(keyboardAppearance: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.keyboardType> property.
  			 */
  def setKeyboardType(keyboardType: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.prompt> property.
  			 */
  def setPrompt(prompt: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.promptid> property.
  			 */
  def setPromptid(promptid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.showBookmark> property.
  			 */
  def setShowBookmark(showBookmark: scala.Boolean): scala.Unit = js.native
  /**
  			 * Shows or hides the cancel button.
  			 */
  def setShowCancel(showCancel: scala.Boolean): scala.Unit = js.native
  def setShowCancel(showCancel: scala.Boolean, animated: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.style> property.
  			 */
  def setStyle(style: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.value> property.
  			 */
  def setValue(value: java.lang.String): scala.Unit = js.native
}

