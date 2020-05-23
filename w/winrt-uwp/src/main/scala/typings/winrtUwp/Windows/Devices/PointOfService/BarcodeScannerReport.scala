package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the barcode scanner data. */
trait BarcodeScannerReport extends js.Object {
  /** Gets the full raw data from the DataReceived event. */
  var scanData: IBuffer
  /** Gets the decoded barcode label, which does not include the header, checksum, and other miscellaneous information. */
  var scanDataLabel: IBuffer
  /** Gets the decoded barcode label type. Possible values are defined in the BarcodeSymbologies class. */
  var scanDataType: Double
}

object BarcodeScannerReport {
  @scala.inline
  def apply(scanData: IBuffer, scanDataLabel: IBuffer, scanDataType: Double): BarcodeScannerReport = {
    val __obj = js.Dynamic.literal(scanData = scanData.asInstanceOf[js.Any], scanDataLabel = scanDataLabel.asInstanceOf[js.Any], scanDataType = scanDataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerReport]
  }
}

