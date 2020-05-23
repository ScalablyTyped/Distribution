package typings.winrtUwp.Windows.Devices.Scanners

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a scan job. */
trait ImageScannerScanResult extends js.Object {
  /** Gets the list of scanned image files that was produced by the completed scan job. */
  var scannedFiles: IVectorView[StorageFile]
}

object ImageScannerScanResult {
  @scala.inline
  def apply(scannedFiles: IVectorView[StorageFile]): ImageScannerScanResult = {
    val __obj = js.Dynamic.literal(scannedFiles = scannedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerScanResult]
  }
}

