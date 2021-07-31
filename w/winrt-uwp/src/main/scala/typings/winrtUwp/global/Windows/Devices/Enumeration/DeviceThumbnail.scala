package typings.winrtUwp.global.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the thumbnail image for a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceThumbnail")
@js.native
abstract class DeviceThumbnail ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Enumeration.DeviceThumbnail {
  
  /** Gets a value that indicates whether the stream can be read from. */
  /* CompleteClass */
  var canRead: Boolean = js.native
  
  /** Gets a value that indicates whether the stream can be written to. */
  /* CompleteClass */
  var canWrite: Boolean = js.native
  
  /**
    * Creates a new instance of a IRandomAccessStream over the same resource as the current stream.
    * @return The new stream. The initial, internal position of the stream is 0.
    */
  /* CompleteClass */
  override def cloneStream(): IRandomAccessStream = js.native
  
  /** Closes the current stream and releases system resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /** Returns the content type of the thumbnail image. */
  /* CompleteClass */
  var contentType: String = js.native
  
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  /* CompleteClass */
  override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Returns a pointer to an input stream starting at the specified location.
    * @param position The position in the input stream.
    * @return A pointer to an input stream.
    */
  /* CompleteClass */
  override def getInputStreamAt(position: Double): IInputStream = js.native
  
  /**
    * Returns a pointer to an output stream starting at the specified location.
    * @param position The position in the output stream.
    * @return A pointer to an output stream.
    */
  /* CompleteClass */
  override def getOutputStreamAt(position: Double): IOutputStream = js.native
  
  /** Gets the byte offset of the stream. */
  /* CompleteClass */
  var position: Double = js.native
  
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  /* CompleteClass */
  override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  
  /**
    * Sets the position of the stream to the specified value.
    * @param position The new position of the stream.
    */
  /* CompleteClass */
  override def seek(position: Double): Unit = js.native
  
  /** Gets or sets the size of the device thumbnail image. */
  /* CompleteClass */
  var size: Double = js.native
  
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer The buffer into which the asynchronous writer operation writes.
    * @return The byte writer operation.
    */
  /* CompleteClass */
  override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}
