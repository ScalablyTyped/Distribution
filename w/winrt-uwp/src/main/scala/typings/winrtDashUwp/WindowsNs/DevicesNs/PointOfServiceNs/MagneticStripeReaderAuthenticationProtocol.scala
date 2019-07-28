package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

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
  
  /* 1 */ val challengeResponse: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderAuthenticationProtocol.challengeResponse with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderAuthenticationProtocol.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagneticStripeReaderAuthenticationProtocol with Double] = js.native
}

