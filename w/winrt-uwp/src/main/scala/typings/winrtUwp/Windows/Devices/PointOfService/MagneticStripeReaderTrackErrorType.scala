package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MagneticStripeReaderTrackErrorType extends StObject
/** Defines the constants that indicates the track error type. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType")
@js.native
object MagneticStripeReaderTrackErrorType extends StObject {
  
  /** An end sentinel error. */
  @js.native
  sealed trait endSentinelError
    extends StObject
       with MagneticStripeReaderTrackErrorType
  
  /** An LRC error. */
  @js.native
  sealed trait lrcError
    extends StObject
       with MagneticStripeReaderTrackErrorType
  
  /** No specified error. */
  @js.native
  sealed trait none
    extends StObject
       with MagneticStripeReaderTrackErrorType
  
  /** A parity error. */
  @js.native
  sealed trait parityError
    extends StObject
       with MagneticStripeReaderTrackErrorType
  
  /** A start sentinel error. */
  @js.native
  sealed trait startSentinelError
    extends StObject
       with MagneticStripeReaderTrackErrorType
  
  /** An unknown error. */
  @js.native
  sealed trait unknown
    extends StObject
       with MagneticStripeReaderTrackErrorType
}
