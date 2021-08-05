package typings.winrtUwp.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a sequential-access output stream that indicates a request for the data stream of a StorageFile that was created by calling CreateStreamedFileAsync or ReplaceWithStreamedFileAsync . */
trait StreamedFileDataRequest extends StObject {
  
  /** Releases system resources that are exposed by the current stream indicating that the data request is complete. */
  def close(): Unit
  
  /**
    * Indicates that the data can't be streamed and releases system resources that are exposed by the current stream indicating that the data request is complete.
    * @param failureMode The enum value that indicates why the data stream can't be accessed.
    */
  def failAndClose(failureMode: StreamedFileFailureMode): Unit
  
  /**
    * Flushes the data in the current stream.
    * @return When this method completes, it returns true if the data was flushed successfully or false if the flush operation failed.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean]
  
  /**
    * Writes data from a buffer to the current stream.
    * @param buffer The buffer that contains the data to write.
    * @return When this method completes, it returns the number of bytes (type UInt32 ) that were written to the stream. If the app specifies a function to monitor progress, that function receives the number of bytes (type UInt32) written so far.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double]
}
object StreamedFileDataRequest {
  
  inline def apply(
    close: () => Unit,
    failAndClose: StreamedFileFailureMode => Unit,
    flushAsync: () => IPromiseWithIAsyncOperation[Boolean],
    writeAsync: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]
  ): StreamedFileDataRequest = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), failAndClose = js.Any.fromFunction1(failAndClose), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
    __obj.asInstanceOf[StreamedFileDataRequest]
  }
  
  extension [Self <: StreamedFileDataRequest](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setFailAndClose(value: StreamedFileFailureMode => Unit): Self = StObject.set(x, "failAndClose", js.Any.fromFunction1(value))
    
    inline def setFlushAsync(value: () => IPromiseWithIAsyncOperation[Boolean]): Self = StObject.set(x, "flushAsync", js.Any.fromFunction0(value))
    
    inline def setWriteAsync(value: IBuffer => IPromiseWithIAsyncOperationWithProgress[Double, Double]): Self = StObject.set(x, "writeAsync", js.Any.fromFunction1(value))
  }
}
