package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MagneticStripeReaderAuthenticationLevel extends js.Object

/** Defines the constants that indicates the level of support for magnetic stripe reader authentication protocol: NotSupported, Optional, or Required. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel")
@js.native
object MagneticStripeReaderAuthenticationLevel extends js.Object {
  /** Does not support authentication. */
  @js.native
  sealed trait notSupported
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderAuthenticationLevel
  
  /** Supports authentication, but does not require it. */
  @js.native
  sealed trait optional
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderAuthenticationLevel
  
  /** Requires authentication. */
  @js.native
  sealed trait required
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderAuthenticationLevel
  
  val notSupported: notSupported with java.lang.String = js.native
  val optional: optional with java.lang.String = js.native
  val required: required with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderAuthenticationLevel with java.lang.String
  ] = js.native
}

