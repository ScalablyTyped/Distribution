package typings.winjs.WinJS.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used by an IListBinding to provide change notifications when items in a IListDataSource change.
  **/
trait IListNotificationHandler[T] extends StObject {
  
  //#region Methods
  /**
    * Indicates the start of a notification batch. Objects that are listening for notifications should defer making updates until endNotifications is called.
    **/
  def beginNotifications(): Unit
  
  /**
    * Indicates that an item changed.
    * @param newItem The updated item.
    * @param oldItem The original item.
    **/
  def changed(newItem: IItem[T], oldItem: IItem[T]): Unit
  
  /**
    * Indicates that the number of items in the IListDataSource has changed.
    * @param newCount The updated count.
    * @param oldCount The original count.
    **/
  def countChanged(newCount: Double, oldCount: Double): Unit
  
  /**
    * Indicates the end of a notification batch. When the beginNotifications method is called, objects listening for notifications should defer making updates until endNotifications is called.
    **/
  def endNotifications(): Unit
  
  /**
    * Indicates that the index of an item changed.
    * @param handle The temporary ID of the item.
    * @param newIndex The new index.
    * @param oldIndex The original index.
    **/
  def indexChanged(handle: String, newIndex: Double, oldIndex: Double): Unit
  
  /**
    * Indicates that an item was added to the IListDataSource.
    * @param itemPromise A promise for the new IItem.
    * @param previousHandle The temporary ID of the item that precedes the new item.
    * @param nextHandle The temporary ID of the item that follows the new item.
    **/
  def inserted(itemPromise: IItemPromise[T], previousHandle: String, nextHandle: String): Unit
  
  /**
    * Indicates that an IItemPromise was fulfilled and that the item is now available.
    * @param item The fulfilled item.
    **/
  def itemAvailable(item: IItem[T]): Unit
  
  /**
    * Indicates that an item was moved.
    * @param item A promise for the IItem that was moved.
    * @param previousHandle The temporary ID of the item that now precedes the moved item.
    * @param nextHandle The temporary ID of the item that now follows the moved item.
    **/
  def moved(item: IItemPromise[T], previousHandle: String, nextHandle: String): Unit
  
  /**
    * Indicates that an item was removed.
    * @param handle The temporary ID of the item that was removed.
    * @param mirage true if the item never actually existed; false if the item was actually present in the IListDataSource.
    **/
  def removed(handle: String, mirage: Boolean): Unit
}
object IListNotificationHandler {
  
  @scala.inline
  def apply[T](
    beginNotifications: () => Unit,
    changed: (IItem[T], IItem[T]) => Unit,
    countChanged: (Double, Double) => Unit,
    endNotifications: () => Unit,
    indexChanged: (String, Double, Double) => Unit,
    inserted: (IItemPromise[T], String, String) => Unit,
    itemAvailable: IItem[T] => Unit,
    moved: (IItemPromise[T], String, String) => Unit,
    removed: (String, Boolean) => Unit
  ): IListNotificationHandler[T] = {
    val __obj = js.Dynamic.literal(beginNotifications = js.Any.fromFunction0(beginNotifications), changed = js.Any.fromFunction2(changed), countChanged = js.Any.fromFunction2(countChanged), endNotifications = js.Any.fromFunction0(endNotifications), indexChanged = js.Any.fromFunction3(indexChanged), inserted = js.Any.fromFunction3(inserted), itemAvailable = js.Any.fromFunction1(itemAvailable), moved = js.Any.fromFunction3(moved), removed = js.Any.fromFunction2(removed))
    __obj.asInstanceOf[IListNotificationHandler[T]]
  }
  
  @scala.inline
  implicit class IListNotificationHandlerMutableBuilder[Self <: IListNotificationHandler[?], T] (val x: Self & IListNotificationHandler[T]) extends AnyVal {
    
    @scala.inline
    def setBeginNotifications(value: () => Unit): Self = StObject.set(x, "beginNotifications", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChanged(value: (IItem[T], IItem[T]) => Unit): Self = StObject.set(x, "changed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCountChanged(value: (Double, Double) => Unit): Self = StObject.set(x, "countChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEndNotifications(value: () => Unit): Self = StObject.set(x, "endNotifications", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIndexChanged(value: (String, Double, Double) => Unit): Self = StObject.set(x, "indexChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInserted(value: (IItemPromise[T], String, String) => Unit): Self = StObject.set(x, "inserted", js.Any.fromFunction3(value))
    
    @scala.inline
    def setItemAvailable(value: IItem[T] => Unit): Self = StObject.set(x, "itemAvailable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoved(value: (IItemPromise[T], String, String) => Unit): Self = StObject.set(x, "moved", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemoved(value: (String, Boolean) => Unit): Self = StObject.set(x, "removed", js.Any.fromFunction2(value))
  }
}
