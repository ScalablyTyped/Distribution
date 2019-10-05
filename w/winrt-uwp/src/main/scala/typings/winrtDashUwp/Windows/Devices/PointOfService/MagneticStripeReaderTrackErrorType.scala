package typings.winrtDashUwp.Windows.Devices.PointOfService

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
  
  /* 2 */ val endSentinelError: typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType.endSentinelError with Double = js.native
  /* 4 */ val lrcError: typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType.lrcError with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType.none with Double = js.native
  /* 3 */ val parityError: typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType.parityError with Double = js.native
  /* 1 */ val startSentinelError: typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType.startSentinelError with Double = js.native
  /* 5 */ val unknown: typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderTrackErrorType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagneticStripeReaderTrackErrorType with Double] = js.native
}

