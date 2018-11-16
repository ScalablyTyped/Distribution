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
  
  val denyAccessWhenOffline: denyAccessWhenOffline with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val requireUpdateOnAccess: requireUpdateOnAccess with java.lang.String = js.native
  val useCachedFileWhenOffline: useCachedFileWhenOffline with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileOptions with java.lang.String] = js.native
}

