package typings
package winrtLib.WindowsNs.StorageNs.BulkAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileInformationFactory extends js.Object {
  def getFilesAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[FileInformation]] = js.native
  def getFilesAsync(startIndex: scala.Double, maxItemsToRetrieve: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[FileInformation]] = js.native
  def getFoldersAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[FolderInformation]] = js.native
  def getFoldersAsync(startIndex: scala.Double, maxItemsToRetrieve: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[FolderInformation]] = js.native
  def getItemsAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IStorageItemInformation]
  ] = js.native
  def getItemsAsync(startIndex: scala.Double, maxItemsToRetrieve: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IStorageItemInformation]
  ] = js.native
  def getVirtualizedFilesVector(): js.Any = js.native
  def getVirtualizedFoldersVector(): js.Any = js.native
  def getVirtualizedItemsVector(): js.Any = js.native
}

