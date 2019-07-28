package typings.winrt.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CachedFileOptions extends js.Object

@JSGlobal("Windows.Storage.Provider.CachedFileOptions")
@js.native
object CachedFileOptions extends js.Object {
  @js.native
  sealed trait denyAccessWhenOffline extends CachedFileOptions
  
  @js.native
  sealed trait none extends CachedFileOptions
  
  @js.native
  sealed trait requireUpdateOnAccess extends CachedFileOptions
  
  @js.native
  sealed trait useCachedFileWhenOffline extends CachedFileOptions
  
  /* 3 */ val denyAccessWhenOffline: typings.winrt.WindowsNs.StorageNs.ProviderNs.CachedFileOptions.denyAccessWhenOffline with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.StorageNs.ProviderNs.CachedFileOptions.none with Double = js.native
  /* 1 */ val requireUpdateOnAccess: typings.winrt.WindowsNs.StorageNs.ProviderNs.CachedFileOptions.requireUpdateOnAccess with Double = js.native
  /* 2 */ val useCachedFileWhenOffline: typings.winrt.WindowsNs.StorageNs.ProviderNs.CachedFileOptions.useCachedFileWhenOffline with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CachedFileOptions with Double] = js.native
}

