package typings.titanium.Titanium.UI

import typings.titanium.Font
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
  var color: String = js.native
  /**
  			 * Font for the progress bar text.
  			 */
  var font: Font = js.native
  /**
  			 * Maximum value of the progress bar.
  			 */
  var max: Double = js.native
  /**
  			 * Progress bar text.
  			 */
  var message: String = js.native
  /**
  			 * Minimum value of the progress bar.
  			 */
  var min: Double = js.native
  /**
  			 * Style of the progress bar.
  			 */
  var style: Double = js.native
  /**
  			 * The color shown for the portion of the progress bar that is not filled.
  			 */
  var trackTintColor: String = js.native
  /**
  			 * Current value of the progress bar.
  			 */
  var value: Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.color> property.
  			 */
  def getColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.font> property.
  			 */
  def getFont(): Font = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.max> property.
  			 */
  def getMax(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.message> property.
  			 */
  def getMessage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.min> property.
  			 */
  def getMin(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.style> property.
  			 */
  def getStyle(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.trackTintColor> property.
  			 */
  def getTrackTintColor(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ProgressBar.value> property.
  			 */
  def getValue(): Double = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.color> property.
  			 */
  def setColor(color: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.font> property.
  			 */
  def setFont(font: Font): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.max> property.
  			 */
  def setMax(max: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.message> property.
  			 */
  def setMessage(message: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.min> property.
  			 */
  def setMin(min: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.style> property.
  			 */
  def setStyle(style: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.trackTintColor> property.
  			 */
  def setTrackTintColor(trackTintColor: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ProgressBar.value> property.
  			 */
  def setValue(value: Double): Unit = js.native
}

