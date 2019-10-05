package typings.winrtDashUwp.Windows.Devices.PointOfService

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
  
  /* 1 */ val authenticated: typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatus.authenticated with Double = js.native
  /* 2 */ val extended: typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatus.extended with Double = js.native
  /* 0 */ val unauthenticated: typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatus.unauthenticated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagneticStripeReaderStatus with Double] = js.native
}

