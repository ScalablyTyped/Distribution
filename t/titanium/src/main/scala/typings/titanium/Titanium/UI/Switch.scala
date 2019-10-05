package typings.titanium.Titanium.UI

import typings.titanium.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An on/off switch control.
		 */
@js.native
trait Switch extends View {
  /**
  			 * Determines if there is animation when the switch value changes.
  			 */
  var animated: Boolean = js.native
  /**
  			 * Color to use for switch text, as a color name or hex triplet.
  			 */
  var color: String = js.native
  /**
  			 * Determines whether the switch is enabled.
  			 */
  var enabled: Boolean = js.native
  /**
  			 * Font to use for the switch text.
  			 */
  var font: Font = js.native
  /**
  			 * The color used to tint the appearance of the switch when it is turned on.
  			 */
  var onTintColor: String = js.native
  /**
  			 * Style of the switch.
  			 */
  var style: Double = js.native
  /**
  			 * Horizontal text alignment of the switch title.
  			 */
  var textAlign: String | Double = js.native
  /**
  			 * The color used to tint the appearance of the thumb.
  			 */
  var thumbTintColor: String = js.native
  /**
  			 * Text to display next to the switch, when the checkbox style is in use.
  			 */
  var title: String = js.native
  /**
  			 * Text to display on the switch in its "off" state, when the toggle button style is in use.
  			 */
  var titleOff: String = js.native
  /**
  			 * Text to display on the switch in its "on" state, when the toggle button style is in use.
  			 */
  var titleOn: String = js.native
  /**
  			 * Indicates whether the switch has been turned on or off by the user. May also be set
  			 * programmatically.
  			 */
  var value: Boolean = js.native
  /**
  			 * Vertical alignment for the text field.
  			 */
  var verticalAlign: Double | String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.animated> property.
  			 */
  def getAnimated(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.color> property.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.enabled> property.
  			 */
  def getEnabled(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.font> property.
  			 */
  def getFont(): Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.onTintColor> property.
  			 */
  def getOnTintColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.style> property.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.textAlign> property.
  			 */
  def getTextAlign(): String | Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.thumbTintColor> property.
  			 */
  def getThumbTintColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.title> property.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.titleOff> property.
  			 */
  def getTitleOff(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.titleOn> property.
  			 */
  def getTitleOn(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.value> property.
  			 */
  def getValue(): Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.verticalAlign> property.
  			 */
  def getVerticalAlign(): Double | String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.animated> property.
  			 */
  def setAnimated(animated: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.color> property.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.enabled> property.
  			 */
  def setEnabled(enabled: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.font> property.
  			 */
  def setFont(font: Font): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.onTintColor> property.
  			 */
  def setOnTintColor(onTintColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.style> property.
  			 */
  def setStyle(style: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.textAlign> property.
  			 */
  def setTextAlign(textAlign: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.textAlign> property.
  			 */
  def setTextAlign(textAlign: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.thumbTintColor> property.
  			 */
  def setThumbTintColor(thumbTintColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.title> property.
  			 */
  def setTitle(title: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.titleOff> property.
  			 */
  def setTitleOff(titleOff: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.titleOn> property.
  			 */
  def setTitleOn(titleOn: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.value> property.
  			 */
  def setValue(value: Boolean): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: Double): Unit = js.native
}

