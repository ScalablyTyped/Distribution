package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Notifies listeners of dynamic changes to a map of ResourceQualifier objects, such as when items get added or removed, and allows qualifier values to change. */
@JSGlobal("Windows.ApplicationModel.Resources.Core.ResourceQualifierObservableMap")
@js.native
abstract class ResourceQualifierObservableMap () extends js.Object {
  /** Occurs when the map changes. */
  @JSName("onmapchanged")
  var onmapchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.MapChangedEventHandler[java.lang.String, java.lang.String] = js.native
  /** Gets the number of ResourceQualifier objects in the observable map. */
  var size: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mapchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.MapChangedEventHandler[java.lang.String, java.lang.String]
  ): scala.Unit = js.native
  /** Removes all items from the observable map. */
  def clear(): scala.Unit = js.native
  /**
                       * Returns an iterator to enumerate the items in the observable map.
                       * @return The iterator. The current position of the iterator is index 0, or the end of the observable map if the observable map is empty.
                       */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]] = js.native
  /**
                       * Returns an unchangeable view of the observable map.
                       * @return The view of the map.
                       */
  def getView(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, java.lang.String] = js.native
  /**
                       * Determines whether the observable map contains the specified key.
                       * @param key The key to locate in the observable map.
                       * @return TRUE if the key is found, otherwise FALSE if it is not found.
                       */
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
                       * Inserts or replaces an item in the observable map.
                       * @param key The key associated with the item to insert.
                       * @param value The item to insert.
                       * @return TRUE if an item with the specified key is an existing item and was replaced, otherwise FALSE.
                       */
  def insert(key: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  /**
                       * Returns the qualifier name at the specified key in the observable map.
                       * @param key The key to locate in the observable map.
                       * @return The qualifier name associated with the specified key.
                       */
  def lookup(key: java.lang.String): java.lang.String = js.native
  /** Occurs when the map changes. */
  def onmapchanged(
    ev: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapChangedEventArgs[java.lang.String] with (winrtDashUwpLib.WindowsNs.WinRTEvent[
      winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IObservableMap[java.lang.String, java.lang.String]
    ])
  ): scala.Unit = js.native
  /**
                       * Removes an item from the observable map.
                       * @param key The key associated with the item to remove.
                       */
  def remove(key: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mapchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mapchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.MapChangedEventHandler[java.lang.String, java.lang.String]
  ): scala.Unit = js.native
}

