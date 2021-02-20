package typings.winrtUwp.Windows.Storage.Streams

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides random access of data in input and output streams that are stored in memory instead of on disk. */
@js.native
trait InMemoryRandomAccessStream extends StObject {
  
  /** Gets a value that indicates whether the stream can be read from. */
  var canRead: Boolean = js.native
  
  /** Gets a value that indicates whether the stream can be written to. */
  var canWrite: Boolean = js.native
  
  /**
    * Creates a new instance of a IRandomAccessStream over the same resource as the current stream.
    * @return The new stream. The initial, internal position of the stream is 0.
    */
  def cloneStream(): IRandomAccessStream = js.native
  
  /** Closes the current stream and releases system resources. */
  def close(): Unit = js.native
  
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  
  /**
    * Returns an input stream at a specified location in a stream.
    * @param position The location in the stream at which to begin.
    * @return The input stream.
    */
  def getInputStreamAt(position: Double): IInputStream = js.native
  
  /**
    * Returns an output stream at a specified location in a stream.
    * @param position The location in the output stream at which to begin.
    * @return The output stream.
    */
  def getOutputStreamAt(position: Double): IOutputStream = js.native
  
  /** Gets the byte offset of the stream. */
  var position: Double = js.native
  
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  
  /**
    * Sets the position of the stream to the specified value.
    * @param position The new position of the stream.
    */
  def seek(position: Double): Unit = js.native
  
  /** Gets or sets the size of the random access stream. */
  var size: Double = js.native
  
  /**
    * Writes data asynchronously in a sequential stream.
    * @param buffer The buffer into which the asynchronous writer operation writes.
    * @return The byte writer operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}
object InMemoryRandomAccessStream {
  
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
  ): InMemoryRandomAccessStream = {
    val __obj = js.Dynamic.literal(canRead = canRead.asInstanceOf[js.Any], canWrite = canWrite.asInstanceOf[js.Any], cloneStream = js.Any.fromFunction0(cloneStream), close = js.Any.fromFunction0(close), flushAsync = js.Any.fromFunction0(flushAsync), getInputStreamAt = js.Any.fromFunction1(getInputStreamAt), getOutputStreamAt = js.Any.fromFunction1(getOutputStreamAt), position = position.asInstanceOf[js.Any], readAsync = js.Any.fromFunction3(readAsync), seek = js.Any.fromFunction1(seek), size = size.asInstanceOf[js.Any], writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[InMemoryRandomAccessStream]
  }
  
  @scala.inline
  implicit class InMemoryRandomAccessStreamMutableBuilder[Self <: InMemoryRandomAccessStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanRead(value: Boolean): Self = StObject.set(x, "canRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanWrite(value: Boolean): Self = StObject.set(x, "canWrite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneStream(value: () => IRandomAccessStream): Self = StObject.set(x, "cloneStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlushAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "flushAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInputStreamAt(value: Double => IInputStream): Self = StObject.set(x, "getInputStreamAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOutputStreamAt(value: Double => IOutputStream): Self = StObject.set(x, "getOutputStreamAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadAsync(
      value: (IBuffer, Double, InputStreamOptions) => IPromiseWithIAsyncOperationWithProgress[IBuffer, Double]
    ): Self = StObject.set(x, "readAsync", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteAsync(value: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "writeAsync", js.Any.fromFunction1(value))
  }
}
