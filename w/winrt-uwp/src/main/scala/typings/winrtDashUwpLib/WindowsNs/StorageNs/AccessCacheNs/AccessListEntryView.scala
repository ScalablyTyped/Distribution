package typings
package winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of the entries that are in your app's most recently used list (MRU) (obtained from the static StorageApplicationPermissions.MostRecentlyUsedList property) and in your app's future-access list (obtained from the static StorageApplicationPermissions.FutureAccessList property). */
@JSGlobal("Windows.Storage.AccessCache.AccessListEntryView")
@js.native
abstract class AccessListEntryView ()
  extends stdLib.Array[AccessListEntry] {
  /** Gets the number of storage items in the access list or most recently used (MRU) list. */
  var size: scala.Double = js.native
  /**
                   * Retrieves the first storage item from the access list or most recently used (MRU) list.
                   * @return The first item.
                   */
  def first(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterator[AccessListEntry] = js.native
  /**
                   * Retrieves the storage item at the specified index in the access list or most recently used (MRU) list.
                   * @param index The zero-based index of the storage item to retrieve.
                   * @return The storage item.
                   */
  def getAt(index: scala.Double): AccessListEntry = js.native
  /**
                   * Retrieves the storage items that start at the specified index in the access list or most recently used (MRU) list.
                   * @param startIndex The zero-based index of the start of the items in the collection to retrieve.
                   */
  def getMany(startIndex: scala.Double): winrtDashUwpLib.Anon_Items = js.native
  def indexOf(value: AccessListEntry, extra: js.Any*): winrtDashUwpLib.Anon_Index = js.native
  /**
                   * Retrieves the index of the specified storage item in the access list or most recently used (MRU) list.
                   * @param value The storage item.
                   */
  @JSName("indexOf")
  def indexOf_Anon_Index(value: AccessListEntry): winrtDashUwpLib.Anon_Index = js.native
}

