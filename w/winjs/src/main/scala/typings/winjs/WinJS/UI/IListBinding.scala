package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Retrieves items from a IListDataSource, enumerates the contents of a IListDataSource, and can optionally register for change notifications.
  **/
@js.native
trait IListBinding[T] extends StObject {
  
  //#region Methods
  /**
    * Retrieves the current item.
    * @returns An IItemPromise that contains the current item. If the cursor has moved past the start or end of the list, the promise completes with a value of null. If the current item has been moved or deleted, the promise returns an error.
    **/
  def current(): IItemPromise[IItem[T]] = js.native
  
  /**
    * Gets the first item from the IListDataSource and makes it the current item.
    * @returns An IItemPromise that contains the requested IItem. If the list is empty, the promise completes with a value of null.
    **/
  def first(): IItemPromise[IItem[T]] = js.native
  
  /**
    * Retrieves the item from the IListDataSource that has the specified description and makes it the current item.
    * @param description A domain-specific description, to be interpreted by the IListDataAdapter, that identifies the item to retrieve.
    * @returns An IItemPromise that contains the requested IItem object. If the item wasn't found, the promise completes with a value of null.
    **/
  def fromDescription(description: String): IItemPromise[IItem[T]] = js.native
  
  /**
    * Retrieves the item from the IListDataSource that has the specified index and makes it the current item.
    * @param index A value greater than or equal to 0 that is the index of the item to retrieve.
    * @returns An IItemPromise that contains the requested IItem. If the item wasn't found, the promise completes with a value of null.
    **/
  def fromIndex(index: Double): IItemPromise[IItem[T]] = js.native
  
  /**
    * Retrieves the item from the IListDataSource that has the specified key and makes it the current item.
    * @param key The key that identifies the item to retrieve. This value must be a non-empty string.
    * @param hints Domain-specific information that provides additional information to the IListDataAdapter to improve retrieval time.
    * @returns An IItemPromise that contains the requested IItem. If they item couldn't be found, the promise completes with a value of null.
    **/
  def fromKey(key: String): IItemPromise[IItem[T]] = js.native
  def fromKey(key: String, hints: js.Any): IItemPromise[IItem[T]] = js.native
  
  /**
    * Makes the specified IItem or IItemPromise the current item.
    * @param item The IItem or IItemPromise that will become the current item.
    * @returns An IItemPromise that contains the specified item, if it exists. If the specified item is not in the list, the promise completes with a value of null.
    **/
  def jumpToItem(item: IItem[T]): IItemPromise[IItem[T]] = js.native
  
  /**
    * Retrieves the last item in the IListDataSource and makes it the current item.
    * @returns An IItemPromise that contains the requested IItem. f the list is empty, the promise completes with a value of null.
    **/
  def last(): IItemPromise[IItem[T]] = js.native
  
  /**
    * Retrieves the item after the current item and makes it the current item.
    * @returns An IItemPromise that contains the item after the current item. If the cursor moves past the end of the list, the promise completes with a value of null.
    **/
  def next(): IItemPromise[IItem[T]] = js.native
  
  /**
    * Retrieves the item before the current item and makes it the current item.
    * @returns An IItemPromise that contains the item before the current item. If the cursor moves past the start of the list, the promise completes with a value of null.
    **/
  def previous(): IItemPromise[IItem[T]] = js.native
  
  /**
    * Releases resources, stops notifications, and cancels outstanding promises for all tracked items returned by this IListBinding.
    **/
  def release(): Unit = js.native
  
  /**
    * Creates a request to stop change notifications for the specified item. The change notifications stop when the number of releaseItem calls matches the number of IIItemPromise.retain calls.
    * @param item The IItem or IItemPromise that should stop receiving notifications.
    **/
  def releaseItem(item: IItem[T]): Unit = js.native
}
