package typings.winjs.WinJSNs.BindingNs

import typings.std.CustomEvent
import typings.winjs.WinJSNs.Promise
import typings.winjs.WinJSNs.UINs.IListDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base class for lists.
  **/
@js.native
trait ListBase[T] extends js.Object {
  //#endregion Methods
  //#region Properties
  /**
    * Gets the IListDataSource for the list. The only purpose of this property is to adapt a List to the data model that is used by ListView and FlipView.
    **/
  var dataSource: IListDataSource[T] = js.native
  //#endregion Events
  //#region Methods
  /**
    * Adds an event listener to the control.
    * @param type The type (name) of the event.
    * @param listener The listener to invoke when the event gets raised.
    * @param useCapture If true, initiates capture, otherwise false.
    **/
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * Links the specified action to the property specified in the name parameter. This function is invoked when the value of the property may have changed. It is not guaranteed that the action will be called only when a value has actually changed, nor is it guaranteed that the action will be called for every value change. The implementation of this function coalesces change notifications, such that multiple updates to a property value may result in only a single call to the specified action.
    * @param name The name of the property to which to bind the action.
    * @param action The function to invoke asynchronously when the property may have changed.
    * @returns A reference to this observableMixin object.
    **/
  def bind(name: String, action: js.Function): js.Any = js.native
  /**
    * Returns a new list consisting of a combination of two arrays.
    * @param item Additional items to add to the end of the list.
    * @returns An array containing the concatenation of the list and any other supplied items.
    **/
  def concat(item: T*): js.Array[T] = js.native
  /**
    * Creates a live filtered projection over this list. As the list changes, the filtered projection reacts to those changes and may also change.
    * @param predicate A function that accepts a single argument. The createFiltered function calls the callback with each element in the list. If the function returns true, that element will be included in the filtered list. This function must always return the same results, given the same inputs. The results should not depend on values that are subject to change. You must call notifyMutated each time an item changes. Do not batch change notifications.
    * @returns A filtered projection over the list.
    **/
  def createFiltered(predicate: js.Function1[/* x */ T, Boolean]): FilteredListProjection[T] = js.native
  /**
    * Creates a live grouped projection over this list. As the list changes, the grouped projection reacts to those changes and may also change. The grouped projection sorts all the elements of the list to be in group-contiguous order. The grouped projection also contains a .groups property, which is a List representing the groups that were found in the list.
    * @param groupKey A function that accepts a single argument. The function is called with each element in the list, the function should return a string representing the group containing the element. This function must always return the same results, given the same inputs. The results should not depend on values that are subject to change. You must call notifyMutated each time an item changes. Do not batch change notifications.
    * @param groupData A function that accepts a single argument. The function is called once, on one element per group. It should return the value that should be set as the data of the .groups list element for this group. The data value usually serves as summary or header information for the group.
    * @param groupSorter A function that accepts two arguments. The function is called with pairs of group keys found in the list. It must return one of the following numeric values: negative if the first argument is less than the second (sorted before), zero if the two arguments are equivalent, positive if the first argument is greater than the second (sorted after).
    * @returns A grouped projection over the list.
    **/
  def createGrouped[G](groupKey: js.Function1[/* x */ T, String], groupData: js.Function1[/* x */ T, G]): GroupedSortedListProjection[T, G] = js.native
  def createGrouped[G](
    groupKey: js.Function1[/* x */ T, String],
    groupData: js.Function1[/* x */ T, G],
    groupSorter: js.Function2[/* left */ String, /* right */ String, Double]
  ): GroupedSortedListProjection[T, G] = js.native
  /**
    * Creates a live sorted projection over this list. As the list changes, the sorted projection reacts to those changes and may also change.
    * @param sorter A function that accepts two arguments. The function is called with elements in the list. It must return one of the following numeric values: negative if the first argument is less than the second, zero if the two arguments are equivalent, positive if the first argument is greater than the second. This function must always return the same results, given the same inputs. The results should not depend on values that are subject to change. You must call notifyMutated each time an item changes. Do not batch change notifications.
    * @returns A sorted projection over the list.
    **/
  def createSorted(sorter: js.Function2[/* left */ T, /* right */ T, Double]): SortedListProjection[T] = js.native
  /**
    * Raises an event of the specified type and with the specified additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  /**
    * Checks whether the specified callback function returns true for all elements in a list.
    * @param callback A function that accepts up to three arguments. This function is called for each element in the list until it returns false or the end of the list is reached.
    * @param thisArg An object to which the this keyword can refer in the callback function. If thisArg is omitted, undefined is used.
    * @returns true if the callback returns true for all elements in the list.
    **/
  def every(callback: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
  def every(
    callback: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  /**
    * Returns the elements of a list that meet the condition specified in a callback function.
    * @param callback A function that accepts up to three arguments. The function is called for each element in the list. This function must always return the same results, given the same inputs. The results should not depend on values that are subject to change. You must call notifyMutated each time an item changes. Do not batch change notifications.
    * @param thisArg An object to which the this keyword can refer in the callback function. If thisArg is omitted, undefined is used.
    * @returns An array containing the elements that meet the condition specified in the callback function.
    **/
  def filter(callback: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _]): js.Array[T] = js.native
  def filter(
    callback: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], _],
    thisArg: js.Any
  ): js.Array[T] = js.native
  /**
    * Calls the specified callback function for each element in a list.
    * @param callback A function that accepts up to three arguments. The function is called for each element in the list. The arguments are as follows: value, index, array.
    * @param thisArg An object to which the this keyword can refer in the callback function. If thisArg is omitted, undefined is used.
    **/
  def forEach(callback: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
  def forEach(
    callback: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit],
    thisArg: js.Any
  ): Unit = js.native
  /**
    * Gets the value at the specified index.
    * @param index The index of the value to get.
    * @returns The value at the specified index.
    **/
  def getAt(index: Double): T = js.native
  /**
    * Gets the index of the first occurrence of the specified value in a list.
    * @param searchElement The value to locate in the list.
    * @param fromIndex The index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
    * @returns The index of the first occurrence of a value in a list or -1 if not found.
    **/
  def indexOf(searchElement: T): Double = js.native
  def indexOf(searchElement: T, fromIndex: Double): Double = js.native
  /**
    * Returns a string consisting of all the elements of a list separated by the specified separator string.
    * @param separator A string used to separate the elements of a list. If this parameter is omitted, the list elements are separated with a comma.
    * @returns The elements of a list separated by the specified separator string.
    **/
  def join(): String = js.native
  def join(separator: String): String = js.native
  /**
    * Gets the index of the last occurrence of the specified value in a list.
    * @param searchElement The value to locate in the list.
    * @param fromIndex The index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the list.
    * @returns The index of the last occurrence of a value in a list, or -1 if not found.
    **/
  def lastIndexOf(searchElement: T): Double = js.native
  def lastIndexOf(searchElement: T, fromIndex: Double): Double = js.native
  /**
    * Calls the specified callback function on each element of a list, and returns an array that contains the results.
    * @param callback A function that accepts up to three arguments. The function is called for each element in the list.
    * @param thisArg n object to which the this keyword can refer in the callback function. If thisArg is omitted, undefined is used.
    * @returns An array containing the result of calling the callback function on each element in the list.
    **/
  def map[G](callback: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], G]): js.Array[G] = js.native
  def map[G](
    callback: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], G],
    thisArg: js.Any
  ): js.Array[G] = js.native
  /**
    * Notifies listeners that a property value was updated.
    * @param name The name of the property that is being updated.
    * @param newValue The new value for the property.
    * @param oldValue The old value for the property.
    * @returns A promise that is completed when the notifications are complete.
    **/
  def notify(name: String, newValue: js.Any, oldValue: js.Any): Promise[_] = js.native
  /**
    * Forces the list to send a reload notification to any listeners.
    **/
  def notifyReload(): Unit = js.native
  //#region Events
  /**
    * An item in the list has changed its value.
    * @param eventInfo An object that contains information about the event. The detail contains the following information: index, key, newItem, newValue, oldItem, oldValue.
    **/
  def onitemchanged(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * A new item has been inserted into the list.
    * @param eventInfo An object that contains information about the event. The detail contains the following information: index, key, value.
    **/
  def oniteminserted(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * An item has been changed locations in the list.
    * @param eventInfo An object that contains information about the event. The detail contains the following information: index, key, value.
    **/
  def onitemmoved(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * An item has been mutated. This event occurs as a result of calling the notifyMutated method.
    * @param eventInfo An object that contains information about the event. The detail contains the following information: index, key, value.
    **/
  def onitemmutated(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * An item has been removed from the list.
    * @param eventInfo An object that contains information about the event. The detail contains the following information: index, key, value.
    **/
  def onitemremoved(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * The list has been refreshed. Any references to items in the list may be incorrect.
    * @param eventInfo An object that contains information about the event. The detail property of this object is null.
    **/
  def onreload(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Accumulates a single result by calling the specified callback function for all elements in a list. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callback A function that accepts up to four arguments. These arguments are: previousValue, currentValue, currentIndex, array. The function is called for each element in the list.
    * @param initiallValue If initialValue is specified, it is used as the value with which to start the accumulation. The first call to the function provides this value as an argument instead of a list value.
    * @returns The return value from the last call to the callback function.
    **/
  def reduce(
    callback: js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      T
    ]
  ): T = js.native
  def reduce(
    callback: js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      T
    ],
    initiallValue: T
  ): T = js.native
  /**
    * Accumulates a single result by calling the specified callback function for all elements in a list, starting with the last member of the list. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callback A function that accepts up to four arguments. These arguments are: previousValue, currentValue, currentIndex, array. The function is called for each element in the list.
    * @param initialValue If initialValue is specified, it is used as the value with which to start the accumulation. The first call to the callback function provides this value as an argument instead of a list value.
    * @returns The return value from the last call to callback function.
    **/
  def reduceRight(
    callback: js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      T
    ]
  ): T = js.native
  def reduceRight(
    callback: js.Function4[
      /* previousValue */ js.Any, 
      /* currentValue */ js.Any, 
      /* currentIndex */ Double, 
      /* array */ js.Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  /**
    * Removes an event listener from the control.
    * @param type The type (name) of the event.
    * @param listener The listener to remove.
    * @param useCapture true if capture is to be initiated, otherwise false.
    **/
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * Extracts a section of a list and returns a new list.
    * @param begin The index that specifies the beginning of the section.
    * @param end The index that specifies the end of the section.
    * @returns Returns a section of list.
    **/
  def slice(begin: Double): js.Array[T] = js.native
  def slice(begin: Double, end: Double): js.Array[T] = js.native
  /**
    * Checks whether the specified callback function returns true for any element of a list.
    * @param callback A function that accepts up to three arguments. The function is called for each element in the list until it returns true, or until the end of the list.
    * @param thisArg An object to which the this keyword can refer in the callback function. If thisArg is omitted, undefined is used.
    * @returns true if callback returns true for any element in the list.
    **/
  def some(callback: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean]): Boolean = js.native
  def some(
    callback: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  /**
    * Removes one or more listeners from the notification list for a given property.
    * @param name The name of the property to unbind. If this parameter is omitted, all listeners for all events are removed.
    * @param action The function to remove from the listener list for the specified property. If this parameter is omitted, all listeners are removed for the specific property.
    * @returns This object is returned.
    **/
  def unbind(name: String, action: js.Function): js.Any = js.native
}

