package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalCharacterAlignment extends js.Object

@JSGlobal("Windows.UI.Text.HorizontalCharacterAlignment")
@js.native
object HorizontalCharacterAlignment extends js.Object {
  @js.native
  sealed trait center
    extends winrtLib.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment
  
  @js.native
  sealed trait left
    extends winrtLib.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment
  
  @js.native
  sealed trait right
    extends winrtLib.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment
  
  /* 2 */ val center: center with scala.Double = js.native
  /* 0 */ val left: left with scala.Double = js.native
  /* 1 */ val right: right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment with scala.Double] = js.native
}

