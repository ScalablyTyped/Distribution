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
    close: js.Function0[scala.Unit],
    detachStream: js.Function0[winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream],
    readAsync: js.Function3[
      winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, 
      scala.Double, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.InputStreamOptions, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer, scala.Double]
    ]
  ): IDecompressor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("detachStream")(detachStream)
    __obj.updateDynamic("readAsync")(readAsync)
    __obj.asInstanceOf[IDecompressor]
  }
}

