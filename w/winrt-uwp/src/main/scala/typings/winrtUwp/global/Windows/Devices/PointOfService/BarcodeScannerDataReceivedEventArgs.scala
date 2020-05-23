package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the barcode data from the DataReceived event. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerDataReceivedEventArgs")
@js.native
abstract class BarcodeScannerDataReceivedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerDataReceivedEventArgs {
  /** Gets the data from the DataReceived event. */
  /* CompleteClass */
  override var report: typings.winrtUwp.Windows.Devices.PointOfService.BarcodeScannerReport = js.native
}

