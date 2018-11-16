package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerAlignment extends js.Object

@JSGlobal("Windows.UI.Text.MarkerAlignment")
@js.native
object MarkerAlignment extends js.Object {
  @js.native
  sealed trait center
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerAlignment
  
  @js.native
  sealed trait left
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerAlignment
  
  @js.native
  sealed trait right
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerAlignment
  
  @js.native
  sealed trait undefined
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerAlignment
  
  val center: center with java.lang.String = js.native
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.MarkerAlignment with java.lang.String] = js.native
}

