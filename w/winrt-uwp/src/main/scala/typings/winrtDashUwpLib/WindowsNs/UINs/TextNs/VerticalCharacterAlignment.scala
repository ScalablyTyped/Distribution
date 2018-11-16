package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalCharacterAlignment extends js.Object

/** Specifies the vertical position of a character relative to a bounding rectangle. */
@JSGlobal("Windows.UI.Text.VerticalCharacterAlignment")
@js.native
object VerticalCharacterAlignment extends js.Object {
  /** The character is positioned at the text baseline. */
  @js.native
  sealed trait baseline
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.VerticalCharacterAlignment
  
  /** The character is positioned at the bottom edge of the bounding rectangle. */
  @js.native
  sealed trait bottom
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.VerticalCharacterAlignment
  
  /** The character is positioned at the top edge of the bounding rectangle. */
  @js.native
  sealed trait top
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.VerticalCharacterAlignment
  
  val baseline: baseline with java.lang.String = js.native
  val bottom: bottom with java.lang.String = js.native
  val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.TextNs.VerticalCharacterAlignment with java.lang.String
  ] = js.native
}

