package typings.titanium.TitaniumNs.UINs

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
  			 * Causes the search bar to lose focus.
  			 */
  def blur(): Unit = js.native
  /**
  			 * Causes the search bar to gain focus.
  			 */
  def focus(): Unit = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.autocapitalization> property.
  			 */
  def getAutocapitalization(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.autocorrect> property.
  			 */
  def getAutocorrect(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.barColor> property.
  			 */
  def getBarColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.cancelButtonTitle> property.
  			 */
  def getCancelButtonTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.color> property.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.fieldBackgroundDisabledImage> property.
  			 */
  def getFieldBackgroundDisabledImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.fieldBackgroundImage> property.
  			 */
  def getFieldBackgroundImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.hintText> property.
  			 */
  def getHintText(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.hintTextColor> property.
  			 */
  def getHintTextColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.hinttextid> property.
  			 */
  def getHinttextid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.keyboardAppearance> property.
  			 */
  def getKeyboardAppearance(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.keyboardType> property.
  			 */
  def getKeyboardType(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.prompt> property.
  			 */
  def getPrompt(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.promptid> property.
  			 */
  def getPromptid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.showBookmark> property.
  			 */
  def getShowBookmark(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.showCancel> property.
  			 */
  def getShowCancel(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.style> property.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.SearchBar.value> property.
  			 */
  def getValue(): String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.autocapitalization> property.
  			 */
  def setAutocapitalization(autocapitalization: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.autocorrect> property.
  			 */
  def setAutocorrect(autocorrect: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.barColor> property.
  			 */
  def setBarColor(barColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.cancelButtonTitle> property.
  			 */
  def setCancelButtonTitle(cancelButtonTitle: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.color> property.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.fieldBackgroundDisabledImage> property.
  			 */
  def setFieldBackgroundDisabledImage(fieldBackgroundDisabledImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.fieldBackgroundImage> property.
  			 */
  def setFieldBackgroundImage(fieldBackgroundImage: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.hintText> property.
  			 */
  def setHintText(hintText: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.hintTextColor> property.
  			 */
  def setHintTextColor(hintTextColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.hinttextid> property.
  			 */
  def setHinttextid(hinttextid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.keyboardAppearance> property.
  			 */
  def setKeyboardAppearance(keyboardAppearance: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.keyboardType> property.
  			 */
  def setKeyboardType(keyboardType: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.prompt> property.
  			 */
  def setPrompt(prompt: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.promptid> property.
  			 */
  def setPromptid(promptid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.showBookmark> property.
  			 */
  def setShowBookmark(showBookmark: Boolean): Unit = js.native
  /**
  			 * Shows or hides the cancel button.
  			 */
  def setShowCancel(showCancel: Boolean): Unit = js.native
  def setShowCancel(showCancel: Boolean, animated: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.style> property.
  			 */
  def setStyle(style: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.SearchBar.value> property.
  			 */
  def setValue(value: String): Unit = js.native
}

