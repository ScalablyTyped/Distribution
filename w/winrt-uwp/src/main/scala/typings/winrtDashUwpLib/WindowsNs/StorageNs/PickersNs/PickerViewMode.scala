package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PickerViewMode extends js.Object

/** Indicates the view mode that the file picker is using to present items. */
@JSGlobal("Windows.Storage.Pickers.PickerViewMode")
@js.native
object PickerViewMode extends js.Object {
  /** A list of items. */
  @js.native
  sealed trait list
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerViewMode
  
  /** A set of thumbnail images. */
  @js.native
  sealed trait thumbnail
    extends winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerViewMode
  
  /* 0 */ val list: list with scala.Double = js.native
  /* 1 */ val thumbnail: thumbnail with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerViewMode with scala.Double] = js.native
}

