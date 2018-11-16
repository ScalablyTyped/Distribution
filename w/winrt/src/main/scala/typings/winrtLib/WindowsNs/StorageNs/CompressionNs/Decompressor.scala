package typings
package winrtLib.WindowsNs.StorageNs.CompressionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Compression.Decompressor")
@js.native
class Decompressor protected () extends IDecompressor {
  def this(underlyingStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream) = this()
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /* CompleteClass */
  override def detachStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
  def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def readAsync(
    buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer,
    count: scala.Double,
    options: winrtLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double] = js.native
}

