package typings.winrtDashUwp.WindowsNs.StorageNs.PickersNs.ProviderNs

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
  sealed trait multiple extends FileSelectionMode
  
  /** Only a single file can be selected. */
  @js.native
  sealed trait single extends FileSelectionMode
  
  /* 1 */ val multiple: typings.winrtDashUwp.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSelectionMode.multiple with Double = js.native
  /* 0 */ val single: typings.winrtDashUwp.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSelectionMode.single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSelectionMode with Double] = js.native
}

