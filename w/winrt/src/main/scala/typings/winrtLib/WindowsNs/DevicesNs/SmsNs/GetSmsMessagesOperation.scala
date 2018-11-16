package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Sms.GetSmsMessagesOperation")
@js.native
class GetSmsMessagesOperation ()
  extends winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsMessage], 
      scala.Double
    ]
     with winrtLib.WindowsNs.FoundationNs.IAsyncInfo {
  @JSName("completed")
  var completed_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationWithProgressCompletedHandler[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsMessage], 
    scala.Double
  ] = js.native
  /* CompleteClass */
  override var errorCode: scala.Double = js.native
  /* CompleteClass */
  override var id: scala.Double = js.native
  @JSName("operation")
  var operation_GetSmsMessagesOperation: winrtLib.Anon_Progress = js.native
  @JSName("progress")
  var progress_Original: winrtLib.WindowsNs.FoundationNs.AsyncOperationProgressHandler[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsMessage], 
    scala.Double
  ] = js.native
  /* CompleteClass */
  override var status: winrtLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /* InferMemberOverrides */
  override def cancel(): scala.Unit = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def completed(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsMessage], 
      scala.Double
    ],
    asyncStatus: winrtLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  def getResults(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsMessage] = js.native
  def progress(
    asyncInfo: winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsMessage], 
      scala.Double
    ],
    progressInfo: scala.Double
  ): scala.Unit = js.native
}

