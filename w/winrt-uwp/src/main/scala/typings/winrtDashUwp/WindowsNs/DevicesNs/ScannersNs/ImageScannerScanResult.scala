package typings.winrtDashUwp.WindowsNs.DevicesNs.ScannersNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.StorageNs.StorageFile
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

