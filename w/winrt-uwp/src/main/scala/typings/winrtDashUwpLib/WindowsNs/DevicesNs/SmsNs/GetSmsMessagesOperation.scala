package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the retrieval of messages. */
@JSGlobal("Windows.Devices.Sms.GetSmsMessagesOperation")
@js.native
abstract class GetSmsMessagesOperation () extends js.Object {
  /** Specifies whether the asynchronous message retrieval operation has completed or not. */
  @JSName("completed")
  var completed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncOperationWithProgressCompletedHandler[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_], scala.Double] = js.native
  /** Specifies the error code for the asynchronous message operation. */
  var errorCode: winrtDashUwpLib.WindowsNs.WinRTError = js.native
  /** Indicates the ID of the asynchronous message operation. */
  var id: scala.Double = js.native
  /** Specifies the progress status of the asynchronous message operation. */
  @JSName("progress")
  var progress_Original: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncOperationProgressHandler[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_], scala.Double] = js.native
  /** Specifies the status of the asynchronous message operations. */
  var status: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /** Cancels the asynchronous operations. */
  def cancel(): scala.Unit = js.native
  /** Closes the asynchronous operations. */
  def close(): scala.Unit = js.native
  /** Specifies whether the asynchronous message retrieval operation has completed or not. */
  def completed(
    asyncInfo: winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_], scala.Double],
    asyncStatus: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  /**
                   * Retrieves the result of the asynchronous message retrieval operation.
                   * @return A reference to the SMS messages retrieved.
                   */
  def getResults(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsMessage] = js.native
  /** Specifies the progress status of the asynchronous message operation. */
  def progress(
    asyncInfo: winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_], scala.Double],
    progressInfo: scala.Double
  ): scala.Unit = js.native
}

