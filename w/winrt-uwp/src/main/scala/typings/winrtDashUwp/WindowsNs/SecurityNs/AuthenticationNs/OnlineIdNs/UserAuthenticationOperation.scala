package typings.winrtDashUwp.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.AsyncOperationCompletedHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.AsyncStatus
import typings.winrtDashUwp.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrtDashUwp.WindowsNs.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Asynchronously gets the user's identity and corresponding tickets and properties. */
@JSGlobal("Windows.Security.Authentication.OnlineId.UserAuthenticationOperation")
@js.native
abstract class UserAuthenticationOperation () extends js.Object {
  /** Gets or sets a handler that's called when the operation completes. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[UserIdentity] = js.native
  /** Gets the error code should the operation fail. */
  var errorCode: WinRTError = js.native
  /** Gets a unique identifier that represents the operation. */
  var id: Double = js.native
  /** Gets the current status of the operation. */
  var status: AsyncStatus = js.native
  /** Requests the cancellation of the operation. */
  def cancel(): Unit = js.native
  /** Requests that work associated with the operation should terminate. */
  def close(): Unit = js.native
  /** Gets or sets a handler that's called when the operation completes. */
  def completed(asyncInfo: IAsyncOperation[UserIdentity], asyncStatus: AsyncStatus): Unit = js.native
  /**
    * Returns a UserIdentity object that contains information about the user.
    * @return An object containing information about the user's identity.
    */
  def getResults(): UserIdentity = js.native
}

