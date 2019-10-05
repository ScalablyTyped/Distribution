package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFolderQueryResult extends IStorageQueryResultBase {
  def getFoldersAsync(): IAsyncOperation[IVectorView[StorageFolder]] = js.native
  def getFoldersAsync(startIndex: Double, maxNumberOfItems: Double): IAsyncOperation[IVectorView[StorageFolder]] = js.native
}

