package typings.winrtDashUwp.WindowsNs.StorageNs.CompressionNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A compressor takes information written to a stream and compresses it using a compression algorithm. */
@JSGlobal("Windows.Storage.Compression.Compressor")
@js.native
class Compressor protected () extends js.Object {
  /**
    * Creates an instance of a compressor.
    * @param underlyingStream The stream of compressed information to be written by the compressor.
    */
  def this(underlyingStream: IOutputStream) = this()
  /**
    * Creates an instance of a compressor.
    * @param underlyingStream The stream of compressed information to be written by the compressor.
    * @param algorithm The compression algorithm used by the compressor to write underlyingStream.
    * @param blockSize Size in bytes of the intermediate buffer used by the compression algorithm. A value of 0 specifies that the compression algorithm will use its default block size. Valid non-zero values for this parameter are 32Kb to 64Mb.
    */
  def this(underlyingStream: IOutputStream, algorithm: CompressAlgorithm, blockSize: Double) = this()
  /** Closes a Compressor object and synchronously discards any information in buffers. This will close the underlying stream as well unless the Compressor.Detach method has been used to detach the stream from the object. Subsequent calls on a closed object, except for Compressor.Close, will fail. */
  def close(): Unit = js.native
  /**
    * Detaches the underlying stream from the Compressor object so that the object can be closed using the Compressor.Close method without also closing the underlying stream.
    * @return The stream of information.
    */
  def detachStream(): IOutputStream = js.native
  /**
    * Finishes writing the compression stream.
    * @return The asynchronous operation.
    */
  def finishAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Flushes the compression stream asynchronously.
    * @return The asynchronous operation.
    */
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Writes information to the compression stream asynchronously.
    * @param buffer The buffer that contains the information to be written to the stream.
    * @return The asynchronous operation.
    */
  def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
}

