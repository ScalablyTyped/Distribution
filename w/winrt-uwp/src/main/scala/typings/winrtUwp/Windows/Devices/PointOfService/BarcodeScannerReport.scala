package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the barcode scanner data. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerReport")
@js.native
abstract class BarcodeScannerReport () extends js.Object {
  /** Gets the full raw data from the DataReceived event. */
  var scanData: IBuffer = js.native
  /** Gets the decoded barcode label, which does not include the header, checksum, and other miscellaneous information. */
  var scanDataLabel: IBuffer = js.native
  /** Gets the decoded barcode label type. Possible values are defined in the BarcodeSymbologies class. */
  var scanDataType: Double = js.native
}

