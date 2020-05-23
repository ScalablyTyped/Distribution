package typings.winrtUwp.global.Windows.Storage.Streams

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Writes data to a file. */
@JSGlobal("Windows.Storage.Streams.FileOutputStream")
@js.native
abstract class FileOutputStream ()
  extends typings.winrtUwp.Windows.Storage.Streams.FileOutputStream {
  /** Closes the current stream and releases system resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Flushes data asynchronously in a sequential stream.
    * @return The stream flush operation.
    */
  /* CompleteClass */
  override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Writes data asynchronously to a file.
    * @param buffer The buffer into which the asynchronous writer operation writes.
    * @return The byte writer operation.
    */
  /* CompleteClass */
  override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

