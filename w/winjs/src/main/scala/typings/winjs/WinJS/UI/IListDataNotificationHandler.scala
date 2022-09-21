package typings.winjs.WinJS.UI

import typings.winjs.WinJS.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Notifies clients when an IListDataAdapter object's data changes.
  **/
@js.native
trait IListDataNotificationHandler[T] extends StObject {
  
  //#region Methods
  /**
    * Indicates the start of a notification batch. Objects that are listening for notifications should defer making updates until endNotifications is called.
    **/
  def beginNotifications(): Unit = js.native
  
  /**
    * Raises a notification that an item in the IListDataAdapter object's data source has changed.
    * @param item The item that changed.
    **/
  def changed(item: IItem[T]): Unit = js.native
  
  /**
    * Indicates the end of a notification batch. When the beginNotifications method is called, objects listening for notifications should defer making updates until endNotifications is called.
    **/
  def endNotifications(): Unit = js.native
  
  /**
    * Raises a notification that an item has been added to the IListDataAdapter object's data source.
    * @param newItem The new item added to the IListDataAdapter object's data source.
    * @param previousKey The key of the item that now precedes the new item, or null if the item was inserted at the start of the list. If nextKey is provided, this parameter may be null.
    * @param nextKey The key of the item that now follows the new item, or null if the item was inserted at the end of the list. If previousKey is provided, this parameter may be null.
    * @param index The index of the new item.
    **/
  def inserted(newItem: IItem[T], previousKey: String, nextKey: String): Unit = js.native
  def inserted(newItem: IItem[T], previousKey: String, nextKey: String, index: Double): Unit = js.native
  
  /**
    * Indicates that all previous data obtained from the IListDataAdapter is invalid and should be refreshed.
    * @returns A Promise that completes when the data has been completely refreshed and all change notifications have been sent.
    **/
  def invalidateAll(): Promise[Any] = js.native
  
  /**
    * Raises a notification that an item was moved within the IListDataAdapter object's data source.
    * @param item The item that was moved.
    * @param previousKey The key of the item that now precedes the new item, or null if the item was moved to the beginning of the list. If nextKey is provided, this parameter may be null.
    * @param nextKey The key of the item that now follows the new item, or null if the item was moved to the end of the list. If previousKey is provided, this parameter may be null.
    * @param oldIndex The item's original index.
    * @param newIndex The item's new index.
    **/
  def moved(item: IItem[T], previousKey: String, nextKey: String): Unit = js.native
  def moved(item: IItem[T], previousKey: String, nextKey: String, oldIndex: Double): Unit = js.native
  def moved(item: IItem[T], previousKey: String, nextKey: String, oldIndex: Double, newIndex: Double): Unit = js.native
  def moved(item: IItem[T], previousKey: String, nextKey: String, oldIndex: Unit, newIndex: Double): Unit = js.native
  
  /**
    * Reloads data from the IListDataAdapter.
    **/
  def reload(): Unit = js.native
  
  /**
    * Raises a notification that an item was removed from the IListDataAdapter object's data source.
    * @param key The key of the item that was removed.
    * @param index The index of the item that was removed.
    **/
  def removed(key: String): Unit = js.native
  def removed(key: String, index: Double): Unit = js.native
}
