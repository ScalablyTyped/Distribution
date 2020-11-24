package typings.winrtUwp.Windows.Foundation.Collections

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.mapchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Implements a map with keys of type String and values of type Object . This class prevents non-serializable types from being put into the map. */
@js.native
trait ValueSet extends js.Object {
  
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, _]): Unit = js.native
  
  /** Removes all items from the value set. */
  def clear(): Unit = js.native
  
  /**
    * Returns an iterator to enumerate the items in the value set.
    * @return The iterator. The current position of the iterator is index 0, or the end of the value set if the value set is empty.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  
  /**
    * Gets an immutable view of the value set.
    * @return The immutable view.
    */
  def getView(): IMapView[String, _] = js.native
  
  /**
    * Indicates whether the value set has an item with the specified key.
    * @param key The key.
    * @return True if the value set has an item with the specified key; otherwise, false.
    */
  def hasKey(key: String): Boolean = js.native
  
  /**
    * Adds an item to the value set.
    * @param key The key to insert.
    * @param value The value to insert.
    * @return True if the method replaces a value that already exists for the key; false if this is a new key.
    */
  def insert(key: String, value: js.Any): Boolean = js.native
  
  /**
    * Retrieves the value for the specified key.
    * @param key The key.
    * @return The value, if an item with the specified key exists; otherwise, null.
    */
  def lookup(key: String): js.Any = js.native
  
  /** Occurs when the observable map has changed. */
  def onmapchanged(ev: IMapChangedEventArgs[String] with (WinRTEvent[IObservableMap[String, _]])): Unit = js.native
  /** Occurs when the observable map has changed. */
  @JSName("onmapchanged")
  var onmapchanged_Original: MapChangedEventHandler[String, _] = js.native
  
  /**
    * Removes an item from the value set.
    * @param key The key.
    */
  def remove(key: String): Unit = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, _]): Unit = js.native
  
  /**
    * Removes a specific item from the ValueSet .
    * @param key The key of the item to remove.
    * @return true if the item was removed, otherwise false.
    */
  @JSName("remove")
  def remove_Boolean(key: String): Boolean = js.native
  
  /** Gets the number of items contained in the value set. */
  var size: Double = js.native
}
