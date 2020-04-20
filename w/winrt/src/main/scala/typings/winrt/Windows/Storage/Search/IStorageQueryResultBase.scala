package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStorageQueryResultBase extends js.Object {
  var folder: StorageFolder
  var oncontentschanged: js.Any
  var onoptionschanged: js.Any
  def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit
  def findStartIndexAsync(value: js.Any): IAsyncOperation[Double]
  def getCurrentQueryOptions(): QueryOptions
  def getItemCountAsync(): IAsyncOperation[Double]
}

object IStorageQueryResultBase {
  @scala.inline
  def apply(
    applyNewQueryOptions: QueryOptions => Unit,
    findStartIndexAsync: js.Any => IAsyncOperation[Double],
    folder: StorageFolder,
    getCurrentQueryOptions: () => QueryOptions,
    getItemCountAsync: () => IAsyncOperation[Double],
    oncontentschanged: js.Any,
    onoptionschanged: js.Any
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal(applyNewQueryOptions = js.Any.fromFunction1(applyNewQueryOptions), findStartIndexAsync = js.Any.fromFunction1(findStartIndexAsync), folder = folder.asInstanceOf[js.Any], getCurrentQueryOptions = js.Any.fromFunction0(getCurrentQueryOptions), getItemCountAsync = js.Any.fromFunction0(getItemCountAsync), oncontentschanged = oncontentschanged.asInstanceOf[js.Any], onoptionschanged = onoptionschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
}

