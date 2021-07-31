package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a captured video frame. */
@JSGlobal("Windows.Media.Capture.CapturedFrame")
@js.native
abstract class CapturedFrame ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.CapturedFrame {
  
  /** Gets a value that indicates if the captured frame can be read from. */
  /* CompleteClass */
  var canRead: Boolean = js.native
  
  /** Gets a value that indicates if the captured frame can be written to. */
  /* CompleteClass */
  var canWrite: Boolean = js.native
  
  /**
    * Creates a copy of the stream.
    * @return The clone of the strem.
    */
  /* CompleteClass */
  override def cloneStream(): IRandomAccessStream = js.native
  
  /** Closes the captured framed object. */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /** Gets the content type of the captured frame. */
  /* CompleteClass */
  var contentType: String = js.native
  
  /**
    * Asynchronously commits and flushes all of the data of the CapturedFrame .
    * @return When this method completes, a boolean value is returned which specifies true if the operation completed successfully; otherwise, false.
    */
  /* CompleteClass */
  override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Gets the input stream at the specified position.
    * @param position The position in the input stream.
    * @return The input stream.
    */
  /* CompleteClass */
  override def getInputStreamAt(position: Double): IInputStream = js.native
  
  /**
    * Gets the output stream at the specified position.
    * @param position The position in the output stream.
    * @return The output stream.
    */
  /* CompleteClass */
  override def getOutputStreamAt(position: Double): IOutputStream = js.native
  
  /** Gets the height of the captured frame */
  /* CompleteClass */
  var height: Double = js.native
  
  /** Gets the position of the captured frame. */
  /* CompleteClass */
  var position: Double = js.native
  
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  /* CompleteClass */
  override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  
  /**
    * Seeks the stream to the specified position.
    * @param position The position in the stream to seek too.
    */
  /* CompleteClass */
  override def seek(position: Double): Unit = js.native
  
  /** Gets the size of the captured frame in bytes. */
  /* CompleteClass */
  var size: Double = js.native
  
  /** Gets a SoftwareBitmap object representing the captured frame. */
  /* CompleteClass */
  var softwareBitmap: SoftwareBitmap = js.native
  
  /** Gets the width of the captured frame. */
  /* CompleteClass */
  var width: Double = js.native
  
  /**
    * Asynchronously writes the specified data to the stream.
    * @param buffer The data to write to the stream.
    * @return Represents an asynchronous operation that returns a result and reports progress.
    */
  /* CompleteClass */
  override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}
