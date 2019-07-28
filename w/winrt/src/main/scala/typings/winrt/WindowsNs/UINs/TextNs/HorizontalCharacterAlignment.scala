package typings.winrt.WindowsNs.UINs.TextNs

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
  
  /* 2 */ val center: typings.winrt.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment.center with Double = js.native
  /* 0 */ val left: typings.winrt.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment.left with Double = js.native
  /* 1 */ val right: typings.winrt.WindowsNs.UINs.TextNs.HorizontalCharacterAlignment.right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalCharacterAlignment with Double] = js.native
}

