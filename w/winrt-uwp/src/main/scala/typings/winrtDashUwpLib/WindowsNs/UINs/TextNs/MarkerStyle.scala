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
  
  val minus: minus with java.lang.String = js.native
  val noNumber: noNumber with java.lang.String = js.native
  val parentheses: parentheses with java.lang.String = js.native
  val parenthesis: parenthesis with java.lang.String = js.native
  val period: period with java.lang.String = js.native
  val plain: plain with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.MarkerStyle with java.lang.String] = js.native
}

