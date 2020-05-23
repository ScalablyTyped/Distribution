package typings.winrtUwp.Windows.Devices.Scanners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a preview scan job. */
trait ImageScannerPreviewResult extends js.Object {
  /** Gets the format of the data for the scan preview. After preview this property is restored to the value before preview. */
  var format: ImageScannerFormat
  /** Gets whether the scan preview was successful. */
  var succeeded: Boolean
}

object ImageScannerPreviewResult {
  @scala.inline
  def apply(format: ImageScannerFormat, succeeded: Boolean): ImageScannerPreviewResult = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerPreviewResult]
  }
}

