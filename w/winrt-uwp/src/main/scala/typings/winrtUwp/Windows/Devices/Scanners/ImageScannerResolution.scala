package typings.winrtUwp.Windows.Devices.Scanners

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
    val __obj = js.Dynamic.literal(dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerResolution]
  }
}

