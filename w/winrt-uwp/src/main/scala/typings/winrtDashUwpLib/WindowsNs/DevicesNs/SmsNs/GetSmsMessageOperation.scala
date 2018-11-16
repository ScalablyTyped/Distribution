package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports the retrieval of a message from the SMS message store. */
@JSGlobal("Windows.Devices.Sms.GetSmsMessageOperation")
@js.native
abstract class GetSmsMessageOperation () extends js.Object {
  /** A handler for the completed event of an asynchronous SMS message retrieval operation. */
  @JSName("completed")
  var completed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncOperationCompletedHandler[ISmsMessage] = js.native
  /** Specifies the error code for the asynchronous SMS message retrieval operation. */
  var errorCode: winrtDashUwpLib.WindowsNs.WinRTError = js.native
  /** Specifies the ID of the asynchronous SMS message retrieval operation. */
  var id: scala.Double = js.native
  /** Specifies the status of the asynchronous SMS message retrieval operation. */
  var status: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /** Cancels the asynchronous SMS message retrieval operation. */
  def cancel(): scala.Unit = js.native
  /** Closes the asynchronous SMS message retrieval operation. */
  def close(): scala.Unit = js.native
  /** A handler for the completed event of an asynchronous SMS message retrieval operation. */
  def completed(
    asyncInfo: winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncOperation[ISmsMessage],
    asyncStatus: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  /**
                   * Retrieves the result of the asynchronous SMS message retrieval operation.
                   * @return An interface that accesses the retrieved message.
                   */
  def getResults(): ISmsMessage = js.native
}

