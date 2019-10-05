package typings.winrt.Windows.Storage.Search

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFileQueryResult extends IStorageQueryResultBase {
  def getFilesAsync(): IAsyncOperation[IVectorView[StorageFile]] = js.native
  def getFilesAsync(startIndex: Double, maxNumberOfItems: Double): IAsyncOperation[IVectorView[StorageFile]] = js.native
}

