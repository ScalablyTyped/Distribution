package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MagneticStripeReaderStatus extends js.Object

/** Defines the constants that indicates the device authentication status. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderStatus")
@js.native
object MagneticStripeReaderStatus extends js.Object {
  /** An authenticated device. */
  @js.native
  sealed trait authenticated extends MagneticStripeReaderStatus
  
  /** Vendor specific status. */
  @js.native
  sealed trait extended extends MagneticStripeReaderStatus
  
  /** A device not authenticated. */
  @js.native
  sealed trait unauthenticated extends MagneticStripeReaderStatus
  
}

