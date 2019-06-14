package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CachedFileOptions extends js.Object

@JSGlobal("Windows.Storage.Provider.CachedFileOptions")
@js.native
object CachedFileOptions extends js.Object {
  @js.native
  sealed trait denyAccessWhenOffline
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileOptions
  
  @js.native
  sealed trait requireUpdateOnAccess
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileOptions
  
  @js.native
  sealed trait useCachedFileWhenOffline
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileOptions
  
  /* 3 */ val denyAccessWhenOffline: denyAccessWhenOffline with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val requireUpdateOnAccess: requireUpdateOnAccess with scala.Double = js.native
  /* 2 */ val useCachedFileWhenOffline: useCachedFileWhenOffline with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileOptions with scala.Double] = js.native
}

