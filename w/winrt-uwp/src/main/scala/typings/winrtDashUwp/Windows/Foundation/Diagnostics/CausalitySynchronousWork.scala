package typings.winrtDashUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork.completionNotification
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork.execution
import typings.winrtDashUwp.Windows.Foundation.Diagnostics.CausalitySynchronousWork.progressNotification
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CausalitySynchronousWork with Double] = js.native
  /* 0 */ @js.native
  object completionNotification extends TopLevel[completionNotification with Double]
  
  /* 2 */ @js.native
  object execution extends TopLevel[execution with Double]
  
  /* 1 */ @js.native
  object progressNotification extends TopLevel[progressNotification with Double]
  
}

