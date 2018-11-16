package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables start, track, and end an asynchronous message delete operation for a single message. */
@JSGlobal("Windows.Devices.Sms.DeleteSmsMessageOperation")
@js.native
abstract class DeleteSmsMessageOperation () extends js.Object {
  /** Specifies whether the asynchronous SMS message delete operation has completed or not. */
  @JSName("completed")
  var completed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncActionCompletedHandler = js.native
  /** Specifies the error code for the asynchronous SMS message delete operation. */
  var errorCode: winrtDashUwpLib.WindowsNs.WinRTError = js.native
  /** Specifies the ID of the asynchronous SMS message delete operation. */
  var id: scala.Double = js.native
  /** Specifies the status of the asynchronous SMS message delete operation. */
  var status: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /** Cancels the asynchronous SMS message delete operation. */
  def cancel(): scala.Unit = js.native
  /** Closes the asynchronous SMS message delete operation. */
  def close(): scala.Unit = js.native
  /** Specifies whether the asynchronous SMS message delete operation has completed or not. */
  def completed(
    asyncInfo: winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncAction,
    asyncStatus: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  /** Retrieves the result of the asynchronous SMS message delete operation. */
  def getResults(): scala.Unit = js.native
}

