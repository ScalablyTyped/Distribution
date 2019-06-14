package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

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
  sealed trait minus
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  /** The items have no markers. */
  @js.native
  sealed trait noNumber
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  /** The item marker is enclosed in parentheses, as in (1). */
  @js.native
  sealed trait parentheses
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  /** The item marker is followed by a parenthesis, as in 1). */
  @js.native
  sealed trait parenthesis
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  /** The item marker is followed by a period. */
  @js.native
  sealed trait period
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  /** The item marker appears by itself. */
  @js.native
  sealed trait plain
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  /** The marker style is not defined. */
  @js.native
  sealed trait undefined
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  /* 5 */ val minus: minus with scala.Double = js.native
  /* 6 */ val noNumber: noNumber with scala.Double = js.native
  /* 2 */ val parentheses: parentheses with scala.Double = js.native
  /* 1 */ val parenthesis: parenthesis with scala.Double = js.native
  /* 3 */ val period: period with scala.Double = js.native
  /* 4 */ val plain: plain with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerStyle with scala.Double] = js.native
}

