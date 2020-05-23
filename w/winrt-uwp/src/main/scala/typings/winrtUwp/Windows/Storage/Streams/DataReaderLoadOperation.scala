package typings.winrtUwp.Windows.Storage.Streams

import typings.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.IAsyncOperation
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Loads data from an input stream. */
@js.native
trait DataReaderLoadOperation extends js.Object {
  /** Gets or sets the handler to call when the data load operation is complete. */
  @JSName("completed")
  var completed_Original: AsyncOperationCompletedHandler[Double] = js.native
  /** Gets the error code for the data load operation if it fails. */
  var errorCode: WinRTError = js.native
  /** Gets a unique identifier that represents the data load operation. */
  var id: Double = js.native
  /** Gets the current status of the data load operation. */
  var status: AsyncStatus = js.native
  /** Requests the cancellation of the data load operation. */
  def cancel(): Unit = js.native
  /** Requests that work associated with the data load operation should stop. */
  def close(): Unit = js.native
  /** Gets or sets the handler to call when the data load operation is complete. */
  def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit = js.native
  /**
    * Returns the result of the data load operation.
    * @return The result of the operation.
    */
  def getResults(): Double = js.native
}

