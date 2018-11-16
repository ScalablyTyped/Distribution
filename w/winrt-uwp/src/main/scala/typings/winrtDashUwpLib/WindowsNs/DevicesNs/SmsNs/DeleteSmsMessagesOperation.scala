package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables start, track, and end asynchronous SMS message delete operations for multiple messages. */
@JSGlobal("Windows.Devices.Sms.DeleteSmsMessagesOperation")
@js.native
abstract class DeleteSmsMessagesOperation () extends js.Object {
  /** Specifies whether the asynchronous SMS message delete operations have completed or not. */
  @JSName("completed")
  var completed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncActionCompletedHandler = js.native
  /** Specifies the error code for the asynchronous SMS message delete operations. */
  var errorCode: winrtDashUwpLib.WindowsNs.WinRTError = js.native
  /** Specifies the ID of the asynchronous SMS message delete operations. */
  var id: scala.Double = js.native
  /** Specifies the status of the asynchronous SMS message delete operations. */
  var status: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /** Cancels the asynchronous SMS message delete operations. */
  def cancel(): scala.Unit = js.native
  /** Closes the asynchronous SMS message delete operations. */
  def close(): scala.Unit = js.native
  /** Specifies whether the asynchronous SMS message delete operations have completed or not. */
  def completed(
    asyncInfo: winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncAction,
    asyncStatus: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  /** Retrieves the result of the asynchronous message operations. */
  def getResults(): scala.Unit = js.native
}

