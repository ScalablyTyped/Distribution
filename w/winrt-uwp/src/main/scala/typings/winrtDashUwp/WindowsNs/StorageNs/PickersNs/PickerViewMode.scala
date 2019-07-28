package typings.winrtDashUwp.WindowsNs.StorageNs.PickersNs

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
  sealed trait list extends PickerViewMode
  
  /** A set of thumbnail images. */
  @js.native
  sealed trait thumbnail extends PickerViewMode
  
  /* 0 */ val list: typings.winrtDashUwp.WindowsNs.StorageNs.PickersNs.PickerViewMode.list with Double = js.native
  /* 1 */ val thumbnail: typings.winrtDashUwp.WindowsNs.StorageNs.PickersNs.PickerViewMode.thumbnail with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PickerViewMode with Double] = js.native
}

