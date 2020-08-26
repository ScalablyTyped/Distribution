package typings.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a list of objects that can be accessed by index or by a string key. Provides methods to search, sort, filter, and manipulate the data.
  **/
@js.native
trait List[T] extends ListBaseWithMutators[T] {
  /**
    * Gets or sets the length of the list, which is an integer value one higher than the highest element defined in the list.
    **/
  var length: Double = js.native
  /**
    * Gets a key/data pair for the specified list index.
    * @param index The index of value to retrieve.
    * @returns An object with .key and .data properties.
    **/
  def getItem(index: Double): IKeyDataPair[T] = js.native
  /**
    * Gets a key/data pair for the list item key specified.
    * @param key The key of the value to retrieve.
    * @returns An object with .key and .data properties.
    **/
  def getItemFromKey(key: String): IKeyDataPair[T] = js.native
  /**
    * Gets the index of the first occurrence of a key in a list.
    * @param key The key to locate in the list.
    * @returns The index of the first occurrence of a key in a list, or -1 if not found.
    **/
  def indexOfKey(key: String): Double = js.native
  /**
    * Moves the value at index to the specified position.
    * @param index The original index of the value.
    * @param newIndex The index of the value after the move.
    **/
  def move(index: Double, newIndex: Double): Unit = js.native
  /**
    * Forces the list to send a itemmutated notification to any listeners for the value at the specified index.
    * @param index The index of the value that was mutated.
    **/
  def notifyMutated(index: Double): Unit = js.native
  /**
    * Returns a list with the elements reversed. This method reverses the elements of a list object in place. It does not create a new list object during execution.
    **/
  def reverse(): Unit = js.native
  /**
    * Replaces the value at the specified index with a new value.
    * @param index The index of the value that was replaced.
    * @param newValue The new value.
    **/
  def setAt(index: Double, newValue: T): Unit = js.native
  /**
    * Returns a list with the elements sorted. This method sorts the elements of a list object in place. It does not create a new list object during execution.
    * @param sortFunction The function used to determine the order of the elements. If omitted, the elements are sorted in ascending, ASCII character order. This function must always return the same results, given the same inputs. The results should not depend on values that are subject to change. You must call notifyMutated each time an item changes. Do not batch change notifications.
    **/
  def sort(): Unit = js.native
  def sort(sortFunction: js.Function2[/* left */ T, /* right */ T, Double]): Unit = js.native
  def splice(start: Double, howMany: js.UndefOr[scala.Nothing], item: T*): js.Array[T] = js.native
  /**
    * Removes elements from a list and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the list from which to start removing elements.
    * @param howMany The number of elements to remove.
    * @param item The elements to insert into the list in place of the deleted elements.
    * @returns The deleted elements.
    **/
  def splice(start: Double, howMany: Double, item: T*): js.Array[T] = js.native
}

