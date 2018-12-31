package typings
package winjsLib.WinJSNs.BindingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of objects that can be accessed by index or by a string key. Provides methods to search, sort, filter, and manipulate the data.
  **/
@JSGlobal("WinJS.Binding.List")
@js.native
//#region Constructors
/**
  * Creates a List object.
  * @constructor
  * @param list The array containing the elements to initalize the list.
  * @param options You can set two Boolean options: binding and proxy. If options.binding is true, the list contains the result of calling as on the element values. If options.proxy is true, the list specified as the first parameter is used as the storage for the List. This option should be used with care, because uncoordinated edits to the data storage may result in errors.
  **/
class List[T] () extends ListBaseWithMutators[T] {
  def this(list: js.Array[T]) = this()
  def this(list: js.Array[T], options: js.Any) = this()
  /**
    * Gets or sets the length of the list, which is an integer value one higher than the highest element defined in the list.
    **/
  var length: scala.Double = js.native
  /**
    * Gets a key/data pair for the specified list index.
    * @param index The index of value to retrieve.
    * @returns An object with .key and .data properties.
    **/
  def getItem(index: scala.Double): IKeyDataPair[T] = js.native
  /**
    * Gets a key/data pair for the list item key specified.
    * @param key The key of the value to retrieve.
    * @returns An object with .key and .data properties.
    **/
  def getItemFromKey(key: java.lang.String): IKeyDataPair[T] = js.native
  /**
    * Gets the index of the first occurrence of a key in a list.
    * @param key The key to locate in the list.
    * @returns The index of the first occurrence of a key in a list, or -1 if not found.
    **/
  def indexOfKey(key: java.lang.String): scala.Double = js.native
  /**
    * Moves the value at index to the specified position.
    * @param index The original index of the value.
    * @param newIndex The index of the value after the move.
    **/
  def move(index: scala.Double, newIndex: scala.Double): scala.Unit = js.native
  /**
    * Forces the list to send a itemmutated notification to any listeners for the value at the specified index.
    * @param index The index of the value that was mutated.
    **/
  def notifyMutated(index: scala.Double): scala.Unit = js.native
  /**
    * Returns a list with the elements reversed. This method reverses the elements of a list object in place. It does not create a new list object during execution.
    **/
  def reverse(): scala.Unit = js.native
  /**
    * Replaces the value at the specified index with a new value.
    * @param index The index of the value that was replaced.
    * @param newValue The new value.
    **/
  def setAt(index: scala.Double, newValue: T): scala.Unit = js.native
  /**
    * Returns a list with the elements sorted. This method sorts the elements of a list object in place. It does not create a new list object during execution.
    * @param sortFunction The function used to determine the order of the elements. If omitted, the elements are sorted in ascending, ASCII character order. This function must always return the same results, given the same inputs. The results should not depend on values that are subject to change. You must call notifyMutated each time an item changes. Do not batch change notifications.
    **/
  def sort(): scala.Unit = js.native
  def sort(sortFunction: js.Function2[/* left */ T, /* right */ T, scala.Double]): scala.Unit = js.native
  /**
    * Removes elements from a list and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the list from which to start removing elements.
    * @param howMany The number of elements to remove.
    * @param item The elements to insert into the list in place of the deleted elements.
    * @returns The deleted elements.
    **/
  def splice(start: scala.Double): js.Array[T] = js.native
  def splice(start: scala.Double, howMany: scala.Double, item: T*): js.Array[T] = js.native
}

/**
  * Represents a list of objects that can be accessed by index or by a string key. Provides methods to search, sort, filter, and manipulate the data.
  **/
@JSGlobal("WinJS.Binding.List")
@js.native
object List extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
}

