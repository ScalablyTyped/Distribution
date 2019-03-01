package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Accesses data for an IListDataSource.
  **/
trait IListDataAdapter[T] extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets a value that specifies whether to use an object's identity to determine if an item has changed.
    **/
  var compareByIdentity: scala.Boolean
  //#region Methods
  /**
    * Overwrites the data of the specified item.
    * @param key The key of the item to overwrite.
    * @param newData The new data for the item.
    * @param indexHint The index of the item, if known.
    * @returns A Promise that returns null or undefined when the operation completes.
    **/
  def change(key: java.lang.String, newData: T, indexHint: scala.Double): winjsLib.WinJSNs.Promise[scala.Unit]
  /**
    * Gets the number of items in the IListDataAdapter object's data source.
    * @returns A Promise that contains the number of items the IListDataAdapter contains, or an approximate value if the actual number is unknown.
    **/
  def getCount(): winjsLib.WinJSNs.Promise[scala.Double]
  /**
    * Inserts the specified data after the specified item.
    * @param key A key that can be used to retrieve the new data.
    * @param data The new data to add to the IListDataAdapter object's data source.
    * @param previousKey The key of an item in the IListDataAdapter object's data source. The new data will be inserted after this item.
    * @param previousIndexHint The index of the item to insert the new data after, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertAfter(key: java.lang.String, data: T, previousKey: java.lang.String, previousIndexHint: scala.Double): winjsLib.WinJSNs.Promise[IItem[T]]
  /**
    * Adds the specified key and data to the end of the IListDataAdapter object's data source.
    * @param key A key that can be used to retrieve the new data.
    * @param data The new data to add to the IListDataAdapter object's data source.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertAtEnd(key: java.lang.String, data: T): winjsLib.WinJSNs.Promise[IItem[T]]
  /**
    * Adds the specified key and data to the beginning of the IListDataAdapter object's data source.
    * @param key A key that can be used to retrieve the new data.
    * @param data The new data to add to the IListDataAdapter object's data source.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertAtStart(key: java.lang.String, data: T): winjsLib.WinJSNs.Promise[IItem[T]]
  /**
    * Inserts the specified data before the specified item.
    * @param key A key that can be used to retrieve the new data.
    * @param data The new data to add to the IListDataAdapter object's data source.
    * @param nextKey The key of an item in the IListDataAdapter object's data source. The new data will be inserted before this item.
    * @param nextIndexHint The index of the item to insert the new data before, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def insertBefore(key: java.lang.String, data: T, nextKey: java.lang.String, nextIndexHint: scala.Double): winjsLib.WinJSNs.Promise[IItem[T]]
  /**
    * Returns a string representation of the specified item that can be used for comparisons.
    * @param item The item for which to generate a signature.
    * @returns The signature representation of the specified item.
    **/
  def itemSignature(item: IItem[T]): java.lang.String
  /**
    * Retrieves the item that matches the specified description and also retrieves the specified number of items before and after the matched item.
    * @param description A description of the item to locate.
    * @param countBefore The number of items before the matched item to retrieve.
    * @param countAfter The number of items after the matched item to retrieve.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromDescription(description: java.lang.String, countBefore: scala.Double, countAfter: scala.Double): winjsLib.WinJSNs.Promise[IFetchResult[T]]
  /**
    * Retrieves the specified number of items from the end of the IListDataAdapter object's data source.
    * @param count The number of items to retrieve.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromEnd(count: scala.Double): winjsLib.WinJSNs.Promise[IFetchResult[T]]
  /**
    * Retrieves the item at the specified index and also retrieves the specified number of items before and after the selected item.
    * @param index The index of the item to retrieve.
    * @param countBefore The number of items to retrieve from before the selected item.
    * @param countAfter The number of items to retrieve from after the selected item.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromIndex(index: scala.Double, countBefore: scala.Double, countAfter: scala.Double): winjsLib.WinJSNs.Promise[IFetchResult[T]]
  /**
    * Retrieves the item that has the specified key and also retrieves the specified number of items before and after the selected item.
    * @param key The key of the item to retrieve.
    * @param countBefore The number of items to retrieve from before the selected item.
    * @param countAfter The number of items to retrieve from after the selected item.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromKey(key: java.lang.String, countBefore: scala.Double, countAfter: scala.Double): winjsLib.WinJSNs.Promise[IFetchResult[T]]
  /**
    * Retrieves the specified number of items from the beginning of the IListDataAdapter object's data source.
    * @param count The number of items to retrieve.
    * @returns A Promise that provides an IFetchResult that contains the selected items or a FetchError if an error was encountered.
    **/
  def itemsFromStart(count: scala.Double): winjsLib.WinJSNs.Promise[IFetchResult[T]]
  /**
    * Moves the specified item to just after another item.
    * @param key A key of the item to move.
    * @param previousKey The key of another item. The item to move will be moved to just after this item.
    * @param indexHint The index of the item to move, if known.
    * @param previousIndexHint The index to move the item after, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def moveAfter(
    key: java.lang.String,
    previousKey: js.Any,
    indexHint: java.lang.String,
    previousIndexHint: scala.Double
  ): winjsLib.WinJSNs.Promise[IItem[T]]
  /**
    * Moves the specified item to just before another item.
    * @param key A key of the item to move.
    * @param nextKey The key of another item. The item to move will be moved to just before this item.
    * @param indexHint The index of the item to move, if known.
    * @param nextIndexHint The index to move the item before, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def moveBefore(key: java.lang.String, nextKey: js.Any, indexHint: java.lang.String, nextIndexHint: scala.Double): winjsLib.WinJSNs.Promise[IItem[T]]
  /**
    * Moves the specified item to the end of the IListDataAdapter object's data source.
    * @param key The key for the item to move.
    * @param indexHint The index of the item to move, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def moveToEnd(key: java.lang.String, indexHint: scala.Double): winjsLib.WinJSNs.Promise[IItem[T]]
  /**
    * Moves the specified item to the beginning of the IListDataAdapter object's data source.
    * @param key The key for the item to move.
    * @param indexHint The index of the item to move, if known.
    * @returns A Promise that contains the IItem that was added or an EditError if an error was encountered.
    **/
  def moveToStart(key: java.lang.String, indexHint: scala.Double): winjsLib.WinJSNs.Promise[IItem[T]]
  /**
    * Removes the specified item from the IListDataAdapter object's data source.
    * @param key The key of the item to remove.
    * @param data The new data for the item.
    * @param indexHint The index of the item.
    * @returns A Promise that returns null or undefined when the operation completes.
    **/
  def remove(key: java.lang.String, data: T, indexHint: scala.Double): winjsLib.WinJSNs.Promise[scala.Unit]
  /**
    * Registers a notification handler. The IListDataAdapter uses the handler to notify listening objects when its data changes.
    * @param notificationHandler The notification handler that the IListDataAdapter will use to provide change notifications. .
    **/
  def setNotificationHandler(notificationHandler: IListDataNotificationHandler[T]): scala.Unit
}

