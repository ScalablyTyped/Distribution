package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalCharacterAlignment with Double] = js.native
  /* 2 */ @js.native
  object center extends TopLevel[center with Double]
  
  /* 0 */ @js.native
  object left extends TopLevel[left with Double]
  
  /* 1 */ @js.native
  object right extends TopLevel[right with Double]
  
}

