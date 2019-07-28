package typings.winrtDashUwp.WindowsNs.DevicesNs.SmsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.AsyncActionCompletedHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.AsyncStatus
import typings.winrtDashUwp.WindowsNs.FoundationNs.IAsyncAction
import typings.winrtDashUwp.WindowsNs.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables the sending of a message. */
@JSGlobal("Windows.Devices.Sms.SendSmsMessageOperation")
@js.native
abstract class SendSmsMessageOperation () extends js.Object {
  /** A handler for the completed event of an asynchronous action. */
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler = js.native
  /** Specifies the error code for the asynchronous message operation. */
  var errorCode: WinRTError = js.native
  /** Indicates the ID of the asynchronous message operation. */
  var id: Double = js.native
  /** Specifies the status of the asynchronous message operation. */
  var status: AsyncStatus = js.native
  /** Cancels the asynchronous operation. */
  def cancel(): Unit = js.native
  /** Closes the asynchronous operation. */
  def close(): Unit = js.native
  /** A handler for the completed event of an asynchronous action. */
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
  /** Retrieves the result of the asynchronous operation. */
  def getResults(): Unit = js.native
}

