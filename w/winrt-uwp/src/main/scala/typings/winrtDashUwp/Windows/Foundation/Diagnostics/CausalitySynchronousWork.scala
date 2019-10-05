package typings.winrtDashUwp.Windows.Foundation.Diagnostics

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
  sealed trait completionNotification extends CausalitySynchronousWork
  
  /** The work item being scheduled is part of the actual work of the asynchronous operation, like opening a file. */
  @js.native
  sealed trait execution extends CausalitySynchronousWork
  
  /** The work item being scheduled is running due to reaching a milestone within the asynchronous operation. */
  @js.native
  sealed trait progressNotification extends CausalitySynchronousWork
  
  /* 0 */ val completionNotification: typings.winrtDashUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork.completionNotification with Double = js.native
  /* 2 */ val execution: typings.winrtDashUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork.execution with Double = js.native
  /* 1 */ val progressNotification: typings.winrtDashUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork.progressNotification with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CausalitySynchronousWork with Double] = js.native
}

