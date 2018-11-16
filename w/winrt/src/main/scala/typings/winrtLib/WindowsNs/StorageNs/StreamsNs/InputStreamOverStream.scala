package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Streams.InputStreamOverStream")
@js.native
class InputStreamOverStream () extends IInputStream {
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
  /* CompleteClass */
  override def readAsync(buffer: IBuffer, count: scala.Double, options: InputStreamOptions): winrtLib.WindowsNs.FoundationNs.IAsyncOperationWithProgress[IBuffer, scala.Double] = js.native
}

