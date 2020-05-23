package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the barcode data from the DataReceived event. */
trait BarcodeScannerDataReceivedEventArgs extends js.Object {
  /** Gets the data from the DataReceived event. */
  var report: BarcodeScannerReport
}

object BarcodeScannerDataReceivedEventArgs {
  @scala.inline
  def apply(report: BarcodeScannerReport): BarcodeScannerDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerDataReceivedEventArgs]
  }
}

