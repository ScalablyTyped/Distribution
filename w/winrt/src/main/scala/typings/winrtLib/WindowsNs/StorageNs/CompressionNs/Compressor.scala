package typings
package winrtLib.WindowsNs.StorageNs.CompressionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Compression.Compressor")
@js.native
class Compressor protected () extends ICompressor {
  def this(underlyingStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream) = this()
  def this(underlyingStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream, algorithm: CompressAlgorithm, blockSize: scala.Double) = this()
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /* CompleteClass */
  override def detachStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream = js.native
  def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def finishAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  /* CompleteClass */
  override def flushAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  /* CompleteClass */
  override def writeAsync(buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

