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
  
  /* 3 */ val complete: complete with scala.Double = js.native
  /* 1 */ val hidden: hidden with scala.Double = js.native
  /* 0 */ val unavailable: unavailable with scala.Double = js.native
  /* 2 */ val visible: visible with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.ProviderNs.UIStatus with scala.Double] = js.native
}

