package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Search.StorageItemQueryResult")
@js.native
class StorageItemQueryResult () extends IStorageItemQueryResult {
  /* CompleteClass */
  override var folder: winrtLib.WindowsNs.StorageNs.StorageFolder = js.native
  /* CompleteClass */
  override var oncontentschanged: js.Any = js.native
  /* CompleteClass */
  override var onoptionschanged: js.Any = js.native
  /* CompleteClass */
  override def applyNewQueryOptions(newQueryOptions: QueryOptions): scala.Unit = js.native
  /* CompleteClass */
  override def findStartIndexAsync(value: js.Any): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Double] = js.native
  /* CompleteClass */
  override def getCurrentQueryOptions(): QueryOptions = js.native
  /* CompleteClass */
  override def getItemCountAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Double] = js.native
}

