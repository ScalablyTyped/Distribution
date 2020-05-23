package typings.winrtUwp.global.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the barcode scanner data. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerReport")
@js.native
abstract class BarcodeScannerReport ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerReport {
  /** Gets the full raw data from the DataReceived event. */
  /* CompleteClass */
  override var scanData: IBuffer = js.native
  /** Gets the decoded barcode label, which does not include the header, checksum, and other miscellaneous information. */
  /* CompleteClass */
  override var scanDataLabel: IBuffer = js.native
  /** Gets the decoded barcode label type. Possible values are defined in the BarcodeSymbologies class. */
  /* CompleteClass */
  override var scanDataType: Double = js.native
}

