package typings.winrtDashUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Text.VerticalCharacterAlignment.baseline
import typings.winrtDashUwp.Windows.UI.Text.VerticalCharacterAlignment.bottom
import typings.winrtDashUwp.Windows.UI.Text.VerticalCharacterAlignment.top
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalCharacterAlignment with Double] = js.native
  /* 1 */ @js.native
  object baseline extends TopLevel[baseline with Double]
  
  /* 2 */ @js.native
  object bottom extends TopLevel[bottom with Double]
  
  /* 0 */ @js.native
  object top extends TopLevel[top with Double]
  
}

