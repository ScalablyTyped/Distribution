package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about an operation status change. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderStatusUpdatedEventArgs")
@js.native
abstract class MagneticStripeReaderStatusUpdatedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatusUpdatedEventArgs {
  /** Gets the vendor specific error code. */
  /* CompleteClass */
  override var extendedStatus: Double = js.native
  /** Gets the status change information. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatus = js.native
}

