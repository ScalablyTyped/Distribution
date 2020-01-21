package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MagneticStripeReaderAuthenticationProtocol extends js.Object

/** Defines the constants that indicates the authentication protocol supported by the device. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationProtocol")
@js.native
object MagneticStripeReaderAuthenticationProtocol extends js.Object {
  /** The device supports challenge response protocol. */
  @js.native
  sealed trait challengeResponse extends MagneticStripeReaderAuthenticationProtocol
  
  /** The device does not support device authentication. */
  @js.native
  sealed trait none extends MagneticStripeReaderAuthenticationProtocol
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagneticStripeReaderAuthenticationProtocol with Double] = js.native
  /* 1 */ @js.native
  object challengeResponse extends TopLevel[challengeResponse with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

