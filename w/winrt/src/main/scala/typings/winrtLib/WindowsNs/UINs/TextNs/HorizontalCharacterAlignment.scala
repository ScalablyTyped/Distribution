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
  
  val center: center with java.lang.String = js.native
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment with java.lang.String
  ] = js.native
}

