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
  
  val multiple: multiple with java.lang.String = js.native
  val single: single with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSelectionMode with java.lang.String
  ] = js.native
}

