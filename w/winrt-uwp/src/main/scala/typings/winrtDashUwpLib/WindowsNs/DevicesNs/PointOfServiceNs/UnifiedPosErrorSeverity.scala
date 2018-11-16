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
  
  val assistanceRequired: assistanceRequired with java.lang.String = js.native
  val fatal: fatal with java.lang.String = js.native
  val recoverable: recoverable with java.lang.String = js.native
  val unknownErrorSeverity: unknownErrorSeverity with java.lang.String = js.native
  val unrecoverable: unrecoverable with java.lang.String = js.native
  val warning: warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity with java.lang.String
  ] = js.native
}

