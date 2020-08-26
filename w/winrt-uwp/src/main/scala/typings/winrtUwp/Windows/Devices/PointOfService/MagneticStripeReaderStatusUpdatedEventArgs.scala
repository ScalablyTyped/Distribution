package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an operation status change. */
@js.native
trait MagneticStripeReaderStatusUpdatedEventArgs extends js.Object {
  /** Gets the vendor specific error code. */
  var extendedStatus: Double = js.native
  /** Gets the status change information. */
  var status: MagneticStripeReaderStatus = js.native
}

object MagneticStripeReaderStatusUpdatedEventArgs {
  @scala.inline
  def apply(extendedStatus: Double, status: MagneticStripeReaderStatus): MagneticStripeReaderStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderStatusUpdatedEventArgs]
  }
  @scala.inline
  implicit class MagneticStripeReaderStatusUpdatedEventArgsOps[Self <: MagneticStripeReaderStatusUpdatedEventArgs] (val x: Self) extends AnyVal {
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
    def setStatus(value: MagneticStripeReaderStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

