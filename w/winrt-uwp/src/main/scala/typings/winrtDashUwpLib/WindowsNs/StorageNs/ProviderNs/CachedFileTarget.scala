package typings
package winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CachedFileTarget extends js.Object

/** Indicates whether updates should be applied to the locally cached copy or the remote version of the file. */
@JSGlobal("Windows.Storage.Provider.CachedFileTarget")
@js.native
object CachedFileTarget extends js.Object {
  /** Update the locally cached copy of the file. */
  @js.native
  sealed trait local
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.CachedFileTarget
  
  /** Update the remote version of the file. */
  @js.native
  sealed trait remote
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.CachedFileTarget
  
  /* 0 */ val local: local with scala.Double = js.native
  /* 1 */ val remote: remote with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.CachedFileTarget with scala.Double
  ] = js.native
}

