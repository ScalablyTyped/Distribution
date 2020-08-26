package typings.winrtUwp.Windows.Devices.Scanners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the scan resolution. */
@js.native
trait ImageScannerResolution extends js.Object {
  /** The horizontal size. */
  var dpiX: Double = js.native
  /** The vertical size. */
  var dpiY: Double = js.native
}

object ImageScannerResolution {
  @scala.inline
  def apply(dpiX: Double, dpiY: Double): ImageScannerResolution = {
    val __obj = js.Dynamic.literal(dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerResolution]
  }
  @scala.inline
  implicit class ImageScannerResolutionOps[Self <: ImageScannerResolution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDpiX(value: Double): Self = this.set("dpiX", value.asInstanceOf[js.Any])
    @scala.inline
    def setDpiY(value: Double): Self = this.set("dpiY", value.asInstanceOf[js.Any])
  }
  
}

