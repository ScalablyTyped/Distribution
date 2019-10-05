package typings.winrt.Windows.Storage.BulkAccess

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileInformationFactory extends js.Object {
  def getFilesAsync(): IAsyncOperation[IVectorView[FileInformation]] = js.native
  def getFilesAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[FileInformation]] = js.native
  def getFoldersAsync(): IAsyncOperation[IVectorView[FolderInformation]] = js.native
  def getFoldersAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[FolderInformation]] = js.native
  def getItemsAsync(): IAsyncOperation[IVectorView[IStorageItemInformation]] = js.native
  def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItemInformation]] = js.native
  def getVirtualizedFilesVector(): js.Any = js.native
  def getVirtualizedFoldersVector(): js.Any = js.native
  def getVirtualizedItemsVector(): js.Any = js.native
}

