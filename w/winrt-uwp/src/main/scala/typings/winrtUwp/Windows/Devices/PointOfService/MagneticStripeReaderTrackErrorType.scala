package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagneticStripeReaderTrackErrorType with Double] = js.native
  /* 2 */ @js.native
  object endSentinelError extends TopLevel[endSentinelError with Double]
  
  /* 4 */ @js.native
  object lrcError extends TopLevel[lrcError with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object parityError extends TopLevel[parityError with Double]
  
  /* 1 */ @js.native
  object startSentinelError extends TopLevel[startSentinelError with Double]
  
  /* 5 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