object IListDataAdapter {
  @scala.inline
  def apply[T](
    change: js.Function3[java.lang.String, T, scala.Double, winjsLib.WinJSNs.Promise[scala.Unit]],
    compareByIdentity: scala.Boolean,
    getCount: js.Function0[winjsLib.WinJSNs.Promise[scala.Double]],
    insertAfter: js.Function4[java.lang.String, T, java.lang.String, scala.Double, winjsLib.WinJSNs.Promise[IItem[T]]],
    insertAtEnd: js.Function2[java.lang.String, T, winjsLib.WinJSNs.Promise[IItem[T]]],
    insertAtStart: js.Function2[java.lang.String, T, winjsLib.WinJSNs.Promise[IItem[T]]],
    insertBefore: js.Function4[java.lang.String, T, java.lang.String, scala.Double, winjsLib.WinJSNs.Promise[IItem[T]]],
    itemSignature: js.Function1[IItem[T], java.lang.String],
    itemsFromDescription: js.Function3[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      winjsLib.WinJSNs.Promise[IFetchResult[T]]
    ],
    itemsFromEnd: js.Function1[scala.Double, winjsLib.WinJSNs.Promise[IFetchResult[T]]],
    itemsFromIndex: js.Function3[scala.Double, scala.Double, scala.Double, winjsLib.WinJSNs.Promise[IFetchResult[T]]],
    itemsFromKey: js.Function3[
      java.lang.String, 
      scala.Double, 
      scala.Double, 
      winjsLib.WinJSNs.Promise[IFetchResult[T]]
    ],
    itemsFromStart: js.Function1[scala.Double, winjsLib.WinJSNs.Promise[IFetchResult[T]]],
    moveAfter: js.Function4[
      java.lang.String, 
      js.Any, 
      java.lang.String, 
      scala.Double, 
      winjsLib.WinJSNs.Promise[IItem[T]]
    ],
    moveBefore: js.Function4[
      java.lang.String, 
      js.Any, 
      java.lang.String, 
      scala.Double, 
      winjsLib.WinJSNs.Promise[IItem[T]]
    ],
    moveToEnd: js.Function2[java.lang.String, scala.Double, winjsLib.WinJSNs.Promise[IItem[T]]],
    moveToStart: js.Function2[java.lang.String, scala.Double, winjsLib.WinJSNs.Promise[IItem[T]]],
    remove: js.Function3[java.lang.String, T, scala.Double, winjsLib.WinJSNs.Promise[scala.Unit]],
    setNotificationHandler: js.Function1[IListDataNotificationHandler[T], scala.Unit]
  ): IListDataAdapter[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("compareByIdentity")(compareByIdentity)
    __obj.updateDynamic("getCount")(getCount)
    __obj.updateDynamic("insertAfter")(insertAfter)
    __obj.updateDynamic("insertAtEnd")(insertAtEnd)
    __obj.updateDynamic("insertAtStart")(insertAtStart)
    __obj.updateDynamic("insertBefore")(insertBefore)
    __obj.updateDynamic("itemSignature")(itemSignature)
    __obj.updateDynamic("itemsFromDescription")(itemsFromDescription)
    __obj.updateDynamic("itemsFromEnd")(itemsFromEnd)
    __obj.updateDynamic("itemsFromIndex")(itemsFromIndex)
    __obj.updateDynamic("itemsFromKey")(itemsFromKey)
    __obj.updateDynamic("itemsFromStart")(itemsFromStart)
    __obj.updateDynamic("moveAfter")(moveAfter)
    __obj.updateDynamic("moveBefore")(moveBefore)
    __obj.updateDynamic("moveToEnd")(moveToEnd)
    __obj.updateDynamic("moveToStart")(moveToStart)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("setNotificationHandler")(setNotificationHandler)
    __obj.asInstanceOf[IListDataAdapter[T]]
  }
}

