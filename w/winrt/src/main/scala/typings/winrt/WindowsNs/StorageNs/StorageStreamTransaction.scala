package typings.winrt.WindowsNs.StorageNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StorageStreamTransaction")
@js.native
class StorageStreamTransaction () extends IStorageStreamTransaction {
  /* CompleteClass */
  override var stream: IRandomAccessStream = js.native
  /* CompleteClass */
  override def close(): Unit = js.native
  /* CompleteClass */
  override def commitAsync(): IAsyncAction = js.native
  def dispose(): Unit = js.native
}

