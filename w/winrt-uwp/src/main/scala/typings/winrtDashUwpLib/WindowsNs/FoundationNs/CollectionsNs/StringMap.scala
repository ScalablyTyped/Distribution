package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An associative collection, also known as a map or a dictionary. */
@JSGlobal("Windows.Foundation.Collections.StringMap")
@js.native
class StringMap () extends js.Object {
  /** Occurs when the contents of the map change. */
  @JSName("onmapchanged")
  var onmapchanged_Original: MapChangedEventHandler[java.lang.String, java.lang.String] = js.native
  /** Gets the number of items in the map. */
  var size: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mapchanged,
    listener: MapChangedEventHandler[java.lang.String, java.lang.String]
  ): scala.Unit = js.native
  /** Removes all items from the map. */
  def clear(): scala.Unit = js.native
  /**
                   * Returns an iterator containing the items in the collection.
                   * @return The items in the collection.
                   */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
                   * Returns an immutable view of the map.
                   * @return The view of the map.
                   */
  def getView(): IMapView[java.lang.String, java.lang.String] = js.native
  /**
                   * Determines whether the map contains the specified key.
                   * @param key The key associated with the item to locate.
                   * @return True if the key is found; otherwise, false.
                   */
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
                   * Inserts or replaces an item in the map.
                   * @param key The key associated with the item to insert.
                   * @param value The item to insert.
                   * @return True if an item with the specified key is an existing item that was replaced; otherwise, false.
                   */
  def insert(key: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  /**
                   * Returns the item at the specified key in the map.
                   * @param key The key associated with the item to locate.
                   * @return The item associated with the specified key.
                   */
  def lookup(key: java.lang.String): java.lang.String = js.native
  /** Occurs when the contents of the map change. */
  def onmapchanged(
    ev: IMapChangedEventArgs[java.lang.String] with (winrtDashUwpLib.WindowsNs.WinRTEvent[IObservableMap[java.lang.String, java.lang.String]])
  ): scala.Unit = js.native
  /**
                   * Removes an item from the map.
                   * @param key The key associated with the item to remove.
                   */
  def remove(key: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mapchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mapchanged,
    listener: MapChangedEventHandler[java.lang.String, java.lang.String]
  ): scala.Unit = js.native
}

