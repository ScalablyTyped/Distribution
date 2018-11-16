package typings
package titaniumLib.TitaniumNs.UINs

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
  var animated: scala.Boolean = js.native
  /**
  			 * Color to use for switch text, as a color name or hex triplet.
  			 */
  var color: java.lang.String = js.native
  /**
  			 * Determines whether the switch is enabled.
  			 */
  var enabled: scala.Boolean = js.native
  /**
  			 * Font to use for the switch text.
  			 */
  var font: titaniumLib.Font = js.native
  /**
  			 * The color used to tint the appearance of the switch when it is turned on.
  			 */
  var onTintColor: java.lang.String = js.native
  /**
  			 * Style of the switch.
  			 */
  var style: scala.Double = js.native
  /**
  			 * Horizontal text alignment of the switch title.
  			 */
  var textAlign: java.lang.String | scala.Double = js.native
  /**
  			 * The color used to tint the appearance of the thumb.
  			 */
  var thumbTintColor: java.lang.String = js.native
  /**
  			 * Text to display next to the switch, when the checkbox style is in use.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Text to display on the switch in its "off" state, when the toggle button style is in use.
  			 */
  var titleOff: java.lang.String = js.native
  /**
  			 * Text to display on the switch in its "on" state, when the toggle button style is in use.
  			 */
  var titleOn: java.lang.String = js.native
  /**
  			 * Indicates whether the switch has been turned on or off by the user. May also be set
  			 * programmatically.
  			 */
  var value: scala.Boolean = js.native
  /**
  			 * Vertical alignment for the text field.
  			 */
  var verticalAlign: scala.Double | java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.animated> property.
  			 */
  def getAnimated(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.color> property.
  			 */
  def getColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.enabled> property.
  			 */
  def getEnabled(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.font> property.
  			 */
  def getFont(): titaniumLib.Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.onTintColor> property.
  			 */
  def getOnTintColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.style> property.
  			 */
  def getStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.textAlign> property.
  			 */
  def getTextAlign(): java.lang.String | scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.thumbTintColor> property.
  			 */
  def getThumbTintColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.titleOff> property.
  			 */
  def getTitleOff(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.titleOn> property.
  			 */
  def getTitleOn(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.value> property.
  			 */
  def getValue(): scala.Boolean = js.native
  /**
  			 * Gets the value of the <Titanium.UI.Switch.verticalAlign> property.
  			 */
  def getVerticalAlign(): scala.Double | java.lang.String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.animated> property.
  			 */
  def setAnimated(animated: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.color> property.
  			 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.enabled> property.
  			 */
  def setEnabled(enabled: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.font> property.
  			 */
  def setFont(font: titaniumLib.Font): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.onTintColor> property.
  			 */
  def setOnTintColor(onTintColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.style> property.
  			 */
  def setStyle(style: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.textAlign> property.
  			 */
  def setTextAlign(textAlign: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.textAlign> property.
  			 */
  def setTextAlign(textAlign: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.thumbTintColor> property.
  			 */
  def setThumbTintColor(thumbTintColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.titleOff> property.
  			 */
  def setTitleOff(titleOff: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.titleOn> property.
  			 */
  def setTitleOn(titleOn: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.value> property.
  			 */
  def setValue(value: scala.Boolean): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.Switch.verticalAlign> property.
  			 */
  def setVerticalAlign(verticalAlign: scala.Double): scala.Unit = js.native
}

