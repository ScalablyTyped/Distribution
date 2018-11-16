package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait cardLevel
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderErrorReportingType
  
  /** Report errors at the track level. */
  @js.native
  sealed trait trackLevel
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderErrorReportingType
  
  val cardLevel: cardLevel with java.lang.String = js.native
  val trackLevel: trackLevel with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.MagneticStripeReaderErrorReportingType with java.lang.String
  ] = js.native
}

