package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait authenticated
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderStatus
  
  /** Vendor specific status. */
  @js.native
  sealed trait extended
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderStatus
  
  /** A device not authenticated. */
  @js.native
  sealed trait unauthenticated
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderStatus
  
  /* 1 */ val authenticated: authenticated with scala.Double = js.native
  /* 2 */ val extended: extended with scala.Double = js.native
  /* 0 */ val unauthenticated: unauthenticated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderStatus with scala.Double
  ] = js.native
}

