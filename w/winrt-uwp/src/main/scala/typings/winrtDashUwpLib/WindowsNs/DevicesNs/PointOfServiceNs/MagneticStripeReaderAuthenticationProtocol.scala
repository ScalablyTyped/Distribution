package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait challengeResponse
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderAuthenticationProtocol
  
  /** The device does not support device authentication. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderAuthenticationProtocol
  
  val challengeResponse: challengeResponse with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderAuthenticationProtocol with java.lang.String
  ] = js.native
}

