package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerStyle extends js.Object

@JSGlobal("Windows.UI.Text.MarkerStyle")
@js.native
object MarkerStyle extends js.Object {
  @js.native
  sealed trait minus
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  @js.native
  sealed trait noNumber
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  @js.native
  sealed trait parentheses
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  @js.native
  sealed trait parenthesis
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  @js.native
  sealed trait period
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  @js.native
  sealed trait plain
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  @js.native
  sealed trait undefined
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  /* 5 */ val minus: minus with scala.Double = js.native
  /* 6 */ val noNumber: noNumber with scala.Double = js.native
  /* 2 */ val parentheses: parentheses with scala.Double = js.native
  /* 1 */ val parenthesis: parenthesis with scala.Double = js.native
  /* 3 */ val period: period with scala.Double = js.native
  /* 4 */ val plain: plain with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.MarkerStyle with scala.Double] = js.native
}

