package typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Supports random access of data in input and output streams. */
trait IRandomAccessStream
  extends IInputStream
     with IOutputStream {
  /** Gets a value that indicates whether the stream can be read from. */
  var canRead: Boolean
  /** Gets a value that indicates whether the stream can be written to. */
  var canWrite: Boolean
  /** Gets the byte offset of the stream. */
  var position: Double
  /** Gets or sets the size of the random access stream. */
  var size: Double
  /**
    * Creates a new instance of a IRandomAccessStream over the same resource as the current stream.
    * @return The new stream. The initial, internal position of the stream is 0.
    */
  def cloneStream(): IRandomAccessStream
  /**
    * Returns an input stream at a specified location in a stream.
    * @param position The location in the stream at which to begin.
    * @return The input stream.
    */
  def getInputStreamAt(position: Double): IInputStream
  /**
    * Returns an output stream at a specified location in a stream.
    * @param position The location in the output stream at which to begin.
    * @return The output stream.
    */
  def getOutputStreamAt(position: Double): IOutputStream
  /**
    * Sets the position of the stream to the specified value.
    * @param position The new position of the stream.
    */
  def seek(position: Double): Unit
}

object IRandomAccessStream {
  @scala.inline
  def apply(
    canRead: Boolean,
    canWrite: Boolean,
    cloneStream: () => IRandomAccessStream,
    close: () => Unit,
    flushAsync: () => IPromiseWithIAsyncOperation[Boolean],
    getInputStreamAt: Double => IInputStream,
    getOutputStreamAt: Double => IOutputStream,
    position: Double,
    readAsync: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double],
    seek: Double => Unit,
    size: Double,
    writeAsync: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): IRandomAccessStream = {
    val __obj = js.Dynamic.literal(canRead = canRead, canWrite = canWrite, cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), position = position, readAsync = js.Any.fromFunction3(readAsync), seek = js.Any.fromFunction1(seek), size = size, writeAsync = js.Any.fromFunction1(writeAsync))
  
    __obj.asInstanceOf[IRandomAccessStream]
  }
}

