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
  
  val canceled: canceled with java.lang.String = js.native
  val completed: completed with java.lang.String = js.native
  val error: error with java.lang.String = js.native
  val started: started with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus with java.lang.String] = js.native
}

