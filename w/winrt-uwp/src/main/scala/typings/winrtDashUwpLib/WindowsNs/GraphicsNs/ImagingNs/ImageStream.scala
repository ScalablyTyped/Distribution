package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An implementation of IRandomAccessStreamWithContent type used in the Imaging namespace. */
@JSGlobal("Windows.Graphics.Imaging.ImageStream")
@js.native
abstract class ImageStream () extends js.Object {
  /** Indicates if you can read the stream. */
  var canRead: scala.Boolean = js.native
  /** Indicates if you can write to the stream. */
  var canWrite: scala.Boolean = js.native
  /** Returns the data format of the stream. */
  var contentType: java.lang.String = js.native
  /** Gets the byte offset of the stream. */
  var position: scala.Double = js.native
  /** Gets or sets the size of the random access stream. */
  var size: scala.Double = js.native
  /**
                   * Returns the file stream for the ImageStream .
                   * @return The file stream for the image.
                   */
  def cloneStream(): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /** Closes the ImageStream . */
  def close(): scala.Unit = js.native
  /**
                   * Asynchronously commits the current frame data and flushes all of the data on the image stream.
                   * @return An object that manages the asynchronous flush operation.
                   */
  def flushAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Returns an input stream at a specified location in a stream.
                   * @param position The location in the stream at which to begin.
                   * @return The input stream.
                   */
  def getInputStreamAt(position: scala.Double): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
  /**
                   * Returns an output stream at a specified location in a stream.
                   * @param position The location in the output stream at which to begin.
                   * @return The output stream.
                   */
  def getOutputStreamAt(position: scala.Double): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream = js.native
  /**
                   * Reads data asynchronously from a sequential stream.
                   * @param buffer The buffer into which the asynchronous read operation stores the data.
                   * @param count The size of the buffer.
                   * @param options The options for the stream to be read.
                   * @return The byte reader operation.
                   */
  def readAsync(
    buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    count: scala.Double,
    options: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double] = js.native
  /**
                   * Sets the position of the stream to the specified value.
                   * @param position The new position of the stream.
                   */
  def seek(position: scala.Double): scala.Unit = js.native
  /**
                   * Writes data asynchronously in a sequential stream.
                   * @param buffer The buffer into which the asynchronous writer operation writes.
                   * @return The byte writer operation.
                   */
  def writeAsync(buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

