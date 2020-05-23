package typings.winrtUwp.Windows.Devices.PointOfService

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
  
}

