package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an operation status change. */
trait MagneticStripeReaderStatusUpdatedEventArgs extends js.Object {
  /** Gets the vendor specific error code. */
  var extendedStatus: Double
  /** Gets the status change information. */
  var status: MagneticStripeReaderStatus
}

object MagneticStripeReaderStatusUpdatedEventArgs {
  @scala.inline
  def apply(extendedStatus: Double, status: MagneticStripeReaderStatus): MagneticStripeReaderStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(extendedStatus = extendedStatus.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderStatusUpdatedEventArgs]
  }
}

