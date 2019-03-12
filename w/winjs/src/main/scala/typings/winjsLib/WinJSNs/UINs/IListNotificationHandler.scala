package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used by an IListBinding to provide change notifications when items in a IListDataSource change.
  **/
trait IListNotificationHandler[T] extends js.Object {
  //#region Methods
  /**
    * Indicates the start of a notification batch. Objects that are listening for notifications should defer making updates until endNotifications is called.
    **/
  def beginNotifications(): scala.Unit
  /**
    * Indicates that an item changed.
    * @param newItem The updated item.
    * @param oldItem The original item.
    **/
  def changed(newItem: IItem[T], oldItem: IItem[T]): scala.Unit
  /**
    * Indicates that the number of items in the IListDataSource has changed.
    * @param newCount The updated count.
    * @param oldCount The original count.
    **/
  def countChanged(newCount: scala.Double, oldCount: scala.Double): scala.Unit
  /**
    * Indicates the end of a notification batch. When the beginNotifications method is called, objects listening for notifications should defer making updates until endNotifications is called.
    **/
  def endNotifications(): scala.Unit
  /**
    * Indicates that the index of an item changed.
    * @param handle The temporary ID of the item.
    * @param newIndex The new index.
    * @param oldIndex The original index.
    **/
  def indexChanged(handle: java.lang.String, newIndex: scala.Double, oldIndex: scala.Double): scala.Unit
  /**
    * Indicates that an item was added to the IListDataSource.
    * @param itemPromise A promise for the new IItem.
    * @param previousHandle The temporary ID of the item that precedes the new item.
    * @param nextHandle The temporary ID of the item that follows the new item.
    **/
  def inserted(itemPromise: IItemPromise[T], previousHandle: java.lang.String, nextHandle: java.lang.String): scala.Unit
  /**
    * Indicates that an IItemPromise was fulfilled and that the item is now available.
    * @param item The fulfilled item.
    **/
  def itemAvailable(item: IItem[T]): scala.Unit
  /**
    * Indicates that an item was moved.
    * @param item A promise for the IItem that was moved.
    * @param previousHandle The temporary ID of the item that now precedes the moved item.
    * @param nextHandle The temporary ID of the item that now follows the moved item.
    **/
  def moved(item: IItemPromise[T], previousHandle: java.lang.String, nextHandle: java.lang.String): scala.Unit
  /**
    * Indicates that an item was removed.
    * @param handle The temporary ID of the item that was removed.
    * @param mirage true if the item never actually existed; false if the item was actually present in the IListDataSource.
    **/
  def removed(handle: java.lang.String, mirage: scala.Boolean): scala.Unit
}

object IListNotificationHandler {
  @scala.inline
  def apply[T](
    beginNotifications: () => scala.Unit,
    changed: (IItem[T], IItem[T]) => scala.Unit,
    countChanged: (scala.Double, scala.Double) => scala.Unit,
    endNotifications: () => scala.Unit,
    indexChanged: (java.lang.String, scala.Double, scala.Double) => scala.Unit,
    inserted: (IItemPromise[T], java.lang.String, java.lang.String) => scala.Unit,
    itemAvailable: IItem[T] => scala.Unit,
    moved: (IItemPromise[T], java.lang.String, java.lang.String) => scala.Unit,
    removed: (java.lang.String, scala.Boolean) => scala.Unit
  ): IListNotificationHandler[T] = {
    val __obj = js.Dynamic.literal(beginNotifications = js.Any.fromFunction0(beginNotifications), changed = js.Any.fromFunction2(changed), countChanged = js.Any.fromFunction2(countChanged), endNotifications = js.Any.fromFunction0(endNotifications), indexChanged = js.Any.fromFunction3(indexChanged), inserted = js.Any.fromFunction3(inserted), itemAvailable = js.Any.fromFunction1(itemAvailable), moved = js.Any.fromFunction3(moved), removed = js.Any.fromFunction2(removed))
  
    __obj.asInstanceOf[IListNotificationHandler[T]]
  }
}

