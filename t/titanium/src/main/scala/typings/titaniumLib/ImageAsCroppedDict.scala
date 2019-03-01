package typings
package titaniumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object used to specify options for [imageAsCropped](Titanium.Blob.imageAsCropped).
  */
trait ImageAsCroppedDict extends js.Object {
  /**
  	 * Height to crop this image to.
  	 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Width to crop this image to.
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Left coordinate of the cropped rectangle within the source image.
  	 */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Top coordinate of the cropped rectangle within the source image.
  	 */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object ImageAsCroppedDict {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): ImageAsCroppedDict = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageAsCroppedDict]
  }
}

