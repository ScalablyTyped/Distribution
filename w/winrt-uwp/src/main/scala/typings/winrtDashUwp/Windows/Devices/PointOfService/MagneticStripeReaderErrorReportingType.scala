package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MagneticStripeReaderErrorReportingType with Double] = js.native
  /* 0 */ @js.native
  object cardLevel extends TopLevel[cardLevel with Double]
  
  /* 1 */ @js.native
  object trackLevel extends TopLevel[trackLevel with Double]
  
}

