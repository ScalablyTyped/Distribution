package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CachedFileTarget extends js.Object

@JSGlobal("Windows.Storage.Provider.CachedFileTarget")
@js.native
object CachedFileTarget extends js.Object {
  @js.native
  sealed trait local
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileTarget
  
  @js.native
  sealed trait remote
    extends winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileTarget
  
  /* 0 */ val local: local with scala.Double = js.native
  /* 1 */ val remote: remote with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileTarget with scala.Double] = js.native
}

