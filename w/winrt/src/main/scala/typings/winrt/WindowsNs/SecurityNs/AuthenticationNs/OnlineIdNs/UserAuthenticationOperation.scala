package typings.winrt.WindowsNs.SecurityNs.AuthenticationNs.OnlineIdNs

import typings.winrt.Anon_CompletedGetResultsAsyncOperationCompletedHandlerUserIdentity
import typings.winrt.WindowsNs.FoundationNs.AsyncOperationCompletedHandler
import typings.winrt.WindowsNs.FoundationNs.AsyncStatus
import typings.winrt.WindowsNs.FoundationNs.IAsyncInfo
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Security.Authentication.OnlineId.UserAuthenticationOperation")
@js.native
class UserAuthenticationOperation ()
  extends IAsyncOperation[UserIdentity]
     with IAsyncInfo {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[UserIdentity] = js.native
  /* CompleteClass */
  override var errorCode: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  @JSName("operation")
  var operation_UserAuthenticationOperation: Anon_CompletedGetResultsAsyncOperationCompletedHandlerUserIdentity = js.native
  /* CompleteClass */
  override var status: AsyncStatus = js.native
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  def completed(asyncInfo: IAsyncOperation[UserIdentity], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): UserIdentity = js.native
}

