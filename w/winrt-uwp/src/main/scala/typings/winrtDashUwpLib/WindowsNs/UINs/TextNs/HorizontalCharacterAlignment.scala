package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalCharacterAlignment extends js.Object

/** Specifies the horizontal position of a character relative to a bounding rectangle. */
@JSGlobal("Windows.UI.Text.HorizontalCharacterAlignment")
@js.native
object HorizontalCharacterAlignment extends js.Object {
  /** The character is at the center of the bounding rectangle. */
  @js.native
  sealed trait center
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment
  
  /** The character is at the left edge of the bounding rectangle. */
  @js.native
  sealed trait left
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment
  
  /** The character is at the right edge of the bounding rectangle. */
  @js.native
  sealed trait right
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment
  
  val center: center with java.lang.String = js.native
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment with java.lang.String
  ] = js.native
}

