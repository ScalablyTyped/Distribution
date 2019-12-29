package typings.winrtDashUwp.Windows.Storage.Pickers

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PickerViewMode with Double] = js.native
  /* 0 */ @js.native
  object list extends TopLevel[list with Double]
  
  /* 1 */ @js.native
  object thumbnail extends TopLevel[thumbnail with Double]
  
}

