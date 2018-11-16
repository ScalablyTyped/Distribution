package typings
package winrtLib.WindowsNs.StorageNs.BulkAccessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.BulkAccess.FolderInformation")
@js.native
class FolderInformation ()
  extends winrtLib.WindowsNs.StorageNs.IStorageFolder
     with IStorageItemInformation
     with winrtLib.WindowsNs.StorageNs.IStorageItemProperties
     with winrtLib.WindowsNs.StorageNs.SearchNs.IStorageFolderQueryOperations {
  /* CompleteClass */
  override var basicProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties = js.native
  /* CompleteClass */
  override var documentProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.DocumentProperties = js.native
  /* CompleteClass */
  override var imageProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.ImageProperties = js.native
  /* CompleteClass */
  override var musicProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.MusicProperties = js.native
  /* CompleteClass */
  override var onpropertiesupdated: js.Any = js.native
  /* CompleteClass */
  override var onthumbnailupdated: js.Any = js.native
  /* CompleteClass */
  override var thumbnail: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.StorageItemThumbnail = js.native
  /* CompleteClass */
  override var videoProperties: winrtLib.WindowsNs.StorageNs.FilePropertiesNs.VideoProperties = js.native
  /* InferMemberOverrides */
  override def getItemsAsync(startIndex: scala.Double, maxItemsToRetrieve: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.IStorageItem]
  ] = js.native
}

