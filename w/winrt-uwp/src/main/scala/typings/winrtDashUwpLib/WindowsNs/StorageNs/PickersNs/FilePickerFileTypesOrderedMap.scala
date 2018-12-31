package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of display names mapped to the associated file types (extensions). Each element in this collection maps a display name to a corresponding collection of file name extensions. The key is a single string, the value is a list/vector of strings representing one or more extension choices. */
@JSGlobal("Windows.Storage.Pickers.FilePickerFileTypesOrderedMap")
@js.native
abstract class FilePickerFileTypesOrderedMap () extends js.Object {
  /** Gets the number of items in the mapped collection of display names and associated file types. */
  var size: scala.Double = js.native
  /** Removes all display names and associated file name extensions from the collection. */
  def clear(): scala.Unit = js.native
  /**
    * Retrieves an iterator that iterates through the display names and associated file types in the collection.
    * @return The iterator.
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]] = js.native
  /**
    * Returns an immutable view of the collection of display names and associated file types.
    * @return The view of the collection.
    */
  def getView(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
    java.lang.String, 
    winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  ] = js.native
  /**
    * Determines whether the mapped collection of display names and associated file types contains the specified key.
    * @param key The key.
    * @return True if the key is found; otherwise, false.
    */
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
    * Inserts or replaces an item in the mapped collection of display names and associated file types.
    * @param key The key associated with the item to insert.
    * @param value The item to insert.
    * @return true if an item with the specified key is an existing item and was replaced; otherwise false.
    */
  def insert(
    key: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  ): scala.Boolean = js.native
  /**
    * Returns the item at the specified key in the mapped collection of display names and associated file types.
    * @param key The key to use to locate the item.
    * @return The item associated with the specified key.
    */
  def lookup(key: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /**
    * Removes an item from the mapped collection of display names and associated file types.
    * @param key The key associated with the item to remove.
    */
  def remove(key: java.lang.String): scala.Unit = js.native
}

