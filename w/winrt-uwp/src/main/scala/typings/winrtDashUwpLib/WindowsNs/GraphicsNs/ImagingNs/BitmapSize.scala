package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the size of a bitmap, in pixels. */
trait BitmapSize extends js.Object {
  /** The height of a bitmap, in pixels. */
  var height: scala.Double
  /** The width of a bitmap, in pixels. */
  var width: scala.Double
}

object BitmapSize {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): BitmapSize = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[BitmapSize]
  }
}

