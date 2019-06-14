package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MagneticStripeReaderTrackIds extends js.Object

/** Defines the constants that indicates the device track ID to read. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderTrackIds")
@js.native
object MagneticStripeReaderTrackIds extends js.Object {
  /** No track ID */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackIds
  
  /** Read track 1 */
  @js.native
  sealed trait track1
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackIds
  
  /** Read track 2 */
  @js.native
  sealed trait track2
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackIds
  
  /** Read track 3 */
  @js.native
  sealed trait track3
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackIds
  
  /** Read track 4 */
  @js.native
  sealed trait track4
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackIds
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val track1: track1 with scala.Double = js.native
  /* 2 */ val track2: track2 with scala.Double = js.native
  /* 3 */ val track3: track3 with scala.Double = js.native
  /* 4 */ val track4: track4 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackIds with scala.Double
  ] = js.native
}

