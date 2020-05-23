package typings.winrtUwp.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a write transaction for a random-access stream. */
trait StorageStreamTransaction extends js.Object {
  /** Gets the random-access stream used in the transaction. */
  var stream: IRandomAccessStream
  /** Releases system resources that are exposed by the stream, indicating that the data request is complete. */
  def close(): Unit
  /**
    * Save the stream to the underlying file.
    * @return No object or value is returned by this method.
    */
  def commitAsync(): IPromiseWithIAsyncAction
}

object StorageStreamTransaction {
  @scala.inline
  def apply(close: () => Unit, commitAsync: () => IPromiseWithIAsyncAction, stream: IRandomAccessStream): StorageStreamTransaction = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), commitAsync = js.Any.fromFunction0(commitAsync), stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageStreamTransaction]
  }
}

