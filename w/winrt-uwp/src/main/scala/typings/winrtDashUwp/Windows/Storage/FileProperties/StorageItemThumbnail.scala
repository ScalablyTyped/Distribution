package typings.winrtDashUwp.Windows.Storage.FileProperties

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import typings.winrtDashUwp.Windows.Storage.Streams.IInputStream
import typings.winrtDashUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtDashUwp.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the thumbnail image associated with a system resource (like a file or folder). */
@JSGlobal("Windows.Storage.FileProperties.StorageItemThumbnail")
@js.native
abstract class StorageItemThumbnail () extends js.Object {
  /** Gets a value that indicates whether the thumbnail stream can be read from. */
  var canRead: Boolean = js.native
  /** Gets a value that indicates whether the thumbnail stream can be written to. */
  var canWrite: Boolean = js.native
  /** Gets the MIME content type of the thumbnail image. */
  var contentType: String = js.native
  /** Gets the original (not scaled) height of the thumbnail image. */
  var originalHeight: Double = js.native
  /** Gets the original (not scaled) width of the thumbnail image. */
  var originalWidth: Double = js.native
  /** Gets the byte offset of the thumbnail stream. */
  var position: Double = js.native
  /** Gets a value that indicates whether the thumbnail image returned was a cached version with a smaller size. */
  var returnedSmallerCachedSize: Boolean = js.native
  /** Gets or sets the size of the thumbnail image. */
  var size: Double = js.native
  /** Gets a value that indicates if the thumbnail is an icon or an image. */
  var `type`: ThumbnailType = js.native
  /**
    * Creates a new stream over the thumbnail that is represented by the current storageItemThumbnail object.
    * @return The new thumbnail stream. The initial, internal position of the stream is 0.
    */
  def cloneStream(): IRandomAccessStream = js.native
  /** Releases system resources that are exposed by a Windows Runtime object. */
  def close(): Unit = js.native
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Retrieves the thumbnail image data as an undecoded stream.
    * @param position The position in the storage item to start reading thumbnail image data.
    * @return An object for reading the thumbnail image data.
    */
  def getInputStreamAt(position: Double): IInputStream = js.native
  /**
    * Retrieves an output stream object for writing thumbnail image data to a storage item.
    * @param position The position in the storage item to start writing thumbnail image data.
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
    * Sets the offset of the thumbnail stream to the specified value.
    * @param position The number of bytes from the start of the thumbnail stream where the position of the thumbnail stream is set.
    */
  def seek(position: Double): Unit = js.native
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer The buffer into which the asynchronous writer operation writes.
    * @return The byte writer operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

