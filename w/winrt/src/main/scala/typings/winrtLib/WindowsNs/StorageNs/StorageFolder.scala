package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.StorageFolder")
@js.native
class StorageFolder ()
  extends IStorageFolder
     with IStorageFolder2
     with winrtLib.WindowsNs.StorageNs.SearchNs.IStorageFolderQueryOperations
     with IStorageItemProperties {
  /* InferMemberOverrides */
  override def getItemsAsync(startIndex: scala.Double, maxItemsToRetrieve: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IStorageItem]] = js.native
  /* CompleteClass */
  override def tryGetItemAsync(name: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IStorageItem] = js.native
}

/* static members */
@JSGlobal("Windows.Storage.StorageFolder")
@js.native
object StorageFolder extends js.Object {
  def getFolderFromPathAsync(path: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFolder] = js.native
}

