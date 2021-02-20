package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageFolderQueryResult extends IStorageQueryResultBase {
  
  def getFoldersAsync(): IAsyncOperation[IVectorView[StorageFolder]] = js.native
  def getFoldersAsync(startIndex: Double, maxNumberOfItems: Double): IAsyncOperation[IVectorView[StorageFolder]] = js.native
}
