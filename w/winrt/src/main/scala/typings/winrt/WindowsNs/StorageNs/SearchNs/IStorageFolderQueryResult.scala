package typings.winrt.WindowsNs.StorageNs.SearchNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFolderQueryResult extends IStorageQueryResultBase {
  def getFoldersAsync(): IAsyncOperation[IVectorView[StorageFolder]] = js.native
  def getFoldersAsync(startIndex: Double, maxNumberOfItems: Double): IAsyncOperation[IVectorView[StorageFolder]] = js.native
}

