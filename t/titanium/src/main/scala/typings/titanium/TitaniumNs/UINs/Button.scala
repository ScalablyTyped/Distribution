package typings.titanium.TitaniumNs.UINs

import typings.titanium.Font
import typings.titanium.TitaniumNs.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A button widget that has four states: normal, disabled, focused and selected.
		 */
@js.native
trait Button extends View {
  /**
  			 * Specify an attributed string for the label.
  			 */
  var attributedString: AttributedString = js.native
  /**
  			 * Default button text color, as a color name or hex triplet.
  			 */
  var color: String = js.native
  /**
  			 * Text color of the button in its disabled state, as a color name or hex triplet.
  			 */
  var disabledColor: String = js.native
  /**
  			 * Set to `true` to enable the button, `false` to disable the button.
  			 */
  var enabled: Boolean = js.native
  /**
  			 * Font to use for the button text.
  			 */
  var font: Font = js.native
  /**
  			 * Image to display on the button, specified as a local path, URL or a `Blob`.
  			 */
  var image: String | Blob = js.native
  /**
  			 * Button text color used to indicate the selected state, as a color name or hex triplet.
  			 */
  var selectedColor: String = js.native
  /**
  			 * Shadow color of the [title](Titanium.UI.Button.title), as a color name or hex triplet.
  			 */
  var shadowColor: String = js.native
  /**
  			 * Shadow offset of the [title](Titanium.UI.Button.title), as a dictionary with the properties `x` and `y`.
  			 */
  var shadowOffset: js.Any = js.native
  /**
  			 * Shadow radius of the [title](Titanium.UI.Button.title).
  			 */
  var shadowRadius: Double = js.native
  /**
  			 * Style constant for the button, as defined in <Titanium.UI.iOS.SystemButtonStyle>.
  			 */
  var style: Double = js.native
  /**
  			 * Specifies an iOS system button appearance, as defined in <Titanium.UI.iOS.SystemButton>.
  			 */
  var systemButton: Double = js.native
  /**
  			 * Text alignment, specified using one of the <Titanium.UI> text alignment constants.
  			 */
  var textAlign: String | Double = js.native
  /**
  			 * Button title.
  			 */
  var title: String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the button title.
  			 */
  var titleid: String = js.native
  /**
  			 * Vertical alignment for the text field, specified using one of the
  			 * vertical alignment constants from <Titanium.UI>.
  			 */
  var verticalAlign: Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.attributedString> property.
  			 */
  def getAttributedString(): AttributedString = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.color> property.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.disabledColor> property.
  			 */
  def getDisabledColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.enabled> property.
  			 */
  def getEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.font> property.
  			 */
  def getFont(): Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.image> property.
  			 */
  def getImage(): String | Blob = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.selectedColor> property.
  			 */
  def getSelectedColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.shadowColor> property.
  			 */
  def getShadowColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.shadowOffset> property.
  			 */
  def getShadowOffset(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.shadowRadius> property.
  			 */
  def getShadowRadius(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.style> property.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.systemButton> property.
  			 */
  def getSystemButton(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.textAlign> property.
  			 */
  def getTextAlign(): String | Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.title> property.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.titleid> property.
  			 */
  def getTitleid(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.verticalAlign> property.
  			 */
  def getVerticalAlign(): Double | String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.attributedString> property.
  			 */
  def setAttributedString(attributedString: AttributedString): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.color> property.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.disabledColor> property.
  			 */
  def setDisabledColor(disabledColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.enabled> property.
  			 */
  def setEnabled(enabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.font> property.
  			 */
  def setFont(font: Font): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.image> property.
  			 */
  def setImage(image: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.image> property.
  			 */
  def setImage(image: Blob): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.selectedColor> property.
  			 */
  def setSelectedColor(selectedColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.shadowColor> property.
  			 */
  def setShadowColor(shadowColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.shadowOffset> property.
  			 */
  def setShadowOffset(shadowOffset: js.Any): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.shadowRadius> property.
  			 */
  def setShadowRadius(shadowRadius: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.style> property.
  			 */
  def setStyle(style: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.systemButton> property.
  			 */
  def setSystemButton(systemButton: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.textAlign> property.
  			 */
  def setTextAlign(textAlign: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.textAlign> property.
  			 */
  def setTextAlign(textAlign: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.title> property.
  			 */
  def setTitle(title: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.titleid> property.
  			 */
  def setTitleid(titleid: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: Double): Unit = js.native
}

