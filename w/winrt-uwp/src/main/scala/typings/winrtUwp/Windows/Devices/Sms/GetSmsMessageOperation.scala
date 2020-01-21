package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.IAsyncOperation
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the retrieval of a message from the SMS message store. */
@JSGlobal("Windows.Devices.Sms.GetSmsMessageOperation")
@js.native
abstract class GetSmsMessageOperation () extends js.Object {
  /** A handler for the completed event of an asynchronous SMS message retrieval operation. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[ISmsMessage] = js.native
  /** Specifies the error code for the asynchronous SMS message retrieval operation. */
  var errorCode: WinRTError = js.native
  /** Specifies the ID of the asynchronous SMS message retrieval operation. */
  var id: Double = js.native
  /** Specifies the status of the asynchronous SMS message retrieval operation. */
  var status: AsyncStatus = js.native
  /** Cancels the asynchronous SMS message retrieval operation. */
  def cancel(): Unit = js.native
  /** Closes the asynchronous SMS message retrieval operation. */
  def close(): Unit = js.native
  /** A handler for the completed event of an asynchronous SMS message retrieval operation. */
  def completed(asyncInfo: IAsyncOperation[ISmsMessage], asyncStatus: AsyncStatus): Unit = js.native
  /**
    * Retrieves the result of the asynchronous SMS message retrieval operation.
    * @return An interface that accesses the retrieved message.
    */
  def getResults(): ISmsMessage = js.native
}

