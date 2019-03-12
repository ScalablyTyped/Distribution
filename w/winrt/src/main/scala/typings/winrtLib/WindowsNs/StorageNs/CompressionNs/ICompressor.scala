package typings
package winrtLib.WindowsNs.StorageNs.CompressionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompressor
  extends winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream {
  def detachStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  def finishAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean]
}

object ICompressor {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    detachStream: () => winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream,
    finishAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean],
    flushAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean],
    writeAsync: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double]
  ): ICompressor = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), finishAsync = js.Any.fromFunction0(finishAsync), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
  
    __obj.asInstanceOf[ICompressor]
  }
}

