package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MagneticStripeReaderTrackErrorType extends js.Object

/** Defines the constants that indicates the track error type. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType")
@js.native
object MagneticStripeReaderTrackErrorType extends js.Object {
  /** An end sentinel error. */
  @js.native
  sealed trait endSentinelError extends MagneticStripeReaderTrackErrorType
  
  /** An LRC error. */
  @js.native
  sealed trait lrcError extends MagneticStripeReaderTrackErrorType
  
  /** No specified error. */
  @js.native
  sealed trait none extends MagneticStripeReaderTrackErrorType
  
  /** A parity error. */
  @js.native
  sealed trait parityError extends MagneticStripeReaderTrackErrorType
  
  /** A start sentinel error. */
  @js.native
  sealed trait startSentinelError extends MagneticStripeReaderTrackErrorType
  
  /** An unknown error. */
  @js.native
  sealed trait unknown extends MagneticStripeReaderTrackErrorType
  
}

