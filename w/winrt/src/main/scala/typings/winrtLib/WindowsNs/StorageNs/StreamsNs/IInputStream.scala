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
    close: js.Function0[scala.Unit],
    readAsync: js.Function3[
      IBuffer, 
      scala.Double, 
      InputStreamOptions, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[IBuffer, scala.Double]
    ]
  ): IInputStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("readAsync")(readAsync)
    __obj.asInstanceOf[IInputStream]
  }
}

