package typings
package winrtLib.WindowsNs.StorageNs.CompressionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecompressor
  extends winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream {
  def detachStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream
}

object IDecompressor {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    detachStream: () => winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    readAsync: (winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double, winrtLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions) => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double]
  ): IDecompressor = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), readAsync = js.Any.fromFunction3(readAsync))
  
    __obj.asInstanceOf[IDecompressor]
  }
}

