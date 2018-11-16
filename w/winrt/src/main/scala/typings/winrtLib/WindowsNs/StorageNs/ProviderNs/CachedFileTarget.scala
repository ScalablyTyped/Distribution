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
  
  val local: local with java.lang.String = js.native
  val remote: remote with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileTarget with java.lang.String] = js.native
}

