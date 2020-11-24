package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.AsyncActionCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables start, track, and end asynchronous SMS message delete operations for multiple messages. */
@js.native
trait DeleteSmsMessagesOperation extends js.Object {
  
  /** Cancels the asynchronous SMS message delete operations. */
  def cancel(): Unit = js.native
  
  /** Closes the asynchronous SMS message delete operations. */
  def close(): Unit = js.native
  
  /** Specifies whether the asynchronous SMS message delete operations have completed or not. */
  def completed(asyncInfo: IAsyncAction, asyncStatus: AsyncStatus): Unit = js.native
  /** Specifies whether the asynchronous SMS message delete operations have completed or not. */
  @JSName("completed")
  var completed_Original: AsyncActionCompletedHandler = js.native
  
  /** Specifies the error code for the asynchronous SMS message delete operations. */
  var errorCode: WinRTError = js.native
  
  /** Retrieves the result of the asynchronous message operations. */
  def getResults(): Unit = js.native
  
  /** Specifies the ID of the asynchronous SMS message delete operations. */
  var id: Double = js.native
  
  /** Specifies the status of the asynchronous SMS message delete operations. */
  var status: AsyncStatus = js.native
}
