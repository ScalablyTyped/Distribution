package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRandomAccessStreamStatics extends js.Object {
  def copyAndCloseAsync(source: IInputStream, destination: IOutputStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  def copyAsync(source: IInputStream, destination: IOutputStream): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  def copyAsync(source: IInputStream, destination: IOutputStream, bytesToCopy: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

