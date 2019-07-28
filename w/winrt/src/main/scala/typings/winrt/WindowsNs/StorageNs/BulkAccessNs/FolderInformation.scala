package typings.winrt.WindowsNs.StorageNs.BulkAccessNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.DocumentProperties
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.ImageProperties
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.MusicProperties
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail
import typings.winrt.WindowsNs.StorageNs.FilePropertiesNs.VideoProperties
import typings.winrt.WindowsNs.StorageNs.IStorageFolder
import typings.winrt.WindowsNs.StorageNs.IStorageItem
import typings.winrt.WindowsNs.StorageNs.IStorageItemProperties
import typings.winrt.WindowsNs.StorageNs.SearchNs.IStorageFolderQueryOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.BulkAccess.FolderInformation")
@js.native
class FolderInformation ()
  extends IStorageFolder
     with IStorageItemInformation
     with IStorageItemProperties
     with IStorageFolderQueryOperations {
  /* CompleteClass */
  override var basicProperties: BasicProperties = js.native
  /* CompleteClass */
  override var documentProperties: DocumentProperties = js.native
  /* CompleteClass */
  override var imageProperties: ImageProperties = js.native
  /* CompleteClass */
  override var musicProperties: MusicProperties = js.native
  /* CompleteClass */
  override var onpropertiesupdated: js.Any = js.native
  /* CompleteClass */
  override var onthumbnailupdated: js.Any = js.native
  /* CompleteClass */
  override var thumbnail: StorageItemThumbnail = js.native
  /* CompleteClass */
  override var videoProperties: VideoProperties = js.native
  /* InferMemberOverrides */
  override def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
}

