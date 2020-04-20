package typings.winrtUwp.Windows.Storage.Streams

import typings.winrtUwp.Windows.Foundation.IClosable
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sequential stream of bytes to be written. */
trait IOutputStream extends IClosable {
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean]
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer A buffer that contains the data to be written.
    * @return The byte writer operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double]
}

object IOutputStream {
  @scala.inline
  def apply(
    close: () => Unit,
    flushAsync: () => IPromiseWithIAsyncOperation[Boolean],
    writeAsync: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): IOutputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[IOutputStream]
  }
}

