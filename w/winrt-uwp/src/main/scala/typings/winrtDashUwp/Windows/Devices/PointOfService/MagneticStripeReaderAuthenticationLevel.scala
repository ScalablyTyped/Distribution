package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel.notSupported
import typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel.optional
import typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel.required
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagneticStripeReaderAuthenticationLevel with Double] = js.native
  /* 0 */ @js.native
  object notSupported extends TopLevel[notSupported with Double]
  
  /* 1 */ @js.native
  object optional extends TopLevel[optional with Double]
  
  /* 2 */ @js.native
  object required extends TopLevel[required with Double]
  
}

