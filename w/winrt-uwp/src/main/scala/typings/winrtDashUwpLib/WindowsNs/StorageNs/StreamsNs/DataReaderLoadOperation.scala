package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Loads data from an input stream. */
@JSGlobal("Windows.Storage.Streams.DataReaderLoadOperation")
@js.native
abstract class DataReaderLoadOperation () extends js.Object {
  /** Gets or sets the handler to call when the data load operation is complete. */
  @JSName("completed")
  var completed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncOperationCompletedHandler[scala.Double] = js.native
  /** Gets the error code for the data load operation if it fails. */
  var errorCode: winrtDashUwpLib.WindowsNs.WinRTError = js.native
  /** Gets a unique identifier that represents the data load operation. */
  var id: scala.Double = js.native
  /** Gets the current status of the data load operation. */
  var status: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus = js.native
  /** Requests the cancellation of the data load operation. */
  def cancel(): scala.Unit = js.native
  /** Requests that work associated with the data load operation should stop. */
  def close(): scala.Unit = js.native
  /** Gets or sets the handler to call when the data load operation is complete. */
  def completed(
    asyncInfo: winrtDashUwpLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Double],
    asyncStatus: winrtDashUwpLib.WindowsNs.FoundationNs.AsyncStatus
  ): scala.Unit = js.native
  /**
    * Returns the result of the data load operation.
    * @return The result of the operation.
    */
  def getResults(): scala.Double = js.native
}

