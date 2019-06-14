package typings
package winrtLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PickerViewMode extends js.Object

@JSGlobal("Windows.Storage.Pickers.PickerViewMode")
@js.native
object PickerViewMode extends js.Object {
  @js.native
  sealed trait list
    extends winrtLib.WindowsNs.StorageNs.PickersNs.PickerViewMode
  
  @js.native
  sealed trait thumbnail
    extends winrtLib.WindowsNs.StorageNs.PickersNs.PickerViewMode
  
  /* 0 */ val list: list with scala.Double = js.native
  /* 1 */ val thumbnail: thumbnail with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.StorageNs.PickersNs.PickerViewMode with scala.Double] = js.native
}

