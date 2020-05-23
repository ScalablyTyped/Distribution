package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sequential-access output stream that indicates a request for the data stream of a StorageFile that was created by calling CreateStreamedFileAsync or ReplaceWithStreamedFileAsync . */
@JSGlobal("Windows.Storage.StreamedFileDataRequest")
@js.native
abstract class StreamedFileDataRequest ()
  extends typings.winrtUwp.Windows.Storage.StreamedFileDataRequest {
  /** Releases system resources that are exposed by the current stream indicating that the data request is complete. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Indicates that the data can't be streamed and releases system resources that are exposed by the current stream indicating that the data request is complete.
    * @param failureMode The enum value that indicates why the data stream can't be accessed.
    */
  /* CompleteClass */
  override def failAndClose(failureMode: typings.winrtUwp.Windows.Storage.StreamedFileFailureMode): Unit = js.native
  /**
    * Flushes the data in the current stream.
    * @return When this method completes, it returns true if the data was flushed successfully or false if the flush operation failed.
    */
  /* CompleteClass */
  override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Writes data from a buffer to the current stream.
    * @param buffer The buffer that contains the data to write.
    * @return When this method completes, it returns the number of bytes (type UInt32 ) that were written to the stream. If the app specifies a function to monitor progress, that function receives the number of bytes (type UInt32) written so far.
    */
  /* CompleteClass */
  override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

