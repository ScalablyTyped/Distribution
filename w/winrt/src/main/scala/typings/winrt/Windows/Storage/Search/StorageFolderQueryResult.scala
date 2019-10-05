package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Search.StorageFolderQueryResult")
@js.native
class StorageFolderQueryResult () extends IStorageFolderQueryResult {
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

