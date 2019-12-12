package typings.winrt.Windows.Storage.Pickers

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.Pickers.PickerViewMode.list
import typings.winrt.Windows.Storage.Pickers.PickerViewMode.thumbnail
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PickerViewMode with Double] = js.native
  /* 0 */ @js.native
  object list extends TopLevel[list with Double]
  
  /* 1 */ @js.native
  object thumbnail extends TopLevel[thumbnail with Double]
  
}

