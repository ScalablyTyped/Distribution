package typings.winrt.WindowsNs.DevicesNs.SmsNs

import typings.winrt.Anon_CompletedGetResultsAsyncOperationCompletedHandler
import typings.winrt.WindowsNs.FoundationNs.AsyncOperationCompletedHandler
import typings.winrt.WindowsNs.FoundationNs.AsyncStatus
import typings.winrt.WindowsNs.FoundationNs.IAsyncInfo
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.GetSmsMessageOperation")
@js.native
class GetSmsMessageOperation ()
  extends IAsyncOperation[ISmsMessage]
     with IAsyncInfo {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[ISmsMessage] = js.native
  /* CompleteClass */
  override var errorCode: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  @JSName("operation")
  var operation_GetSmsMessageOperation: Anon_CompletedGetResultsAsyncOperationCompletedHandler = js.native
  /* CompleteClass */
  override var status: AsyncStatus = js.native
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  def completed(asyncInfo: IAsyncOperation[ISmsMessage], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): ISmsMessage = js.native
}

