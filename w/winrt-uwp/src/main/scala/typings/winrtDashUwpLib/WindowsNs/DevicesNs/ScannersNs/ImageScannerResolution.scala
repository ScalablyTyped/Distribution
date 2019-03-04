package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the scan resolution. */
trait ImageScannerResolution extends js.Object {
  /** The horizontal size. */
  var dpiX: scala.Double
  /** The vertical size. */
  var dpiY: scala.Double
}

object ImageScannerResolution {
  @scala.inline
  def apply(dpiX: scala.Double, dpiY: scala.Double): ImageScannerResolution = {
    val __obj = js.Dynamic.literal(dpiX = dpiX, dpiY = dpiY)
  
    __obj.asInstanceOf[ImageScannerResolution]
  }
}

