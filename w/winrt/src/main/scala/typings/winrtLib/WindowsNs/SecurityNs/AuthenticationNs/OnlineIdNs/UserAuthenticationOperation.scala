package typings
package winrtLib.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Authentication.OnlineId.UserAuthenticationOperation")
@js.native
class UserAuthenticationOperation ()
  extends winrtLib.WindowsNs.FoundationNs.IAsyncOperation[UserIdentity]
     with winrtLib.WindowsNs.FoundationNs.IAsyncInfo {
  @JSName("completed")
  var completed_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationCompletedHandler[UserIdentity] = js.native
  /* CompleteClass */
  override var errorCode: scala.Double = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  @JSName("operation")
  var operation_UserAuthenticationOperation: winrtLib.Anon_AsyncInfoAsyncStatusCompletedGetResultsAsyncOperationCompletedHandlerIAsyncOperation = js.native
  /* CompleteClass */
  override var status: winrtLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /* InferMemberOverrides */
  override def cancel(): scala.Unit = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def completed(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperation[UserIdentity],
    asyncStatus: winrtLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  def getResults(): UserIdentity = js.native
}

