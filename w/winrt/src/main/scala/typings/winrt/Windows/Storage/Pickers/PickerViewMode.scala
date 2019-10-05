package typings.winrt.Windows.Storage.Pickers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PickerViewMode extends js.Object

@JSGlobal("Windows.Storage.Pickers.PickerViewMode")
@js.native
object PickerViewMode extends js.Object {
  @js.native
  sealed trait list extends PickerViewMode
  
  @js.native
  sealed trait thumbnail extends PickerViewMode
  
  /* 0 */ val list: typings.winrt.Windows.Storage.Pickers.PickerViewMode.list with Double = js.native
  /* 1 */ val thumbnail: typings.winrt.Windows.Storage.Pickers.PickerViewMode.thumbnail with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PickerViewMode with Double] = js.native
}

