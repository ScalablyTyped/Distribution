package typings.winrtDashUwp.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AsyncStatus extends js.Object

/** Specifies the status of an asynchronous operation. */
@JSGlobal("Windows.Foundation.AsyncStatus")
@js.native
object AsyncStatus extends js.Object {
  /** The operation was canceled. */
  @js.native
  sealed trait canceled extends AsyncStatus
  
  /** The operation has completed. */
  @js.native
  sealed trait completed extends AsyncStatus
  
  /** The operation has encountered an error. */
  @js.native
  sealed trait error extends AsyncStatus
  
  /** The operation has started. */
  @js.native
  sealed trait started extends AsyncStatus
  
  /* 0 */ val canceled: typings.winrtDashUwp.Windows.Foundation.AsyncStatus.canceled with Double = js.native
  /* 1 */ val completed: typings.winrtDashUwp.Windows.Foundation.AsyncStatus.completed with Double = js.native
  /* 2 */ val error: typings.winrtDashUwp.Windows.Foundation.AsyncStatus.error with Double = js.native
  /* 3 */ val started: typings.winrtDashUwp.Windows.Foundation.AsyncStatus.started with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AsyncStatus with Double] = js.native
}

