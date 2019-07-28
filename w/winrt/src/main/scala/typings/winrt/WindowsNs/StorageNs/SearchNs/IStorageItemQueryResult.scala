package typings.winrt.WindowsNs.StorageNs.SearchNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.IStorageItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItemQueryResult extends IStorageQueryResultBase {
  def getItemsAsync(): IAsyncOperation[IVectorView[IStorageItem]] = js.native
  def getItemsAsync(startIndex: Double, maxNumberOfItems: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
}

