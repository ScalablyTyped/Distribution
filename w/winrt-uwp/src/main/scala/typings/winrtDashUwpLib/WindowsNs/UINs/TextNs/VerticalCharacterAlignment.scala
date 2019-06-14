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
  
  /* 1 */ val baseline: baseline with scala.Double = js.native
  /* 2 */ val bottom: bottom with scala.Double = js.native
  /* 0 */ val top: top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.TextNs.VerticalCharacterAlignment with scala.Double
  ] = js.native
}

