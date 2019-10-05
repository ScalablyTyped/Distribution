package typings.winrtDashUwp.Windows.Devices.PointOfService

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
  sealed trait notSupported extends MagneticStripeReaderAuthenticationLevel
  
  /** Supports authentication, but does not require it. */
  @js.native
  sealed trait optional extends MagneticStripeReaderAuthenticationLevel
  
  /** Requires authentication. */
  @js.native
  sealed trait required extends MagneticStripeReaderAuthenticationLevel
  
  /* 0 */ val notSupported: typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel.notSupported with Double = js.native
  /* 1 */ val optional: typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel.optional with Double = js.native
  /* 2 */ val required: typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel.required with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagneticStripeReaderAuthenticationLevel with Double] = js.native
}

