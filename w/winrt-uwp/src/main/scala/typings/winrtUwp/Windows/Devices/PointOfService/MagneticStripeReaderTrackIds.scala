package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagneticStripeReaderTrackIds with Double] = js.native
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object track1 extends TopLevel[track1 with Double]
  
  /* 2 */ @js.native
  object track2 extends TopLevel[track2 with Double]
  
  /* 3 */ @js.native
  object track3 extends TopLevel[track3 with Double]
  
  /* 4 */ @js.native
  object track4 extends TopLevel[track4 with Double]
  
}

