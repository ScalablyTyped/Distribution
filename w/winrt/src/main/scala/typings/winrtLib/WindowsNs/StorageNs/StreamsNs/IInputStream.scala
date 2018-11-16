package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IInputStream
  extends winrtLib.WindowsNs.FoundationNs.IClosable {
  def readAsync(buffer: IBuffer, count: scala.Double, options: InputStreamOptions): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[IBuffer, scala.Double]
}

