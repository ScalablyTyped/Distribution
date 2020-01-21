package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vis", "DataSet")
@js.native
/**
  * Creates an instance of DataSet.
  *
  * @param [data] An Array with items.
  * @param [options] DataSet options.
  */
class DataSet[T /* <: DataItem | DataGroup | Node | Edge */] () extends js.Object {
  def this(data: js.Array[T]) = this()
  /**
    * Creates an instance of DataSet.
    *
    * @param [options] DataSet options.
    */
  def this(options: DataSetOptions) = this()
  def this(data: js.Array[T], options: DataSetOptions) = this()
  /**
    * The number of items in the DataSet.
    */
  var length: Double = js.native
  /**
    * Add one or multiple items to the DataSet.
    * Adding an item will fail when there already is an item with the same id.
    *
    * @param data data can be a single item or an array with items.
    * @param [senderId] Optional sender id.
    * @returns The function returns an array with the ids of the added items.
    */
  def add(data: T): js.Array[IdType] = js.native
  def add(data: T, senderId: IdType): js.Array[IdType] = js.native
  def add(data: js.Array[T]): js.Array[IdType] = js.native
  def add(data: js.Array[T], senderId: IdType): js.Array[IdType] = js.native
  /**
    * Clear all data from the DataSet.
    *
    * @param [senderId] Optional sender id.
    * @returns The function returns an array with the ids of the removed items.
    */
  def clear(): js.Array[IdType] = js.native
  def clear(senderId: IdType): js.Array[IdType] = js.native
  /**
    * Find all distinct values of a specified field.
    * If data items do not contain the specified field are ignored.
    *
    * @param field The search term.
    * @returns Returns an unordered array containing all distinct values.
    */
  def distinct(field: String): js.Array[_] = js.native
  /**
    * Flush queued changes.
    * Only available when the DataSet is configured with the option queue.
    */
  def flush(): Unit = js.native
  /**
    * Execute a callback function for every item in the dataset.
    *
    * @param callback The item callback.
    * @param [options] Optional options
    */
  def forEach(callback: js.Function2[/* item */ T, /* id */ IdType, Unit]): Unit = js.native
  def forEach(callback: js.Function2[/* item */ T, /* id */ IdType, Unit], options: DataSelectionOptions[T]): Unit = js.native
  /**
    * Get all items from the DataSet.
    *
    * @param [options] Optional options.
    * @returns When no item is found, null is returned when a single item was requested,
    * and and empty Array is returned in case of multiple id's.
    */
  def get(): js.Array[T] = js.native
  /**
    * Get multiple items from the DataSet.
    *
    * @param ids Array of item ids.
    * @param [options] Optional options.
    * @returns When no item is found, null is returned when a single item was requested,
    * and and empty Array is returned in case of multiple id's.
    */
  def get(ids: js.Array[IdType]): js.Array[T] = js.native
  def get(ids: js.Array[IdType], options: DataSelectionOptions[T]): js.Array[T] = js.native
  /**
    * Get a single item from the DataSet.
    *
    * @param id The item id.
    * @returns When no item is found, null is returned when a single item was requested,
    * and and empty Array is returned in case of multiple id's.
    */
  def get(id: IdType): T | Null = js.native
  def get(id: IdType, options: DataSelectionOptions[T]): T | Null = js.native
  def get(options: DataSelectionOptions[T]): js.Array[T] = js.native
  /**
    * Get the DataSet itself.
    * In case of a DataView, this function does not return the DataSet
    * to which the DataView is connected.
    *
    * @returns The DataSet itself.
    */
  def getDataSet(): DataSet[T] = js.native
  /**
    * Get ids of all items or of a filtered set of items.
    *
    * @returns ids of all items or of a filtered set of items.
    */
  def getIds(): js.Array[IdType] = js.native
  def getIds(options: DataSelectionOptions[T]): js.Array[IdType] = js.native
  /**
    * Map every item in the DataSet.
    *
    * @param callback The mapping callback.
    * @param [options] Optional options.
    * @returns The mapped items.
    */
  def map[M](callback: js.Function2[/* item */ T, /* id */ IdType, M]): js.Array[M] = js.native
  def map[M](callback: js.Function2[/* item */ T, /* id */ IdType, M], options: DataSelectionOptions[T]): js.Array[M] = js.native
  /**
    * Find the item with maximum value of specified field.
    *
    * @returns Returns null if no item is found.
    */
  def max(field: String): T = js.native
  /**
    * Find the item with minimum value of specified field.
    *
    * @returns Returns null if no item is found.
    */
  def min(field: String): T = js.native
  /**
    * Unsubscribe to an event.
    *
    * @param event The event name.
    * @param callback
    * The exact same callback that was used when calling 'on'.
    */
  def off(
    event: String,
    callback: js.Function3[/* event */ String, /* properties */ js.Any, /* senderId */ IdType, Unit]
  ): Unit = js.native
  /**
    * Subscribe from an event.
    *
    * @param event The event name.
    * @param callback
    * a callback function which will be called each time the event occurs.
    */
  def on(
    event: String,
    callback: js.Function3[/* event */ String, /* properties */ js.Any, /* senderId */ IdType, Unit]
  ): Unit = js.native
  def remove(id: js.Array[IdType]): js.Array[IdType] = js.native
  def remove(id: js.Array[IdType], senderId: IdType): js.Array[IdType] = js.native
  /**
    * Remove one or more items by id.
    *
    * @param id The item id.
    * @param [senderId] The sender id.
    * @returns Returns an array with the ids of the removed items.
    */
  def remove(id: IdType): js.Array[IdType] = js.native
  def remove(id: IdType, senderId: IdType): js.Array[IdType] = js.native
  /**
    * Set options for the DataSet.
    */
  def setOptions(): Unit = js.native
  def setOptions(options: DataSetQueueOptions): Unit = js.native
  /**
    * Update one or multiple existing items.
    * When an item doesn't exist, it will be created.
    *
    * @param data a single item or an array with items.
    * @returns Returns an array with the ids of the updated items.
    */
  def update(data: T): js.Array[IdType] = js.native
  def update(data: T, senderId: IdType): js.Array[IdType] = js.native
  def update(data: js.Array[T]): js.Array[IdType] = js.native
  def update(data: js.Array[T], senderId: IdType): js.Array[IdType] = js.native
}

