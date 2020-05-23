package typings.winrtUwp.Windows.Foundation.Collections

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.mapchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An associative collection, also known as a map or a dictionary. */
@js.native
trait StringMap extends js.Object {
  /** Occurs when the contents of the map change. */
  @JSName("onmapchanged")
  var onmapchanged_Original: MapChangedEventHandler[String, String] = js.native
  /** Gets the number of items in the map. */
  var size: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, String]): Unit = js.native
  /** Removes all items from the map. */
  def clear(): Unit = js.native
  /**
    * Returns an iterator containing the items in the collection.
    * @return The items in the collection.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Returns an immutable view of the map.
    * @return The view of the map.
    */
  def getView(): IMapView[String, String] = js.native
  /**
    * Determines whether the map contains the specified key.
    * @param key The key associated with the item to locate.
    * @return True if the key is found; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Inserts or replaces an item in the map.
    * @param key The key associated with the item to insert.
    * @param value The item to insert.
    * @return True if an item with the specified key is an existing item that was replaced; otherwise, false.
    */
  def insert(key: String, value: String): Boolean = js.native
  /**
    * Returns the item at the specified key in the map.
    * @param key The key associated with the item to locate.
    * @return The item associated with the specified key.
    */
  def lookup(key: String): String = js.native
  /** Occurs when the contents of the map change. */
  def onmapchanged(ev: IMapChangedEventArgs[String] with (WinRTEvent[IObservableMap[String, String]])): Unit = js.native
  /**
    * Removes an item from the map.
    * @param key The key associated with the item to remove.
    */
  def remove(key: String): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, String]): Unit = js.native
}

