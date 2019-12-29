package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalCharacterAlignment extends js.Object

@JSGlobal("Windows.UI.Text.VerticalCharacterAlignment")
@js.native
object VerticalCharacterAlignment extends js.Object {
  @js.native
  sealed trait baseline extends VerticalCharacterAlignment
  
  @js.native
  sealed trait bottom extends VerticalCharacterAlignment
  
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

