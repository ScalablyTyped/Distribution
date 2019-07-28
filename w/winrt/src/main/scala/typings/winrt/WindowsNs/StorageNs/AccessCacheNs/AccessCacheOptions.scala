package typings.winrt.WindowsNs.StorageNs.AccessCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccessCacheOptions extends js.Object

@JSGlobal("Windows.Storage.AccessCache.AccessCacheOptions")
@js.native
object AccessCacheOptions extends js.Object {
  @js.native
  sealed trait disallowUserInput extends AccessCacheOptions
  
  @js.native
  sealed trait fastLocationsOnly extends AccessCacheOptions
  
  @js.native
  sealed trait none extends AccessCacheOptions
  
  @js.native
  sealed trait suppressAccessTimeUpdate extends AccessCacheOptions
  
  @js.native
  sealed trait useReadOnlyCachedCopy extends AccessCacheOptions
  
  /* 1 */ val disallowUserInput: typings.winrt.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions.disallowUserInput with Double = js.native
  /* 2 */ val fastLocationsOnly: typings.winrt.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions.fastLocationsOnly with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions.none with Double = js.native
  /* 4 */ val suppressAccessTimeUpdate: typings.winrt.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions.suppressAccessTimeUpdate with Double = js.native
  /* 3 */ val useReadOnlyCachedCopy: typings.winrt.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions.useReadOnlyCachedCopy with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccessCacheOptions with Double] = js.native
}

