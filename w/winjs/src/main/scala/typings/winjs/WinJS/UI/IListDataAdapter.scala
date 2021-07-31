package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Accesses data for an IListDataSource.
  **/
trait IListDataAdapter[T] extends StObject {
  
  //#region Methods
  /**
    * Overwrites the data of the specified item.
    * @param key The key of the item to overwrite.
    * @param newData The new data for the item.
    * @param indexHint The index of the item, if known.
    * @returns A Promise that returns null or undefined when the operation completes.
    **/
  def change(key: String, newData: T, indexHint: Double): Promise[Unit]
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets a value that specifies whether to use an object's identity to determine if an item has changed.
    **/
  var compareByIdentity: Boolean
  
  /**
    * Gets the number of items in the IListDataAdapter object's data source.
    * @returns A Promise that contains the number of items the IListDataAdapter contains, or an approximate value if the actual number is unknown.
    **/
  def getCount(): Promise[Double]
  
  /**
    * Inserts the specified data after the specified item.
    * @param key A key that can be used to retrieve the new data.
    * @param data The new data to add to the IListDataAdapter object's data source.
    * @param previousKey The key of an item in the IListDataAdapter object's data source. The new data will be inserted after this item.
    * @param previousIndexHint The index of the item to insert the new data after, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertAfter(key: String, data: T, previousKey: String, previousIndexHint: Double): Promise[IItem[T]]
  
  /**
    * Adds the specified key and data to the end of the IListDataAdapter object's data source.
    * @param key A key that can be used to retrieve the new data.
    * @param data The new data to add to the IListDataAdapter object's data source.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertAtEnd(key: String, data: T): Promise[IItem[T]]
  
  /**
    * Adds the specified key and data to the beginning of the IListDataAdapter object's data source.
    * @param key A key that can be used to retrieve the new data.
    * @param data The new data to add to the IListDataAdapter object's data source.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertAtStart(key: String, data: T): Promise[IItem[T]]
  
  /**
    * Inserts the specified data before the specified item.
    * @param key A key that can be used to retrieve the new data.
    * @param data The new data to add to the IListDataAdapter object's data source.
    * @param nextKey The key of an item in the IListDataAdapter object's data source. The new data will be inserted before this item.
    * @param nextIndexHint The index of the item to insert the new data before, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertBefore(key: String, data: T, nextKey: String, nextIndexHint: Double): Promise[IItem[T]]
  
  /**
    * Returns a string representation of the specified item that can be used for comparisons.
    * @param item The item for which to generate a signature.
    * @returns The signature representation of the specified item.
    **/
  def itemSignature(item: IItem[T]): String
  
  /**
    * Retrieves the item that matches the specified description and also retrieves the specified number of items before and after the matched item.
    * @param description A description of the item to locate.
    * @param countBefore The number of items before the matched item to retrieve.
    * @param countAfter The number of items after the matched item to retrieve.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromDescription(description: String, countBefore: Double, countAfter: Double): Promise[IFetchResult[T]]
  
  /**
    * Retrieves the specified number of items from the end of the IListDataAdapter object's data source.
    * @param count The number of items to retrieve.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromEnd(count: Double): Promise[IFetchResult[T]]
  
  /**
    * Retrieves the item at the specified index and also retrieves the specified number of items before and after the selected item.
    * @param index The index of the item to retrieve.
    * @param countBefore The number of items to retrieve from before the selected item.
    * @param countAfter The number of items to retrieve from after the selected item.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromIndex(index: Double, countBefore: Double, countAfter: Double): Promise[IFetchResult[T]]
  
  /**
    * Retrieves the item that has the specified key and also retrieves the specified number of items before and after the selected item.
    * @param key The key of the item to retrieve.
    * @param countBefore The number of items to retrieve from before the selected item.
    * @param countAfter The number of items to retrieve from after the selected item.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromKey(key: String, countBefore: Double, countAfter: Double): Promise[IFetchResult[T]]
  
  /**
    * Retrieves the specified number of items from the beginning of the IListDataAdapter object's data source.
    * @param count The number of items to retrieve.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromStart(count: Double): Promise[IFetchResult[T]]
  
  /**
    * Moves the specified item to just after another item.
    * @param key A key of the item to move.
    * @param previousKey The key of another item. The item to move will be moved to just after this item.
    * @param indexHint The index of the item to move, if known.
    * @param previousIndexHint The index to move the item after, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def moveAfter(key: String, previousKey: js.Any, indexHint: String, previousIndexHint: Double): Promise[IItem[T]]
  
  /**
    * Moves the specified item to just before another item.
    * @param key A key of the item to move.
    * @param nextKey The key of another item. The item to move will be moved to just before this item.
    * @param indexHint The index of the item to move, if known.
    * @param nextIndexHint The index to move the item before, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def moveBefore(key: String, nextKey: js.Any, indexHint: String, nextIndexHint: Double): Promise[IItem[T]]
  
  /**
    * Moves the specified item to the end of the IListDataAdapter object's data source.
    * @param key The key for the item to move.
    * @param indexHint The index of the item to move, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def moveToEnd(key: String, indexHint: Double): Promise[IItem[T]]
  
  /**
    * Moves the specified item to the beginning of the IListDataAdapter object's data source.
    * @param key The key for the item to move.
    * @param indexHint The index of the item to move, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def moveToStart(key: String, indexHint: Double): Promise[IItem[T]]
  
  /**
    * Removes the specified item from the IListDataAdapter object's data source.
    * @param key The key of the item to remove.
    * @param data The new data for the item.
    * @param indexHint The index of the item.
    * @returns A Promise that returns null or undefined when the operation completes.
    **/
  def remove(key: String, data: T, indexHint: Double): Promise[Unit]
  
