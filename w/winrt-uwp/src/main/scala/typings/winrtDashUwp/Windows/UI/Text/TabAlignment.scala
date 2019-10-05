package typings.winrtDashUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabAlignment extends js.Object

/** Alignment options for tab positions. */
@JSGlobal("Windows.UI.Text.TabAlignment")
@js.native
object TabAlignment extends js.Object {
  /** A vertical bar is positioned at the tab position. Text is not affected. Alignment bars on nearby lines at the same position form a continuous vertical line. */
  @js.native
  sealed trait bar extends TabAlignment
  
  /** Text is centered on the tab position. */
  @js.native
  sealed trait center extends TabAlignment
  
  /** The decimal point is set at the tab position. This is useful for aligning a column of decimal numbers. */
  @js.native
  sealed trait decimal extends TabAlignment
  
  /** Text is left justified from the tab position. This is the default. */
  @js.native
  sealed trait left extends TabAlignment
  
  /** Text is right justified from the tab position. */
  @js.native
  sealed trait right extends TabAlignment
  
  /* 4 */ val bar: typings.winrtDashUwp.Windows.UI.Text.TabAlignment.bar with Double = js.native
  /* 1 */ val center: typings.winrtDashUwp.Windows.UI.Text.TabAlignment.center with Double = js.native
  /* 3 */ val decimal: typings.winrtDashUwp.Windows.UI.Text.TabAlignment.decimal with Double = js.native
  /* 0 */ val left: typings.winrtDashUwp.Windows.UI.Text.TabAlignment.left with Double = js.native
  /* 2 */ val right: typings.winrtDashUwp.Windows.UI.Text.TabAlignment.right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TabAlignment with Double] = js.native
}

