package typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FileSelectionMode extends js.Object

@JSGlobal("Windows.Storage.Pickers.Provider.FileSelectionMode")
@js.native
object FileSelectionMode extends js.Object {
  @js.native
  sealed trait multiple extends FileSelectionMode
  
  @js.native
  sealed trait single extends FileSelectionMode
  
  /* 1 */ val multiple: typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSelectionMode.multiple with Double = js.native
  /* 0 */ val single: typings.winrt.WindowsNs.StorageNs.PickersNs.ProviderNs.FileSelectionMode.single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSelectionMode with Double] = js.native
}

