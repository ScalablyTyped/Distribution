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
  
  /* 1 */ val appAndSystem: appAndSystem with scala.Double = js.native
  /* 0 */ val appOnly: appOnly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs.RecentStorageItemVisibility with scala.Double
  ] = js.native
}

