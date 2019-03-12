package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOutputStream
  extends winrtLib.WindowsNs.FoundationNs.IClosable {
  def flushAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean]
  def writeAsync(buffer: IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double]
}

object IOutputStream {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    flushAsync: () => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean],
    writeAsync: IBuffer => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double]
  ): IOutputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
  
    __obj.asInstanceOf[IOutputStream]
  }
}

