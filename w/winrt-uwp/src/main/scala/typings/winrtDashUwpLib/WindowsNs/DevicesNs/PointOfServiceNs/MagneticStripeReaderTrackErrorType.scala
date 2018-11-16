package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait endSentinelError
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackErrorType
  
  /** An LRC error. */
  @js.native
  sealed trait lrcError
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackErrorType
  
  /** No specified error. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackErrorType
  
  /** A parity error. */
  @js.native
  sealed trait parityError
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackErrorType
  
  /** A start sentinel error. */
  @js.native
  sealed trait startSentinelError
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackErrorType
  
  /** An unknown error. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackErrorType
  
  val endSentinelError: endSentinelError with java.lang.String = js.native
  val lrcError: lrcError with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val parityError: parityError with java.lang.String = js.native
  val startSentinelError: startSentinelError with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderTrackErrorType with java.lang.String
  ] = js.native
}

