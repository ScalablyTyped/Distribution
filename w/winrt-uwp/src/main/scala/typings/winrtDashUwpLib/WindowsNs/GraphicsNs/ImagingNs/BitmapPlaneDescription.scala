package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the format of a bitmap plane. */
trait BitmapPlaneDescription extends js.Object {
  /** The height of the plane, in pixels. */
  var height: scala.Double
  /** The start index of the pixel data within the plane. */
  var startIndex: scala.Double
  /** The stride of the bitmap data. */
  var stride: scala.Double
  /** The width of the plane, in pixels. */
  var width: scala.Double
}

object BitmapPlaneDescription {
  @scala.inline
  def apply(height: scala.Double, startIndex: scala.Double, stride: scala.Double, width: scala.Double): BitmapPlaneDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("startIndex")(startIndex)
    __obj.updateDynamic("stride")(stride)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[BitmapPlaneDescription]
  }
}

