package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputStream
  extends winrtLib.WindowsNs.FoundationNs.IClosable {
  def readAsync(buffer: IBuffer, count: scala.Double, options: InputStreamOptions): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[IBuffer, scala.Double]
}

object IInputStream {
  @scala.inline
  def apply(
    close: () => scala.Unit,
    readAsync: (IBuffer, scala.Double, InputStreamOptions) => winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[IBuffer, scala.Double]
  ): IInputStream = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), readAsync = js.Any.fromFunction3(readAsync))
  
    __obj.asInstanceOf[IInputStream]
  }
}

