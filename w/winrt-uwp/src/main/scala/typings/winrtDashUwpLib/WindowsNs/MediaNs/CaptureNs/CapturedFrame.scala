package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a captured video frame. */
@JSGlobal("Windows.Media.Capture.CapturedFrame")
@js.native
abstract class CapturedFrame () extends js.Object {
  /** Gets a value that indicates if the captured frame can be read from. */
  var canRead: scala.Boolean = js.native
  /** Gets a value that indicates if the captured frame can be written to. */
  var canWrite: scala.Boolean = js.native
  /** Gets the content type of the captured frame. */
  var contentType: java.lang.String = js.native
  /** Gets the height of the captured frame */
  var height: scala.Double = js.native
  /** Gets the position of the captured frame. */
  var position: scala.Double = js.native
  /** Gets the size of the captured frame in bytes. */
  var size: scala.Double = js.native
  /** Gets a SoftwareBitmap object representing the captured frame. */
  var softwareBitmap: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap = js.native
  /** Gets the width of the captured frame. */
  var width: scala.Double = js.native
  /**
    * Creates a copy of the stream.
    * @return The clone of the strem.
    */
  def cloneStream(): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /** Closes the captured framed object. */
  def close(): scala.Unit = js.native
  /**
    * Asynchronously commits and flushes all of the data of the CapturedFrame .
    * @return When this method completes, a boolean value is returned which specifies true if the operation completed successfully; otherwise, false.
    */
  def flushAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Gets the input stream at the specified position.
    * @param position The position in the input stream.
    * @return The input stream.
    */
  def getInputStreamAt(position: scala.Double): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
  /**
    * Gets the output stream at the specified position.
    * @param position The position in the output stream.
    * @return The output stream.
    */
  def getOutputStreamAt(position: scala.Double): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream = js.native
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(
    buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    count: scala.Double,
    options: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double] = js.native
  /**
    * Seeks the stream to the specified position.
    * @param position The position in the stream to seek too.
    */
  def seek(position: scala.Double): scala.Unit = js.native
  /**
    * Asynchronously writes the specified data to the stream.
    * @param buffer The data to write to the stream.
    * @return Represents an asynchronous operation that returns a result and reports progress.
    */
  def writeAsync(buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

