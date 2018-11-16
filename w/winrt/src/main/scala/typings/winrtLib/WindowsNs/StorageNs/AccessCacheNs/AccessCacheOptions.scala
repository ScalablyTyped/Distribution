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
  
  val disallowUserInput: disallowUserInput with java.lang.String = js.native
  val fastLocationsOnly: fastLocationsOnly with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val suppressAccessTimeUpdate: suppressAccessTimeUpdate with java.lang.String = js.native
  val useReadOnlyCachedCopy: useReadOnlyCachedCopy with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.StorageNs.AccessCacheNs.AccessCacheOptions with java.lang.String
  ] = js.native
}

