package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A progress bar.
		 */
@js.native
trait ProgressBar extends View {
  /**
  			 * Color of the progress bar message, as a color name or hex triplet.
  			 */
  var color: java.lang.String = js.native
  /**
  			 * Font for the progress bar text.
  			 */
  var font: titaniumLib.Font = js.native
  /**
  			 * Maximum value of the progress bar.
  			 */
  var max: scala.Double = js.native
  /**
  			 * Progress bar text.
  			 */
  var message: java.lang.String = js.native
  /**
  			 * Minimum value of the progress bar.
  			 */
  var min: scala.Double = js.native
  /**
  			 * Style of the progress bar.
  			 */
  var style: scala.Double = js.native
  /**
  			 * The color shown for the portion of the progress bar that is not filled.
  			 */
  var trackTintColor: java.lang.String = js.native
  /**
  			 * Current value of the progress bar.
  			 */
  var value: scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.color> property.
  			 */
  def getColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.font> property.
  			 */
  def getFont(): titaniumLib.Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.max> property.
  			 */
  def getMax(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.message> property.
  			 */
  def getMessage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.min> property.
  			 */
  def getMin(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.style> property.
  			 */
  def getStyle(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.trackTintColor> property.
  			 */
  def getTrackTintColor(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.value> property.
  			 */
  def getValue(): scala.Double = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.color> property.
  			 */
  def setColor(color: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.font> property.
  			 */
  def setFont(font: titaniumLib.Font): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.max> property.
  			 */
  def setMax(max: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.message> property.
  			 */
  def setMessage(message: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.min> property.
  			 */
  def setMin(min: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.style> property.
  			 */
  def setStyle(style: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.trackTintColor> property.
  			 */
  def setTrackTintColor(trackTintColor: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.value> property.
  			 */
  def setValue(value: scala.Double): scala.Unit = js.native
}

