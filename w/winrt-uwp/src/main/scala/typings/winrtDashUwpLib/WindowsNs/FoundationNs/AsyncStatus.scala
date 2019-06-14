package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

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
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  
  /** The operation has completed. */
  @js.native
  sealed trait completed
    extends winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  
  /** The operation has encountered an error. */
  @js.native
  sealed trait error
    extends winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  
  /** The operation has started. */
  @js.native
  sealed trait started
    extends winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  
  /* 0 */ val canceled: canceled with scala.Double = js.native
  /* 1 */ val completed: completed with scala.Double = js.native
  /* 2 */ val error: error with scala.Double = js.native
  /* 3 */ val started: started with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus with scala.Double] = js.native
}

