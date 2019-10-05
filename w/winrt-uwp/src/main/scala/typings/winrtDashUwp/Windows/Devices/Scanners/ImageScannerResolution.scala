package typings.winrtDashUwp.Windows.Devices.Scanners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the scan resolution. */
trait ImageScannerResolution extends js.Object {
  /** The horizontal size. */
  var dpiX: Double
  /** The vertical size. */
  var dpiY: Double
}

object ImageScannerResolution {
  @scala.inline
  def apply(dpiX: Double, dpiY: Double): ImageScannerResolution = {
    val __obj = js.Dynamic.literal(dpiX = dpiX, dpiY = dpiY)
  
    __obj.asInstanceOf[ImageScannerResolution]
  }
}

