package typings.winrt.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CachedFileTarget extends js.Object

@JSGlobal("Windows.Storage.Provider.CachedFileTarget")
@js.native
object CachedFileTarget extends js.Object {
  @js.native
  sealed trait local extends CachedFileTarget
  
  @js.native
  sealed trait remote extends CachedFileTarget
  
  /* 0 */ val local: typings.winrt.WindowsNs.StorageNs.ProviderNs.CachedFileTarget.local with Double = js.native
  /* 1 */ val remote: typings.winrt.WindowsNs.StorageNs.ProviderNs.CachedFileTarget.remote with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CachedFileTarget with Double] = js.native
}

