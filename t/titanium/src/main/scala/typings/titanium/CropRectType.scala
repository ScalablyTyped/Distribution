package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object for describing the crop rectangle for an image.
  */
trait CropRectType extends js.Object {
  /**
  	 * Height of the crop rectangle, in pixels.
  	 */
  var height: js.UndefOr[Double] = js.undefined
  /**
  	 * Width of the crop rectangle, in pixels.
  	 */
  var width: js.UndefOr[Double] = js.undefined
  /**
  	 * X coordinate of the crop rectangle's upper-left corner.
  	 */
  var x: js.UndefOr[Double] = js.undefined
  /**
  	 * Y coordinate of the crop rectangle's upper-left corner.
  	 */
  var y: js.UndefOr[Double] = js.undefined
}

object CropRectType {
  @scala.inline
  def apply(
    height: Int | Double = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): CropRectType = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropRectType]
  }
}

