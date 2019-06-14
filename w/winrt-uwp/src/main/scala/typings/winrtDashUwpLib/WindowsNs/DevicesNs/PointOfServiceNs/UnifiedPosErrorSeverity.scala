package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnifiedPosErrorSeverity extends js.Object

/** Defines the constants that indicates the error severity. */
@JSGlobal("Windows.Devices.PointOfService.UnifiedPosErrorSeverity")
@js.native
object UnifiedPosErrorSeverity extends js.Object {
  /** Requires assistance. */
  @js.native
  sealed trait assistanceRequired
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity
  
  /** A fatal error. */
  @js.native
  sealed trait fatal
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity
  
  /** A recoverable error. */
  @js.native
  sealed trait recoverable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity
  
  /** An unknown error severity. */
  @js.native
  sealed trait unknownErrorSeverity
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity
  
  /** An unrecoverable error. */
  @js.native
  sealed trait unrecoverable
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity
  
  /** A warning. */
  @js.native
  sealed trait warning
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity
  
  /* 4 */ val assistanceRequired: assistanceRequired with scala.Double = js.native
  /* 5 */ val fatal: fatal with scala.Double = js.native
  /* 2 */ val recoverable: recoverable with scala.Double = js.native
  /* 0 */ val unknownErrorSeverity: unknownErrorSeverity with scala.Double = js.native
  /* 3 */ val unrecoverable: unrecoverable with scala.Double = js.native
  /* 1 */ val warning: warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity with scala.Double
  ] = js.native
}

