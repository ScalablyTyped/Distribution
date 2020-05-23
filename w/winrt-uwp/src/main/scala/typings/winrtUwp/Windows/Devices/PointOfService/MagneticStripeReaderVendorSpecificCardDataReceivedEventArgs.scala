package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the recently swiped vendor card. */
trait MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs extends js.Object {
  /** Gets data for the recently swiped vendor card. */
  var report: MagneticStripeReaderReport
}

object MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs {
  @scala.inline
  def apply(report: MagneticStripeReaderReport): MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs = {
    val __obj = js.Dynamic.literal(report = report.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs]
  }
}

