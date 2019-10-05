package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("Windows.UI.Text.FontStyle")
@js.native
object FontStyle extends js.Object {
  @js.native
  sealed trait italic extends FontStyle
  
  @js.native
  sealed trait normal extends FontStyle
  
  @js.native
  sealed trait oblique extends FontStyle
  
  /* 2 */ val italic: typings.winrt.Windows.UI.Text.FontStyle.italic with Double = js.native
  /* 0 */ val normal: typings.winrt.Windows.UI.Text.FontStyle.normal with Double = js.native
  /* 1 */ val oblique: typings.winrt.Windows.UI.Text.FontStyle.oblique with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStyle with Double] = js.native
}

