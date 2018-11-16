package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StorageStreamTransaction")
@js.native
class StorageStreamTransaction () extends IStorageStreamTransaction {
  /* CompleteClass */
  override var stream: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  /* CompleteClass */
  override def commitAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def dispose(): scala.Unit = js.native
}

