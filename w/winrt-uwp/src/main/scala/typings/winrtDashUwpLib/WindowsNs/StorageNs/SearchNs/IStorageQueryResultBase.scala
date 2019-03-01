package typings
package winrtDashUwpLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods to access to and manage query results. */
trait IStorageQueryResultBase extends js.Object {
  /** Gets the folder originally used to create a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object. This folder represents the scope of the query. */
  var folder: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder
  /**
    * Applies new query options to the results retrieved by the StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object.
    * @param newQueryOptions The new query options.
    */
  def applyNewQueryOptions(newQueryOptions: QueryOptions): scala.Unit
  /**
    * Retrieves the index of the file from the query results that most closely matches the specified property value. The property that is matched is determined by the first SortEntry of the QueryOptions.SortOrder list.
    * @param value The property value to match when searching the query results.
    * @return When this method completes successfully it returns the index of the matched item in the query results.
    */
  def findStartIndexAsync(value: js.Any): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double]
  /**
    * Retrieves the query options used to create a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object.
    * @return The query options.
    */
  def getCurrentQueryOptions(): QueryOptions
  /**
    * Retrieves the number of items that match the query that created a StorageFileQueryResult , StorageFolderQueryResult , or StorageItemQueryResult object.
    * @return When this method completes successfully, it returns the number of items that match the query.
    */
  def getItemCountAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double]
}

object IStorageQueryResultBase {
  @scala.inline
  def apply(
    applyNewQueryOptions: js.Function1[QueryOptions, scala.Unit],
    findStartIndexAsync: js.Function1[
      js.Any, 
      winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double]
    ],
    folder: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder,
    getCurrentQueryOptions: js.Function0[QueryOptions],
    getItemCountAsync: js.Function0[winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double]]
  ): IStorageQueryResultBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyNewQueryOptions")(applyNewQueryOptions)
    __obj.updateDynamic("findStartIndexAsync")(findStartIndexAsync)
    __obj.updateDynamic("folder")(folder)
    __obj.updateDynamic("getCurrentQueryOptions")(getCurrentQueryOptions)
    __obj.updateDynamic("getItemCountAsync")(getItemCountAsync)
    __obj.asInstanceOf[IStorageQueryResultBase]
  }
}

