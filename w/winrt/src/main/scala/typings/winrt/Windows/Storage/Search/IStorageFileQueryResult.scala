package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStorageFileQueryResult extends IStorageQueryResultBase {
  
  def getFilesAsync(): IAsyncOperation[IVectorView[StorageFile]] = js.native
  def getFilesAsync(startIndex: Double, maxNumberOfItems: Double): IAsyncOperation[IVectorView[StorageFile]] = js.native
}
