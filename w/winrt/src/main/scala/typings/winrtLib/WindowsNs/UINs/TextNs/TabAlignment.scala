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
  
  val bar: bar with java.lang.String = js.native
  val center: center with java.lang.String = js.native
  val decimal: decimal with java.lang.String = js.native
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.TabAlignment with java.lang.String] = js.native
}

