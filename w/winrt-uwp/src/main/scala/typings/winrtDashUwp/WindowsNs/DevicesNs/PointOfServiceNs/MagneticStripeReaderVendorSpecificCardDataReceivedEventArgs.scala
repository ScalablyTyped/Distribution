package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the recently swiped vendor card. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs")
@js.native
abstract class MagneticStripeReaderVendorSpecificCardDataReceivedEventArgs () extends js.Object {
  /** Gets data for the recently swiped vendor card. */
  var report: MagneticStripeReaderReport = js.native
}

