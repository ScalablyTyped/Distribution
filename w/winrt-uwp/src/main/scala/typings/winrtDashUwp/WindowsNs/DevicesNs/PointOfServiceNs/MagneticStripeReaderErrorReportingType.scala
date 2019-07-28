package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MagneticStripeReaderErrorReportingType extends js.Object

/** Defines the constants that indicates the error reporting type for the device. */
@JSGlobal("Windows.Devices.PointOfService.MagneticStripeReaderErrorReportingType")
@js.native
object MagneticStripeReaderErrorReportingType extends js.Object {
  /** Report errors at the card level. */
  @js.native
  sealed trait cardLevel extends MagneticStripeReaderErrorReportingType
  
  /** Report errors at the track level. */
  @js.native
  sealed trait trackLevel extends MagneticStripeReaderErrorReportingType
  
  /* 0 */ val cardLevel: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderErrorReportingType.cardLevel with Double = js.native
  /* 1 */ val trackLevel: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderErrorReportingType.trackLevel with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagneticStripeReaderErrorReportingType with Double] = js.native
}

