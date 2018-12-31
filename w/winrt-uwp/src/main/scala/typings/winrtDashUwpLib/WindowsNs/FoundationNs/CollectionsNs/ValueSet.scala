package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Implements a map with keys of type String and values of type Object . This class prevents non-serializable types from being put into the map. */
@JSGlobal("Windows.Foundation.Collections.ValueSet")
@js.native
/** Creates and initializes a new instance of the property set. */
class ValueSet () extends js.Object {
  /** Occurs when the observable map has changed. */
  @JSName("onmapchanged")
  var onmapchanged_Original: MapChangedEventHandler[java.lang.String, _] = js.native
  /** Gets the number of items contained in the value set. */
  var size: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mapchanged,
    listener: MapChangedEventHandler[java.lang.String, _]
  ): scala.Unit = js.native
  /** Removes all items from the value set. */
  def clear(): scala.Unit = js.native
  /**
    * Returns an iterator to enumerate the items in the value set.
    * @return The iterator. The current position of the iterator is index 0, or the end of the value set if the value set is empty.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Gets an immutable view of the value set.
    * @return The immutable view.
    */
  def getView(): IMapView[java.lang.String, _] = js.native
  /**
    * Indicates whether the value set has an item with the specified key.
    * @param key The key.
    * @return True if the value set has an item with the specified key; otherwise, false.
    */
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
    * Adds an item to the value set.
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
    * Removes a specific item from the ValueSet .
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
    * Removes an item from the value set.
    * @param key The key.
    */
  @JSName("remove")
  def remove_Unit(key: java.lang.String): scala.Unit = js.native
}

