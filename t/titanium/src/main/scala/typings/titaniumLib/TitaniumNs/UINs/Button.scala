package typings
package titaniumLib.TitaniumNs.UINs

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
  var color: java.lang.String = js.native
  /**
  			 * Text color of the button in its disabled state, as a color name or hex triplet.
  			 */
  var disabledColor: java.lang.String = js.native
  /**
  			 * Set to `true` to enable the button, `false` to disable the button.
  			 */
  var enabled: scala.Boolean = js.native
  /**
  			 * Font to use for the button text.
  			 */
  var font: titaniumLib.Font = js.native
  /**
  			 * Image to display on the button, specified as a local path, URL or a `Blob`.
  			 */
  var image: java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Button text color used to indicate the selected state, as a color name or hex triplet.
  			 */
  var selectedColor: java.lang.String = js.native
  /**
  			 * Shadow color of the [title](Titanium.UI.Button.title), as a color name or hex triplet.
  			 */
  var shadowColor: java.lang.String = js.native
  /**
  			 * Shadow offset of the [title](Titanium.UI.Button.title), as a dictionary with the properties `x` and `y`.
  			 */
  var shadowOffset: js.Any = js.native
  /**
  			 * Shadow radius of the [title](Titanium.UI.Button.title).
  			 */
  var shadowRadius: scala.Double = js.native
  /**
  			 * Style constant for the button, as defined in <Titanium.UI.iOS.SystemButtonStyle>.
  			 */
  var style: scala.Double = js.native
  /**
  			 * Specifies an iOS system button appearance, as defined in <Titanium.UI.iOS.SystemButton>.
  			 */
  var systemButton: scala.Double = js.native
  /**
  			 * Text alignment, specified using one of the <Titanium.UI> text alignment constants.
  			 */
  var textAlign: java.lang.String | scala.Double = js.native
  /**
  			 * Button title.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Key identifying a string from the locale file to use for the button title.
  			 */
  var titleid: java.lang.String = js.native
  /**
  			 * Vertical alignment for the text field, specified using one of the
  			 * vertical alignment constants from <Titanium.UI>.
  			 */
  var verticalAlign: scala.Double | java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.attributedString> property.
  			 */
  def getAttributedString(): AttributedString = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.color> property.
  			 */
  def getColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.disabledColor> property.
  			 */
  def getDisabledColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.enabled> property.
  			 */
  def getEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.font> property.
  			 */
  def getFont(): titaniumLib.Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.image> property.
  			 */
  def getImage(): java.lang.String | titaniumLib.TitaniumNs.Blob = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.selectedColor> property.
  			 */
  def getSelectedColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.shadowColor> property.
  			 */
  def getShadowColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.shadowOffset> property.
  			 */
  def getShadowOffset(): js.Any = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.shadowRadius> property.
  			 */
  def getShadowRadius(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.style> property.
  			 */
  def getStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.systemButton> property.
  			 */
  def getSystemButton(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.textAlign> property.
  			 */
  def getTextAlign(): java.lang.String | scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.titleid> property.
  			 */
  def getTitleid(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Button.verticalAlign> property.
  			 */
  def getVerticalAlign(): scala.Double | java.lang.String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.attributedString> property.
  			 */
  def setAttributedString(attributedString: AttributedString): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.color> property.
  			 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.disabledColor> property.
  			 */
  def setDisabledColor(disabledColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.enabled> property.
  			 */
  def setEnabled(enabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.font> property.
  			 */
  def setFont(font: titaniumLib.Font): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.image> property.
  			 */
  def setImage(image: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.image> property.
  			 */
  def setImage(image: titaniumLib.TitaniumNs.Blob): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.selectedColor> property.
  			 */
  def setSelectedColor(selectedColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.shadowColor> property.
  			 */
  def setShadowColor(shadowColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.shadowOffset> property.
  			 */
  def setShadowOffset(shadowOffset: js.Any): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.shadowRadius> property.
  			 */
  def setShadowRadius(shadowRadius: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.style> property.
  			 */
  def setStyle(style: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.systemButton> property.
  			 */
  def setSystemButton(systemButton: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.textAlign> property.
  			 */
  def setTextAlign(textAlign: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.textAlign> property.
  			 */
  def setTextAlign(textAlign: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.titleid> property.
  			 */
  def setTitleid(titleid: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Button.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: scala.Double): scala.Unit = js.native
}

