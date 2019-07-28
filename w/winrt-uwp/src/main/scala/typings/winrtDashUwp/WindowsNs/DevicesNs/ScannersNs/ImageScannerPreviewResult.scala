package typings.winrtDashUwp.WindowsNs.DevicesNs.ScannersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a preview scan job. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerPreviewResult")
@js.native
abstract class ImageScannerPreviewResult () extends js.Object {
  /** Gets the format of the data for the scan preview. After preview this property is restored to the value before preview. */
  var format: ImageScannerFormat = js.native
  /** Gets whether the scan preview was successful. */
  var succeeded: Boolean = js.native
}

