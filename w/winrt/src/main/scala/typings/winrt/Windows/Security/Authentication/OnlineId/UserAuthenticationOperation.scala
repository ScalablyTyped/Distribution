package typings.winrt.Windows.Security.Authentication.OnlineId

import typings.winrt.Anon_CompletedGetResultsAsyncOperationCompletedHandlerUserIdentity
import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncInfo
import typings.winrt.Windows.Foundation.IAsyncOperation
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

