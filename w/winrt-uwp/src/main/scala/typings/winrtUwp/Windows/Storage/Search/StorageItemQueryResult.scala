package typings.winrtUwp.Windows.Storage.Search

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.StorageFolder
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.contentschanged
import typings.winrtUwp.winrtUwpStrings.optionschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the results of a query that lists all items including files and folders (or file groups) in the folder being queried (which is represented by a storageFolder ). You can use storageItemQueryResult to enumerate the files and folders in that storageFolder . */
@js.native
trait StorageItemQueryResult extends js.Object {
  
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
    * Retrieves the index of the item from the query results that most closely matches the specified property value. The property that is matched is determined by the first SortEntry of the QueryOptions.SortOrder list.
    * @param value The property value to match when searching the query results. The property to that is used to match this value is the property in the first SortEntry of the QueryOptions.SortOrder list.
    * @return When this method completes successfully it returns the index of the matched item in the query results.
    */
  def findStartIndexAsync(value: js.Any): IPromiseWithIAsyncOperation[Double] = js.native
  
  /** Gets the folder originally used to create the StorageItemQueryResult object. This folder represents the scope of the query. */
  var folder: StorageFolder = js.native
  
  /**
    * Retrieves the query options used to determine query results.
    * @return The query options.
    */
  def getCurrentQueryOptions(): QueryOptions = js.native
  
  /**
    * Retrieves the number of items in the set of query results.
    * @return When this method completes successfully, it returns the number of items in the location that match the query.
    */
  def getItemCountAsync(): IPromiseWithIAsyncOperation[Double] = js.native
  
  /**
    * Retrieves a list of all the items (files and folders) in the query results set.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of items. Each item is the IStorageItem type and represents a file, folder, or file group.
    */
  def getItemsAsync(): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  /**
    * Retrieves a list of items (files and folders) in a specified range.
    * @param startIndex The zero-based index of the first item to retrieve. This parameter defaults to 0.
    * @param maxNumberOfItems The maximum number of items to retrieve. Use -1 to retrieve all items. If the range contains fewer items than the max number, all items in the range are returned.
    * @return When this method completes successfully, it returns a list (type IVectorView ) of items. Each item is the IStorageItem type and represents a file, folder, or file group.
    */
  def getItemsAsync(startIndex: Double, maxNumberOfItems: Double): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
  
  /** Fires when an item is added to, deleted from, or modified in the folder being queried. This event only fires after GetItemsAsync has been called at least once. */
  def oncontentschanged(ev: js.Any with WinRTEvent[IStorageQueryResultBase]): Unit = js.native
  /** Fires when an item is added to, deleted from, or modified in the folder being queried. This event only fires after GetItemsAsync has been called at least once. */
  @JSName("oncontentschanged")
  var oncontentschanged_Original: TypedEventHandler[IStorageQueryResultBase, _] = js.native
  
  /** Fires when the query options change. */
  def onoptionschanged(ev: js.Any with WinRTEvent[IStorageQueryResultBase]): Unit = js.native
  /** Fires when the query options change. */
  @JSName("onoptionschanged")
  var onoptionschanged_Original: TypedEventHandler[IStorageQueryResultBase, _] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_contentschanged(`type`: contentschanged, listener: TypedEventHandler[IStorageQueryResultBase, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_optionschanged(`type`: optionschanged, listener: TypedEventHandler[IStorageQueryResultBase, _]): Unit = js.native
}
