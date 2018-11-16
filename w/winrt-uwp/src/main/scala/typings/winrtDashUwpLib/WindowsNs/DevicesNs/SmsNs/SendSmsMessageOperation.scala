package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the sending of a message. */
@JSGlobal("Windows.Devices.Sms.SendSmsMessageOperation")
@js.native
abstract class SendSmsMessageOperation () extends js.Object {
  /** A handler for the completed event of an asynchronous action. */
  @JSName("completed")
  var completed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncActionCompletedHandler = js.native
  /** Specifies the error code for the asynchronous message operation. */
  var errorCode: winrtDashUwpLib.WindowsNs.WinRTError = js.native
  /** Indicates the ID of the asynchronous message operation. */
  var id: scala.Double = js.native
  /** Specifies the status of the asynchronous message operation. */
  var status: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /** Cancels the asynchronous operation. */
  def cancel(): scala.Unit = js.native
  /** Closes the asynchronous operation. */
  def close(): scala.Unit = js.native
  /** A handler for the completed event of an asynchronous action. */
  def completed(
    asyncInfo: winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncAction,
    asyncStatus: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  /** Retrieves the result of the asynchronous operation. */
  def getResults(): scala.Unit = js.native
}

