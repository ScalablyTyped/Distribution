package typings.winrtUwp.global.Windows.Graphics.Imaging

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An implementation of IRandomAccessStreamWithContent type used in the Imaging namespace. */
@JSGlobal("Windows.Graphics.Imaging.ImageStream")
@js.native
abstract class ImageStream ()
  extends typings.winrtUwp.Windows.Graphics.Imaging.ImageStream {
  /** Indicates if you can read the stream. */
  /* CompleteClass */
  override var canRead: Boolean = js.native
  /** Indicates if you can write to the stream. */
  /* CompleteClass */
  override var canWrite: Boolean = js.native
  /** Returns the data format of the stream. */
  /* CompleteClass */
  override var contentType: String = js.native
  /** Gets the byte offset of the stream. */
  /* CompleteClass */
  override var position: Double = js.native
  /** Gets or sets the size of the random access stream. */
  /* CompleteClass */
  override var size: Double = js.native
  /**
    * Returns the file stream for the ImageStream .
    * @return The file stream for the image.
    */
  /* CompleteClass */
  override def cloneStream(): IRandomAccessStream = js.native
  /** Closes the ImageStream . */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Asynchronously commits the current frame data and flushes all of the data on the image stream.
    * @return An object that manages the asynchronous flush operation.
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
    * Reads data asynchronously from a sequential stream.
    * @param buffer The buffer into which the asynchronous read operation stores the data.
    * @param count The size of the buffer.
    * @param options The options for the stream to be read.
    * @return The byte reader operation.
    */
  /* CompleteClass */
  override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
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

