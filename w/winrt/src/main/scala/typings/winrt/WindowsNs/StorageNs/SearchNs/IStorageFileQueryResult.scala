package typings.winrt.WindowsNs.StorageNs.SearchNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFileQueryResult extends IStorageQueryResultBase {
  def getFilesAsync(): IAsyncOperation[IVectorView[StorageFile]] = js.native
  def getFilesAsync(startIndex: Double, maxNumberOfItems: Double): IAsyncOperation[IVectorView[StorageFile]] = js.native
}

