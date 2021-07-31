package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MagneticStripeReaderTrackIds extends StObject
/** Defines the constants that indicates the device track ID to read. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderTrackIds")
@js.native
object MagneticStripeReaderTrackIds extends StObject {
  
  /** No track ID */
  @js.native
  sealed trait none
    extends StObject
       with MagneticStripeReaderTrackIds
  
  /** Read track 1 */
  @js.native
  sealed trait track1
    extends StObject
       with MagneticStripeReaderTrackIds
  
  /** Read track 2 */
  @js.native
  sealed trait track2
    extends StObject
       with MagneticStripeReaderTrackIds
  
  /** Read track 3 */
  @js.native
  sealed trait track3
    extends StObject
       with MagneticStripeReaderTrackIds
  
  /** Read track 4 */
  @js.native
  sealed trait track4
    extends StObject
       with MagneticStripeReaderTrackIds
}
