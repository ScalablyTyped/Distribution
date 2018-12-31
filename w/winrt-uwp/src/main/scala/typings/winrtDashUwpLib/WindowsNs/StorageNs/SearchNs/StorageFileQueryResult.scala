package typings
package winrtDashUwpLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the results of a query of the files in the location that is represented by a storageFolder object. You can use storageFileQueryResult to enumerate the files in that storageFolder location. */
@JSGlobal("Windows.Storage.Search.StorageFileQueryResult")
@js.native
abstract class StorageFileQueryResult () extends js.Object {
  /** Gets the folder that was queried to create the StorageFileQueryResult object. This folder represents the scope of the query. */
  var folder: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Fires when a file is added to, deleted from, or modified in the folder being queried. This event only fires after GetFilesAsync has been called at least once. */
  @JSName("oncontentschanged")
  var oncontentschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageQueryResultBase, _] = js.native
  /** Fires when the query options change. */
  @JSName("onoptionschanged")
  var onoptionschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageQueryResultBase, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.contentschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageQueryResultBase, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.optionschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageQueryResultBase, _]
  ): scala.Unit = js.native
  /**
    * Modifies query results based on new QueryOptions .
    * @param newQueryOptions The new query options.
    */
  def applyNewQueryOptions(newQueryOptions: QueryOptions): scala.Unit = js.native
  /**
    * Retrieves the index of the file from the query results that most closely matches the specified property value (or file, if used with FileActivatedEventArgs.NeighboringFilesQuery ). The property that is matched is determined by the first SortEntry of the QueryOptions.SortOrder list.
    * @param value The property value to match when searching the query results. The property to that is used to match this value is the property in the first SortEntry of the QueryOptions.SortOrder list.
    * @return When this method completes successfully, it returns the index of the matched file in the query results or the index of the file in the FileActivatedEventArgs.NeighboringFilesQuery . In the latter case, the file is expected to be sourced from FileActivatedEventArgs.Files .
    */
  def findStartIndexAsync(value: js.Any): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double] = js.native
  /**
    * Retrieves the query options used to determine query results.
    * @return The query options.
    */
  def getCurrentQueryOptions(): QueryOptions = js.native
  /**
    * Retrieves a list of all the files in the query result set.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of files that are represented by storageFile objects.
    */
  def getFilesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Retrieves a list of files in a specified range.
    * @param startIndex The zero-based index of the first file to retrieve. This parameter is 0 by default.
    * @param maxNumberOfItems The maximum number of files to retrieve. Use -1 to retrieve all files. If the range contains fewer files than the max number, all files in the range are returned.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of files that are represented by storageFile objects.
    */
  def getFilesAsync(startIndex: scala.Double, maxNumberOfItems: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Retrieves the number of files in the set of query results.
    * @return When this method completes successfully, it returns the number of files in the location that match the query.
    */
  def getItemCountAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double] = js.native
  /**
    * Gets matching file properties with corresponding text ranges.
    * @param file The file to query for properties.
    * @return The matched properties and corresponding text ranges.
    */
  def getMatchingPropertiesWithRanges(file: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[
    java.lang.String, 
    winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]
  ] = js.native
  /** Fires when a file is added to, deleted from, or modified in the folder being queried. This event only fires after GetFilesAsync has been called at least once. */
  def oncontentschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[IStorageQueryResultBase]): scala.Unit = js.native
  /** Fires when the query options change. */
  def onoptionschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[IStorageQueryResultBase]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.contentschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageQueryResultBase, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_optionschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.optionschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[IStorageQueryResultBase, _]
  ): scala.Unit = js.native
}

