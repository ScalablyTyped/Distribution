package typings
package winrtDashUwpLib.WindowsNs.StorageNs.CompressionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A decompressor takes a stream compressed by a compressor and decompresses it. */
@JSGlobal("Windows.Storage.Compression.Decompressor")
@js.native
class Decompressor protected () extends js.Object {
  /**
    * This method creates an instance of a decompressor.
    * @param underlyingStream The stream of compressed information to be read and decompressed by the decompressor.
    */
  def this(underlyingStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream) = this()
  /** Closes a Decompressor object and synchronously discards any information in buffers. This will close the underlying stream as well unless the Decompressor.Detach method has been used to detach the stream from the object. Subsequent calls on a closed object, except Decompressor.Close, will fail. */
  def close(): scala.Unit = js.native
  /**
    * Detaches the underlying stream from the Decompressor object so that the object can be closed using the Decompressor.Close method without also closing the underlying stream.
    * @return The stream of information.
    */
  def detachStream(): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
  /**
    * Reads from the compression stream asynchronously.
    * @param buffer The buffer that contains the information to be read from the stream.
    * @param count The number of bytes to read.
    * @param options Read options
    * @return The asynchronous operation.
    */
  def readAsync(
    buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    count: scala.Double,
    options: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double] = js.native
}

