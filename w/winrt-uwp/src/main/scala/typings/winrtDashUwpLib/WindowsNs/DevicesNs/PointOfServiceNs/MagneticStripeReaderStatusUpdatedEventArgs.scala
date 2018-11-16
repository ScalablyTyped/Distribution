package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an operation status change. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderStatusUpdatedEventArgs")
@js.native
abstract class MagneticStripeReaderStatusUpdatedEventArgs () extends js.Object {
  /** Gets the vendor specific error code. */
  var extendedStatus: scala.Double = js.native
  /** Gets the status change information. */
  var status: MagneticStripeReaderStatus = js.native
}

