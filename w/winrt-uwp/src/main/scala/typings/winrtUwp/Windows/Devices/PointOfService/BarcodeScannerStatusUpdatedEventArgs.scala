package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an operation status change. */
@js.native
trait BarcodeScannerStatusUpdatedEventArgs extends js.Object {
  /** Gets the vendor specific status code. */
  var extendedStatus: Double = js.native
  /** Gets the status change information. */
  var status: BarcodeScannerStatus = js.native
}

object BarcodeScannerStatusUpdatedEventArgs {
  @scala.inline
  def apply(extendedStatus: Double, status: BarcodeScannerStatus): BarcodeScannerStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerStatusUpdatedEventArgs]
  }
  @scala.inline
  implicit class BarcodeScannerStatusUpdatedEventArgsOps[Self <: BarcodeScannerStatusUpdatedEventArgs] (val x: Self) extends AnyVal {
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
    def setExtendedStatus(value: Double): Self = this.set("extendedStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: BarcodeScannerStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

