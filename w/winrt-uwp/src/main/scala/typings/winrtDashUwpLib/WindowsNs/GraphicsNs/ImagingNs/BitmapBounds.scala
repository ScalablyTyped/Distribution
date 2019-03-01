package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a bounding rectangle. */
trait BitmapBounds extends js.Object {
  /** The Height, in pixels, of the bounding box */
  var height: scala.Double
  /** The Width, in pixels, of the bounding box. */
  var width: scala.Double
  /** The X coordinate, in pixels, of the top left corner of the bounding box. */
  var x: scala.Double
  /** The Y coordinate, in pixels, of the top left corner of the bounding box. */
  var y: scala.Double
}

object BitmapBounds {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double, x: scala.Double, y: scala.Double): BitmapBounds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[BitmapBounds]
  }
}

