package typings.winrtUwp.Windows.Storage.Compression

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A compressor takes information written to a stream and compresses it using a compression algorithm. */
trait Compressor extends js.Object {
  /** Closes a Compressor object and synchronously discards any information in buffers. This will close the underlying stream as well unless the Compressor.Detach method has been used to detach the stream from the object. Subsequent calls on a closed object, except for Compressor.Close, will fail. */
  def close(): Unit
  /**
    * Detaches the underlying stream from the Compressor object so that the object can be closed using the Compressor.Close method without also closing the underlying stream.
    * @return The stream of information.
    */
  def detachStream(): IOutputStream
  /**
    * Finishes writing the compression stream.
    * @return The asynchronous operation.
    */
  def finishAsync(): IPromiseWithIAsyncOperation[Boolean]
  /**
    * Flushes the compression stream asynchronously.
    * @return The asynchronous operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean]
  /**
    * Writes information to the compression stream asynchronously.
    * @param buffer The buffer that contains the information to be written to the stream.
    * @return The asynchronous operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double]
}

object Compressor {
  @scala.inline
  def apply(
    close: () => Unit,
    detachStream: () => IOutputStream,
    finishAsync: () => IPromiseWithIAsyncOperation[Boolean],
    flushAsync: () => IPromiseWithIAsyncOperation[Boolean],
    writeAsync: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): Compressor = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), finishAsync = js.Any.fromFunction0(finishAsync), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[Compressor]
  }
}

