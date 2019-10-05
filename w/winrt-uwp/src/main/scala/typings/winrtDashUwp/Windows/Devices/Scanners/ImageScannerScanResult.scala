package typings.winrtDashUwp.Windows.Devices.Scanners

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a scan job. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerScanResult")
@js.native
abstract class ImageScannerScanResult () extends js.Object {
  /** Gets the list of scanned image files that was produced by the completed scan job. */
  var scannedFiles: IVectorView[StorageFile] = js.native
}

