package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabAlignment extends js.Object

@JSGlobal("Windows.UI.Text.TabAlignment")
@js.native
object TabAlignment extends js.Object {
  @js.native
  sealed trait bar
    extends winrtLib.WindowsNs.UINs.TextNs.TabAlignment
  
  @js.native
  sealed trait center
    extends winrtLib.WindowsNs.UINs.TextNs.TabAlignment
  
  @js.native
  sealed trait decimal
    extends winrtLib.WindowsNs.UINs.TextNs.TabAlignment
  
  @js.native
  sealed trait left
    extends winrtLib.WindowsNs.UINs.TextNs.TabAlignment
  
  @js.native
  sealed trait right
    extends winrtLib.WindowsNs.UINs.TextNs.TabAlignment
  
  /* 4 */ val bar: bar with scala.Double = js.native
  /* 1 */ val center: center with scala.Double = js.native
  /* 3 */ val decimal: decimal with scala.Double = js.native
  /* 0 */ val left: left with scala.Double = js.native
  /* 2 */ val right: right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.TabAlignment with scala.Double] = js.native
}

