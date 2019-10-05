package typings.winrtDashUwp.Windows.Devices.Sms

import typings.winrtDashUwp.Windows.Foundation.AsyncActionCompletedHandler
import typings.winrtDashUwp.Windows.Foundation.AsyncStatus
import typings.winrtDashUwp.Windows.Foundation.IAsyncAction
import typings.winrtDashUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables start, track, and end asynchronous SMS message delete operations for multiple messages. */
@JSGlobal("Windows.Devices.Sms.DeleteSmsMessagesOperation")
@js.native
abstract class DeleteSmsMessagesOperation () extends js.Object {
  /** Specifies whether the asynchronous SMS message delete operations have completed or not. */
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler = js.native
  /** Specifies the error code for the asynchronous SMS message delete operations. */
  var errorCode: WinRTError = js.native
  /** Specifies the ID of the asynchronous SMS message delete operations. */
  var id: Double = js.native
  /** Specifies the status of the asynchronous SMS message delete operations. */
  var status: AsyncStatus = js.native
  /** Cancels the asynchronous SMS message delete operations. */
  def cancel(): Unit = js.native
  /** Closes the asynchronous SMS message delete operations. */
  def close(): Unit = js.native
  /** Specifies whether the asynchronous SMS message delete operations have completed or not. */
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
  /** Retrieves the result of the asynchronous message operations. */
  def getResults(): Unit = js.native
}

