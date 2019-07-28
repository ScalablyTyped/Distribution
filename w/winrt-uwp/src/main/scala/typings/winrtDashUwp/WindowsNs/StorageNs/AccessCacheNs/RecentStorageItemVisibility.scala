package typings.winrtDashUwp.WindowsNs.StorageNs.AccessCacheNs

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
  sealed trait appAndSystem extends RecentStorageItemVisibility
  
  /** The storage item is visible in the MRU list for the app only. */
  @js.native
  sealed trait appOnly extends RecentStorageItemVisibility
  
  /* 1 */ val appAndSystem: typings.winrtDashUwp.WindowsNs.StorageNs.AccessCacheNs.RecentStorageItemVisibility.appAndSystem with Double = js.native
  /* 0 */ val appOnly: typings.winrtDashUwp.WindowsNs.StorageNs.AccessCacheNs.RecentStorageItemVisibility.appOnly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecentStorageItemVisibility with Double] = js.native
}

