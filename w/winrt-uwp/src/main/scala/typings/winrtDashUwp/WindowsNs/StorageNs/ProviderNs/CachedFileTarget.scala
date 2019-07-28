package typings.winrtDashUwp.WindowsNs.StorageNs.ProviderNs

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
  sealed trait local extends CachedFileTarget
  
  /** Update the remote version of the file. */
  @js.native
  sealed trait remote extends CachedFileTarget
  
  /* 0 */ val local: typings.winrtDashUwp.WindowsNs.StorageNs.ProviderNs.CachedFileTarget.local with Double = js.native
  /* 1 */ val remote: typings.winrtDashUwp.WindowsNs.StorageNs.ProviderNs.CachedFileTarget.remote with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CachedFileTarget with Double] = js.native
}

