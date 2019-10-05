package typings.winrtDashUwp.Windows.UI.Text

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
  sealed trait center extends MarkerAlignment
  
  /** Text is left aligned. */
  @js.native
  sealed trait left extends MarkerAlignment
  
  /** Text is right aligned. */
  @js.native
  sealed trait right extends MarkerAlignment
  
  /** The value is undefined. */
  @js.native
  sealed trait undefined extends MarkerAlignment
  
  /* 2 */ val center: typings.winrtDashUwp.Windows.UI.Text.MarkerAlignment.center with Double = js.native
  /* 1 */ val left: typings.winrtDashUwp.Windows.UI.Text.MarkerAlignment.left with Double = js.native
  /* 3 */ val right: typings.winrtDashUwp.Windows.UI.Text.MarkerAlignment.right with Double = js.native
  /* 0 */ val undefined: typings.winrtDashUwp.Windows.UI.Text.MarkerAlignment.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerAlignment with Double] = js.native
}

