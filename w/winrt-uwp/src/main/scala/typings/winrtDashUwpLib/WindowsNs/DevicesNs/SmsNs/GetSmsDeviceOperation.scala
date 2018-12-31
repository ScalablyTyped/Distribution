package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Retrieves an SmsDevice object asynchronously. */
@JSGlobal("Windows.Devices.Sms.GetSmsDeviceOperation")
@js.native
abstract class GetSmsDeviceOperation () extends js.Object {
  /** Specifies whether the asynchronous SmsDevice object retrieval operation has completed or not. */
  @JSName("completed")
  var completed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncOperationCompletedHandler[SmsDevice] = js.native
  /** Specifies the error code for the asynchronous SmsDevice object retrieval operation */
  var errorCode: winrtDashUwpLib.WindowsNs.WinRTError = js.native
  /** Specifies the ID of the asynchronous SmsDevice object retrieval operation. */
  var id: scala.Double = js.native
  /** Specifies the status of the asynchronous SmsDevice object retrieval operation. */
  var status: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /** Cancels the asynchronous SmsDevice object retrieval. */
  def cancel(): scala.Unit = js.native
  /** Closes the asynchronous SmsDevice object retrieval operation. */
  def close(): scala.Unit = js.native
  /** Specifies whether the asynchronous SmsDevice object retrieval operation has completed or not. */
  def completed(
    asyncInfo: winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncOperation[SmsDevice],
    asyncStatus: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  /**
    * Gets the results of the asynchronous SmsDevice object retrieval operation.
    * @return A reference to an SmsDevice object.
    */
  def getResults(): SmsDevice = js.native
}

