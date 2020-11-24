package typings.winrtUwp.Windows.Storage.Search

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods to access to and manage query results. */
@js.native
trait IStorageQueryResultBase extends js.Object {
  
  /**
    * Applies new query options to the results retrieved by the StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object.
    * @param newQueryOptions The new query options.
    */
  def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit = js.native
  
  /**
    * Retrieves the index of the file from the query results that most closely matches the specified property value. The property that is matched is determined by the first SortEntry of the QueryOptions.SortOrder list.
    * @param value The property value to match when searching the query results.
    * @return When this method completes successfully it returns the index of the matched item in the query results.
    */
  def findStartIndexAsync(value: js.Any): IPromiseWithIAsyncOperation[Double] = js.native
  
  /** Gets the folder originally used to create a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object. This folder represents the scope of the query. */
  var folder: StorageFolder = js.native
  
  /**
    * Retrieves the query options used to create a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object.
    * @return The query options.
    */
  def getCurrentQueryOptions(): QueryOptions = js.native
  
  /**
    * Retrieves the number of items that match the query that created a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object.
    * @return When this method completes successfully, it returns the number of items that match the query.
    */
  def getItemCountAsync(): IPromiseWithIAsyncOperation[Double] = js.native
}
object IStorageQueryResultBase {
  
  @scala.inline
  def apply(
    applyNewQueryOptions: QueryOptions => Unit,
    findStartIndexAsync: js.Any => IPromiseWithIAsyncOperation[Double],
    folder: StorageFolder,
    getCurrentQueryOptions: () => QueryOptions,
    getItemCountAsync: () => IPromiseWithIAsyncOperation[Double]
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal(applyNewQueryOptions = js.Any.fromFunction1(applyNewQueryOptions), findStartIndexAsync = js.Any.fromFunction1(findStartIndexAsync), folder = folder.asInstanceOf[js.Any], getCurrentQueryOptions = js.Any.fromFunction0(getCurrentQueryOptions), getItemCountAsync = js.Any.fromFunction0(getItemCountAsync))
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
  
  @scala.inline
  implicit class IStorageQueryResultBaseOps[Self <: IStorageQueryResultBase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyNewQueryOptions(value: QueryOptions => Unit): Self = this.set("applyNewQueryOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindStartIndexAsync(value: js.Any => IPromiseWithIAsyncOperation[Double]): Self = this.set("findStartIndexAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFolder(value: StorageFolder): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentQueryOptions(value: () => QueryOptions): Self = this.set("getCurrentQueryOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItemCountAsync(value: () => IPromiseWithIAsyncOperation[Double]): Self = this.set("getItemCountAsync", js.Any.fromFunction0(value))
  }
}
