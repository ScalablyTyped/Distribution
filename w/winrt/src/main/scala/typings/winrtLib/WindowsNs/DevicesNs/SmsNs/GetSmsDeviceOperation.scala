package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.GetSmsDeviceOperation")
@js.native
class GetSmsDeviceOperation ()
  extends winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SmsDevice]
     with winrtLib.WindowsNs.FoundationNs.IAsyncInfo {
  @JSName("completed")
  var completed_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationCompletedHandler[SmsDevice] = js.native
  /* CompleteClass */
  override var errorCode: scala.Double = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  @JSName("operation")
  var operation_GetSmsDeviceOperation: winrtLib.Anon_CompletedGetResultsAsyncOperationCompletedHandlerSmsDevice = js.native
  /* CompleteClass */
  override var status: winrtLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /* InferMemberOverrides */
  override def cancel(): scala.Unit = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def completed(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperation[SmsDevice],
    asyncStatus: winrtLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  def getResults(): SmsDevice = js.native
}

