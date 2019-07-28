package typings.winrtDashUwp.WindowsNs.UINs.TextNs

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
  sealed trait center extends HorizontalCharacterAlignment
  
  /** The character is at the left edge of the bounding rectangle. */
  @js.native
  sealed trait left extends HorizontalCharacterAlignment
  
  /** The character is at the right edge of the bounding rectangle. */
  @js.native
  sealed trait right extends HorizontalCharacterAlignment
  
  /* 2 */ val center: typings.winrtDashUwp.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment.center with Double = js.native
  /* 0 */ val left: typings.winrtDashUwp.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment.left with Double = js.native
  /* 1 */ val right: typings.winrtDashUwp.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment.right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalCharacterAlignment with Double] = js.native
}

