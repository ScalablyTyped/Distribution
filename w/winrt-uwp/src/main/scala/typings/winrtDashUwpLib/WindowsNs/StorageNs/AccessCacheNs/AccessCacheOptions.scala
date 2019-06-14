package typings
package winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccessCacheOptions extends js.Object

/** Describes the behavior to use when the app accesses an item in a list. */
@JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
@js.native
object AccessCacheOptions extends js.Object {
  /** When the app accesses the item, the user is prevented from entering information. */
  @js.native
  sealed trait disallowUserInput
    extends winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions
  
  /** When the app accesses the item, it is retrieved from a fast location like the local file system. */
  @js.native
  sealed trait fastLocationsOnly
    extends winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions
  
  /** Default. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions
  
  /** When the app accesses the item in the StorageItemMostRecentlyUsedList , Windows preserves the item's current position in the MRU and does not update the access time of the item. */
  @js.native
  sealed trait suppressAccessTimeUpdate
    extends winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions
  
  /** When the app accesses the item, the app retrieves a cached, read-only version of the file. This version of the file might not be the most recent. */
  @js.native
  sealed trait useReadOnlyCachedCopy
    extends winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions
  
  /* 1 */ val disallowUserInput: disallowUserInput with scala.Double = js.native
  /* 2 */ val fastLocationsOnly: fastLocationsOnly with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 4 */ val suppressAccessTimeUpdate: suppressAccessTimeUpdate with scala.Double = js.native
  /* 3 */ val useReadOnlyCachedCopy: useReadOnlyCachedCopy with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions with scala.Double
  ] = js.native
}

