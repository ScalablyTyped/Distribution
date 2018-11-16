package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the barcode scanner data. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerReport")
@js.native
abstract class BarcodeScannerReport () extends js.Object {
  /** Gets the full raw data from the DataReceived event. */
  var scanData: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the decoded barcode label, which does not include the header, checksum, and other miscellaneous information. */
  var scanDataLabel: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets the decoded barcode label type. Possible values are defined in the BarcodeSymbologies class. */
  var scanDataType: scala.Double = js.native
}

