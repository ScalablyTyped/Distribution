package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabAlignment extends js.Object

@JSGlobal("Windows.UI.Text.TabAlignment")
@js.native
object TabAlignment extends js.Object {
  @js.native
  sealed trait bar extends TabAlignment
  
  @js.native
  sealed trait center extends TabAlignment
  
  @js.native
  sealed trait decimal extends TabAlignment
  
  @js.native
  sealed trait left extends TabAlignment
  
  @js.native
  sealed trait right extends TabAlignment
  
  /* 4 */ val bar: typings.winrt.Windows.UI.Text.TabAlignment.bar with Double = js.native
  /* 1 */ val center: typings.winrt.Windows.UI.Text.TabAlignment.center with Double = js.native
  /* 3 */ val decimal: typings.winrt.Windows.UI.Text.TabAlignment.decimal with Double = js.native
  /* 0 */ val left: typings.winrt.Windows.UI.Text.TabAlignment.left with Double = js.native
  /* 2 */ val right: typings.winrt.Windows.UI.Text.TabAlignment.right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TabAlignment with Double] = js.native
}

