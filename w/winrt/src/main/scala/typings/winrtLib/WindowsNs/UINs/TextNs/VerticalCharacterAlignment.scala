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
  
  val baseline: baseline with java.lang.String = js.native
  val bottom: bottom with java.lang.String = js.native
  val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.VerticalCharacterAlignment with java.lang.String] = js.native
}

