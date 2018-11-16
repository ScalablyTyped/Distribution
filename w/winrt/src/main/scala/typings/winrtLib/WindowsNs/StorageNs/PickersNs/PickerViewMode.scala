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
  
  val list: list with java.lang.String = js.native
  val thumbnail: thumbnail with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.StorageNs.PickersNs.PickerViewMode with java.lang.String] = js.native
}

