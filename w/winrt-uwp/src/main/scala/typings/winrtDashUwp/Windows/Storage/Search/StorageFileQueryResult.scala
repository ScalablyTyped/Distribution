package typings.winrtDashUwp.Windows.Storage.Search

import typings.winrtDashUwp.Windows.Foundation.Collections.IMap
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Storage.StorageFile
import typings.winrtDashUwp.Windows.Storage.StorageFolder
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.contentschanged
import typings.winrtDashUwp.winrtDashUwpStrings.optionschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the results of a query of the files in the location that is represented by a storageFolder object. You can use storageFileQueryResult to enumerate the files in that storageFolder location. */
@JSGlobal("Windows.Storage.Search.StorageFileQueryResult")
@js.native
abstract class StorageFileQueryResult () extends js.Object {
  /** Gets the folder that was queried to create the StorageFileQueryResult object. This folder represents the scope of the query. */
  var folder: StorageFolder = js.native
  /** Fires when a file is added to, deleted from, or modified in the folder being queried. This event only fires after GetFilesAsync has been called at least once. */
  @JSName("oncontentschanged")
  var oncontentschanged_Original: TypedEventHandler[IStorageQueryResultBase, _] = js.native
  /** Fires when the query options change. */
  @JSName("onoptionschanged")
  var onoptionschanged_Original: TypedEventHandler[IStorageQueryResultBase, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_contentschanged(`type`: contentschanged, listener: TypedEventHandler[IStorageQueryResultBase, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_optionschanged(`type`: optionschanged, listener: TypedEventHandler[IStorageQueryResultBase, _]): Unit = js.native
  /**
    * Modifies query results based on new QueryOptions .
    * @param newQueryOptions The new query options.
    */
  def applyNewQueryOptions(newQueryOptions: QueryOptions): Unit = js.native
  /**
    * Retrieves the index of the file from the query results that most closely matches the specified property value (or file, if used with FileActivatedEventArgs.NeighboringFilesQuery ). The property that is matched is determined by the first SortEntry of the QueryOptions.SortOrder list.
    * @param value The property value to match when searching the query results. The property to that is used to match this value is the property in the first SortEntry of the QueryOptions.SortOrder list.
    * @return When this method completes successfully, it returns the index of the matched file in the query results or the index of the file in the FileActivatedEventArgs.NeighboringFilesQuery . In the latter case, the file is expected to be sourced from FileActivatedEventArgs.Files .
    */
  def findStartIndexAsync(value: js.Any): IPromiseWithIAsyncOperation[Double] = js.native
  /**
    * Retrieves the query options used to determine query results.
    * @return The query options.
    */
  def getCurrentQueryOptions(): QueryOptions = js.native
  /**
    * Retrieves a list of all the files in the query result set.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of files that are represented by storageFile objects.
    */
  def getFilesAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves a list of files in a specified range.
    * @param startIndex The zero-based index of the first file to retrieve. This parameter is 0 by default.
    * @param maxNumberOfItems The maximum number of files to retrieve. Use -1 to retrieve all files. If the range contains fewer files than the max number, all files in the range are returned.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of files that are represented by storageFile objects.
    */
  def getFilesAsync(startIndex: Double, maxNumberOfItems: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves the number of files in the set of query results.
    * @return When this method completes successfully, it returns the number of files in the location that match the query.
    */
  def getItemCountAsync(): IPromiseWithIAsyncOperation[Double] = js.native
  /**
    * Gets matching file properties with corresponding text ranges.
    * @param file The file to query for properties.
    * @return The matched properties and corresponding text ranges.
    */
  def getMatchingPropertiesWithRanges(file: StorageFile): IMap[String, IVectorView[_]] = js.native
  /** Fires when a file is added to, deleted from, or modified in the folder being queried. This event only fires after GetFilesAsync has been called at least once. */
  def oncontentschanged(ev: js.Any with WinRTEvent[IStorageQueryResultBase]): Unit = js.native
  /** Fires when the query options change. */
  def onoptionschanged(ev: js.Any with WinRTEvent[IStorageQueryResultBase]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentschanged(`type`: contentschanged, listener: TypedEventHandler[IStorageQueryResultBase, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_optionschanged(`type`: optionschanged, listener: TypedEventHandler[IStorageQueryResultBase, _]): Unit = js.native
}

