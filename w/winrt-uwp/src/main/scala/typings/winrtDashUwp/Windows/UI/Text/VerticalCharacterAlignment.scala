package typings.winrtDashUwp.Windows.UI.Text

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
  sealed trait baseline extends VerticalCharacterAlignment
  
  /** The character is positioned at the bottom edge of the bounding rectangle. */
  @js.native
  sealed trait bottom extends VerticalCharacterAlignment
  
  /** The character is positioned at the top edge of the bounding rectangle. */
  @js.native
  sealed trait top extends VerticalCharacterAlignment
  
  /* 1 */ val baseline: typings.winrtDashUwp.Windows.UI.Text.VerticalCharacterAlignment.baseline with Double = js.native
  /* 2 */ val bottom: typings.winrtDashUwp.Windows.UI.Text.VerticalCharacterAlignment.bottom with Double = js.native
  /* 0 */ val top: typings.winrtDashUwp.Windows.UI.Text.VerticalCharacterAlignment.top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalCharacterAlignment with Double] = js.native
}

