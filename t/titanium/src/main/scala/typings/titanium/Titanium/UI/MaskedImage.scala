package typings.titanium.Titanium.UI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * A control that displays an image composited with a background image or color.
		 */
@js.native
trait MaskedImage extends View {
  /**
  			 * Image drawn as the Foreground image.
  			 */
  var image: String = js.native
  /**
  			 * Image drawn as the background image.
  			 */
  var mask: String = js.native
  /**
  			 * Blend mode to use to combine layers.
  			 */
  var mode: Double = js.native
  /**
  			 * Color to combine with the image, as a color name or hex triplet.
  			 */
  var tint: String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.MaskedImage.image> property.
  			 */
  def getImage(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.MaskedImage.mask> property.
  			 */
  def getMask(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.MaskedImage.mode> property.
  			 */
  def getMode(): Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.MaskedImage.tint> property.
  			 */
  def getTint(): String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.MaskedImage.image> property.
  			 */
  def setImage(image: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.MaskedImage.mask> property.
  			 */
  def setMask(mask: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.MaskedImage.mode> property.
  			 */
  def setMode(mode: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.MaskedImage.tint> property.
  			 */
  def setTint(tint: String): Unit = js.native
}

