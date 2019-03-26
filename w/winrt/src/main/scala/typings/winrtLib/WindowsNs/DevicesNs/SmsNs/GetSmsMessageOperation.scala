package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.GetSmsMessageOperation")
@js.native
class GetSmsMessageOperation ()
  extends winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ISmsMessage]
     with winrtLib.WindowsNs.FoundationNs.IAsyncInfo {
  @JSName("completed")
  var completed_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationCompletedHandler[ISmsMessage] = js.native
  /* CompleteClass */
  override var errorCode: scala.Double = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  @JSName("operation")
  var operation_GetSmsMessageOperation: winrtLib.Anon_CompletedGetResultsAsyncOperationCompletedHandler = js.native
  /* CompleteClass */
  override var status: winrtLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /* InferMemberOverrides */
  override def cancel(): scala.Unit = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def completed(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ISmsMessage],
    asyncStatus: winrtLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  def getResults(): ISmsMessage = js.native
}

