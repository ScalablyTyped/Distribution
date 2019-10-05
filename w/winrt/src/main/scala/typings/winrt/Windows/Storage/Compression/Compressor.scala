package typings.winrt.Windows.Storage.Compression

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IOutputStream
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

