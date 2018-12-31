package typings
package winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of media properties. */
@JSGlobal("Windows.Media.MediaProperties.MediaPropertySet")
@js.native
/** Creates an instance for MediaPropertySet . */
class MediaPropertySet () extends js.Object {
  /** Gets the number of items contained in the property set. */
  var size: scala.Double = js.native
  /** Removes all items from the property set. */
  def clear(): scala.Unit = js.native
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The iterator. The current position of the iterator is index 0, or the end of the property set if the property set is empty.
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]] = js.native
  /**
    * Returns an immutable view of the property set.
    * @return The immutable view.
    */
  def getView(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /**
    * Indicates whether the property set has an item with the specified key.
    * @param key The key.
    * @return True if the property set has an item with the specified key; otherwise, false.
    */
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
    * Adds an item to the property set.
    * @param key The key of the item to insert.
    * @param value The value of the item to insert.
    * @return True if the method replaced a value that already existed for the key; false if this is a new key.
    */
  def insert(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  /**
    * Retrieves the value for the specified key.
    * @param key The key.
    * @return The value, if an item with the specified key exists. Otherwise, null.
    */
  def lookup(key: java.lang.String): js.Any = js.native
  /**
    * Removes a specific item from the MediaPropertySet .
    * @param key The key of the item to remove.
    * @return true if the item was removed, otherwise false.
    */
  def remove(key: java.lang.String): scala.Boolean = js.native
  /**
    * Removes an item from the property set.
    * @param key The key of the item to remove.
    */
  @JSName("remove")
  def remove_Unit(key: java.lang.String): scala.Unit = js.native
}

