package typings
package winrtLib.WindowsNs.StorageNs.AccessCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccessCacheOptions extends js.Object

@JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
@js.native
object AccessCacheOptions extends js.Object {
  @js.native
  sealed trait disallowUserInput
    extends winrtLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions
  
  @js.native
  sealed trait fastLocationsOnly
    extends winrtLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions
  
  @js.native
  sealed trait suppressAccessTimeUpdate
    extends winrtLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions
  
  @js.native
  sealed trait useReadOnlyCachedCopy
    extends winrtLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions
  
  /* 1 */ val disallowUserInput: disallowUserInput with scala.Double = js.native
  /* 2 */ val fastLocationsOnly: fastLocationsOnly with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 4 */ val suppressAccessTimeUpdate: suppressAccessTimeUpdate with scala.Double = js.native
  /* 3 */ val useReadOnlyCachedCopy: useReadOnlyCachedCopy with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions with scala.Double] = js.native
}

