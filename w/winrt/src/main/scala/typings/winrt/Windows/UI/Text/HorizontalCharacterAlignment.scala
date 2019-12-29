package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalCharacterAlignment extends js.Object

@JSGlobal("Windows.UI.Text.HorizontalCharacterAlignment")
@js.native
object HorizontalCharacterAlignment extends js.Object {
  @js.native
  sealed trait center extends HorizontalCharacterAlignment
  
  @js.native
  sealed trait left extends HorizontalCharacterAlignment
  
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

