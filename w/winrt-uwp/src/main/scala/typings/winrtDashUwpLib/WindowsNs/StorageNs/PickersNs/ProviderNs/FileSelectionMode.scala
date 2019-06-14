package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSelectionMode extends js.Object

/** Indicates whether the file picker currently limits selection to single files, or if multiple files can be selected. */
@JSGlobal("Windows.Storage.Pickers.Provider.FileSelectionMode")
@js.native
object FileSelectionMode extends js.Object {
  /** Multiple files can be selected. */
  @js.native
  sealed trait multiple
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSelectionMode
  
  /** Only a single file can be selected. */
  @js.native
  sealed trait single
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSelectionMode
  
  /* 1 */ val multiple: multiple with scala.Double = js.native
  /* 0 */ val single: single with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSelectionMode with scala.Double
  ] = js.native
}

