package typings.winrt.WindowsNs.StorageNs.CompressionNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperationWithProgress
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Compression.Compressor")
@js.native
class Compressor protected () extends ICompressor {
  def this(underlyingStream: IOutputStream) = this()
  def this(underlyingStream: IOutputStream, algorithm: CompressAlgorithm, blockSize: Double) = this()
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def detachStream(): IOutputStream = js.native
  def dispose(): Unit = js.native
  /* CompleteClass */
  override def finishAsync(): IAsyncOperation[Boolean] = js.native
  /* CompleteClass */
  override def flushAsync(): IAsyncOperation[Boolean] = js.native
  /* CompleteClass */
  override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
}

