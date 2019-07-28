package typings.winrtDashUwp.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerStyle extends js.Object

/** Specifies the style used to mark the item paragraphs in a list. */
@JSGlobal("Windows.UI.Text.MarkerStyle")
@js.native
object MarkerStyle extends js.Object {
  /** The item marker is followed by a hyphen (-). */
  @js.native
  sealed trait minus extends MarkerStyle
  
  /** The items have no markers. */
  @js.native
  sealed trait noNumber extends MarkerStyle
  
  /** The item marker is enclosed in parentheses, as in (1). */
  @js.native
  sealed trait parentheses extends MarkerStyle
  
  /** The item marker is followed by a parenthesis, as in 1). */
  @js.native
  sealed trait parenthesis extends MarkerStyle
  
  /** The item marker is followed by a period. */
  @js.native
  sealed trait period extends MarkerStyle
  
  /** The item marker appears by itself. */
  @js.native
  sealed trait plain extends MarkerStyle
  
  /** The marker style is not defined. */
  @js.native
  sealed trait undefined extends MarkerStyle
  
  /* 5 */ val minus: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerStyle.minus with Double = js.native
  /* 6 */ val noNumber: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerStyle.noNumber with Double = js.native
  /* 2 */ val parentheses: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerStyle.parentheses with Double = js.native
  /* 1 */ val parenthesis: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerStyle.parenthesis with Double = js.native
  /* 3 */ val period: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerStyle.period with Double = js.native
  /* 4 */ val plain: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerStyle.plain with Double = js.native
  /* 0 */ val undefined: typings.winrtDashUwp.WindowsNs.UINs.TextNs.MarkerStyle.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerStyle with Double] = js.native
}

