package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the settings in a settings container. The ApplicationDataContainer.Values property returns an object that can be cast to this type. */
@JSGlobal("Windows.Storage.ApplicationDataContainerSettings")
@js.native
abstract class ApplicationDataContainerSettings () extends js.Object {
  /** Occurs when the map changes. */
  @JSName("onmapchanged")
  var onmapchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.MapChangedEventHandler[java.lang.String, _] = js.native
  /** Gets the number of related application settings. */
  var size: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mapchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mapchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.MapChangedEventHandler[java.lang.String, _]
  ): scala.Unit = js.native
  /** Removes all related application settings. */
  def clear(): scala.Unit = js.native
  /**
    * Retrieves an iterator to enumerate the settings in the settings container.
    * @return The iterator.
    */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair[_, _]] = js.native
  /**
    * Returns a read-only snapshot of the contents of the settings container.
    * @return The view of the settings container.
    */
  def getView(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, _] = js.native
  /**
    * Determines whether there is an application setting with the specified key.
    * @param key The key.
    * @return True if the key is found; otherwise false.
    */
  def hasKey(key: java.lang.String): scala.Boolean = js.native
  /**
    * Inserts or replaces an application setting.
    * @param key The key of the setting to insert or replace.
    * @param value The setting value.
    * @return True if an item with the specified key is an existing item and was replaced; otherwise, false.
    */
  def insert(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  /**
    * Retrieves the specified application setting.
    * @param key The key of the setting.
    * @return The application setting.
    */
  def lookup(key: java.lang.String): js.Any = js.native
  /** Occurs when the map changes. */
  def onmapchanged(
    ev: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMapChangedEventArgs[java.lang.String] with (winrtDashUwpLib.WindowsNs.WinRTEvent[
      winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IObservableMap[java.lang.String, _]
    ])
  ): scala.Unit = js.native
  /**
    * Removes a specific item from the ApplicationDataContainerSettings .
    * @param key The key of the item to remove.
    * @return true if the item was removed, otherwise false.
    */
  def remove(key: java.lang.String): scala.Boolean = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mapchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mapchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.MapChangedEventHandler[java.lang.String, _]
  ): scala.Unit = js.native
  /**
    * Removes the specified application setting.
    * @param key The key of the setting.
    */
  @JSName("remove")
  def remove_Unit(key: java.lang.String): scala.Unit = js.native
}

