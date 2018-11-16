package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows users to sign out of your app. */
@JSGlobal("Windows.Security.Authentication.OnlineId.SignOutUserOperation")
@js.native
abstract class SignOutUserOperation () extends js.Object {
  /** Gets or sets a handler that is called when the operation completes. */
  @JSName("completed")
  var completed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncActionCompletedHandler = js.native
  /** Gets the error code should the operation fail. */
  var errorCode: winrtDashUwpLib.WindowsNs.WinRTError = js.native
  /** Gets a unique identifier that represents the operation. */
  var id: scala.Double = js.native
  /** Gets the current status of the operation. */
  var status: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /** Requests the cancellation of the operation. */
  def cancel(): scala.Unit = js.native
  /** Requests that work associated with the operation should terminate. */
  def close(): scala.Unit = js.native
  /** Gets or sets a handler that is called when the operation completes. */
  def completed(
    asyncInfo: winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncAction,
    asyncStatus: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  /** Returns the results of the operation. For this class, there are no results to return if the operation succeeds. */
  def getResults(): scala.Unit = js.native
}

