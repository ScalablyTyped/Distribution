package typings.winrtUwp.Windows.Devices.PointOfService

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
  
}

