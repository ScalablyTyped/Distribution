package typings.winrt.WindowsNs.StorageNs.SearchNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Search.StorageItemQueryResult")
@js.native
class StorageItemQueryResult () extends IStorageItemQueryResult {
  /* CompleteClass */
  override var folder: StorageFolder = js.native
  /* CompleteClass */
  override var oncontentschanged: js.Any = js.native
  /* CompleteClass */
  override var onoptionschanged: js.Any = js.native
  /* CompleteClass */
  override def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit = js.native
  /* CompleteClass */
  override def findStartIndexAsync(value: js.Any): IAsyncOperation[Double] = js.native
  /* CompleteClass */
  override def getCurrentQueryOptions(): QueryOptions = js.native
  /* CompleteClass */
  override def getItemCountAsync(): IAsyncOperation[Double] = js.native
}

