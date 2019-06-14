package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CausalitySynchronousWork extends js.Object

/** Indicates the relationship between a work item and an asynchronous operation. */
@JSGlobal("Windows.Foundation.Diagnostics.CausalitySynchronousWork")
@js.native
object CausalitySynchronousWork extends js.Object {
  /** The work item being scheduled is running due to the completion of the asynchronous operation. */
  @js.native
  sealed trait completionNotification
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalitySynchronousWork
  
  /** The work item being scheduled is part of the actual work of the asynchronous operation, like opening a file. */
  @js.native
  sealed trait execution
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalitySynchronousWork
  
  /** The work item being scheduled is running due to reaching a milestone within the asynchronous operation. */
  @js.native
  sealed trait progressNotification
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalitySynchronousWork
  
  /* 0 */ val completionNotification: completionNotification with scala.Double = js.native
  /* 2 */ val execution: execution with scala.Double = js.native
  /* 1 */ val progressNotification: progressNotification with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.CausalitySynchronousWork with scala.Double
  ] = js.native
}

