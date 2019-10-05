package typings.winrtDashUwp.Windows.Media.Capture

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.Windows.Graphics.Imaging.SoftwareBitmap
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import typings.winrtDashUwp.Windows.Storage.Streams.IInputStream
import typings.winrtDashUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtDashUwp.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a captured video frame. */
@JSGlobal("Windows.Media.Capture.CapturedFrame")
@js.native
abstract class CapturedFrame () extends js.Object {
  /** Gets a value that indicates if the captured frame can be read from. */
  var canRead: Boolean = js.native
  /** Gets a value that indicates if the captured frame can be written to. */
  var canWrite: Boolean = js.native
  /** Gets the content type of the captured frame. */
  var contentType: String = js.native
  /** Gets the height of the captured frame */
  var height: Double = js.native
  /** Gets the position of the captured frame. */
  var position: Double = js.native
  /** Gets the size of the captured frame in bytes. */
  var size: Double = js.native
  /** Gets a SoftwareBitmap object representing the captured frame. */
  var softwareBitmap: SoftwareBitmap = js.native
  /** Gets the width of the captured frame. */
  var width: Double = js.native
  /**
    * Creates a copy of the stream.
    * @return The clone of the strem.
    */
  def cloneStream(): IRandomAccessStream = js.native
  /** Closes the captured framed object. */
  def close(): Unit = js.native
  /**
    * Asynchronously commits and flushes all of the data of the CapturedFrame .
    * @return When this method completes, a boolean value is returned which specifies true if the operation completed successfully; otherwise, false.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Gets the input stream at the specified position.
    * @param position The position in the input stream.
    * @return The input stream.
    */
  def getInputStreamAt(position: Double): IInputStream = js.native
  /**
    * Gets the output stream at the specified position.
    * @param position The position in the output stream.
    * @return The output stream.
    */
  def getOutputStreamAt(position: Double): IOutputStream = js.native
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  /**
    * Seeks the stream to the specified position.
    * @param position The position in the stream to seek too.
    */
  def seek(position: Double): Unit = js.native
  /**
    * Asynchronously writes the specified data to the stream.
    * @param buffer The data to write to the stream.
    * @return Represents an asynchronous operation that returns a result and reports progress.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

