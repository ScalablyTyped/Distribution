package typings
package winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UIStatus extends js.Object

/** Indicates the status of the file picker UI. */
@JSGlobal("Windows.Storage.Provider.UIStatus")
@js.native
object UIStatus extends js.Object {
  /** The file picker is currently showing UI and all */
  @js.native
  sealed trait complete
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.UIStatus
  
  /** The file picker is not showing UI, but UI can be requested. */
  @js.native
  sealed trait hidden
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.UIStatus
  
  /** The file picker is not showing UI and UI can't be requested. */
  @js.native
  sealed trait unavailable
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.UIStatus
  
  /** The file picker is currently showing UI because UI was requested by the app. */
  @js.native
  sealed trait visible
    extends winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.UIStatus
  
  val complete: complete with java.lang.String = js.native
  val hidden: hidden with java.lang.String = js.native
  val unavailable: unavailable with java.lang.String = js.native
  val visible: visible with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.UIStatus with java.lang.String] = js.native
}

