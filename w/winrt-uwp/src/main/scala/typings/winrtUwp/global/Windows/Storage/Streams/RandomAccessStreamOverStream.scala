package typings.winrtUwp.global.Windows.Storage.Streams

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a Windows Runtime random access stream for an IStream base implementation. */
@JSGlobal("Windows.Storage.Streams.RandomAccessStreamOverStream")
@js.native
abstract class RandomAccessStreamOverStream ()
  extends typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamOverStream {
  /** Gets a value that indicates whether the stream can be read from. */
  /* CompleteClass */
  override var canRead: Boolean = js.native
  /** Gets a value that indicates whether the stream can be written to. */
  /* CompleteClass */
  override var canWrite: Boolean = js.native
  /** Gets the byte offset of the stream. */
  /* CompleteClass */
  override var position: Double = js.native
  /** Gets or sets the size of the random access stream. */
  /* CompleteClass */
  override var size: Double = js.native
  /**
    * Creates a new instance of a IRandomAccessStream over the same resource as the current stream.
    * @return The new stream. The initial, internal position of the stream is 0.
    */
  /* CompleteClass */
  override def cloneStream(): IRandomAccessStream = js.native
  /** Closes the current stream and releases system resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  /* CompleteClass */
  override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Returns an input stream at a specified location in a stream.
    * @param position The location in the stream at which to begin.
    * @return The input stream.
    */
  /* CompleteClass */
  override def getInputStreamAt(position: Double): IInputStream = js.native
  /**
    * Returns an output stream at a specified location in a stream.
    * @param position The location in the output stream at which to begin.
    * @return The output stream.
    */
  /* CompleteClass */
  override def getOutputStreamAt(position: Double): IOutputStream = js.native
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  /* CompleteClass */
  override def readAsync(
    buffer: IBuffer,
    count: Double,
    options: typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions
  ): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Sets the position of the stream to the specified value.
    * @param position The new position of the stream.
    */
  /* CompleteClass */
  override def seek(position: Double): Unit = js.native
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer The buffer into which the asynchronous writer operation writes.
    * @return The byte writer operation.
    */
  /* CompleteClass */
  override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

