package typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.AsyncOperationCompletedHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.AsyncStatus
import typings.winrtDashUwp.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrtDashUwp.WindowsNs.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Commits data in a buffer to a backing store. */
@JSGlobal("Windows.Storage.Streams.DataWriterStoreOperation")
@js.native
abstract class DataWriterStoreOperation () extends js.Object {
  /** Gets or sets the handler to call when the data store operation is complete. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Double] = js.native
  /** Gets the error code for the data store operation if it fails. */
  var errorCode: WinRTError = js.native
  /** Gets a unique identifier that represents the data store operation. */
  var id: Double = js.native
  /** Gets the current status of the data store operation. */
  var status: AsyncStatus = js.native
  /** Requests the cancellation of the data store operation. */
  def cancel(): Unit = js.native
  /** Requests that work associated with the data store operation should stop. */
  def close(): Unit = js.native
  /** Gets or sets the handler to call when the data store operation is complete. */
  def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit = js.native
  /**
    * Returns the result of the data store operation.
    * @return The result of the operation.
    */
  def getResults(): Double = js.native
}

