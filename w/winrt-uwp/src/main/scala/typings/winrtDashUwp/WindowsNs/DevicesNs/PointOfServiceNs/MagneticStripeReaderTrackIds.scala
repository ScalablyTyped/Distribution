package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait none extends MagneticStripeReaderTrackIds
  
  /** Read track 1 */
  @js.native
  sealed trait track1 extends MagneticStripeReaderTrackIds
  
  /** Read track 2 */
  @js.native
  sealed trait track2 extends MagneticStripeReaderTrackIds
  
  /** Read track 3 */
  @js.native
  sealed trait track3 extends MagneticStripeReaderTrackIds
  
  /** Read track 4 */
  @js.native
  sealed trait track4 extends MagneticStripeReaderTrackIds
  
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackIds.none with Double = js.native
  /* 1 */ val track1: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackIds.track1 with Double = js.native
  /* 2 */ val track2: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackIds.track2 with Double = js.native
  /* 3 */ val track3: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackIds.track3 with Double = js.native
  /* 4 */ val track4: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackIds.track4 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagneticStripeReaderTrackIds with Double] = js.native
}

