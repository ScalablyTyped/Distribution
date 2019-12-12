package typings.winrtDashUwp.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority.default
import typings.winrtDashUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferPriority.high
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundTransferPriority extends js.Object

/** Defines the values used to indicate the priority of a download or upload operation when within a BackgroundTransferGroup . */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferPriority")
@js.native
object BackgroundTransferPriority extends js.Object {
  /** Default priority setting for an operation. By default when a new operation is created, it is placed at the end of the current transfer queue. */
  @js.native
  sealed trait default extends BackgroundTransferPriority
  
  /** High priority setting for an operation. Ensures that the operation doesn't get placed at the very end of the queue, and is instead placed near the front. */
  @js.native
  sealed trait high extends BackgroundTransferPriority
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BackgroundTransferPriority with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object high extends TopLevel[high with Double]
  
}

