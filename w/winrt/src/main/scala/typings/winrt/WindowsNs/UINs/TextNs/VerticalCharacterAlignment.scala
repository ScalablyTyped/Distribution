package typings.winrt.WindowsNs.UINs.TextNs

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
  
  /* 1 */ val baseline: typings.winrt.WindowsNs.UINs.TextNs.VerticalCharacterAlignment.baseline with Double = js.native
  /* 2 */ val bottom: typings.winrt.WindowsNs.UINs.TextNs.VerticalCharacterAlignment.bottom with Double = js.native
  /* 0 */ val top: typings.winrt.WindowsNs.UINs.TextNs.VerticalCharacterAlignment.top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalCharacterAlignment with Double] = js.native
}