  /**
    * Registers a notification handler. The IListDataAdapter uses the handler to notify listening objects when its data changes.
    * @param notificationHandler The notification handler that the IListDataAdapter will use to provide change notifications. .
    **/
  def setNotificationHandler(notificationHandler: IListDataNotificationHandler[T]): Unit
}
object IListDataAdapter {
  
  @scala.inline
  def apply[T](
    change: (String, T, Double) => Promise[Unit],
    compareByIdentity: Boolean,
    getCount: () => Promise[Double],
    insertAfter: (String, T, String, Double) => Promise[IItem[T]],
    insertAtEnd: (String, T) => Promise[IItem[T]],
    insertAtStart: (String, T) => Promise[IItem[T]],
    insertBefore: (String, T, String, Double) => Promise[IItem[T]],
    itemSignature: IItem[T] => String,
    itemsFromDescription: (String, Double, Double) => Promise[IFetchResult[T]],
    itemsFromEnd: Double => Promise[IFetchResult[T]],
    itemsFromIndex: (Double, Double, Double) => Promise[IFetchResult[T]],
    itemsFromKey: (String, Double, Double) => Promise[IFetchResult[T]],
    itemsFromStart: Double => Promise[IFetchResult[T]],
    moveAfter: (String, js.Any, String, Double) => Promise[IItem[T]],
    moveBefore: (String, js.Any, String, Double) => Promise[IItem[T]],
    moveToEnd: (String, Double) => Promise[IItem[T]],
    moveToStart: (String, Double) => Promise[IItem[T]],
    remove: (String, T, Double) => Promise[Unit],
    setNotificationHandler: IListDataNotificationHandler[T] => Unit
  ): IListDataAdapter[T] = {
    val __obj = js.Dynamic.literal(change = js.Any.fromFunction3(change), compareByIdentity = compareByIdentity.asInstanceOf[js.Any], getCount = js.Any.fromFunction0(getCount), insertAfter = js.Any.fromFunction4(insertAfter), insertAtEnd = js.Any.fromFunction2(insertAtEnd), insertAtStart = js.Any.fromFunction2(insertAtStart), insertBefore = js.Any.fromFunction4(insertBefore), itemSignature = js.Any.fromFunction1(itemSignature), itemsFromDescription = js.Any.fromFunction3(itemsFromDescription), itemsFromEnd = js.Any.fromFunction1(itemsFromEnd), itemsFromIndex = js.Any.fromFunction3(itemsFromIndex), itemsFromKey = js.Any.fromFunction3(itemsFromKey), itemsFromStart = js.Any.fromFunction1(itemsFromStart), moveAfter = js.Any.fromFunction4(moveAfter), moveBefore = js.Any.fromFunction4(moveBefore), moveToEnd = js.Any.fromFunction2(moveToEnd), moveToStart = js.Any.fromFunction2(moveToStart), remove = js.Any.fromFunction3(remove), setNotificationHandler = js.Any.fromFunction1(setNotificationHandler))
    __obj.asInstanceOf[IListDataAdapter[T]]
  }
  
  @scala.inline
  implicit class IListDataAdapterMutableBuilder[Self <: IListDataAdapter[?], T] (val x: Self & IListDataAdapter[T]) extends AnyVal {
    
    @scala.inline
    def setChange(value: (String, T, Double) => Promise[Unit]): Self = StObject.set(x, "change", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCompareByIdentity(value: Boolean): Self = StObject.set(x, "compareByIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCount(value: () => Promise[Double]): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInsertAfter(value: (String, T, String, Double) => Promise[IItem[T]]): Self = StObject.set(x, "insertAfter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setInsertAtEnd(value: (String, T) => Promise[IItem[T]]): Self = StObject.set(x, "insertAtEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertAtStart(value: (String, T) => Promise[IItem[T]]): Self = StObject.set(x, "insertAtStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInsertBefore(value: (String, T, String, Double) => Promise[IItem[T]]): Self = StObject.set(x, "insertBefore", js.Any.fromFunction4(value))
    
    @scala.inline
    def setItemSignature(value: IItem[T] => String): Self = StObject.set(x, "itemSignature", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemsFromDescription(value: (String, Double, Double) => Promise[IFetchResult[T]]): Self = StObject.set(x, "itemsFromDescription", js.Any.fromFunction3(value))
    
    @scala.inline
    def setItemsFromEnd(value: Double => Promise[IFetchResult[T]]): Self = StObject.set(x, "itemsFromEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemsFromIndex(value: (Double, Double, Double) => Promise[IFetchResult[T]]): Self = StObject.set(x, "itemsFromIndex", js.Any.fromFunction3(value))
    
    @scala.inline
    def setItemsFromKey(value: (String, Double, Double) => Promise[IFetchResult[T]]): Self = StObject.set(x, "itemsFromKey", js.Any.fromFunction3(value))
    
    @scala.inline
    def setItemsFromStart(value: Double => Promise[IFetchResult[T]]): Self = StObject.set(x, "itemsFromStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveAfter(value: (String, js.Any, String, Double) => Promise[IItem[T]]): Self = StObject.set(x, "moveAfter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMoveBefore(value: (String, js.Any, String, Double) => Promise[IItem[T]]): Self = StObject.set(x, "moveBefore", js.Any.fromFunction4(value))
    
    @scala.inline
    def setMoveToEnd(value: (String, Double) => Promise[IItem[T]]): Self = StObject.set(x, "moveToEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMoveToStart(value: (String, Double) => Promise[IItem[T]]): Self = StObject.set(x, "moveToStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: (String, T, Double) => Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetNotificationHandler(value: IListDataNotificationHandler[T] => Unit): Self = StObject.set(x, "setNotificationHandler", js.Any.fromFunction1(value))
  }
}
