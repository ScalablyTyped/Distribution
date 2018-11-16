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
  
  val list: list with java.lang.String = js.native
  val thumbnail: thumbnail with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.PickersNs.PickerViewMode with java.lang.String
  ] = js.native
}

