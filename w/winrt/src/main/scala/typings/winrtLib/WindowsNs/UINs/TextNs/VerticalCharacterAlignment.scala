package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalCharacterAlignment extends js.Object

@JSGlobal("Windows.UI.Text.VerticalCharacterAlignment")
@js.native
object VerticalCharacterAlignment extends js.Object {
  @js.native
  sealed trait baseline
    extends winrtLib.WindowsNs.UINs.TextNs.VerticalCharacterAlignment
  
  @js.native
  sealed trait bottom
    extends winrtLib.WindowsNs.UINs.TextNs.VerticalCharacterAlignment
  
  @js.native
  sealed trait top
    extends winrtLib.WindowsNs.UINs.TextNs.VerticalCharacterAlignment
  
  /* 1 */ val baseline: baseline with scala.Double = js.native
  /* 2 */ val bottom: bottom with scala.Double = js.native
  /* 0 */ val top: top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.VerticalCharacterAlignment with scala.Double] = js.native
}

