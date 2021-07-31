package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Search.IStorageFolderQueryOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageFolder
  extends StObject
     with IStorageFolder
     with IStorageFolder2
     with IStorageFolderQueryOperations
     with IStorageItemProperties {
  
  /* InferMemberOverrides */
  override def getItemsAsync(startIndex: Double, maxItemsToRetrieve: Double): IAsyncOperation[IVectorView[IStorageItem]] = js.native
}
