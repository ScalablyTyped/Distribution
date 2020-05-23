package typings.winrtUwp.global.Windows.Storage.Streams

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads data from a file. */
@JSGlobal("Windows.Storage.Streams.FileInputStream")
@js.native
abstract class FileInputStream ()
  extends typings.winrtUwp.Windows.Storage.Streams.FileInputStream {
  /** Closes the current stream and releases system resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Returns an asynchronous byte reader object.
    * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
    * @param count The number of bytes to read that is less than or equal to the Capacity value.
    * @param options Specifies the type of the asynchronous read operation.
    * @return The asynchronous operation.
    */
  /* CompleteClass */
  override def readAsync(
    buffer: IBuffer,
    count: Double,
    options: typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions
  ): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
}

