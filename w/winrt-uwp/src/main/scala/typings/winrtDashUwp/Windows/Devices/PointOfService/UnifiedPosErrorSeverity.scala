package typings.winrtDashUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UnifiedPosErrorSeverity with Double] = js.native
  /* 4 */ @js.native
  object assistanceRequired extends TopLevel[assistanceRequired with Double]
  
  /* 5 */ @js.native
  object fatal extends TopLevel[fatal with Double]
  
  /* 2 */ @js.native
  object recoverable extends TopLevel[recoverable with Double]
  
  /* 0 */ @js.native
  object unknownErrorSeverity extends TopLevel[unknownErrorSeverity with Double]
  
  /* 3 */ @js.native
  object unrecoverable extends TopLevel[unrecoverable with Double]
  
  /* 1 */ @js.native
  object warning extends TopLevel[warning with Double]
  
}

