package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.ScannersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of a scan job. */
@JSGlobal("Windows.Devices.Scanners.ImageScannerScanResult")
@js.native
abstract class ImageScannerScanResult () extends js.Object {
  /** Gets the list of scanned image files that was produced by the completed scan job. */
  var scannedFiles: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
}

