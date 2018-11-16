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
  
  val authenticated: authenticated with java.lang.String = js.native
  val extended: extended with java.lang.String = js.native
  val unauthenticated: unauthenticated with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderStatus with java.lang.String
  ] = js.native
}

