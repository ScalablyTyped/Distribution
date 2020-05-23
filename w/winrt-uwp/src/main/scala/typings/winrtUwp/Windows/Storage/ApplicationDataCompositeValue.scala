package typings.winrtUwp.Windows.Storage

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapChangedEventArgs
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IObservableMap
import typings.winrtUwp.Windows.Foundation.Collections.MapChangedEventHandler
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.mapchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents related app settings that must be serialized and deserialized atomically. */
@js.native
trait ApplicationDataCompositeValue extends js.Object {
  /** Occurs when the map changes. */
  @JSName("onmapchanged")
  var onmapchanged_Original: MapChangedEventHandler[String, _] = js.native
  /** Gets the number of related application settings. */
  var size: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, _]): Unit = js.native
  /** Removes all application settings previously inserted into the composite value object, returning the object to its empty state. */
  def clear(): Unit = js.native
  /**
    * Retrieves an iterator to enumerate the settings in the composite value.
    * @return The iterator.
    */
  def first(): IIterator[IKeyValuePair[_, _]] = js.native
  /**
    * Returns a read-only snapshot of the contents of the composite value.
    * @return The view of the composite value.
    */
  def getView(): IMapView[String, _] = js.native
  /**
    * Determines whether there is an application setting with the specified key.
    * @param key The key.
    * @return True if the key is found; otherwise false.
    */
  def hasKey(key: String): Boolean = js.native
  /**
    * Creates or replaces an application setting.
    * @param key The key of the setting to insert or replace.
    * @param value The setting value.
    * @return True if an item with the specified key is an existing item and was replaced; otherwise, false.
    */
  def insert(key: String, value: js.Any): Boolean = js.native
  /**
    * Retrieves the specified application setting.
    * @param key The key of the setting.
    * @return The application setting.
    */
  def lookup(key: String): js.Any = js.native
  /** Occurs when the map changes. */
  def onmapchanged(ev: IMapChangedEventArgs[String] with (WinRTEvent[IObservableMap[String, _]])): Unit = js.native
  /**
    * Removes a specific item from the ApplicationDataCompositeValue .
    * @param key The key of the item to remove.
    * @return true if the item was removed, otherwise false.
    */
  def remove(key: String): Boolean = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mapchanged(`type`: mapchanged, listener: MapChangedEventHandler[String, _]): Unit = js.native
  /**
    * Removes the value with the specified key.
    * @param key The key of the value to remove.
    */
  @JSName("remove")
  def remove_Unit(key: String): Unit = js.native
}

