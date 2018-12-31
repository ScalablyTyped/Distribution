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

