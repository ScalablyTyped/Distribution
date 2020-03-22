package typings.winrt.Windows.Devices.Sms

import typings.winrt.AnonCompletedAsyncOperationCompletedHandlerGetResults
import typings.winrt.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrt.Windows.Foundation.AsyncStatus
import typings.winrt.Windows.Foundation.IAsyncInfo
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.GetSmsDeviceOperation")
@js.native
class GetSmsDeviceOperation ()
  extends IAsyncOperation[SmsDevice]
     with IAsyncInfo {
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[SmsDevice] = js.native
  /* CompleteClass */
  override var errorCode: Double = js.native
  /* CompleteClass */
  override var id: Double = js.native
  @JSName("operation")
  var operation_GetSmsDeviceOperation: AnonCompletedAsyncOperationCompletedHandlerGetResults = js.native
  /* CompleteClass */
  override var status: AsyncStatus = js.native
  /* InferMemberOverrides */
  override def cancel(): Unit = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  def completed(asyncInfo: IAsyncOperation[SmsDevice], asyncStatus: AsyncStatus): Unit = js.native
  def getResults(): SmsDevice = js.native
}

