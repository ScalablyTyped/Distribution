package typings.winrtUwp.Windows.Devices.Scanners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a preview scan job. */
@js.native
trait ImageScannerPreviewResult extends js.Object {
  /** Gets the format of the data for the scan preview. After preview this property is restored to the value before preview. */
  var format: ImageScannerFormat = js.native
  /** Gets whether the scan preview was successful. */
  var succeeded: Boolean = js.native
}

object ImageScannerPreviewResult {
  @scala.inline
  def apply(format: ImageScannerFormat, succeeded: Boolean): ImageScannerPreviewResult = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerPreviewResult]
  }
  @scala.inline
  implicit class ImageScannerPreviewResultOps[Self <: ImageScannerPreviewResult] (val x: Self) extends AnyVal {
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
    def setFormat(value: ImageScannerFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setSucceeded(value: Boolean): Self = this.set("succeeded", value.asInstanceOf[js.Any])
  }
  
}

