package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

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
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferPriority
  
  /** High priority setting for an operation. Ensures that the operation doesn't get placed at the very end of the queue, and is instead placed near the front. */
  @js.native
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferPriority
  
  val default: default with java.lang.String = js.native
  val high: high with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferPriority with java.lang.String
  ] = js.native
}

