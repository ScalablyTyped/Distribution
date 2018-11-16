package typings
package titaniumLib.TitaniumNs.UINs

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
  var image: java.lang.String = js.native
  /**
  			 * Image drawn as the background image.
  			 */
  var mask: java.lang.String = js.native
  /**
  			 * Blend mode to use to combine layers.
  			 */
  var mode: scala.Double = js.native
  /**
  			 * Color to combine with the image, as a color name or hex triplet.
  			 */
  var tint: java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.MaskedImage.image> property.
  			 */
  def getImage(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.MaskedImage.mask> property.
  			 */
  def getMask(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.MaskedImage.mode> property.
  			 */
  def getMode(): scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.MaskedImage.tint> property.
  			 */
  def getTint(): java.lang.String = js.native
  /**
  			 * Sets the value of the <Titanium.UI.MaskedImage.image> property.
  			 */
  def setImage(image: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.MaskedImage.mask> property.
  			 */
  def setMask(mask: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.MaskedImage.mode> property.
  			 */
  def setMode(mode: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.MaskedImage.tint> property.
  			 */
  def setTint(tint: java.lang.String): scala.Unit = js.native
}

