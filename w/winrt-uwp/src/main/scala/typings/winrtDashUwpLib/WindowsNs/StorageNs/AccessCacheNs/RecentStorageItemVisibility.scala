package typings
package winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecentStorageItemVisibility extends js.Object

/** Describes the extent of the visibility of a storage item added to the most recently used (MRU) list. */
@JSGlobal("Windows.Storage.AccessCache.RecentStorageItemVisibility")
@js.native
object RecentStorageItemVisibility extends js.Object {
  /** The storage item is visible in the MRU list for the app and the system. */
  @js.native
  sealed trait appAndSystem
    extends winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs.RecentStorageItemVisibility
  
  /** The storage item is visible in the MRU list for the app only. */
  @js.native
  sealed trait appOnly
    extends winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs.RecentStorageItemVisibility
  
  val appAndSystem: appAndSystem with java.lang.String = js.native
  val appOnly: appOnly with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs.RecentStorageItemVisibility with java.lang.String
  ] = js.native
}

