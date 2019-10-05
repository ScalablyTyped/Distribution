package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionOptions extends js.Object

@JSGlobal("Windows.UI.Text.SelectionOptions")
@js.native
object SelectionOptions extends js.Object {
  @js.native
  sealed trait active extends SelectionOptions
  
  @js.native
  sealed trait atEndOfLine extends SelectionOptions
  
  @js.native
  sealed trait overtype extends SelectionOptions
  
  @js.native
  sealed trait replace extends SelectionOptions
  
  @js.native
  sealed trait startActive extends SelectionOptions
  
  /* 3 */ val active: typings.winrt.Windows.UI.Text.SelectionOptions.active with Double = js.native
  /* 1 */ val atEndOfLine: typings.winrt.Windows.UI.Text.SelectionOptions.atEndOfLine with Double = js.native
  /* 2 */ val overtype: typings.winrt.Windows.UI.Text.SelectionOptions.overtype with Double = js.native
  /* 4 */ val replace: typings.winrt.Windows.UI.Text.SelectionOptions.replace with Double = js.native
  /* 0 */ val startActive: typings.winrt.Windows.UI.Text.SelectionOptions.startActive with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionOptions with Double] = js.native
}

