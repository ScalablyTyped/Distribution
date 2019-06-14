package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

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
  sealed trait bar
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TabAlignment
  
  /** Text is centered on the tab position. */
  @js.native
  sealed trait center
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TabAlignment
  
  /** The decimal point is set at the tab position. This is useful for aligning a column of decimal numbers. */
  @js.native
  sealed trait decimal
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TabAlignment
  
  /** Text is left justified from the tab position. This is the default. */
  @js.native
  sealed trait left
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TabAlignment
  
  /** Text is right justified from the tab position. */
  @js.native
  sealed trait right
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TabAlignment
  
  /* 4 */ val bar: bar with scala.Double = js.native
  /* 1 */ val center: center with scala.Double = js.native
  /* 3 */ val decimal: decimal with scala.Double = js.native
  /* 0 */ val left: left with scala.Double = js.native
  /* 2 */ val right: right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.TabAlignment with scala.Double] = js.native
}

