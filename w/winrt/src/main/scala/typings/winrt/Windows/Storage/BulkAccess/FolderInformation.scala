package typings.winrt.Windows.Storage.BulkAccess

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageFolder
import typings.winrt.Windows.Storage.IStorageItem
import typings.winrt.Windows.Storage.IStorageItemProperties
import typings.winrt.Windows.Storage.Search.IStorageFolderQueryOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderInformation
  extends IStorageFolder
     with IStorageItemInformation
     with IStorageItemProperties
     with IStorageFolderQueryOperations {
  
  /* InferMemberOverrides */
  override def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
}
