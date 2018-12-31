package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a property set, which is a set of PropertyValue objects with string keys. */
@JSGlobal("Windows.Foundation.Collections.PropertySet")
@js.native
/** Creates and initializes a new instance of the property set. */
class PropertySet () extends js.Object {
  /** Occurs when the observable map has changed. */
  @JSName("onmapchanged")
  var onmapchanged_Original: MapChangedEventHandler[java.lang.String, _] = js.native
  /** Gets the number of items contained in the property set. */
  var size: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mapchanged,
    listener: MapChangedEventHandler[java.lang.String, _]
  ): scala.Unit = js.native
  /** Removes all items from the property set. */
  def clear(): scala.Unit = js.native
  /**
    * Returns an iterator to enumerate the items in the property set.
    * @return The iterator. The current position of the iterator is index 0, or the end of the property set if the property set is empty.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Gets an immutable view of the property set.
    * @return The immutable view.
    */
  def getView(): IMapView[java.lang.String, _] = js.native
  /**
    * Indicates whether the property set has an item with the specified key.
    * @param key The key.
    * @return True if the property set has an item with the specified key; otherwise, false.
    */
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
    * Adds an item to the property set.
    * @param key The key to insert.
    * @param value The value to insert.
    * @return True if the method replaces a value that already exists for the key; false if this is a new key.
    */
  def insert(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  /**
    * Retrieves the value for the specified key.
    * @param key The key.
    * @return The value, if an item with the specified key exists; otherwise, null.
    */
  def lookup(key: java.lang.String): js.Any = js.native
  /** Occurs when the observable map has changed. */
  def onmapchanged(
    ev: IMapChangedEventArgs[java.lang.String] with (winrtDashUwpLib.WindowsNs.WinRTEvent[IObservableMap[java.lang.String, _]])
  ): scala.Unit = js.native
  /**
    * Removes a specific item from the PropertySet .
    * @param key The key of the item to remove.
    * @return true if the item was removed, otherwise false.
    */
  def remove(key: java.lang.String): scala.Boolean = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mapchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mapchanged,
    listener: MapChangedEventHandler[java.lang.String, _]
  ): scala.Unit = js.native
  /**
    * Removes an item from the property set.
    * @param key The key.
    */
  @JSName("remove")
  def remove_Unit(key: java.lang.String): scala.Unit = js.native
}

