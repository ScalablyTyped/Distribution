package typings
package winrtLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFolderQueryOperations extends js.Object {
  def areQueryOptionsSupported(queryOptions: QueryOptions): scala.Boolean = js.native
  def createFileQuery(): StorageFileQueryResult = js.native
  def createFileQuery(query: CommonFileQuery): StorageFileQueryResult = js.native
  def createFileQueryWithOptions(queryOptions: QueryOptions): StorageFileQueryResult = js.native
  def createFolderQuery(): StorageFolderQueryResult = js.native
  def createFolderQuery(query: CommonFolderQuery): StorageFolderQueryResult = js.native
  def createFolderQueryWithOptions(queryOptions: QueryOptions): StorageFolderQueryResult = js.native
  def createItemQuery(): StorageItemQueryResult = js.native
  def createItemQueryWithOptions(queryOptions: QueryOptions): StorageItemQueryResult = js.native
  def getFilesAsync(query: CommonFileQuery): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.StorageFile]
  ] = js.native
  def getFilesAsync(query: CommonFileQuery, startIndex: scala.Double, maxItemsToRetrieve: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.StorageFile]
  ] = js.native
  def getFoldersAsync(query: CommonFolderQuery): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.StorageFolder]
  ] = js.native
  def getFoldersAsync(query: CommonFolderQuery, startIndex: scala.Double, maxItemsToRetrieve: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.StorageFolder]
  ] = js.native
  def getIndexedStateAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IndexedState] = js.native
  def getItemsAsync(startIndex: scala.Double, maxItemsToRetrieve: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.IStorageItem]
  ] = js.native
  def isCommonFileQuerySupported(query: CommonFileQuery): scala.Boolean = js.native
  def isCommonFolderQuerySupported(query: CommonFolderQuery): scala.Boolean = js.native
}

