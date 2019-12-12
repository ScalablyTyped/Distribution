package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatus.authenticated
import typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatus.extended
import typings.winrtDashUwp.Windows.Devices.PointOfService.MagneticStripeReaderStatus.unauthenticated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MagneticStripeReaderStatus extends js.Object

/** Defines the constants that indicates the device authentication status. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderStatus")
@js.native
object MagneticStripeReaderStatus extends js.Object {
  /** An authenticated device. */
  @js.native
  sealed trait authenticated extends MagneticStripeReaderStatus
  
  /** Vendor specific status. */
  @js.native
  sealed trait extended extends MagneticStripeReaderStatus
  
  /** A device not authenticated. */
  @js.native
  sealed trait unauthenticated extends MagneticStripeReaderStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagneticStripeReaderStatus with Double] = js.native
  /* 1 */ @js.native
  object authenticated extends TopLevel[authenticated with Double]
  
  /* 2 */ @js.native
  object extended extends TopLevel[extended with Double]
  
  /* 0 */ @js.native
  object unauthenticated extends TopLevel[unauthenticated with Double]
  
}

