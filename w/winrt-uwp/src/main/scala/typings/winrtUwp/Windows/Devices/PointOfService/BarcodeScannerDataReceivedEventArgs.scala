package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the barcode data from the DataReceived event. */
@js.native
trait BarcodeScannerDataReceivedEventArgs extends js.Object {
  /** Gets the data from the DataReceived event. */
  var report: BarcodeScannerReport = js.native
}

object BarcodeScannerDataReceivedEventArgs {
  @scala.inline
  def apply(report: BarcodeScannerReport): BarcodeScannerDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerDataReceivedEventArgs]
  }
  @scala.inline
  implicit class BarcodeScannerDataReceivedEventArgsOps[Self <: BarcodeScannerDataReceivedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReport(value: BarcodeScannerReport): Self = this.set("report", value.asInstanceOf[js.Any])
  }
  
}

