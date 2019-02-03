package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.RandomAccessStream")
@js.native
class RandomAccessStream () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.Streams.RandomAccessStream")
@js.native
object RandomAccessStream extends js.Object {
  def copyAndCloseAsync(
    source: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    destination: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  def copyAsync(
    source: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    destination: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
  def copyAsync(
    source: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    destination: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream,
    bytesToCopy: scala.Double
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[scala.Double, scala.Double] = js.native
}

