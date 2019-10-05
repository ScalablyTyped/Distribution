package typings.winrt.Windows.Storage.Pickers.Provider

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
  
  /* 1 */ val multiple: typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode.multiple with Double = js.native
  /* 0 */ val single: typings.winrt.Windows.Storage.Pickers.Provider.FileSelectionMode.single with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FileSelectionMode with Double] = js.native
}

