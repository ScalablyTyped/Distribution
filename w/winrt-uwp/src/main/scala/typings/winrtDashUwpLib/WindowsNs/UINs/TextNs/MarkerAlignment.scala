package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerAlignment extends js.Object

/** Defines bullet and numbering alignment. */
@JSGlobal("Windows.UI.Text.MarkerAlignment")
@js.native
object MarkerAlignment extends js.Object {
  /** Text is centered in the line. */
  @js.native
  sealed trait center
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerAlignment
  
  /** Text is left aligned. */
  @js.native
  sealed trait left
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerAlignment
  
  /** Text is right aligned. */
  @js.native
  sealed trait right
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerAlignment
  
  /** The value is undefined. */
  @js.native
  sealed trait undefined
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerAlignment
  
  /* 2 */ val center: center with scala.Double = js.native
  /* 1 */ val left: left with scala.Double = js.native
  /* 3 */ val right: right with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerAlignment with scala.Double] = js.native
}

