package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

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
  sealed trait assistanceRequired extends UnifiedPosErrorSeverity
  
  /** A fatal error. */
  @js.native
  sealed trait fatal extends UnifiedPosErrorSeverity
  
  /** A recoverable error. */
  @js.native
  sealed trait recoverable extends UnifiedPosErrorSeverity
  
  /** An unknown error severity. */
  @js.native
  sealed trait unknownErrorSeverity extends UnifiedPosErrorSeverity
  
  /** An unrecoverable error. */
  @js.native
  sealed trait unrecoverable extends UnifiedPosErrorSeverity
  
  /** A warning. */
  @js.native
  sealed trait warning extends UnifiedPosErrorSeverity
  
  /* 4 */ val assistanceRequired: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity.assistanceRequired with Double = js.native
  /* 5 */ val fatal: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity.fatal with Double = js.native
  /* 2 */ val recoverable: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity.recoverable with Double = js.native
  /* 0 */ val unknownErrorSeverity: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity.unknownErrorSeverity with Double = js.native
  /* 3 */ val unrecoverable: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity.unrecoverable with Double = js.native
  /* 1 */ val warning: typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs.UnifiedPosErrorSeverity.warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnifiedPosErrorSeverity with Double] = js.native
}

