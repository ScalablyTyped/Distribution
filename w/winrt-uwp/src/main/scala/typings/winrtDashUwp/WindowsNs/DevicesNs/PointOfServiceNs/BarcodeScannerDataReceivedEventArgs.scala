package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the barcode data from the DataReceived event. */
@JSGlobal("Windows.Devices.PointOfService.BarcodeScannerDataReceivedEventArgs")
@js.native
abstract class BarcodeScannerDataReceivedEventArgs () extends js.Object {
  /** Gets the data from the DataReceived event. */
  var report: BarcodeScannerReport = js.native
}

